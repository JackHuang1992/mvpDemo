package com.antonioleiva.mvpexample.app.presenter.impl;

import com.antonioleiva.mvpexample.app.interactor.LoginInteractor;
import com.antonioleiva.mvpexample.app.interactor.impl.LoginInteractorImpl;
import com.antonioleiva.mvpexample.app.Login.LoginView;
import com.antonioleiva.mvpexample.app.listener.OnLoginFinishedListener;
import com.antonioleiva.mvpexample.app.presenter.LoginPresenter;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:59
 * description:
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishedListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override public void validateCredentials(String username, String password) {
        if (loginView != null) {
            loginView.showProgress();
        }

        loginInteractor.login(username, password, this);
    }

    @Override public void onDestroy() {
        loginView = null;
    }

    @Override public void onUsernameError() {
        if (loginView != null) {
            loginView.setUsernameError();
            loginView.hideProgress();
        }
    }

    @Override public void onPasswordError() {
        if (loginView != null) {
            loginView.setPasswordError();
            loginView.hideProgress();
        }
    }

    @Override public void onSuccess() {
        if (loginView != null) {
            loginView.navigateToHome();
        }
    }
}
