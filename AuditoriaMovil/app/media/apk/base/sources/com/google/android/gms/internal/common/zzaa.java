package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;
/* loaded from: classes.dex */
class zzaa extends zzab {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzaa(int i7) {
    }

    public final zzaa zza(Object obj) {
        obj.getClass();
        int i7 = this.zzb;
        int i8 = i7 + 1;
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i8) {
            int i9 = length + (length >> 1) + 1;
            if (i9 < i8) {
                int highestOneBit = Integer.highestOneBit(i7);
                i9 = highestOneBit + highestOneBit;
            }
            if (i9 < 0) {
                i9 = f.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i9);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
        Object[] objArr2 = this.zza;
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        objArr2[i10] = obj;
        return this;
    }
}
