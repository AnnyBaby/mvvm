package com.example.xiaohonghu.mvvmdemo.base;

import java.util.List;

/**
 *
 *
 */

public interface BaseLoadListener<T> {
    /**
     * 加载数据成功
     *
     * @param list
     */
    void loadSuccess(List<T> list);
    void loadSuccess();
    /**
     * 加载失败
     *
     * @param message
     */
    void loadFailure(String message);

    /**
     * 开始加载
     */
    void loadStart();

    /**
     * 加载结束
     */
    void loadComplete();
}
