package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdza implements zzhiv {
    private final zzhjm zza;

    public zzdza(zzhjm zzhjmVar) {
        this.zza = zzhjmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhjm
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzciq) this.zza).zza().getPackageName();
        zzhjd.zzb(packageName);
        return packageName;
    }
}
