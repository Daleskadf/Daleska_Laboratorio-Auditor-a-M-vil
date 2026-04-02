package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzakg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajv  reason: invalid package */
/* loaded from: classes.dex */
public final class zzajv {
    static final zzajv zza = new zzajv(true);
    private static volatile boolean zzb = false;
    private final Map<zzaju, zzakg.zzf<?, ?>> zzc;

    public zzajv() {
        this.zzc = new HashMap();
    }

    public static zzajv zza() {
        return zza;
    }

    public final <ContainingType extends zzaln> zzakg.zzf<ContainingType, ?> zza(ContainingType containingtype, int i7) {
        return (zzakg.zzf<ContainingType, ?>) this.zzc.get(new zzaju(containingtype, i7));
    }

    private zzajv(boolean z7) {
        this.zzc = Collections.emptyMap();
    }
}
