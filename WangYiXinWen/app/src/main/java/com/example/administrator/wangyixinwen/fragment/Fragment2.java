package com.example.administrator.wangyixinwen.fragment;


import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.administrator.wangyixinwen.GlideImageLoader;
import com.example.administrator.wangyixinwen.R;
import com.example.administrator.wangyixinwen.adapter.MyFragmentAdapter;
import com.example.administrator.wangyixinwen.bean.NewsBean;
import com.example.administrator.wangyixinwen.webview.WebActivity;
import com.google.gson.Gson;
import com.sn.xlistviewlibrary.XListView;
import com.youth.banner.Banner;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment implements XListView.IXListViewListener {

    private XListView xlist_view;
    private Banner banner;
    private String path = "http://v.juhe.cn/toutiao/index?type=top&key=d4c18a18c3391f90dc971633f6e6f445";
    private String s;
    private List<NewsBean.ResultEntity.DataEntity> mlist;
    private Banner banner1;
    private List<String> list2;
    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            //刷新listView
            adapter.notifyDataSetChanged();
            //隐藏头和尾
            closeXlistView();
        }
    };
    private MyFragmentAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2,container,false);
        xlist_view = (XListView) view.findViewById(R.id.xlist_view);
        mlist=new ArrayList<>();


        //开启下拉刷新
        xlist_view.setPullRefreshEnable(true);
        //开启加载更多可用
        xlist_view.setPullLoadEnable(true);

        //设置XlistView的上拉加载,下拉刷新的接口
        xlist_view.setXListViewListener(this);


        xlist_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), WebActivity.class);
                intent.putExtra("path",mlist.get(i-2).url);
                startActivity(intent);
            }
        });

     AsyncTask<Void, Void, String> asyncTask = new AsyncTask<Void, Void, String>() {
            @Override
            protected String doInBackground(Void... voids) {
                try {
                    
                    URL url = new URL(path);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("GET");
                    connection.setConnectTimeout(8000);
                    if(connection.getResponseCode() == 200){
                        InputStream inputStream = connection.getInputStream();
                        ByteArrayOutputStream baos = new ByteArrayOutputStream();
                        int len = 0;
                        byte[] buffer = new byte[1024];
                        while((len=inputStream.read(buffer))!=-1){
                            baos.write(buffer,0,len);
                        }
                        s = baos.toString();
                        return  s;

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }


                return null;
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                Gson gson = new Gson();
                NewsBean newsBean = gson.fromJson(s, NewsBean.class);
                mlist = newsBean.result.data;
                adapter = new MyFragmentAdapter(getContext(),mlist);
                list2 = new ArrayList<>();
                for (int i = 5; i < 10 ; i++) {
                    list2.add(mlist.get(i).thumbnail_pic_s);
                    System.out.println("shuaadadsadasdasdada"+list2);
                }
              View view1 =  LayoutInflater.from(getContext()).inflate(R.layout.banner2,null);
                System.out.println("帅帅杀u代码"+list2);
                banner1 = (Banner) view1.findViewById(R.id.heand_banner);
                banner1.setImages(list2).setImageLoader(new GlideImageLoader()).start();
                xlist_view.addHeaderView(view1);
                xlist_view.setAdapter(adapter);
            }
        };
            asyncTask.execute();
        return view;
    }

    @Override
    public void onRefresh() {
        handler.sendEmptyMessage(0);
    }

    @Override
    public void onLoadMore() {
        handler.sendEmptyMessage(0);
    }
    //刷新给关闭的逻辑代码
    private void closeXlistView() {
        //停止加载更多
        xlist_view.stopLoadMore();
        //停止刷新
        xlist_view.stopRefresh();
        //更新时间
        xlist_view.setRefreshTime("2017/8/21");
    }
}
