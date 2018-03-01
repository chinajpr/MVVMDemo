package com.jpr.mvvmdemos.adapter;

import android.databinding.DataBindingUtil;
import android.provider.ContactsContract;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jpr.mvvmdemos.databinding.AdapterRecyclerBinding;

import java.util.List;

/**
 * 类描述:
 * 创建日期:2018/3/1 on 14:55
 * 作者:JiaoPeiRong
 */

public class MyAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    AdapterRecyclerBinding binding;
    public MyAdapter(@LayoutRes int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {
        binding = DataBindingUtil.bind(helper.itemView);
        binding.textView.setText(item);
    }
}
