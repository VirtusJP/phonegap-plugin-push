package com.adobe.phonegap.push;

import android.app.NotificationManager;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import android.content.ComponentName;

public class BackgroundActionButtonHandler extends WakefulBroadcastReceiver implements PushConstants {
    private static String LOG_TAG = "PushPlugin_BackgroundActionButtonHandler";

    @Override
    public void onReceive(Context context, Intent intent) {
        // Log.d(LOG_TAG, "BackgroundActionButtonHandler = " + extras);
        ComponentName comp = new ComponentName(context.getPackageName(), GCMIntentService.class.getName());
        startWakefulService(context, (intent.setComponent(comp)));
     }
}
