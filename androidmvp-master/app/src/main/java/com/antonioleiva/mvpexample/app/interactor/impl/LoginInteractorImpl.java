package com.antonioleiva.mvpexample.app.interactor.impl;

import android.os.Handler;
import android.text.TextUtils;

import com.antonioleiva.mvpexample.app.interactor.LoginInteractor;
import com.antonioleiva.mvpexample.app.listener.OnLoginFinishedListener;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:59
 * description:
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
