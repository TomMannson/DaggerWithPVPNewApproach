package com.makolab.newdagger.dependencies.impl;

import android.app.Activity;

import com.makolab.newdagger.dependencies.UserController;
import com.makolab.newdagger.dependencies.UserRepository;
import com.makolab.newdagger.di.component.UserComponent;
import com.makolab.newdagger.di.module.UserModule;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;

/**
 * Created by tomasz.krol on 2017-07-06.
 */

public class UserControllerImpl implements UserController {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;
    private UserComponent.Builder builder;
    private UserStoreImpl userStore;
    private UserComponent userComponent;


    @Inject
    public UserControllerImpl(UserComponent.Builder builder, UserStoreImpl userStore) {
        this.builder = builder;
        this.userStore = userStore;
    }

    @Override
    public void tryRestoreUser() {
        UserRepository repo = this.userStore.restoreUserInfo();
        if (repo != null) {
            initUserComponent(repo);
        }
    }

    @Override
    public void newUser(String name, String password) {
        UserRepository repo = new UserRepositoryImpl();
        repo.setUserName(name);
        repo.setUserPassword(password);
        initUserComponent(repo);
        this.userStore.persistUserInfo(repo);

    }

    private void initUserComponent(UserRepository repo) {
        userComponent = builder.sessionModule(new UserModule(repo))
                .build();
        userComponent.inject(this);
    }

    @Override
    public void logout() {
        userComponent = null;
        this.userStore.clearUserInfo();
    }

    @Override
    public boolean injectUserScope(Activity object) {
        if(userComponent != null) {
            return dispatchingAndroidInjector.maybeInject(object);
        }
        else{
            return false;
        }
    }
}
