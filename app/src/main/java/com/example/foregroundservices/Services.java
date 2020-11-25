package com.example.foregroundservices;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

import java.security.Provider;

import static com.example.foregroundservices.App.CHANNEL_ID;

public class Services extends Service {

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String body = intent.getStringExtra("body");

        Intent intent1 = new Intent(this , MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this , 0 , intent1 , 0);
        Notification notification = new NotificationCompat.Builder(this , CHANNEL_ID)
                .setContentText(body)
                .setContentTitle("ForegroundServices")
                .setContentIntent(pendingIntent)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setSmallIcon(R.drawable.ic_baseline_chat_bubble_24).build();

        startForeground(1 , notification);

        return  START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
