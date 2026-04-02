package com.google.android.gms.cast.framework.media;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzba extends zzbl {
    final /* synthetic */ JSONObject zza;
    final /* synthetic */ RemoteMediaClient zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzba(RemoteMediaClient remoteMediaClient, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzb = remoteMediaClient;
        this.zza = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbl
    public final void zza() {
        com.google.android.gms.cast.internal.zzap zzapVar;
        zzapVar = this.zzb.zzd;
        zzapVar.zzr(zzb(), this.zza);
    }
}
