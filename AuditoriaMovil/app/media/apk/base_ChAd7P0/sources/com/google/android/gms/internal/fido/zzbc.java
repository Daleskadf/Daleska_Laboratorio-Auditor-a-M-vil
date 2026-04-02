package com.google.android.gms.internal.fido;

import java.util.Arrays;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class zzbc extends zzav implements Set {
    private transient zzaz zza;

    private static zzbc zzf(int i7, Object... objArr) {
        if (i7 != 0) {
            if (i7 != 1) {
                int zzh = zzh(i7);
                Object[] objArr2 = new Object[zzh];
                int i8 = zzh - 1;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < i7; i11++) {
                    Object obj = objArr[i11];
                    zzbq.zza(obj, i11);
                    int hashCode = obj.hashCode();
                    int zza = zzau.zza(hashCode);
                    while (true) {
                        int i12 = zza & i8;
                        Object obj2 = objArr2[i12];
                        if (obj2 == null) {
                            objArr[i10] = obj;
                            objArr2[i12] = obj;
                            i9 += hashCode;
                            i10++;
                            break;
                        } else if (!obj2.equals(obj)) {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i10, i7, (Object) null);
                if (i10 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzby(obj3);
                }
                if (zzh(i10) >= zzh / 2) {
                    if (i10 <= 0) {
                        objArr = Arrays.copyOf(objArr, i10);
                    }
                    return new zzbt(objArr, i9, objArr2, i8, i10);
                }
                return zzf(i10, objArr);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzby(obj4);
        }
        return zzbt.zza;
    }

    public static int zzh(int i7) {
        int max = Math.max(i7, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        } else if (max < 1073741824) {
            return 1073741824;
        } else {
            throw new IllegalArgumentException("collection too large");
        }
    }

    public static zzbc zzk(Object obj, Object obj2) {
        return zzf(2, obj, obj2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzbc) && zzg() && ((zzbc) obj).zzg() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbx.zza(this);
    }

    @Override // com.google.android.gms.internal.fido.zzav, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzcb iterator();

    public boolean zzg() {
        return false;
    }

    public zzaz zzi() {
        zzaz zzazVar = this.zza;
        if (zzazVar == null) {
            zzaz zzj = zzj();
            this.zza = zzj;
            return zzj;
        }
        return zzazVar;
    }

    public zzaz zzj() {
        Object[] array = toArray();
        int i7 = zzaz.zzd;
        return zzaz.zzh(array, array.length);
    }
}
