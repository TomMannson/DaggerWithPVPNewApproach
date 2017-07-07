package com.makolab.newdagger.dependencies;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public interface UserStore {

    void persistUserInfo(UserRepository userInfo);

    void clearUserInfo();

    UserRepository restoreUserInfo();
}
