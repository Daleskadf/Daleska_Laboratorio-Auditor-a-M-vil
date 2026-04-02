package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzapc {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzfo zzfoVar, int i, int i2) {
        zzfoVar.zzK(i);
        if (zzfoVar.zzb() < 5) {
            return -9223372036854775807L;
        }
        int zzg = zzfoVar.zzg();
        if ((8388608 & zzg) != 0 || ((zzg >> 8) & 8191) != i2 || (zzg & 32) == 0 || zzfoVar.zzm() < 7 || zzfoVar.zzb() < 7 || (zzfoVar.zzm() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzfoVar.zzG(bArr, 0, 6);
        long j = bArr[3] & 255;
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
    }
}
