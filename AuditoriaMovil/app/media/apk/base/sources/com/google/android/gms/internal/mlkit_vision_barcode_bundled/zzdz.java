package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import D.AbstractC0059i;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdz extends zzcs implements RandomAccess, zzem {
    private static final zzdz zza = new zzdz(new float[0], 0, false);
    private float[] zzb;
    private int zzc;

    public zzdz() {
        this(new float[10], 0, true);
    }

    public static zzdz zzf() {
        return zza;
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzc)) {
            int i9 = i7 + 1;
            float[] fArr = this.zzb;
            if (i8 < fArr.length) {
                System.arraycopy(fArr, i7, fArr, i9, i8 - i7);
            } else {
                float[] fArr2 = new float[Y.d(i8, 3, 2, 1)];
                System.arraycopy(fArr, 0, fArr2, 0, i7);
                System.arraycopy(this.zzb, i7, fArr2, i9, this.zzc - i7);
                this.zzb = fArr2;
            }
            this.zzb[i7] = floatValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzi(i7));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzep.zzb;
        collection.getClass();
        if (!(collection instanceof zzdz)) {
            return super.addAll(collection);
        }
        zzdz zzdzVar = (zzdz) collection;
        int i7 = zzdzVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            float[] fArr = this.zzb;
            if (i9 > fArr.length) {
                this.zzb = Arrays.copyOf(fArr, i9);
            }
            System.arraycopy(zzdzVar.zzb, 0, this.zzb, this.zzc, zzdzVar.zzc);
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

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdz)) {
            return super.equals(obj);
        }
        zzdz zzdzVar = (zzdz) obj;
        if (this.zzc != zzdzVar.zzc) {
            return false;
        }
        float[] fArr = zzdzVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (Float.floatToIntBits(this.zzb[i7]) != Float.floatToIntBits(fArr[i7])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzj(i7);
        return Float.valueOf(this.zzb[i7]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + Float.floatToIntBits(this.zzb[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i7 = this.zzc;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zzb[i8] == floatValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        int i8;
        zza();
        zzj(i7);
        float[] fArr = this.zzb;
        float f = fArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(fArr, i7 + 1, fArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 >= i7) {
            float[] fArr = this.zzb;
            System.arraycopy(fArr, i8, fArr, i7, this.zzc - i8);
            this.zzc -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zza();
        zzj(i7);
        float[] fArr = this.zzb;
        float f = fArr[i7];
        fArr[i7] = floatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    public final float zze(int i7) {
        zzj(i7);
        return this.zzb[i7];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    /* renamed from: zzg */
    public final zzem zzd(int i7) {
        if (i7 >= this.zzc) {
            return new zzdz(Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzem
    public final void zzh(float f) {
        zza();
        int i7 = this.zzc;
        float[] fArr = this.zzb;
        if (i7 == fArr.length) {
            float[] fArr2 = new float[Y.d(i7, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i7);
            this.zzb = fArr2;
        }
        float[] fArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        fArr3[i8] = f;
    }

    private zzdz(float[] fArr, int i7, boolean z7) {
        super(z7);
        this.zzb = fArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzh(((Float) obj).floatValue());
        return true;
    }
}
