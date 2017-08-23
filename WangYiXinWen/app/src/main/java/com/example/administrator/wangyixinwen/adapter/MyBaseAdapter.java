package com.example.administrator.wangyixinwen.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by admin on 2017/8/8.
 */

public class MyBaseAdapter extends FragmentPagerAdapter {
    public MyBaseAdapter(FragmentManager fm) {
        super(fm);
    }
    private List<Fragment>mlist;
    public void setFragment(List<Fragment> list){
        mlist=list;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = mlist.get(position);
        return fragment;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }
}
