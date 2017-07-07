package com.makolab.newdagger.di.component;


import com.makolab.newdagger.App;
import com.makolab.newdagger.dependencies.Presenter1;
import com.makolab.newdagger.di.module.AppModule;
import com.makolab.newdagger.di.module.InteractorModule;
import com.makolab.newdagger.di.module.PresenterModule;
import com.makolab.newdagger.di.module.sub.AplicationBindingModule;
//import com.makolab.newdagger.di.module.sub.ActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

//import com.makolab.portal360dealerapp.di.component.sub.SessionActivitySubComponent;
//import com.makolab.portal360dealerapp.di.module.BuildersModule;

/**
 * Created by Katarzyna  on 2017-05-30.
 */
@Singleton
@Component(modules = { AppModule.class, PresenterModule.class, AplicationBindingModule.class, /*ActivityBindingModule.class, */AndroidSupportInjectionModule.class, InteractorModule.class /*BuildersModule.class, InteractorModule.class*/})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App application);
        AppComponent build();
    }
    void inject(App app);

    UserComponent.Builder userComponentBuilder();
}
