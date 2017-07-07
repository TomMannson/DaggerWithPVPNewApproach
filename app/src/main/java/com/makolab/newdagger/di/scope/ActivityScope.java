package com.makolab.newdagger.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by tomasz.krol on 2017-06-23.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ActivityScope {
}
