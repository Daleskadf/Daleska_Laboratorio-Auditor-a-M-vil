package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzeua implements zzewr {
    private final zzgep zza;
    private final zzdxf zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeua(zzgep zzgepVar, zzdxf zzdxfVar) {
        this.zza = zzgepVar;
        this.zzb = zzdxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzewr
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeua.this.zzc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzeub zzc() throws Exception {
        zzdxf zzdxfVar = this.zzb;
        String zzc = zzdxfVar.zzc();
        boolean zzr = zzdxfVar.zzr();
        boolean zzl = com.google.android.gms.ads.internal.zzu.zzs().zzl();
        zzdxf zzdxfVar2 = this.zzb;
        return new zzeub(zzc, zzr, zzl, zzdxfVar2.zzp(), zzdxfVar2.zzs());
    }
}
