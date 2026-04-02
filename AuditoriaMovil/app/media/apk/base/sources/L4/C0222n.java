package L4;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
/* renamed from: L4.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0222n extends I4.G {

    /* renamed from: a  reason: collision with root package name */
    public static final C0222n f2966a = new C0222n();

    private C0222n() {
    }

    public static I4.q d(Q4.a aVar, Q4.b bVar) {
        int i7 = AbstractC0221m.f2965a[bVar.ordinal()];
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    if (i7 == 6) {
                        aVar.z();
                        return I4.s.f2218a;
                    }
                    throw new IllegalStateException("Unexpected token: " + bVar);
                }
                return new I4.u(Boolean.valueOf(aVar.t()));
            }
            return new I4.u(new K4.j(aVar.B()));
        }
        return new I4.u(aVar.B());
    }

    public static I4.q e(Q4.a aVar, Q4.b bVar) {
        int i7 = AbstractC0221m.f2965a[bVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return null;
            }
            aVar.b();
            return new I4.t();
        }
        aVar.a();
        return new I4.o();
    }

    public static void f(Q4.c cVar, I4.q qVar) {
        if (qVar != null && !(qVar instanceof I4.s)) {
            boolean z7 = qVar instanceof I4.u;
            if (z7) {
                if (z7) {
                    I4.u uVar = (I4.u) qVar;
                    Serializable serializable = uVar.f2220a;
                    if (serializable instanceof Number) {
                        cVar.w(uVar.l());
                        return;
                    } else if (serializable instanceof Boolean) {
                        cVar.y(uVar.e());
                        return;
                    } else {
                        cVar.x(uVar.h());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + qVar);
            }
            boolean z8 = qVar instanceof I4.o;
            if (z8) {
                cVar.b();
                if (z8) {
                    Iterator it = ((I4.o) qVar).f2217a.iterator();
                    while (it.hasNext()) {
                        f(cVar, (I4.q) it.next());
                    }
                    cVar.g();
                    return;
                }
                throw new IllegalStateException("Not a JSON Array: " + qVar);
            } else if (qVar instanceof I4.t) {
                cVar.c();
                Iterator it2 = ((K4.m) qVar.f().f2219a.entrySet()).iterator();
                while (((K4.l) it2).hasNext()) {
                    K4.n b5 = ((K4.l) it2).b();
                    cVar.m((String) b5.getKey());
                    f(cVar, (I4.q) b5.getValue());
                }
                cVar.j();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write " + qVar.getClass());
            }
        }
        cVar.o();
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        String str;
        boolean z7;
        if (aVar instanceof C0225q) {
            C0225q c0225q = (C0225q) aVar;
            Q4.b D4 = c0225q.D();
            if (D4 != Q4.b.NAME && D4 != Q4.b.END_ARRAY && D4 != Q4.b.END_OBJECT && D4 != Q4.b.END_DOCUMENT) {
                I4.q qVar = (I4.q) c0225q.R();
                c0225q.K();
                return qVar;
            }
            throw new IllegalStateException("Unexpected " + D4 + " when reading a JsonElement.");
        }
        Q4.b D7 = aVar.D();
        I4.q e7 = e(aVar, D7);
        if (e7 == null) {
            return d(aVar, D7);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.q()) {
                if (e7 instanceof I4.t) {
                    str = aVar.x();
                } else {
                    str = null;
                }
                Q4.b D8 = aVar.D();
                I4.q e8 = e(aVar, D8);
                if (e8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (e8 == null) {
                    e8 = d(aVar, D8);
                }
                if (e7 instanceof I4.o) {
                    ((I4.o) e7).f2217a.add(e8);
                } else {
                    I4.t tVar = (I4.t) e7;
                    tVar.getClass();
                    tVar.f2219a.put(str, e8);
                }
                if (z7) {
                    arrayDeque.addLast(e7);
                    e7 = e8;
                }
            } else {
                if (e7 instanceof I4.o) {
                    aVar.g();
                } else {
                    aVar.j();
                }
                if (arrayDeque.isEmpty()) {
                    return e7;
                }
                e7 = (I4.q) arrayDeque.removeLast();
            }
        }
    }

    @Override // I4.G
    public final /* bridge */ /* synthetic */ void c(Q4.c cVar, Object obj) {
        f(cVar, (I4.q) obj);
    }
}
