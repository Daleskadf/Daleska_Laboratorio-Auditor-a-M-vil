package c6;

import a6.C0476e;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class D1 {

    /* renamed from: a  reason: collision with root package name */
    public final C0476e f8438a;

    /* renamed from: b  reason: collision with root package name */
    public final a6.e0 f8439b;

    /* renamed from: c  reason: collision with root package name */
    public final Q0.A f8440c;

    public D1(Q0.A a7, a6.e0 e0Var, C0476e c0476e) {
        G.i.j(a7, "method");
        this.f8440c = a7;
        G.i.j(e0Var, "headers");
        this.f8439b = e0Var;
        G.i.j(c0476e, "callOptions");
        this.f8438a = c0476e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D1.class != obj.getClass()) {
            return false;
        }
        D1 d12 = (D1) obj;
        if (F.f.l(this.f8438a, d12.f8438a) && F.f.l(this.f8439b, d12.f8439b) && F.f.l(this.f8440c, d12.f8440c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8438a, this.f8439b, this.f8440c});
    }

    public final String toString() {
        return "[method=" + this.f8440c + " headers=" + this.f8439b + " callOptions=" + this.f8438a + "]";
    }
}
