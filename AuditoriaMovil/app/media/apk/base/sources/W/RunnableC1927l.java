package w;

import D.j0;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: w.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1927l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16240a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1936u f16241b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f16242c;

    public /* synthetic */ RunnableC1927l(C1936u c1936u, ArrayList arrayList, int i7) {
        this.f16240a = i7;
        this.f16241b = c1936u;
        this.f16242c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p4.P p7;
        switch (this.f16240a) {
            case 0:
                C1936u c1936u = this.f16241b;
                ArrayList arrayList = this.f16242c;
                c1936u.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                boolean z7 = false;
                boolean z8 = false;
                while (it.hasNext()) {
                    C1918c c1918c = (C1918c) it.next();
                    if (c1936u.f16273a.L(c1918c.f16178a)) {
                        ((LinkedHashMap) c1936u.f16273a.f7210c).remove(c1918c.f16178a);
                        arrayList2.add(c1918c.f16178a);
                        if (c1918c.f16179b == j0.class) {
                            z8 = true;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    c1936u.t("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", null);
                    if (z8) {
                        c1936u.f16271Y.f16212X.getClass();
                    }
                    c1936u.p();
                    if (c1936u.f16273a.D().isEmpty()) {
                        c1936u.f16271Y.f16221f0.f5719a = false;
                    } else {
                        c1936u.L();
                    }
                    if (c1936u.f16273a.C().isEmpty()) {
                        c1936u.f16271Y.c();
                        c1936u.D();
                        c1936u.f16271Y.k(false);
                        c1936u.f16281h0 = c1936u.z();
                        c1936u.t("Closing camera.", null);
                        switch (c1936u.f16277e.ordinal()) {
                            case 3:
                                if (c1936u.f16279f0 == null) {
                                    z7 = true;
                                }
                                g0.c.g(null, z7);
                                c1936u.E(EnumC1934s.INITIALIZED);
                                return;
                            case 4:
                            default:
                                c1936u.t("close() ignored due to being in state: " + c1936u.f16277e, null);
                                return;
                            case 5:
                            case 6:
                            case 7:
                                if (c1936u.f16272Z.a() || ((p7 = (p4.P) c1936u.f16269C0.f14880b) != null && !((AtomicBoolean) p7.f15211b).get())) {
                                    z7 = true;
                                }
                                c1936u.f16269C0.s();
                                c1936u.E(EnumC1934s.CLOSING);
                                if (z7) {
                                    g0.c.g(null, c1936u.f16282i0.isEmpty());
                                    c1936u.r();
                                    return;
                                }
                                return;
                            case 8:
                            case 9:
                                c1936u.E(EnumC1934s.CLOSING);
                                c1936u.q();
                                return;
                        }
                    }
                    c1936u.K();
                    c1936u.D();
                    if (c1936u.f16277e == EnumC1934s.OPENED) {
                        c1936u.B();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList3 = this.f16242c;
                C1936u c1936u2 = this.f16241b;
                C1925j c1925j = c1936u2.f16271Y;
                try {
                    c1936u2.H(arrayList3);
                    return;
                } finally {
                    c1925j.c();
                }
        }
    }
}
