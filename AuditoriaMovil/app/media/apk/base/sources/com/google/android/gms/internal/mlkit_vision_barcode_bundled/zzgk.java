package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
final class zzgk implements Iterator {
    final /* synthetic */ zzgo zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        Map map;
        int i8 = this.zzb + 1;
        zzgo zzgoVar = this.zza;
        i7 = zzgoVar.zzb;
        if (i8 < i7) {
            return true;
        }
        map = zzgoVar.zzc;
        if (!map.isEmpty() && zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i7;
        Object[] objArr;
        this.zzc = true;
        int i8 = this.zzb + 1;
        this.zzb = i8;
        zzgo zzgoVar = this.zza;
        i7 = zzgoVar.zzb;
        if (i8 < i7) {
            objArr = zzgoVar.zza;
            return (zzgi) objArr[i8];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i7;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzo();
            int i8 = this.zzb;
            zzgo zzgoVar = this.zza;
            i7 = zzgoVar.zzb;
            if (i8 < i7) {
                this.zzb = i8 - 1;
                zzgoVar.zzm(i8);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
