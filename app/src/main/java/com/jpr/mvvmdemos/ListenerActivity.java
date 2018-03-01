package com.jpr.mvvmdemos;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.jpr.mvvmdemos.databinding.ActivityListenerBinding;
import com.jpr.mvvmdemos.utils.OnClickListener;

/**
 * 类描述:DataBinding 各种监听器的使用
 * 创建日期:2018/3/1 on 15:19
 * 作者:JiaoPeiRong
 */

public class ListenerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListenerBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_listener);
        binding.setClick2(new OnClickListener2());

        binding.setClick(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListenerActivity.this , "方案一",Toast.LENGTH_SHORT).show();
            }
        });
        //推荐这样
        binding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ListenerActivity.this , "方案三" , Toast.LENGTH_SHORT).show();
            }
        });
        //推荐这样
        binding.longClick.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(ListenerActivity.this , "长按时间" ,Toast.LENGTH_SHORT).show();
                return false;
            }
        });


    }

    //如果是内部类,必须是public
    public class OnClickListener2{
        public void onClick(View view){
            Toast.makeText(ListenerActivity.this , "方案二" , Toast.LENGTH_SHORT).show();
        }
    }
}
