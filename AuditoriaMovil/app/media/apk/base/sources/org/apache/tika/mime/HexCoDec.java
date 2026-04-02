package org.apache.tika.mime;

import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public class HexCoDec {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    private static int hexCharToNibble(char c8) {
        if (c8 >= '0' && c8 <= '9') {
            return c8 - '0';
        }
        if (c8 >= 'a' && c8 <= 'f') {
            return c8 - 'W';
        }
        if (c8 >= 'A' && c8 <= 'F') {
            return c8 - '7';
        }
        throw new IllegalArgumentException("Not a hex char - '" + c8 + "'");
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static char[] encode(byte[] bArr, int i7, int i8) {
        char[] cArr = new char[i8 * 2];
        int i9 = 0;
        int i10 = 0;
        while (i9 < i8) {
            int i11 = i7 + 1;
            byte b5 = bArr[i7];
            int i12 = b5 & ForkServer.ERROR;
            int i13 = i10 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i10] = cArr2[i12 >> 4];
            i10 += 2;
            cArr[i13] = cArr2[b5 & 15];
            i9++;
            i7 = i11;
        }
        return cArr;
    }

    public static byte[] decode(char[] cArr, int i7, int i8) {
        if ((i8 & 1) == 0) {
            int i9 = i8 / 2;
            byte[] bArr = new byte[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = i7 + 1;
                i7 += 2;
                bArr[i10] = (byte) ((hexCharToNibble(cArr[i7]) * 16) + hexCharToNibble(cArr[i11]));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length must be even");
    }
}
