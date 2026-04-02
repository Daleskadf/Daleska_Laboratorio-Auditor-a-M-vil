package com.google.android.recaptcha.internal;

import D.AbstractC0059i;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class zzmi extends zzkr implements RandomAccess, zznk, zzor {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzmi(dArr, 0, false);
    }

    public zzmi() {
        this(zza, 0, true);
    }

    private static int zzh(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzi(int i7) {
        return AbstractC0059i.x("Index:", i7, this.zzc, ", Size:");
    }

    private final void zzj(int i7) {
        if (i7 >= 0 && i7 < this.zzc) {
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i7));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzc)) {
            int i9 = i7 + 1;
            double[] dArr = this.zzb;
            int length = dArr.length;
            if (i8 < length) {
                System.arraycopy(dArr, i7, dArr, i9, i8 - i7);
            } else {
                double[] dArr2 = new double[zzh(length)];
                System.arraycopy(this.zzb, 0, dArr2, 0, i7);
                System.arraycopy(this.zzb, i7, dArr2, i9, this.zzc - i7);
                this.zzb = dArr2;
            }
            this.zzb[i7] = doubleValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i7));
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzmi)) {
            return super.addAll(collection);
        }
        zzmi zzmiVar = (zzmi) collection;
        int i7 = zzmiVar.zzc;
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
            System.arraycopy(zzmiVar.zzb, 0, this.zzb, this.zzc, zzmiVar.zzc);
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzmi)) {
            return super.equals(obj);
        }
        zzmi zzmiVar = (zzmi) obj;
        if (this.zzc != zzmiVar.zzc) {
            return false;
        }
        double[] dArr = zzmiVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Double.doubleToLongBits(this.zzb[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzj(i7);
        return Double.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zzb[i8]);
            byte[] bArr = zznl.zzb;
            i7 = (i7 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i7 = this.zzc;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzb[i8] == doubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        int i8;
        zza();
        zzj(i7);
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzj(i7);
        double[] dArr = this.zzb;
        double d7 = dArr[i7];
        dArr[i7] = doubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i7) {
        double[] copyOf;
        if (i7 >= this.zzc) {
            if (i7 == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzb, i7);
            }
            return new zzmi(copyOf, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i7) {
        zzj(i7);
        return this.zzb[i7];
    }

    public final void zzf(double d7) {
        zza();
        int i7 = this.zzc;
        int length = this.zzb.length;
        if (i7 == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        dArr2[i8] = d7;
    }

    public final void zzg(int i7) {
        int length = this.zzb.length;
        if (i7 <= length) {
            return;
        }
        if (length != 0) {
            while (length < i7) {
                length = zzh(length);
            }
            this.zzb = Arrays.copyOf(this.zzb, length);
            return;
        }
        this.zzb = new double[Math.max(i7, 10)];
    }

    private zzmi(double[] dArr, int i7, boolean z7) {
        super(z7);
        this.zzb = dArr;
        this.zzc = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
