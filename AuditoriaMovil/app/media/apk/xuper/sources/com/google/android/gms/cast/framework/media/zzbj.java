package com.google.android.gms.cast.framework.media;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbj implements com.google.android.gms.cast.internal.zzar {
    final /* synthetic */ zzbl zza;

    public zzbj(zzbl zzblVar) {
        this.zza = zzblVar;
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zza(long j10, int i10, Object obj) {
        JSONObject jSONObject;
        MediaError mediaError = null;
        if (true != (obj instanceof com.google.android.gms.cast.internal.zzao)) {
            obj = null;
        }
        try {
            zzbl zzblVar = this.zza;
            Status status = new Status(i10);
            if (obj != null) {
                jSONObject = ((com.google.android.gms.cast.internal.zzao) obj).zza;
            } else {
                jSONObject = null;
            }
            if (obj != null) {
                mediaError = ((com.google.android.gms.cast.internal.zzao) obj).zzb;
            }
            zzblVar.setResult(new zzbm(status, jSONObject, mediaError));
        } catch (IllegalStateException e10) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e10);
        }
    }

    @Override // com.google.android.gms.cast.internal.zzar
    public final void zzb(long j10) {
        try {
            zzbl zzblVar = this.zza;
            zzblVar.setResult(new zzbk(zzblVar, new Status(2103)));
        } catch (IllegalStateException e10) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e10);
        }
    }
}
