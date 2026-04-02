package io.jsonwebtoken.io;

import com.google.common.primitives.UnsignedBytes;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import java.util.Arrays;
/* loaded from: classes3.dex */
final class Base64 {
    private static final char[] BASE64URL_ALPHABET;
    private static final int[] BASE64URL_IALPHABET;
    private static final char[] BASE64_ALPHABET;
    private static final int[] BASE64_IALPHABET;
    static final Base64 DEFAULT;
    private static final int IALPHABET_MAX_INDEX;
    static final Base64 URL_SAFE;
    private final char[] ALPHABET;
    private final int[] IALPHABET;
    private final boolean urlsafe;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        BASE64_ALPHABET = charArray;
        BASE64URL_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
        int[] iArr = new int[256];
        BASE64_IALPHABET = iArr;
        int[] iArr2 = new int[256];
        BASE64URL_IALPHABET = iArr2;
        IALPHABET_MAX_INDEX = iArr.length - 1;
        Arrays.fill(iArr, -1);
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        int length = charArray.length;
        for (int i10 = 0; i10 < length; i10++) {
            BASE64_IALPHABET[BASE64_ALPHABET[i10]] = i10;
            BASE64URL_IALPHABET[BASE64URL_ALPHABET[i10]] = i10;
        }
        BASE64_IALPHABET[61] = 0;
        BASE64URL_IALPHABET[61] = 0;
        DEFAULT = new Base64(false);
        URL_SAFE = new Base64(true);
    }

    private Base64(boolean z10) {
        char[] cArr;
        int[] iArr;
        this.urlsafe = z10;
        if (z10) {
            cArr = BASE64URL_ALPHABET;
        } else {
            cArr = BASE64_ALPHABET;
        }
        this.ALPHABET = cArr;
        if (z10) {
            iArr = BASE64URL_IALPHABET;
        } else {
            iArr = BASE64_IALPHABET;
        }
        this.IALPHABET = iArr;
    }

    private int ctoi(char c10) {
        int i10;
        if (c10 > IALPHABET_MAX_INDEX) {
            i10 = -1;
        } else {
            i10 = this.IALPHABET[c10];
        }
        if (i10 >= 0) {
            return i10;
        }
        throw new DecodingException("Illegal " + getName() + " character: '" + c10 + "'");
    }

    private char[] encodeToChar(byte[] bArr, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (bArr != null) {
            i10 = bArr.length;
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return new char[0];
        }
        int i15 = (i10 / 3) * 3;
        int i16 = i10 - i15;
        int i17 = i10 - 1;
        int i18 = ((i17 / 3) + 1) << 2;
        if (z10) {
            i11 = ((i18 - 1) / 76) << 1;
        } else {
            i11 = 0;
        }
        int i19 = i18 + i11;
        if (i16 == 2) {
            i12 = 1;
        } else if (i16 == 1) {
            i12 = 2;
        } else {
            i12 = 0;
        }
        if (this.urlsafe) {
            i13 = i19 - i12;
        } else {
            i13 = i19;
        }
        char[] cArr = new char[i13];
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i20 < i15) {
            int i23 = i20 + 1;
            int i24 = i23 + 1;
            int i25 = ((bArr[i20] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i23] & UnsignedBytes.MAX_VALUE) << 8);
            int i26 = i24 + 1;
            int i27 = i25 | (bArr[i24] & UnsignedBytes.MAX_VALUE);
            int i28 = i21 + 1;
            char[] cArr2 = this.ALPHABET;
            cArr[i21] = cArr2[(i27 >>> 18) & 63];
            int i29 = i28 + 1;
            cArr[i28] = cArr2[(i27 >>> 12) & 63];
            int i30 = i29 + 1;
            cArr[i29] = cArr2[(i27 >>> 6) & 63];
            i21 = i30 + 1;
            cArr[i30] = cArr2[i27 & 63];
            if (z10 && (i22 = i22 + 1) == 19 && i21 < i19 - 2) {
                int i31 = i21 + 1;
                cArr[i21] = ASCIIPropertyListParser.WHITESPACE_CARRIAGE_RETURN;
                cArr[i31] = '\n';
                i21 = i31 + 1;
                i22 = 0;
            }
            i20 = i26;
        }
        if (i16 > 0) {
            int i32 = (bArr[i15] & UnsignedBytes.MAX_VALUE) << 10;
            if (i16 == 2) {
                i14 = (bArr[i17] & UnsignedBytes.MAX_VALUE) << 2;
            } else {
                i14 = 0;
            }
            int i33 = i32 | i14;
            char[] cArr3 = this.ALPHABET;
            cArr[i19 - 4] = cArr3[i33 >> 12];
            cArr[i19 - 3] = cArr3[(i33 >>> 6) & 63];
            if (i16 == 2) {
                cArr[i19 - 2] = cArr3[i33 & 63];
            } else if (!this.urlsafe) {
                cArr[i19 - 2] = ASCIIPropertyListParser.DICTIONARY_ASSIGN_TOKEN;
            }
            if (!this.urlsafe) {
                cArr[i19 - 1] = ASCIIPropertyListParser.DICTIONARY_ASSIGN_TOKEN;
            }
        }
        return cArr;
    }

    private String getName() {
        if (this.urlsafe) {
            return "base64url";
        }
        return "base64";
    }

    public byte[] decodeFast(CharSequence charSequence) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (charSequence != null) {
            i10 = charSequence.length();
        } else {
            i10 = 0;
        }
        if (i10 == 0) {
            return new byte[0];
        }
        int i15 = i10 - 1;
        int i16 = 0;
        while (i16 < i15 && this.IALPHABET[charSequence.charAt(i16)] < 0) {
            i16++;
        }
        while (i15 > 0 && this.IALPHABET[charSequence.charAt(i15)] < 0) {
            i15--;
        }
        if (charSequence.charAt(i15) == '=') {
            if (charSequence.charAt(i15 - 1) == '=') {
                i11 = 2;
            } else {
                i11 = 1;
            }
        } else {
            i11 = 0;
        }
        int i17 = (i15 - i16) + 1;
        if (i10 > 76) {
            if (charSequence.charAt(76) == '\r') {
                i13 = i17 / 78;
            } else {
                i13 = 0;
            }
            i12 = i13 << 1;
        } else {
            i12 = 0;
        }
        int i18 = (((i17 - i12) * 6) >> 3) - i11;
        byte[] bArr = new byte[i18];
        int i19 = (i18 / 3) * 3;
        int i20 = 0;
        int i21 = 0;
        while (i20 < i19) {
            int i22 = i16 + 1;
            int i23 = i22 + 1;
            int ctoi = (ctoi(charSequence.charAt(i16)) << 18) | (ctoi(charSequence.charAt(i22)) << 12);
            int i24 = i23 + 1;
            int ctoi2 = ctoi | (ctoi(charSequence.charAt(i23)) << 6);
            int i25 = i24 + 1;
            int ctoi3 = ctoi2 | ctoi(charSequence.charAt(i24));
            int i26 = i20 + 1;
            bArr[i20] = (byte) (ctoi3 >> 16);
            int i27 = i26 + 1;
            bArr[i26] = (byte) (ctoi3 >> 8);
            int i28 = i27 + 1;
            bArr[i27] = (byte) ctoi3;
            if (i12 > 0 && (i21 = i21 + 1) == 19) {
                i16 = i25 + 2;
                i21 = 0;
            } else {
                i16 = i25;
            }
            i20 = i28;
        }
        if (i20 < i18) {
            int i29 = 0;
            while (i16 <= i15 - i11) {
                i14 |= ctoi(charSequence.charAt(i16)) << (18 - (i29 * 6));
                i29++;
                i16++;
            }
            int i30 = 16;
            while (i20 < i18) {
                bArr[i20] = (byte) (i14 >> i30);
                i30 -= 8;
                i20++;
            }
        }
        return bArr;
    }

    public String encodeToString(byte[] bArr, boolean z10) {
        return new String(encodeToChar(bArr, z10));
    }
}
