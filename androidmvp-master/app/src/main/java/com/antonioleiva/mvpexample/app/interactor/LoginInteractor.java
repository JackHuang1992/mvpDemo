package com.antonioleiva.mvpexample.app.interactor;

import com.antonioleiva.mvpexample.app.listener.OnLoginFinishedListener;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:59
 * description:
 */

public interface LoginInteractor {
    void login(String username, String password, OnLoginFinishedListener listener);

}
