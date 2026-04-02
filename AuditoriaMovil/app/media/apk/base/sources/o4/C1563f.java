package o4;

import java.math.RoundingMode;
import java.util.Arrays;
import org.slf4j.helpers.i;
/* renamed from: o4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1563f {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[][] f14598c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: a  reason: collision with root package name */
    public byte[] f14599a;

    /* renamed from: b  reason: collision with root package name */
    public int f14600b;

    public final void a(int i7) {
        int i8 = i7 + this.f14600b;
        byte[] bArr = this.f14599a;
        if (i8 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i8) {
            i8 = length;
        }
        this.f14599a = Arrays.copyOf(bArr, i8);
    }

    public final void b(byte b5) {
        if (b5 == 0) {
            d((byte) 0);
            d((byte) -1);
        } else if (b5 == -1) {
            d((byte) -1);
            d((byte) 0);
        } else {
            d(b5);
        }
    }

    public final void c(byte b5) {
        if (b5 == 0) {
            e((byte) 0);
            e((byte) -1);
        } else if (b5 == -1) {
            e((byte) -1);
            e((byte) 0);
        } else {
            e(b5);
        }
    }

    public final void d(byte b5) {
        a(1);
        byte[] bArr = this.f14599a;
        int i7 = this.f14600b;
        this.f14600b = i7 + 1;
        bArr[i7] = b5;
    }

    public final void e(byte b5) {
        a(1);
        byte[] bArr = this.f14599a;
        int i7 = this.f14600b;
        this.f14600b = i7 + 1;
        bArr[i7] = (byte) (~b5);
    }

    public final void f(long j) {
        long j8;
        byte b5;
        int i7;
        int i8 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i8 < 0) {
            j8 = ~j;
        } else {
            j8 = j;
        }
        int i9 = (j8 > 64L ? 1 : (j8 == 64L ? 0 : -1));
        byte[][] bArr = f14598c;
        if (i9 < 0) {
            a(1);
            byte[] bArr2 = this.f14599a;
            int i10 = this.f14600b;
            this.f14600b = i10 + 1;
            bArr2[i10] = (byte) (j ^ bArr[1][0]);
            return;
        }
        if (j8 < 0) {
            j8 = ~j8;
        }
        int s7 = i.s(65 - Long.numberOfLeadingZeros(j8), 7, RoundingMode.UP);
        a(s7);
        if (s7 >= 2) {
            if (i8 < 0) {
                b5 = -1;
            } else {
                b5 = 0;
            }
            int i11 = this.f14600b;
            if (s7 == 10) {
                i7 = 2 + i11;
                byte[] bArr3 = this.f14599a;
                bArr3[i11] = b5;
                bArr3[i11 + 1] = b5;
            } else if (s7 == 9) {
                i7 = i11 + 1;
                this.f14599a[i11] = b5;
            } else {
                i7 = i11;
            }
            for (int i12 = (s7 - 1) + i11; i12 >= i7; i12--) {
                this.f14599a[i12] = (byte) (255 & j);
                j >>= 8;
            }
            byte[] bArr4 = this.f14599a;
            int i13 = this.f14600b;
            byte b7 = bArr4[i13];
            byte[] bArr5 = bArr[s7];
            bArr4[i13] = (byte) (b7 ^ bArr5[0]);
            int i14 = i13 + 1;
            bArr4[i14] = (byte) (bArr5[1] ^ bArr4[i14]);
            this.f14600b = i13 + s7;
            return;
        }
        throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(s7)));
    }
}
