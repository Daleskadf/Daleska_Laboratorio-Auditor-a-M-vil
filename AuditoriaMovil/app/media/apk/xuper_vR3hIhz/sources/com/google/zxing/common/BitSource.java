package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
/* loaded from: classes2.dex */
public final class BitSource {
    private int bitOffset;
    private int byteOffset;
    private final byte[] bytes;

    public BitSource(byte[] bArr) {
        this.bytes = bArr;
    }

    public int available() {
        return ((this.bytes.length - this.byteOffset) * 8) - this.bitOffset;
    }

    public int getBitOffset() {
        return this.bitOffset;
    }

    public int getByteOffset() {
        return this.byteOffset;
    }

    public int readBits(int i10) {
        int i11;
        if (i10 > 0 && i10 <= 32 && i10 <= available()) {
            int i12 = this.bitOffset;
            int i13 = 0;
            if (i12 > 0) {
                int i14 = 8 - i12;
                if (i10 < i14) {
                    i11 = i10;
                } else {
                    i11 = i14;
                }
                int i15 = i14 - i11;
                byte[] bArr = this.bytes;
                int i16 = this.byteOffset;
                int i17 = (((255 >> (8 - i11)) << i15) & bArr[i16]) >> i15;
                i10 -= i11;
                int i18 = i12 + i11;
                this.bitOffset = i18;
                if (i18 == 8) {
                    this.bitOffset = 0;
                    this.byteOffset = i16 + 1;
                }
                i13 = i17;
            }
            if (i10 > 0) {
                while (i10 >= 8) {
                    int i19 = i13 << 8;
                    byte[] bArr2 = this.bytes;
                    int i20 = this.byteOffset;
                    i13 = (bArr2[i20] & UnsignedBytes.MAX_VALUE) | i19;
                    this.byteOffset = i20 + 1;
                    i10 -= 8;
                }
                if (i10 > 0) {
                    int i21 = 8 - i10;
                    int i22 = (i13 << i10) | ((((255 >> i21) << i21) & this.bytes[this.byteOffset]) >> i21);
                    this.bitOffset += i10;
                    return i22;
                }
                return i13;
            }
            return i13;
        }
        throw new IllegalArgumentException(String.valueOf(i10));
    }
}
