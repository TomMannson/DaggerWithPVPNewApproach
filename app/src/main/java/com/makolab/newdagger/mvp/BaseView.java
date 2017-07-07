package com.makolab.newdagger.mvp;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public interface BaseView {

    void showProgress();

    void hideProgress();

    void showEmptyView();

    void hideEmptyView();

    void getViewContext();

}
