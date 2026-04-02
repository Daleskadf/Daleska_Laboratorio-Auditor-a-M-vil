package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import D.AbstractC0059i;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class zzdp extends zzcs implements RandomAccess, zzeo {
    private double[] zza;
    private int zzb;

    static {
        new zzdp(new double[0], 0, false);
    }

    public zzdp() {
        this(new double[10], 0, true);
    }

    private final String zzg(int i7) {
        return AbstractC0059i.x("Index:", i7, this.zzb, ", Size:");
    }

    private final void zzh(int i7) {
        if (i7 >= 0 && i7 < this.zzb) {
            return;
        }
        throw new IndexOutOfBoundsException(zzg(i7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzb)) {
            int i9 = i7 + 1;
            double[] dArr = this.zza;
            if (i8 < dArr.length) {
                System.arraycopy(dArr, i7, dArr, i9, i8 - i7);
            } else {
                double[] dArr2 = new double[Y.d(i8, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i7);
                System.arraycopy(this.zza, i7, dArr2, i9, this.zzb - i7);
                this.zza = dArr2;
            }
            this.zza[i7] = doubleValue;
            this.zzb++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzg(i7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzdp)) {
            return super.addAll(collection);
        }
        zzdp zzdpVar = (zzdp) collection;
        int i7 = zzdpVar.zzb;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzb;
        if (f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            double[] dArr = this.zza;
            if (i9 > dArr.length) {
                this.zza = Arrays.copyOf(dArr, i9);
            }
            System.arraycopy(zzdpVar.zza, 0, this.zza, this.zzb, zzdpVar.zzb);
            this.zzb = i9;
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdp)) {
            return super.equals(obj);
        }
        zzdp zzdpVar = (zzdp) obj;
        if (this.zzb != zzdpVar.zzb) {
            return false;
        }
        double[] dArr = zzdpVar.zza;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            if (Double.doubleToLongBits(this.zza[i7]) != Double.doubleToLongBits(dArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzh(i7);
        return Double.valueOf(this.zza[i7]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zza[i8]);
            byte[] bArr = zzep.zzb;
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
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zza[i8] == doubleValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        int i8;
        zza();
        zzh(i7);
        double[] dArr = this.zza;
        double d7 = dArr[i7];
        if (i7 < this.zzb - 1) {
            System.arraycopy(dArr, i7 + 1, dArr, i7, (i8 - i7) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 >= i7) {
            double[] dArr = this.zza;
            System.arraycopy(dArr, i8, dArr, i7, this.zzb - i8);
            this.zzb -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zza();
        zzh(i7);
        double[] dArr = this.zza;
        double d7 = dArr[i7];
        dArr[i7] = doubleValue;
        return Double.valueOf(d7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i7) {
        if (i7 >= this.zzb) {
            return new zzdp(Arrays.copyOf(this.zza, i7), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i7) {
        zzh(i7);
        return this.zza[i7];
    }

    public final void zzf(double d7) {
        zza();
        int i7 = this.zzb;
        double[] dArr = this.zza;
        if (i7 == dArr.length) {
            double[] dArr2 = new double[Y.d(i7, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i7);
            this.zza = dArr2;
        }
        double[] dArr3 = this.zza;
        int i8 = this.zzb;
        this.zzb = i8 + 1;
        dArr3[i8] = d7;
    }

    private zzdp(double[] dArr, int i7, boolean z7) {
        super(z7);
        this.zza = dArr;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
