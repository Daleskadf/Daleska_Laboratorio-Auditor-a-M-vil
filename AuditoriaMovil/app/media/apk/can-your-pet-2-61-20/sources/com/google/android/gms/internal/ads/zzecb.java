package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzecb extends zzece {
    private zzbwe zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzecb(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zze = context;
        this.zzf = com.google.android.gms.ads.internal.zzu.zzt().zzb();
        this.zzg = scheduledExecutorService;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final synchronized void onConnected(Bundle bundle) {
        if (this.zzc) {
            return;
        }
        this.zzc = true;
        try {
            this.zzd.zzp().zzf(this.zzh, new zzecd(this));
        } catch (RemoteException unused) {
            this.zza.zzd(new zzeal(1));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzece, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        String format = String.format(Locale.US, "Remote ad service connection suspended, cause: %d.", Integer.valueOf(i));
        com.google.android.gms.ads.internal.util.client.zzm.zze(format);
        this.zza.zzd(new zzeal(1, format));
    }

    public final synchronized ListenableFuture zza(zzbwe zzbweVar, long j) {
        if (this.zzb) {
            return zzgee.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        }
        this.zzb = true;
        this.zzh = zzbweVar;
        zzb();
        ListenableFuture zzo = zzgee.zzo(this.zza, j, TimeUnit.MILLISECONDS, this.zzg);
        zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeca
            @Override // java.lang.Runnable
            public final void run() {
                zzecb.this.zzc();
            }
        }, zzcbr.zzf);
        return zzo;
    }
}
