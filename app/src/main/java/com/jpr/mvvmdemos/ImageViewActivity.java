package com.jpr.mvvmdemos;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jpr.mvvmdemos.bean.User;
import com.jpr.mvvmdemos.databinding.ActivityImageviewBinding;

/**
 * 类描述:DataBinding ImageView 的使用
 * 创建日期:2018/3/1 on 11:25
 * 作者:JiaoPeiRong
 */

public class ImageViewActivity extends AppCompatActivity {
    private static final String img = "https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1519875395&di=890ceb9850f0df5e97e3813ff73c66a8&src=http://pic16.nipic.com/20110822/8012228_182142366158_2.jpg";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityImageviewBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_imageview);
        User user = new User("克林顿" , 19 , img);

        binding.setUser(user);
    }

}

