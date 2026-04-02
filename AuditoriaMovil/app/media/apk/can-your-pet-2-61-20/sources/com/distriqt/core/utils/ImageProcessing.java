package com.distriqt.core.utils;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.google.logging.type.LogSeverity;
/* loaded from: classes.dex */
public abstract class ImageProcessing {
    private static int decodeYUV420SPtoRedSum(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = ((i6 >> 1) * i) + i3;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i) {
                int i11 = (bArr[i5] & 255) - 16;
                if (i11 < 0) {
                    i11 = 0;
                }
                if ((i8 & 1) == 0) {
                    int i12 = i7 + 1;
                    i10 = (bArr[i7] & 255) - 128;
                    i7 = i12 + 1;
                    i9 = (bArr[i12] & 255) - 128;
                }
                int i13 = i11 * 1192;
                int i14 = (i10 * 1634) + i13;
                int i15 = (i13 - (i10 * 833)) - (i9 * LogSeverity.WARNING_VALUE);
                int i16 = i13 + (i9 * 2066);
                if (i14 < 0) {
                    i14 = 0;
                } else if (i14 > 262143) {
                    i14 = 262143;
                }
                if (i15 < 0) {
                    i15 = 0;
                } else if (i15 > 262143) {
                    i15 = 262143;
                }
                if (i16 < 0) {
                    i16 = 0;
                } else if (i16 > 262143) {
                    i16 = 262143;
                }
                i4 += ((((i16 >> 10) & 255) | ((((i14 << 6) & 16711680) | ViewCompat.MEASURED_STATE_MASK) | ((i15 >> 2) & MotionEventCompat.ACTION_POINTER_INDEX_MASK))) >> 16) & 255;
                i8++;
                i5++;
            }
        }
        return i4;
    }

    public static int decodeYUV420SPtoRedAvg(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        return decodeYUV420SPtoRedSum(bArr, i, i2) / (i * i2);
    }
}
