package com.makolab.newdagger.mvp.login;

import com.makolab.newdagger.mvp.BaseView;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public class LoginContract {

    public interface Presenter {

        void performLogin();

    }

    public interface View extends BaseView{



    }

}
