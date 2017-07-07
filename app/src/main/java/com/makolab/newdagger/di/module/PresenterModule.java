package com.makolab.newdagger.di.module;

import com.makolab.newdagger.dependencies.Presenter1;
import com.makolab.newdagger.dependencies.Presenter2;
import com.makolab.newdagger.dependencies.impl.Presenter1Impl;
import com.makolab.newdagger.dependencies.impl.Presenter2Impl;
import com.makolab.newdagger.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tomasz.krol on 2017-07-06.
 */

@Module
public class PresenterModule {

    @Provides
    public static Presenter1 presenter1(Presenter1Impl impl){
        return impl;
    }

    @Provides
    public static Presenter2 presenter2(Presenter2Impl impl){
        return impl;
    }
}
