package com.dcrym.myview;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static Context mContext = null;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getApp(){
        return mContext;
    }
}
