package com.rishi.nomnom;

import android.app.Application;

import com.rishi.nomnom.di.AppComponent;
import com.rishi.nomnom.di.AppModule;
import com.rishi.nomnom.di.DaggerAppComponent;

/**
 * Created by rishi on 10/6/17.
 */

public class MainApp extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}

