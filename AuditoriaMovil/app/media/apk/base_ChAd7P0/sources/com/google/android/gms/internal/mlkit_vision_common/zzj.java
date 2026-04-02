package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.f;
import java.util.Arrays;
/* loaded from: classes.dex */
class zzj extends zzk {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzj(int i7) {
    }

    private final void zzb(int i7) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        if (length < i7) {
            int i8 = length + (length >> 1) + 1;
            if (i8 < i7) {
                int highestOneBit = Integer.highestOneBit(i7 - 1);
                i8 = highestOneBit + highestOneBit;
            }
            if (i8 < 0) {
                i8 = f.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr, i8);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr.clone();
            this.zzc = false;
        }
    }

    public final zzj zza(Object obj) {
        obj.getClass();
        zzb(this.zzb + 1);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }
}
