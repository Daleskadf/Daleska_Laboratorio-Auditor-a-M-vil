package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
/* loaded from: classes2.dex */
final class DecodedNumeric extends DecodedObject {
    static final int FNC1 = 10;
    private final int firstDigit;
    private final int secondDigit;

    public DecodedNumeric(int i10, int i11, int i12) {
        super(i10);
        if (i11 >= 0 && i11 <= 10 && i12 >= 0 && i12 <= 10) {
            this.firstDigit = i11;
            this.secondDigit = i12;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    public int getFirstDigit() {
        return this.firstDigit;
    }

    public int getSecondDigit() {
        return this.secondDigit;
    }

    public int getValue() {
        return (this.firstDigit * 10) + this.secondDigit;
    }

    public boolean isAnyFNC1() {
        if (this.firstDigit != 10 && this.secondDigit != 10) {
            return false;
        }
        return true;
    }

    public boolean isFirstDigitFNC1() {
        if (this.firstDigit == 10) {
            return true;
        }
        return false;
    }

    public boolean isSecondDigitFNC1() {
        if (this.secondDigit == 10) {
            return true;
        }
        return false;
    }
}
