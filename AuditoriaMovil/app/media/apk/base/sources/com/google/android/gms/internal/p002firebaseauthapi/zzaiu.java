package com.google.android.gms.internal.p002firebaseauthapi;

import D.AbstractC0059i;
import com.google.android.gms.common.api.f;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaiu  reason: invalid package */
/* loaded from: classes.dex */
final class zzaiu extends zzaiq<Boolean> implements zzakn<Boolean>, RandomAccess {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzaiu(zArr, 0, false);
    }

    public zzaiu() {
        this(zza, 0, true);
    }

    private static int zzc(int i7) {
        return Math.max(((i7 * 3) / 2) + 1, 10);
    }

    private final String zzd(int i7) {
        return AbstractC0059i.x("Index:", i7, this.zzc, ", Size:");
    }

    private final void zze(int i7) {
        if (i7 >= 0 && i7 < this.zzc) {
            return;
        }
        throw new IndexOutOfBoundsException(zzd(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i7, Object obj) {
        int i8;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        if (i7 >= 0 && i7 <= (i8 = this.zzc)) {
            boolean[] zArr = this.zzb;
            if (i8 < zArr.length) {
                System.arraycopy(zArr, i7, zArr, i7 + 1, i8 - i7);
            } else {
                boolean[] zArr2 = new boolean[zzc(zArr.length)];
                System.arraycopy(this.zzb, 0, zArr2, 0, i7);
                System.arraycopy(this.zzb, i7, zArr2, i7 + 1, this.zzc - i7);
                this.zzb = zArr2;
            }
            this.zzb[i7] = booleanValue;
            this.zzc++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(zzd(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        zza();
        zzaki.zza(collection);
        if (!(collection instanceof zzaiu)) {
            return super.addAll(collection);
        }
        zzaiu zzaiuVar = (zzaiu) collection;
        int i7 = zzaiuVar.zzc;
        if (i7 == 0) {
            return false;
        }
        int i8 = this.zzc;
        if (f.API_PRIORITY_OTHER - i8 >= i7) {
            int i9 = i8 + i7;
            boolean[] zArr = this.zzb;
            if (i9 > zArr.length) {
                this.zzb = Arrays.copyOf(zArr, i9);
            }
            System.arraycopy(zzaiuVar.zzb, 0, this.zzb, this.zzc, zzaiuVar.zzc);
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
        if (!(obj instanceof zzaiu)) {
            return super.equals(obj);
        }
        zzaiu zzaiuVar = (zzaiu) obj;
        if (this.zzc != zzaiuVar.zzc) {
            return false;
        }
        boolean[] zArr = zzaiuVar.zzb;
        for (int i7 = 0; i7 < this.zzc; i7++) {
            if (this.zzb[i7] != zArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        return Boolean.valueOf(zzb(i7));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.zzc; i8++) {
            i7 = (i7 * 31) + zzaki.zza(this.zzb[i8]);
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.zzb[i7] == booleanValue) {
                return i7;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i7) {
        int i8;
        zza();
        zze(i7);
        boolean[] zArr = this.zzb;
        boolean z7 = zArr[i7];
        if (i7 < this.zzc - 1) {
            System.arraycopy(zArr, i7 + 1, zArr, i7, (i8 - i7) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        zza();
        if (i8 >= i7) {
            boolean[] zArr = this.zzb;
            System.arraycopy(zArr, i8, zArr, i7, this.zzc - i8);
            this.zzc -= i8 - i7;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zza();
        zze(i7);
        boolean[] zArr = this.zzb;
        boolean z7 = zArr[i7];
        zArr[i7] = booleanValue;
        return Boolean.valueOf(z7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
    public final /* synthetic */ zzakn<Boolean> zza(int i7) {
        if (i7 >= this.zzc) {
            return new zzaiu(i7 == 0 ? zza : Arrays.copyOf(this.zzb, i7), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzb(int i7) {
        zze(i7);
        return this.zzb[i7];
    }

    private zzaiu(boolean[] zArr, int i7, boolean z7) {
        super(z7);
        this.zzb = zArr;
        this.zzc = i7;
    }

    public final void zza(boolean z7) {
        zza();
        int i7 = this.zzc;
        boolean[] zArr = this.zzb;
        if (i7 == zArr.length) {
            boolean[] zArr2 = new boolean[zzc(zArr.length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, this.zzc);
            this.zzb = zArr2;
        }
        boolean[] zArr3 = this.zzb;
        int i8 = this.zzc;
        this.zzc = i8 + 1;
        zArr3[i8] = z7;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        zza(((Boolean) obj).booleanValue());
        return true;
    }
}
