package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaof implements zzapb {
    private final zzano zza;
    private final zzfn zzb = new zzfn(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzfv zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzaof(zzano zzanoVar) {
        this.zza = zzanoVar;
    }

    private final void zzd(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zze(zzfo zzfoVar, byte[] bArr, int i) {
        int min = Math.min(zzfoVar.zzb(), i - this.zzd);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzfoVar.zzL(min);
        } else {
            zzfoVar.zzG(bArr, this.zzd, min);
        }
        int i2 = this.zzd + min;
        this.zzd = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zza(zzfo zzfoVar, int i) throws zzcc {
        int i2;
        long j;
        int i3;
        zzek.zzb(this.zze);
        int i4 = -1;
        int i5 = 2;
        ?? r6 = 0;
        int i6 = 1;
        if ((i & 1) != 0) {
            int i7 = this.zzc;
            if (i7 != 0 && i7 != 1) {
                if (i7 != 2) {
                    int i8 = this.zzj;
                    if (i8 != -1) {
                        zzfe.zzf("PesReader", "Unexpected start indicator: expected " + i8 + " more bytes");
                    }
                    this.zza.zzc(zzfoVar.zze() == 0);
                } else {
                    zzfe.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zzd(1);
        }
        int i9 = i;
        while (zzfoVar.zzb() > 0) {
            int i10 = this.zzc;
            if (i10 == 0) {
                zzfoVar.zzL(zzfoVar.zzb());
            } else if (i10 != i6) {
                if (i10 != i5) {
                    int zzb = zzfoVar.zzb();
                    int i11 = this.zzj;
                    int i12 = i11 == i4 ? 0 : zzb - i11;
                    if (i12 > 0) {
                        zzb -= i12;
                        zzfoVar.zzJ(zzfoVar.zzd() + zzb);
                    }
                    this.zza.zza(zzfoVar);
                    int i13 = this.zzj;
                    if (i13 != i4) {
                        int i14 = i13 - zzb;
                        this.zzj = i14;
                        if (i14 == 0) {
                            this.zza.zzc(r6);
                            zzd(i6);
                        }
                    }
                } else {
                    if (zze(zzfoVar, this.zzb.zza, Math.min(10, this.zzi)) && zze(zzfoVar, null, this.zzi)) {
                        this.zzb.zzk(r6);
                        if (this.zzf) {
                            this.zzb.zzm(4);
                            long zzd = this.zzb.zzd(3);
                            this.zzb.zzm(i6);
                            int zzd2 = this.zzb.zzd(15) << 15;
                            this.zzb.zzm(i6);
                            long zzd3 = this.zzb.zzd(15);
                            this.zzb.zzm(i6);
                            if (this.zzh || !this.zzg) {
                                i3 = zzd2;
                            } else {
                                this.zzb.zzm(4);
                                this.zzb.zzm(i6);
                                this.zzb.zzm(i6);
                                long zzd4 = this.zzb.zzd(15);
                                this.zzb.zzm(i6);
                                i3 = zzd2;
                                this.zze.zzb((this.zzb.zzd(3) << 30) | (this.zzb.zzd(15) << 15) | zzd4);
                                this.zzh = true;
                            }
                            j = this.zze.zzb((zzd << 30) | i3 | zzd3);
                        } else {
                            j = -9223372036854775807L;
                        }
                        i9 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(j, i9);
                        zzd(3);
                        i4 = -1;
                    }
                }
            } else if (zze(zzfoVar, this.zzb.zza, 9)) {
                this.zzb.zzk(0);
                int zzd5 = this.zzb.zzd(24);
                if (zzd5 != 1) {
                    zzfe.zzf("PesReader", "Unexpected start code prefix: " + zzd5);
                    i4 = -1;
                    this.zzj = -1;
                    i2 = 0;
                } else {
                    this.zzb.zzm(8);
                    zzfn zzfnVar = this.zzb;
                    int zzd6 = zzfnVar.zzd(16);
                    zzfnVar.zzm(5);
                    this.zzk = this.zzb.zzo();
                    this.zzb.zzm(2);
                    this.zzf = this.zzb.zzo();
                    this.zzg = this.zzb.zzo();
                    this.zzb.zzm(6);
                    int zzd7 = this.zzb.zzd(8);
                    this.zzi = zzd7;
                    if (zzd6 == 0) {
                        this.zzj = -1;
                    } else {
                        int i15 = (zzd6 - 3) - zzd7;
                        this.zzj = i15;
                        if (i15 < 0) {
                            zzfe.zzf("PesReader", "Found negative packet payload size: " + i15);
                            i4 = -1;
                            this.zzj = -1;
                            i2 = 2;
                        }
                    }
                    i4 = -1;
                    i2 = 2;
                }
                zzd(i2);
            } else {
                i4 = -1;
            }
            i5 = 2;
            r6 = 0;
            i6 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzb(zzfv zzfvVar, zzadi zzadiVar, zzapa zzapaVar) {
        this.zze = zzfvVar;
        this.zza.zzb(zzadiVar, zzapaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapb
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }
}
