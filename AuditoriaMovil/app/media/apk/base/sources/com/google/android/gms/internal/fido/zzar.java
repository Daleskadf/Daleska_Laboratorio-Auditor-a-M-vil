package com.google.android.gms.internal.fido;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
abstract class zzar extends zzcc {
    private final int zza;
    private int zzb;

    public zzar(int i7, int i8) {
        zzap.zzb(i8, i7, "index");
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.zzb < this.zza;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.zzb > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i7 = this.zzb;
            this.zzb = i7 + 1;
            return zza(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.zzb;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i7 = this.zzb - 1;
            this.zzb = i7;
            return zza(i7);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.zzb - 1;
    }

    public abstract Object zza(int i7);
}
