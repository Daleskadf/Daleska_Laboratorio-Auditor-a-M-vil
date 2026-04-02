package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzks {
    final String zza;
    long zzb;

    private zzks(zzkt zzktVar, String str) {
        this.zza = str;
        this.zzb = zzktVar.zzav().elapsedRealtime();
    }
}
