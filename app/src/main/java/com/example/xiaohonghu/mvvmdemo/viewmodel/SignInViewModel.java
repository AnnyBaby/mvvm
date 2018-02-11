package com.example.xiaohonghu.mvvmdemo.viewmodel;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;

import com.example.xiaohonghu.mvvmdemo.R;
import com.example.xiaohonghu.mvvmdemo.base.BaseLoadListener;
import com.example.xiaohonghu.mvvmdemo.bean.BaseBean;
import com.example.xiaohonghu.mvvmdemo.bean.UserInfoBean;
import com.example.xiaohonghu.mvvmdemo.databinding.ActivitySignInBinding;
import com.example.xiaohonghu.mvvmdemo.model.SignInModel;
import com.example.xiaohonghu.mvvmdemo.model.SignInModelImpl;
import com.example.xiaohonghu.mvvmdemo.requery.RequeryUserBean;
import com.example.xiaohonghu.mvvmdemo.utils.ToastUtil;
import com.example.xiaohonghu.mvvmdemo.view.NewsListActivity;
import com.example.xiaohonghu.mvvmdemo.view.SignInActivity;

import java.util.List;

/**
 * Created by xiaohong.hu on 2018/2/9.
 */

public class SignInViewModel implements BaseLoadListener<UserInfoBean> {
    SignInModel mSignInModel ;
    private    SignInActivity mSignInActivity;
    private   ActivitySignInBinding mSignInBinding;
    private   boolean isSuccess;
    private RequeryUserBean mRequeryUserBean;
    public SignInViewModel(SignInActivity activity , ActivitySignInBinding binding) {
        this.mSignInActivity = activity;
        this.mSignInBinding = binding;
        mSignInModel = new SignInModelImpl();
        mRequeryUserBean = new RequeryUserBean();
    }

    public void signIn(){
        if(TextUtils.isEmpty(mRequeryUserBean.phone.get())){
            ToastUtil.showShortToast(mSignInActivity,R.string.please_sign_in_phone);
            return;
        }
        if(TextUtils.isEmpty(mRequeryUserBean.password.get())){
            ToastUtil.showShortToast(mSignInActivity,R.string.please_sign_in_password);
            return;
        }

        mSignInModel.signIn(mRequeryUserBean.phone.get(),mRequeryUserBean.password.get(),this);
    }


    public void onTextPhoneChanged(CharSequence s, int start, int before, int count) {
        mRequeryUserBean.phone.set(s.toString());
    }

    public void onTextPasswordChanged(CharSequence s, int start, int before, int count) {
        mRequeryUserBean.password.set(s.toString());
    }

    @Override
    public void loadSuccess(List<UserInfoBean> list) {

    }

    @Override
    public void loadSuccess() {
        isSuccess = true;


    }

    @Override
    public void loadFailure(String message) {
        isSuccess = false;
        ToastUtil.showShortToast(mSignInActivity, message);
    }

    @Override
    public void loadStart() {

    }

    @Override
    public void loadComplete() {
        if( isSuccess){
            mSignInActivity.startActivity(new Intent(mSignInActivity, NewsListActivity.class));
        }

    }
}
