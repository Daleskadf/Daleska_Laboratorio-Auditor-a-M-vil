package h0;

import android.os.Build;
import android.view.View;
import j$.util.Objects;
/* renamed from: h0.O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1035O {

    /* renamed from: b  reason: collision with root package name */
    public static final C1036P f11169b;

    /* renamed from: a  reason: collision with root package name */
    public final C1036P f11170a;

    static {
        AbstractC1028H c1023c;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 34) {
            c1023c = new C1027G();
        } else if (i7 >= 30) {
            c1023c = new C1026F();
        } else if (i7 >= 29) {
            c1023c = new C1025E();
        } else {
            c1023c = new C1023C();
        }
        f11169b = c1023c.b().f11172a.a().f11172a.b().f11172a.c();
    }

    public C1035O(C1036P c1036p) {
        this.f11170a = c1036p;
    }

    public C1036P a() {
        return this.f11170a;
    }

    public C1036P b() {
        return this.f11170a;
    }

    public C1036P c() {
        return this.f11170a;
    }

    public C1044d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1035O)) {
            return false;
        }
        C1035O c1035o = (C1035O) obj;
        if (j() == c1035o.j() && i() == c1035o.i() && Objects.equals(g(), c1035o.g()) && Objects.equals(f(), c1035o.f()) && Objects.equals(e(), c1035o.e())) {
            return true;
        }
        return false;
    }

    public Z.c f() {
        return Z.c.f6708e;
    }

    public Z.c g() {
        return Z.c.f6708e;
    }

    public C1036P h(int i7, int i8, int i9, int i10) {
        return f11169b;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(j()), Boolean.valueOf(i()), g(), f(), e());
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public void d(View view) {
    }

    public void k(Z.c[] cVarArr) {
    }

    public void l(C1036P c1036p) {
    }

    public void m(Z.c cVar) {
    }

    public void n(int i7) {
    }
}
