package H3;

import androidx.datastore.preferences.protobuf.C0530g;
import com.google.crypto.tink.shaded.protobuf.C0780g;
import com.google.crypto.tink.shaded.protobuf.C0782i;
import com.google.crypto.tink.shaded.protobuf.F;
import j3.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int f1981a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1982b;

    public static int d(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0782i h(byte[] bArr, int i7, int i8, boolean z7) {
        C0782i c0782i = new C0782i(bArr, i7, i8, z7);
        try {
            c0782i.l(i8);
            return c0782i;
        } catch (F e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i7);

    public void G() {
        int C7;
        do {
            C7 = C();
            if (C7 == 0) {
                return;
            }
            int i7 = this.f1981a;
            if (i7 < 100) {
                this.f1981a = i7 + 1;
                this.f1981a--;
            } else {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
        } while (F(C7));
    }

    public ByteBuffer a(byte[] bArr, int i7) {
        int[] c8 = c(a.c(bArr), i7);
        int[] iArr = (int[]) c8.clone();
        a.b(iArr);
        for (int i8 = 0; i8 < c8.length; i8++) {
            c8[i8] = c8[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c8, 0, 16);
        return order;
    }

    public abstract void b(int i7);

    public abstract int[] c(int[] iArr, int i7);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i7);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == i()) {
            int remaining = byteBuffer2.remaining();
            int i7 = remaining / 64;
            int i8 = i7 + 1;
            for (int i9 = 0; i9 < i8; i9++) {
                ByteBuffer a7 = a(bArr, this.f1981a + i9);
                if (i9 == i7) {
                    f.a0(byteBuffer, byteBuffer2, a7, remaining % 64);
                } else {
                    f.a0(byteBuffer, byteBuffer2, a7, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
    }

    public abstract int l(int i7);

    public abstract boolean m();

    public abstract C0530g n();

    public abstract C0780g o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
