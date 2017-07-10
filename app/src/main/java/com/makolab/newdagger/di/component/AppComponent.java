package com.makolab.newdagger.di.component;


import com.makolab.newdagger.App;
import com.makolab.newdagger.di.module.AppModule;
import com.makolab.newdagger.di.module.InteractorModule;
import com.makolab.newdagger.di.module.PresenterModule;
import com.makolab.newdagger.di.module.sub.ApplicationBindingModule;


import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by tomasz.krol on 2017-05-30.
 */
@Singleton
@Component(modules = { AppModule.class, PresenterModule.class, ApplicationBindingModule.class, /*ActivityBindingModule.class, */AndroidSupportInjectionModule.class, InteractorModule.class /*BuildersModule.class, InteractorModule.class*/})
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
