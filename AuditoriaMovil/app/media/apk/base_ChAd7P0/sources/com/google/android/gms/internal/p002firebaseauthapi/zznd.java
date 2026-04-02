package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpq;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznd  reason: invalid package */
/* loaded from: classes.dex */
public abstract class zznd<SerializationT extends zzpq> {
    private final zzzn zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzpq> zznd<SerializationT> zza(zznf<SerializationT> zznfVar, zzzn zzznVar, Class<SerializationT> cls) {
        return new zznc(zzznVar, cls, zznfVar);
    }

    public abstract zzbo zza(SerializationT serializationt, zzcm zzcmVar);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zznd(zzzn zzznVar, Class<SerializationT> cls) {
        this.zza = zzznVar;
        this.zzb = cls;
    }

    public final zzzn zza() {
        return this.zza;
    }
}
