package com.google.android.gms.internal.maps;

import io.flutter.plugins.pathprovider.b;
import java.util.Arrays;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class zzba extends zzaw implements Set {
    private transient zzaz zza;

    public static int zzf(int i7) {
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

    @SafeVarargs
    public static zzba zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = {"ADMINISTRATIVE_AREA_LEVEL_1", "ADMINISTRATIVE_AREA_LEVEL_2", "COUNTRY", "LOCALITY", "POSTAL_CODE", "SCHOOL_DISTRICT"};
        System.arraycopy(objArr, 0, objArr2, 6, 0);
        return zzk(6, objArr2);
    }

    private static zzba zzk(int i7, Object... objArr) {
        if (i7 != 0) {
            if (i7 != 1) {
                int zzf = zzf(i7);
                Object[] objArr2 = new Object[zzf];
                int i8 = zzf - 1;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < i7; i11++) {
                    Object obj = objArr[i11];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int zza = zzav.zza(hashCode);
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
                    } else {
                        throw new NullPointerException(b.e(i11, "at index "));
                    }
                }
                Arrays.fill(objArr, i10, i7, (Object) null);
                if (i10 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzbe(obj3);
                }
                if (zzf(i10) >= zzf / 2) {
                    if (i10 < 4) {
                        objArr = Arrays.copyOf(objArr, i10);
                    }
                    return new zzbd(objArr, i9, objArr2, i8, i10);
                }
                return zzk(i10, objArr);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzbe(obj4);
        }
        return zzbd.zza;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzba) && zzj() && ((zzba) obj).zzj() && hashCode() != obj.hashCode()) {
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
        int i7;
        int i8 = 0;
        for (Object obj : this) {
            if (obj != null) {
                i7 = obj.hashCode();
            } else {
                i7 = 0;
            }
            i8 += i7;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.maps.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zzd */
    public abstract zzbf iterator();

    public final zzaz zzg() {
        zzaz zzazVar = this.zza;
        if (zzazVar == null) {
            zzaz zzh = zzh();
            this.zza = zzh;
            return zzh;
        }
        return zzazVar;
    }

    public zzaz zzh() {
        Object[] array = toArray();
        int i7 = zzaz.zzd;
        return zzaz.zzg(array, array.length);
    }

    public boolean zzj() {
        return false;
    }
}
