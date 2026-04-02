package org.apache.tika.io;

import java.io.InputStream;
/* loaded from: classes.dex */
public class IOUtils {
    public static long skip(InputStream inputStream, long j, byte[] bArr) {
        if (j >= 0) {
            long j8 = j;
            while (j8 > 0) {
                long read = inputStream.read(bArr, 0, (int) Math.min(j8, bArr.length));
                if (read < 0) {
                    break;
                }
                j8 -= read;
            }
            return j - j8;
        }
        throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.g("Skip count must be non-negative, actual: ", j));
    }
}
