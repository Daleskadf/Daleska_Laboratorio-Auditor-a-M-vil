package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbzi implements zzgea {
    final /* synthetic */ ListenableFuture zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbzi(zzbzj zzbzjVar, ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(Throwable th) {
        List list;
        list = zzbzj.zzc;
        list.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = zzbzj.zzc;
        list.remove(this.zza);
    }
}
