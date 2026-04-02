package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.Objects;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzay  reason: invalid package */
/* loaded from: classes.dex */
final class zzay extends zzaj<Object> {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzay(Object[] objArr, int i7, int i8) {
        this.zza = objArr;
        this.zzb = i7;
        this.zzc = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzw.zza(i7, this.zzc);
        Object obj = this.zza[(i7 * 2) + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzai
    public final boolean zze() {
        return true;
    }
}
