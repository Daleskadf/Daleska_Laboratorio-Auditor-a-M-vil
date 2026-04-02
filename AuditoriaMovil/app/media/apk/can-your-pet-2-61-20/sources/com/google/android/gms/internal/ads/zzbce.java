package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbce implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbcf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbce(zzbcf zzbcfVar) {
        this.zza = zzbcfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        zzbci zzbciVar;
        Object obj2;
        obj = this.zza.zzc;
        synchronized (obj) {
            this.zza.zzf = null;
            zzbcf zzbcfVar = this.zza;
            zzbciVar = zzbcfVar.zzd;
            if (zzbciVar != null) {
                zzbcfVar.zzd = null;
            }
            obj2 = this.zza.zzc;
            obj2.notifyAll();
        }
    }
}
