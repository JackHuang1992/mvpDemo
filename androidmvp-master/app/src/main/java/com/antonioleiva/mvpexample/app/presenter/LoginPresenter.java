package com.antonioleiva.mvpexample.app.presenter;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:59
 * description:
 */
public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
