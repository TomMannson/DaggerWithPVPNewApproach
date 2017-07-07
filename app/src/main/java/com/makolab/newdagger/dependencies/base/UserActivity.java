package com.makolab.newdagger.dependencies.base;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.makolab.newdagger.LoginActivity;
import com.makolab.newdagger.R;
import com.makolab.newdagger.di.injector.UserInjection;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public class UserActivity extends AppCompatActivity {


    protected boolean checkLogIn() {

        if(!UserInjection.inject(this)){
            logout();
            return false;
        }
        return true;
    }


    public void logout() {
        LoginActivity.start(this);
        finish();
    }
}
