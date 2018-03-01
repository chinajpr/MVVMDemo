package com.jpr.mvvmdemos;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.jpr.mvvmdemos.bean.UpdateBean;
import com.jpr.mvvmdemos.databinding.ActivityUpdateBinding;

/**
 * 类描述:
 * 创建日期:2018/3/1 on 16:11
 * 作者:JiaoPeiRong
 */

public class UpdateActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityUpdateBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_update);
        final UpdateBean updateBean = new UpdateBean("11111111111");
        binding.setUpdate(updateBean);
        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateBean.setName("22222222222222");
                //重新设置一边也可以
//                UpdateBean updateBean1 = new UpdateBean("3333333333");
//                binding.setUpdate(updateBean1);
            }
        });
    }
}
