package J6;

import I6.u;
import com.google.protobuf.C0850l;
import com.google.protobuf.C0854n;
import com.google.protobuf.X;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f2425a;

    /* renamed from: b  reason: collision with root package name */
    public int f2426b = 100;

    /* renamed from: c  reason: collision with root package name */
    public Object f2427c;

    public static int c(int i7) {
        return (-(i7 & 1)) ^ (i7 >>> 1);
    }

    public static long d(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static C0854n h(byte[] bArr, int i7, int i8, boolean z7) {
        C0854n c0854n = new C0854n(bArr, i7, i8, z7);
        try {
            c0854n.j(i8);
            return c0854n;
        } catch (X e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public abstract int A();

    public abstract int B();

    public abstract long C();

    public abstract boolean D(int i7);

    public void E() {
        int A7;
        do {
            A7 = A();
            if (A7 == 0) {
                return;
            }
            int i7 = this.f2425a;
            if (i7 < this.f2426b) {
                this.f2425a = i7 + 1;
                this.f2425a--;
            } else {
                throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
        } while (D(A7));
    }

    public abstract void b(int i7);

    public void e(u uVar) {
        synchronized (this) {
            try {
                int i7 = this.f2425a - 1;
                this.f2425a = i7;
                if (i7 == 0) {
                    this.f2426b = 0;
                }
                kotlin.jvm.internal.j.c(uVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                I6.s sVar = (I6.s) this;
                u.f2286a.set(uVar, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract int f();

    public abstract boolean g();

    public abstract void i(int i7);

    public abstract int j(int i7);

    public abstract boolean k();

    public abstract C0850l l();

    public abstract double m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract float q();

    public abstract int s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract String y();

    public abstract String z();
}
