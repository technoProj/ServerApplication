package com.example.gilkr.serverapplication;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by gilkr on 10/5/2017.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this);
    }
}
