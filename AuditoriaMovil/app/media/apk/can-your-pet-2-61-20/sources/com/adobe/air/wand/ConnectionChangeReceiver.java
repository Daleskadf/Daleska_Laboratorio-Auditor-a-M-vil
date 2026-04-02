package com.adobe.air.wand;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adobe.air.wand.connection.Connection;
/* loaded from: classes.dex */
public class ConnectionChangeReceiver extends BroadcastReceiver {
    private static Connection mWandConn;

    public static void resisterWandConnection(Connection connection) {
        mWandConn = connection;
    }

    public static void unresisterWandConnection() {
        mWandConn = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Connection connection = mWandConn;
        if (connection != null) {
            connection.onConnectionChanged();
        }
    }
}
