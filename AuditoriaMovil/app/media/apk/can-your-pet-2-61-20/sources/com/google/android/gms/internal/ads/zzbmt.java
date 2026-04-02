package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbmt implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcbw zza;
    final /* synthetic */ zzbmv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmt(zzbmv zzbmvVar, zzcbw zzcbwVar) {
        this.zza = zzcbwVar;
        this.zzb = zzbmvVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbmi zzbmiVar;
        try {
            zzcbw zzcbwVar = this.zza;
            zzbmiVar = this.zzb.zza;
            zzcbwVar.zzc(zzbmiVar.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException("onConnectionSuspended: " + i));
    }
}
