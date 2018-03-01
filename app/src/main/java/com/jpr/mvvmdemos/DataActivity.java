package com.jpr.mvvmdemos;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.jpr.mvvmdemos.databinding.ActivityDataBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:
 * 创建日期:2018/3/1 on 16:34
 * 作者:JiaoPeiRong
 */

public class DataActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_data);
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        binding.setList(list);
    }
}
