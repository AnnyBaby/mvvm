package com.example.xiaohonghu.mvvmdemo.requery;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

import com.example.xiaohonghu.mvvmdemo.view.SignUpActivity;

/**
 * Created by xiaohong.hu on 2018/2/8.
 */

public class RequeryUserBean extends BaseObservable {
    public ObservableField<String> phone = new ObservableField<>();
    public ObservableField<String> password = new ObservableField<>();
    public ObservableField<String> verification = new ObservableField<>();
    public ObservableField<String> token = new ObservableField<>();
}
