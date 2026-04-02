package io.jsonwebtoken.impl.io;

import com.google.common.base.Ascii;
import io.jsonwebtoken.impl.io.BaseNCodec;
import io.jsonwebtoken.lang.Strings;
/* loaded from: classes3.dex */
class Base64Codec extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    private static final byte[] STANDARD_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, 63, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};

    public Base64Codec() {
        this(0);
    }

    private void validateCharacter(int i10, BaseNCodec.Context context) {
        if (isStrictDecoding() && (i10 & context.ibitWorkArea) != 0) {
            throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero.");
        }
    }

    private void validateTrailingCharacter() {
        if (!isStrictDecoding()) {
            return;
        }
        throw new IllegalArgumentException("Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes.");
    }

    @Override // io.jsonwebtoken.impl.io.BaseNCodec
    public void decode(byte[] bArr, int i10, int i11, BaseNCodec.Context context) {
        byte b10;
        if (context.eof) {
            return;
        }
        if (i11 < 0) {
            context.eof = true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.decodeSize, context);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == this.pad) {
                context.eof = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (context.modulus + 1) % 4;
                    context.modulus = i14;
                    int i15 = (context.ibitWorkArea << 6) + b10;
                    context.ibitWorkArea = i15;
                    if (i14 == 0) {
                        int i16 = context.pos;
                        int i17 = i16 + 1;
                        ensureBufferSize[i16] = (byte) ((i15 >> 16) & 255);
                        int i18 = i17 + 1;
                        ensureBufferSize[i17] = (byte) ((i15 >> 8) & 255);
                        context.pos = i18 + 1;
                        ensureBufferSize[i18] = (byte) (i15 & 255);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (context.eof && context.modulus != 0) {
            byte[] ensureBufferSize2 = ensureBufferSize(this.decodeSize, context);
            int i19 = context.modulus;
            if (i19 != 1) {
                if (i19 != 2) {
                    if (i19 == 3) {
                        validateCharacter(3, context);
                        int i20 = context.ibitWorkArea >> 2;
                        context.ibitWorkArea = i20;
                        int i21 = context.pos;
                        int i22 = i21 + 1;
                        ensureBufferSize2[i21] = (byte) ((i20 >> 8) & 255);
                        context.pos = i22 + 1;
                        ensureBufferSize2[i22] = (byte) (i20 & 255);
                        return;
                    }
                    throw new IllegalStateException("Impossible modulus " + context.modulus);
                }
                validateCharacter(15, context);
                int i23 = context.ibitWorkArea >> 4;
                context.ibitWorkArea = i23;
                int i24 = context.pos;
                context.pos = i24 + 1;
                ensureBufferSize2[i24] = (byte) (i23 & 255);
                return;
            }
            validateTrailingCharacter();
        }
    }

    @Override // io.jsonwebtoken.impl.io.BaseNCodec
    public void encode(byte[] bArr, int i10, int i11, BaseNCodec.Context context) {
        if (context.eof) {
            return;
        }
        if (i11 < 0) {
            context.eof = true;
            if (context.modulus == 0 && this.lineLength == 0) {
                return;
            }
            byte[] ensureBufferSize = ensureBufferSize(this.encodeSize, context);
            int i12 = context.pos;
            int i13 = context.modulus;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        int i14 = i12 + 1;
                        byte[] bArr2 = this.encodeTable;
                        int i15 = context.ibitWorkArea;
                        ensureBufferSize[i12] = bArr2[(i15 >> 10) & 63];
                        int i16 = i14 + 1;
                        ensureBufferSize[i14] = bArr2[(i15 >> 4) & 63];
                        int i17 = i16 + 1;
                        context.pos = i17;
                        ensureBufferSize[i16] = bArr2[(i15 << 2) & 63];
                        if (bArr2 == STANDARD_ENCODE_TABLE) {
                            context.pos = i17 + 1;
                            ensureBufferSize[i17] = this.pad;
                        }
                    } else {
                        throw new IllegalStateException("Impossible modulus " + context.modulus);
                    }
                } else {
                    int i18 = i12 + 1;
                    byte[] bArr3 = this.encodeTable;
                    int i19 = context.ibitWorkArea;
                    ensureBufferSize[i12] = bArr3[(i19 >> 2) & 63];
                    int i20 = i18 + 1;
                    context.pos = i20;
                    ensureBufferSize[i18] = bArr3[(i19 << 4) & 63];
                    if (bArr3 == STANDARD_ENCODE_TABLE) {
                        int i21 = i20 + 1;
                        byte b10 = this.pad;
                        ensureBufferSize[i20] = b10;
                        context.pos = i21 + 1;
                        ensureBufferSize[i21] = b10;
                    }
                }
            }
            int i22 = context.currentLinePos;
            int i23 = context.pos;
            int i24 = i22 + (i23 - i12);
            context.currentLinePos = i24;
            if (this.lineLength > 0 && i24 > 0) {
                byte[] bArr4 = this.lineSeparator;
                System.arraycopy(bArr4, 0, ensureBufferSize, i23, bArr4.length);
                context.pos += this.lineSeparator.length;
                return;
            }
            return;
        }
        int i25 = 0;
        while (i25 < i11) {
            byte[] ensureBufferSize2 = ensureBufferSize(this.encodeSize, context);
            int i26 = (context.modulus + 1) % 3;
            context.modulus = i26;
            int i27 = i10 + 1;
            int i28 = bArr[i10];
            if (i28 < 0) {
                i28 += 256;
            }
            int i29 = (context.ibitWorkArea << 8) + i28;
            context.ibitWorkArea = i29;
            if (i26 == 0) {
                int i30 = context.pos;
                int i31 = i30 + 1;
                byte[] bArr5 = this.encodeTable;
                ensureBufferSize2[i30] = bArr5[(i29 >> 18) & 63];
                int i32 = i31 + 1;
                ensureBufferSize2[i31] = bArr5[(i29 >> 12) & 63];
                int i33 = i32 + 1;
                ensureBufferSize2[i32] = bArr5[(i29 >> 6) & 63];
                int i34 = i33 + 1;
                context.pos = i34;
                ensureBufferSize2[i33] = bArr5[i29 & 63];
                int i35 = context.currentLinePos + 4;
                context.currentLinePos = i35;
                int i36 = this.lineLength;
                if (i36 > 0 && i36 <= i35) {
                    byte[] bArr6 = this.lineSeparator;
                    System.arraycopy(bArr6, 0, ensureBufferSize2, i34, bArr6.length);
                    context.pos += this.lineSeparator.length;
                    context.currentLinePos = 0;
                }
            }
            i25++;
            i10 = i27;
        }
    }

    @Override // io.jsonwebtoken.impl.io.BaseNCodec
    public boolean isInAlphabet(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.decodeTable;
            if (b10 < bArr.length && bArr[b10] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isUrlSafe() {
        if (this.encodeTable == URL_SAFE_ENCODE_TABLE) {
            return true;
        }
        return false;
    }

    public Base64Codec(boolean z10) {
        this(76, BaseNCodec.CHUNK_SEPARATOR, z10);
    }

    public Base64Codec(int i10) {
        this(i10, BaseNCodec.CHUNK_SEPARATOR);
    }

    public Base64Codec(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public Base64Codec(int i10, byte[] bArr, boolean z10) {
        this(i10, bArr, z10, BaseNCodec.DECODING_POLICY_DEFAULT);
    }

    public Base64Codec(int i10, byte[] bArr, boolean z10, CodecPolicy codecPolicy) {
        super(3, 4, i10, BaseNCodec.length(bArr), (byte) 61, codecPolicy);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                String utf8 = Strings.utf8(bArr);
                throw new IllegalArgumentException("lineSeparator must not contain base64 characters: [" + utf8 + "]");
            } else if (i10 > 0) {
                this.encodeSize = bArr.length + 4;
                this.lineSeparator = (byte[]) bArr.clone();
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z10 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }
}
