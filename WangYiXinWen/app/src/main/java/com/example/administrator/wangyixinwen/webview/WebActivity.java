package com.example.administrator.wangyixinwen.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.administrator.wangyixinwen.R;


public class WebActivity extends AppCompatActivity {

    private WebView web_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        web_view = (WebView) findViewById(R.id.web_view);
        String path = getIntent().getStringExtra("path");
        WebSettings settings = web_view.getSettings();
        settings.setJavaScriptEnabled(true);
        web_view.loadUrl(path);
        web_view.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                // TODO Auto-generated method stub
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                view.loadUrl(url);
                return true;
            }
        });


        }
}
