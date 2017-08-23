package com.example.administrator.wangyixinwen.bean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/16.
 */

public class XFBean {
    public ArrayList<WS> ws;
    public class WS{
        public ArrayList<CW> cw;
    }
    public class CW{
        public String w;
    }
}