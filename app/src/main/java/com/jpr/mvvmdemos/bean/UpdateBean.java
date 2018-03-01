package com.jpr.mvvmdemos.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * 类描述:
 * 创建日期:2018/3/1 on 16:12
 * 作者:JiaoPeiRong
 */

public class UpdateBean extends BaseObservable{
    private String name;

    public UpdateBean(String name) {
        this.name = name;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
