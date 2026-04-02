package z0;

import D.AbstractC0059i;
import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.EnumC0563o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p.C1608t;
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final C1608t f16710a;

    /* renamed from: b  reason: collision with root package name */
    public final E.e f16711b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractComponentCallbacksC2061v f16712c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f16713d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f16714e = -1;

    public T(C1608t c1608t, E.e eVar, AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        this.f16710a = c1608t;
        this.f16711b = eVar;
        this.f16712c = abstractComponentCallbacksC2061v;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC2061v);
        }
        Bundle bundle = abstractComponentCallbacksC2061v.f16827b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC2061v.f16842p0.P();
        abstractComponentCallbacksC2061v.f16826a = 3;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.t();
        if (abstractComponentCallbacksC2061v.f16850y0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC2061v);
            }
            abstractComponentCallbacksC2061v.f16827b = null;
            L l8 = abstractComponentCallbacksC2061v.f16842p0;
            l8.f16649G = false;
            l8.f16650H = false;
            l8.f16656N.f16694g = false;
            l8.u(4);
            this.f16710a.F(abstractComponentCallbacksC2061v, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onActivityCreated()");
    }

    public final void b() {
        T t7;
        Bundle bundle;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC2061v);
        }
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = abstractComponentCallbacksC2061v.f16823X;
        E.e eVar = this.f16711b;
        if (abstractComponentCallbacksC2061v2 != null) {
            t7 = (T) ((HashMap) eVar.f921c).get(abstractComponentCallbacksC2061v2.f16830e);
            if (t7 != null) {
                abstractComponentCallbacksC2061v.f16824Y = abstractComponentCallbacksC2061v.f16823X.f16830e;
                abstractComponentCallbacksC2061v.f16823X = null;
            } else {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC2061v + " declared target fragment " + abstractComponentCallbacksC2061v.f16823X + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = abstractComponentCallbacksC2061v.f16824Y;
            if (str != null) {
                t7 = (T) ((HashMap) eVar.f921c).get(str);
                if (t7 == null) {
                    StringBuilder sb = new StringBuilder("Fragment ");
                    sb.append(abstractComponentCallbacksC2061v);
                    sb.append(" declared target fragment ");
                    throw new IllegalStateException(AbstractC0059i.D(sb, abstractComponentCallbacksC2061v.f16824Y, " that does not belong to this FragmentManager!"));
                }
            } else {
                t7 = null;
            }
        }
        if (t7 != null) {
            t7.j();
        }
        L l8 = abstractComponentCallbacksC2061v.f16840n0;
        abstractComponentCallbacksC2061v.f16841o0 = l8.f16677v;
        abstractComponentCallbacksC2061v.q0 = l8.f16679x;
        C1608t c1608t = this.f16710a;
        c1608t.L(abstractComponentCallbacksC2061v, false);
        ArrayList arrayList = abstractComponentCallbacksC2061v.f16821K0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v3 = ((C2058s) it.next()).f16800a;
            abstractComponentCallbacksC2061v3.f16820J0.l();
            androidx.lifecycle.O.d(abstractComponentCallbacksC2061v3);
            Bundle bundle2 = abstractComponentCallbacksC2061v3.f16827b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            abstractComponentCallbacksC2061v3.f16820J0.m(bundle);
        }
        arrayList.clear();
        abstractComponentCallbacksC2061v.f16842p0.b(abstractComponentCallbacksC2061v.f16841o0, abstractComponentCallbacksC2061v.i(), abstractComponentCallbacksC2061v);
        abstractComponentCallbacksC2061v.f16826a = 0;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.v(abstractComponentCallbacksC2061v.f16841o0.f16857e);
        if (abstractComponentCallbacksC2061v.f16850y0) {
            Iterator it2 = abstractComponentCallbacksC2061v.f16840n0.f16670o.iterator();
            while (it2.hasNext()) {
                ((O) it2.next()).e();
            }
            L l9 = abstractComponentCallbacksC2061v.f16842p0;
            l9.f16649G = false;
            l9.f16650H = false;
            l9.f16656N.f16694g = false;
            l9.u(0);
            c1608t.G(abstractComponentCallbacksC2061v, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onAttach()");
    }

    public final int c() {
        Object obj;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (abstractComponentCallbacksC2061v.f16840n0 == null) {
            return abstractComponentCallbacksC2061v.f16826a;
        }
        int i7 = this.f16714e;
        int i8 = S.f16709a[abstractComponentCallbacksC2061v.f16817G0.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        i7 = Math.min(i7, -1);
                    } else {
                        i7 = Math.min(i7, 0);
                    }
                } else {
                    i7 = Math.min(i7, 1);
                }
            } else {
                i7 = Math.min(i7, 5);
            }
        }
        if (abstractComponentCallbacksC2061v.f16835i0) {
            if (abstractComponentCallbacksC2061v.f16836j0) {
                i7 = Math.max(this.f16714e, 2);
            } else if (this.f16714e < 4) {
                i7 = Math.min(i7, abstractComponentCallbacksC2061v.f16826a);
            } else {
                i7 = Math.min(i7, 1);
            }
        }
        if (!abstractComponentCallbacksC2061v.f16832f0) {
            i7 = Math.min(i7, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2061v.f16851z0;
        Object obj2 = null;
        if (viewGroup != null) {
            C2053m e7 = C2053m.e(viewGroup, abstractComponentCallbacksC2061v.n());
            e7.getClass();
            Iterator it = e7.f16777b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    ((Y) obj).getClass();
                    if (kotlin.jvm.internal.j.a(null, abstractComponentCallbacksC2061v)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Y y2 = (Y) obj;
            Iterator it2 = e7.f16778c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                ((Y) next).getClass();
                if (kotlin.jvm.internal.j.a(null, abstractComponentCallbacksC2061v)) {
                    obj2 = next;
                    break;
                }
            }
            Y y3 = (Y) obj2;
        }
        if (Z.ADDING == null) {
            i7 = Math.min(i7, 6);
        } else if (Z.REMOVING == null) {
            i7 = Math.max(i7, 3);
        } else if (abstractComponentCallbacksC2061v.f16833g0) {
            if (abstractComponentCallbacksC2061v.s()) {
                i7 = Math.min(i7, 1);
            } else {
                i7 = Math.min(i7, -1);
            }
        }
        if (abstractComponentCallbacksC2061v.f16811A0 && abstractComponentCallbacksC2061v.f16826a < 5) {
            i7 = Math.min(i7, 4);
        }
        if (abstractComponentCallbacksC2061v.f16834h0 && abstractComponentCallbacksC2061v.f16851z0 != null) {
            i7 = Math.max(i7, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i7 + " for " + abstractComponentCallbacksC2061v);
        }
        return i7;
    }

    public final void d() {
        Bundle bundle;
        Bundle bundle2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC2061v);
        }
        Bundle bundle3 = abstractComponentCallbacksC2061v.f16827b;
        if (bundle3 != null) {
            bundle = bundle3.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        if (!abstractComponentCallbacksC2061v.f16815E0) {
            C1608t c1608t = this.f16710a;
            c1608t.M(abstractComponentCallbacksC2061v, false);
            abstractComponentCallbacksC2061v.f16842p0.P();
            abstractComponentCallbacksC2061v.f16826a = 1;
            abstractComponentCallbacksC2061v.f16850y0 = false;
            abstractComponentCallbacksC2061v.f16818H0.a(new Z1.b(abstractComponentCallbacksC2061v, 4));
            abstractComponentCallbacksC2061v.w(bundle);
            abstractComponentCallbacksC2061v.f16815E0 = true;
            if (abstractComponentCallbacksC2061v.f16850y0) {
                abstractComponentCallbacksC2061v.f16818H0.e(EnumC0562n.ON_CREATE);
                c1608t.H(abstractComponentCallbacksC2061v, false);
                return;
            }
            throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onCreate()");
        }
        abstractComponentCallbacksC2061v.f16826a = 1;
        Bundle bundle4 = abstractComponentCallbacksC2061v.f16827b;
        if (bundle4 != null && (bundle2 = bundle4.getBundle("childFragmentManager")) != null) {
            abstractComponentCallbacksC2061v.f16842p0.U(bundle2);
            L l8 = abstractComponentCallbacksC2061v.f16842p0;
            l8.f16649G = false;
            l8.f16650H = false;
            l8.f16656N.f16694g = false;
            l8.u(1);
        }
    }

    public final void e() {
        Bundle bundle;
        String str;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (abstractComponentCallbacksC2061v.f16835i0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2061v);
        }
        Bundle bundle2 = abstractComponentCallbacksC2061v.f16827b;
        ViewGroup viewGroup = null;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("savedInstanceState");
        } else {
            bundle = null;
        }
        LayoutInflater A7 = abstractComponentCallbacksC2061v.A(bundle);
        ViewGroup viewGroup2 = abstractComponentCallbacksC2061v.f16851z0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i7 = abstractComponentCallbacksC2061v.f16844s0;
            if (i7 != 0) {
                if (i7 != -1) {
                    viewGroup = (ViewGroup) abstractComponentCallbacksC2061v.f16840n0.f16678w.H(i7);
                    if (viewGroup == null) {
                        if (!abstractComponentCallbacksC2061v.f16837k0) {
                            try {
                                str = abstractComponentCallbacksC2061v.G().getResources().getResourceName(abstractComponentCallbacksC2061v.f16844s0);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC2061v.f16844s0) + " (" + str + ") for fragment " + abstractComponentCallbacksC2061v);
                        }
                    } else if (!(viewGroup instanceof C2040A)) {
                        A0.c cVar = A0.d.f35a;
                        A0.d.b(new A0.a(abstractComponentCallbacksC2061v, "Attempting to add fragment " + abstractComponentCallbacksC2061v + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        A0.d.a(abstractComponentCallbacksC2061v).getClass();
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC2061v + " for a container view with no id");
                }
            }
        }
        abstractComponentCallbacksC2061v.f16851z0 = viewGroup;
        abstractComponentCallbacksC2061v.F(A7, viewGroup, bundle);
        abstractComponentCallbacksC2061v.f16826a = 2;
    }

    public final void f() {
        boolean z7;
        boolean z8;
        AbstractComponentCallbacksC2061v D4;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC2061v);
        }
        boolean z9 = true;
        if (abstractComponentCallbacksC2061v.f16833g0 && !abstractComponentCallbacksC2061v.s()) {
            z7 = true;
        } else {
            z7 = false;
        }
        E.e eVar = this.f16711b;
        if (z7) {
            eVar.i0(abstractComponentCallbacksC2061v.f16830e, null);
        }
        if (!z7) {
            N n7 = (N) eVar.f923e;
            if (!n7.f16690b.containsKey(abstractComponentCallbacksC2061v.f16830e) || !n7.f16693e) {
                z8 = true;
            } else {
                z8 = n7.f;
            }
            if (!z8) {
                String str = abstractComponentCallbacksC2061v.f16824Y;
                if (str != null && (D4 = eVar.D(str)) != null && D4.f16848w0) {
                    abstractComponentCallbacksC2061v.f16823X = D4;
                }
                abstractComponentCallbacksC2061v.f16826a = 0;
                return;
            }
        }
        C2063x c2063x = abstractComponentCallbacksC2061v.f16841o0;
        if (c2063x instanceof androidx.lifecycle.Y) {
            z9 = ((N) eVar.f923e).f;
        } else {
            AbstractActivityC2064y abstractActivityC2064y = c2063x.f16857e;
            if (abstractActivityC2064y instanceof Activity) {
                z9 = true ^ abstractActivityC2064y.isChangingConfigurations();
            }
        }
        if (z7 || z9) {
            ((N) eVar.f923e).d(abstractComponentCallbacksC2061v, false);
        }
        abstractComponentCallbacksC2061v.f16842p0.l();
        abstractComponentCallbacksC2061v.f16818H0.e(EnumC0562n.ON_DESTROY);
        abstractComponentCallbacksC2061v.f16826a = 0;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.f16815E0 = false;
        abstractComponentCallbacksC2061v.x();
        if (abstractComponentCallbacksC2061v.f16850y0) {
            this.f16710a.I(abstractComponentCallbacksC2061v, false);
            Iterator it = eVar.F().iterator();
            while (it.hasNext()) {
                T t7 = (T) it.next();
                if (t7 != null) {
                    String str2 = abstractComponentCallbacksC2061v.f16830e;
                    AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = t7.f16712c;
                    if (str2.equals(abstractComponentCallbacksC2061v2.f16824Y)) {
                        abstractComponentCallbacksC2061v2.f16823X = abstractComponentCallbacksC2061v;
                        abstractComponentCallbacksC2061v2.f16824Y = null;
                    }
                }
            }
            String str3 = abstractComponentCallbacksC2061v.f16824Y;
            if (str3 != null) {
                abstractComponentCallbacksC2061v.f16823X = eVar.D(str3);
            }
            eVar.O(this);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onDestroy()");
    }

    public final void g() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC2061v);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC2061v.f16851z0;
        abstractComponentCallbacksC2061v.f16842p0.u(1);
        abstractComponentCallbacksC2061v.f16826a = 1;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.y();
        if (abstractComponentCallbacksC2061v.f16850y0) {
            androidx.lifecycle.X store = abstractComponentCallbacksC2061v.g();
            t2.i iVar = D0.c.f827d;
            kotlin.jvm.internal.j.e(store, "store");
            B0.a defaultCreationExtras = B0.a.f228b;
            kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
            V2.k kVar = new V2.k(store, iVar, defaultCreationExtras);
            kotlin.jvm.internal.e a7 = kotlin.jvm.internal.s.a(D0.c.class);
            String b5 = a7.b();
            if (b5 != null) {
                S.l lVar = ((D0.c) kVar.v(a7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b5))).f828b;
                int i7 = lVar.f4837c;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((D0.a) lVar.f4836b[i8]).m();
                }
                abstractComponentCallbacksC2061v.f16838l0 = false;
                this.f16710a.R(abstractComponentCallbacksC2061v, false);
                abstractComponentCallbacksC2061v.f16851z0 = null;
                abstractComponentCallbacksC2061v.f16819I0.l(null);
                abstractComponentCallbacksC2061v.f16836j0 = false;
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onDestroyView()");
    }

    public final void h() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC2061v);
        }
        abstractComponentCallbacksC2061v.f16826a = -1;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.z();
        if (abstractComponentCallbacksC2061v.f16850y0) {
            L l8 = abstractComponentCallbacksC2061v.f16842p0;
            if (!l8.f16651I) {
                l8.l();
                abstractComponentCallbacksC2061v.f16842p0 = new L();
            }
            this.f16710a.J(abstractComponentCallbacksC2061v, false);
            abstractComponentCallbacksC2061v.f16826a = -1;
            abstractComponentCallbacksC2061v.f16841o0 = null;
            abstractComponentCallbacksC2061v.q0 = null;
            abstractComponentCallbacksC2061v.f16840n0 = null;
            if (!abstractComponentCallbacksC2061v.f16833g0 || abstractComponentCallbacksC2061v.s()) {
                N n7 = (N) this.f16711b.f923e;
                boolean z7 = true;
                if (n7.f16690b.containsKey(abstractComponentCallbacksC2061v.f16830e) && n7.f16693e) {
                    z7 = n7.f;
                }
                if (!z7) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2061v);
            }
            abstractComponentCallbacksC2061v.p();
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onDetach()");
    }

    public final void i() {
        Bundle bundle;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (abstractComponentCallbacksC2061v.f16835i0 && abstractComponentCallbacksC2061v.f16836j0 && !abstractComponentCallbacksC2061v.f16838l0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC2061v);
            }
            Bundle bundle2 = abstractComponentCallbacksC2061v.f16827b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            abstractComponentCallbacksC2061v.F(abstractComponentCallbacksC2061v.A(bundle), null, bundle);
        }
    }

    public final void j() {
        E.e eVar = this.f16711b;
        boolean z7 = this.f16713d;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (z7) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC2061v);
                return;
            }
            return;
        }
        try {
            this.f16713d = true;
            boolean z8 = false;
            while (true) {
                int c8 = c();
                int i7 = abstractComponentCallbacksC2061v.f16826a;
                if (c8 != i7) {
                    if (c8 > i7) {
                        switch (i7 + 1) {
                            case 0:
                                b();
                                continue;
                            case 1:
                                d();
                                continue;
                            case 2:
                                i();
                                e();
                                continue;
                            case 3:
                                a();
                                continue;
                            case 4:
                                abstractComponentCallbacksC2061v.f16826a = 4;
                                continue;
                            case 5:
                                n();
                                continue;
                            case 6:
                                abstractComponentCallbacksC2061v.f16826a = 6;
                                continue;
                            case 7:
                                m();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i7 - 1) {
                            case -1:
                                h();
                                continue;
                            case 0:
                                f();
                                continue;
                            case 1:
                                g();
                                abstractComponentCallbacksC2061v.f16826a = 1;
                                continue;
                            case 2:
                                abstractComponentCallbacksC2061v.f16836j0 = false;
                                abstractComponentCallbacksC2061v.f16826a = 2;
                                continue;
                            case 3:
                                if (Log.isLoggable("FragmentManager", 3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC2061v);
                                }
                                abstractComponentCallbacksC2061v.f16826a = 3;
                                continue;
                            case 4:
                                o();
                                continue;
                            case 5:
                                abstractComponentCallbacksC2061v.f16826a = 5;
                                continue;
                            case 6:
                                k();
                                continue;
                            default:
                                continue;
                        }
                    }
                    z8 = true;
                } else {
                    if (!z8 && i7 == -1 && abstractComponentCallbacksC2061v.f16833g0 && !abstractComponentCallbacksC2061v.s()) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC2061v);
                        }
                        ((N) eVar.f923e).d(abstractComponentCallbacksC2061v, true);
                        eVar.O(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC2061v);
                        }
                        abstractComponentCallbacksC2061v.p();
                    }
                    if (abstractComponentCallbacksC2061v.f16814D0) {
                        L l8 = abstractComponentCallbacksC2061v.f16840n0;
                        if (l8 != null && abstractComponentCallbacksC2061v.f16832f0 && L.K(abstractComponentCallbacksC2061v)) {
                            l8.f16648F = true;
                        }
                        abstractComponentCallbacksC2061v.f16814D0 = false;
                        abstractComponentCallbacksC2061v.f16842p0.o();
                    }
                    this.f16713d = false;
                    return;
                }
            }
        } catch (Throwable th) {
            this.f16713d = false;
            throw th;
        }
    }

    public final void k() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC2061v);
        }
        abstractComponentCallbacksC2061v.f16842p0.u(5);
        abstractComponentCallbacksC2061v.f16818H0.e(EnumC0562n.ON_PAUSE);
        abstractComponentCallbacksC2061v.f16826a = 6;
        abstractComponentCallbacksC2061v.f16850y0 = true;
        this.f16710a.K(abstractComponentCallbacksC2061v, false);
    }

    public final void l(ClassLoader classLoader) {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        Bundle bundle = abstractComponentCallbacksC2061v.f16827b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC2061v.f16827b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC2061v.f16827b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC2061v.f16828c = abstractComponentCallbacksC2061v.f16827b.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC2061v.f16829d = abstractComponentCallbacksC2061v.f16827b.getBundle("viewRegistryState");
            Q q2 = (Q) abstractComponentCallbacksC2061v.f16827b.getParcelable("state");
            if (q2 != null) {
                abstractComponentCallbacksC2061v.f16824Y = q2.f16706g0;
                abstractComponentCallbacksC2061v.f16825Z = q2.f16707h0;
                abstractComponentCallbacksC2061v.f16812B0 = q2.f16708i0;
            }
            if (!abstractComponentCallbacksC2061v.f16812B0) {
                abstractComponentCallbacksC2061v.f16811A0 = true;
            }
        } catch (BadParcelableException e7) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC2061v, e7);
        }
    }

    public final void m() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC2061v);
        }
        C2060u c2060u = abstractComponentCallbacksC2061v.f16813C0;
        if (c2060u == null) {
            view = null;
        } else {
            view = c2060u.j;
        }
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC2061v.k().j = null;
        abstractComponentCallbacksC2061v.f16842p0.P();
        abstractComponentCallbacksC2061v.f16842p0.A(true);
        abstractComponentCallbacksC2061v.f16826a = 7;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.B();
        if (abstractComponentCallbacksC2061v.f16850y0) {
            abstractComponentCallbacksC2061v.f16818H0.e(EnumC0562n.ON_RESUME);
            L l8 = abstractComponentCallbacksC2061v.f16842p0;
            l8.f16649G = false;
            l8.f16650H = false;
            l8.f16656N.f16694g = false;
            l8.u(7);
            this.f16710a.N(abstractComponentCallbacksC2061v, false);
            this.f16711b.i0(abstractComponentCallbacksC2061v.f16830e, null);
            abstractComponentCallbacksC2061v.f16827b = null;
            abstractComponentCallbacksC2061v.f16828c = null;
            abstractComponentCallbacksC2061v.f16829d = null;
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onResume()");
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC2061v);
        }
        abstractComponentCallbacksC2061v.f16842p0.P();
        abstractComponentCallbacksC2061v.f16842p0.A(true);
        abstractComponentCallbacksC2061v.f16826a = 5;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.D();
        if (abstractComponentCallbacksC2061v.f16850y0) {
            abstractComponentCallbacksC2061v.f16818H0.e(EnumC0562n.ON_START);
            L l8 = abstractComponentCallbacksC2061v.f16842p0;
            l8.f16649G = false;
            l8.f16650H = false;
            l8.f16656N.f16694g = false;
            l8.u(5);
            this.f16710a.P(abstractComponentCallbacksC2061v, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onStart()");
    }

    public final void o() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16712c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC2061v);
        }
        L l8 = abstractComponentCallbacksC2061v.f16842p0;
        l8.f16650H = true;
        l8.f16656N.f16694g = true;
        l8.u(4);
        abstractComponentCallbacksC2061v.f16818H0.e(EnumC0562n.ON_STOP);
        abstractComponentCallbacksC2061v.f16826a = 4;
        abstractComponentCallbacksC2061v.f16850y0 = false;
        abstractComponentCallbacksC2061v.E();
        if (abstractComponentCallbacksC2061v.f16850y0) {
            this.f16710a.Q(abstractComponentCallbacksC2061v, false);
            return;
        }
        throw new AndroidRuntimeException("Fragment " + abstractComponentCallbacksC2061v + " did not call through to super.onStop()");
    }

    public T(C1608t c1608t, E.e eVar, ClassLoader classLoader, F f, Bundle bundle) {
        this.f16710a = c1608t;
        this.f16711b = eVar;
        Q q2 = (Q) bundle.getParcelable("state");
        AbstractComponentCallbacksC2061v a7 = f.a(q2.f16699a);
        a7.f16830e = q2.f16700b;
        a7.f16835i0 = q2.f16701c;
        a7.f16837k0 = true;
        a7.f16843r0 = q2.f16702d;
        a7.f16844s0 = q2.f16703e;
        a7.f16845t0 = q2.f;
        a7.f16848w0 = q2.f16696X;
        a7.f16833g0 = q2.f16697Y;
        a7.f16847v0 = q2.f16698Z;
        a7.f16846u0 = q2.f16704e0;
        a7.f16817G0 = EnumC0563o.values()[q2.f16705f0];
        a7.f16824Y = q2.f16706g0;
        a7.f16825Z = q2.f16707h0;
        a7.f16812B0 = q2.f16708i0;
        this.f16712c = a7;
        a7.f16827b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        L l8 = a7.f16840n0;
        if (l8 != null && (l8.f16649G || l8.f16650H)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        a7.f = bundle2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a7);
        }
    }

    public T(C1608t c1608t, E.e eVar, AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v, Bundle bundle) {
        this.f16710a = c1608t;
        this.f16711b = eVar;
        this.f16712c = abstractComponentCallbacksC2061v;
        abstractComponentCallbacksC2061v.f16828c = null;
        abstractComponentCallbacksC2061v.f16829d = null;
        abstractComponentCallbacksC2061v.f16839m0 = 0;
        abstractComponentCallbacksC2061v.f16836j0 = false;
        abstractComponentCallbacksC2061v.f16832f0 = false;
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = abstractComponentCallbacksC2061v.f16823X;
        abstractComponentCallbacksC2061v.f16824Y = abstractComponentCallbacksC2061v2 != null ? abstractComponentCallbacksC2061v2.f16830e : null;
        abstractComponentCallbacksC2061v.f16823X = null;
        abstractComponentCallbacksC2061v.f16827b = bundle;
        abstractComponentCallbacksC2061v.f = bundle.getBundle("arguments");
    }
}
