package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzant implements zzano {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzapd zzb;
    private final zzfo zzc;
    private final boolean[] zzd;
    private final zzanr zze;
    private final zzaod zzf;
    private zzans zzg;
    private long zzh;
    private String zzi;
    private zzaem zzj;
    private boolean zzk;
    private long zzl;

    public zzant() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zza(zzfo zzfoVar) {
        int i;
        float f;
        float f2;
        zzek.zzb(this.zzg);
        zzek.zzb(this.zzj);
        int zzd = zzfoVar.zzd();
        int zze = zzfoVar.zze();
        byte[] zzM = zzfoVar.zzM();
        this.zzh += zzfoVar.zzb();
        this.zzj.zzq(zzfoVar, zzfoVar.zzb());
        while (true) {
            int zza2 = zzgl.zza(zzM, zzd, zze, this.zzd);
            if (zza2 == zze) {
                break;
            }
            int i2 = zza2 + 3;
            int i3 = zzfoVar.zzM()[i2] & 255;
            int i4 = zza2 - zzd;
            if (!this.zzk) {
                if (i4 > 0) {
                    this.zze.zza(zzM, zzd, zza2);
                }
                if (this.zze.zzc(i3, i4 < 0 ? -i4 : 0)) {
                    zzaem zzaemVar = this.zzj;
                    zzanr zzanrVar = this.zze;
                    int i5 = zzanrVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzanrVar.zzc, zzanrVar.zza);
                    zzfn zzfnVar = new zzfn(copyOf, copyOf.length);
                    zzfnVar.zzn(i5);
                    zzfnVar.zzn(4);
                    zzfnVar.zzl();
                    zzfnVar.zzm(8);
                    if (zzfnVar.zzo()) {
                        zzfnVar.zzm(4);
                        zzfnVar.zzm(3);
                    }
                    int zzd2 = zzfnVar.zzd(4);
                    if (zzd2 == 15) {
                        int zzd3 = zzfnVar.zzd(8);
                        int zzd4 = zzfnVar.zzd(8);
                        if (zzd4 == 0) {
                            zzfe.zzf("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = zzd3 / zzd4;
                            f2 = f;
                        }
                    } else if (zzd2 < 7) {
                        f = zza[zzd2];
                        f2 = f;
                    } else {
                        zzfe.zzf("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzfnVar.zzo()) {
                        zzfnVar.zzm(2);
                        zzfnVar.zzm(1);
                        if (zzfnVar.zzo()) {
                            zzfnVar.zzm(15);
                            zzfnVar.zzl();
                            zzfnVar.zzm(15);
                            zzfnVar.zzl();
                            zzfnVar.zzm(15);
                            zzfnVar.zzl();
                            zzfnVar.zzm(3);
                            zzfnVar.zzm(11);
                            zzfnVar.zzl();
                            zzfnVar.zzm(15);
                            zzfnVar.zzl();
                        }
                    }
                    if (zzfnVar.zzd(2) != 0) {
                        zzfe.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzfnVar.zzl();
                    int zzd5 = zzfnVar.zzd(16);
                    zzfnVar.zzl();
                    if (zzfnVar.zzo()) {
                        if (zzd5 == 0) {
                            zzfe.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i6 = zzd5 - 1;
                            int i7 = 0;
                            while (i6 > 0) {
                                i6 >>= 1;
                                i7++;
                            }
                            zzfnVar.zzm(i7);
                        }
                    }
                    zzfnVar.zzl();
                    int zzd6 = zzfnVar.zzd(13);
                    zzfnVar.zzl();
                    int zzd7 = zzfnVar.zzd(13);
                    zzfnVar.zzl();
                    zzfnVar.zzl();
                    zzak zzakVar = new zzak();
                    zzakVar.zzK(str);
                    zzakVar.zzW("video/mp4v-es");
                    zzakVar.zzab(zzd6);
                    zzakVar.zzI(zzd7);
                    zzakVar.zzS(f2);
                    zzakVar.zzL(Collections.singletonList(copyOf));
                    zzaemVar.zzl(zzakVar.zzac());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzM, zzd, zza2);
            zzaod zzaodVar = this.zzf;
            if (zzaodVar != null) {
                if (i4 > 0) {
                    zzaodVar.zza(zzM, zzd, zza2);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.zzf.zzd(i)) {
                    zzaod zzaodVar2 = this.zzf;
                    int zzb = zzgl.zzb(zzaodVar2.zza, zzaodVar2.zzb);
                    zzfo zzfoVar2 = this.zzc;
                    int i8 = zzfx.zza;
                    zzfoVar2.zzI(this.zzf.zza, zzb);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if (i3 == 178) {
                    if (zzfoVar.zzM()[zza2 + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i3 = 178;
                }
            }
            int i9 = zze - zza2;
            this.zzg.zzb(this.zzh - i9, i9, this.zzk);
            this.zzg.zzc(i3, this.zzl);
            zzd = i2;
        }
        if (!this.zzk) {
            this.zze.zza(zzM, zzd, zze);
        }
        this.zzg.zza(zzM, zzd, zze);
        zzaod zzaodVar3 = this.zzf;
        if (zzaodVar3 != null) {
            zzaodVar3.zza(zzM, zzd, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzb(zzadi zzadiVar, zzapa zzapaVar) {
        zzapaVar.zzc();
        this.zzi = zzapaVar.zzb();
        zzaem zzw = zzadiVar.zzw(zzapaVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzans(zzw);
        zzapd zzapdVar = this.zzb;
        if (zzapdVar != null) {
            zzapdVar.zzb(zzadiVar, zzapaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzc(boolean z) {
        zzek.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzano
    public final void zze() {
        zzgl.zzf(this.zzd);
        this.zze.zzb();
        zzans zzansVar = this.zzg;
        if (zzansVar != null) {
            zzansVar.zzd();
        }
        zzaod zzaodVar = this.zzf;
        if (zzaodVar != null) {
            zzaodVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzant(zzapd zzapdVar) {
        zzfo zzfoVar;
        this.zzb = zzapdVar;
        this.zzd = new boolean[4];
        this.zze = new zzanr(128);
        this.zzl = -9223372036854775807L;
        if (zzapdVar != null) {
            this.zzf = new zzaod(178, 128);
            zzfoVar = new zzfo();
        } else {
            zzfoVar = null;
            this.zzf = null;
        }
        this.zzc = zzfoVar;
    }
}
