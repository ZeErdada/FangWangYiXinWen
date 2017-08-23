package com.example.administrator.wangyixinwen.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.wangyixinwen.ParallaxListView;
import com.example.administrator.wangyixinwen.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentYou extends Fragment {

    private TabLayout tab_layout2,tab_layout3;
    private ParallaxListView plv;
    private ImageView iv_headview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragmentyou,container,false);
        tab_layout2 = (TabLayout) view.findViewById(R.id.tab_layout2);
        tab_layout3= (TabLayout) view.findViewById(R.id.tab_layout3);
        plv = (ParallaxListView) view.findViewById(R.id.plv);
        //C、ListView添加头布局，ListView上拉加载，下拉刷新
        View headview = View.inflate(getActivity(), R.layout.headview, null);

        plv.addHeaderView(headview);
        //
        iv_headview = headview.findViewById(R.id.iv_header);
        iv_headview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_headview.setImageResource(R.drawable.g);
            }
        });

        //等View界面绘制完毕时，得到已经绘制完控件的宽高，查这个方法并做笔记
        iv_headview.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                //测量完宽高
                plv.setIv_header(iv_headview);
                //释放资源
                iv_headview.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });

        plv.setAdapter(new MyBaseAdapter());



        tab_layout2.addTab(tab_layout2.newTab().setText("阅读").setIcon(R.drawable.yanjing));
        tab_layout2.addTab(tab_layout2.newTab().setText("收藏").setIcon(R.drawable.shoucang));
        tab_layout2.addTab(tab_layout2.newTab().setText("跟帖").setIcon(R.drawable.gentie));
        tab_layout3.addTab(tab_layout3.newTab().setText("头条").setIcon(R.drawable.toutiao));
        tab_layout3.addTab(tab_layout3.newTab().setText("消息").setIcon(R.drawable.xiaoxi));
        tab_layout3.addTab(tab_layout3.newTab().setText("邮件").setIcon(R.drawable.youjian));
        tab_layout3.addTab(tab_layout3.newTab().setText("公益").setIcon(R.drawable.gongyi));
        tab_layout3.addTab(tab_layout3.newTab().setText("彩票").setIcon(R.drawable.caipiao));

        return view;
    }
    class MyBaseAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 1;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = View.inflate(getActivity(), R.layout.head_list_item, null);
           TextView tv = (TextView) v.findViewById(R.id.headtc);
            tv.setText("");
            return v;
        }
    }
}
