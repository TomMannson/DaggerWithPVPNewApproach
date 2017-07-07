package com.makolab.newdagger.dependencies.impl;

import com.makolab.newdagger.dependencies.Presenter2;
import com.makolab.newdagger.dependencies.Synchronizer;

import javax.inject.Inject;

/**
 * Created by tomasz.krol on 2017-07-06.
 */

public class Presenter2Impl implements Presenter2 {

    private final Synchronizer synchroznizer;

    @Inject
    public Presenter2Impl(Synchronizer syncronizer){
        this.synchroznizer = syncronizer;
    }
}
