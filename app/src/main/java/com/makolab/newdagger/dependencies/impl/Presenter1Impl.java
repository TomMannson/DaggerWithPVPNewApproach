package com.makolab.newdagger.dependencies.impl;

import com.makolab.newdagger.dependencies.Interactor1;
import com.makolab.newdagger.dependencies.Presenter1;
import com.makolab.newdagger.dependencies.Synchronizer;

import javax.inject.Inject;

/**
 * Created by tomasz.krol on 2017-07-06.
 */

public class Presenter1Impl implements Presenter1 {

    private final Interactor1 interactor1;

    @Inject
    public Presenter1Impl(Interactor1 interactor1){
        this.interactor1 = interactor1;
    }
}
