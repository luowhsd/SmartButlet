package com.sd.luowh.smartbutlet.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.ui
 * 创建者: Luowh
 * 创建时间: 2018/1/22 22:40
 * 描述: 活动基类
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 显示返回键
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    // 菜单栏操作

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
