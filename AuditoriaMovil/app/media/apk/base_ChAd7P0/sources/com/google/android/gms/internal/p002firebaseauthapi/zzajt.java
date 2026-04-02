package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajt  reason: invalid package */
/* loaded from: classes.dex */
final class zzajt extends zzaiq<Double> implements zzakn<Double>, RandomAccess {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzajt(dArr, 0, false);
    }

    public zzajt() {
        this(zza, 0, true);
    }

    private static int zzd(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zze(int i7) {
        return AbstractC0059i.x("Index:", i7, this.zzc, ", Size:");
    }

    private final void zzf(int i7) {
        if (i7 >= 0 && i7 < this.zzc) {
            return;
        }
        throw new IndexOutOfBoundsException(zze(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzc)) {
            double[] dArr = this.zzb;
            if (i8 < dArr.length) {
                System.arraycopy(dArr, i7, dArr, i7 + 1, i8 - i7);
            } else {
                double[] dArr2 = new double[zzd(dArr.length)];
                System.arraycopy(this.zzb, 0, dArr2, 0, i7);
                System.arraycopy(this.zzb, i7, dArr2, i7 + 1, this.zzc - i7);
                this.zzb = dArr2;
            }
            this.zzb[i7] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zze(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        zza();
        zzaki.zza(collection);
        if (!(collection instanceof zzajt)) {
            return super.addAll(collection);
        }
        zzajt zzajtVar = (zzajt) collection;
        int i7 = zzajtVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            double[] dArr = this.zzb;
            if (i9 > dArr.length) {
                this.zzb = Arrays.copyOf(dArr, i9);
            }
            System.arraycopy(zzajtVar.zzb, 0, this.zzb, this.zzc, zzajtVar.zzc);
            this.zzc = i9;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzajt)) {
            return super.equals(obj);
        }
        zzajt zzajtVar = (zzajt) obj;
        if (this.zzc != zzajtVar.zzc) {
            return false;
        }
        double[] dArr = zzajtVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Double.doubleToLongBits(this.zzb[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Double.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + zzaki.zza(Double.doubleToLongBits(this.zzb[i8]));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == doubleValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        int i8;
        zza();
        zzf(i7);
        double[] dArr = this.zzb;
        double d7 = dArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 >= i7) {
            double[] dArr = this.zzb;
            System.arraycopy(dArr, i8, dArr, i7, this.zzc - i8);
            this.zzc -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzf(i7);
        double[] dArr = this.zzb;
        double d7 = dArr[i7];
        dArr[i7] = doubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn<Double> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzajt(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzb(int i7) {
        zzf(i7);
        return this.zzb[i7];
    }

    public final void zzc(int i7) {
        double[] dArr = this.zzb;
        if (i7 <= dArr.length) {
            return;
        }
        if (dArr.length == 0) {
            this.zzb = new double[Math.max(i7, 10)];
            return;
        }
        int length = dArr.length;
        while (length < i7) {
            length = zzd(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzajt(double[] dArr, int i7, boolean z7) {
        super(z7);
        this.zzb = dArr;
        this.zzc = i7;
    }

    public final void zza(double d7) {
        zza();
        int i7 = this.zzc;
        double[] dArr = this.zzb;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[zzd(dArr.length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, this.zzc);
            this.zzb = dArr2;
        }
        double[] dArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        dArr3[i8] = d7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Double) obj).doubleValue());
        return true;
    }
}
