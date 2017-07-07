package com.makolab.newdagger.di.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;


import com.makolab.newdagger.App;
import com.makolab.newdagger.dependencies.UserController;
import com.makolab.newdagger.dependencies.impl.UserControllerImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

//import com.makolab.portal360dealerapp.di.component.sub.Camera2ActivitySubComponent;
//import com.makolab.portal360dealerapp.di.component.sub.MainActivitySubComponent;
//import com.makolab.portal360dealerapp.di.component.sub.SessionActivitySubComponent;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
@Module(subcomponents = { /*MainActivitySubComponent.class,*/ /*SessionActivitySubComponent.class,*/ /*Camera2ActivitySubComponent.class*/})
public class AppModule {

    @Provides
    Context provideContext(App application){
        return application.getApplicationContext();
    }

    @Provides
    @Singleton
    Application providesApplication(App application) {
        return application;
    }

    @Provides
    @Singleton
    UserController userController(UserControllerImpl impl){
        return impl;
    }

    @Provides
    @Singleton
    SharedPreferences preferences(App application){
        return application.getSharedPreferences("global", Context.MODE_PRIVATE);
    }
}
