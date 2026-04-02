package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.util.Arrays;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzank implements zzano {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;
    private final zzfn zzc = new zzfn(new byte[7], 7);
    private final zzfo zzd = new zzfo(Arrays.copyOf(zza, 10));
    private final String zze;
    private final int zzf;
    private String zzg;
    private zzaem zzh;
    private zzaem zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private zzaem zzv;
    private long zzw;

    public zzank(boolean z, String str, int i) {
        zzh();
        this.zzo = -1;
        this.zzp = -1;
        this.zzs = -9223372036854775807L;
        this.zzu = -9223372036854775807L;
        this.zzb = z;
        this.zze = str;
        this.zzf = i;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    private final void zzg() {
        this.zzn = false;
        zzh();
    }

    private final void zzh() {
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = 256;
    }

    private final void zzi() {
        this.zzj = 3;
        this.zzk = 0;
    }

    private final void zzj(zzaem zzaemVar, long j, int i, int i2) {
        this.zzj = 4;
        this.zzk = i;
        this.zzv = zzaemVar;
        this.zzw = j;
        this.zzt = i2;
    }

    private final boolean zzk(zzfo zzfoVar, byte[] bArr, int i) {
        int min = Math.min(zzfoVar.zzb(), i - this.zzk);
        zzfoVar.zzG(bArr, this.zzk, min);
        int i2 = this.zzk + min;
        this.zzk = i2;
        return i2 == i;
    }

    private static final boolean zzl(byte b, byte b2) {
        return zzf((b2 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzfo zzfoVar, byte[] bArr, int i) {
        if (zzfoVar.zzb() < i) {
            return false;
        }
        zzfoVar.zzG(bArr, 0, i);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) throws zzcc {
        int i;
        int i2;
        int i3;
        this.zzh.getClass();
        int i4 = zzfx.zza;
        while (zzfoVar.zzb() > 0) {
            int i5 = this.zzj;
            int i6 = 13;
            int i7 = 2;
            if (i5 == 0) {
                byte[] zzM = zzfoVar.zzM();
                int zzd = zzfoVar.zzd();
                int zze = zzfoVar.zze();
                while (true) {
                    if (zzd < zze) {
                        i = zzd + 1;
                        i2 = zzM[zzd] & 255;
                        if (this.zzl == 512 && zzl((byte) -1, (byte) i2)) {
                            if (!this.zzn) {
                                int i8 = i - 2;
                                zzfoVar.zzK(i8 + 1);
                                if (zzm(zzfoVar, this.zzc.zza, 1)) {
                                    this.zzc.zzk(4);
                                    int zzd2 = this.zzc.zzd(1);
                                    int i9 = this.zzo;
                                    if (i9 == -1 || zzd2 == i9) {
                                        if (this.zzp != -1) {
                                            if (!zzm(zzfoVar, this.zzc.zza, 1)) {
                                                break;
                                            }
                                            this.zzc.zzk(i7);
                                            if (this.zzc.zzd(4) == this.zzp) {
                                                zzfoVar.zzK(i8 + 2);
                                            }
                                        }
                                        if (!zzm(zzfoVar, this.zzc.zza, 4)) {
                                            break;
                                        }
                                        this.zzc.zzk(14);
                                        int zzd3 = this.zzc.zzd(i6);
                                        if (zzd3 >= 7) {
                                            byte[] zzM2 = zzfoVar.zzM();
                                            int zze2 = zzfoVar.zze();
                                            int i10 = i8 + zzd3;
                                            if (i10 < zze2) {
                                                byte b = zzM2[i10];
                                                if (b != -1) {
                                                    if (b == 73) {
                                                        int i11 = i10 + 1;
                                                        if (i11 == zze2) {
                                                            break;
                                                        } else if (zzM2[i11] == 68) {
                                                            int i12 = i10 + 2;
                                                            if (i12 == zze2) {
                                                                break;
                                                            } else if (zzM2[i12] == 51) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int i13 = i10 + 1;
                                                    if (i13 == zze2) {
                                                        break;
                                                    }
                                                    byte b2 = zzM2[i13];
                                                    if (zzl((byte) -1, b2) && ((b2 & 8) >> 3) == zzd2) {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        int i14 = this.zzl;
                        int i15 = i14 | i2;
                        if (i15 == 329) {
                            i3 = 768;
                        } else if (i15 == 511) {
                            i3 = 512;
                        } else if (i15 == 836) {
                            i3 = 1024;
                        } else if (i15 == 1075) {
                            this.zzj = 2;
                            this.zzk = 3;
                            this.zzt = 0;
                            this.zzd.zzK(0);
                            zzfoVar.zzK(i);
                            break;
                        } else if (i14 != 256) {
                            this.zzl = 256;
                            zzd = i - 1;
                            i6 = 13;
                            i7 = 2;
                        } else {
                            zzd = i;
                            i6 = 13;
                            i7 = 2;
                        }
                        this.zzl = i3;
                        zzd = i;
                        i6 = 13;
                        i7 = 2;
                    } else {
                        zzfoVar.zzK(zzd);
                        break;
                    }
                }
                this.zzq = (i2 & 8) >> 3;
                this.zzm = 1 == ((i2 & 1) ^ 1);
                if (this.zzn) {
                    zzi();
                } else {
                    this.zzj = 1;
                    this.zzk = 0;
                }
                zzfoVar.zzK(i);
            } else if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        int min = Math.min(zzfoVar.zzb(), this.zzt - this.zzk);
                        this.zzv.zzq(zzfoVar, min);
                        int i16 = this.zzk + min;
                        this.zzk = i16;
                        if (i16 == this.zzt) {
                            zzek.zzf(this.zzu != -9223372036854775807L);
                            this.zzv.zzs(this.zzu, 1, this.zzt, 0, null);
                            this.zzu += this.zzw;
                            zzh();
                        }
                    } else {
                        if (zzk(zzfoVar, this.zzc.zza, true != this.zzm ? 5 : 7)) {
                            this.zzc.zzk(0);
                            if (!this.zzr) {
                                int zzd4 = this.zzc.zzd(2) + 1;
                                if (zzd4 != 2) {
                                    zzfe.zzf("AdtsReader", "Detected audio object type: " + zzd4 + ", but assuming AAC LC.");
                                }
                                this.zzc.zzm(5);
                                int zzd5 = this.zzc.zzd(3);
                                int i17 = this.zzp;
                                int i18 = zzacb.zza;
                                byte[] bArr = {(byte) (((i17 >> 1) & 7) | 16), (byte) (((zzd5 << 3) & 120) | ((i17 << 7) & 128))};
                                zzaca zza2 = zzacb.zza(bArr);
                                zzak zzakVar = new zzak();
                                zzakVar.zzK(this.zzg);
                                zzakVar.zzW("audio/mp4a-latm");
                                zzakVar.zzz(zza2.zzc);
                                zzakVar.zzy(zza2.zzb);
                                zzakVar.zzX(zza2.zza);
                                zzakVar.zzL(Collections.singletonList(bArr));
                                zzakVar.zzN(this.zze);
                                zzakVar.zzU(this.zzf);
                                zzam zzac = zzakVar.zzac();
                                this.zzs = 1024000000 / zzac.zzA;
                                this.zzh.zzl(zzac);
                                this.zzr = true;
                            } else {
                                this.zzc.zzm(10);
                            }
                            this.zzc.zzm(4);
                            int zzd6 = this.zzc.zzd(13) - 7;
                            if (this.zzm) {
                                zzd6 -= 2;
                            }
                            zzj(this.zzh, this.zzs, 0, zzd6);
                        }
                    }
                } else if (zzk(zzfoVar, this.zzd.zzM(), 10)) {
                    this.zzi.zzq(this.zzd, 10);
                    this.zzd.zzK(6);
                    zzj(this.zzi, 0L, 10, 10 + this.zzd.zzl());
                }
            } else if (zzfoVar.zzb() != 0) {
                zzfn zzfnVar = this.zzc;
                zzfnVar.zza[0] = zzfoVar.zzM()[zzfoVar.zzd()];
                zzfnVar.zzk(2);
                int zzd7 = this.zzc.zzd(4);
                int i19 = this.zzp;
                if (i19 == -1 || zzd7 == i19) {
                    if (!this.zzn) {
                        this.zzn = true;
                        this.zzo = this.zzq;
                        this.zzp = zzd7;
                    }
                    zzi();
                } else {
                    zzg();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzg = zzapaVar.zzb();
        zzaem zzw = zzadiVar.zzw(zzapaVar.zza(), 1);
        this.zzh = zzw;
        this.zzv = zzw;
        if (!this.zzb) {
            this.zzi = new zzade();
            return;
        }
        zzapaVar.zzc();
        zzaem zzw2 = zzadiVar.zzw(zzapaVar.zza(), 5);
        this.zzi = zzw2;
        zzak zzakVar = new zzak();
        zzakVar.zzK(zzapaVar.zzb());
        zzakVar.zzW("application/id3");
        zzw2.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzu = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        this.zzu = -9223372036854775807L;
        zzg();
    }
}
