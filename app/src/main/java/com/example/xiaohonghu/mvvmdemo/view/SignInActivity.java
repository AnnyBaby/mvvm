package com.example.xiaohonghu.mvvmdemo.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.xiaohonghu.mvvmdemo.R;
import com.example.xiaohonghu.mvvmdemo.base.BaseActivity;
import com.example.xiaohonghu.mvvmdemo.databinding.ActivitySignInBinding;
import com.example.xiaohonghu.mvvmdemo.model.SignInModel;
import com.example.xiaohonghu.mvvmdemo.viewmodel.SignInViewModel;
import com.example.xiaohonghu.mvvmdemo.viewmodel.SignUpViewModel;

/**
 * 登录界面
 */
public class SignInActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       ActivitySignInBinding activitySignInBinding = DataBindingUtil.setContentView(this,R.layout.activity_sign_in);
        SignInViewModel signUpViewModel = new SignInViewModel(this,activitySignInBinding);
        activitySignInBinding.setSignInViewModel(signUpViewModel);
    }
}
