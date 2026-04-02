package com.google.android.gms.internal.ads;

import androidx.core.view.InputDeviceCompat;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoo implements zzapb {
    private final zzaon zza;
    private final zzfo zzb = new zzfo(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzaoo(zzaon zzaonVar) {
        this.zza = zzaonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfo zzfoVar, int i) {
        int i2 = i & 1;
        int zzd = i2 != 0 ? zzfoVar.zzd() + zzfoVar.zzm() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzfoVar.zzK(zzd);
            this.zzd = 0;
        }
        while (zzfoVar.zzb() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzm = zzfoVar.zzm();
                    zzfoVar.zzK(zzfoVar.zzd() - 1);
                    if (zzm == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzfoVar.zzb(), 3 - this.zzd);
                zzfoVar.zzG(this.zzb.zzM(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    this.zzb.zzK(0);
                    this.zzb.zzJ(3);
                    this.zzb.zzL(1);
                    zzfo zzfoVar2 = this.zzb;
                    int zzm2 = zzfoVar2.zzm();
                    boolean z = (zzm2 & 128) != 0;
                    int zzm3 = zzfoVar2.zzm();
                    this.zze = z;
                    this.zzc = (zzm3 | ((zzm2 & 15) << 8)) + 3;
                    int zzc = this.zzb.zzc();
                    int i5 = this.zzc;
                    if (zzc < i5) {
                        int zzc2 = this.zzb.zzc();
                        this.zzb.zzE(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i5, zzc2 + zzc2)));
                    }
                }
            } else {
                int min2 = Math.min(zzfoVar.zzb(), this.zzc - i3);
                zzfoVar.zzG(this.zzb.zzM(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (this.zze) {
                        if (zzfx.zze(this.zzb.zzM(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        this.zzb.zzJ(this.zzc - 4);
                    } else {
                        this.zzb.zzJ(i7);
                    }
                    this.zzb.zzK(0);
                    this.zza.zza(this.zzb);
                    this.zzd = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
        this.zza.zzb(zzfvVar, zzadiVar, zzapaVar);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzc() {
        this.zzf = true;
    }
}
