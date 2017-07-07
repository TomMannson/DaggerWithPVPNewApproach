package com.makolab.newdagger.di.module;

import com.makolab.newdagger.dependencies.UserRepository;
import com.makolab.newdagger.dependencies.impl.UserRepositoryImpl;
import com.makolab.newdagger.di.scope.UserScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tomasz.krol on 2017-06-23.
 */
@Module
public class UserModule {

    UserRepository repository;

    public UserModule(UserRepository repository){
        this.repository = repository;
    }

    @Provides
    @UserScope
    UserRepository userRepo(){return repository;}
}
