package com.sd.luowh.smartbutlet.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.sd.luowh.smartbutlet.MainActivity;
import com.sd.luowh.smartbutlet.R;
import com.sd.luowh.smartbutlet.utils.SharedUtils;
import com.sd.luowh.smartbutlet.utils.StaticClass;
import com.sd.luowh.smartbutlet.utils.UtilTools;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.ui
 * 创建者: Luowh
 * 创建时间: 2018/1/27 19:33
 * 描述: 闪屏页
 */

public class SplashActivity extends AppCompatActivity {
    /*
    * 1 、 演示2000ms
    * 2 、 判断程序是否第一次运行
    * 3、  自定义字体
    * 4、  Activity全屏主题
    * */

    private TextView textView;

    private Handler handle = new Handler(){

        @Override
        public void handleMessage(Message msg) {
            switch (msg.what){

                case StaticClass.HANDLE_SPLASH:

                    if(isFirst()){
                        //跳转刀引导页;
                        startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                    }else{
                        startActivity(new Intent(SplashActivity.this,LoginActivity.class));
                    }
                    finish();
                    break;
                default:
                    break;

            }
        }


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }

    private void initView() {
        handle.sendEmptyMessageDelayed(StaticClass.HANDLE_SPLASH,2000);
        textView = (TextView) findViewById(R.id.tv_splash);
        // 设置字体
        UtilTools.setFont(this,textView);

    }
    // 判断程序是否第一次运行
    private boolean isFirst() {

        boolean isFirst = SharedUtils.getBoolean(this,StaticClass.SHARE_IS_FIRST,true);
        if(isFirst){
            SharedUtils.putBoolean(this,StaticClass.SHARE_IS_FIRST,false);
            return true;

        }else{

            return false;

        }

    }



    // 禁用返回
    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
