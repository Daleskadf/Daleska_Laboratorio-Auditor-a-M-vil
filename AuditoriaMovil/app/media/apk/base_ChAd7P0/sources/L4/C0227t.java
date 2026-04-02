package L4;

import c5.C0639a;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
/* renamed from: L4.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227t extends I4.G {

    /* renamed from: a  reason: collision with root package name */
    public final I f3005a;

    /* renamed from: b  reason: collision with root package name */
    public final I f3006b;

    /* renamed from: c  reason: collision with root package name */
    public final K4.p f3007c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0212d f3008d;

    public C0227t(C0212d c0212d, I4.n nVar, Type type, I4.G g3, Type type2, I4.G g4, K4.p pVar) {
        this.f3008d = c0212d;
        this.f3005a = new I(nVar, g3, type);
        this.f3006b = new I(nVar, g4, type2);
        this.f3007c = pVar;
    }

    @Override // I4.G
    public final Object b(Q4.a aVar) {
        Q4.b D4 = aVar.D();
        if (D4 == Q4.b.NULL) {
            aVar.z();
            return null;
        }
        Map map = (Map) this.f3007c.c();
        if (D4 == Q4.b.BEGIN_ARRAY) {
            aVar.a();
            while (aVar.q()) {
                aVar.a();
                Object b5 = ((I4.G) this.f3005a.f2936c).b(aVar);
                if (map.put(b5, ((I4.G) this.f3006b.f2936c).b(aVar)) == null) {
                    aVar.g();
                } else {
                    throw new RuntimeException("duplicate key: " + b5);
                }
            }
            aVar.g();
        } else {
            aVar.b();
            while (aVar.q()) {
                C0639a.f8416a.getClass();
                if (aVar instanceof C0225q) {
                    C0225q c0225q = (C0225q) aVar;
                    c0225q.N(Q4.b.NAME);
                    Map.Entry entry = (Map.Entry) ((Iterator) c0225q.R()).next();
                    c0225q.T(entry.getValue());
                    c0225q.T(new I4.u((String) entry.getKey()));
                } else {
                    int i7 = aVar.f4390Y;
                    if (i7 == 0) {
                        i7 = aVar.d();
                    }
                    if (i7 == 13) {
                        aVar.f4390Y = 9;
                    } else if (i7 == 12) {
                        aVar.f4390Y = 8;
                    } else if (i7 == 14) {
                        aVar.f4390Y = 10;
                    } else {
                        throw aVar.M("a name");
                    }
                }
                Object b7 = ((I4.G) this.f3005a.f2936c).b(aVar);
                if (map.put(b7, ((I4.G) this.f3006b.f2936c).b(aVar)) != null) {
                    throw new RuntimeException("duplicate key: " + b7);
                }
            }
            aVar.j();
        }
        return map;
    }

    @Override // I4.G
    public final void c(Q4.c cVar, Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            cVar.o();
            return;
        }
        this.f3008d.getClass();
        I i7 = this.f3006b;
        cVar.c();
        for (Map.Entry entry : map.entrySet()) {
            cVar.m(String.valueOf(entry.getKey()));
            i7.c(cVar, entry.getValue());
        }
        cVar.j();
    }
}
