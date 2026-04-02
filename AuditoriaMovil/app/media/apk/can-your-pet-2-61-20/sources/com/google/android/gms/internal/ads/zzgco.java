package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgco extends zzgcq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgco(ListenableFuture listenableFuture, Class cls, zzgdl zzgdlVar) {
        super(listenableFuture, cls, zzgdlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        zzgdl zzgdlVar = (zzgdl) obj;
        ListenableFuture zza = zzgdlVar.zza(th);
        zzfwr.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdlVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    final /* synthetic */ void zzf(Object obj) {
        zzs((ListenableFuture) obj);
    }
}
