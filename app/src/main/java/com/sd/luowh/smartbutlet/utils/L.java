package com.sd.luowh.smartbutlet.utils;

import android.util.Log;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.utils
 * 创建者: Luowh
 * 创建时间: 2018/1/27 14:41
 * 描述: Log封装类
 */

public class L {

    // 开关
    public static final boolean DEBUG = true;
    // TAG
    public static final String TAG = "SmartButlet";

    // 四个等级 DIWE
    public static void d(String text){
        if(DEBUG){
            Log.d(TAG,text);
        }

    }

    public static void i(String text){
        if(DEBUG) {
            Log.i(TAG, text);
        }
    }

    public static void w(String text){
        if(DEBUG) {
            Log.w(TAG, text);
        }
    }

    public static void e(String text){
        if(DEBUG) {
            Log.e(TAG, text);
        }
    }



}
