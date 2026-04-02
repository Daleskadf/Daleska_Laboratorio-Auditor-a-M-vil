package B3;

import H4.W;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f258a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f259b;

    /* renamed from: c  reason: collision with root package name */
    public final int f260c;

    /* renamed from: d  reason: collision with root package name */
    public final int f261d;

    /* renamed from: e  reason: collision with root package name */
    public final int f262e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f263g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean[] f264h;

    public a(String str, char[] cArr) {
        boolean z7;
        boolean z8;
        byte[] bArr = new byte[RecognitionOptions.ITF];
        Arrays.fill(bArr, (byte) -1);
        for (int i7 = 0; i7 < cArr.length; i7++) {
            char c8 = cArr[i7];
            if (c8 < 128) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                if (bArr[c8] == -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    bArr[c8] = (byte) i7;
                } else {
                    throw new IllegalArgumentException(W.z("Duplicate character: %s", Character.valueOf(c8)));
                }
            } else {
                throw new IllegalArgumentException(W.z("Non-ASCII character: %s", Character.valueOf(c8)));
            }
        }
        this.f258a = str;
        this.f259b = cArr;
        try {
            int a02 = f7.a.a0(cArr.length, RoundingMode.UNNECESSARY);
            this.f261d = a02;
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(a02);
            int i8 = 1 << (3 - numberOfTrailingZeros);
            this.f262e = i8;
            this.f = a02 >> numberOfTrailingZeros;
            this.f260c = cArr.length - 1;
            this.f263g = bArr;
            boolean[] zArr = new boolean[i8];
            for (int i9 = 0; i9 < this.f; i9++) {
                zArr[f7.a.P(i9 * 8, this.f261d, RoundingMode.CEILING)] = true;
            }
            this.f264h = zArr;
        } catch (ArithmeticException e7) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e7);
        }
    }

    public final int a(char c8) {
        if (c8 <= 127) {
            byte b5 = this.f263g[c8];
            if (b5 == -1) {
                if (c8 > ' ' && c8 != 127) {
                    throw new IOException("Unrecognized character: " + c8);
                }
                throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c8));
            }
            return b5;
        }
        throw new IOException("Unrecognized character: 0x" + Integer.toHexString(c8));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            aVar.getClass();
            return Arrays.equals(this.f259b, aVar.f259b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f259b) + 1237;
    }

    public final String toString() {
        return this.f258a;
    }
}
