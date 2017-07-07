package com.makolab.newdagger.di.component;

//import com.makolab.portal360dealerapp.di.component.sub.SessionActivitySubComponent;

import com.makolab.newdagger.dependencies.impl.UserControllerImpl;
import com.makolab.newdagger.di.module.UserModule;
//import com.makolab.newdagger.di.module.sub.UserBindingModule;
//import com.makolab.newdagger.di.module.sub.UserScopesScreensModule;
//import com.makolab.newdagger.di.module.sub.ActivityModule;
import com.makolab.newdagger.di.module.sub.UserBindingModule;
import com.makolab.newdagger.di.scope.UserScope;

import dagger.Subcomponent;

/**
 * Created by tomasz.krol on 2017-06-23.
 */
@UserScope
@Subcomponent(modules = {UserModule.class, UserBindingModule.class})
public interface UserComponent {

    @Subcomponent.Builder
    interface Builder {
        UserComponent.Builder sessionModule(UserModule userModule);
        UserComponent build();
    }

    void inject(UserControllerImpl user);

//    MainActivitySubcomponent.Builder mainActivityComponent();
//    SessionActivitySubComponent userComponentBuilder();
//    UserDetailsActivityComponent plus(UserDetailsActivityComponent.UserDetailsActivityModule module);
}
