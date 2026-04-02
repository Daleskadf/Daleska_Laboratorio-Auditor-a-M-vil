package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmw  reason: invalid package */
/* loaded from: classes.dex */
public final class zzmw {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 10; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i8 = 2; i8 < 20; i8 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i9 = 2; i9 < 10; i9 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 50; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i11 = 2; i11 < 100; i11 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i12 = 2; i12 < 50; i12 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j = jArr2[0];
        long j8 = jArr2[1];
        long j9 = jArr3[0];
        jArr[1] = (j8 * j9) + (jArr3[1] * j);
        long j10 = jArr2[1];
        long j11 = jArr3[1];
        jArr[2] = (jArr2[2] * j9) + (jArr3[2] * j) + (j10 * 2 * j11);
        long j12 = jArr3[2];
        long j13 = jArr2[2];
        jArr[3] = (jArr2[3] * j9) + (jArr3[3] * j) + (j13 * j11) + (j10 * j12);
        long j14 = jArr3[3];
        long j15 = jArr2[3];
        long j16 = jArr2[4] * j9;
        jArr[4] = j16 + (jArr3[4] * j) + (((j15 * j11) + (j10 * j14)) * 2) + (j13 * j12);
        long j17 = jArr3[4];
        long j18 = (j10 * j17) + (j15 * j12) + (j13 * j14);
        long j19 = jArr2[4];
        jArr[5] = (jArr2[5] * j9) + (jArr3[5] * j) + (j19 * j11) + j18;
        long j20 = jArr3[5];
        long j21 = (j10 * j20) + (j15 * j14);
        long j22 = jArr2[5];
        jArr[6] = (jArr2[6] * j9) + (jArr3[6] * j) + (j19 * j12) + (j13 * j17) + (((j22 * j11) + j21) * 2);
        long j23 = (j22 * j12) + (j13 * j20) + (j19 * j14) + (j15 * j17);
        long j24 = jArr3[6];
        long j25 = (j10 * j24) + j23;
        long j26 = jArr2[6];
        jArr[7] = (jArr2[7] * j9) + (jArr3[7] * j) + (j26 * j11) + j25;
        long j27 = jArr3[7];
        long j28 = (j10 * j27) + (j22 * j14) + (j15 * j20);
        long j29 = jArr2[7];
        long j30 = j26 * j12;
        jArr[8] = (jArr2[8] * j9) + (jArr3[8] * j) + j30 + (j13 * j24) + (((j29 * j11) + j28) * 2) + (j19 * j17);
        long j31 = (j29 * j12) + (j13 * j27) + (j26 * j14) + (j15 * j24) + (j22 * j17) + (j19 * j20);
        long j32 = jArr3[8];
        long j33 = (j10 * j32) + j31;
        long j34 = jArr2[8];
        long j35 = (j34 * j11) + j33;
        jArr[9] = (jArr2[9] * j9) + (j * jArr3[9]) + j35;
        long j36 = (j29 * j14) + (j15 * j27) + (j22 * j20);
        long j37 = jArr3[9];
        long j38 = jArr2[9];
        long j39 = j19 * j24;
        long j40 = j26 * j17;
        jArr[10] = (j34 * j12) + (j13 * j32) + j40 + j39 + (((j11 * j38) + (j10 * j37) + j36) * 2);
        long j41 = j13 * j37;
        long j42 = j12 * j38;
        jArr[11] = j42 + j41 + (j34 * j14) + (j15 * j32) + (j29 * j17) + (j19 * j27) + (j26 * j20) + (j22 * j24);
        long j43 = j15 * j37;
        long j44 = j14 * j38;
        long j45 = j34 * j17;
        jArr[12] = j45 + (j19 * j32) + ((j44 + j43 + (j29 * j20) + (j22 * j27)) * 2) + (j26 * j24);
        long j46 = j19 * j37;
        long j47 = j17 * j38;
        jArr[13] = j47 + j46 + (j34 * j20) + (j22 * j32) + (j29 * j24) + (j26 * j27);
        long j48 = j20 * j38;
        long j49 = j26 * j32;
        long j50 = j34 * j24;
        jArr[14] = j50 + j49 + ((j48 + (j22 * j37) + (j29 * j27)) * 2);
        long j51 = j26 * j37;
        long j52 = j24 * j38;
        jArr[15] = j52 + j51 + (j34 * j27) + (j29 * j32);
        jArr[16] = (((j27 * j38) + (j29 * j37)) * 2) + (j34 * j32);
        jArr[17] = (j32 * j38) + (j34 * j37);
        jArr[18] = j38 * 2 * j37;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] - jArr3[i7];
        }
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] + jArr3[i7];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i7;
        int i8;
        long j;
        int i9;
        int i10;
        int i11;
        long j8;
        int i12;
        int i13;
        int i14;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i15 = 0;
        while (true) {
            if (i15 >= 2) {
                break;
            }
            int i16 = 0;
            while (i16 < 9) {
                long j9 = copyOf[i16];
                copyOf[i16] = j9 + (i14 << i13);
                i16++;
                copyOf[i16] = copyOf[i16] - (-((int) (((j9 >> 31) & j9) >> zzd[i16 & 1])));
            }
            long j10 = copyOf[9];
            copyOf[9] = j10 + (i12 << 25);
            copyOf[0] = copyOf[0] - ((-((int) (((j10 >> 31) & j10) >> 25))) * 19);
            i15++;
        }
        long j11 = copyOf[0];
        copyOf[0] = j11 + (i8 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j11 >> 31) & j11) >> 26)));
        int i17 = 0;
        for (i7 = 2; i17 < i7; i7 = 2) {
            int i18 = 0;
            while (i18 < 9) {
                int i19 = i18 & 1;
                copyOf[i18] = copyOf[i18] & zzc[i19];
                i18++;
                copyOf[i18] = copyOf[i18] + ((int) (j8 >> zzd[i19]));
            }
            i17++;
        }
        copyOf[9] = copyOf[9] & 33554431;
        long j12 = (((int) (j >> 25)) * 19) + copyOf[0];
        copyOf[0] = j12;
        int i20 = ~((((int) j12) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) copyOf[i21]) ^ zzc[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i20 &= (i26 & (i26 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & i20);
        long j13 = 33554431 & i20;
        copyOf[1] = copyOf[1] - j13;
        for (int i27 = 2; i27 < 10; i27 += 2) {
            copyOf[i27] = copyOf[i27] - (67108863 & i20);
            int i28 = i27 + 1;
            copyOf[i28] = copyOf[i28] - j13;
        }
        for (int i29 = 0; i29 < 10; i29++) {
            copyOf[i29] = copyOf[i29] << zzb[i29];
        }
        byte[] bArr = new byte[32];
        for (int i30 = 0; i30 < 10; i30++) {
            int i31 = zza[i30];
            long j14 = copyOf[i30];
            bArr[i31] = (byte) (bArr[i31] | (j14 & 255));
            bArr[i31 + 1] = (byte) (bArr[i9] | ((j14 >> 8) & 255));
            bArr[i31 + 2] = (byte) (bArr[i10] | ((j14 >> 16) & 255));
            bArr[i31 + 3] = (byte) (bArr[i11] | ((j14 >> 24) & 255));
        }
        return bArr;
    }

    public static void zzb(long[] jArr) {
        long j = jArr[8];
        long j8 = jArr[18];
        long j9 = j + (j8 << 4);
        jArr[8] = j9;
        long j10 = j9 + (j8 << 1);
        jArr[8] = j10;
        jArr[8] = j10 + j8;
        long j11 = jArr[7];
        long j12 = jArr[17];
        long j13 = j11 + (j12 << 4);
        jArr[7] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[7] = j14;
        jArr[7] = j14 + j12;
        long j15 = jArr[6];
        long j16 = jArr[16];
        long j17 = j15 + (j16 << 4);
        jArr[6] = j17;
        long j18 = j17 + (j16 << 1);
        jArr[6] = j18;
        jArr[6] = j18 + j16;
        long j19 = jArr[5];
        long j20 = jArr[15];
        long j21 = j19 + (j20 << 4);
        jArr[5] = j21;
        long j22 = j21 + (j20 << 1);
        jArr[5] = j22;
        jArr[5] = j22 + j20;
        long j23 = jArr[4];
        long j24 = jArr[14];
        long j25 = j23 + (j24 << 4);
        jArr[4] = j25;
        long j26 = j25 + (j24 << 1);
        jArr[4] = j26;
        jArr[4] = j26 + j24;
        long j27 = jArr[3];
        long j28 = jArr[13];
        long j29 = j27 + (j28 << 4);
        jArr[3] = j29;
        long j30 = j29 + (j28 << 1);
        jArr[3] = j30;
        jArr[3] = j30 + j28;
        long j31 = jArr[2];
        long j32 = jArr[12];
        long j33 = j31 + (j32 << 4);
        jArr[2] = j33;
        long j34 = j33 + (j32 << 1);
        jArr[2] = j34;
        jArr[2] = j34 + j32;
        long j35 = jArr[1];
        long j36 = jArr[11];
        long j37 = j35 + (j36 << 4);
        jArr[1] = j37;
        long j38 = j37 + (j36 << 1);
        jArr[1] = j38;
        jArr[1] = j38 + j36;
        long j39 = jArr[0];
        long j40 = jArr[10];
        long j41 = j39 + (j40 << 4);
        jArr[0] = j41;
        long j42 = j41 + (j40 << 1);
        jArr[0] = j42;
        jArr[0] = j42 + j40;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j8 = jArr2[1];
        long j9 = jArr2[2];
        long j10 = jArr2[3];
        long j11 = jArr2[4];
        long j12 = jArr2[5];
        long j13 = jArr2[6];
        long j14 = jArr2[7];
        long j15 = jArr2[8];
        long j16 = (((((j10 * j12) + (j8 * j14)) * 2) + (j * j15) + (j9 * j13)) * 2) + (j11 * j11);
        long j17 = jArr2[9];
        long j18 = (((((j10 * j17) + (j12 * j14)) * 2) + (j11 * j15)) * 2) + (j13 * j13);
        zze(new long[]{j * j, j * 2 * j8, ((j * j9) + (j8 * j8)) * 2, ((j * j10) + (j8 * j9)) * 2, (j * 2 * j11) + (j8 * 4 * j10) + (j9 * j9), ((j * j12) + (j8 * j11) + (j9 * j10)) * 2, ((j8 * 2 * j12) + (j * j13) + (j9 * j11) + (j10 * j10)) * 2, ((j * j14) + (j8 * j13) + (j9 * j12) + (j10 * j11)) * 2, j16, ((j * j17) + (j8 * j15) + (j9 * j14) + (j10 * j13) + (j11 * j12)) * 2, ((((j8 * j17) + (j10 * j14)) * 2) + (j9 * j15) + (j11 * j13) + (j12 * j12)) * 2, ((j9 * j17) + (j10 * j15) + (j11 * j14) + (j12 * j13)) * 2, j18, ((j11 * j17) + (j12 * j15) + (j13 * j14)) * 2, ((j12 * 2 * j17) + (j13 * j15) + (j14 * j14)) * 2, ((j13 * j17) + (j14 * j15)) * 2, (j14 * 4 * j17) + (j15 * j15), j15 * 2 * j17, 2 * j17 * j17}, jArr);
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static void zza(long[] jArr) {
        jArr[10] = 0;
        int i7 = 0;
        while (i7 < 10) {
            long j = jArr[i7];
            long j8 = j / 67108864;
            jArr[i7] = j - (j8 << 26);
            int i8 = i7 + 1;
            long j9 = jArr[i8] + j8;
            jArr[i8] = j9;
            long j10 = j9 / 33554432;
            jArr[i8] = j9 - (j10 << 25);
            i7 += 2;
            jArr[i7] = jArr[i7] + j10;
        }
        long j11 = jArr[0];
        long j12 = jArr[10];
        long j13 = j11 + (j12 << 4);
        jArr[0] = j13;
        long j14 = j13 + (j12 << 1);
        jArr[0] = j14;
        long j15 = j14 + j12;
        jArr[0] = j15;
        jArr[10] = 0;
        long j16 = j15 / 67108864;
        jArr[0] = j15 - (j16 << 26);
        jArr[1] = jArr[1] + j16;
    }

    public static void zza(long[] jArr, long[] jArr2, long j) {
        for (int i7 = 0; i7 < 10; i7++) {
            jArr[i7] = jArr2[i7] * j;
        }
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i7 = 0; i7 < 10; i7++) {
            int i8 = zza[i7];
            jArr[i7] = (((((bArr[i8] & ForkServer.ERROR) | ((bArr[i8 + 1] & ForkServer.ERROR) << 8)) | ((bArr[i8 + 2] & ForkServer.ERROR) << 16)) | ((bArr[i8 + 3] & ForkServer.ERROR) << 24)) >> zzb[i7]) & zzc[i7 & 1];
        }
        return jArr;
    }
}
