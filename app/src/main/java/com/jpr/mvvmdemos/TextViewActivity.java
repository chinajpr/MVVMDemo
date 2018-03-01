package com.jpr.mvvmdemos;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jpr.mvvmdemos.bean.User;
import com.jpr.mvvmdemos.databinding.ActivityTestviewBinding;

/**
 * 类描述:DataBinding TextView的使用
 * 创建日期:2018/3/1 on 11:00
 * 作者:JiaoPeiRong
 */

public class TextViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTestviewBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_testview);
        User user = new User("奥巴马",18,"");
        binding.setUser(user);
    }


}
