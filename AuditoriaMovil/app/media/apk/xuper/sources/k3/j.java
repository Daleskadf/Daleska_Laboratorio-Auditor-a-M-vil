package k3;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
/* loaded from: classes.dex */
public abstract class j extends i3.a implements Serializable, Type {

    /* renamed from: a  reason: collision with root package name */
    public final Class f14918a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14919b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14920c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f14921d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f14922e;

    public j(Class cls, int i10, Object obj, Object obj2, boolean z10) {
        this.f14918a = cls;
        this.f14919b = cls.getName().hashCode() + i10;
        this.f14920c = obj;
        this.f14921d = obj2;
        this.f14922e = z10;
    }

    public boolean A() {
        return false;
    }

    public boolean B() {
        return false;
    }

    public boolean C() {
        if ((this.f14918a.getModifiers() & 1536) == 0) {
            return true;
        }
        return this.f14918a.isPrimitive();
    }

    public abstract boolean D();

    public final boolean E() {
        if (d4.h.L(this.f14918a) && this.f14918a != Enum.class) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        return d4.h.L(this.f14918a);
    }

    public final boolean G() {
        return Modifier.isFinal(this.f14918a.getModifiers());
    }

    public final boolean H() {
        return this.f14918a.isInterface();
    }

    public final boolean I() {
        if (this.f14918a == Object.class) {
            return true;
        }
        return false;
    }

    public boolean J() {
        return false;
    }

    public final boolean K() {
        return this.f14918a.isPrimitive();
    }

    public final boolean L() {
        return d4.h.T(this.f14918a);
    }

    public boolean M() {
        return Throwable.class.isAssignableFrom(this.f14918a);
    }

    public final boolean N(Class cls) {
        Class<?> cls2 = this.f14918a;
        if (cls2 != cls && !cls.isAssignableFrom(cls2)) {
            return false;
        }
        return true;
    }

    public final boolean O(Class cls) {
        Class cls2 = this.f14918a;
        if (cls2 != cls && !cls2.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    public abstract j P(Class cls, c4.n nVar, j jVar, j[] jVarArr);

    public final boolean Q() {
        return this.f14922e;
    }

    public abstract j R(j jVar);

    public abstract j S(Object obj);

    public abstract j T(Object obj);

    public j U(j jVar) {
        j jVar2;
        Object t10 = jVar.t();
        if (t10 != this.f14921d) {
            jVar2 = W(t10);
        } else {
            jVar2 = this;
        }
        Object u10 = jVar.u();
        if (u10 != this.f14920c) {
            return jVar2.X(u10);
        }
        return jVar2;
    }

    public abstract j V();

    public abstract j W(Object obj);

    public abstract j X(Object obj);

    public abstract boolean equals(Object obj);

    public abstract j f(int i10);

    public abstract int g();

    public j h(int i10) {
        j f10 = f(i10);
        if (f10 == null) {
            return c4.o.O();
        }
        return f10;
    }

    public final int hashCode() {
        return this.f14919b;
    }

    public abstract j i(Class cls);

    public abstract c4.n j();

    public j k() {
        return null;
    }

    public abstract StringBuilder l(StringBuilder sb);

    public String m() {
        StringBuilder sb = new StringBuilder(40);
        n(sb);
        return sb.toString();
    }

    public abstract StringBuilder n(StringBuilder sb);

    public abstract List o();

    public j p() {
        return null;
    }

    public final Class q() {
        return this.f14918a;
    }

    @Override // i3.a
    /* renamed from: r */
    public j a() {
        return null;
    }

    public abstract j s();

    public Object t() {
        return this.f14921d;
    }

    public abstract String toString();

    public Object u() {
        return this.f14920c;
    }

    public boolean v() {
        return true;
    }

    public boolean w() {
        if (g() > 0) {
            return true;
        }
        return false;
    }

    public boolean x() {
        if (this.f14921d == null && this.f14920c == null) {
            return false;
        }
        return true;
    }

    public final boolean y(Class cls) {
        if (this.f14918a == cls) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return Modifier.isAbstract(this.f14918a.getModifiers());
    }
}
