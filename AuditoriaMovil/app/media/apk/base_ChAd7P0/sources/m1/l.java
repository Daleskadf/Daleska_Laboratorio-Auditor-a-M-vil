package m1;

import H0.InterfaceC0131k;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l implements p {

    /* renamed from: X  reason: collision with root package name */
    public int f13970X;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0131k f13972b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13973c;

    /* renamed from: d  reason: collision with root package name */
    public long f13974d;
    public int f;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f13975e = new byte[65536];

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13971a = new byte[RecognitionOptions.AZTEC];

    static {
        H0.D.a("media3.extractor");
    }

    public l(InterfaceC0131k interfaceC0131k, long j, long j8) {
        this.f13972b = interfaceC0131k;
        this.f13974d = j;
        this.f13973c = j8;
    }

    @Override // m1.p
    public final long a() {
        return this.f13974d;
    }

    public final boolean b(int i7, boolean z7) {
        c(i7);
        int i8 = this.f13970X - this.f;
        while (i8 < i7) {
            i8 = k(this.f13975e, this.f, i7, i8, z7);
            if (i8 == -1) {
                return false;
            }
            this.f13970X = this.f + i8;
        }
        this.f += i7;
        return true;
    }

    public final void c(int i7) {
        int i8 = this.f + i7;
        byte[] bArr = this.f13975e;
        if (i8 > bArr.length) {
            this.f13975e = Arrays.copyOf(this.f13975e, K0.x.j(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    @Override // m1.p
    public final boolean f(byte[] bArr, int i7, int i8, boolean z7) {
        int min;
        int i9 = this.f13970X;
        if (i9 == 0) {
            min = 0;
        } else {
            min = Math.min(i9, i8);
            System.arraycopy(this.f13975e, 0, bArr, i7, min);
            s(min);
        }
        int i10 = min;
        while (i10 < i8 && i10 != -1) {
            i10 = k(bArr, i7, i8, i10, z7);
        }
        if (i10 != -1) {
            this.f13974d += i10;
        }
        if (i10 == -1) {
            return false;
        }
        return true;
    }

    public final int h(byte[] bArr, int i7, int i8) {
        int min;
        c(i8);
        int i9 = this.f13970X;
        int i10 = this.f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = k(this.f13975e, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f13970X += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.f13975e, this.f, bArr, i7, min);
        this.f += min;
        return min;
    }

    @Override // m1.p
    public final long i() {
        return this.f13973c;
    }

    public final int k(byte[] bArr, int i7, int i8, int i9, boolean z7) {
        if (!Thread.interrupted()) {
            int read = this.f13972b.read(bArr, i7 + i9, i8 - i9);
            if (read == -1) {
                if (i9 == 0 && z7) {
                    return -1;
                }
                throw new EOFException();
            }
            return i9 + read;
        }
        throw new InterruptedIOException();
    }

    @Override // m1.p
    public final void l() {
        this.f = 0;
    }

    @Override // m1.p
    public final void m(int i7) {
        int min = Math.min(this.f13970X, i7);
        s(min);
        int i8 = min;
        while (i8 < i7 && i8 != -1) {
            byte[] bArr = this.f13971a;
            i8 = k(bArr, -i8, Math.min(i7, bArr.length + i8), i8, false);
        }
        if (i8 != -1) {
            this.f13974d += i8;
        }
    }

    @Override // m1.p
    public final boolean q(byte[] bArr, int i7, int i8, boolean z7) {
        if (!b(i8, z7)) {
            return false;
        }
        System.arraycopy(this.f13975e, this.f - i8, bArr, i7, i8);
        return true;
    }

    public final int r(int i7) {
        int min = Math.min(this.f13970X, i7);
        s(min);
        if (min == 0) {
            byte[] bArr = this.f13971a;
            min = k(bArr, 0, Math.min(i7, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f13974d += min;
        }
        return min;
    }

    @Override // H0.InterfaceC0131k
    public final int read(byte[] bArr, int i7, int i8) {
        int i9 = this.f13970X;
        int i10 = 0;
        if (i9 != 0) {
            int min = Math.min(i9, i8);
            System.arraycopy(this.f13975e, 0, bArr, i7, min);
            s(min);
            i10 = min;
        }
        if (i10 == 0) {
            i10 = k(bArr, i7, i8, 0, true);
        }
        if (i10 != -1) {
            this.f13974d += i10;
        }
        return i10;
    }

    @Override // m1.p
    public final void readFully(byte[] bArr, int i7, int i8) {
        f(bArr, i7, i8, false);
    }

    public final void s(int i7) {
        byte[] bArr;
        int i8 = this.f13970X - i7;
        this.f13970X = i8;
        this.f = 0;
        byte[] bArr2 = this.f13975e;
        if (i8 < bArr2.length - 524288) {
            bArr = new byte[65536 + i8];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i7, bArr, 0, i8);
        this.f13975e = bArr;
    }

    @Override // m1.p
    public final long t() {
        return this.f13974d + this.f;
    }

    @Override // m1.p
    public final void v(byte[] bArr, int i7, int i8) {
        q(bArr, i7, i8, false);
    }

    @Override // m1.p
    public final void w(int i7) {
        b(i7, false);
    }
}
