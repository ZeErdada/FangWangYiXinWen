package com.example.administrator.wangyixinwen.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.administrator.wangyixinwen.R;

import java.util.List;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by Administrator on 2017/8/18.
 */

public class MyViewPagerAdapter extends PagerAdapter {

    List<String> imgs;

    Context mContext;

    public MyViewPagerAdapter(Context context, List<String> imgs) {

        this.mContext = context;
        this.imgs = imgs;

    }

    @Override
    public int getCount() { // 获得size
        return imgs.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        String imgUrl = imgs.get(position);
        LinearLayout view = (LinearLayout) LayoutInflater.from(mContext).inflate(R.layout.photo_item, null);
        PhotoView img = (PhotoView) view.findViewById(R.id.phtoto_pv);
        Glide.with(mContext).load(imgUrl).into(img);
        ((ViewPager) container).addView(view);
        img.setOnPhotoTapListener(new PhotoViewAttacher.OnPhotoTapListener() {
            @Override
            public void onPhotoTap(View view, float v, float v1) {
                dianjiCak.dianjihuichuan();
            }
        });

        return view;
    }
    public interface DianjiCak{
        void dianjihuichuan();
    }

    private  DianjiCak dianjiCak;
    public DianjiCak getdianji(){
        return dianjiCak;
    }
    public void  setdianji(DianjiCak dianjiCak){
        this.dianjiCak = dianjiCak;
    }
}