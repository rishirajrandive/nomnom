package com.rishi.nomnom.di;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by rishi on 10/6/17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
}
