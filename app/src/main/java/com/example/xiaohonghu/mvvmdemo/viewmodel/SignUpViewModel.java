package com.example.xiaohonghu.mvvmdemo.viewmodel;


import android.content.Intent;
import android.text.TextUtils;
import android.widget.Toast;

import com.example.xiaohonghu.mvvmdemo.base.BaseLoadListener;
import com.example.xiaohonghu.mvvmdemo.bean.BaseBean;
import com.example.xiaohonghu.mvvmdemo.databinding.ActivitySignUpBinding;
import com.example.xiaohonghu.mvvmdemo.model.SignUpModel;
import com.example.xiaohonghu.mvvmdemo.model.SignUpModelImpl;
import com.example.xiaohonghu.mvvmdemo.requery.RequeryUserBean;
import com.example.xiaohonghu.mvvmdemo.view.SignInActivity;
import com.example.xiaohonghu.mvvmdemo.view.SignUpActivity;

import java.util.List;

/**
 * Created by xiaohong.hu on 2018/2/6.
 */

public class SignUpViewModel implements BaseLoadListener<BaseBean> {
    private SignUpActivity mSignInActivity;
    private ActivitySignUpBinding mActivitySignUpBinding;
    private final SignUpModel mSignUpModel;
    private boolean IsSignUp;

    public SignUpViewModel(SignUpActivity activity , ActivitySignUpBinding activityMainBinding) {
        mSignUpModel = new SignUpModelImpl();
        mSignInActivity = activity;
        mActivitySignUpBinding = activityMainBinding;

    }

    public void  signUp(){
        String phone = mActivitySignUpBinding.etPhone.getText().toString().trim();
        String password = mActivitySignUpBinding.etPassword.getText().toString().trim();
        String comfirmpassword = mActivitySignUpBinding.etComfirmPassword.getText().toString().trim();
        String verification = mActivitySignUpBinding.etVerification.getText().toString().trim();
        if(TextUtils.isEmpty(phone)){
            Toast.makeText(mSignInActivity,"请输入电话号码",Toast.LENGTH_SHORT).show();
            return;
        }else if((TextUtils.isEmpty(password)||TextUtils.isEmpty(comfirmpassword))||!TextUtils.equals(password,comfirmpassword) ){
            Toast.makeText(mSignInActivity,"两次密码不一致",Toast.LENGTH_SHORT).show();
            return;
        }else if(TextUtils.isEmpty(verification)){
            Toast.makeText(mSignInActivity,"请输入验证码",Toast.LENGTH_SHORT).show();
            return;
        }
        IsSignUp = true;
        mSignUpModel.signUp(phone,password,verification,this);
    }

    public void  getVerification(){
        IsSignUp = false;
        String phone = mActivitySignUpBinding.etPhone.getText().toString().trim();
        if(TextUtils.isEmpty(phone)){
            Toast.makeText(mSignInActivity,"请输入电话号码",Toast.LENGTH_SHORT).show();
            return;
        }
        mSignUpModel.signUpVerification(phone,this);
    }

    @Override
    public void loadSuccess(List<BaseBean> list) {


    }

    @Override
    public void loadSuccess() {
        if(IsSignUp){
            mSignInActivity.startActivity(new Intent(mSignInActivity, SignInActivity.class));
            //设置用户信息
            RequeryUserBean requeryUserBean = new RequeryUserBean();
            requeryUserBean.phone.set(mActivitySignUpBinding.etPhone.getText().toString().trim());
            requeryUserBean.password.set(mActivitySignUpBinding.etPassword.getText().toString().trim());
        }
    }

    @Override
    public void loadFailure(String message) {
//        if(IsSignUp){
            Toast.makeText(mSignInActivity,message,Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(mSignInActivity,"获取验证码失败",Toast.LENGTH_SHORT).show();
//        }
    }

    @Override
    public void loadStart() {
        if(IsSignUp){
            Toast.makeText(mSignInActivity,"开始注册",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(mSignInActivity,"获取验证码",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void loadComplete() {
        if(IsSignUp){
            Toast.makeText(mSignInActivity,"开始注册",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(mSignInActivity,"验证码已发送",Toast.LENGTH_SHORT).show();
        }
    }
}
