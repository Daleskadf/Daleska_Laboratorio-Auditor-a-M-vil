package com.google.android.gms.tagmanager;

import android.util.LruCache;
/* compiled from: com.google.android.gms:play-services-tagmanager-v4-impl@@18.0.4 */
/* loaded from: classes3.dex */
final class zzda {
    private final LruCache zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzda(int i, zzq zzqVar) {
        this.zza = new zzcz(this, 1048576, zzqVar);
    }

    public final Object zza(Object obj) {
        return this.zza.get(obj);
    }

    public final void zzb(Object obj, Object obj2) {
        this.zza.put(obj, obj2);
    }
}
