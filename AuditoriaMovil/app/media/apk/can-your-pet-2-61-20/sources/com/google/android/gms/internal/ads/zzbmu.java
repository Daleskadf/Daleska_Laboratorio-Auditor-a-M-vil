package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbmu implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcbw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbmu(zzbmv zzbmvVar, zzcbw zzcbwVar) {
        this.zza = zzcbwVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
