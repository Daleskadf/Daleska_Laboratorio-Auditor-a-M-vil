package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgcz extends zzgda {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcz(ListenableFuture listenableFuture, zzfwf zzfwfVar) {
        super(listenableFuture, zzfwfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    final /* synthetic */ Object zze(Object obj, Object obj2) throws Exception {
        return ((zzfwf) obj).apply(obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    final void zzf(Object obj) {
        zzc(obj);
    }
}
