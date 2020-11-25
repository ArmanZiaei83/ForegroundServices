package com.example.foregroundservices;

import android.app.Application;
import android.app.NotificationChannel;
import android.os.Build;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        createNotifChannel();
    }
    private void createNotifChannel(){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel notificationChannel =
        }
    }
}
