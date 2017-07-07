package com.makolab.newdagger.di.injector;

import com.makolab.newdagger.dependencies.UserController;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public interface HasUserInjector {

    UserController userContextInjector();
}
