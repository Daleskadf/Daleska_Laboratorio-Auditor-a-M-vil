package com.dexterous.flutterlocalnotifications;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel b(int i7, CharSequence charSequence, String str) {
        return new NotificationChannel(str, charSequence, i7);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel d(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannelGroup e(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ void k() {
    }
}
