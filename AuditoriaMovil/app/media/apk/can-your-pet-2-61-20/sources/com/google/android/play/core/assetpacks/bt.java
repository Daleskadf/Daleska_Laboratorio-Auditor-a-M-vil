package com.google.android.play.core.assetpacks;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.ZipException;
/* compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* loaded from: classes3.dex */
final class bt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static AssetLocation a(String str, String str2) throws IOException {
        Long l;
        int a;
        com.google.android.play.core.assetpacks.internal.aj.b(str != null, "Attempted to get file location from a null apk path.");
        com.google.android.play.core.assetpacks.internal.aj.b(str2 != null, String.format("Attempted to get file location in apk %s with a null file path.", str));
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        byte[] bArr = new byte[22];
        randomAccessFile.seek(randomAccessFile.length() - 22);
        randomAccessFile.readFully(bArr);
        bs b = br.b(bArr, 0) == 1347093766 ? b(bArr) : null;
        byte b2 = 5;
        if (b == null) {
            long length = randomAccessFile.length() - 22;
            int min = (int) Math.min((long) PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID, randomAccessFile.length());
            byte[] bArr2 = new byte[min];
            byte[] bArr3 = new byte[22];
            long j = length;
            loop0: while (true) {
                long j2 = length - 65536;
                long j3 = j2 < 0 ? 0L : j2;
                j = Math.max((j - min) + 3, j3);
                randomAccessFile.seek(j);
                randomAccessFile.readFully(bArr2);
                int i = min - 4;
                while (i >= 0) {
                    byte b3 = bArr2[i];
                    int i2 = b3 != b2 ? b3 != 6 ? b3 != 75 ? b3 != 80 ? -1 : 0 : 1 : 3 : 2;
                    if (i2 >= 0 && i >= i2 && br.b(bArr2, i - i2) == 1347093766) {
                        randomAccessFile.seek((j + i) - i2);
                        randomAccessFile.readFully(bArr3);
                        b = b(bArr3);
                        break loop0;
                    }
                    i -= 4;
                    b2 = 5;
                }
                if (j == j3) {
                    throw new ZipException(String.format("End Of Central Directory signature not found in APK %s", str));
                }
                b2 = 5;
            }
        }
        byte[] bytes = str2.getBytes("UTF-8");
        byte[] bArr4 = new byte[46];
        byte[] bArr5 = new byte[str2.length()];
        long j4 = b.a;
        int i3 = 0;
        while (true) {
            if (i3 >= b.b) {
                l = null;
                break;
            }
            randomAccessFile.seek(j4);
            randomAccessFile.readFully(bArr4);
            int b4 = br.b(bArr4, 0);
            if (b4 == 1347092738) {
                randomAccessFile.seek(j4 + 28);
                if (br.a(bArr4, 28) == str2.length()) {
                    randomAccessFile.seek(46 + j4);
                    randomAccessFile.read(bArr5);
                    if (Arrays.equals(bArr5, bytes)) {
                        l = Long.valueOf(br.c(bArr4, 42));
                        break;
                    }
                }
                j4 += a + 46 + br.a(bArr4, 30) + br.a(bArr4, 32);
                i3++;
            } else {
                throw new ZipException(String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", str2, str, Integer.valueOf(i3), Integer.valueOf(b.b), Integer.valueOf(b4), 1347092738));
            }
        }
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        byte[] bArr6 = new byte[8];
        randomAccessFile.seek(22 + longValue);
        randomAccessFile.readFully(bArr6);
        return new bl(str, longValue + 30 + br.a(bArr6, 4) + br.a(bArr6, 6), br.c(bArr6, 0));
    }

    private static bs b(byte[] bArr) {
        int a = br.a(bArr, 10);
        return new bs(br.c(bArr, 16), br.c(bArr, 12), a);
    }
}
