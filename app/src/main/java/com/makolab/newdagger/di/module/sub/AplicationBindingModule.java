package com.makolab.newdagger.di.module.sub;

import com.makolab.newdagger.LoginActivity;
import com.makolab.newdagger.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//import com.makolab.newdagger.di.component.sub.MainActivitySubcomponent;

/**
 * Created by tomasz.krol on 2017-07-06.
 */

//@Module(subcomponents = MainActivitySubcomponent.class)
//public abstract class ActivityModule {
//
//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity>
//    bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);
//}

@Module
public interface AplicationBindingModule {

    @ContributesAndroidInjector(modules = { /* modules to install into the subcomponent */ })
    abstract LoginActivity contributeYourActivityInjector();
}
