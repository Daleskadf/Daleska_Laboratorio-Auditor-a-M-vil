package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakj  reason: invalid package */
/* loaded from: classes.dex */
final class zzakj extends zzaiq<Integer> implements zzakn<Integer>, RandomAccess {
    private static final int[] zza;
    private int[] zzb;
    private int zzc;

    static {
        int[] iArr = new int[0];
        zza = iArr;
        new zzakj(iArr, 0, false);
    }

    public zzakj() {
        this(zza, 0, true);
    }

    private static int zze(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzf(int i7) {
        return AbstractC0059i.x("Index:", i7, this.zzc, ", Size:");
    }

    private final void zzg(int i7) {
        if (i7 >= 0 && i7 < this.zzc) {
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzc)) {
            int[] iArr = this.zzb;
            if (i8 < iArr.length) {
                System.arraycopy(iArr, i7, iArr, i7 + 1, i8 - i7);
            } else {
                int[] iArr2 = new int[zze(iArr.length)];
                System.arraycopy(this.zzb, 0, iArr2, 0, i7);
                System.arraycopy(this.zzb, i7, iArr2, i7 + 1, this.zzc - i7);
                this.zzb = iArr2;
            }
            this.zzb[i7] = intValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzf(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        zza();
        zzaki.zza(collection);
        if (!(collection instanceof zzakj)) {
            return super.addAll(collection);
        }
        zzakj zzakjVar = (zzakj) collection;
        int i7 = zzakjVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            int[] iArr = this.zzb;
            if (i9 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i9);
            }
            System.arraycopy(zzakjVar.zzb, 0, this.zzb, this.zzc, zzakjVar.zzc);
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
        if (!(obj instanceof zzakj)) {
            return super.equals(obj);
        }
        zzakj zzakjVar = (zzakj) obj;
        if (this.zzc != zzakjVar.zzc) {
            return false;
        }
        int[] iArr = zzakjVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Integer.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + this.zzb[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == intValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        int i8;
        zza();
        zzg(i7);
        int[] iArr = this.zzb;
        int i9 = iArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 >= i7) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i8, iArr, i7, this.zzc - i8);
            this.zzc -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzg(i7);
        int[] iArr = this.zzb;
        int i8 = iArr[i7];
        iArr[i7] = intValue;
        return Integer.valueOf(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn<Integer> zza(int i7) {
        int[] copyOf;
        if (i7 >= this.zzc) {
            if (i7 == 0) {
                copyOf = zza;
            } else {
                copyOf = Arrays.copyOf(this.zzb, i7);
            }
            return new zzakj(copyOf, this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final int zzb(int i7) {
        zzg(i7);
        return this.zzb[i7];
    }

    public final void zzc(int i7) {
        zza();
        int i8 = this.zzc;
        int[] iArr = this.zzb;
        if (i8 == iArr.length) {
            int[] iArr2 = new int[zze(iArr.length)];
            System.arraycopy(this.zzb, 0, iArr2, 0, this.zzc);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i9 = this.zzc;
        this.zzc = i9 + 1;
        iArr3[i9] = i7;
    }

    public final void zzd(int i7) {
        int[] iArr = this.zzb;
        if (i7 <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.zzb = new int[Math.max(i7, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i7) {
            length = zze(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzakj(int[] iArr, int i7, boolean z7) {
        super(z7);
        this.zzb = iArr;
        this.zzc = i7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zzc(((Integer) obj).intValue());
        return true;
    }
}
