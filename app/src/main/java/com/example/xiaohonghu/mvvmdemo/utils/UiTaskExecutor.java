package com.example.xiaohonghu.mvvmdemo.utils;

import android.os.Handler;
import android.os.Looper;

/**
 * @description: 主线程任务执行类
 * @copyright: Copyright (c) 2017
 * @author: cwx
 * @date: 2017/5/19
 * @version: 1.00
 * @history:
 */

public class UiTaskExecutor {
    private static UiTaskExecutor mInstance = null;
    private Handler mMainHandler;

    public synchronized static UiTaskExecutor getInstance() {
        if (mInstance == null) {
            synchronized (UiTaskExecutor.class) {
                if (mInstance == null) {
                    mInstance = new UiTaskExecutor();
                }
            }
        }
        return mInstance;
    }

    private UiTaskExecutor() {
        mMainHandler = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable task) {
        mMainHandler.post(task);
    }

    public void execute(Runnable task, long delay) {
        mMainHandler.postDelayed(task, delay);
    }
}
