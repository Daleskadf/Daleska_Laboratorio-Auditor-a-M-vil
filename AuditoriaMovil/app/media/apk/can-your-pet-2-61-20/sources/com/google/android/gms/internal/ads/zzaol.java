package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaol {
    private final zzano zza;
    private final zzfv zzb;
    private final zzfn zzc = new zzfn(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaol(zzano zzanoVar, zzfv zzfvVar) {
        this.zza = zzanoVar;
        this.zzb = zzfvVar;
    }

    public final void zza(zzfo zzfoVar) throws zzcc {
        long j;
        long j2;
        zzfoVar.zzG(this.zzc.zza, 0, 3);
        this.zzc.zzk(0);
        this.zzc.zzm(8);
        this.zzd = this.zzc.zzo();
        this.zze = this.zzc.zzo();
        this.zzc.zzm(6);
        zzfn zzfnVar = this.zzc;
        zzfoVar.zzG(zzfnVar.zza, 0, zzfnVar.zzd(8));
        this.zzc.zzk(0);
        if (this.zzd) {
            this.zzc.zzm(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzm(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzm(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzm(1);
            if (this.zzf || !this.zze) {
                j2 = zzd;
            } else {
                this.zzc.zzm(4);
                this.zzc.zzm(1);
                this.zzc.zzm(1);
                j2 = zzd;
                this.zzc.zzm(1);
                this.zzb.zzb((this.zzc.zzd(15) << 15) | (this.zzc.zzd(3) << 30) | this.zzc.zzd(15));
                this.zzf = true;
            }
            j = this.zzb.zzb((j2 << 30) | zzd2 | zzd3);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzfoVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
