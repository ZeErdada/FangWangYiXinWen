package com.example.administrator.wangyixinwen.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.wangyixinwen.R;
import com.example.administrator.wangyixinwen.bean.NewsBean;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;

import java.util.List;
/**
 * Created by admin on 2017/8/9.
 */

public class MyFragmentAdapter extends BaseAdapter {
    private Context context;
    private List<NewsBean.ResultEntity.DataEntity> mlist;

    public MyFragmentAdapter(Context context, List<NewsBean.ResultEntity.DataEntity> mlist) {
        this.context = context;
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist.size();
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
        ViewHolder holder;
        if(view == null){
            view = View.inflate(context,R.layout.fragment_item2,null);
            holder=new ViewHolder();
            holder.iv_1= (ImageView) view.findViewById(R.id.iv_image);
            holder.tv_1= (TextView) view.findViewById(R.id.tv_text);
            view.setTag(holder);
        }else{
            holder= (ViewHolder) view.getTag();
        }
        holder.tv_1.setText(mlist.get(i).title);
        setImage(mlist.get(i).thumbnail_pic_s,context,holder.iv_1);
        return view;
    }
    public static void setImage(String url , Context context,ImageView imageView){
            ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(context).build();
            ImageLoader imageLoader = ImageLoader.getInstance();
            imageLoader.init(config);
            DisplayImageOptions diosplay =new DisplayImageOptions.Builder()
                    .showImageOnLoading(R.mipmap.ic_launcher)
                    .showImageForEmptyUri(R.mipmap.ic_launcher)
                    .showImageOnFail(R.mipmap.ic_launcher)
                    .cacheInMemory(true)
                    .cacheOnDisk(true)
                    .imageScaleType(ImageScaleType.IN_SAMPLE_INT)
                    .bitmapConfig(Bitmap.Config.RGB_565)
                    .build();
            imageLoader.displayImage(url,imageView,diosplay);
        }


    class ViewHolder{
        ImageView iv_1;
        TextView  tv_1;
    }


}
