package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzafm implements zzadf {
    public static final zzadm zza = new zzadm() { // from class: com.google.android.gms.internal.ads.zzafl
        @Override // com.google.android.gms.internal.ads.zzadm
        public final /* synthetic */ zzadf[] zza(Uri uri, Map map) {
            int i = zzadl.zza;
            zzadm zzadmVar = zzafm.zza;
            return new zzadf[]{new zzafm(0)};
        }
    };
    private final byte[] zzb;
    private final zzfo zzc;
    private final zzadn zzd;
    private zzadi zze;
    private zzaem zzf;
    private int zzg;
    private zzby zzh;
    private zzads zzi;
    private int zzj;
    private int zzk;
    private zzafk zzl;
    private int zzm;
    private long zzn;

    public zzafm() {
        this(0);
    }

    private final long zza(zzfo zzfoVar, boolean z) {
        boolean z2;
        this.zzi.getClass();
        int zzd = zzfoVar.zzd();
        while (zzd <= zzfoVar.zze() - 16) {
            zzfoVar.zzK(zzd);
            if (zzado.zzc(zzfoVar, this.zzi, this.zzk, this.zzd)) {
                zzfoVar.zzK(zzd);
                return this.zzd.zza;
            }
            zzd++;
        }
        if (z) {
            while (zzd <= zzfoVar.zze() - this.zzj) {
                zzfoVar.zzK(zzd);
                try {
                    z2 = zzado.zzc(zzfoVar, this.zzi, this.zzk, this.zzd);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzfoVar.zzd() <= zzfoVar.zze() && z2) {
                    zzfoVar.zzK(zzd);
                    return this.zzd.zza;
                }
                zzd++;
            }
            zzfoVar.zzK(zzfoVar.zze());
            return -1L;
        }
        zzfoVar.zzK(zzd);
        return -1L;
    }

    private final void zzg() {
        zzads zzadsVar = this.zzi;
        int i = zzfx.zza;
        this.zzf.zzs((this.zzn * 1000000) / zzadsVar.zze, 1, this.zzm, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final /* synthetic */ List zzc() {
        return zzfzn.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zzd(zzadi zzadiVar) {
        this.zze = zzadiVar;
        this.zzf = zzadiVar.zzw(0, 1);
        zzadiVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final boolean zzf(zzadg zzadgVar) throws IOException {
        zzadp.zza(zzadgVar, false);
        zzfo zzfoVar = new zzfo(4);
        ((zzact) zzadgVar).zzm(zzfoVar.zzM(), 0, 4, false);
        return zzfoVar.zzu() == 1716281667;
    }

    public zzafm(int i) {
        this.zzb = new byte[42];
        this.zzc = new zzfo(new byte[32768], 0);
        this.zzd = new zzadn();
        this.zzg = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzg = 0;
        } else {
            zzafk zzafkVar = this.zzl;
            if (zzafkVar != null) {
                zzafkVar.zzd(j2);
            }
        }
        this.zzn = j2 != 0 ? -1L : 0L;
        this.zzm = 0;
        this.zzc.zzH(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadf
    public final int zzb(zzadg zzadgVar, zzaec zzaecVar) throws IOException {
        boolean zzo;
        zzaef zzaeeVar;
        boolean z;
        int i = this.zzg;
        if (i == 0) {
            zzadgVar.zzj();
            long zze = zzadgVar.zze();
            zzby zza2 = zzadp.zza(zzadgVar, true);
            ((zzact) zzadgVar).zzo((int) (zzadgVar.zze() - zze), false);
            this.zzh = zza2;
            this.zzg = 1;
            return 0;
        } else if (i == 1) {
            ((zzact) zzadgVar).zzm(this.zzb, 0, 42, false);
            zzadgVar.zzj();
            this.zzg = 2;
            return 0;
        } else if (i == 2) {
            zzfo zzfoVar = new zzfo(4);
            ((zzact) zzadgVar).zzn(zzfoVar.zzM(), 0, 4, false);
            if (zzfoVar.zzu() == 1716281667) {
                this.zzg = 3;
                return 0;
            }
            throw zzcc.zza("Failed to read FLAC stream marker.", null);
        } else if (i == 3) {
            zzads zzadsVar = this.zzi;
            do {
                zzadgVar.zzj();
                zzfn zzfnVar = new zzfn(new byte[4], 4);
                zzact zzactVar = (zzact) zzadgVar;
                zzactVar.zzm(zzfnVar.zza, 0, 4, false);
                zzo = zzfnVar.zzo();
                int zzd = zzfnVar.zzd(7);
                int zzd2 = zzfnVar.zzd(24) + 4;
                if (zzd == 0) {
                    byte[] bArr = new byte[38];
                    zzactVar.zzn(bArr, 0, 38, false);
                    zzadsVar = new zzads(bArr, 4);
                } else if (zzadsVar == null) {
                    throw new IllegalArgumentException();
                } else {
                    if (zzd == 3) {
                        zzfo zzfoVar2 = new zzfo(zzd2);
                        zzactVar.zzn(zzfoVar2.zzM(), 0, zzd2, false);
                        zzadsVar = zzadsVar.zzf(zzadp.zzb(zzfoVar2));
                    } else if (zzd == 4) {
                        zzfo zzfoVar3 = new zzfo(zzd2);
                        zzactVar.zzn(zzfoVar3.zzM(), 0, zzd2, false);
                        zzfoVar3.zzL(4);
                        zzadsVar = zzadsVar.zzg(Arrays.asList(zzaes.zzc(zzfoVar3, false, false).zzb));
                    } else if (zzd != 6) {
                        zzactVar.zzo(zzd2, false);
                    } else {
                        zzfo zzfoVar4 = new zzfo(zzd2);
                        zzactVar.zzn(zzfoVar4.zzM(), 0, zzd2, false);
                        zzfoVar4.zzL(4);
                        zzadsVar = zzadsVar.zze(zzfzn.zzn(zzagi.zzb(zzfoVar4)));
                    }
                }
                int i2 = zzfx.zza;
                this.zzi = zzadsVar;
            } while (!zzo);
            zzadsVar.getClass();
            this.zzj = Math.max(zzadsVar.zzc, 6);
            this.zzf.zzl(this.zzi.zzc(this.zzb, this.zzh));
            this.zzg = 4;
            return 0;
        } else if (i == 4) {
            zzadgVar.zzj();
            zzfo zzfoVar5 = new zzfo(2);
            ((zzact) zzadgVar).zzm(zzfoVar5.zzM(), 0, 2, false);
            int zzq = zzfoVar5.zzq();
            if ((zzq >> 2) != 16382) {
                zzadgVar.zzj();
                throw zzcc.zza("First frame does not start with sync code.", null);
            }
            zzadgVar.zzj();
            this.zzk = zzq;
            zzadi zzadiVar = this.zze;
            int i3 = zzfx.zza;
            long zzf = zzadgVar.zzf();
            long zzd3 = zzadgVar.zzd();
            zzads zzadsVar2 = this.zzi;
            zzadsVar2.getClass();
            if (zzadsVar2.zzk != null) {
                zzaeeVar = new zzadq(zzadsVar2, zzf);
            } else if (zzd3 != -1 && zzadsVar2.zzj > 0) {
                zzafk zzafkVar = new zzafk(zzadsVar2, this.zzk, zzf, zzd3);
                this.zzl = zzafkVar;
                zzaeeVar = zzafkVar.zzb();
            } else {
                zzaeeVar = new zzaee(zzadsVar2.zza(), 0L);
            }
            zzadiVar.zzO(zzaeeVar);
            this.zzg = 5;
            return 0;
        } else {
            this.zzf.getClass();
            zzads zzadsVar3 = this.zzi;
            zzadsVar3.getClass();
            zzafk zzafkVar2 = this.zzl;
            if (zzafkVar2 == null || !zzafkVar2.zze()) {
                if (this.zzn == -1) {
                    this.zzn = zzado.zzb(zzadgVar, zzadsVar3);
                    return 0;
                }
                zzfo zzfoVar6 = this.zzc;
                int zze2 = zzfoVar6.zze();
                if (zze2 < 32768) {
                    int zza3 = zzadgVar.zza(zzfoVar6.zzM(), zze2, 32768 - zze2);
                    z = zza3 == -1;
                    if (!z) {
                        this.zzc.zzJ(zze2 + zza3);
                    } else if (this.zzc.zzb() == 0) {
                        zzg();
                        return -1;
                    }
                } else {
                    z = false;
                }
                zzfo zzfoVar7 = this.zzc;
                int zzd4 = zzfoVar7.zzd();
                int i4 = this.zzm;
                int i5 = this.zzj;
                if (i4 < i5) {
                    zzfoVar7.zzL(Math.min(i5 - i4, zzfoVar7.zzb()));
                }
                long zza4 = zza(this.zzc, z);
                zzfo zzfoVar8 = this.zzc;
                int zzd5 = zzfoVar8.zzd() - zzd4;
                zzfoVar8.zzK(zzd4);
                zzaek.zzb(this.zzf, this.zzc, zzd5);
                this.zzm += zzd5;
                if (zza4 != -1) {
                    zzg();
                    this.zzm = 0;
                    this.zzn = zza4;
                }
                zzfo zzfoVar9 = this.zzc;
                if (zzfoVar9.zzb() >= 16) {
                    return 0;
                }
                int zzb = zzfoVar9.zzb();
                System.arraycopy(zzfoVar9.zzM(), zzfoVar9.zzd(), zzfoVar9.zzM(), 0, zzb);
                this.zzc.zzK(0);
                this.zzc.zzJ(zzb);
                return 0;
            }
            return zzafkVar2.zza(zzadgVar, zzaecVar);
        }
    }
}
