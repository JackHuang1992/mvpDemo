package com.antonioleiva.mvpexample.app.Login;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:59
 * description:
 */
public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
