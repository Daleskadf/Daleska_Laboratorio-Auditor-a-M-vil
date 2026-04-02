package com.google.android.gms.internal.auth;
/* loaded from: classes.dex */
final class zzhm extends zzhl {
    @Override // com.google.android.gms.internal.auth.zzhl
    public final int zza(int i7, byte[] bArr, int i8, int i9) {
        while (i8 < i9 && bArr[i8] >= 0) {
            i8++;
        }
        if (i8 >= i9) {
            return 0;
        }
        while (i8 < i9) {
            int i10 = i8 + 1;
            byte b5 = bArr[i8];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (i10 >= i9) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        i8 += 2;
                        if (bArr[i10] > -65) {
                        }
                    }
                    return -1;
                } else if (b5 < -16) {
                    if (i10 >= i9 - 1) {
                        return zzhn.zza(bArr, i10, i9);
                    }
                    int i11 = i8 + 2;
                    byte b7 = bArr[i10];
                    if (b7 <= -65 && ((b5 != -32 || b7 >= -96) && (b5 != -19 || b7 < -96))) {
                        i8 += 3;
                        if (bArr[i11] > -65) {
                        }
                    }
                    return -1;
                } else if (i10 >= i9 - 2) {
                    return zzhn.zza(bArr, i10, i9);
                } else {
                    int i12 = i8 + 2;
                    byte b8 = bArr[i10];
                    if (b8 <= -65) {
                        if ((((b8 + 112) + (b5 << 28)) >> 30) == 0) {
                            int i13 = i8 + 3;
                            if (bArr[i12] <= -65) {
                                i8 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
            }
            i8 = i10;
        }
        return 0;
    }
}
