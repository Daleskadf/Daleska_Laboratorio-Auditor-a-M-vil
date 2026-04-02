package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.MediaQueueItem;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzag extends zzbl {
    final /* synthetic */ MediaQueueItem[] zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ JSONObject zze;
    final /* synthetic */ RemoteMediaClient zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(RemoteMediaClient remoteMediaClient, MediaQueueItem[] mediaQueueItemArr, int i10, int i11, long j10, JSONObject jSONObject) {
        super(remoteMediaClient, false);
        this.zzf = remoteMediaClient;
        this.zza = mediaQueueItemArr;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = jSONObject;
    }

    @Override // com.google.android.gms.cast.framework.media.zzbl
    public final void zza() {
        com.google.android.gms.cast.internal.zzap zzapVar;
        zzapVar = this.zzf.zzd;
        zzapVar.zzx(zzb(), this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
