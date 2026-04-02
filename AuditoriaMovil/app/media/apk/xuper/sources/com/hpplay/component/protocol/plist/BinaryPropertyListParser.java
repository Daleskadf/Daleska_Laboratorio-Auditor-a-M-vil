package com.hpplay.component.protocol.plist;

import com.google.common.primitives.UnsignedBytes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.math.BigInteger;
/* loaded from: classes2.dex */
public final class BinaryPropertyListParser {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private byte[] bytes;
    private int majorVersion;
    private int minorVersion;
    private int objectRefSize;
    private int[] offsetTable;

    private BinaryPropertyListParser() {
    }

    private int calculateUtf8StringLength(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i10 + i12;
            if (bArr.length <= i14) {
                return i11;
            }
            byte b10 = bArr[i14];
            if (b10 < 128) {
                i12++;
            }
            if (b10 < 194) {
                return i11;
            }
            if (b10 < 224) {
                if ((bArr[i14 + 1] & 192) != 128) {
                    return i11;
                }
                i12 += 2;
            } else if (b10 < 240) {
                if ((bArr[i14 + 1] & 192) == 128 && (bArr[i14 + 2] & 192) == 128) {
                    i12 += 3;
                } else {
                    return i11;
                }
            } else if (b10 >= 245) {
                continue;
            } else if ((bArr[i14 + 1] & 192) == 128 && (bArr[i14 + 2] & 192) == 128 && (bArr[i14 + 3] & 192) == 128) {
                i12 += 4;
            } else {
                return i11;
            }
        }
        return i12;
    }

    public static byte[] copyOfRange(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0) {
            byte[] bArr2 = new byte[i12];
            System.arraycopy(bArr, i10, bArr2, 0, i12);
            return bArr2;
        }
        throw new IllegalArgumentException("startIndex (" + i10 + ") > endIndex (" + i11 + ")");
    }

    private NSObject doParse(byte[] bArr) {
        this.bytes = bArr;
        int i10 = 0;
        String str = new String(copyOfRange(bArr, 0, 8));
        if (str.startsWith("bplist")) {
            this.majorVersion = str.charAt(6) - '0';
            this.minorVersion = str.charAt(7) - '0';
            if (this.majorVersion <= 0) {
                byte[] bArr2 = this.bytes;
                if (bArr2.length >= 40) {
                    byte[] copyOfRange = copyOfRange(bArr2, bArr2.length - 32, bArr2.length);
                    int parseUnsignedInt = (int) parseUnsignedInt(copyOfRange, 6, 7);
                    this.objectRefSize = (int) parseUnsignedInt(copyOfRange, 7, 8);
                    int parseUnsignedInt2 = (int) parseUnsignedInt(copyOfRange, 8, 16);
                    int parseUnsignedInt3 = (int) parseUnsignedInt(copyOfRange, 16, 24);
                    int parseUnsignedInt4 = (int) parseUnsignedInt(copyOfRange, 24, 32);
                    int i11 = ((parseUnsignedInt2 + 1) * parseUnsignedInt) + parseUnsignedInt4;
                    byte[] bArr3 = this.bytes;
                    if (i11 <= bArr3.length && parseUnsignedInt3 < bArr3.length - 32) {
                        this.offsetTable = new int[parseUnsignedInt2];
                        while (i10 < parseUnsignedInt2) {
                            int i12 = i10 + 1;
                            this.offsetTable[i10] = (int) parseUnsignedInt(this.bytes, (i10 * parseUnsignedInt) + parseUnsignedInt4, (i12 * parseUnsignedInt) + parseUnsignedInt4);
                            i10 = i12;
                        }
                        return parseObject(parseUnsignedInt3);
                    }
                    throw new PropertyListFormatException("The binary property list contains a corrupted object offset table.");
                }
                throw new PropertyListFormatException("The binary property list does not contain a complete object offset table.");
            }
            throw new PropertyListFormatException("Unsupported binary property list format: v" + this.majorVersion + "." + this.minorVersion + ". Version 1.0 and later are not yet supported.");
        }
        throw new IllegalArgumentException("The given data is no binary property list. Wrong magic bytes: " + str);
    }

    public static NSObject parse(byte[] bArr) {
        return new BinaryPropertyListParser().doParse(bArr);
    }

    public static double parseDouble(byte[] bArr) {
        return parseDouble(bArr, 0, bArr.length);
    }

    public static long parseLong(byte[] bArr) {
        return parseLong(bArr, 0, bArr.length);
    }

    private NSObject parseObject(int i10) {
        int i11 = this.offsetTable[i10];
        byte b10 = this.bytes[i11];
        int i12 = (b10 & 240) >> 4;
        int i13 = b10 & 15;
        int i14 = 0;
        switch (i12) {
            case 0:
                if (i13 != 0) {
                    if (i13 != 8) {
                        if (i13 != 9) {
                            switch (i13) {
                                case 12:
                                    throw new UnsupportedOperationException("The given binary property list contains a URL object. Parsing of this object type is not yet implemented.");
                                case 13:
                                    throw new UnsupportedOperationException("The given binary property list contains a URL object. Parsing of this object type is not yet implemented.");
                                case 14:
                                    throw new UnsupportedOperationException("The given binary property list contains a UUID object. Parsing of this object type is not yet implemented.");
                                default:
                                    throw new PropertyListFormatException("The given binary property list contains an object of unknown type (" + i12 + ")");
                            }
                        }
                        return new NSNumber(true);
                    }
                    return new NSNumber(false);
                }
                return null;
            case 1:
                int i15 = i11 + 1;
                return new NSNumber(this.bytes, i15, ((int) Math.pow(2.0d, i13)) + i15, 0);
            case 2:
                int i16 = i11 + 1;
                return new NSNumber(this.bytes, i16, ((int) Math.pow(2.0d, i13)) + i16, 1);
            case 3:
                if (i13 == 3) {
                    return new NSDate(this.bytes, i11 + 1, i11 + 9);
                }
                throw new PropertyListFormatException("The given binary property list contains a date object of an unknown type (" + i13 + ")");
            case 4:
                int[] readLengthAndOffset = readLengthAndOffset(i13, i11);
                int i17 = readLengthAndOffset[0];
                int i18 = i11 + readLengthAndOffset[1];
                return new NSData(copyOfRange(this.bytes, i18, i17 + i18));
            case 5:
                int[] readLengthAndOffset2 = readLengthAndOffset(i13, i11);
                int i19 = readLengthAndOffset2[0];
                int i20 = i11 + readLengthAndOffset2[1];
                return new NSString(this.bytes, i20, i19 + i20, "ASCII");
            case 6:
                int[] readLengthAndOffset3 = readLengthAndOffset(i13, i11);
                int i21 = readLengthAndOffset3[0];
                int i22 = i11 + readLengthAndOffset3[1];
                return new NSString(this.bytes, i22, (i21 * 2) + i22, "UTF-16BE");
            case 7:
                int[] readLengthAndOffset4 = readLengthAndOffset(i13, i11);
                int i23 = readLengthAndOffset4[1];
                int i24 = i11 + i23;
                return new NSString(this.bytes, i24, calculateUtf8StringLength(this.bytes, i24, readLengthAndOffset4[0]) + i24, "UTF-8");
            case 8:
                int i25 = i11 + 1;
                return new UID(String.valueOf(i10), copyOfRange(this.bytes, i25, i13 + 1 + i25));
            case 9:
            default:
                throw new PropertyListFormatException("The given binary property list contains an object of unknown type (" + i12 + ")");
            case 10:
                int[] readLengthAndOffset5 = readLengthAndOffset(i13, i11);
                int i26 = readLengthAndOffset5[0];
                int i27 = readLengthAndOffset5[1];
                NSArray nSArray = new NSArray(i26);
                while (i14 < i26) {
                    byte[] bArr = this.bytes;
                    int i28 = i11 + i27;
                    int i29 = this.objectRefSize;
                    int i30 = i14 + 1;
                    nSArray.setValue(i14, parseObject((int) parseUnsignedInt(bArr, (i14 * i29) + i28, i28 + (i29 * i30))));
                    i14 = i30;
                }
                return nSArray;
            case 11:
                int[] readLengthAndOffset6 = readLengthAndOffset(i13, i11);
                int i31 = readLengthAndOffset6[0];
                int i32 = readLengthAndOffset6[1];
                NSSet nSSet = new NSSet(true);
                while (i14 < i31) {
                    byte[] bArr2 = this.bytes;
                    int i33 = i11 + i32;
                    int i34 = this.objectRefSize;
                    i14++;
                    nSSet.addObject(parseObject((int) parseUnsignedInt(bArr2, (i14 * i34) + i33, i33 + (i34 * i14))));
                }
                return nSSet;
            case 12:
                int[] readLengthAndOffset7 = readLengthAndOffset(i13, i11);
                int i35 = readLengthAndOffset7[0];
                int i36 = readLengthAndOffset7[1];
                NSSet nSSet2 = new NSSet();
                while (i14 < i35) {
                    byte[] bArr3 = this.bytes;
                    int i37 = i11 + i36;
                    int i38 = this.objectRefSize;
                    i14++;
                    nSSet2.addObject(parseObject((int) parseUnsignedInt(bArr3, (i14 * i38) + i37, i37 + (i38 * i14))));
                }
                return nSSet2;
            case 13:
                int[] readLengthAndOffset8 = readLengthAndOffset(i13, i11);
                int i39 = readLengthAndOffset8[0];
                int i40 = readLengthAndOffset8[1];
                NSDictionary nSDictionary = new NSDictionary();
                while (i14 < i39) {
                    byte[] bArr4 = this.bytes;
                    int i41 = i11 + i40;
                    int i42 = this.objectRefSize;
                    int i43 = i14 + 1;
                    int parseUnsignedInt = (int) parseUnsignedInt(bArr4, (i14 * i42) + i41, (i42 * i43) + i41);
                    byte[] bArr5 = this.bytes;
                    int i44 = this.objectRefSize;
                    NSObject parseObject = parseObject(parseUnsignedInt);
                    nSDictionary.put(parseObject.toString(), parseObject((int) parseUnsignedInt(bArr5, (i39 * i44) + i41 + (i14 * i44), i41 + (i39 * i44) + (i44 * i43))));
                    i14 = i43;
                }
                return nSDictionary;
        }
    }

    public static long parseUnsignedInt(byte[] bArr) {
        return parseUnsignedInt(bArr, 0, bArr.length);
    }

    private int[] readLengthAndOffset(int i10, int i11) {
        int i12 = 1;
        if (i10 == 15) {
            byte b10 = this.bytes[i11 + 1];
            int i13 = (b10 & 240) >> 4;
            if (i13 != 1) {
                PrintStream printStream = System.err;
                printStream.println("BinaryPropertyListParser: Length integer has an unexpected type" + i13 + ". Attempting to parse anyway...");
            }
            int pow = (int) Math.pow(2.0d, b10 & 15);
            i12 = pow + 2;
            if (pow < 3) {
                int i14 = i11 + 2;
                i10 = (int) parseUnsignedInt(this.bytes, i14, pow + i14);
            } else {
                int i15 = i11 + 2;
                i10 = new BigInteger(copyOfRange(this.bytes, i15, pow + i15)).intValue();
            }
        }
        return new int[]{i10, i12};
    }

    public static double parseDouble(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 == 8) {
            return Double.longBitsToDouble(parseLong(bArr, i10, i11));
        }
        if (i12 == 4) {
            return Float.intBitsToFloat((int) parseLong(bArr, i10, i11));
        }
        throw new IllegalArgumentException("endIndex (" + i11 + ") - startIndex (" + i10 + ") != 4 or 8");
    }

    public static long parseLong(byte[] bArr, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            j10 = (j10 << 8) | (bArr[i10] & UnsignedBytes.MAX_VALUE);
            i10++;
        }
        return j10;
    }

    public static long parseUnsignedInt(byte[] bArr, int i10, int i11) {
        long j10 = 0;
        while (i10 < i11) {
            j10 = (j10 << 8) | (bArr[i10] & UnsignedBytes.MAX_VALUE);
            i10++;
        }
        return 4294967295L & j10;
    }

    public static NSObject parse(InputStream inputStream) {
        return parse(PropertyListParser.readAll(inputStream));
    }

    public static NSObject parse(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return parse(fileInputStream);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
