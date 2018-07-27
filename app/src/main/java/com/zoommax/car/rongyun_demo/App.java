package com.zoommax.car.rongyun_demo;

import android.app.Application;

import io.rong.imkit.RongIM;

/**
 * 作者: CoolTone
 * 描述: App初始化
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RongIM.init(this);
    }
}
