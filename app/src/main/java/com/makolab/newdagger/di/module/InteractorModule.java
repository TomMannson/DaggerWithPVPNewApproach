package com.makolab.newdagger.di.module;

import com.makolab.newdagger.dependencies.Interactor1;
import com.makolab.newdagger.dependencies.Presenter1;
import com.makolab.newdagger.dependencies.Synchronizer;
import com.makolab.newdagger.dependencies.impl.Interactor1Impl;
import com.makolab.newdagger.dependencies.impl.Presenter1Impl;
import com.makolab.newdagger.dependencies.impl.SynchronizerImpl;
import com.makolab.newdagger.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tomasz.krol on 2017-07-06.
 */

@Module
public class InteractorModule {

    @Provides
    public static Interactor1 interactor1(Interactor1Impl impl){
        return impl;
    }


    @Provides
    public static Synchronizer synchronizer(SynchronizerImpl impl){
        return impl;
    }


}
