package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfcu implements zzfde {
    private final zzfde zza;
    private zzcxx zzb;

    public zzfcu(zzfde zzfdeVar) {
        this.zza = zzfdeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    /* renamed from: zza */
    public final synchronized zzcxx zzd() {
        return this.zzb;
    }

    public final synchronized ListenableFuture zzb(zzfdf zzfdfVar, zzfdd zzfddVar, zzcxx zzcxxVar) {
        this.zzb = zzcxxVar;
        if (zzfdfVar.zza != null) {
            zzcvd zzb = this.zzb.zzb();
            return zzb.zzi(zzb.zzk(zzgee.zzh(zzfdfVar.zza)));
        }
        return ((zzfct) this.zza).zzb(zzfdfVar, zzfddVar, zzcxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfde
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzfdf zzfdfVar, zzfdd zzfddVar, Object obj) {
        return zzb(zzfdfVar, zzfddVar, null);
    }
}
