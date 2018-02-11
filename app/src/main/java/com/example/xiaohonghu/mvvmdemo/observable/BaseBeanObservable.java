package com.example.xiaohonghu.mvvmdemo.observable;

import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Created by xiaohong.hu on 2018/2/7.
 */

public class BaseBeanObservable extends BaseObservable {
    public ObservableField<String> message = new ObservableField<>();
    private ObservableBoolean success = new ObservableBoolean();

}
