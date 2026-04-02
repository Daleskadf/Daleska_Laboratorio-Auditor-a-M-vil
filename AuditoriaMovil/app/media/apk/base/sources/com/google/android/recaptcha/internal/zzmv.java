package com.google.android.recaptcha.internal;

import D.AbstractC0059i;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class zzmv extends zzkr implements RandomAccess, zznk, zzor {
    private static final float[] zza;
    private float[] zzb;
    private int zzc;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        new zzmv(fArr, 0, false);
    }

    public zzmv() {
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
        float floatValue = ((Float) obj).floatValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzc)) {
            int i9 = i7 + 1;
            float[] fArr = this.zzb;
            int length = fArr.length;
            if (i8 < length) {
                System.arraycopy(fArr, i7, fArr, i9, i8 - i7);
            } else {
                float[] fArr2 = new float[zzh(length)];
                System.arraycopy(this.zzb, 0, fArr2, 0, i7);
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zznl.zzb;
        collection.getClass();
        if (!(collection instanceof zzmv)) {
            return super.addAll(collection);
        }
        zzmv zzmvVar = (zzmv) collection;
        int i7 = zzmvVar.zzc;
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
            System.arraycopy(zzmvVar.zzb, 0, this.zzb, this.zzc, zzmvVar.zzc);
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
        if (!(obj instanceof zzmv)) {
            return super.equals(obj);
        }
        zzmv zzmvVar = (zzmv) obj;
        if (this.zzc != zzmvVar.zzc) {
            return false;
        }
        float[] fArr = zzmvVar.zzb;
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.Collection, java.util.List
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
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

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.List
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

    @Override // com.google.android.recaptcha.internal.zznk
    public final /* bridge */ /* synthetic */ zznk zzd(int i7) {
        float[] copyOf;
        if (i7 >= this.zzc) {
            if (i7 == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzb, i7);
            }
            return new zzmv(copyOf, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zze(int i7) {
        zzj(i7);
        return this.zzb[i7];
    }

    public final void zzf(float f) {
        zza();
        int i7 = this.zzc;
        int length = this.zzb.length;
        if (i7 == length) {
            float[] fArr = new float[zzh(length)];
            System.arraycopy(this.zzb, 0, fArr, 0, this.zzc);
            this.zzb = fArr;
        }
        float[] fArr2 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        fArr2[i8] = f;
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
        this.zzb = new float[Math.max(i7, 10)];
    }

    private zzmv(float[] fArr, int i7, boolean z7) {
        super(z7);
        this.zzb = fArr;
        this.zzc = i7;
    }

    @Override // com.google.android.recaptcha.internal.zzkr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Float) obj).floatValue());
        return true;
    }
}
