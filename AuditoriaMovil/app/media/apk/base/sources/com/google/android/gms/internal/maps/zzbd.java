package com.google.android.gms.internal.maps;

import java.util.Iterator;
/* loaded from: classes.dex */
final class zzbd extends zzba {
    static final zzbd zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzbd(objArr, 0, objArr, 0, 0);
    }

    public zzbd(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.zzb = objArr;
        this.zze = i7;
        this.zzc = objArr2;
        this.zzf = i8;
        this.zzg = i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int zza2 = zzav.zza(obj.hashCode());
                while (true) {
                    int i7 = zza2 & this.zzf;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    zza2 = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.maps.zzba, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zza(Object[] objArr, int i7) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.maps.zzba, com.google.android.gms.internal.maps.zzaw
    public final zzbf zzd() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzba
    public final zzaz zzh() {
        return zzaz.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.maps.zzba
    public final boolean zzj() {
        return true;
    }
}
