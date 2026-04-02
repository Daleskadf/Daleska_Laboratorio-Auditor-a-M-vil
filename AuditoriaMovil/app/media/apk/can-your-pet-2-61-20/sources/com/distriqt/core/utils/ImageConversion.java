package com.distriqt.core.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.view.ViewCompat;
/* loaded from: classes.dex */
public class ImageConversion {
    public static int BGRA_TO_ARGB(int i) {
        return ((i & 255) << 8) | ((16711680 & i) >> 16) | ((65280 & i) >> 8) | ViewCompat.MEASURED_STATE_MASK;
    }

    public static void YUV_NV21_TO_RGB(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i2) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < i) {
                int i9 = 255;
                int i10 = bArr2[(i6 * i) + i8] & 255;
                int i11 = ((i6 >> 1) * i) + i3 + (i8 & (-2));
                int i12 = bArr2[i11 + 0] & 255;
                int i13 = bArr2[i11 + 1] & 255;
                if (i10 < 16) {
                    i10 = 16;
                }
                float f = (i10 - 16) * 1.164f;
                float f2 = i12 - 128;
                int i14 = (int) ((1.596f * f2) + f);
                float f3 = i13 - 128;
                int i15 = (int) ((f - (f2 * 0.813f)) - (0.391f * f3));
                int i16 = (int) (f + (f3 * 2.018f));
                if (i14 < 0) {
                    i14 = 0;
                } else if (i14 > 255) {
                    i14 = 255;
                }
                if (i15 < 0) {
                    i15 = 0;
                } else if (i15 > 255) {
                    i15 = 255;
                }
                if (i16 < 0) {
                    i9 = 0;
                } else if (i16 <= 255) {
                    i9 = i16;
                }
                int i17 = i5 + 1;
                bArr[i5] = (byte) i9;
                int i18 = i17 + 1;
                bArr[i17] = (byte) i15;
                int i19 = i18 + 1;
                bArr[i18] = (byte) i14;
                i5 = i19 + 1;
                bArr[i19] = -1;
                i7++;
                i8++;
            }
            i4++;
            i6++;
        }
    }

    public static void JPEG_TO_RGB(byte[] bArr, byte[] bArr2, int i, int i2) throws Exception {
        if (i > 2048 || i2 > 2048) {
            throw new Exception("Image is too large to store in memory");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
        int[] iArr = new int[i * i2];
        decodeByteArray.getPixels(iArr, 0, i, 0, 0, i, i2);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i * i4;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i5 + i6];
                int i8 = i3 + 1;
                bArr[i3] = (byte) (i7 & 255);
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((i7 >> 8) & 255);
                int i10 = i9 + 1;
                bArr[i9] = (byte) ((i7 >> 16) & 255);
                i3 = i10 + 1;
                bArr[i10] = (byte) ((i7 >> 24) & 255);
            }
        }
    }
}
