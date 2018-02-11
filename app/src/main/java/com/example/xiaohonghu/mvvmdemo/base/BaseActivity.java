package com.example.xiaohonghu.mvvmdemo.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.xiaohonghu.mvvmdemo.R;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }
}
