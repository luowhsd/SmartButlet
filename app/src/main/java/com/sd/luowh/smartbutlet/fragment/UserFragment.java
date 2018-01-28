package com.sd.luowh.smartbutlet.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sd.luowh.smartbutlet.R;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.fragment
 * 创建者: Luowh
 * 创建时间: 2018/1/24 22:44
 * 描述: 个人中心
 */

public class UserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user,null);
        return view;
    }

}
