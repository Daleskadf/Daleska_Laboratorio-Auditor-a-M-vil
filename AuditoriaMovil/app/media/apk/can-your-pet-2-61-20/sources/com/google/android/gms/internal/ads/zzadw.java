package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadw {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzadw(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = f;
        this.zzi = str;
    }

    public static zzadw zza(zzfo zzfoVar) throws zzcc {
        int i;
        int i2;
        int i3;
        try {
            zzfoVar.zzL(21);
            int zzm = zzfoVar.zzm() & 3;
            int zzm2 = zzfoVar.zzm();
            int zzd = zzfoVar.zzd();
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < zzm2; i6++) {
                zzfoVar.zzL(1);
                int zzq = zzfoVar.zzq();
                for (int i7 = 0; i7 < zzq; i7++) {
                    int zzq2 = zzfoVar.zzq();
                    i5 += zzq2 + 4;
                    zzfoVar.zzL(zzq2);
                }
            }
            zzfoVar.zzK(zzd);
            byte[] bArr = new byte[i5];
            String str = null;
            int i8 = 0;
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            while (i8 < zzm2) {
                int zzm3 = zzfoVar.zzm() & 63;
                int zzq3 = zzfoVar.zzq();
                int i17 = 0;
                while (i17 < zzq3) {
                    int zzq4 = zzfoVar.zzq();
                    int i18 = zzm2;
                    System.arraycopy(zzgl.zza, i4, bArr, i9, 4);
                    int i19 = i9 + 4;
                    System.arraycopy(zzfoVar.zzM(), zzfoVar.zzd(), bArr, i19, zzq4);
                    int i20 = i19 + zzq4;
                    if (zzm3 == 33 && i17 == 0) {
                        zzgi zzc = zzgl.zzc(bArr, i19 + 2, i20);
                        i10 = zzc.zzi;
                        i11 = zzc.zzj;
                        i12 = zzc.zze + 8;
                        i13 = zzc.zzf + 8;
                        int i21 = zzc.zzl;
                        int i22 = zzc.zzm;
                        int i23 = zzc.zzn;
                        i = i20;
                        float f2 = zzc.zzk;
                        i2 = zzm3;
                        i3 = zzq3;
                        str = zzem.zzb(zzc.zza, zzc.zzb, zzc.zzc, zzc.zzd, zzc.zzg, zzc.zzh);
                        f = f2;
                        i14 = i21;
                        i16 = i23;
                        i15 = i22;
                        i17 = 0;
                    } else {
                        i = i20;
                        i2 = zzm3;
                        i3 = zzq3;
                    }
                    zzfoVar.zzL(zzq4);
                    i17++;
                    zzm2 = i18;
                    i9 = i;
                    zzm3 = i2;
                    zzq3 = i3;
                    i4 = 0;
                }
                i8++;
                i4 = 0;
            }
            return new zzadw(i5 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), zzm + 1, i10, i11, i12, i13, i14, i15, i16, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzcc.zza("Error parsing HEVC config", e);
        }
    }
}
