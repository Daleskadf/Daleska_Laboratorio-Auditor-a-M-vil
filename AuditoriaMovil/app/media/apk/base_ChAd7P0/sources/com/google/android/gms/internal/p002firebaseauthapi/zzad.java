package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzad  reason: invalid package */
/* loaded from: classes.dex */
abstract class zzad<E> extends zzaz<E> {
    private final int zza;
    private int zzb;

    public zzad(int i7, int i8) {
        zzw.zzb(i8, i7);
        this.zza = i7;
        this.zzb = i8;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.zzb < this.zza) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.zzb > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
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
    public final E previous() {
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

    public abstract E zza(int i7);
}
