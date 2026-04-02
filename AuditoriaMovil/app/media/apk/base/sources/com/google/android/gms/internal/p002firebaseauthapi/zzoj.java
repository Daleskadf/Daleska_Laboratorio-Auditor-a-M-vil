package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoj  reason: invalid package */
/* loaded from: classes.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj();
    private static final zzoi zzb = new zzoi();
    private final AtomicReference<zzns> zzc = new AtomicReference<>();

    public static zzoj zzb() {
        return zza;
    }

    public final zzns zza() {
        zzns zznsVar = this.zzc.get();
        if (zznsVar == null) {
            return zzb;
        }
        return zznsVar;
    }
}
