package com.example.xiaohonghu.mvvmdemo.model;

import android.databinding.ObservableField;

import com.example.xiaohonghu.mvvmdemo.base.BaseLoadListener;
import com.example.xiaohonghu.mvvmdemo.bean.BaseBean;

/**
 * Created by xiaohong.hu on 2018/2/7.
 */

public interface SignUpModel {

  //注册
  void   signUp(String phone,String password, String verification, BaseLoadListener<BaseBean> loadListener);

  //获取注册验证码

  void   signUpVerification(String phone, BaseLoadListener<BaseBean> loadListener);
}
