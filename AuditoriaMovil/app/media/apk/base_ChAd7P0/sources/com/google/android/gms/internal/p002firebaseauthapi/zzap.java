package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.pathprovider.b;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzap  reason: invalid package */
/* loaded from: classes.dex */
final class zzap {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzap(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        String valueOf3 = String.valueOf(this.zza);
        String valueOf4 = String.valueOf(this.zzc);
        StringBuilder l8 = b.l("Multiple entries with same key: ", valueOf, "=", valueOf2, " and ");
        l8.append(valueOf3);
        l8.append("=");
        l8.append(valueOf4);
        return new IllegalArgumentException(l8.toString());
    }
}
