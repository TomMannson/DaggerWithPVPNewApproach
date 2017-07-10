package com.makolab.newdagger.di.module.sub;

import com.makolab.newdagger.MainActivity;
import com.makolab.newdagger.ui.fragment.TestFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//import com.makolab.newdagger.di.component.sub.MainActivitySubcomponent;

/**
 * Created by tomasz.krol on 2017-07-06.
 */
@Module
public interface UserBindingModule {

    @ContributesAndroidInjector(modules = { /* modules to install into the subcomponent */})
    abstract MainActivity contributeYourActivityInjector();

    @ContributesAndroidInjector(modules = {})
    abstract TestFragment contributeTestInjector();
}
