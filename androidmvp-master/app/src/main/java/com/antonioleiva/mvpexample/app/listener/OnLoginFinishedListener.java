package com.antonioleiva.mvpexample.app.listener;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:45
 * description:
 */

public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
