package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhh  reason: invalid package */
/* loaded from: classes.dex */
final class zzhh {
    private static final int[] zza = zza(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    private static int zza(int i7, int i8) {
        return (i7 >>> (-i8)) | (i7 << i8);
    }

    public static int[] zzb(int[] iArr, int[] iArr2) {
        zza(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        zza(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    private static void zza(int[] iArr, int i7, int i8, int i9, int i10) {
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int zza2 = zza(i11 ^ iArr[i10], 16);
        iArr[i10] = zza2;
        int i12 = iArr[i9] + zza2;
        iArr[i9] = i12;
        int zza3 = zza(iArr[i8] ^ i12, 12);
        iArr[i8] = zza3;
        int i13 = iArr[i7] + zza3;
        iArr[i7] = i13;
        int zza4 = zza(iArr[i10] ^ i13, 8);
        iArr[i10] = zza4;
        int i14 = iArr[i9] + zza4;
        iArr[i9] = i14;
        iArr[i8] = zza(iArr[i8] ^ i14, 7);
    }

    public static void zza(int[] iArr, int[] iArr2) {
        int[] iArr3 = zza;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void zza(int[] iArr) {
        for (int i7 = 0; i7 < 10; i7++) {
            zza(iArr, 0, 4, 8, 12);
            zza(iArr, 1, 5, 9, 13);
            zza(iArr, 2, 6, 10, 14);
            zza(iArr, 3, 7, 11, 15);
            zza(iArr, 0, 5, 10, 15);
            zza(iArr, 1, 6, 11, 12);
            zza(iArr, 2, 7, 8, 13);
            zza(iArr, 3, 4, 9, 14);
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        int[] zzb = zzb(zza(bArr), zza(bArr2));
        ByteBuffer order = ByteBuffer.allocate(zzb.length << 2).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb);
        return order.array();
    }

    public static int[] zza(byte[] bArr) {
        if (bArr.length % 4 == 0) {
            IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
            int[] iArr = new int[asIntBuffer.remaining()];
            asIntBuffer.get(iArr);
            return iArr;
        }
        throw new IllegalArgumentException("invalid input length");
    }
}
