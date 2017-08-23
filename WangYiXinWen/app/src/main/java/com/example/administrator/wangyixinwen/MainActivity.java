package com.example.administrator.wangyixinwen;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.andy.library.ChannelActivity;
import com.andy.library.ChannelBean;
import com.andy.share.QQOauthUtils;
import com.bumptech.glide.Glide;
import com.example.administrator.wangyixinwen.Sousuo.SousuoActivity;
import com.example.administrator.wangyixinwen.adapter.MyBaseAdapter;
import com.example.administrator.wangyixinwen.fragment.Fragment2;
import com.example.administrator.wangyixinwen.fragment.Fragment3;
import com.example.administrator.wangyixinwen.fragment.Fragment4;
import com.example.administrator.wangyixinwen.fragment.Fragment5;
import com.example.administrator.wangyixinwen.fragment.Fragment6;
import com.example.administrator.wangyixinwen.fragment.Fragment7;
import com.example.administrator.wangyixinwen.fragment.Fragment8;
import com.example.administrator.wangyixinwen.shezhi.ShezhiActivity;
import com.example.administrator.wangyixinwen.webview.WebActivity;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private List<ChannelBean> cblist;
    private String jsonStr;
    private DrawerLayout drawer_layout;
    private ActionBarDrawerToggle toggle;
    private TabLayout tab_layout;
    private ViewPager view_pager;
    private List<Fragment> list;
    private MyBaseAdapter adapter;
    private QQOauthUtils qqOauthUtils;
    private ImageView denglu_image;
    // 默认是日间模式
    private int theme = R.style.AppTheme;
    private ImageView xiala_image;
    private int back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 判断是否有主题存储
        if(savedInstanceState != null){
            theme = savedInstanceState.getInt("theme");
            setTheme(theme);
        }
        setContentView(R.layout.activity_main);
        //初始化控件
        initID();
        //初始化ActionBar
        initActionBar();
        //初始化ViewPager
        initViewPager();

        SharedPreferences pref = getSharedPreferences("first",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("status",false).commit();



       final TextView denglu = (TextView) findViewById(R.id.denglu);
        denglu_image = (ImageView) findViewById(R.id.denglu_image);

        denglu_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back = 1;
                qqOauthUtils = new QQOauthUtils();
                qqOauthUtils.qqLogin(MainActivity.this, new QQOauthUtils.QQCallBack() {
                    @Override
                    public void logsuccess() {
                        Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void getuserinfo(Map<String, String> map) {

                    }

                    @Override
                    public void getUserName(String name) {
                            denglu.setText(name);
                    }

                    @Override
                    public void getImagepath(String url) {
                        Glide.with(MainActivity.this)
                                .load(url)
                                .into(denglu_image);

                    }
                });
            }
        });

        //频道管理
        xiala_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cblist == null) {//判断集合中是否已有数据，没有则创建
                    cblist = new ArrayList<>();
                    //第一个是显示的条目，第二个参数是否显示
                    cblist.add(new ChannelBean("热点", true));
                    cblist.add(new ChannelBean("军事", true));
                    cblist.add(new ChannelBean("八卦", true));
                    cblist.add(new ChannelBean("游戏", true));
                    cblist.add(new ChannelBean("宠物", true));
                    cblist.add(new ChannelBean("汽车", false));
                    cblist.add(new ChannelBean("热卖", false));
                    cblist.add(new ChannelBean("外卖", false));
                    cblist.add(new ChannelBean("太阳花", false));
                    cblist.add(new ChannelBean("岳狗", false));
                    cblist.add(new ChannelBean("帅哥", false));
                    cblist.add(new ChannelBean("高育良", false));
                    ChannelActivity.startChannelActivity(MainActivity.this,cblist);
                }else if (jsonStr!=null){//当判断保存的字符串不为空的时候，直接加载已经有了的字符串
                    ChannelActivity.startChannelActivity(MainActivity.this,jsonStr);
                }
            }
        });
    }

    public  void initViewPager() {
        list = new ArrayList<>();

        list.add(new Fragment2());
        list.add(new Fragment3());
        list.add(new Fragment4());
        list.add(new Fragment5());
        list.add(new Fragment6());
        list.add(new Fragment7());
        list.add(new Fragment8());
        adapter = new MyBaseAdapter(getSupportFragmentManager());
        adapter.setFragment(list);
        view_pager.setAdapter(adapter);
        //创建指示器
        for (int i = 0; i < list.size() ; i++) {
            tab_layout.addTab(tab_layout.newTab());
        }
        tab_layout.setupWithViewPager(view_pager);
        tab_layout.getTabAt(0).setText("头条");
        tab_layout.getTabAt(1).setText("娱乐");
        tab_layout.getTabAt(2).setText("热点");
        tab_layout.getTabAt(3).setText("体育");
        tab_layout.getTabAt(4).setText("南充");
        tab_layout.getTabAt(5).setText("财经");
        tab_layout.getTabAt(6).setText("科技");
    }


    public void initID() {
        drawer_layout = (DrawerLayout) findViewById(R.id.drawer_layout);
        tab_layout = (TabLayout) findViewById(R.id.tab_layout);
        view_pager = (ViewPager) findViewById(R.id.view_pager);
        xiala_image = (ImageView) findViewById(R.id.xiala_image);
    }

        public void initActionBar() {
        //获取一个ActionBar对象
        ActionBar actionBar = getSupportActionBar();
        //获取图标
        actionBar.setDisplayHomeAsUpEnabled(true);
        toggle = new ActionBarDrawerToggle(this, drawer_layout, R.string.open, R.string.stop);
        toggle.syncState();
        drawer_layout.addDrawerListener(toggle);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_tianqi:
                item.setTitle("晴");

                try {
                    Document doc = Jsoup.connect("http://www.weather.com.cn/weather/101010100.shtml").get();


                } catch (IOException e) {
                    e.printStackTrace();
                }


                Intent intent = new Intent(MainActivity.this, WebActivity.class);
                intent.putExtra("path","http://www.weather.com.cn/weather/101010100.shtml");
                startActivity(intent);
                break;
            case R.id.action_lixian:
                Toast.makeText(this, "离线", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_yejian:
                Toast.makeText(this, "已切换模式", Toast.LENGTH_SHORT).show();
                theme = (theme == R.style.AppTheme) ? R.style.NightAppTheme : R.style.AppTheme;
                MainActivity.this.recreate();
                break;
            case R.id.action_sousuo:
                startActivity(new Intent(MainActivity.this, SousuoActivity.class));
                break;
            case R.id.action_saoyisao:
                saoyisao();
                break;
            case R.id.action_shezhi:
                startActivity(new Intent(MainActivity.this, ShezhiActivity.class));
                break;
            case R.id.image_actionbar:
//                Toast.makeText(this, "图片", Toast.LENGTH_SHORT).show();
                if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
                    drawer_layout.closeDrawer(GravityCompat.START);//关闭抽屉
                } else {
                    drawer_layout.openDrawer(GravityCompat.END);
                }
                break;
            default:
                break;
        }
        if (drawer_layout.isDrawerOpen(GravityCompat.END)) {
            drawer_layout.closeDrawer(GravityCompat.END);//关闭抽屉
            return super.onOptionsItemSelected(item);
        }
        return toggle.onOptionsItemSelected(item) | super.onOptionsItemSelected(item);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("theme", theme);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        theme = savedInstanceState.getInt("theme");
    }
    private void saoyisao() {
        IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
        // 设置要扫描的条码类型，ONE_D_CODE_TYPES：一维码，QR_CODE_TYPES-二维码
        integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
        integrator.setCaptureActivity(ScanActivity.class);
        integrator.setPrompt("请扫描二维码"); //底部的提示文字，设为""可以置空
        integrator.setCameraId(0); //前置或者后置摄像头
        integrator.setBeepEnabled(false); //扫描成功的「哔哔」声，默认开启
        integrator.setBarcodeImageEnabled(true);//是否保留扫码成功时候的截图
        integrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode,resultCode,data);
        if (back == 1){
            //qq回调
            qqOauthUtils.onActivityResult(requestCode,resultCode,data);
        }


        //获取扫描结果
        IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (scanResult != null) {
            String result = scanResult.getContents();
            Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
        }
        //频道管理回调
        if (requestCode==ChannelActivity.REQUEST_CODE&&resultCode==ChannelActivity.RESULT_CODE) {
            jsonStr = data.getStringExtra(ChannelActivity.RESULT_JSON_KEY);
        }
    }

    //这里是调用menu文件夹中的main.xml，在登陆界面label右上角的三角里显示其他功能
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
