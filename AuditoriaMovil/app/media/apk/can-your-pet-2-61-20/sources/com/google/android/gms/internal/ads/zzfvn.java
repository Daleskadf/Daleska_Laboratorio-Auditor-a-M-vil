package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzfvn extends zzfvh {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzfvq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfvn(zzfvq zzfvqVar, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzfvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zza() {
        List<Runnable> list;
        List list2;
        this.zzb.zza.zzn = zzfty.zzb(this.zza);
        zzfvr.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
