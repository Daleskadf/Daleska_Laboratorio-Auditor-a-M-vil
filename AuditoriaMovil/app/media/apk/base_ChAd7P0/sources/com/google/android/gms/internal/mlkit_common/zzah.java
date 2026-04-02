package com.google.android.gms.internal.mlkit_common;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class zzah {
    Object[] zza = new Object[8];
    int zzb = 0;
    zzag zzc;

    public final zzah zza(Object obj, Object obj2) {
        int i7 = this.zzb + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i8 = i7 + i7;
        if (i8 > length) {
            this.zza = Arrays.copyOf(objArr, zzaa.zza(length, i8));
        }
        zzw.zza(obj, obj2);
        Object[] objArr2 = this.zza;
        int i9 = this.zzb;
        int i10 = i9 + i9;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.zzb = i9 + 1;
        return this;
    }

    public final zzai zzb() {
        zzag zzagVar = this.zzc;
        if (zzagVar == null) {
            zzaq zzg = zzaq.zzg(this.zzb, this.zza, this);
            zzag zzagVar2 = this.zzc;
            if (zzagVar2 == null) {
                return zzg;
            }
            throw zzagVar2.zza();
        }
        throw zzagVar.zza();
    }
}
