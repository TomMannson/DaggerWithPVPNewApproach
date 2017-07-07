package com.makolab.newdagger.di.injector;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.makolab.newdagger.dependencies.UserController;

import static dagger.internal.Preconditions.checkNotNull;

/**
 * Created by tomasz.krol on 2017-07-07.
 */

public class UserInjection {

    public static void newUser(Context activity, String name, String password) {
        checkNotNull(activity, "activity");
        Application application = (Application) activity.getApplicationContext();
        if (!(application instanceof HasUserInjector)) {
            throw new RuntimeException(
                    String.format(
                            "%s does not implement %s",
                            application.getClass().getCanonicalName(),
                            HasUserInjector.class.getCanonicalName()));
        }

        UserController activityInjector =
                ((HasUserInjector) application).userContextInjector();
        checkNotNull(
                activityInjector,
                "%s.activityInjector() returned null",
                application.getClass().getCanonicalName());

        activityInjector.newUser(name, password);
    }

    public static boolean inject(Activity activity) {
        checkNotNull(activity, "activity");
        Application application = activity.getApplication();
        if (!(application instanceof HasUserInjector)) {
            throw new RuntimeException(
                    String.format(
                            "%s does not implement %s",
                            application.getClass().getCanonicalName(),
                            HasUserInjector.class.getCanonicalName()));
        }

        UserController userControler =
                ((HasUserInjector) application).userContextInjector();
        return userControler.injectUserScope(activity);
    }
}
