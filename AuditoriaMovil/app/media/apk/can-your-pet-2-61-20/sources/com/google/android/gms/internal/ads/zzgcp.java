package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgcp extends zzgcq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcp(ListenableFuture listenableFuture, Class cls, zzfwf zzfwfVar) {
        super(listenableFuture, cls, zzfwfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    final /* synthetic */ Object zze(Object obj, Throwable th) throws Exception {
        return ((zzfwf) obj).apply(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcq
    final void zzf(Object obj) {
        zzc(obj);
    }
}
