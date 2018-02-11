package com.example.xiaohonghu.mvvmdemo.model;

import com.example.xiaohonghu.mvvmdemo.base.BaseLoadListener;

/**
 * Created by xiaohong.hu on 2018/2/9.
 */

public interface SignInModel {

   void  signIn(String phone, String password, BaseLoadListener loadListener);
}
