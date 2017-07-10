package com.makolab.newdagger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.makolab.newdagger.dependencies.Presenter1;
import com.makolab.newdagger.dependencies.UserRepository;
import com.makolab.newdagger.dependencies.base.UserActivity;
import com.makolab.newdagger.di.injector.UserInjection;
import com.makolab.newdagger.ui.fragment.TestFragment;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends UserActivity {

    @Inject
    Presenter1 presenter;

    @Inject
    UserRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(!super.checkLogIn()){
            return;
        }
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String textToShows = String.format("You are logged as %s", repository.getUserName());
        Toast.makeText(this, textToShows, Toast.LENGTH_LONG).show();

        getSupportFragmentManager()
                .beginTransaction()
                .add(new TestFragment(), "")
                .commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.action_logout) {

            super.logout();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
//        starter.putExtra();
        context.startActivity(starter);
    }
}
