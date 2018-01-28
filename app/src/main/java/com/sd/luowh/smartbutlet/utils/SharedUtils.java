package com.sd.luowh.smartbutlet.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.utils
 * 创建者: Luowh
 * 创建时间: 2018/1/27 15:10
 * 描述: SharePreferences封装类
 */

public class SharedUtils {

    public static final String NAME = "config";

    // 键 值
    public static void putString(Context mContext,String key,String value){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(key,value).commit();
    }
    // 键 默认值
    public static String getString(Context mContext,String key,String defValue){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString(key,defValue);
    }

    // 键 值
    public static void putInt(Context mContext,String key,int value){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sharedPreferences.edit().putInt(key,value).commit();
    }
    // 键 默认值
    public static int getInt(Context mContext,String key,int defValue){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getInt(key,defValue);
    }

    // 键 值
    public static void putBoolean(Context mContext,String key,boolean value){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sharedPreferences.edit().putBoolean(key,value).commit();
    }
    // 键 默认值
    public static boolean getBoolean(Context mContext,String key,boolean defValue){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key,defValue);
    }
    //键
    public static void deleShared(Context mContext,String key){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sharedPreferences.edit().remove(key).commit();
    }
    // 删除全部
    public static void deleAll(Context mContext){
        SharedPreferences sharedPreferences  = mContext.getSharedPreferences(NAME,Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().commit();
    }

}
