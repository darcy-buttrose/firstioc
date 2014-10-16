package com.sample.firstioc.infrastructure;

import android.app.Application;

import roboguice.RoboGuice;

/**
 * Created by Darcy on 16/10/2014.
 */
public class IOCApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RoboGuice.setBaseApplicationInjector(this, RoboGuice.DEFAULT_STAGE, RoboGuice.newDefaultRoboModule(this), new IOCModule());
    }
}
