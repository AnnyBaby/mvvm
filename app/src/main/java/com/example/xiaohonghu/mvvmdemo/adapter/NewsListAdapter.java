package com.example.xiaohonghu.mvvmdemo.adapter;

import android.support.annotation.Nullable;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xiaohonghu.mvvmdemo.bean.NewsListBean;
import com.example.xiaohonghu.mvvmdemo.bean.StoriesBean;

import java.util.List;

/**
 * Created by xiaohong.hu on 2018/2/13.
 */

public class NewsListAdapter  extends BaseQuickAdapter<StoriesBean,BaseViewHolder>{


    public NewsListAdapter(int layoutResId, @Nullable List<StoriesBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, StoriesBean item) {

    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return super.onCreateViewHolder(parent, viewType);
    }
}
