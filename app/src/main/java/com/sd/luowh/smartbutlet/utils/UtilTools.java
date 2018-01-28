package com.sd.luowh.smartbutlet.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;

/**
 * 项目名: SmartButlet
 * 包名: com.sd.luowh.smartbutlet.utils
 * 创建者: Luowh
 * 创建时间: 2018/1/22 22:53
 * 描述: 工具统一类
 */

public class UtilTools {
    /*设置字体*/
    public static void setFont(Context mContext, TextView textView){
        Typeface typeFace =  Typeface.createFromAsset(mContext.getAssets(),"fonts/FONT.TTF");
        textView.setTypeface(typeFace);
    }

}
