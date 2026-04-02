package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoa implements zzano {
    private zzaem zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfo zza = new zzfo(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) {
        zzek.zzb(this.zzb);
        if (this.zzc) {
            int zzb = zzfoVar.zzb();
            int i = this.zzf;
            if (i < 10) {
                int min = Math.min(zzb, 10 - i);
                System.arraycopy(zzfoVar.zzM(), zzfoVar.zzd(), this.zza.zzM(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzK(0);
                    if (this.zza.zzm() != 73 || this.zza.zzm() != 68 || this.zza.zzm() != 51) {
                        zzfe.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    }
                    this.zza.zzL(3);
                    this.zze = this.zza.zzl() + 10;
                }
            }
            int min2 = Math.min(zzb, this.zze - this.zzf);
            this.zzb.zzq(zzfoVar, min2);
            this.zzf += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        zzaem zzw = zzadiVar.zzw(zzapaVar.zza(), 5);
        this.zzb = zzw;
        zzak zzakVar = new zzak();
        zzakVar.zzK(zzapaVar.zzb());
        zzakVar.zzW("application/id3");
        zzw.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
        int i;
        zzek.zzb(this.zzb);
        if (this.zzc && (i = this.zze) != 0 && this.zzf == i) {
            zzek.zzf(this.zzd != -9223372036854775807L);
            this.zzb.zzs(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
