package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbpa implements zzcca {
    final /* synthetic */ zzbpb zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpa(zzbpb zzbpbVar) {
        this.zza = zzbpbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbnx zzbnxVar = (zzbnx) obj;
        zzcbr.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzboz
            @Override // java.lang.Runnable
            public final void run() {
                zzbnx zzbnxVar2 = zzbnxVar;
                zzbnxVar2.zzr("/result", zzbkx.zzo);
                zzbnxVar2.zzc();
            }
        });
    }
}
