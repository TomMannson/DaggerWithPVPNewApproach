package com.makolab.newdagger;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

//import com.makolab.portal360dealerapp.di.component.DaggerAppComponent;
//import com.makolab.portal360dealerapp.di.component.UserComponent;
//import com.squareup.leakcanary.LeakCanary;
//import com.squareup.leakcanary.RefWatcher;

//import net.danlew.android.joda.JodaTimeAndroid;

import com.makolab.newdagger.dependencies.UserController;
import com.makolab.newdagger.di.component.DaggerAppComponent;
import com.makolab.newdagger.di.component.UserComponent;
import com.makolab.newdagger.di.injector.HasUserInjector;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

//import com.makolab.portal360dealerapp.di.component.sub.SessionActivitySubComponent;

//import com.makolab.portal360dealerapp.di.componentG.DaggerAppComponent;

/**
 * Created by Katarzyna  on 2017-05-30.
 */

public class App extends Application  implements HasActivityInjector, HasUserInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Inject
    UserController userController;

    @Override
    public void onCreate() {
        super.onCreate();
//        JodaTimeAndroid.init(this);
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);

        userController.tryRestoreUser();
//        userController.newUser(null, null);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    @Override
    public UserController userContextInjector() {
        return userController;
    }
}
