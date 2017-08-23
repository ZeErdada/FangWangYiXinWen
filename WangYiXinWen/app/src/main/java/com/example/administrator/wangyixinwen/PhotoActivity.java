package com.example.administrator.wangyixinwen;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.wangyixinwen.adapter.MyViewPagerAdapter;

import java.util.ArrayList;

public class PhotoActivity extends AppCompatActivity implements MyViewPagerAdapter.DianjiCak {

    private ViewPager vp;
    private ArrayList<String> images;
    private  int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        vp = (ViewPager) findViewById(R.id.photo_vp);
        this.position = getIntent().getIntExtra("position",0);
        this.images = getIntent().getStringArrayListExtra("image");

        MyViewPagerAdapter adapter = new MyViewPagerAdapter(this, images);
        vp.setAdapter(adapter);
        vp.setCurrentItem(position);
 
        adapter.setdianji(this);
    }

    @Override
    public void dianjihuichuan() {
        finish();
    }
}
