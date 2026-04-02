package com.google.android.gms.internal.base;

import X.d;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes.dex */
public final class zao extends d {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i7;
        Intent registerReceiver;
        if (zan.zaa()) {
            if (true != zan.zaa()) {
                i7 = 0;
            } else {
                i7 = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i7);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
