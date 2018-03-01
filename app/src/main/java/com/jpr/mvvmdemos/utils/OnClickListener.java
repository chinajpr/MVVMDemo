package com.jpr.mvvmdemos.utils;

import android.view.View;
import android.widget.Toast;

/**
 * 类描述:
 * 创建日期:2018/3/1 on 15:55
 * 作者:JiaoPeiRong
 */

public class OnClickListener {
    public void onClick(View view){
        Toast.makeText(view.getContext() , "方案二" , Toast.LENGTH_SHORT).show();

    }
}
