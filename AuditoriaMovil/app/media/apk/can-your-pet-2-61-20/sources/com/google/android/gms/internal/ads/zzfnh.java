package com.google.android.gms.internal.ads;

import com.distriqt.extension.inappbilling.controller.SubscriptionPhase;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzfnh {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(SubscriptionPhase.RECURRENCE_MODE_NONE);
    
    private final String zze;

    zzfnh(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
