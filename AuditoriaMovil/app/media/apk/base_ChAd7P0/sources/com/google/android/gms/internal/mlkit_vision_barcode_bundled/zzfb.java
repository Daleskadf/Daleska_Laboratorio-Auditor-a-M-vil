package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import D.AbstractC0059i;
import androidx.datastore.preferences.protobuf.Y;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class zzfb extends zzcs implements RandomAccess, zzeo {
    private long[] zza;
    private int zzb;

    static {
        new zzfb(new long[0], 0, false);
    }

    public zzfb() {
        this(new long[10], 0, true);
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
        long longValue = ((Long) obj).longValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzb)) {
            int i9 = i7 + 1;
            long[] jArr = this.zza;
            if (i8 < jArr.length) {
                System.arraycopy(jArr, i7, jArr, i9, i8 - i7);
            } else {
                long[] jArr2 = new long[Y.d(i8, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i7);
                System.arraycopy(this.zza, i7, jArr2, i9, this.zzb - i7);
                this.zza = jArr2;
            }
            this.zza[i7] = longValue;
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
        if (!(collection instanceof zzfb)) {
            return super.addAll(collection);
        }
        zzfb zzfbVar = (zzfb) collection;
        int i7 = zzfbVar.zzb;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzb;
        if (f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            long[] jArr = this.zza;
            if (i9 > jArr.length) {
                this.zza = Arrays.copyOf(jArr, i9);
            }
            System.arraycopy(zzfbVar.zza, 0, this.zza, this.zzb, zzfbVar.zzb);
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
        if (!(obj instanceof zzfb)) {
            return super.equals(obj);
        }
        zzfb zzfbVar = (zzfb) obj;
        if (this.zzb != zzfbVar.zzb) {
            return false;
        }
        long[] jArr = zzfbVar.zza;
        for (int i7 = 0; i7 < this.zzb; i7++) {
            if (this.zza[i7] != jArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        zzh(i7);
        return Long.valueOf(this.zza[i7]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzb; i8++) {
            long j = this.zza[i8];
            byte[] bArr = zzep.zzb;
            i7 = (i7 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            if (this.zza[i8] == longValue) {
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
        long[] jArr = this.zza;
        long j = jArr[i7];
        if (i7 < this.zzb - 1) {
            System.arraycopy(jArr, i7 + 1, jArr, i7, (i8 - i7) - 1);
        }
        this.zzb--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 >= i7) {
            long[] jArr = this.zza;
            System.arraycopy(jArr, i8, jArr, i7, this.zzb - i8);
            this.zzb -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        long longValue = ((Long) obj).longValue();
        zza();
        zzh(i7);
        long[] jArr = this.zza;
        long j = jArr[i7];
        jArr[i7] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo
    public final /* bridge */ /* synthetic */ zzeo zzd(int i7) {
        if (i7 >= this.zzb) {
            return new zzfb(Arrays.copyOf(this.zza, i7), this.zzb, true);
        }
        throw new IllegalArgumentException();
    }

    public final long zze(int i7) {
        zzh(i7);
        return this.zza[i7];
    }

    public final void zzf(long j) {
        zza();
        int i7 = this.zzb;
        long[] jArr = this.zza;
        if (i7 == jArr.length) {
            long[] jArr2 = new long[Y.d(i7, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i7);
            this.zza = jArr2;
        }
        long[] jArr3 = this.zza;
        int i8 = this.zzb;
        this.zzb = i8 + 1;
        jArr3[i8] = j;
    }

    private zzfb(long[] jArr, int i7, boolean z7) {
        super(z7);
        this.zza = jArr;
        this.zzb = i7;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzcs, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Long) obj).longValue());
        return true;
    }
}
