package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.f;
import java.util.Arrays;
import java.util.Collection;
/* loaded from: classes.dex */
class zzcl extends zzcm {
    Object[] zza = new Object[4];
    int zzb = 0;
    boolean zzc;

    public zzcl(int i7) {
    }

    private final void zzd(int i7) {
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

    public final zzcl zza(Object obj) {
        obj.getClass();
        zzd(this.zzb + 1);
        Object[] objArr = this.zza;
        int i7 = this.zzb;
        this.zzb = i7 + 1;
        objArr[i7] = obj;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcm
    public /* bridge */ /* synthetic */ zzcm zzb(Object obj) {
        throw null;
    }

    public final zzcm zzc(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzd(collection.size() + this.zzb);
            if (collection instanceof zzcn) {
                this.zzb = ((zzcn) collection).zza(this.zza, this.zzb);
                return this;
            }
        }
        for (Object obj : iterable) {
            zzb(obj);
        }
        return this;
    }
}
