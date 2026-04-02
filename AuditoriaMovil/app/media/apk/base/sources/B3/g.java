package B3;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public abstract class g {
    static {
        new OutputStream();
    }

    public static byte[] a(ArrayDeque arrayDeque, int i7) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i7) {
            return bArr;
        }
        int length = i7 - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i7);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i7 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static byte[] b(InputStream inputStream) {
        int i7;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(8192, Math.max((int) RecognitionOptions.ITF, Integer.highestOneBit(0) * 2));
        int i8 = 0;
        while (i8 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i8);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < min2) {
                int read = inputStream.read(bArr, i9, min2 - i9);
                if (read == -1) {
                    return a(arrayDeque, i8);
                }
                i9 += read;
                i8 += read;
            }
            if (min < 4096) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            min = AbstractC1740d.u(min * i7);
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
