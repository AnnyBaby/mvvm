package com.example.xiaohonghu.mvvmdemo.model;

import android.databinding.ObservableField;
import android.os.Handler;

import com.example.xiaohonghu.mvvmdemo.base.BaseLoadListener;
import com.example.xiaohonghu.mvvmdemo.bean.BaseBean;
import com.example.xiaohonghu.mvvmdemo.http.HttpUtils;
import com.orhanobut.logger.Logger;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xiaohong.hu on 2018/2/7.
 */

public class SignUpModelImpl  implements  SignUpModel{

    @Override
    public void signUp(String phone, String password, String verification, final BaseLoadListener<BaseBean> loadListener) {

        HttpUtils.getSignUpData(phone,password,verification)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<BaseBean>() {
                    @Override
                    public void onNext(@NonNull BaseBean newsBean) {
                        Logger.d("signUp",newsBean);

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

    @Override
    public void signUpVerification(String phone, final BaseLoadListener<BaseBean> loadListener) {
        HttpUtils.getVerificationData(phone)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new DisposableObserver<BaseBean>() {
                    @Override
                    public void onNext(@NonNull BaseBean newsBean) {

                        Logger.d("Verification",newsBean);

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
                    }
                });
    }
}
