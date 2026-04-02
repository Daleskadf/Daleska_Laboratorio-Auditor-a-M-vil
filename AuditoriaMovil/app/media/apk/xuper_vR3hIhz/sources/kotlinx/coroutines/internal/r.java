package kotlinx.coroutines.internal;

import ca.p1;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f15772a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f15773b = false;

    /* renamed from: c  reason: collision with root package name */
    public static final p1 f15774c;

    static {
        r rVar = new r();
        f15772a = rVar;
        z.e("kotlinx.coroutines.fast.service.loader", true);
        f15774c = rVar.a();
    }

    public final p1 a() {
        List f10;
        Object next;
        p1 e10;
        try {
            if (f15773b) {
                f10 = h.f15748a.c();
            } else {
                f10 = aa.g.f(aa.e.a(ServiceLoader.load(q.class, q.class.getClassLoader()).iterator()));
            }
            Iterator it = f10.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int c10 = ((q) next).c();
                    do {
                        Object next2 = it.next();
                        int c11 = ((q) next2).c();
                        if (c10 < c11) {
                            next = next2;
                            c10 = c11;
                        }
                    } while (it.hasNext());
                }
            }
            q qVar = (q) next;
            if (qVar == null || (e10 = s.e(qVar, f10)) == null) {
                return s.b(null, null, 3, null);
            }
            return e10;
        } catch (Throwable th) {
            return s.b(th, null, 2, null);
        }
    }
}
