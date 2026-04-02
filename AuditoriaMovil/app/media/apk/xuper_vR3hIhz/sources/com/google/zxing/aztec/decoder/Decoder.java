package com.google.zxing.aztec.decoder;

import anet.channel.strategy.dispatch.DispatchConstants;
import c8.b;
import com.google.zxing.FormatException;
import com.google.zxing.aztec.AztecDetectorResult;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.hpplay.cybergarage.http.HTTP;
import com.hpplay.cybergarage.soap.SOAP;
import com.hpplay.sdk.source.browse.data.BrowserInfo;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.titans.entity.CdnType;
import com.umeng.analytics.pro.bt;
import java.util.Arrays;
import m7.f;
import org.android.agoo.message.MessageService;
/* loaded from: classes2.dex */
public final class Decoder {
    private AztecDetectorResult ddata;
    private static final String[] UPPER_TABLE = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] LOWER_TABLE = {"CTRL_PS", " ", "a", b.f5629b, bt.aL, "d", "e", f.f16828a, "g", "h", bt.aI, "j", "k", "l", "m", "n", "o", bt.aD, "q", "r", "s", "t", "u", "v", BrowserInfo.KEY_WIDTH, "x", "y", bt.aJ, "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] MIXED_TABLE = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", HTTP.TAB, "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] PUNCT_TABLE = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", Operator.Operation.MOD, DispatchConstants.SIGN_SPLIT_SYMBOL, "'", "(", ")", Operator.Operation.MULTIPLY, Operator.Operation.PLUS, ",", Operator.Operation.MINUS, ".", Operator.Operation.DIVISION, SOAP.DELIM, ";", Operator.Operation.LESS_THAN, Operator.Operation.EQUALS, Operator.Operation.GREATER_THAN, Operator.Operation.EMPTY_PARAM, "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] DIGIT_TABLE = {"CTRL_PS", " ", "0", "1", "2", "3", "4", CdnType.DIGITAL_TYPE_PCDN, CdnType.DIGITAL_TYPE_PEERSTAR, "7", MessageService.MSG_ACCS_NOTIFY_CLICK, MessageService.MSG_ACCS_NOTIFY_DISMISS, ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: com.google.zxing.aztec.decoder.Decoder$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table;

        static {
            int[] iArr = new int[Table.values().length];
            $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table = iArr;
            try {
                iArr[Table.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[Table.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public enum Table {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] convertBoolArrayToByteArray(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = readByte(zArr, i10 << 3);
        }
        return bArr;
    }

    private boolean[] correctBits(boolean[] zArr) {
        int i10;
        GenericGF genericGF;
        boolean z10;
        boolean z11;
        if (this.ddata.getNbLayers() <= 2) {
            genericGF = GenericGF.AZTEC_DATA_6;
            i10 = 6;
        } else {
            i10 = 8;
            if (this.ddata.getNbLayers() <= 8) {
                genericGF = GenericGF.AZTEC_DATA_8;
            } else if (this.ddata.getNbLayers() <= 22) {
                genericGF = GenericGF.AZTEC_DATA_10;
                i10 = 10;
            } else {
                genericGF = GenericGF.AZTEC_DATA_12;
                i10 = 12;
            }
        }
        int nbDatablocks = this.ddata.getNbDatablocks();
        int length = zArr.length / i10;
        if (length >= nbDatablocks) {
            int length2 = zArr.length % i10;
            int[] iArr = new int[length];
            int i11 = 0;
            while (i11 < length) {
                iArr[i11] = readCode(zArr, length2, i10);
                i11++;
                length2 += i10;
            }
            try {
                new ReedSolomonDecoder(genericGF).decode(iArr, length - nbDatablocks);
                int i12 = (1 << i10) - 1;
                int i13 = 0;
                for (int i14 = 0; i14 < nbDatablocks; i14++) {
                    int i15 = iArr[i14];
                    if (i15 != 0 && i15 != i12) {
                        if (i15 == 1 || i15 == i12 - 1) {
                            i13++;
                        }
                    } else {
                        throw FormatException.getFormatInstance();
                    }
                }
                boolean[] zArr2 = new boolean[(nbDatablocks * i10) - i13];
                int i16 = 0;
                for (int i17 = 0; i17 < nbDatablocks; i17++) {
                    int i18 = iArr[i17];
                    if (i18 != 1 && i18 != i12 - 1) {
                        int i19 = i10 - 1;
                        while (i19 >= 0) {
                            int i20 = i16 + 1;
                            if (((1 << i19) & i18) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zArr2[i16] = z11;
                            i19--;
                            i16 = i20;
                        }
                    } else {
                        int i21 = (i16 + i10) - 1;
                        if (i18 > 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Arrays.fill(zArr2, i16, i21, z10);
                        i16 += i10 - 1;
                    }
                }
                return zArr2;
            } catch (ReedSolomonException e10) {
                throw FormatException.getFormatInstance(e10);
            }
        }
        throw FormatException.getFormatInstance();
    }

    private boolean[] extractBits(BitMatrix bitMatrix) {
        int i10;
        int i11;
        boolean isCompact = this.ddata.isCompact();
        int nbLayers = this.ddata.getNbLayers();
        if (isCompact) {
            i10 = 11;
        } else {
            i10 = 14;
        }
        int i12 = i10 + (nbLayers << 2);
        int[] iArr = new int[i12];
        boolean[] zArr = new boolean[totalBitsInLayer(nbLayers, isCompact)];
        int i13 = 2;
        if (isCompact) {
            for (int i14 = 0; i14 < i12; i14++) {
                iArr[i14] = i14;
            }
        } else {
            int i15 = i12 / 2;
            int i16 = ((i12 + 1) + (((i15 - 1) / 15) * 2)) / 2;
            for (int i17 = 0; i17 < i15; i17++) {
                int i18 = (i17 / 15) + i17;
                iArr[(i15 - i17) - 1] = (i16 - i18) - 1;
                iArr[i15 + i17] = i18 + i16 + 1;
            }
        }
        int i19 = 0;
        int i20 = 0;
        while (i19 < nbLayers) {
            int i21 = (nbLayers - i19) << i13;
            if (isCompact) {
                i11 = 9;
            } else {
                i11 = 12;
            }
            int i22 = i21 + i11;
            int i23 = i19 << 1;
            int i24 = (i12 - 1) - i23;
            int i25 = 0;
            while (i25 < i22) {
                int i26 = i25 << 1;
                int i27 = 0;
                while (i27 < i13) {
                    int i28 = i23 + i27;
                    int i29 = i23 + i25;
                    zArr[i20 + i26 + i27] = bitMatrix.get(iArr[i28], iArr[i29]);
                    int i30 = iArr[i29];
                    int i31 = i24 - i27;
                    boolean z10 = isCompact;
                    zArr[(i22 * 2) + i20 + i26 + i27] = bitMatrix.get(i30, iArr[i31]);
                    int i32 = iArr[i31];
                    int i33 = i24 - i25;
                    zArr[(i22 * 4) + i20 + i26 + i27] = bitMatrix.get(i32, iArr[i33]);
                    zArr[(i22 * 6) + i20 + i26 + i27] = bitMatrix.get(iArr[i33], iArr[i28]);
                    i27++;
                    nbLayers = nbLayers;
                    isCompact = z10;
                    i13 = 2;
                }
                i25++;
                i13 = 2;
            }
            i20 += i22 << 3;
            i19++;
            i13 = 2;
        }
        return zArr;
    }

    private static String getCharacter(Table table, int i10) {
        int i11 = AnonymousClass1.$SwitchMap$com$google$zxing$aztec$decoder$Decoder$Table[table.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return DIGIT_TABLE[i10];
                        }
                        throw new IllegalStateException("Bad table");
                    }
                    return PUNCT_TABLE[i10];
                }
                return MIXED_TABLE[i10];
            }
            return LOWER_TABLE[i10];
        }
        return UPPER_TABLE[i10];
    }

    private static String getEncodedData(boolean[] zArr) {
        int i10;
        int length = zArr.length;
        Table table = Table.UPPER;
        StringBuilder sb = new StringBuilder(20);
        Table table2 = table;
        int i11 = 0;
        while (i11 < length) {
            if (table == Table.BINARY) {
                if (length - i11 < 5) {
                    break;
                }
                int readCode = readCode(zArr, i11, 5);
                i11 += 5;
                if (readCode == 0) {
                    if (length - i11 < 11) {
                        break;
                    }
                    readCode = readCode(zArr, i11, 11) + 31;
                    i11 += 11;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= readCode) {
                        break;
                    } else if (length - i11 < 8) {
                        i11 = length;
                        break;
                    } else {
                        sb.append((char) readCode(zArr, i11, 8));
                        i11 += 8;
                        i12++;
                    }
                }
                table = table2;
            } else {
                if (table == Table.DIGIT) {
                    i10 = 4;
                } else {
                    i10 = 5;
                }
                if (length - i11 < i10) {
                    break;
                }
                int readCode2 = readCode(zArr, i11, i10);
                i11 += i10;
                String character = getCharacter(table, readCode2);
                if (character.startsWith("CTRL_")) {
                    table2 = getTable(character.charAt(5));
                    if (character.charAt(6) != 'L') {
                        table2 = table;
                        table = table2;
                    }
                } else {
                    sb.append(character);
                }
                table = table2;
            }
        }
        return sb.toString();
    }

    private static Table getTable(char c10) {
        if (c10 != 'B') {
            if (c10 != 'D') {
                if (c10 != 'P') {
                    if (c10 != 'L') {
                        if (c10 != 'M') {
                            return Table.UPPER;
                        }
                        return Table.MIXED;
                    }
                    return Table.LOWER;
                }
                return Table.PUNCT;
            }
            return Table.DIGIT;
        }
        return Table.BINARY;
    }

    public static String highLevelDecode(boolean[] zArr) {
        return getEncodedData(zArr);
    }

    private static byte readByte(boolean[] zArr, int i10) {
        int readCode;
        int length = zArr.length - i10;
        if (length >= 8) {
            readCode = readCode(zArr, i10, 8);
        } else {
            readCode = readCode(zArr, i10, length) << (8 - length);
        }
        return (byte) readCode;
    }

    private static int readCode(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static int totalBitsInLayer(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 << 4)) * i10;
    }

    public DecoderResult decode(AztecDetectorResult aztecDetectorResult) {
        this.ddata = aztecDetectorResult;
        boolean[] correctBits = correctBits(extractBits(aztecDetectorResult.getBits()));
        DecoderResult decoderResult = new DecoderResult(convertBoolArrayToByteArray(correctBits), getEncodedData(correctBits), null, null);
        decoderResult.setNumBits(correctBits.length);
        return decoderResult;
    }
}
