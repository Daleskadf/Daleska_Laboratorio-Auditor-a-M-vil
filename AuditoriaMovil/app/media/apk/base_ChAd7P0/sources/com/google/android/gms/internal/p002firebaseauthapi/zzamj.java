package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamj  reason: invalid package */
/* loaded from: classes.dex */
final class zzamj implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzamh zzc;

    private final Iterator zza() {
        Map map;
        if (this.zzb == null) {
            map = this.zzc.zzf;
            this.zzb = map.entrySet().iterator();
        }
        return this.zzb;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i8 = this.zza;
        if (i8 > 0) {
            i7 = this.zzc.zzb;
            if (i8 <= i7) {
                return true;
            }
        }
        if (zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object[] objArr;
        if (!zza().hasNext()) {
            objArr = this.zzc.zza;
            int i7 = this.zza - 1;
            this.zza = i7;
            return (zzaml) objArr[i7];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzamj(zzamh zzamhVar) {
        int i7;
        this.zzc = zzamhVar;
        i7 = zzamhVar.zzb;
        this.zza = i7;
    }
}
