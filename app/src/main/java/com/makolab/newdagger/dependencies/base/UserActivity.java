package com.makolab.newdagger.dependencies.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.makolab.newdagger.LoginActivity;
import com.makolab.newdagger.dependencies.UserController;
import com.makolab.newdagger.di.injector.UserInjection;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public class UserActivity extends AppCompatActivity
        implements HasFragmentInjector, HasSupportFragmentInjector
{

    @Inject
    DispatchingAndroidInjector<Fragment> supportFragmentInjector;
    @Inject
    DispatchingAndroidInjector<android.app.Fragment> frameworkFragmentInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        UserInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return supportFragmentInjector;
    }

    @Override
    public AndroidInjector<android.app.Fragment> fragmentInjector() {
        return frameworkFragmentInjector;
    }

    protected boolean checkLogIn() {

        if (!UserInjection.inject(this)) {
            logout();
            return false;
        }
        return true;
    }


    public void logout() {
        LoginActivity.start(this);
        finish();
    }
}
