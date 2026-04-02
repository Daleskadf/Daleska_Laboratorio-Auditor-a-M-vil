package H0;

import D.AbstractC0059i;
/* renamed from: H0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126f {

    /* renamed from: c  reason: collision with root package name */
    public static final C0126f f1797c = new C0126f(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1798a;

    /* renamed from: b  reason: collision with root package name */
    public A.c f1799b;

    static {
        AbstractC0059i.F(0, 1, 2, 3, 4);
    }

    public C0126f(int i7) {
        this.f1798a = i7;
    }

    public final A.c a() {
        if (this.f1799b == null) {
            this.f1799b = new A.c(this);
        }
        return this.f1799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0126f.class == obj.getClass() && this.f1798a == ((C0126f) obj).f1798a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((527 + this.f1798a) * 961) + 1) * 31) + 1) * 31;
    }
}
