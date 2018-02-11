package com.example.xiaohonghu.mvvmdemo.retrofitinterface;

import com.example.xiaohonghu.mvvmdemo.bean.BaseBean;
import com.example.xiaohonghu.mvvmdemo.bean.UserInfoBean;
import com.example.xiaohonghu.mvvmdemo.constant.UrlConstant;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by xiaohong.hu on 2018/2/7.
 */

public interface RetrofitInterface {
    //注册
    @GET(UrlConstant.SIGNUP_PATH)
    Observable<BaseBean> getSignUpData(@Query("phone") String phone, @Query("password") String password, @Query("verification") String verification);

    //获取注册验证码
    @GET(UrlConstant.GET_VERIFICATION_PATH+"/{phone}")
    Observable<BaseBean> getVerificationData(@Path("phone") String phone);

    //获取注册验证码
    @GET(UrlConstant.SIGNIN_PATH)
    Observable<UserInfoBean> getSignInData(@Query("phone") String phone, @Query("password") String password);
}
