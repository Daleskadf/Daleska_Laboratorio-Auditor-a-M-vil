package c4;

import c1.RunnableC0626c;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import k4.C1395a;
import k4.InterfaceC1396b;
import k4.InterfaceC1397c;
/* loaded from: classes.dex */
public final class l implements InterfaceC1397c, InterfaceC1396b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8400a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f8401b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f8402c;

    public l(Executor executor) {
        this.f8402c = executor;
    }

    @Override // k4.InterfaceC1396b
    public final void a(C1395a c1395a) {
        c1395a.getClass();
        synchronized (this) {
            try {
                ArrayDeque arrayDeque = this.f8401b;
                if (arrayDeque != null) {
                    arrayDeque.add(c1395a);
                    return;
                }
                for (Map.Entry entry : b(c1395a)) {
                    ((Executor) entry.getValue()).execute(new RunnableC0626c(entry, c1395a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Set b(C1395a c1395a) {
        Set entrySet;
        try {
            HashMap hashMap = this.f8400a;
            c1395a.getClass();
            Map map = (Map) hashMap.get(U3.b.class);
            if (map == null) {
                entrySet = Collections.emptySet();
            } else {
                entrySet = map.entrySet();
            }
        } catch (Throwable th) {
            throw th;
        }
        return entrySet;
    }
}
