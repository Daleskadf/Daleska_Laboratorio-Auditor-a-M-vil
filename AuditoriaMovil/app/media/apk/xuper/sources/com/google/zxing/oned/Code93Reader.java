package com.google.zxing.oned;

import com.google.android.gms.cast.MediaError;
import com.google.common.base.Ascii;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.hpplay.component.protocol.plist.ASCIIPropertyListParser;
import com.hpplay.sdk.source.common.global.Constant;
import java.util.Arrays;
import java.util.Map;
import okhttp3.internal.http.StatusLine;
/* loaded from: classes2.dex */
public final class Code93Reader extends OneDReader {
    private static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private final int[] counters = new int[6];

    static {
        int[] iArr = {276, 328, 324, MediaError.DetailedErrorCode.DASH_NO_INIT, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, StatusLine.HTTP_PERM_REDIRECT, 282, 344, MediaError.DetailedErrorCode.SMOOTH_NO_MEDIA_DATA, 326, 300, 278, 436, 434, 428, 422, 406, Constant.TOKEN_EXPIRED, 364, 358, 310, MediaError.DetailedErrorCode.HLS_NETWORK_KEY_LOAD, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }

    private static void checkChecksums(CharSequence charSequence) {
        int length = charSequence.length();
        checkOneChecksum(charSequence, length - 2, 20);
        checkOneChecksum(charSequence, length - 1, 15);
    }

    private static void checkOneChecksum(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += ALPHABET_STRING.indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) == ALPHABET[i12 % 47]) {
            return;
        }
        throw ChecksumException.getChecksumInstance();
    }

    private static String decodeExtended(CharSequence charSequence) {
        int i10;
        char c10;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i11 < length - 1) {
                    i11++;
                    char charAt2 = charSequence.charAt(i11);
                    switch (charAt) {
                        case 'a':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i10 = charAt2 - '@';
                                c10 = (char) i10;
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            break;
                        case 'b':
                            if (charAt2 >= 'A' && charAt2 <= 'E') {
                                i10 = charAt2 - '&';
                            } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                                i10 = charAt2 - 11;
                            } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                                i10 = charAt2 + 16;
                            } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                                i10 = charAt2 + '+';
                            } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                c10 = Ascii.MAX;
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            c10 = (char) i10;
                            break;
                        case 'c':
                            if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i10 = charAt2 - ' ';
                                c10 = (char) i10;
                                break;
                            } else if (charAt2 == 'Z') {
                                c10 = ASCIIPropertyListParser.DATE_TIME_FIELD_DELIMITER;
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        case 'd':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i10 = charAt2 + ' ';
                                c10 = (char) i10;
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        default:
                            c10 = 0;
                            break;
                    }
                    sb.append(c10);
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                sb.append(charAt);
            }
            i11++;
        }
        return sb.toString();
    }

    private int[] findAsteriskPattern(BitArray bitArray) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        Arrays.fill(this.counters, 0);
        int[] iArr = this.counters;
        int length = iArr.length;
        int i10 = nextSet;
        boolean z10 = false;
        int i11 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) ^ z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                int i12 = length - 1;
                if (i11 == i12) {
                    if (toPattern(iArr) == ASTERISK_ENCODING) {
                        return new int[]{i10, nextSet};
                    }
                    i10 += iArr[0] + iArr[1];
                    int i13 = length - 2;
                    System.arraycopy(iArr, 2, iArr, 0, i13);
                    iArr[i13] = 0;
                    iArr[i12] = 0;
                    i11--;
                } else {
                    i11++;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char patternToChar(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i11 < iArr.length) {
                if (iArr[i11] == i10) {
                    return ALPHABET[i11];
                }
                i11++;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    private static int toPattern(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((iArr[i13] * 9.0f) / i10);
            if (round > 0 && round <= 4) {
                if ((i13 & 1) == 0) {
                    for (int i14 = 0; i14 < round; i14++) {
                        i12 = (i12 << 1) | 1;
                    }
                } else {
                    i12 <<= round;
                }
            } else {
                return -1;
            }
        }
        return i12;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i10, BitArray bitArray, Map<DecodeHintType, ?> map) {
        int[] findAsteriskPattern;
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray)[1]);
        int size = bitArray.getSize();
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.decodeRowResult;
        sb.setLength(0);
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int pattern = toPattern(iArr);
            if (pattern >= 0) {
                char patternToChar = patternToChar(pattern);
                sb.append(patternToChar);
                int i11 = nextSet;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int nextSet2 = bitArray.getNextSet(i11);
                if (patternToChar == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i13 = 0;
                    for (int i14 : iArr) {
                        i13 += i14;
                    }
                    if (nextSet2 != size && bitArray.get(nextSet2)) {
                        if (sb.length() >= 2) {
                            checkChecksums(sb);
                            sb.setLength(sb.length() - 2);
                            float f10 = i10;
                            return new Result(decodeExtended(sb), null, new ResultPoint[]{new ResultPoint((findAsteriskPattern[1] + findAsteriskPattern[0]) / 2.0f, f10), new ResultPoint(nextSet + (i13 / 2.0f), f10)}, BarcodeFormat.CODE_93);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                nextSet = nextSet2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
