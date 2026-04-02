package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaoh implements zzaco {
    private final zzfv zza;
    private final zzfo zzb = new zzfo();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaoh(zzfv zzfvVar, zzaog zzaogVar) {
        this.zza = zzfvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final zzacn zza(zzadg zzadgVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzadgVar.zzf();
        int min = (int) Math.min(20000L, zzadgVar.zzd() - zzf);
        this.zzb.zzH(min);
        ((zzact) zzadgVar).zzm(this.zzb.zzM(), 0, min, false);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            zzfo zzfoVar = this.zzb;
            if (zzfoVar.zzb() < 4) {
                return j3 != -9223372036854775807L ? zzacn.zzf(j3, zzf + i) : zzacn.zza;
            } else if (zzaoi.zzh(zzfoVar.zzM(), zzfoVar.zzd()) != 442) {
                zzfoVar.zzL(1);
            } else {
                zzfoVar.zzL(4);
                long zzc = zzaoj.zzc(zzfoVar);
                if (zzc != -9223372036854775807L) {
                    long zzb = this.zza.zzb(zzc);
                    if (zzb > j) {
                        if (j3 == -9223372036854775807L) {
                            return zzacn.zzd(zzb, zzf);
                        }
                        j2 = i2;
                    } else if (100000 + zzb > j) {
                        j2 = zzfoVar.zzd();
                        break;
                    } else {
                        i2 = zzfoVar.zzd();
                        j3 = zzb;
                    }
                }
                int zze = zzfoVar.zze();
                if (zzfoVar.zzb() < 10) {
                    zzfoVar.zzK(zze);
                } else {
                    zzfoVar.zzL(9);
                    int zzm = zzfoVar.zzm() & 7;
                    if (zzfoVar.zzb() < zzm) {
                        zzfoVar.zzK(zze);
                    } else {
                        zzfoVar.zzL(zzm);
                        if (zzfoVar.zzb() < 4) {
                            zzfoVar.zzK(zze);
                        } else {
                            if (zzaoi.zzh(zzfoVar.zzM(), zzfoVar.zzd()) == 443) {
                                zzfoVar.zzL(4);
                                int zzq = zzfoVar.zzq();
                                if (zzfoVar.zzb() < zzq) {
                                    zzfoVar.zzK(zze);
                                } else {
                                    zzfoVar.zzL(zzq);
                                }
                            }
                            while (true) {
                                if (zzfoVar.zzb() < 4 || (zzh = zzaoi.zzh(zzfoVar.zzM(), zzfoVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                    break;
                                }
                                zzfoVar.zzL(4);
                                if (zzfoVar.zzb() >= 2) {
                                    zzfoVar.zzK(Math.min(zzfoVar.zze(), zzfoVar.zzd() + zzfoVar.zzq()));
                                } else {
                                    zzfoVar.zzK(zze);
                                    break;
                                }
                            }
                        }
                    }
                }
                i = zzfoVar.zzd();
            }
        }
        return zzacn.zze(zzf + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzb() {
        byte[] bArr = zzfx.zzf;
        int length = bArr.length;
        this.zzb.zzI(bArr, 0);
    }
}
