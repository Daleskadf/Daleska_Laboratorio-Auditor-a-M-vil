package com.adobe.air;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public class FileChooserBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = FileChooserBroadcastReceiver.class.toString();

    public static native void SetFilename(String str);

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getExtras();
    }
}
