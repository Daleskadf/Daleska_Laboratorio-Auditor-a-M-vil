package com.google.android.gms.internal.mlkit_vision_barcode;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzci extends AbstractMap implements Serializable {
    private static final Object zzd = new Object();
    transient int[] zza;
    transient Object[] zzb;
    transient Object[] zzc;
    private transient Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient Set zzh;
    private transient Set zzi;
    private transient Collection zzj;

    public zzci() {
        zzp(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] zzA() {
        int[] iArr = this.zza;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzB() {
        Object[] objArr = this.zzb;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] zzC() {
        Object[] objArr = this.zzc;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public static /* synthetic */ Object zzg(zzci zzciVar, int i7) {
        return zzciVar.zzB()[i7];
    }

    public static /* synthetic */ Object zzi(zzci zzciVar) {
        Object obj = zzciVar.zze;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static /* synthetic */ Object zzj(zzci zzciVar, int i7) {
        return zzciVar.zzC()[i7];
    }

    public static /* synthetic */ void zzn(zzci zzciVar, int i7, Object obj) {
        zzciVar.zzC()[i7] = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzv() {
        return (1 << (this.zzf & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zzw(Object obj) {
        if (zzr()) {
            return -1;
        }
        int zza = zzck.zza(obj);
        int zzv = zzv();
        Object obj2 = this.zze;
        Objects.requireNonNull(obj2);
        int zzc = zzcj.zzc(obj2, zza & zzv);
        if (zzc == 0) {
            return -1;
        }
        int i7 = ~zzv;
        int i8 = zza & i7;
        do {
            int i9 = zzc - 1;
            int i10 = zzA()[i9];
            if ((i10 & i7) == i8 && zzax.zza(obj, zzB()[i9])) {
                return i9;
            }
            zzc = i10 & zzv;
        } while (zzc != 0);
        return -1;
    }

    private final int zzx(int i7, int i8, int i9, int i10) {
        int i11 = i8 - 1;
        Object zzd2 = zzcj.zzd(i8);
        if (i10 != 0) {
            zzcj.zze(zzd2, i9 & i11, i10 + 1);
        }
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        for (int i12 = 0; i12 <= i7; i12++) {
            int zzc = zzcj.zzc(obj, i12);
            while (zzc != 0) {
                int i13 = zzc - 1;
                int i14 = zzA[i13];
                int i15 = ((~i7) & i14) | i12;
                int i16 = i15 & i11;
                int zzc2 = zzcj.zzc(zzd2, i16);
                zzcj.zze(zzd2, i16, zzc);
                zzA[i13] = ((~i11) & i15) | (zzc2 & i11);
                zzc = i14 & i7;
            }
        }
        this.zze = zzd2;
        zzz(i11);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzy(Object obj) {
        if (!zzr()) {
            int zzv = zzv();
            Object obj2 = this.zze;
            Objects.requireNonNull(obj2);
            int zzb = zzcj.zzb(obj, null, zzv, obj2, zzA(), zzB(), null);
            if (zzb != -1) {
                Object obj3 = zzC()[zzb];
                zzq(zzb, zzv);
                this.zzg--;
                zzo();
                return obj3;
            }
        }
        return zzd;
    }

    private final void zzz(int i7) {
        this.zzf = ((32 - Integer.numberOfLeadingZeros(i7)) & 31) | (this.zzf & (-32));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (zzr()) {
            return;
        }
        zzo();
        Map zzl = zzl();
        if (zzl != null) {
            this.zzf = zzdw.zza(size(), 3, 1073741823);
            zzl.clear();
            this.zze = null;
            this.zzg = 0;
            return;
        }
        Arrays.fill(zzB(), 0, this.zzg, (Object) null);
        Arrays.fill(zzC(), 0, this.zzg, (Object) null);
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(zzA(), 0, this.zzg, 0);
        this.zzg = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.containsKey(obj);
        }
        if (zzw(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map zzl = zzl();
        if (zzl == null) {
            for (int i7 = 0; i7 < this.zzg; i7++) {
                if (zzax.zza(obj, zzC()[i7])) {
                    return true;
                }
            }
            return false;
        }
        return zzl.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.zzi;
        if (set == null) {
            zzcc zzccVar = new zzcc(this);
            this.zzi = zzccVar;
            return zzccVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.get(obj);
        }
        int zzw = zzw(obj);
        if (zzw == -1) {
            return null;
        }
        return zzC()[zzw];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.zzh;
        if (set == null) {
            zzcf zzcfVar = new zzcf(this);
            this.zzh = zzcfVar;
            return zzcfVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (zzr()) {
            zzaz.zzf(zzr(), "Arrays already allocated");
            int i7 = this.zzf;
            int max = Math.max(i7 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.zze = zzcj.zzd(max2);
            zzz(max2 - 1);
            this.zza = new int[i7];
            this.zzb = new Object[i7];
            this.zzc = new Object[i7];
        }
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.put(obj, obj2);
        }
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int i8 = this.zzg;
        int i9 = i8 + 1;
        int zza = zzck.zza(obj);
        int zzv = zzv();
        int i10 = zza & zzv;
        Object obj3 = this.zze;
        Objects.requireNonNull(obj3);
        int zzc = zzcj.zzc(obj3, i10);
        if (zzc == 0) {
            if (i9 > zzv) {
                zzv = zzx(zzv, zzcj.zza(zzv), zza, i8);
            } else {
                Object obj4 = this.zze;
                Objects.requireNonNull(obj4);
                zzcj.zze(obj4, i10, i9);
            }
        } else {
            int i11 = ~zzv;
            int i12 = zza & i11;
            int i13 = 0;
            while (true) {
                int i14 = zzc - 1;
                int i15 = zzA[i14];
                int i16 = i15 & i11;
                if (i16 == i12 && zzax.zza(obj, zzB[i14])) {
                    Object obj5 = zzC[i14];
                    zzC[i14] = obj2;
                    return obj5;
                }
                int i17 = i15 & zzv;
                i13++;
                if (i17 == 0) {
                    if (i13 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(zzv() + 1, 1.0f);
                        int zze = zze();
                        while (zze >= 0) {
                            linkedHashMap.put(zzB()[zze], zzC()[zze]);
                            zze = zzf(zze);
                        }
                        this.zze = linkedHashMap;
                        this.zza = null;
                        this.zzb = null;
                        this.zzc = null;
                        zzo();
                        return linkedHashMap.put(obj, obj2);
                    } else if (i9 > zzv) {
                        zzv = zzx(zzv, zzcj.zza(zzv), zza, i8);
                    } else {
                        zzA[i14] = (i9 & zzv) | i16;
                    }
                } else {
                    zzc = i17;
                }
            }
        }
        int length = zzA().length;
        if (i9 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.zza = Arrays.copyOf(zzA(), min);
            this.zzb = Arrays.copyOf(zzB(), min);
            this.zzc = Arrays.copyOf(zzC(), min);
        }
        zzA()[i8] = (~zzv) & zza;
        zzB()[i8] = obj;
        zzC()[i8] = obj2;
        this.zzg = i9;
        zzo();
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.remove(obj);
        }
        Object zzy = zzy(obj);
        if (zzy == zzd) {
            return null;
        }
        return zzy;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map zzl = zzl();
        if (zzl != null) {
            return zzl.size();
        }
        return this.zzg;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.zzj;
        if (collection == null) {
            zzch zzchVar = new zzch(this);
            this.zzj = zzchVar;
            return zzchVar;
        }
        return collection;
    }

    public final int zze() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public final int zzf(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.zzg) {
            return i8;
        }
        return -1;
    }

    public final Map zzl() {
        Object obj = this.zze;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void zzo() {
        this.zzf += 32;
    }

    public final void zzp(int i7) {
        this.zzf = zzdw.zza(i7, 1, 1073741823);
    }

    public final void zzq(int i7, int i8) {
        Object obj = this.zze;
        Objects.requireNonNull(obj);
        int[] zzA = zzA();
        Object[] zzB = zzB();
        Object[] zzC = zzC();
        int size = size();
        int i9 = size - 1;
        if (i7 < i9) {
            int i10 = i7 + 1;
            Object obj2 = zzB[i9];
            zzB[i7] = obj2;
            zzC[i7] = zzC[i9];
            zzB[i9] = null;
            zzC[i9] = null;
            zzA[i7] = zzA[i9];
            zzA[i9] = 0;
            int zza = zzck.zza(obj2) & i8;
            int zzc = zzcj.zzc(obj, zza);
            if (zzc == size) {
                zzcj.zze(obj, zza, i10);
                return;
            }
            while (true) {
                int i11 = zzc - 1;
                int i12 = zzA[i11];
                int i13 = i12 & i8;
                if (i13 != size) {
                    zzc = i13;
                } else {
                    zzA[i11] = (i12 & (~i8)) | (i8 & i10);
                    return;
                }
            }
        } else {
            zzB[i7] = null;
            zzC[i7] = null;
            zzA[i7] = 0;
        }
    }

    public final boolean zzr() {
        return this.zze == null;
    }

    public zzci(int i7) {
        zzp(12);
    }
}
