package com.google.android.gms.internal.mlkit_common;

import j$.util.Objects;
/* loaded from: classes.dex */
final class zzap extends zzaf {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc;

    public zzap(Object[] objArr, int i7, int i8) {
        this.zza = objArr;
        this.zzb = i7;
        this.zzc = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzt.zza(i7, this.zzc, "index");
        Object obj = this.zza[i7 + i7 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
