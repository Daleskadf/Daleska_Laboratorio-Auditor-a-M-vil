package e;

import android.os.Build;
import android.util.Log;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import m6.AbstractC1447h;
import m6.AbstractC1453n;
import m6.C1445f;
import z0.AbstractComponentCallbacksC2061v;
import z0.C2041a;
import z0.C2053m;
import z0.L;
import z0.U;
import z0.X;
import z0.Y;
/* renamed from: e.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0918D {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f10511a;

    /* renamed from: b  reason: collision with root package name */
    public final C1445f f10512b = new C1445f();

    /* renamed from: c  reason: collision with root package name */
    public z0.D f10513c;

    /* renamed from: d  reason: collision with root package name */
    public final OnBackInvokedCallback f10514d;

    /* renamed from: e  reason: collision with root package name */
    public OnBackInvokedDispatcher f10515e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f10516g;

    public C0918D(Runnable runnable) {
        OnBackInvokedCallback a7;
        this.f10511a = runnable;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33) {
            if (i7 >= 34) {
                a7 = z.f10586a.a(new v(this, 0), new v(this, 1), new w(this, 0), new w(this, 1));
            } else {
                a7 = x.f10581a.a(new w(this, 2));
            }
            this.f10514d = a7;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void a() {
        ?? r22;
        z0.D d7 = this.f10513c;
        if (d7 == null) {
            C1445f c1445f = this.f10512b;
            ListIterator listIterator = c1445f.listIterator(c1445f.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    r22 = listIterator.previous();
                    if (((z0.D) r22).f16630a) {
                        break;
                    }
                } else {
                    r22 = 0;
                    break;
                }
            }
            d7 = r22;
        }
        this.f10513c = null;
        if (d7 != null) {
            d7.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    public final void b() {
        ?? r22;
        z0.D d7 = this.f10513c;
        if (d7 == null) {
            C1445f c1445f = this.f10512b;
            c1445f.getClass();
            ListIterator listIterator = c1445f.listIterator(c1445f.f14072c);
            while (true) {
                if (listIterator.hasPrevious()) {
                    r22 = listIterator.previous();
                    if (((z0.D) r22).f16630a) {
                        break;
                    }
                } else {
                    r22 = 0;
                    break;
                }
            }
            d7 = r22;
        }
        this.f10513c = null;
        if (d7 != null) {
            boolean isLoggable = Log.isLoggable("FragmentManager", 3);
            L l8 = d7.f16633d;
            if (isLoggable) {
                Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + l8);
            }
            l8.A(true);
            C2041a c2041a = l8.f16664h;
            z0.D d8 = l8.f16665i;
            if (c2041a != null) {
                ArrayList arrayList = l8.f16668m;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(L.F(l8.f16664h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() == null) {
                            Iterator it2 = linkedHashSet.iterator();
                            if (it2.hasNext()) {
                                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) it2.next();
                                throw null;
                            }
                        } else {
                            throw new ClassCastException();
                        }
                    }
                }
                Iterator it3 = l8.f16664h.f16728a.iterator();
                while (it3.hasNext()) {
                    AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = ((U) it3.next()).f16716b;
                    if (abstractComponentCallbacksC2061v2 != null) {
                        abstractComponentCallbacksC2061v2.f16834h0 = false;
                    }
                }
                Iterator it4 = l8.f(new ArrayList(Collections.singletonList(l8.f16664h)), 0, 1).iterator();
                while (it4.hasNext()) {
                    C2053m c2053m = (C2053m) it4.next();
                    c2053m.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    ArrayList operations = c2053m.f16778c;
                    c2053m.f(operations);
                    c2053m.getClass();
                    kotlin.jvm.internal.j.e(operations, "operations");
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it5 = operations.iterator();
                    while (it5.hasNext()) {
                        ((Y) it5.next()).getClass();
                        AbstractC1453n.N(arrayList2, null);
                    }
                    List Y3 = AbstractC1447h.Y(AbstractC1447h.b0(arrayList2));
                    int size = Y3.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ((X) Y3.get(i7)).a(c2053m.f16776a);
                    }
                    int size2 = operations.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        c2053m.a((Y) operations.get(i8));
                    }
                    List Y7 = AbstractC1447h.Y(operations);
                    if (Y7.size() > 0) {
                        ((Y) Y7.get(0)).getClass();
                        throw null;
                    }
                }
                l8.f16664h = null;
                l8.e0();
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + d8.f16630a + " for  FragmentManager " + l8);
                    return;
                }
                return;
            } else if (d8.f16630a) {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                l8.Q();
                return;
            } else {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                l8.f16663g.b();
                return;
            }
        }
        this.f10511a.run();
    }

    public final void c(boolean z7) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f10515e;
        OnBackInvokedCallback onBackInvokedCallback = this.f10514d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            x xVar = x.f10581a;
            if (z7 && !this.f) {
                xVar.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z7 && this.f) {
                xVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void d() {
        boolean z7 = this.f10516g;
        C1445f c1445f = this.f10512b;
        boolean z8 = false;
        if (!(c1445f instanceof Collection) || !c1445f.isEmpty()) {
            Iterator it = c1445f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((z0.D) it.next()).f16630a) {
                    z8 = true;
                    break;
                }
            }
        }
        this.f10516g = z8;
        if (z8 != z7 && Build.VERSION.SDK_INT >= 33) {
            c(z8);
        }
    }
}
