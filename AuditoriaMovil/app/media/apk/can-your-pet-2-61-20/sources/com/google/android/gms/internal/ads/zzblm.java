package com.google.android.gms.internal.ads;

import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzblm implements zzbln {
    final /* synthetic */ zzcbw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzblm(zzblo zzbloVar, zzcbw zzcbwVar) {
        this.zza = zzcbwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zza(String str) {
        this.zza.zzd(new zzbpf(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbln
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }
}
