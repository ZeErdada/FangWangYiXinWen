package com.example.administrator.wangyixinwen.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.administrator.wangyixinwen.R;

/**
 * Created by Administrator on 2017/8/17.
 */

public class Fragment_dinyue extends Fragment {

    private WebView web_view;
    private WebSettings settings;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dinyue, container,false);
        web_view = (WebView) view.findViewById(R.id.dinyue_web);
        settings = web_view.getSettings();
        settings.setJavaScriptEnabled(true);
        web_view.loadUrl("https://open.163.com/");
        web_view.setWebViewClient(new WebViewClient() {

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });
        return view;
    }
}
