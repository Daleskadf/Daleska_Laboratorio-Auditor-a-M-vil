package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdvt implements zzdvh {
    private final long zza;
    private final zzeoi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdvt(long j, Context context, zzdvm zzdvmVar, zzcik zzcikVar, String str) {
        this.zza = j;
        zzfds zzv = zzcikVar.zzv();
        zzv.zzc(context);
        zzv.zza(new com.google.android.gms.ads.internal.client.zzq());
        zzv.zzb(str);
        zzeoi zza = zzv.zzd().zza();
        this.zzb = zza;
        zza.zzD(new zzdvs(this, zzdvmVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zza() {
        this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzaa(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdvh
    public final void zzc() {
        this.zzb.zzW(ObjectWrapper.wrap(null));
    }
}
