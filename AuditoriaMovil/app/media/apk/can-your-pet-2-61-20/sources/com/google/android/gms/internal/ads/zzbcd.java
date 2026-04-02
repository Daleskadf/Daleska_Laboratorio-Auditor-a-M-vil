package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbcd implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbcf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbcd(zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        Object obj2;
        zzbci zzbciVar;
        zzbci zzbciVar2;
        obj = this.zza.zzc;
        synchronized (obj) {
            try {
                zzbcf zzbcfVar = this.zza;
                zzbciVar = zzbcfVar.zzd;
                if (zzbciVar != null) {
                    zzbciVar2 = zzbcfVar.zzd;
                    zzbcfVar.zzf = zzbciVar2.zzq();
                }
            } catch (DeadObjectException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to obtain a cache service instance.", e);
                zzbcf.zzh(this.zza);
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Object obj;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
