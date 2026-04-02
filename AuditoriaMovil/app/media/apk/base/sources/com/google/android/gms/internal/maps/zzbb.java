package com.google.android.gms.internal.maps;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
final class zzbb extends zzbf {
    boolean zza;
    final /* synthetic */ Object zzb;

    public zzbb(Object obj) {
        this.zzb = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zza;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zza) {
            this.zza = true;
            return this.zzb;
        }
        throw new NoSuchElementException();
    }
}
