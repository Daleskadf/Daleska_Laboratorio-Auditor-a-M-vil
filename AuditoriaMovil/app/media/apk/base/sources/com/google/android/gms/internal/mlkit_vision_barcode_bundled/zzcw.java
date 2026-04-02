package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import D.AbstractC0059i;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class zzcw extends zzcs implements RandomAccess, zzeo {
    private boolean[] zza;
    private int zzb;

    static {
        new zzcw(new boolean[0], 0, false);
    }

    public zzcw() {
        this(new boolean[10], 0, true);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzb)) {
            int i9 = i7 + 1;
            boolean[] zArr = this.zza;
            if (i8 < zArr.length) {
                System.arraycopy(zArr, i7, zArr, i9, i8 - i7);
            } else {
                boolean[] zArr2 = new boolean[Y.d(i8, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i7);
                System.arraycopy(this.zza, i7, zArr2, i9, this.zzb - i7);
                this.zza = zArr2;
            }
            this.zza[i7] = booleanValue;
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
        if (!(collection instanceof zzcw)) {
            return super.addAll(collection);
        }
        zzcw zzcwVar = (zzcw) collection;
        int i7 = zzcwVar.zzb;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzb;
        if (f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            boolean[] zArr = this.zza;
            if (i9 > zArr.length) {
                this.zza = Arrays.copyOf(zArr, i9);
            }
            System.arraycopy(zzcwVar.zza, 0, this.zza, this.zzb, zzcwVar.zzb);
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
        if (!(obj instanceof zzcw)) {
            return super.equals(obj);
        }
        zzcw zzcwVar = (zzcw) obj;
        if (this.zzb != zzcwVar.zzb) {
            return false;
        }
        boolean[] zArr = zzcwVar.zza;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            if (this.zza[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzh(i7);
        return Boolean.valueOf(this.zza[i7]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            i7 = (i7 * 31) + zzep.zza(this.zza[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zza[i8] == booleanValue) {
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
        boolean[] zArr = this.zza;
        boolean z7 = zArr[i7];
        if (i7 < this.zzb - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (i8 - i7) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 >= i7) {
            boolean[] zArr = this.zza;
            System.arraycopy(zArr, i8, zArr, i7, this.zzb - i8);
            this.zzb -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zzh(i7);
        boolean[] zArr = this.zza;
        boolean z7 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i7) {
        if (i7 >= this.zzb) {
            return new zzcw(Arrays.copyOf(this.zza, i7), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z7) {
        zza();
        int i7 = this.zzb;
        boolean[] zArr = this.zza;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[Y.d(i7, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i7);
            this.zza = zArr2;
        }
        boolean[] zArr3 = this.zza;
        int i8 = this.zzb;
        this.zzb = i8 + 1;
        zArr3[i8] = z7;
    }

    public final boolean zzf(int i7) {
        zzh(i7);
        return this.zza[i7];
    }

    private zzcw(boolean[] zArr, int i7, boolean z7) {
        super(z7);
        this.zza = zArr;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zze(((Boolean) obj).booleanValue());
        return true;
    }
}
