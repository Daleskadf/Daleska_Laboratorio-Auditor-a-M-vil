package n4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* renamed from: n4.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1532s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14357a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1533t f14358b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E f14359c;

    public /* synthetic */ RunnableC1532s(C1533t c1533t, E e7, int i7) {
        this.f14357a = i7;
        this.f14358b = c1533t;
        this.f14359c = e7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EnumC1524j enumC1524j;
        boolean z7;
        E e7 = this.f14359c;
        C1533t c1533t = this.f14358b;
        boolean z8 = true;
        switch (this.f14357a) {
            case 0:
                E.e eVar = c1533t.j;
                eVar.getClass();
                D d7 = e7.f14280a;
                HashMap hashMap = (HashMap) eVar.f921c;
                C1526l c1526l = (C1526l) hashMap.get(d7);
                EnumC1524j enumC1524j2 = EnumC1524j.NO_ACTION_REQUIRED;
                if (c1526l != null) {
                    ArrayList arrayList = c1526l.f14346a;
                    arrayList.remove(e7);
                    if (arrayList.isEmpty()) {
                        if (e7.a()) {
                            enumC1524j = EnumC1524j.TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION;
                        } else {
                            enumC1524j = EnumC1524j.TERMINATE_LOCAL_LISTEN_ONLY;
                        }
                        enumC1524j2 = enumC1524j;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((E) it.next()).a()) {
                                }
                            } else if (e7.a()) {
                                enumC1524j2 = EnumC1524j.REQUIRE_WATCH_DISCONNECTION_ONLY;
                            }
                        }
                    }
                    int i7 = AbstractC1522h.f14341b[enumC1524j2.ordinal()];
                    J j = (J) eVar.f920b;
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                j.a("stopListeningToRemoteStore");
                                F f = (F) j.f14293c.get(d7);
                                if (f == null) {
                                    z8 = false;
                                }
                                m5.d.i("Trying to stop listening to a query not found", z8, new Object[0]);
                                int i8 = f.f14286b;
                                List list = (List) j.f14294d.get(Integer.valueOf(i8));
                                list.remove(d7);
                                if (list.isEmpty()) {
                                    j.f14292b.q(i8);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        hashMap.remove(d7);
                        j.k(d7, false);
                        return;
                    }
                    hashMap.remove(d7);
                    j.k(d7, true);
                    return;
                }
                return;
            default:
                E.e eVar2 = c1533t.j;
                eVar2.getClass();
                D d8 = e7.f14280a;
                EnumC1525k enumC1525k = EnumC1525k.NO_ACTION_REQUIRED;
                HashMap hashMap2 = (HashMap) eVar2.f921c;
                C1526l c1526l2 = (C1526l) hashMap2.get(d8);
                if (c1526l2 == null) {
                    c1526l2 = new C1526l();
                    hashMap2.put(d8, c1526l2);
                    enumC1525k = e7.a() ? EnumC1525k.INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION : EnumC1525k.INITIALIZE_LOCAL_LISTEN_ONLY;
                } else {
                    Iterator it2 = c1526l2.f14346a.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((E) it2.next()).a()) {
                            }
                        } else if (e7.a()) {
                            enumC1525k = EnumC1525k.REQUIRE_WATCH_CONNECTION_ONLY;
                        }
                    }
                }
                c1526l2.f14346a.add(e7);
                z zVar = (z) eVar2.f923e;
                e7.f14284e = zVar;
                T t7 = e7.f;
                if (t7 != null && !e7.f14283d && e7.d(t7, zVar)) {
                    e7.c(e7.f);
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", !z7, new Object[0]);
                T t8 = c1526l2.f14347b;
                if (t8 != null && e7.b(t8)) {
                    eVar2.W();
                }
                int i9 = AbstractC1522h.f14340a[enumC1525k.ordinal()];
                J j8 = (J) eVar2.f920b;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            j8.a("listenToRemoteStore");
                            m5.d.i("This is the first listen to query: %s", j8.f14293c.containsKey(d8), d8);
                            j8.f14292b.g(j8.f14291a.a(d8.i()));
                            return;
                        }
                        return;
                    }
                    j8.d(d8, false);
                    return;
                }
                j8.d(d8, true);
                return;
        }
    }
}
