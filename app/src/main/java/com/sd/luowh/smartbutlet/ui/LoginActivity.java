package com.sd.luowh.smartbutlet.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.sd.luowh.smartbutlet.R;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.ui
 * 创建者: Luowh
 * 创建时间: 2018/2/3 17:10
 * 描述: TODO
 */

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {

        register = (Button) findViewById(R.id.register_btn);

        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register_btn:
                startActivity(new Intent(this,RegisterActivity.class));
                break;
        }
    }
}
