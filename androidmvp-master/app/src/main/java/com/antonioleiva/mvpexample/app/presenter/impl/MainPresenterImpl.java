package com.antonioleiva.mvpexample.app.presenter.impl;

import com.antonioleiva.mvpexample.app.interactor.FindItemsInteractor;
import com.antonioleiva.mvpexample.app.main.MainView;
import com.antonioleiva.mvpexample.app.presenter.MainPresenter;

import java.util.List;

/**
 * author: 黄士鹏
 * created on: 2017/11/28 11:59
 * description:
 */

public class MainPresenterImpl implements MainPresenter, FindItemsInteractor.OnFinishedListener {

    private MainView mainView;
    private FindItemsInteractor findItemsInteractor;

    public MainPresenterImpl(MainView mainView, FindItemsInteractor findItemsInteractor) {
        this.mainView = mainView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override public void onResume() {
        if (mainView != null) {
            mainView.showProgress();
        }

        findItemsInteractor.findItems(this);
    }

    @Override public void onItemClicked(int position) {
        if (mainView != null) {
            mainView.showMessage(String.format("Position %d clicked", position + 1));
        }
    }

    @Override public void onDestroy() {
        mainView = null;
    }

    @Override public void onFinished(List<String> items) {
        if (mainView != null) {
            mainView.setItems(items);
            mainView.hideProgress();
        }
    }

    public MainView getMainView() {
        return mainView;
    }
}
