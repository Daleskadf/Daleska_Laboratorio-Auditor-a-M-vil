package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcr implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbcj zza;
    final /* synthetic */ zzcbw zzb;
    final /* synthetic */ zzbct zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcr(zzbct zzbctVar, zzbcj zzbcjVar, zzcbw zzcbwVar) {
        this.zza = zzbcjVar;
        this.zzb = zzcbwVar;
        this.zzc = zzbctVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzbci zzbciVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbct zzbctVar = this.zzc;
            z = zzbctVar.zzb;
            if (z) {
                return;
            }
            zzbctVar.zzb = true;
            zzbciVar = this.zzc.zza;
            if (zzbciVar == null) {
                return;
            }
            zzgep zzgepVar = zzcbr.zza;
            final zzbcj zzbcjVar = this.zza;
            final zzcbw zzcbwVar = this.zzb;
            final ListenableFuture zza = zzgepVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbco
                @Override // java.lang.Runnable
                public final void run() {
                    zzbcg zzf;
                    zzbcr zzbcrVar = zzbcr.this;
                    zzbci zzbciVar2 = zzbciVar;
                    zzcbw zzcbwVar2 = zzcbwVar;
                    try {
                        zzbcl zzq = zzbciVar2.zzq();
                        boolean zzp = zzbciVar2.zzp();
                        zzbcj zzbcjVar2 = zzbcjVar;
                        if (zzp) {
                            zzf = zzq.zzg(zzbcjVar2);
                        } else {
                            zzf = zzq.zzf(zzbcjVar2);
                        }
                        if (!zzf.zze()) {
                            zzcbwVar2.zzd(new RuntimeException("No entry contents."));
                            zzbct.zze(zzbcrVar.zzc);
                            return;
                        }
                        zzbcq zzbcqVar = new zzbcq(zzbcrVar, zzf.zzc(), 1);
                        int read = zzbcqVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbcqVar.unread(read);
                        zzcbwVar2.zzc(zzbcv.zzb(zzbcqVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                    } catch (RemoteException | IOException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                        zzcbwVar2.zzd(e);
                        zzbct.zze(zzbcrVar.zzc);
                    }
                }
            });
            final zzcbw zzcbwVar2 = this.zzb;
            zzcbwVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbcp
                @Override // java.lang.Runnable
                public final void run() {
                    int i = zzbcr.zzd;
                    if (zzcbw.this.isCancelled()) {
                        zza.cancel(true);
                    }
                }
            }, zzcbr.zzf);
        }
    }
}
