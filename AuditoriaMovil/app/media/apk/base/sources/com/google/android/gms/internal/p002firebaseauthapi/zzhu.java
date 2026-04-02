package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhu  reason: invalid package */
/* loaded from: classes.dex */
public final class zzhu {
    private static long zza(byte[] bArr, int i7, int i8) {
        return (zza(bArr, i7) >> i8) & 67108863;
    }

    private static long zza(byte[] bArr, int i7) {
        return (((bArr[i7 + 3] & ForkServer.ERROR) << 24) | (bArr[i7] & ForkServer.ERROR) | ((bArr[i7 + 1] & ForkServer.ERROR) << 8) | ((bArr[i7 + 2] & ForkServer.ERROR) << 16)) & 4294967295L;
    }

    private static void zza(byte[] bArr, long j, int i7) {
        int i8 = 0;
        while (i8 < 4) {
            bArr[i7 + i8] = (byte) (255 & j);
            i8++;
            j >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long zza = zza(bArr, 0, 0) & 67108863;
            long zza2 = zza(bArr, 3, 2) & 67108611;
            long zza3 = zza(bArr, 6, 4) & 67092735;
            long zza4 = zza(bArr, 9, 6) & 66076671;
            long zza5 = zza(bArr, 12, 8) & 1048575;
            long j = zza2 * 5;
            long j8 = zza3 * 5;
            long j9 = zza4 * 5;
            long j10 = zza5 * 5;
            int i7 = 17;
            byte[] bArr3 = new byte[17];
            long j11 = 0;
            int i8 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            while (i8 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i8);
                System.arraycopy(bArr2, i8, bArr3, 0, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i7, (byte) 0);
                }
                long zza6 = j15 + zza(bArr3, 0, 0);
                long zza7 = j11 + zza(bArr3, 3, 2);
                long zza8 = j12 + zza(bArr3, 6, 4);
                long zza9 = j13 + zza(bArr3, 9, 6);
                long zza10 = j14 + (zza(bArr3, 12, 8) | (bArr3[16] << 24));
                long j16 = (zza10 * j) + (zza9 * j8) + (zza8 * j9) + (zza7 * j10) + (zza6 * zza);
                long j17 = (zza10 * j8) + (zza9 * j9) + (zza8 * j10) + (zza7 * zza) + (zza6 * zza2);
                long j18 = (zza10 * j9) + (zza9 * j10) + (zza8 * zza) + (zza7 * zza2) + (zza6 * zza3);
                long j19 = (zza9 * zza) + (zza8 * zza2) + (zza7 * zza3) + (zza6 * zza4);
                long j20 = zza9 * zza2;
                long j21 = zza10 * zza;
                long j22 = j17 + (j16 >> 26);
                long j23 = j18 + (j22 >> 26);
                long j24 = (zza10 * j10) + j19 + (j23 >> 26);
                long j25 = j21 + j20 + (zza8 * zza3) + (zza7 * zza4) + (zza6 * zza5) + (j24 >> 26);
                long j26 = j25 >> 26;
                j14 = j25 & 67108863;
                long j27 = (j26 * 5) + (j16 & 67108863);
                i8 += 16;
                j12 = j23 & 67108863;
                j13 = j24 & 67108863;
                i7 = 17;
                j15 = j27 & 67108863;
                j11 = (j22 & 67108863) + (j27 >> 26);
            }
            long j28 = j12 + (j11 >> 26);
            long j29 = j28 & 67108863;
            long j30 = j13 + (j28 >> 26);
            long j31 = j30 & 67108863;
            long j32 = j14 + (j30 >> 26);
            long j33 = j32 & 67108863;
            long j34 = ((j32 >> 26) * 5) + j15;
            long j35 = j34 >> 26;
            long j36 = j34 & 67108863;
            long j37 = (j11 & 67108863) + j35;
            long j38 = j36 + 5;
            long j39 = j38 & 67108863;
            long j40 = (j38 >> 26) + j37;
            long j41 = j29 + (j40 >> 26);
            long j42 = j31 + (j41 >> 26);
            long j43 = (j33 + (j42 >> 26)) - 67108864;
            long j44 = j43 >> 63;
            long j45 = j36 & j44;
            long j46 = j37 & j44;
            long j47 = j29 & j44;
            long j48 = j31 & j44;
            long j49 = j33 & j44;
            long j50 = ~j44;
            long j51 = j46 | (j40 & 67108863 & j50);
            long j52 = j47 | (j41 & 67108863 & j50);
            long j53 = j48 | (j42 & 67108863 & j50);
            long j54 = j49 | (j43 & j50);
            long zza11 = ((j45 | (j39 & j50) | (j51 << 26)) & 4294967295L) + zza(bArr, 16);
            long j55 = zza11 & 4294967295L;
            long zza12 = (((j51 >> 6) | (j52 << 20)) & 4294967295L) + zza(bArr, 20) + (zza11 >> 32);
            long j56 = zza12 & 4294967295L;
            long zza13 = (((j52 >> 12) | (j53 << 14)) & 4294967295L) + zza(bArr, 24) + (zza12 >> 32);
            long j57 = zza13 & 4294967295L;
            byte[] bArr4 = new byte[16];
            zza(bArr4, j55, 0);
            zza(bArr4, j56, 4);
            zza(bArr4, j57, 8);
            zza(bArr4, ((((j53 >> 18) | (j54 << 8)) & 4294967295L) + zza(bArr, 28) + (zza13 >> 32)) & 4294967295L, 12);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }
}
