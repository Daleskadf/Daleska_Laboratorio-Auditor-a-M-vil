package com.google.android.gms.internal.mlkit_vision_common;

import java.util.AbstractMap;
/* loaded from: classes.dex */
final class zzv extends zzp {
    final /* synthetic */ zzw zza;

    public zzv(zzw zzwVar) {
        this.zza = zzwVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i7) {
        int i8;
        Object[] objArr;
        Object[] objArr2;
        i8 = this.zza.zzc;
        zzf.zza(i7, i8, "index");
        zzw zzwVar = this.zza;
        objArr = zzwVar.zzb;
        int i9 = i7 + i7;
        Object obj = objArr[i9];
        obj.getClass();
        objArr2 = zzwVar.zzb;
        Object obj2 = objArr2[i9 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i7;
        i7 = this.zza.zzc;
        return i7;
    }
}
