package L4;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
/* renamed from: L4.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0226s extends Q4.c {

    /* renamed from: m0  reason: collision with root package name */
    public static final r f3000m0 = new r();

    /* renamed from: n0  reason: collision with root package name */
    public static final I4.u f3001n0 = new I4.u("closed");

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f3002j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f3003k0;

    /* renamed from: l0  reason: collision with root package name */
    public I4.q f3004l0;

    public C0226s() {
        super(f3000m0);
        this.f3002j0 = new ArrayList();
        this.f3004l0 = I4.s.f2218a;
    }

    public final I4.q A() {
        ArrayList arrayList = this.f3002j0;
        return (I4.q) arrayList.get(arrayList.size() - 1);
    }

    public final void B(I4.q qVar) {
        if (this.f3003k0 != null) {
            if (!(qVar instanceof I4.s) || this.f4415f0) {
                I4.t tVar = (I4.t) A();
                String str = this.f3003k0;
                tVar.getClass();
                tVar.f2219a.put(str, qVar);
            }
            this.f3003k0 = null;
        } else if (this.f3002j0.isEmpty()) {
            this.f3004l0 = qVar;
        } else {
            I4.q A7 = A();
            if (A7 instanceof I4.o) {
                ((I4.o) A7).f2217a.add(qVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // Q4.c
    public final void b() {
        I4.o oVar = new I4.o();
        B(oVar);
        this.f3002j0.add(oVar);
    }

    @Override // Q4.c
    public final void c() {
        I4.t tVar = new I4.t();
        B(tVar);
        this.f3002j0.add(tVar);
    }

    @Override // Q4.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f3002j0;
        if (arrayList.isEmpty()) {
            arrayList.add(f3001n0);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // Q4.c
    public final void g() {
        ArrayList arrayList = this.f3002j0;
        if (!arrayList.isEmpty() && this.f3003k0 == null) {
            if (A() instanceof I4.o) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // Q4.c
    public final void j() {
        ArrayList arrayList = this.f3002j0;
        if (!arrayList.isEmpty() && this.f3003k0 == null) {
            if (A() instanceof I4.t) {
                arrayList.remove(arrayList.size() - 1);
                return;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    @Override // Q4.c
    public final void m(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.f3002j0.isEmpty() && this.f3003k0 == null) {
            if (A() instanceof I4.t) {
                this.f3003k0 = str;
                return;
            }
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        throw new IllegalStateException("Did not expect a name");
    }

    @Override // Q4.c
    public final Q4.c o() {
        B(I4.s.f2218a);
        return this;
    }

    @Override // Q4.c
    public final void t(double d7) {
        if (this.f4407Y == I4.z.LENIENT || (!Double.isNaN(d7) && !Double.isInfinite(d7))) {
            B(new I4.u(Double.valueOf(d7)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d7);
    }

    @Override // Q4.c
    public final void u(long j) {
        B(new I4.u(Long.valueOf(j)));
    }

    @Override // Q4.c
    public final void v(Boolean bool) {
        if (bool == null) {
            B(I4.s.f2218a);
        } else {
            B(new I4.u(bool));
        }
    }

    @Override // Q4.c
    public final void w(Number number) {
        if (number == null) {
            B(I4.s.f2218a);
            return;
        }
        if (this.f4407Y != I4.z.LENIENT) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        B(new I4.u(number));
    }

    @Override // Q4.c
    public final void x(String str) {
        if (str == null) {
            B(I4.s.f2218a);
        } else {
            B(new I4.u(str));
        }
    }

    @Override // Q4.c
    public final void y(boolean z7) {
        B(new I4.u(Boolean.valueOf(z7)));
    }

    @Override // Q4.c, java.io.Flushable
    public final void flush() {
    }
}
