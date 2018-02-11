package com.example.xiaohonghu.mvvmdemo.utils;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;



/**
 * @description: toast工具类
 * @copyright: Copyright (c)
 * @author: cwx
 * @date: 2017/5/19
 * @version: 1.00
 * @history:
 */

public class ToastUtil {
    private static Toast toast = null;

    public static void showLongToast(Context context,int resID) {
        showToast(context,context.getString(resID), Toast.LENGTH_LONG);
    }

    public static void showShortToast(Context context,int resID) {
        showToast(context,context.getString(resID), Toast.LENGTH_SHORT);
    }

    public static void showLongToast(Context context,String msg) {
        showToast(context,msg, Toast.LENGTH_LONG);
    }

    public static void showShortToast(Context context,String msg) {
        showToast(context,msg, Toast.LENGTH_SHORT);
    }

    private static void showToast(final Context context, final String msg, final int duration) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (toast == null){
                toast = Toast.makeText(context, "", duration);
            }
            toast.setText(msg);
            toast.show();
        } else {
            UiTaskExecutor.getInstance().execute(new Runnable() {
                @Override
                public void run() {
                    if (toast == null){
                        toast = Toast.makeText(context, "", duration);
                    }
                    toast.setText(msg);
                    toast.show();
                }
            });
        }
    }
}
