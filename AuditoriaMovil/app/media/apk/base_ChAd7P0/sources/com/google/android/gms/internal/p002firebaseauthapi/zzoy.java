package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbo;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzoy  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zzoy<KeyT extends zzbo, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    public static <KeyT extends zzbo, PrimitiveT> zzoy<KeyT, PrimitiveT> zza(zzpa<KeyT, PrimitiveT> zzpaVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzpb(cls, cls2, zzpaVar);
    }

    public abstract PrimitiveT zza(KeyT keyt);

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }

    private zzoy(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
