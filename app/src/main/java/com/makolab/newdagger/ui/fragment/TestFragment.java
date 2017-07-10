package com.makolab.newdagger.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.makolab.newdagger.dependencies.Presenter2;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

/**
 * Created by tomasz.krol on 2017-07-10.
 */

public class TestFragment extends DaggerFragment {

    @Inject
    Presenter2 presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
