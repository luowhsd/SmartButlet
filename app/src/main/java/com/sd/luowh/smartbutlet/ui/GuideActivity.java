package com.sd.luowh.smartbutlet.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.sd.luowh.smartbutlet.MainActivity;
import com.sd.luowh.smartbutlet.R;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.ui
 * 创建者: Luowh
 * 创建时间: 2018/1/27 20:20
 * 描述: 引导页
 */

public class GuideActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewPager mViewPager;
    // 三个标签页
    private View view1,view2,view3;
    // 三个指示小圆点
    private ImageView point1,point2,point3;

    // 右上角跳过
    private ImageView black_img;
    //进入主页按钮
    private Button start_btn;

    private List<View> viewList = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        initView();
    }

    private void initView(){

        black_img = (ImageView) findViewById(R.id.black_btn);

        mViewPager = (ViewPager) findViewById(R.id.mViewPager);


        view1 = View.inflate(this,R.layout.page_item_one,null);
        view2 = View.inflate(this,R.layout.page_item_two,null);
        view3 = View.inflate(this,R.layout.page_item_three,null);

        start_btn = (Button) view3.findViewById(R.id.btn_start);


        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        point1 = (ImageView) findViewById(R.id.point1);
        point2 = (ImageView) findViewById(R.id.point2);
        point3 = (ImageView) findViewById(R.id.point3);

        //初始值
        setPointImg(true,false,false);

        mViewPager.setAdapter(new GuideAdapter());

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:
                        black_img.setVisibility(View.VISIBLE);
                        setPointImg(true,false,false);
                        break;
                    case 1:
                        black_img.setVisibility(View.VISIBLE);
                        setPointImg(false,true,false);
                        break;
                    case 2:
                        black_img.setVisibility(View.GONE);
                        setPointImg(false,false,true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


        // 跳过引导页
        black_img.setOnClickListener(this);
        start_btn.setOnClickListener(this);

    }

    //设置小圆点图片
    private void setPointImg(boolean index1,boolean index2,boolean index3){

        if(index1){
            point1.setImageResource(R.drawable.point_on);
        }else{
            point1.setImageResource(R.drawable.point_off);
        }

        if(index2){
            point2.setImageResource(R.drawable.point_on);
        }else{
            point2.setImageResource(R.drawable.point_off);
        }

        if(index3){
            point3.setImageResource(R.drawable.point_on);
        }else{
            point3.setImageResource(R.drawable.point_off);
        }


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.black_btn:
            case R.id.btn_start:
                startActivity(new Intent(this, MainActivity.class));
                finish();
                break;

        }
    }


    // 适配器
    class GuideAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ((ViewPager)container).addView(viewList.get(position));
            return viewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            ((ViewPager)container).removeView(viewList.get(position));
        }
    }

}
