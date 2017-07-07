package com.makolab.newdagger.dependencies.impl;

import com.makolab.newdagger.dependencies.UserRepository;

import javax.inject.Inject;

/**
 * Created by tomasz.krol on 2017-07-07.
 */


public class UserRepositoryImpl implements UserRepository {

    String userName;
    String password;

    @Inject UserRepositoryImpl(){};

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setUserPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getUserPassword() {
        return password;
    }
}
