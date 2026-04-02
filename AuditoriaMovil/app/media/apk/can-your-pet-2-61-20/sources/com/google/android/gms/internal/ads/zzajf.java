package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajf implements zzajd {
    private final int zza;
    private final int zzb;
    private final zzfo zzc;

    public zzajf(zzaiz zzaizVar, zzam zzamVar) {
        zzfo zzfoVar = zzaizVar.zza;
        this.zzc = zzfoVar;
        zzfoVar.zzK(12);
        int zzp = zzfoVar.zzp();
        if ("audio/raw".equals(zzamVar.zzm)) {
            int zzm = zzfx.zzm(zzamVar.zzB, zzamVar.zzz);
            if (zzp == 0 || zzp % zzm != 0) {
                zzfe.zzf("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzm + ", stsz sample size: " + zzp);
                zzp = zzm;
            }
        }
        this.zza = zzp == 0 ? -1 : zzp;
        this.zzb = zzfoVar.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzajd
    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzp() : i;
    }
}
