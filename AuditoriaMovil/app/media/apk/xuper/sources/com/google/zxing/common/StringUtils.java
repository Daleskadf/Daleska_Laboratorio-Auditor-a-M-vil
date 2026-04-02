package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;
/* loaded from: classes2.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING;
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    static {
        boolean z10;
        String name = Charset.defaultCharset().name();
        PLATFORM_DEFAULT_ENCODING = name;
        if (!SHIFT_JIS.equalsIgnoreCase(name) && !EUC_JP.equalsIgnoreCase(name)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ASSUME_SHIFT_JIS = z10;
    }

    private StringUtils() {
    }

    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z10;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return map.get(decodeHintType).toString();
            }
        }
        int length = bArr2.length;
        boolean z11 = true;
        int i10 = 0;
        if (bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 0;
        boolean z12 = true;
        boolean z13 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i12 < length && (z11 || z12 || z13)) {
            int i22 = bArr2[i12] & UnsignedBytes.MAX_VALUE;
            if (z13) {
                if (i13 > 0) {
                    if ((i22 & 128) != 0) {
                        i13--;
                    }
                    z13 = false;
                } else if ((i22 & 128) != 0) {
                    if ((i22 & 64) != 0) {
                        i13++;
                        if ((i22 & 32) == 0) {
                            i15++;
                        } else {
                            i13++;
                            if ((i22 & 16) == 0) {
                                i16++;
                            } else {
                                i13++;
                                if ((i22 & 8) == 0) {
                                    i17++;
                                }
                            }
                        }
                    }
                    z13 = false;
                }
            }
            if (z11) {
                if (i22 > 127 && i22 < 160) {
                    z11 = false;
                } else if (i22 > 159 && (i22 < 192 || i22 == 215 || i22 == 247)) {
                    i19++;
                }
            }
            if (z12) {
                if (i14 > 0) {
                    if (i22 >= 64 && i22 != 127 && i22 <= 252) {
                        i14--;
                    }
                    z12 = false;
                } else {
                    if (i22 != 128 && i22 != 160 && i22 <= 239) {
                        if (i22 > 160 && i22 < 224) {
                            i11++;
                            int i23 = i21 + 1;
                            if (i23 > i18) {
                                i18 = i23;
                                i21 = i18;
                            } else {
                                i21 = i23;
                            }
                            i20 = 0;
                        } else {
                            if (i22 > 127) {
                                i14++;
                                int i24 = i20 + 1;
                                if (i24 > i10) {
                                    i10 = i24;
                                    i20 = i10;
                                } else {
                                    i20 = i24;
                                }
                            } else {
                                i20 = 0;
                            }
                            i21 = 0;
                        }
                    }
                    z12 = false;
                }
            }
            i12++;
            bArr2 = bArr;
        }
        if (z13 && i13 > 0) {
            z13 = false;
        }
        if (z12 && i14 > 0) {
            z12 = false;
        }
        if (z13 && (z10 || i15 + i16 + i17 > 0)) {
            return UTF8;
        }
        if (z12 && (ASSUME_SHIFT_JIS || i18 >= 3 || i10 >= 3)) {
            return SHIFT_JIS;
        }
        if (z11 && z12) {
            if ((i18 == 2 && i11 == 2) || i19 * 10 >= length) {
                return SHIFT_JIS;
            }
            return ISO88591;
        } else if (z11) {
            return ISO88591;
        } else {
            if (z12) {
                return SHIFT_JIS;
            }
            if (z13) {
                return UTF8;
            }
            return PLATFORM_DEFAULT_ENCODING;
        }
    }
}
