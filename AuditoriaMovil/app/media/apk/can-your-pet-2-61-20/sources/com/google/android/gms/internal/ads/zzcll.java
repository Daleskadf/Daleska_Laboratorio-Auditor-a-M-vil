package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzcll implements zzdvj {
    private final Long zza;
    private final String zzb;
    private final zzckh zzc;
    private final zzclp zzd;
    private final zzcll zze = this;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcll(zzckh zzckhVar, zzclp zzclpVar, Long l, String str, zzclk zzclkVar) {
        this.zzc = zzckhVar;
        this.zzd = zzclpVar;
        this.zza = l;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdvj
    public final zzdvt zza() {
        Context context;
        zzdvm zzc;
        zzclp zzclpVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzclpVar.zza;
        zzc = zzdvn.zzc(zzclpVar.zzb);
        return zzdvu.zza(longValue, context, zzc, this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdvj
    public final zzdvx zzb() {
        Context context;
        zzdvm zzc;
        zzclp zzclpVar = this.zzd;
        long longValue = this.zza.longValue();
        context = zzclpVar.zza;
        zzc = zzdvn.zzc(zzclpVar.zzb);
        return zzdvy.zza(longValue, context, zzc, this.zzc, this.zzb);
    }
}
