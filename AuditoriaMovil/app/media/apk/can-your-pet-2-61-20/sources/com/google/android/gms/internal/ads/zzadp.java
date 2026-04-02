package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzadp {
    public static zzadr zzb(zzfo zzfoVar) {
        zzfoVar.zzL(1);
        int zzo = zzfoVar.zzo();
        long zzd = zzfoVar.zzd();
        long j = zzo;
        int i = zzo / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzt = zzfoVar.zzt();
            if (zzt != -1) {
                jArr[i2] = zzt;
                jArr2[i2] = zzfoVar.zzt();
                zzfoVar.zzL(2);
                i2++;
            } else {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
        }
        zzfoVar.zzL((int) ((zzd + j) - zzfoVar.zzd()));
        return new zzadr(jArr, jArr2);
    }

    public static zzby zza(zzadg zzadgVar, boolean z) throws IOException {
        zzby zza = new zzadx().zza(zzadgVar, z ? null : zzahc.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }
}
