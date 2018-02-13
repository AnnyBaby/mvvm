package com.example.xiaohonghu.mvvmdemo.http;

import com.example.xiaohonghu.mvvmdemo.bean.BaseBean;
import com.example.xiaohonghu.mvvmdemo.bean.UserInfoBean;
import com.example.xiaohonghu.mvvmdemo.constant.UrlConstant;
import com.example.xiaohonghu.mvvmdemo.model.SignInModel;
import com.example.xiaohonghu.mvvmdemo.retrofitinterface.RetrofitInterface;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xiaohong.hu on 2018/2/7.
 */

public class HttpUtils {
    private static final int DEFAULT_TIMEOUT = 8; //连接 超时的时间，单位：秒
    private static final OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)
            .build();
    private static Retrofit retrofit;
    private static RetrofitInterface retrofitInterface;


    //用于登录注册的功能
    private synchronized static RetrofitInterface getRetrofit() {
        //初始化retrofit的配置
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(UrlConstant.URL_BASE)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            retrofitInterface = retrofit.create(RetrofitInterface.class);
        }
        return retrofitInterface;
    }


    //用于获取知乎日报的内容
    private synchronized static RetrofitInterface getNewsRetrofit() {
        //初始化retrofit的配置
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(UrlConstant.URL_BASE)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
            retrofitInterface = retrofit.create(RetrofitInterface.class);
        }
        return retrofitInterface;
    }



    //注册
    public static Observable<BaseBean> getSignUpData(String phone,String password,String verification) {
        return getRetrofit().getSignUpData(phone,password,verification);
    }

    //获取注册验证码
    public static Observable<BaseBean> getVerificationData(String phone) {
        return getRetrofit().getVerificationData(phone);
    }

    //登录账号
    public static Observable<UserInfoBean> getSignInData(String phone, String password) {
        return getRetrofit().getSignInData(phone,password);

    }
}
