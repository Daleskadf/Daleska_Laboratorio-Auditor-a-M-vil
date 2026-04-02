package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;
/* loaded from: classes2.dex */
final class DataBlock {
    private final byte[] codewords;
    private final int numDataCodewords;

    private DataBlock(int i10, byte[] bArr) {
        this.numDataCodewords = i10;
        this.codewords = bArr;
    }

    public static DataBlock[] getDataBlocks(byte[] bArr, Version version) {
        boolean z10;
        int i10;
        int i11;
        Version.ECBlocks eCBlocks = version.getECBlocks();
        Version.ECB[] eCBlocks2 = eCBlocks.getECBlocks();
        int i12 = 0;
        for (Version.ECB ecb : eCBlocks2) {
            i12 += ecb.getCount();
        }
        DataBlock[] dataBlockArr = new DataBlock[i12];
        int i13 = 0;
        for (Version.ECB ecb2 : eCBlocks2) {
            int i14 = 0;
            while (i14 < ecb2.getCount()) {
                int dataCodewords = ecb2.getDataCodewords();
                dataBlockArr[i13] = new DataBlock(dataCodewords, new byte[eCBlocks.getECCodewords() + dataCodewords]);
                i14++;
                i13++;
            }
        }
        int length = dataBlockArr[0].codewords.length - eCBlocks.getECCodewords();
        int i15 = length - 1;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = 0;
            while (i18 < i13) {
                dataBlockArr[i18].codewords[i17] = bArr[i16];
                i18++;
                i16++;
            }
        }
        if (version.getVersionNumber() == 24) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 8;
        } else {
            i10 = i13;
        }
        int i19 = 0;
        while (i19 < i10) {
            dataBlockArr[i19].codewords[i15] = bArr[i16];
            i19++;
            i16++;
        }
        int length2 = dataBlockArr[0].codewords.length;
        while (length < length2) {
            int i20 = 0;
            while (i20 < i13) {
                if (z10) {
                    i11 = (i20 + 8) % i13;
                } else {
                    i11 = i20;
                }
                dataBlockArr[i11].codewords[(z10 && i11 > 7) ? length - 1 : length] = bArr[i16];
                i20++;
                i16++;
            }
            length++;
        }
        if (i16 == bArr.length) {
            return dataBlockArr;
        }
        throw new IllegalArgumentException();
    }

    public byte[] getCodewords() {
        return this.codewords;
    }

    public int getNumDataCodewords() {
        return this.numDataCodewords;
    }
}
