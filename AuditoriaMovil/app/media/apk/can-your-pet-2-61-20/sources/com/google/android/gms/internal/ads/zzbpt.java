package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbpt implements zzbln {
    final /* synthetic */ zzbpu zza;
    private final zzbow zzb;
    private final zzcbw zzc;

    public zzbpt(zzbpu zzbpuVar, zzbow zzbowVar, zzcbw zzcbwVar) {
        this.zza = zzbpuVar;
        this.zzb = zzbowVar;
        this.zzc = zzcbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zza(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbpf());
            } else {
                this.zzc.zzd(new zzbpf(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zzb(JSONObject jSONObject) {
        zzbpi zzbpiVar;
        try {
            try {
                zzcbw zzcbwVar = this.zzc;
                zzbpiVar = this.zza.zza;
                zzcbwVar.zzc(zzbpiVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
