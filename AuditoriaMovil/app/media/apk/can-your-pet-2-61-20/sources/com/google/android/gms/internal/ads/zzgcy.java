package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgcy extends zzgda {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcy(ListenableFuture listenableFuture, zzgdl zzgdlVar) {
        super(listenableFuture, zzgdlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        zzgdl zzgdlVar = (zzgdl) obj;
        ListenableFuture zza = zzgdlVar.zza(obj2);
        zzfwr.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdlVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
