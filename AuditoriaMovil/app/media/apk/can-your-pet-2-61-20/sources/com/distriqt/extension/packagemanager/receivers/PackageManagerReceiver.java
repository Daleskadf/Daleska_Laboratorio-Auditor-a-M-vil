package com.distriqt.extension.packagemanager.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.distriqt.extension.packagemanager.PackageManagerExtension;
import com.distriqt.extension.packagemanager.events.PackageManagerEvent;
import com.distriqt.extension.packagemanager.utils.Logger;
/* loaded from: classes.dex */
public class PackageManagerReceiver extends BroadcastReceiver {
    public static final String TAG = "PackageManagerReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str = TAG;
        Logger.d(str, "onReceive( %s )", intent.getAction());
        try {
            if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                Logger.d(str, "onReceive(): %s", intent.getData().getSchemeSpecificPart().toString());
                processEvent(context, PackageManagerEvent.PACKAGE_REMOVED, PackageManagerEvent.formatForEvent(intent.getData().getSchemeSpecificPart().toString()));
            } else {
                intent.getAction().equals("android.intent.action.PACKAGE_ADDED");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void processEvent(Context context, String str, String str2) {
        if (PackageManagerExtension.context != null) {
            PackageManagerExtension.context.dispatchEvent(str, str2);
            return;
        }
        Logger.d(TAG, "Application not running - Store event for dispatch", new Object[0]);
        new PackageManagerNotificationStore(context).addNotificationForDispatch(str, str2);
    }
}
