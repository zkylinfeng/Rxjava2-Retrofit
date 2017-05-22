package com.android.zouky.mylibrary.base;

import android.app.Application;
import android.view.LayoutInflater;

import com.android.zouky.mylibrary.util.Static;

/**
 * Created by Administrator on 2017/5/18.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Static.context=this;
        Static.inflater= LayoutInflater.from(this);
    }
}
