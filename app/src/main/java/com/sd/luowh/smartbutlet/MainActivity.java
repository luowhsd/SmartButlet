package com.sd.luowh.smartbutlet;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.sd.luowh.smartbutlet.fragment.ButletFragment;
import com.sd.luowh.smartbutlet.fragment.GirlFragment;
import com.sd.luowh.smartbutlet.fragment.UserFragment;
import com.sd.luowh.smartbutlet.fragment.WechatFragment;
import com.sd.luowh.smartbutlet.ui.BaseActivity;
import com.sd.luowh.smartbutlet.ui.SettingActivity;
import com.sd.luowh.smartbutlet.utils.L;
import com.tencent.bugly.crashreport.CrashReport;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    // TabLayout
    private TabLayout mTabLayout;
    // ViewPage
    private ViewPager mViewPager;
    // Title
    private List<String> mTitle;
    //Fragment
    private List<Fragment> mFragment;
    // 悬浮窗
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 去掉阴影
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0f);

        // 初始化数据
        initData();
        // 初始化view
        initView();

    }

    private void initData(){

        mTitle = new ArrayList<>();
        mTitle.add(getString(R.string.tab_name_0));
        mTitle.add(getString(R.string.tab_name_1));
        mTitle.add(getString(R.string.tab_name_2));
        mTitle.add(getString(R.string.tab_name_3));

        mFragment = new ArrayList<>();
        mFragment.add(new ButletFragment());
        mFragment.add(new WechatFragment());
        mFragment.add(new GirlFragment());
        mFragment.add(new UserFragment());



    }

    private void initView(){
        fab = (FloatingActionButton) findViewById(R.id.fab_settings);
        fab.setOnClickListener(this);
        fab.setVisibility(View.GONE );
        mTabLayout = (TabLayout) findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                if(position==0){
                    fab.setVisibility(View.GONE);
                }else{
                    fab.setVisibility(View.VISIBLE);
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        // 预加载
        mViewPager.setOffscreenPageLimit(mFragment.size());
        // 设置适配器
        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            @Override
            public Fragment getItem(int position) {
                return mFragment.get(position);
            }

            @Override
            public int getCount() {
                return mFragment.size();
            }

            // 设置标题


            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle.get(position);
            }
        });

        mTabLayout.setupWithViewPager(mViewPager);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.fab_settings:
                startActivity(new Intent(this, SettingActivity.class));
                break;
            default:


        }
    }
}
