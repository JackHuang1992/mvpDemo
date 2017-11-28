package com.antonioleiva.mvpexample.app.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:59
 * description:
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        init();
    }

    protected abstract int getLayout();

    protected abstract void initViews();

    /**
     * Init some Presenter
     */
    protected abstract void initPresenter();

    /**
     * Init some listeners
     */
    protected abstract void initListeners();

    /**
     * Init some adapters
     */
    protected abstract void initAdapters();

    /**
     * Init some datas
     */
    protected abstract void initData();

    protected void init() {
        initViews();
        initPresenter();
        initAdapters();
        initListeners();
        initData();
    }
}
