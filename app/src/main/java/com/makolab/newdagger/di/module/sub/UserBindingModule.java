package com.makolab.newdagger.di.module.sub;

import android.app.Activity;

import com.makolab.newdagger.MainActivity;
//import com.makolab.newdagger.di.component.sub.MainActivitySubcomponent;
import com.makolab.newdagger.di.scope.ActivityScope;
import com.makolab.newdagger.di.scope.UserScope;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by tomasz.krol on 2017-07-06.
 */
@Module
public interface UserBindingModule {

    @ContributesAndroidInjector(modules = { /* modules to install into the subcomponent */ })
    abstract MainActivity contributeYourActivityInjector();
}
