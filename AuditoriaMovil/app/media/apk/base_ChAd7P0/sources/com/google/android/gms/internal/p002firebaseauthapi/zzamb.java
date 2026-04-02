package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamb  reason: invalid package */
/* loaded from: classes.dex */
public final class zzamb<E> extends zzaiq<E> implements RandomAccess {
    private static final Object[] zza;
    private static final zzamb<Object> zzb;
    private E[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzamb<>(objArr, 0, false);
    }

    public zzamb() {
        this(zza, 0, true);
    }

    private static int zzb(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzc(int i7) {
        return AbstractC0059i.x("Index:", i7, this.zzd, ", Size:");
    }

    public static <E> zzamb<E> zzd() {
        return (zzamb<E>) zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final void add(int i7, E e7) {
        int i8;
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzd)) {
            E[] eArr = this.zzc;
            if (i8 < eArr.length) {
                System.arraycopy(eArr, i7, eArr, i7 + 1, i8 - i7);
            } else {
                E[] eArr2 = (E[]) new Object[zzb(eArr.length)];
                System.arraycopy(this.zzc, 0, eArr2, 0, i7);
                System.arraycopy(this.zzc, i7, eArr2, i7 + 1, this.zzd - i7);
                this.zzc = eArr2;
            }
            this.zzc[i7] = e7;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzc(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i7) {
        zzd(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E remove(int i7) {
        int i8;
        zza();
        zzd(i7);
        E[] eArr = this.zzc;
        E e7 = eArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(eArr, i7 + 1, eArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return e7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final E set(int i7, E e7) {
        zza();
        zzd(i7);
        E[] eArr = this.zzc;
        E e8 = eArr[i7];
        eArr[i7] = e7;
        ((AbstractList) this).modCount++;
        return e8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn zza(int i7) {
        Object[] copyOf;
        if (i7 >= this.zzd) {
            if (i7 == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzc, i7);
            }
            return new zzamb(copyOf, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzamb(E[] eArr, int i7, boolean z7) {
        super(z7);
        this.zzc = eArr;
        this.zzd = i7;
    }

    private final void zzd(int i7) {
        if (i7 < 0 || i7 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzc(i7));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e7) {
        zza();
        int i7 = this.zzd;
        E[] eArr = this.zzc;
        if (i7 == eArr.length) {
            this.zzc = (E[]) Arrays.copyOf(this.zzc, zzb(eArr.length));
        }
        E[] eArr2 = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        eArr2[i8] = e7;
        ((AbstractList) this).modCount++;
        return true;
    }
}
