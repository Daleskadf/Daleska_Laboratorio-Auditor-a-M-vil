package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class State {
    static final State INITIAL_STATE = new State(Token.EMPTY, 0, 0, 0);
    private final int binaryShiftByteCount;
    private final int bitCount;
    private final int mode;
    private final Token token;

    private State(Token token, int i10, int i11, int i12) {
        this.token = token;
        this.mode = i10;
        this.binaryShiftByteCount = i11;
        this.bitCount = i12;
    }

    public State addBinaryShiftChar(int i10) {
        int i11;
        Token token = this.token;
        int i12 = this.mode;
        int i13 = this.bitCount;
        if (i12 == 4 || i12 == 2) {
            int i14 = HighLevelEncoder.LATCH_TABLE[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            token = token.add(i15, i16);
            i13 += i16;
            i12 = 0;
        }
        int i17 = this.binaryShiftByteCount;
        if (i17 != 0 && i17 != 31) {
            if (i17 == 62) {
                i11 = 9;
            } else {
                i11 = 8;
            }
        } else {
            i11 = 18;
        }
        State state = new State(token, i12, i17 + 1, i13 + i11);
        if (state.binaryShiftByteCount == 2078) {
            return state.endBinaryShift(i10 + 1);
        }
        return state;
    }

    public State endBinaryShift(int i10) {
        int i11 = this.binaryShiftByteCount;
        if (i11 == 0) {
            return this;
        }
        return new State(this.token.addBinaryShift(i10 - i11, i11), this.mode, 0, this.bitCount);
    }

    public int getBinaryShiftByteCount() {
        return this.binaryShiftByteCount;
    }

    public int getBitCount() {
        return this.bitCount;
    }

    public int getMode() {
        return this.mode;
    }

    public Token getToken() {
        return this.token;
    }

    public boolean isBetterThanOrEqualTo(State state) {
        int i10;
        int i11 = this.bitCount + (HighLevelEncoder.LATCH_TABLE[this.mode][state.mode] >> 16);
        int i12 = state.binaryShiftByteCount;
        if (i12 > 0 && ((i10 = this.binaryShiftByteCount) == 0 || i10 > i12)) {
            i11 += 10;
        }
        if (i11 <= state.bitCount) {
            return true;
        }
        return false;
    }

    public State latchAndAppend(int i10, int i11) {
        int i12;
        int i13 = this.bitCount;
        Token token = this.token;
        int i14 = this.mode;
        if (i10 != i14) {
            int i15 = HighLevelEncoder.LATCH_TABLE[i14][i10];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            token = token.add(i16, i17);
            i13 += i17;
        }
        if (i10 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        return new State(token.add(i11, i12), i10, 0, i13 + i12);
    }

    public State shiftAndAppend(int i10, int i11) {
        int i12;
        Token token = this.token;
        int i13 = this.mode;
        if (i13 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        return new State(token.add(HighLevelEncoder.SHIFT_TABLE[i13][i10], i12).add(i11, 5), this.mode, 0, this.bitCount + i12 + 5);
    }

    public BitArray toBitArray(byte[] bArr) {
        LinkedList<Token> linkedList = new LinkedList();
        for (Token token = endBinaryShift(bArr.length).token; token != null; token = token.getPrevious()) {
            linkedList.addFirst(token);
        }
        BitArray bitArray = new BitArray();
        for (Token token2 : linkedList) {
            token2.appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.MODE_NAMES[this.mode], Integer.valueOf(this.bitCount), Integer.valueOf(this.binaryShiftByteCount));
    }
}
