package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalu {
    private final zzfo zza = new zzfo();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzb(zzalu zzaluVar, zzfo zzfoVar, int i) {
        int zzo;
        if (i < 4) {
            return;
        }
        zzfoVar.zzL(3);
        int i2 = i - 4;
        if ((zzfoVar.zzm() & 128) != 0) {
            if (i2 < 7 || (zzo = zzfoVar.zzo()) < 4) {
                return;
            }
            zzaluVar.zzh = zzfoVar.zzq();
            zzaluVar.zzi = zzfoVar.zzq();
            zzaluVar.zza.zzH(zzo - 4);
            i2 -= 7;
        }
        zzfo zzfoVar2 = zzaluVar.zza;
        int zzd = zzfoVar2.zzd();
        int zze = zzfoVar2.zze();
        if (zzd >= zze || i2 <= 0) {
            return;
        }
        int min = Math.min(i2, zze - zzd);
        zzfoVar.zzG(zzfoVar2.zzM(), zzd, min);
        zzaluVar.zza.zzK(zzd + min);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzc(zzalu zzaluVar, zzfo zzfoVar, int i) {
        if (i < 19) {
            return;
        }
        zzaluVar.zzd = zzfoVar.zzq();
        zzaluVar.zze = zzfoVar.zzq();
        zzfoVar.zzL(11);
        zzaluVar.zzf = zzfoVar.zzq();
        zzaluVar.zzg = zzfoVar.zzq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzd(zzalu zzaluVar, zzfo zzfoVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzfoVar.zzL(2);
        int i2 = 0;
        Arrays.fill(zzaluVar.zzb, 0);
        int i3 = i / 5;
        int i4 = 0;
        while (i4 < i3) {
            int zzm = zzfoVar.zzm();
            int zzm2 = zzfoVar.zzm();
            int zzm3 = zzfoVar.zzm();
            int zzm4 = zzfoVar.zzm();
            double d = zzm2;
            double d2 = zzm3 - 128;
            double d3 = zzm4 - 128;
            zzaluVar.zzb[zzm] = Math.max(0, Math.min((int) (d + (d3 * 1.772d)), 255)) | (zzfoVar.zzm() << 24) | (Math.max(i2, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8);
            i4++;
            i2 = 0;
        }
        zzaluVar.zzc = true;
    }

    public final zzec zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzfo zzfoVar = this.zza;
        if (zzfoVar.zze() != 0 && zzfoVar.zzd() == zzfoVar.zze() && this.zzc) {
            zzfoVar.zzK(0);
            int i2 = this.zzh * this.zzi;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int zzm = this.zza.zzm();
                if (zzm != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.zzb[zzm];
                } else {
                    int zzm2 = this.zza.zzm();
                    if (zzm2 != 0) {
                        int i4 = zzm2 & 63;
                        if ((zzm2 & 64) != 0) {
                            i4 = (i4 << 8) | this.zza.zzm();
                        }
                        i = i4 + i3;
                        Arrays.fill(iArr, i3, i, (zzm2 & 128) == 0 ? 0 : this.zzb[this.zza.zzm()]);
                    }
                }
                i3 = i;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
            zzea zzeaVar = new zzea();
            zzeaVar.zzc(createBitmap);
            zzeaVar.zzh(this.zzf / this.zzd);
            zzeaVar.zzi(0);
            zzeaVar.zze(this.zzg / this.zze, 0);
            zzeaVar.zzf(0);
            zzeaVar.zzk(this.zzh / this.zzd);
            zzeaVar.zzd(this.zzi / this.zze);
            return zzeaVar.zzp();
        }
        return null;
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzH(0);
        this.zzc = false;
    }
}
