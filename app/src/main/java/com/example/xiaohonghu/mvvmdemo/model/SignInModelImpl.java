package com.example.xiaohonghu.mvvmdemo.model;

import android.os.Handler;

import com.example.xiaohonghu.mvvmdemo.base.BaseLoadListener;
import com.example.xiaohonghu.mvvmdemo.bean.BaseBean;
import com.example.xiaohonghu.mvvmdemo.bean.UserInfoBean;
import com.example.xiaohonghu.mvvmdemo.http.HttpUtils;
import com.example.xiaohonghu.mvvmdemo.requery.RequeryUserBean;
import com.orhanobut.logger.Logger;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xiaohong.hu on 2018/2/9.
 */

public class SignInModelImpl implements SignInModel {

    @Override
    public void signIn(String phone, String password, final BaseLoadListener loadListener) {

        HttpUtils.getSignInData(phone,password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<UserInfoBean>() {
                    @Override
                    public void onNext(@NonNull UserInfoBean userInfoBean) {
                        RequeryUserBean requeryUserBean = new RequeryUserBean();
                        if(userInfoBean.isSuccess()){
                            if(userInfoBean.getEntity()!=null){
                                requeryUserBean.phone.set(userInfoBean.getEntity().getMobile());
                                requeryUserBean.token.set(userInfoBean.getEntity().getToken());
                            }
                        }else {
                            loadListener.loadFailure(userInfoBean.getMessage());
                        }

                    }

                    @Override
                    protected void onStart() {
                        super.onStart();
                        loadListener.loadStart();
                    }

                    @Override
                    public void onError(@NonNull Throwable throwable) {
                        loadListener.loadFailure(throwable.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
//                                loadListener.loadSuccess();
                                loadListener.loadComplete();
                            }
                        }, 2000);
                    }


                });

    }
}
