package com.google.android.gms.internal.ads;

import com.google.common.primitives.SignedBytes;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzanh implements zzano {
    private final zzfn zza;
    private final zzfo zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzaem zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzam zzk;
    private int zzl;
    private long zzm;

    public zzanh() {
        this(null, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) {
        zzek.zzb(this.zzf);
        while (zzfoVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (zzfoVar.zzb() > 0) {
                    if (!this.zzi) {
                        this.zzi = zzfoVar.zzm() == 172;
                    } else {
                        int zzm = zzfoVar.zzm();
                        this.zzi = zzm == 172;
                        byte b = SignedBytes.MAX_POWER_OF_TWO;
                        if (zzm != 64) {
                            if (zzm == 65) {
                                zzm = 65;
                            }
                        }
                        this.zzg = 1;
                        zzfo zzfoVar2 = this.zzb;
                        zzfoVar2.zzM()[0] = -84;
                        if (zzm == 65) {
                            b = 65;
                        }
                        zzfoVar2.zzM()[1] = b;
                        this.zzh = 2;
                    }
                }
            } else if (i == 1) {
                byte[] zzM = this.zzb.zzM();
                int min = Math.min(zzfoVar.zzb(), 16 - this.zzh);
                zzfoVar.zzG(zzM, this.zzh, min);
                int i2 = this.zzh + min;
                this.zzh = i2;
                if (i2 == 16) {
                    this.zza.zzk(0);
                    zzacg zza = zzach.zza(this.zza);
                    zzam zzamVar = this.zzk;
                    if (zzamVar == null || zzamVar.zzz != 2 || zza.zza != zzamVar.zzA || !"audio/ac4".equals(zzamVar.zzm)) {
                        zzak zzakVar = new zzak();
                        zzakVar.zzK(this.zze);
                        zzakVar.zzW("audio/ac4");
                        zzakVar.zzy(2);
                        zzakVar.zzX(zza.zza);
                        zzakVar.zzN(this.zzc);
                        zzakVar.zzU(this.zzd);
                        zzam zzac = zzakVar.zzac();
                        this.zzk = zzac;
                        this.zzf.zzl(zzac);
                    }
                    this.zzl = zza.zzb;
                    this.zzj = (zza.zzc * 1000000) / this.zzk.zzA;
                    this.zzb.zzK(0);
                    this.zzf.zzq(this.zzb, 16);
                    this.zzg = 2;
                }
            } else {
                int min2 = Math.min(zzfoVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzq(zzfoVar, min2);
                int i3 = this.zzh + min2;
                this.zzh = i3;
                if (i3 == this.zzl) {
                    zzek.zzf(this.zzm != -9223372036854775807L);
                    this.zzf.zzs(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zze = zzapaVar.zzb();
        this.zzf = zzadiVar.zzw(zzapaVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }

    public zzanh(String str, int i) {
        zzfn zzfnVar = new zzfn(new byte[16], 16);
        this.zza = zzfnVar;
        this.zzb = new zzfo(zzfnVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
    }
}
