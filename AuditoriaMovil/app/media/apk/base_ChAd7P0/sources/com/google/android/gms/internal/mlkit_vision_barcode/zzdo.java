package com.google.android.gms.internal.mlkit_vision_barcode;

import j$.util.Objects;
/* loaded from: classes.dex */
final class zzdo extends zzcs {
    private final transient Object[] zza;
    private final transient int zzb;
    private final transient int zzc = 1;

    public zzdo(Object[] objArr, int i7, int i8) {
        this.zza = objArr;
        this.zzb = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        zzaz.zza(i7, this.zzc, "index");
        Object obj = this.zza[i7 + i7 + this.zzb];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }
}
