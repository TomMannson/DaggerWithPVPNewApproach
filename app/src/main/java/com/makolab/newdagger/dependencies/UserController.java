package com.makolab.newdagger.dependencies;

import android.app.Activity;

/**
 * Created by tomasz.krol on 2017-07-06.
 */

public interface UserController {

    void tryRestoreUser();

    void newUser(String name, String password);

    void logout();

    boolean injectUserScope(Activity object);
}
