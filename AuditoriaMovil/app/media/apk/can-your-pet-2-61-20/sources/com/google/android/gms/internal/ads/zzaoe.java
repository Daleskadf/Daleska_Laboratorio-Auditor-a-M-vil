package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoe implements zzaon {
    private zzam zza;
    private zzfv zzb;
    private zzaem zzc;

    public zzaoe(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzW(str);
        this.zza = zzakVar.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza(zzfo zzfoVar) {
        zzek.zzb(this.zzb);
        int i = zzfx.zza;
        long zze = this.zzb.zze();
        long zzf = this.zzb.zzf();
        if (zze == -9223372036854775807L || zzf == -9223372036854775807L) {
            return;
        }
        zzam zzamVar = this.zza;
        if (zzf != zzamVar.zzq) {
            zzak zzb = zzamVar.zzb();
            zzb.zzaa(zzf);
            zzam zzac = zzb.zzac();
            this.zza = zzac;
            this.zzc.zzl(zzac);
        }
        int zzb2 = zzfoVar.zzb();
        this.zzc.zzq(zzfoVar, zzb2);
        this.zzc.zzs(zze, 1, zzb2, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
        this.zzb = zzfvVar;
        zzapaVar.zzc();
        zzaem zzw = zzadiVar.zzw(zzapaVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
