package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznr  reason: invalid package */
/* loaded from: classes.dex */
public final class zznr {
    public static final zznr zza = new zznq().zza();
    private final Map<String, String> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznr)) {
            return false;
        }
        return this.zzb.equals(((zznr) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }

    private zznr(Map<String, String> map) {
        this.zzb = map;
    }
}
