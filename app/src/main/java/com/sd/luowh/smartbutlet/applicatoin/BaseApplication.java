package com.sd.luowh.smartbutlet.applicatoin;

import android.app.Application;
import android.content.Context;

import com.sd.luowh.smartbutlet.utils.StaticClass;
import com.tencent.bugly.crashreport.CrashReport;

/**
 * Created by lenovo on 2018/1/22.
 */

public class BaseApplication extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        CrashReport.initCrashReport(getApplicationContext(), StaticClass.BUGLY_APP_ID, true);
    }

    public static Context getmContext() {
        return mContext;
    }
}
