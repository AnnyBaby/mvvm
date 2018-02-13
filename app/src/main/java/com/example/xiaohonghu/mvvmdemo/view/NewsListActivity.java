package com.example.xiaohonghu.mvvmdemo.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xiaohonghu.mvvmdemo.R;
import com.example.xiaohonghu.mvvmdemo.databinding.ActivityNewsListBinding;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;


public class NewsListActivity extends AppCompatActivity {

    private ActivityNewsListBinding mActivityNewsListBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityNewsListBinding = DataBindingUtil.setContentView(this, R.layout.activity_news_list);
        initRecyclerView();
    }

    private void initRecyclerView() {
        mActivityNewsListBinding.refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
            }
        });

        mActivityNewsListBinding.refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {
                refreshLayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
            }
        });
    }
}
