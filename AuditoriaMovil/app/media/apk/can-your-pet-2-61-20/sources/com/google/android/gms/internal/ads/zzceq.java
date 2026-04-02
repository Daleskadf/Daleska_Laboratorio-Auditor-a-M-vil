package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzceq extends com.google.android.gms.ads.internal.util.zzb {
    final zzcdn zza;
    final zzcey zzb;
    private final String zzc;
    private final String[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzceq(zzcdn zzcdnVar, zzcey zzceyVar, String str, String[] strArr) {
        this.zza = zzcdnVar;
        this.zzb = zzceyVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzu.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzu(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcep(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzbW)).booleanValue() || !(this.zzb instanceof zzcfh)) {
            return super.zzb();
        }
        return zzcbr.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzceo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzceq.this.zzd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzw(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
