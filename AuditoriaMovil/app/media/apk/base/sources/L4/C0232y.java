package L4;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: L4.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232y extends I4.G {

    /* renamed from: c  reason: collision with root package name */
    public static final C0228u f3015c = new C0228u(I4.E.DOUBLE, 1);

    /* renamed from: a  reason: collision with root package name */
    public final I4.n f3016a;

    /* renamed from: b  reason: collision with root package name */
    public final I4.E f3017b;

    public C0232y(I4.n nVar, I4.E e7) {
        this.f3016a = nVar;
        this.f3017b = e7;
    }

    public static Serializable e(Q4.a aVar, Q4.b bVar) {
        int i7 = AbstractC0231x.f3014a[bVar.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return null;
            }
            aVar.b();
            return new K4.o(true);
        }
        aVar.a();
        return new ArrayList();
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        String str;
        boolean z7;
        Q4.b D4 = aVar.D();
        Object e7 = e(aVar, D4);
        if (e7 == null) {
            return d(aVar, D4);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.q()) {
                if (e7 instanceof Map) {
                    str = aVar.x();
                } else {
                    str = null;
                }
                Q4.b D7 = aVar.D();
                Serializable e8 = e(aVar, D7);
                if (e8 != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (e8 == null) {
                    e8 = d(aVar, D7);
                }
                if (e7 instanceof List) {
                    ((List) e7).add(e8);
                } else {
                    ((Map) e7).put(str, e8);
                }
                if (z7) {
                    arrayDeque.addLast(e7);
                    e7 = e8;
                }
            } else {
                if (e7 instanceof List) {
                    aVar.g();
                } else {
                    aVar.j();
                }
                if (arrayDeque.isEmpty()) {
                    return e7;
                }
                e7 = arrayDeque.removeLast();
            }
        }
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        if (obj == null) {
            cVar.o();
            return;
        }
        Class<?> cls = obj.getClass();
        I4.n nVar = this.f3016a;
        nVar.getClass();
        I4.G c8 = nVar.c(new P4.a(cls));
        if (c8 instanceof C0232y) {
            cVar.c();
            cVar.j();
            return;
        }
        c8.c(cVar, obj);
    }

    public final Serializable d(Q4.a aVar, Q4.b bVar) {
        int i7 = AbstractC0231x.f3014a[bVar.ordinal()];
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 5) {
                    if (i7 == 6) {
                        aVar.z();
                        return null;
                    }
                    throw new IllegalStateException("Unexpected token: " + bVar);
                }
                return Boolean.valueOf(aVar.t());
            }
            return this.f3017b.a(aVar);
        }
        return aVar.B();
    }
}
