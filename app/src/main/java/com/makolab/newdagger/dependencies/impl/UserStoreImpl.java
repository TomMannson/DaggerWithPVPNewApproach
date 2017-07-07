package com.makolab.newdagger.dependencies.impl;

import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.makolab.newdagger.dependencies.UserRepository;
import com.makolab.newdagger.dependencies.UserStore;
import com.makolab.newdagger.di.scope.UserScope;

import javax.inject.Inject;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public class UserStoreImpl implements UserStore {

    @Inject
    SharedPreferences preferences;

    @Inject
    public UserStoreImpl() {
    }

    @Override
    public void persistUserInfo(UserRepository userInfo) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("USER_INFO", new Gson().toJson(userInfo));
        editor.apply();
    }

    @Override
    public void clearUserInfo() {
        SharedPreferences.Editor editor = preferences.edit();
        editor.remove("USER_INFO");
        editor.apply();
    }

    @Override
    public UserRepository restoreUserInfo() {
        if(preferences.contains("USER_INFO")) {
            return new GsonBuilder()
                    .create()
                    .fromJson(preferences.getString("USER_INFO", ""),
                            UserRepositoryImpl.class );
        }
        else{
            return null;
        }
    }
}
