package com.jpr.mvvmdemos.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * 类描述:
 * 创建日期:2018/3/1 on 11:30
 * 作者:JiaoPeiRong
 */

public class ImageHelper {
    /**
     * 无需手动调用
     * 当ImageView中使用img属性时,会自动调用loadImg
     * @param imageView
     * @param url
     */
    @BindingAdapter({"img"})
    public static void loadImg(ImageView imageView , String url){
        Glide.with(imageView.getContext()).load(url).into(imageView);
    }
}
