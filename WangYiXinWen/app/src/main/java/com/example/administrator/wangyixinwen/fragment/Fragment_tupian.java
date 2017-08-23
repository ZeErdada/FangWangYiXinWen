package com.example.administrator.wangyixinwen.fragment;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.bumptech.glide.Glide;
import com.example.administrator.wangyixinwen.PhotoActivity;
import com.example.administrator.wangyixinwen.R;
import com.example.administrator.wangyixinwen.bean.TuBean;
import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */

public class Fragment_tupian extends Fragment {
    private String path = "http://v.juhe.cn/toutiao/index?type=top&key=e76b62dbe5ce78645516fe866dc7058b";
    private ArrayList<String> images;
    private ListView listView;
    private List<TuBean.ResultBean.DataBean> list;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tupian, container,false);
        listView = (ListView) view.findViewById(R.id.tupain_list);


        MyTask myTask = new MyTask();
        myTask.execute();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), PhotoActivity.class);
                intent.putExtra("position", i);
                //传递对象集合
                intent.putStringArrayListExtra("image", (ArrayList<String>) images);
                startActivity(intent);
            }
        });

        return view;
    }
    class MyTask extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... params) {
            try {
                //建立地址对象
                URL url = new URL(path);
                //得到对象
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                //设置请求方式
                conn.setRequestMethod("GET");
                //设置响应时间
                conn.setConnectTimeout(3000);
                //读取超时时间
                conn.setReadTimeout(3000);
                //同步请求
                System.out.println("asdadsadad"+conn.getResponseCode());
                if (conn.getResponseCode() == 200) {
                    InputStream is = conn.getInputStream();
                    ByteArrayOutputStream baos = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = is.read(buffer)) != -1) {
                        baos.write(buffer, 0, len);
                    }
                    final String s = baos.toString();
                    System.out.println("asdadsadad"+s);
                    return s;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            System.out.println("nishishishis" + s);
            list = new ArrayList<>();
            Gson gson = new Gson();
           TuBean bean = gson.fromJson(s, TuBean.class);
            List<TuBean.ResultBean.DataBean> data = bean.getResult().getData();
            list.addAll(data);
            images = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                String s02 = list.get(i).getThumbnail_pic_s02();
                images.add(s02);
            }
            MyBaseAdapter adapter = new MyBaseAdapter();
            adapter = new MyBaseAdapter();
            listView.setAdapter(adapter);
        }
    }
    class MyBaseAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            if (convertView == null) {
                holder = new ViewHolder();
                convertView = View.inflate(getActivity(), R.layout.tupian_item, null);
                holder.iv = (ImageView) convertView.findViewById(R.id.tupian_image);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            Glide.with(getActivity()).load(images.get(position)).into(holder.iv);
            return convertView;
        }

        class ViewHolder {
            ImageView iv;
        }

    }

}
