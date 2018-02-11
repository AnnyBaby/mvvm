package com.example.xiaohonghu.mvvmdemo.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.xiaohonghu.mvvmdemo.R;
import com.example.xiaohonghu.mvvmdemo.base.BaseActivity;
import com.example.xiaohonghu.mvvmdemo.databinding.ActivitySignUpBinding;
import com.example.xiaohonghu.mvvmdemo.viewmodel.SignUpViewModel;

/**
 * Created by xiaohong.hu on 2018/2/6.
 * 注册界面
 */
public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySignUpBinding activitySignUpBinding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);
        SignUpViewModel signUpViewModel = new SignUpViewModel(this,activitySignUpBinding);
        activitySignUpBinding.setSignUpViewModel(signUpViewModel);
    }
}