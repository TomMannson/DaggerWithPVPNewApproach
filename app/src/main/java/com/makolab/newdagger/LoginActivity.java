package com.makolab.newdagger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.makolab.newdagger.dependencies.Presenter1;
import com.makolab.newdagger.dependencies.Presenter2;
import com.makolab.newdagger.di.injector.UserInjection;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class LoginActivity extends AppCompatActivity {

    @Inject
    Presenter2 presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        .newUser(this);

        ((App)getApplication()).userController.logout();

        AndroidInjection.inject(this);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void login(View view) {

        String name = ((EditText)findViewById(R.id.et_user_name)).getText().toString();
        String password = ((EditText)findViewById(R.id.et_password)).getText().toString();

        UserInjection.newUser(this, name, password);
        MainActivity.start(this);
        finish();
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, LoginActivity.class);
        starter.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(starter);
    }

}
