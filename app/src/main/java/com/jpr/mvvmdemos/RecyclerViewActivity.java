package com.jpr.mvvmdemos;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.jpr.mvvmdemos.adapter.MyAdapter;
import com.jpr.mvvmdemos.databinding.ActivityRecyclerviewBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:DataBinding RecyclerView 的使用
 * 创建日期:2018/3/1 on 11:53
 * 作者:JiaoPeiRong
 */

public class RecyclerViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRecyclerviewBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_recyclerview);
        initRecyclerView(binding);
    }

    private void initRecyclerView(ActivityRecyclerviewBinding binding) {
        List<String> list = new ArrayList<>();
        list.add("1111111");
        list.add("2222222");
        list.add("33333333");
        list.add("44444444");
        list.add("55555555");
        list.add("66666666");
        list.add("77777777");

        MyAdapter adapter = new MyAdapter(R.layout.adapter_recycler , list);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);


    }
}
