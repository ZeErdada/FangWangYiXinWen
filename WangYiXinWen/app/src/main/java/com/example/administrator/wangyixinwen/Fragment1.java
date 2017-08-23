package com.example.administrator.wangyixinwen;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RadioButton;

import com.example.administrator.wangyixinwen.fragment.Fragment2;
import com.example.administrator.wangyixinwen.fragment.Fragment_dinyue;
import com.example.administrator.wangyixinwen.fragment.Fragment_gentie;
import com.example.administrator.wangyixinwen.fragment.Fragment_shipin;
import com.example.administrator.wangyixinwen.fragment.Fragment_tupian;

import java.util.List;



/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    private ListView list_view;
    private List<String> list;
    private RadioButton radio_btn1,radio_btn2,radio_btn3,radio_btn4,radio_btn5;
    private Fragment fragment;
    private Fragment2 fragment2;
    private Fragment_dinyue fragment_dinyue;
    private Fragment_tupian fragment_tupian;
    private Fragment_shipin fragment_shipin;
    private Fragment_gentie fragment_gentie;
//    private CallBack callBack;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        radio_btn1 = (RadioButton) view.findViewById(R.id.radio_btn1);
        radio_btn2= (RadioButton) view.findViewById(R.id.radio_btn2);
        radio_btn3= (RadioButton) view.findViewById(R.id.radio_btn3);
        radio_btn4= (RadioButton) view.findViewById(R.id.radio_btn4);
        radio_btn5= (RadioButton) view.findViewById(R.id.radio_btn5);
        radio_btn1.setOnClickListener(this);
        radio_btn2.setOnClickListener(this);
        radio_btn3.setOnClickListener(this);
        radio_btn4.setOnClickListener(this);
        radio_btn5.setOnClickListener(this);

        fragment2 = new Fragment2();
        fragment_dinyue = new Fragment_dinyue();
        fragment_tupian = new Fragment_tupian();
        fragment_shipin = new Fragment_shipin();
        fragment_gentie = new Fragment_gentie();

        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame_repece,fragment_gentie).commit();
        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame_repece,fragment_shipin).commit();
        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame_repece,fragment_tupian).commit();
        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame_repece,fragment_dinyue).commit();
        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.frame_repece,fragment2).commit();
        getActivity().getSupportFragmentManager().beginTransaction().hide(fragment2).hide(fragment_dinyue).hide(fragment_shipin).hide(fragment_tupian).hide(fragment_gentie).commit();
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.radio_btn1:
//                callBack.sendvalue();
                getActivity().getSupportFragmentManager().beginTransaction().hide(fragment2).hide(fragment_dinyue).hide(fragment_shipin).hide(fragment_tupian).hide(fragment_gentie).commit();
                radio_btn1.setTextColor(Color.parseColor("#ADFF2F"));
                radio_btn2.setTextColor(Color.BLACK);
                radio_btn3.setTextColor(Color.BLACK);
                radio_btn4.setTextColor(Color.BLACK);
                radio_btn5.setTextColor(Color.BLACK);
                break;
            case R.id.radio_btn2:
//                callBack.sendvalue();
                getActivity().getSupportFragmentManager().beginTransaction().show(fragment_dinyue).hide(fragment2).hide(fragment_shipin).hide(fragment_tupian).hide(fragment_gentie).commit();
                radio_btn2.setTextColor(Color.parseColor("#ADFF2F"));
                radio_btn1.setTextColor(Color.BLACK);
                radio_btn3.setTextColor(Color.BLACK);
                radio_btn4.setTextColor(Color.BLACK);
                radio_btn5.setTextColor(Color.BLACK);
                break;
            case R.id.radio_btn3:
//                callBack.sendvalue();
                getActivity().getSupportFragmentManager().beginTransaction().show(fragment_tupian).hide(fragment_dinyue).hide(fragment_shipin).hide(fragment2).hide(fragment_gentie).commit();
                radio_btn3.setTextColor(Color.parseColor("#ADFF2F"));
                radio_btn2.setTextColor(Color.BLACK);
                radio_btn1.setTextColor(Color.BLACK);
                radio_btn4.setTextColor(Color.BLACK);
                radio_btn5.setTextColor(Color.BLACK);
                break;
            case R.id.radio_btn4:
//                callBack.sendvalue();
                getActivity().getSupportFragmentManager().beginTransaction().show(fragment_shipin).hide(fragment_dinyue).hide(fragment2).hide(fragment_tupian).hide(fragment_gentie).commit();
                radio_btn4.setTextColor(Color.parseColor("#ADFF2F"));
                radio_btn2.setTextColor(Color.BLACK);
                radio_btn3.setTextColor(Color.BLACK);
                radio_btn1.setTextColor(Color.BLACK);
                radio_btn5.setTextColor(Color.BLACK);
                break;
            case R.id.radio_btn5:
//                callBack.sendvalue();
                getActivity().getSupportFragmentManager().beginTransaction().show(fragment_gentie).hide(fragment_dinyue).hide(fragment_shipin).hide(fragment_tupian).hide(fragment2).commit();
                radio_btn5.setTextColor(Color.parseColor("#ADFF2F"));
                radio_btn2.setTextColor(Color.BLACK);
                radio_btn3.setTextColor(Color.BLACK);
                radio_btn4.setTextColor(Color.BLACK);
                radio_btn1.setTextColor(Color.BLACK);
                break;
        }
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        callBack = (CallBack)getActivity();
//    }
//
//   public   interface  CallBack{
//        void  sendvalue();
//    }
}
