package n3;

import b3.k;
import com.fasterxml.jackson.databind.deser.std.a0;
import java.io.Serializable;
import java.util.HashMap;
import k3.k;
/* loaded from: classes.dex */
public final class m implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final d4.n f17236a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f17237b;

    public m() {
        this(2000);
    }

    public k3.k a(k3.g gVar, n nVar, k3.j jVar) {
        boolean z10;
        try {
            k3.k c10 = c(gVar, nVar, jVar);
            if (c10 == null) {
                return null;
            }
            if (!h(jVar) && c10.isCachable()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c10 instanceof r) {
                this.f17237b.put(jVar, c10);
                ((r) c10).resolve(gVar);
                this.f17237b.remove(jVar);
            }
            if (z10) {
                this.f17236a.a(jVar, c10);
            }
            return c10;
        } catch (IllegalArgumentException e10) {
            throw k3.l.k(gVar, d4.h.o(e10), e10);
        }
    }

    public k3.k b(k3.g gVar, n nVar, k3.j jVar) {
        k3.k kVar;
        synchronized (this.f17237b) {
            k3.k e10 = e(jVar);
            if (e10 != null) {
                return e10;
            }
            int size = this.f17237b.size();
            if (size > 0 && (kVar = (k3.k) this.f17237b.get(jVar)) != null) {
                return kVar;
            }
            k3.k a10 = a(gVar, nVar, jVar);
            if (size == 0 && this.f17237b.size() > 0) {
                this.f17237b.clear();
            }
            return a10;
        }
    }

    public k3.k c(k3.g gVar, n nVar, k3.j jVar) {
        k3.f k10 = gVar.k();
        if (jVar.z() || jVar.J() || jVar.B()) {
            jVar = nVar.m(k10, jVar);
        }
        k3.c g02 = k10.g0(jVar);
        k3.k l10 = l(gVar, g02.u());
        if (l10 != null) {
            return l10;
        }
        k3.j o10 = o(gVar, g02.u(), jVar);
        if (o10 != jVar) {
            g02 = k10.g0(o10);
            jVar = o10;
        }
        Class m10 = g02.m();
        if (m10 != null) {
            return nVar.c(gVar, jVar, g02, m10);
        }
        d4.j f10 = g02.f();
        if (f10 == null) {
            return d(gVar, nVar, jVar, g02);
        }
        k3.j b10 = f10.b(gVar.l());
        if (!b10.y(jVar.q())) {
            g02 = k10.g0(b10);
        }
        return new a0(f10, b10, d(gVar, nVar, b10, g02));
    }

    public k3.k d(k3.g gVar, n nVar, k3.j jVar, k3.c cVar) {
        k3.f k10 = gVar.k();
        if (jVar.F()) {
            return nVar.f(gVar, jVar, cVar);
        }
        if (jVar.D()) {
            if (jVar.A()) {
                return nVar.a(gVar, (c4.a) jVar, cVar);
            }
            if (jVar.J() && cVar.g(null).i() != k.c.OBJECT) {
                c4.g gVar2 = (c4.g) jVar;
                if (gVar2 instanceof c4.h) {
                    return nVar.h(gVar, (c4.h) gVar2, cVar);
                }
                return nVar.i(gVar, gVar2, cVar);
            } else if (jVar.B() && cVar.g(null).i() != k.c.OBJECT) {
                c4.d dVar = (c4.d) jVar;
                if (dVar instanceof c4.e) {
                    return nVar.d(gVar, (c4.e) dVar, cVar);
                }
                return nVar.e(gVar, dVar, cVar);
            }
        }
        if (jVar.b()) {
            return nVar.j(gVar, (c4.j) jVar, cVar);
        }
        if (k3.m.class.isAssignableFrom(jVar.q())) {
            return nVar.k(k10, jVar, cVar);
        }
        return nVar.b(gVar, jVar, cVar);
    }

    public k3.k e(k3.j jVar) {
        if (jVar != null) {
            if (h(jVar)) {
                return null;
            }
            return (k3.k) this.f17236a.get(jVar);
        }
        throw new IllegalArgumentException("Null JavaType passed");
    }

    public k3.p f(k3.g gVar, k3.j jVar) {
        return (k3.p) gVar.q(jVar, "Cannot find a (Map) Key deserializer for type " + jVar);
    }

    public k3.k g(k3.g gVar, k3.j jVar) {
        if (!d4.h.K(jVar.q())) {
            return (k3.k) gVar.q(jVar, "Cannot find a Value deserializer for abstract type " + jVar);
        }
        return (k3.k) gVar.q(jVar, "Cannot find a Value deserializer for type " + jVar);
    }

    public final boolean h(k3.j jVar) {
        if (jVar.D()) {
            k3.j k10 = jVar.k();
            if (k10 != null && (k10.u() != null || k10.t() != null)) {
                return true;
            }
            if (jVar.J() && jVar.p().u() != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Class i(Object obj, String str, Class cls) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Class) {
            Class cls2 = (Class) obj;
            if (cls2 == cls || d4.h.J(cls2)) {
                return null;
            }
            return cls2;
        }
        throw new IllegalStateException("AnnotationIntrospector." + str + "() returned value of type " + obj.getClass().getName() + ": expected type JsonSerializer or Class<JsonSerializer> instead");
    }

    public d4.j j(k3.g gVar, r3.b bVar) {
        Object l10 = gVar.K().l(bVar);
        if (l10 == null) {
            return null;
        }
        return gVar.j(bVar, l10);
    }

    public k3.k k(k3.g gVar, r3.b bVar, k3.k kVar) {
        d4.j j10 = j(gVar, bVar);
        if (j10 == null) {
            return kVar;
        }
        return new a0(j10, j10.b(gVar.l()), kVar);
    }

    public k3.k l(k3.g gVar, r3.b bVar) {
        Object m10 = gVar.K().m(bVar);
        if (m10 == null) {
            return null;
        }
        return k(gVar, bVar, gVar.y(bVar, m10));
    }

    public k3.p m(k3.g gVar, n nVar, k3.j jVar) {
        k3.p g10 = nVar.g(gVar, jVar);
        if (g10 == null) {
            return f(gVar, jVar);
        }
        if (g10 instanceof r) {
            ((r) g10).resolve(gVar);
        }
        return g10;
    }

    public k3.k n(k3.g gVar, n nVar, k3.j jVar) {
        k3.k e10 = e(jVar);
        if (e10 == null) {
            k3.k b10 = b(gVar, nVar, jVar);
            if (b10 == null) {
                return g(gVar, jVar);
            }
            return b10;
        }
        return e10;
    }

    public final k3.j o(k3.g gVar, r3.b bVar, k3.j jVar) {
        Object f10;
        k3.k kVar;
        k3.j p10;
        Object u10;
        k3.p p02;
        k3.b K = gVar.K();
        if (K == null) {
            return jVar;
        }
        if (jVar.J() && (p10 = jVar.p()) != null && p10.u() == null && (u10 = K.u(bVar)) != null && (p02 = gVar.p0(bVar, u10)) != null) {
            jVar = ((c4.g) jVar).c0(p02);
        }
        k3.j k10 = jVar.k();
        if (k10 != null && k10.u() == null && (f10 = K.f(bVar)) != null) {
            if (f10 instanceof k3.k) {
                kVar = (k3.k) f10;
            } else {
                Class i10 = i(f10, "findContentDeserializer", k.a.class);
                if (i10 != null) {
                    kVar = gVar.y(bVar, i10);
                } else {
                    kVar = null;
                }
            }
            if (kVar != null) {
                jVar = jVar.T(kVar);
            }
        }
        return K.u0(gVar.k(), bVar, jVar);
    }

    public m(int i10) {
        this.f17237b = new HashMap(8);
        this.f17236a = new d4.n(Math.min(64, i10 >> 2), i10);
    }
}
