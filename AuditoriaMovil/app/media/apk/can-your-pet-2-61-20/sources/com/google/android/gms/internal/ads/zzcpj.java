package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcpj implements zzgea {
    final /* synthetic */ zzfmt zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcpk zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcpj(zzcpk zzcpkVar, zzfmt zzfmtVar, String str) {
        this.zza = zzfmtVar;
        this.zzb = str;
        this.zzc = zzcpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final void zza(final Throwable th) {
        zzgep zzgepVar;
        zzgepVar = this.zzc.zzg;
        final zzfmt zzfmtVar = this.zza;
        final String str = this.zzb;
        zzgepVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcph
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                Context context2;
                boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdz.zzkc)).booleanValue();
                zzcpj zzcpjVar = zzcpj.this;
                Throwable th2 = th;
                if (booleanValue) {
                    zzcpk zzcpkVar = zzcpjVar.zzc;
                    context2 = zzcpkVar.zzc;
                    zzcpkVar.zzb = zzbvs.zzc(context2);
                    zzcpjVar.zzc.zzb.zzg(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcpk zzcpkVar2 = zzcpjVar.zzc;
                    context = zzcpkVar2.zzc;
                    zzcpkVar2.zza = zzbvs.zza(context);
                    zzcpjVar.zzc.zza.zzg(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                zzfmtVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgea
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgep zzgepVar;
        zzcpk zzcpkVar = this.zzc;
        final zzfmt zzfmtVar = this.zza;
        final String str = (String) obj;
        zzgepVar = zzcpkVar.zzg;
        zzgepVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpi
            @Override // java.lang.Runnable
            public final void run() {
                zzfmt.this.zzc(str, null);
            }
        });
    }
}
