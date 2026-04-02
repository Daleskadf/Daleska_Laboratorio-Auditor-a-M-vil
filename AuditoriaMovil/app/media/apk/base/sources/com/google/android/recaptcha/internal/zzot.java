package com.google.android.recaptcha.internal;

import D.AbstractC0059i;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzot extends zzkr implements RandomAccess {
    private static final Object[] zza;
    private static final zzot zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzot(objArr, 0, false);
    }

    public zzot() {
        this(zza, 0, true);
    }

    public static zzot zze() {
        return zzb;
    }

    private static int zzg(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzh(int i7) {
        return AbstractC0059i.x("Index:", i7, this.zzd, ", Size:");
    }

    private final void zzi(int i7) {
        if (i7 >= 0 && i7 < this.zzd) {
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i7));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzd)) {
            int i9 = i7 + 1;
            Object[] objArr = this.zzc;
            int length = objArr.length;
            if (i8 < length) {
                System.arraycopy(objArr, i7, objArr, i9, i8 - i7);
            } else {
                Object[] objArr2 = new Object[zzg(length)];
                System.arraycopy(this.zzc, 0, objArr2, 0, i7);
                System.arraycopy(this.zzc, i7, objArr2, i9, this.zzd - i7);
                this.zzc = objArr2;
            }
            this.zzc[i7] = obj;
            this.zzd++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzh(i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        zzi(i7);
        return this.zzc[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        zza();
        zzi(i7);
        Object[] objArr = this.zzc;
        Object obj = objArr[i7];
        if (i7 < this.zzd - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i8 - i7) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        zza();
        zzi(i7);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i7) {
        Object[] copyOf;
        if (i7 >= this.zzd) {
            if (i7 == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzc, i7);
            }
            return new zzot(copyOf, this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i7) {
        int length = this.zzc.length;
        if (i7 <= length) {
            return;
        }
        if (length != 0) {
            while (length < i7) {
                length = zzg(length);
            }
            this.zzc = Arrays.copyOf(this.zzc, length);
            return;
        }
        this.zzc = new Object[Math.max(i7, 10)];
    }

    private zzot(Object[] objArr, int i7, boolean z7) {
        super(z7);
        this.zzc = objArr;
        this.zzd = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i7 = this.zzd;
        int length = this.zzc.length;
        if (i7 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzg(length));
        }
        Object[] objArr = this.zzc;
        int i8 = this.zzd;
        this.zzd = i8 + 1;
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
