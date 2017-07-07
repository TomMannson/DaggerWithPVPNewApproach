package com.makolab.newdagger.mvp;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public abstract class BasePresenter<View extends BaseView> {

    protected View attachedView;

    public void attachView(View view){
        attachedView = view;
    }

    public void detachView(){
        attachedView = null;
    }
}
