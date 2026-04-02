package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbaq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbap(zzbaq zzbaqVar) {
        this.zza = zzbaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzbar> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzbaq zzbaqVar = this.zza;
            z = zzbaqVar.zzd;
            if (z) {
                z2 = zzbaqVar.zze;
                if (z2) {
                    zzbaqVar.zzd = false;
                    com.google.android.gms.ads.internal.util.client.zzm.zze("App went background");
                    list = this.zza.zzf;
                    for (zzbar zzbarVar : list) {
                        try {
                            zzbarVar.zza(false);
                        } catch (Exception e) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzh("", e);
                        }
                    }
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("App is still foreground");
        }
    }
}
