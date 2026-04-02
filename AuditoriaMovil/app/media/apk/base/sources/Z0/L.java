package z0;

import D.AbstractC0059i;
import W.C0364g;
import a1.C0415A;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0570w;
import androidx.lifecycle.EnumC0563o;
import b3.C0585f;
import c5.C0639a;
import com.example.appecoactivate.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e.C0915A;
import e.C0917C;
import e.C0918D;
import e.InterfaceC0919E;
import e.InterfaceC0922c;
import g.InterfaceC1000e;
import g0.InterfaceC1003a;
import g1.C1006c;
import h.C1020f;
import h0.InterfaceC1045e;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import k0.RunnableC1375b;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.utils.StringUtils;
import p.C1608t;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: A  reason: collision with root package name */
    public final C0639a f16643A;

    /* renamed from: B  reason: collision with root package name */
    public R1.j f16644B;

    /* renamed from: C  reason: collision with root package name */
    public R1.j f16645C;

    /* renamed from: D  reason: collision with root package name */
    public R1.j f16646D;

    /* renamed from: E  reason: collision with root package name */
    public ArrayDeque f16647E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f16648F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f16649G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f16650H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f16651I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f16652J;

    /* renamed from: K  reason: collision with root package name */
    public ArrayList f16653K;

    /* renamed from: L  reason: collision with root package name */
    public ArrayList f16654L;

    /* renamed from: M  reason: collision with root package name */
    public ArrayList f16655M;

    /* renamed from: N  reason: collision with root package name */
    public N f16656N;

    /* renamed from: O  reason: collision with root package name */
    public final RunnableC1375b f16657O;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16659b;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f16662e;

    /* renamed from: g  reason: collision with root package name */
    public C0918D f16663g;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f16668m;

    /* renamed from: n  reason: collision with root package name */
    public final C1608t f16669n;

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList f16670o;

    /* renamed from: p  reason: collision with root package name */
    public final C f16671p;

    /* renamed from: q  reason: collision with root package name */
    public final C f16672q;

    /* renamed from: r  reason: collision with root package name */
    public final C f16673r;

    /* renamed from: s  reason: collision with root package name */
    public final C f16674s;

    /* renamed from: t  reason: collision with root package name */
    public final E f16675t;

    /* renamed from: u  reason: collision with root package name */
    public int f16676u;

    /* renamed from: v  reason: collision with root package name */
    public C2063x f16677v;

    /* renamed from: w  reason: collision with root package name */
    public org.slf4j.helpers.i f16678w;

    /* renamed from: x  reason: collision with root package name */
    public AbstractComponentCallbacksC2061v f16679x;

    /* renamed from: y  reason: collision with root package name */
    public AbstractComponentCallbacksC2061v f16680y;

    /* renamed from: z  reason: collision with root package name */
    public final F f16681z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16658a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final E.e f16660c = new E.e(29);

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f16661d = new ArrayList();
    public final B f = new B(this);

    /* renamed from: h  reason: collision with root package name */
    public C2041a f16664h = null;

    /* renamed from: i  reason: collision with root package name */
    public final D f16665i = new D(this);
    public final AtomicInteger j = new AtomicInteger();

    /* renamed from: k  reason: collision with root package name */
    public final Map f16666k = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public final Map f16667l = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [z0.C] */
    /* JADX WARN: Type inference failed for: r0v16, types: [z0.C] */
    /* JADX WARN: Type inference failed for: r0v17, types: [z0.C] */
    /* JADX WARN: Type inference failed for: r0v18, types: [z0.C] */
    /* JADX WARN: Type inference failed for: r0v22, types: [c5.a, java.lang.Object] */
    public L() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.f16668m = new ArrayList();
        this.f16669n = new C1608t(this);
        this.f16670o = new CopyOnWriteArrayList();
        this.f16671p = new InterfaceC1003a(this) { // from class: z0.C

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ L f16629b;

            {
                this.f16629b = this;
            }

            @Override // g0.InterfaceC1003a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l8 = this.f16629b;
                        if (l8.L()) {
                            l8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l9 = this.f16629b;
                        if (l9.L() && num.intValue() == 80) {
                            l9.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C0364g c0364g = (C0364g) obj;
                        L l10 = this.f16629b;
                        if (l10.L()) {
                            l10.n(c0364g.f6029a, false);
                            return;
                        }
                        return;
                    default:
                        W.P p7 = (W.P) obj;
                        L l11 = this.f16629b;
                        if (l11.L()) {
                            l11.s(p7.f6021a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f16672q = new InterfaceC1003a(this) { // from class: z0.C

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ L f16629b;

            {
                this.f16629b = this;
            }

            @Override // g0.InterfaceC1003a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l8 = this.f16629b;
                        if (l8.L()) {
                            l8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l9 = this.f16629b;
                        if (l9.L() && num.intValue() == 80) {
                            l9.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C0364g c0364g = (C0364g) obj;
                        L l10 = this.f16629b;
                        if (l10.L()) {
                            l10.n(c0364g.f6029a, false);
                            return;
                        }
                        return;
                    default:
                        W.P p7 = (W.P) obj;
                        L l11 = this.f16629b;
                        if (l11.L()) {
                            l11.s(p7.f6021a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f16673r = new InterfaceC1003a(this) { // from class: z0.C

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ L f16629b;

            {
                this.f16629b = this;
            }

            @Override // g0.InterfaceC1003a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l8 = this.f16629b;
                        if (l8.L()) {
                            l8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l9 = this.f16629b;
                        if (l9.L() && num.intValue() == 80) {
                            l9.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C0364g c0364g = (C0364g) obj;
                        L l10 = this.f16629b;
                        if (l10.L()) {
                            l10.n(c0364g.f6029a, false);
                            return;
                        }
                        return;
                    default:
                        W.P p7 = (W.P) obj;
                        L l11 = this.f16629b;
                        if (l11.L()) {
                            l11.s(p7.f6021a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f16674s = new InterfaceC1003a(this) { // from class: z0.C

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ L f16629b;

            {
                this.f16629b = this;
            }

            @Override // g0.InterfaceC1003a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        L l8 = this.f16629b;
                        if (l8.L()) {
                            l8.i(false);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj;
                        L l9 = this.f16629b;
                        if (l9.L() && num.intValue() == 80) {
                            l9.m(false);
                            return;
                        }
                        return;
                    case 2:
                        C0364g c0364g = (C0364g) obj;
                        L l10 = this.f16629b;
                        if (l10.L()) {
                            l10.n(c0364g.f6029a, false);
                            return;
                        }
                        return;
                    default:
                        W.P p7 = (W.P) obj;
                        L l11 = this.f16629b;
                        if (l11.L()) {
                            l11.s(p7.f6021a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f16675t = new E(this);
        this.f16676u = -1;
        this.f16681z = new F(this);
        this.f16643A = new Object();
        this.f16647E = new ArrayDeque();
        this.f16657O = new RunnableC1375b(this, 6);
    }

    public static HashSet F(C2041a c2041a) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c2041a.f16728a.size(); i7++) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((U) c2041a.f16728a.get(i7)).f16716b;
            if (abstractComponentCallbacksC2061v != null && c2041a.f16733g) {
                hashSet.add(abstractComponentCallbacksC2061v);
            }
        }
        return hashSet;
    }

    public static boolean K(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        abstractComponentCallbacksC2061v.getClass();
        Iterator it = abstractComponentCallbacksC2061v.f16842p0.f16660c.G().iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = (AbstractComponentCallbacksC2061v) it.next();
            if (abstractComponentCallbacksC2061v2 != null) {
                z7 = K(abstractComponentCallbacksC2061v2);
                continue;
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (abstractComponentCallbacksC2061v == null) {
            return true;
        }
        if (abstractComponentCallbacksC2061v.f16849x0 && (abstractComponentCallbacksC2061v.f16840n0 == null || M(abstractComponentCallbacksC2061v.q0))) {
            return true;
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (abstractComponentCallbacksC2061v == null) {
            return true;
        }
        L l8 = abstractComponentCallbacksC2061v.f16840n0;
        if (abstractComponentCallbacksC2061v.equals(l8.f16680y) && N(l8.f16679x)) {
            return true;
        }
        return false;
    }

    public static void b0(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC2061v);
        }
        if (abstractComponentCallbacksC2061v.f16846u0) {
            abstractComponentCallbacksC2061v.f16846u0 = false;
            abstractComponentCallbacksC2061v.f16814D0 = !abstractComponentCallbacksC2061v.f16814D0;
        }
    }

    public final boolean A(boolean z7) {
        boolean z8;
        z(z7);
        boolean z9 = false;
        while (true) {
            ArrayList arrayList = this.f16653K;
            ArrayList arrayList2 = this.f16654L;
            synchronized (this.f16658a) {
                if (this.f16658a.isEmpty()) {
                    z8 = false;
                } else {
                    int size = this.f16658a.size();
                    z8 = false;
                    for (int i7 = 0; i7 < size; i7++) {
                        z8 |= ((I) this.f16658a.get(i7)).a(arrayList, arrayList2);
                    }
                    this.f16658a.clear();
                    this.f16677v.f.removeCallbacks(this.f16657O);
                }
            }
            if (z8) {
                z9 = true;
                this.f16659b = true;
                try {
                    T(this.f16653K, this.f16654L);
                } finally {
                    d();
                }
            } else {
                e0();
                v();
                ((HashMap) this.f16660c.f921c).values().removeAll(Collections.singleton(null));
                return z9;
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        ArrayList arrayList3;
        E.e eVar;
        E.e eVar2;
        E.e eVar3;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        boolean z7 = ((C2041a) arrayList4.get(i7)).f16740o;
        ArrayList arrayList6 = this.f16655M;
        if (arrayList6 == null) {
            this.f16655M = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.f16655M;
        E.e eVar4 = this.f16660c;
        arrayList7.addAll(eVar4.K());
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16680y;
        int i12 = i7;
        boolean z8 = false;
        while (true) {
            int i13 = 1;
            if (i12 < i8) {
                C2041a c2041a = (C2041a) arrayList4.get(i12);
                if (!((Boolean) arrayList5.get(i12)).booleanValue()) {
                    ArrayList arrayList8 = this.f16655M;
                    int i14 = 0;
                    while (true) {
                        ArrayList arrayList9 = c2041a.f16728a;
                        if (i14 < arrayList9.size()) {
                            U u7 = (U) arrayList9.get(i14);
                            int i15 = u7.f16715a;
                            if (i15 != i13) {
                                if (i15 != 2) {
                                    if (i15 != 3 && i15 != 6) {
                                        if (i15 != 7) {
                                            if (i15 == 8) {
                                                arrayList9.add(i14, new U(9, abstractComponentCallbacksC2061v, 0));
                                                u7.f16717c = true;
                                                i14++;
                                                abstractComponentCallbacksC2061v = u7.f16716b;
                                            }
                                        } else {
                                            eVar3 = eVar4;
                                            i9 = 1;
                                        }
                                    } else {
                                        arrayList8.remove(u7.f16716b);
                                        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = u7.f16716b;
                                        if (abstractComponentCallbacksC2061v2 == abstractComponentCallbacksC2061v) {
                                            arrayList9.add(i14, new U(9, abstractComponentCallbacksC2061v2));
                                            i14++;
                                            eVar3 = eVar4;
                                            i9 = 1;
                                            abstractComponentCallbacksC2061v = null;
                                        }
                                    }
                                    eVar3 = eVar4;
                                    i9 = 1;
                                } else {
                                    AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v3 = u7.f16716b;
                                    int i16 = abstractComponentCallbacksC2061v3.f16844s0;
                                    int size = arrayList8.size() - 1;
                                    boolean z9 = false;
                                    while (size >= 0) {
                                        E.e eVar5 = eVar4;
                                        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v4 = (AbstractComponentCallbacksC2061v) arrayList8.get(size);
                                        if (abstractComponentCallbacksC2061v4.f16844s0 == i16) {
                                            if (abstractComponentCallbacksC2061v4 == abstractComponentCallbacksC2061v3) {
                                                i10 = i16;
                                                z9 = true;
                                            } else {
                                                if (abstractComponentCallbacksC2061v4 == abstractComponentCallbacksC2061v) {
                                                    i10 = i16;
                                                    arrayList9.add(i14, new U(9, abstractComponentCallbacksC2061v4, 0));
                                                    i14++;
                                                    i11 = 0;
                                                    abstractComponentCallbacksC2061v = null;
                                                } else {
                                                    i10 = i16;
                                                    i11 = 0;
                                                }
                                                U u8 = new U(3, abstractComponentCallbacksC2061v4, i11);
                                                u8.f16718d = u7.f16718d;
                                                u8.f = u7.f;
                                                u8.f16719e = u7.f16719e;
                                                u8.f16720g = u7.f16720g;
                                                arrayList9.add(i14, u8);
                                                arrayList8.remove(abstractComponentCallbacksC2061v4);
                                                i14++;
                                                abstractComponentCallbacksC2061v = abstractComponentCallbacksC2061v;
                                            }
                                        } else {
                                            i10 = i16;
                                        }
                                        size--;
                                        i16 = i10;
                                        eVar4 = eVar5;
                                    }
                                    eVar3 = eVar4;
                                    i9 = 1;
                                    if (z9) {
                                        arrayList9.remove(i14);
                                        i14--;
                                    } else {
                                        u7.f16715a = 1;
                                        u7.f16717c = true;
                                        arrayList8.add(abstractComponentCallbacksC2061v3);
                                    }
                                }
                                i14 += i9;
                                i13 = i9;
                                eVar4 = eVar3;
                            } else {
                                eVar3 = eVar4;
                                i9 = i13;
                            }
                            arrayList8.add(u7.f16716b);
                            i14 += i9;
                            i13 = i9;
                            eVar4 = eVar3;
                        } else {
                            eVar2 = eVar4;
                        }
                    }
                } else {
                    eVar2 = eVar4;
                    int i17 = 1;
                    ArrayList arrayList10 = this.f16655M;
                    ArrayList arrayList11 = c2041a.f16728a;
                    int size2 = arrayList11.size() - 1;
                    while (size2 >= 0) {
                        U u9 = (U) arrayList11.get(size2);
                        int i18 = u9.f16715a;
                        if (i18 != i17) {
                            if (i18 != 3) {
                                switch (i18) {
                                    case 8:
                                        abstractComponentCallbacksC2061v = null;
                                        break;
                                    case 9:
                                        abstractComponentCallbacksC2061v = u9.f16716b;
                                        break;
                                    case 10:
                                        u9.f16722i = u9.f16721h;
                                        break;
                                }
                                size2--;
                                i17 = 1;
                            }
                            arrayList10.add(u9.f16716b);
                            size2--;
                            i17 = 1;
                        }
                        arrayList10.remove(u9.f16716b);
                        size2--;
                        i17 = 1;
                    }
                }
                if (!z8 && !c2041a.f16733g) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                i12++;
                arrayList4 = arrayList;
                arrayList5 = arrayList2;
                eVar4 = eVar2;
            } else {
                E.e eVar6 = eVar4;
                this.f16655M.clear();
                if (!z7 && this.f16676u >= 1) {
                    for (int i19 = i7; i19 < i8; i19++) {
                        Iterator it = ((C2041a) arrayList.get(i19)).f16728a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v5 = ((U) it.next()).f16716b;
                            if (abstractComponentCallbacksC2061v5 != null && abstractComponentCallbacksC2061v5.f16840n0 != null) {
                                eVar = eVar6;
                                eVar.N(g(abstractComponentCallbacksC2061v5));
                            } else {
                                eVar = eVar6;
                            }
                            eVar6 = eVar;
                        }
                    }
                }
                for (int i20 = i7; i20 < i8; i20++) {
                    C2041a c2041a2 = (C2041a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue()) {
                        c2041a2.c(-1);
                        ArrayList arrayList12 = c2041a2.f16728a;
                        boolean z10 = true;
                        for (int size3 = arrayList12.size() - 1; size3 >= 0; size3--) {
                            U u10 = (U) arrayList12.get(size3);
                            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v6 = u10.f16716b;
                            if (abstractComponentCallbacksC2061v6 != null) {
                                if (abstractComponentCallbacksC2061v6.f16813C0 != null) {
                                    abstractComponentCallbacksC2061v6.k().f16802a = z10;
                                }
                                int i21 = c2041a2.f;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        i23 = 8197;
                                        if (i21 != 8197) {
                                            if (i21 != 4099) {
                                                if (i21 != 4100) {
                                                    i22 = 0;
                                                }
                                            } else {
                                                i22 = 4099;
                                            }
                                        }
                                    }
                                    i22 = i23;
                                }
                                if (abstractComponentCallbacksC2061v6.f16813C0 != null || i22 != 0) {
                                    abstractComponentCallbacksC2061v6.k();
                                    abstractComponentCallbacksC2061v6.f16813C0.f = i22;
                                }
                                abstractComponentCallbacksC2061v6.k();
                                abstractComponentCallbacksC2061v6.f16813C0.getClass();
                            }
                            int i24 = u10.f16715a;
                            L l8 = c2041a2.f16741p;
                            switch (i24) {
                                case 1:
                                    abstractComponentCallbacksC2061v6.H(u10.f16718d, u10.f16719e, u10.f, u10.f16720g);
                                    z10 = true;
                                    l8.X(abstractComponentCallbacksC2061v6, true);
                                    l8.S(abstractComponentCallbacksC2061v6);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + u10.f16715a);
                                case 3:
                                    abstractComponentCallbacksC2061v6.H(u10.f16718d, u10.f16719e, u10.f, u10.f16720g);
                                    l8.a(abstractComponentCallbacksC2061v6);
                                    z10 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC2061v6.H(u10.f16718d, u10.f16719e, u10.f, u10.f16720g);
                                    l8.getClass();
                                    b0(abstractComponentCallbacksC2061v6);
                                    z10 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC2061v6.H(u10.f16718d, u10.f16719e, u10.f, u10.f16720g);
                                    l8.X(abstractComponentCallbacksC2061v6, true);
                                    l8.J(abstractComponentCallbacksC2061v6);
                                    z10 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC2061v6.H(u10.f16718d, u10.f16719e, u10.f, u10.f16720g);
                                    l8.c(abstractComponentCallbacksC2061v6);
                                    z10 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC2061v6.H(u10.f16718d, u10.f16719e, u10.f, u10.f16720g);
                                    l8.X(abstractComponentCallbacksC2061v6, true);
                                    l8.h(abstractComponentCallbacksC2061v6);
                                    z10 = true;
                                    break;
                                case 8:
                                    l8.Z(null);
                                    z10 = true;
                                    break;
                                case 9:
                                    l8.Z(abstractComponentCallbacksC2061v6);
                                    z10 = true;
                                    break;
                                case 10:
                                    l8.Y(abstractComponentCallbacksC2061v6, u10.f16721h);
                                    z10 = true;
                                    break;
                            }
                        }
                        continue;
                    } else {
                        c2041a2.c(1);
                        ArrayList arrayList13 = c2041a2.f16728a;
                        int size4 = arrayList13.size();
                        int i25 = 0;
                        while (i25 < size4) {
                            U u11 = (U) arrayList13.get(i25);
                            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v7 = u11.f16716b;
                            if (abstractComponentCallbacksC2061v7 != null) {
                                if (abstractComponentCallbacksC2061v7.f16813C0 != null) {
                                    abstractComponentCallbacksC2061v7.k().f16802a = false;
                                }
                                int i26 = c2041a2.f;
                                if (abstractComponentCallbacksC2061v7.f16813C0 != null || i26 != 0) {
                                    abstractComponentCallbacksC2061v7.k();
                                    abstractComponentCallbacksC2061v7.f16813C0.f = i26;
                                }
                                abstractComponentCallbacksC2061v7.k();
                                abstractComponentCallbacksC2061v7.f16813C0.getClass();
                            }
                            int i27 = u11.f16715a;
                            L l9 = c2041a2.f16741p;
                            switch (i27) {
                                case 1:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC2061v7.H(u11.f16718d, u11.f16719e, u11.f, u11.f16720g);
                                    l9.X(abstractComponentCallbacksC2061v7, false);
                                    l9.a(abstractComponentCallbacksC2061v7);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + u11.f16715a);
                                case 3:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC2061v7.H(u11.f16718d, u11.f16719e, u11.f, u11.f16720g);
                                    l9.S(abstractComponentCallbacksC2061v7);
                                    break;
                                case 4:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC2061v7.H(u11.f16718d, u11.f16719e, u11.f, u11.f16720g);
                                    l9.J(abstractComponentCallbacksC2061v7);
                                    break;
                                case 5:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC2061v7.H(u11.f16718d, u11.f16719e, u11.f, u11.f16720g);
                                    l9.X(abstractComponentCallbacksC2061v7, false);
                                    b0(abstractComponentCallbacksC2061v7);
                                    break;
                                case 6:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC2061v7.H(u11.f16718d, u11.f16719e, u11.f, u11.f16720g);
                                    l9.h(abstractComponentCallbacksC2061v7);
                                    break;
                                case 7:
                                    arrayList3 = arrayList13;
                                    abstractComponentCallbacksC2061v7.H(u11.f16718d, u11.f16719e, u11.f, u11.f16720g);
                                    l9.X(abstractComponentCallbacksC2061v7, false);
                                    l9.c(abstractComponentCallbacksC2061v7);
                                    break;
                                case 8:
                                    l9.Z(abstractComponentCallbacksC2061v7);
                                    arrayList3 = arrayList13;
                                    break;
                                case 9:
                                    l9.Z(null);
                                    arrayList3 = arrayList13;
                                    break;
                                case 10:
                                    l9.Y(abstractComponentCallbacksC2061v7, u11.f16722i);
                                    arrayList3 = arrayList13;
                                    break;
                            }
                            i25++;
                            arrayList13 = arrayList3;
                        }
                        continue;
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
                ArrayList arrayList14 = this.f16668m;
                if (z8 && !arrayList14.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(F((C2041a) it2.next()));
                    }
                    if (this.f16664h == null) {
                        Iterator it3 = arrayList14.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() == null) {
                                Iterator it4 = linkedHashSet.iterator();
                                if (it4.hasNext()) {
                                    AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v8 = (AbstractComponentCallbacksC2061v) it4.next();
                                    throw null;
                                }
                            } else {
                                throw new ClassCastException();
                            }
                        }
                        Iterator it5 = arrayList14.iterator();
                        while (it5.hasNext()) {
                            if (it5.next() == null) {
                                Iterator it6 = linkedHashSet.iterator();
                                if (it6.hasNext()) {
                                    AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v9 = (AbstractComponentCallbacksC2061v) it6.next();
                                    throw null;
                                }
                            } else {
                                throw new ClassCastException();
                            }
                        }
                    }
                }
                for (int i28 = i7; i28 < i8; i28++) {
                    C2041a c2041a3 = (C2041a) arrayList.get(i28);
                    if (booleanValue) {
                        for (int size5 = c2041a3.f16728a.size() - 1; size5 >= 0; size5--) {
                            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v10 = ((U) c2041a3.f16728a.get(size5)).f16716b;
                            if (abstractComponentCallbacksC2061v10 != null) {
                                g(abstractComponentCallbacksC2061v10).j();
                            }
                        }
                    } else {
                        Iterator it7 = c2041a3.f16728a.iterator();
                        while (it7.hasNext()) {
                            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v11 = ((U) it7.next()).f16716b;
                            if (abstractComponentCallbacksC2061v11 != null) {
                                g(abstractComponentCallbacksC2061v11).j();
                            }
                        }
                    }
                }
                O(this.f16676u, true);
                int i29 = i7;
                Iterator it8 = f(arrayList, i29, i8).iterator();
                while (it8.hasNext()) {
                    C2053m c2053m = (C2053m) it8.next();
                    c2053m.f16779d = booleanValue;
                    synchronized (c2053m.f16777b) {
                        c2053m.g();
                        ArrayList arrayList15 = c2053m.f16777b;
                        ListIterator listIterator = arrayList15.listIterator(arrayList15.size());
                        if (!listIterator.hasPrevious()) {
                            c2053m.f16780e = false;
                        } else {
                            ((Y) listIterator.previous()).getClass();
                            throw null;
                        }
                    }
                    c2053m.c();
                }
                while (i29 < i8) {
                    C2041a c2041a4 = (C2041a) arrayList.get(i29);
                    if (((Boolean) arrayList2.get(i29)).booleanValue() && c2041a4.f16743r >= 0) {
                        c2041a4.f16743r = -1;
                    }
                    c2041a4.getClass();
                    i29++;
                }
                if (z8 && arrayList14.size() > 0) {
                    arrayList14.get(0).getClass();
                    throw new ClassCastException();
                }
                return;
            }
        }
    }

    public final AbstractComponentCallbacksC2061v C(int i7) {
        E.e eVar = this.f16660c;
        ArrayList arrayList = (ArrayList) eVar.f920b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) arrayList.get(size);
            if (abstractComponentCallbacksC2061v != null && abstractComponentCallbacksC2061v.f16843r0 == i7) {
                return abstractComponentCallbacksC2061v;
            }
        }
        for (T t7 : ((HashMap) eVar.f921c).values()) {
            if (t7 != null) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = t7.f16712c;
                if (abstractComponentCallbacksC2061v2.f16843r0 == i7) {
                    return abstractComponentCallbacksC2061v2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC2061v D(String str) {
        E.e eVar = this.f16660c;
        ArrayList arrayList = (ArrayList) eVar.f920b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) arrayList.get(size);
            if (abstractComponentCallbacksC2061v != null && str.equals(abstractComponentCallbacksC2061v.f16845t0)) {
                return abstractComponentCallbacksC2061v;
            }
        }
        for (T t7 : ((HashMap) eVar.f921c).values()) {
            if (t7 != null) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = t7.f16712c;
                if (str.equals(abstractComponentCallbacksC2061v2.f16845t0)) {
                    return abstractComponentCallbacksC2061v2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C2053m c2053m = (C2053m) it.next();
            if (c2053m.f16780e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c2053m.f16780e = false;
                c2053m.c();
            }
        }
    }

    public final ViewGroup G(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        ViewGroup viewGroup = abstractComponentCallbacksC2061v.f16851z0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC2061v.f16844s0 > 0 && this.f16678w.I()) {
            View H7 = this.f16678w.H(abstractComponentCallbacksC2061v.f16844s0);
            if (H7 instanceof ViewGroup) {
                return (ViewGroup) H7;
            }
        }
        return null;
    }

    public final F H() {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            return abstractComponentCallbacksC2061v.f16840n0.H();
        }
        return this.f16681z;
    }

    public final C0639a I() {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            return abstractComponentCallbacksC2061v.f16840n0.I();
        }
        return this.f16643A;
    }

    public final void J(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC2061v);
        }
        if (!abstractComponentCallbacksC2061v.f16846u0) {
            abstractComponentCallbacksC2061v.f16846u0 = true;
            abstractComponentCallbacksC2061v.f16814D0 = true ^ abstractComponentCallbacksC2061v.f16814D0;
            a0(abstractComponentCallbacksC2061v);
        }
    }

    public final boolean L() {
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16679x;
        if (abstractComponentCallbacksC2061v == null) {
            return true;
        }
        if (abstractComponentCallbacksC2061v.q() && this.f16679x.n().L()) {
            return true;
        }
        return false;
    }

    public final void O(int i7, boolean z7) {
        HashMap hashMap;
        C2063x c2063x;
        if (this.f16677v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z7 && i7 == this.f16676u) {
            return;
        }
        this.f16676u = i7;
        E.e eVar = this.f16660c;
        Iterator it = ((ArrayList) eVar.f920b).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = (HashMap) eVar.f921c;
            if (!hasNext) {
                break;
            }
            T t7 = (T) hashMap.get(((AbstractComponentCallbacksC2061v) it.next()).f16830e);
            if (t7 != null) {
                t7.j();
            }
        }
        for (T t8 : hashMap.values()) {
            if (t8 != null) {
                t8.j();
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = t8.f16712c;
                if (abstractComponentCallbacksC2061v.f16833g0 && !abstractComponentCallbacksC2061v.s()) {
                    eVar.O(t8);
                }
            }
        }
        c0();
        if (this.f16648F && (c2063x = this.f16677v) != null && this.f16676u == 7) {
            c2063x.f16855Y.invalidateOptionsMenu();
            this.f16648F = false;
        }
    }

    public final void P() {
        if (this.f16677v == null) {
            return;
        }
        this.f16649G = false;
        this.f16650H = false;
        this.f16656N.f16694g = false;
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null) {
                abstractComponentCallbacksC2061v.f16842p0.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16680y;
        if (abstractComponentCallbacksC2061v != null && abstractComponentCallbacksC2061v.l().Q()) {
            return true;
        }
        boolean R7 = R(this.f16653K, this.f16654L, -1, 0);
        if (R7) {
            this.f16659b = true;
            try {
                T(this.f16653K, this.f16654L);
            } finally {
                d();
            }
        }
        e0();
        v();
        ((HashMap) this.f16660c.f921c).values().removeAll(Collections.singleton(null));
        return R7;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        boolean z7;
        if ((i8 & 1) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i9 = -1;
        if (!this.f16661d.isEmpty()) {
            if (i7 < 0) {
                i9 = z7 ? 0 : this.f16661d.size() - 1;
            } else {
                int size = this.f16661d.size() - 1;
                while (size >= 0) {
                    C2041a c2041a = (C2041a) this.f16661d.get(size);
                    if (i7 >= 0 && i7 == c2041a.f16743r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z7) {
                        while (size > 0) {
                            C2041a c2041a2 = (C2041a) this.f16661d.get(size - 1);
                            if (i7 < 0 || i7 != c2041a2.f16743r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f16661d.size() - 1) {
                        size++;
                    }
                }
                i9 = size;
            }
        }
        if (i9 < 0) {
            return false;
        }
        for (int size2 = this.f16661d.size() - 1; size2 >= i9; size2--) {
            arrayList.add((C2041a) this.f16661d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC2061v + " nesting=" + abstractComponentCallbacksC2061v.f16839m0);
        }
        boolean s7 = abstractComponentCallbacksC2061v.s();
        if (!abstractComponentCallbacksC2061v.f16847v0 || !s7) {
            E.e eVar = this.f16660c;
            synchronized (((ArrayList) eVar.f920b)) {
                ((ArrayList) eVar.f920b).remove(abstractComponentCallbacksC2061v);
            }
            abstractComponentCallbacksC2061v.f16832f0 = false;
            if (K(abstractComponentCallbacksC2061v)) {
                this.f16648F = true;
            }
            abstractComponentCallbacksC2061v.f16833g0 = true;
            a0(abstractComponentCallbacksC2061v);
        }
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i7 = 0;
            int i8 = 0;
            while (i7 < size) {
                if (!((C2041a) arrayList.get(i7)).f16740o) {
                    if (i8 != i7) {
                        B(arrayList, arrayList2, i8, i7);
                    }
                    i8 = i7 + 1;
                    if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                        while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C2041a) arrayList.get(i8)).f16740o) {
                            i8++;
                        }
                    }
                    B(arrayList, arrayList2, i7, i8);
                    i7 = i8 - 1;
                }
                i7++;
            }
            if (i8 != size) {
                B(arrayList, arrayList2, i8, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [z0.U, java.lang.Object] */
    public final void U(Bundle bundle) {
        int i7;
        C1608t c1608t;
        int i8;
        boolean z7;
        T t7;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f16677v.f16857e.getClassLoader());
                this.f16667l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f16677v.f16857e.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        E.e eVar = this.f16660c;
        HashMap hashMap2 = (HashMap) eVar.f922d;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        M m7 = (M) bundle.getParcelable("state");
        if (m7 == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) eVar.f921c;
        hashMap3.clear();
        Iterator it = m7.f16684a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i7 = 2;
            c1608t = this.f16669n;
            if (!hasNext) {
                break;
            }
            Bundle i02 = eVar.i0((String) it.next(), null);
            if (i02 != null) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) this.f16656N.f16690b.get(((Q) i02.getParcelable("state")).f16700b);
                if (abstractComponentCallbacksC2061v != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC2061v);
                    }
                    t7 = new T(c1608t, eVar, abstractComponentCallbacksC2061v, i02);
                } else {
                    t7 = new T(this.f16669n, this.f16660c, this.f16677v.f16857e.getClassLoader(), H(), i02);
                }
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = t7.f16712c;
                abstractComponentCallbacksC2061v2.f16827b = i02;
                abstractComponentCallbacksC2061v2.f16840n0 = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC2061v2.f16830e + "): " + abstractComponentCallbacksC2061v2);
                }
                t7.l(this.f16677v.f16857e.getClassLoader());
                eVar.N(t7);
                t7.f16714e = this.f16676u;
            }
        }
        N n7 = this.f16656N;
        n7.getClass();
        Iterator it2 = new ArrayList(n7.f16690b.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v3 = (AbstractComponentCallbacksC2061v) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC2061v3.f16830e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC2061v3 + " that was not found in the set of active Fragments " + m7.f16684a);
                }
                this.f16656N.f(abstractComponentCallbacksC2061v3);
                abstractComponentCallbacksC2061v3.f16840n0 = this;
                T t8 = new T(c1608t, eVar, abstractComponentCallbacksC2061v3);
                t8.f16714e = 1;
                t8.j();
                abstractComponentCallbacksC2061v3.f16833g0 = true;
                t8.j();
            }
        }
        ArrayList<String> arrayList = m7.f16685b;
        ((ArrayList) eVar.f920b).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC2061v D4 = eVar.D(str3);
                if (D4 != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + D4);
                    }
                    eVar.q(D4);
                } else {
                    throw new IllegalStateException(AbstractC0059i.M("No instantiated fragment for (", str3, ")"));
                }
            }
        }
        if (m7.f16686c != null) {
            this.f16661d = new ArrayList(m7.f16686c.length);
            int i9 = 0;
            while (true) {
                C2042b[] c2042bArr = m7.f16686c;
                if (i9 >= c2042bArr.length) {
                    break;
                }
                C2042b c2042b = c2042bArr[i9];
                c2042b.getClass();
                C2041a c2041a = new C2041a(this);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int[] iArr = c2042b.f16747a;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    ?? obj = new Object();
                    int i12 = i10 + 1;
                    obj.f16715a = iArr[i10];
                    if (Log.isLoggable("FragmentManager", i7)) {
                        Log.v("FragmentManager", "Instantiate " + c2041a + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    obj.f16721h = EnumC0563o.values()[c2042b.f16749c[i11]];
                    obj.f16722i = EnumC0563o.values()[c2042b.f16750d[i11]];
                    int i13 = i10 + 2;
                    if (iArr[i12] != 0) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    obj.f16717c = z7;
                    int i14 = iArr[i13];
                    obj.f16718d = i14;
                    int i15 = iArr[i10 + 3];
                    obj.f16719e = i15;
                    int i16 = i10 + 5;
                    int i17 = iArr[i10 + 4];
                    obj.f = i17;
                    i10 += 6;
                    int i18 = iArr[i16];
                    obj.f16720g = i18;
                    c2041a.f16729b = i14;
                    c2041a.f16730c = i15;
                    c2041a.f16731d = i17;
                    c2041a.f16732e = i18;
                    c2041a.b(obj);
                    i11++;
                    i7 = 2;
                }
                c2041a.f = c2042b.f16751e;
                c2041a.f16734h = c2042b.f;
                c2041a.f16733g = true;
                c2041a.f16735i = c2042b.f16745Y;
                c2041a.j = c2042b.f16746Z;
                c2041a.f16736k = c2042b.f16752e0;
                c2041a.f16737l = c2042b.f16753f0;
                c2041a.f16738m = c2042b.f16754g0;
                c2041a.f16739n = c2042b.f16755h0;
                c2041a.f16740o = c2042b.f16756i0;
                c2041a.f16743r = c2042b.f16744X;
                int i19 = 0;
                while (true) {
                    ArrayList arrayList2 = c2042b.f16748b;
                    if (i19 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i19);
                    if (str4 != null) {
                        ((U) c2041a.f16728a.get(i19)).f16716b = eVar.D(str4);
                    }
                    i19++;
                }
                c2041a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("restoreAllState: back stack #", i9, " (index ");
                    k2.append(c2041a.f16743r);
                    k2.append("): ");
                    k2.append(c2041a);
                    Log.v("FragmentManager", k2.toString());
                    PrintWriter printWriter = new PrintWriter(new W());
                    c2041a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f16661d.add(c2041a);
                i9++;
                i7 = 2;
            }
            i8 = 0;
        } else {
            i8 = 0;
            this.f16661d = new ArrayList();
        }
        this.j.set(m7.f16687d);
        String str5 = m7.f16688e;
        if (str5 != null) {
            AbstractComponentCallbacksC2061v D7 = eVar.D(str5);
            this.f16680y = D7;
            r(D7);
        }
        ArrayList arrayList3 = m7.f;
        if (arrayList3 != null) {
            for (int i20 = i8; i20 < arrayList3.size(); i20++) {
                this.f16666k.put((String) arrayList3.get(i20), (C2043c) m7.f16682X.get(i20));
            }
        }
        this.f16647E = new ArrayDeque(m7.f16683Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.os.Parcelable, java.lang.Object, z0.M] */
    public final Bundle V() {
        int i7;
        ArrayList arrayList;
        C2042b[] c2042bArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.f16649G = true;
        this.f16656N.f16694g = true;
        E.e eVar = this.f16660c;
        eVar.getClass();
        HashMap hashMap = (HashMap) eVar.f921c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T t7 = (T) it.next();
            if (t7 != null) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = t7.f16712c;
                String str = abstractComponentCallbacksC2061v.f16830e;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = t7.f16712c;
                if (abstractComponentCallbacksC2061v2.f16826a == -1 && (bundle = abstractComponentCallbacksC2061v2.f16827b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new Q(abstractComponentCallbacksC2061v2));
                if (abstractComponentCallbacksC2061v2.f16826a > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC2061v2.C(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    t7.f16710a.O(abstractComponentCallbacksC2061v2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC2061v2.f16820J0.n(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle V7 = abstractComponentCallbacksC2061v2.f16842p0.V();
                    if (!V7.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", V7);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC2061v2.f16828c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC2061v2.f16829d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC2061v2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                eVar.i0(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC2061v.f16830e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC2061v + ": " + abstractComponentCallbacksC2061v.f16827b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f16660c.f922d;
        if (hashMap2.isEmpty()) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
        } else {
            E.e eVar2 = this.f16660c;
            synchronized (((ArrayList) eVar2.f920b)) {
                try {
                    if (((ArrayList) eVar2.f920b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) eVar2.f920b).size());
                        Iterator it2 = ((ArrayList) eVar2.f920b).iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v3 = (AbstractComponentCallbacksC2061v) it2.next();
                            arrayList.add(abstractComponentCallbacksC2061v3.f16830e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC2061v3.f16830e + "): " + abstractComponentCallbacksC2061v3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f16661d.size();
            if (size > 0) {
                c2042bArr = new C2042b[size];
                for (i7 = 0; i7 < size; i7++) {
                    c2042bArr[i7] = new C2042b((C2041a) this.f16661d.get(i7));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("saveAllState: adding back stack #", i7, ": ");
                        k2.append(this.f16661d.get(i7));
                        Log.v("FragmentManager", k2.toString());
                    }
                }
            } else {
                c2042bArr = null;
            }
            ?? obj = new Object();
            obj.f16688e = null;
            ArrayList arrayList3 = new ArrayList();
            obj.f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            obj.f16682X = arrayList4;
            obj.f16684a = arrayList2;
            obj.f16685b = arrayList;
            obj.f16686c = c2042bArr;
            obj.f16687d = this.j.get();
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v4 = this.f16680y;
            if (abstractComponentCallbacksC2061v4 != null) {
                obj.f16688e = abstractComponentCallbacksC2061v4.f16830e;
            }
            arrayList3.addAll(this.f16666k.keySet());
            arrayList4.addAll(this.f16666k.values());
            obj.f16683Y = new ArrayList(this.f16647E);
            bundle2.putParcelable("state", obj);
            for (String str2 : this.f16667l.keySet()) {
                bundle2.putBundle(io.flutter.plugins.pathprovider.b.h("result_", str2), (Bundle) this.f16667l.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(io.flutter.plugins.pathprovider.b.h("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        }
        return bundle2;
    }

    public final void W() {
        synchronized (this.f16658a) {
            try {
                if (this.f16658a.size() == 1) {
                    this.f16677v.f.removeCallbacks(this.f16657O);
                    this.f16677v.f.post(this.f16657O);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v, boolean z7) {
        ViewGroup G2 = G(abstractComponentCallbacksC2061v);
        if (G2 != null && (G2 instanceof C2040A)) {
            ((C2040A) G2).setDrawDisappearingViewsLast(!z7);
        }
    }

    public final void Y(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v, EnumC0563o enumC0563o) {
        if (abstractComponentCallbacksC2061v.equals(this.f16660c.D(abstractComponentCallbacksC2061v.f16830e)) && (abstractComponentCallbacksC2061v.f16841o0 == null || abstractComponentCallbacksC2061v.f16840n0 == this)) {
            abstractComponentCallbacksC2061v.f16817G0 = enumC0563o;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2061v + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (abstractComponentCallbacksC2061v != null) {
            if (!abstractComponentCallbacksC2061v.equals(this.f16660c.D(abstractComponentCallbacksC2061v.f16830e)) || (abstractComponentCallbacksC2061v.f16841o0 != null && abstractComponentCallbacksC2061v.f16840n0 != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC2061v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = this.f16680y;
        this.f16680y = abstractComponentCallbacksC2061v;
        r(abstractComponentCallbacksC2061v2);
        r(this.f16680y);
    }

    public final T a(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        String str = abstractComponentCallbacksC2061v.f16816F0;
        if (str != null) {
            A0.d.c(abstractComponentCallbacksC2061v, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC2061v);
        }
        T g3 = g(abstractComponentCallbacksC2061v);
        abstractComponentCallbacksC2061v.f16840n0 = this;
        E.e eVar = this.f16660c;
        eVar.N(g3);
        if (!abstractComponentCallbacksC2061v.f16847v0) {
            eVar.q(abstractComponentCallbacksC2061v);
            abstractComponentCallbacksC2061v.f16833g0 = false;
            abstractComponentCallbacksC2061v.f16814D0 = false;
            if (K(abstractComponentCallbacksC2061v)) {
                this.f16648F = true;
            }
        }
        return g3;
    }

    public final void a0(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        int i7;
        int i8;
        int i9;
        int i10;
        ViewGroup G2 = G(abstractComponentCallbacksC2061v);
        if (G2 != null) {
            C2060u c2060u = abstractComponentCallbacksC2061v.f16813C0;
            boolean z7 = false;
            if (c2060u == null) {
                i7 = 0;
            } else {
                i7 = c2060u.f16803b;
            }
            if (c2060u == null) {
                i8 = 0;
            } else {
                i8 = c2060u.f16804c;
            }
            int i11 = i8 + i7;
            if (c2060u == null) {
                i9 = 0;
            } else {
                i9 = c2060u.f16805d;
            }
            int i12 = i9 + i11;
            if (c2060u == null) {
                i10 = 0;
            } else {
                i10 = c2060u.f16806e;
            }
            if (i10 + i12 > 0) {
                if (G2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC2061v);
                }
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = (AbstractComponentCallbacksC2061v) G2.getTag(R.id.visible_removing_fragment_view_tag);
                C2060u c2060u2 = abstractComponentCallbacksC2061v.f16813C0;
                if (c2060u2 != null) {
                    z7 = c2060u2.f16802a;
                }
                if (abstractComponentCallbacksC2061v2.f16813C0 != null) {
                    abstractComponentCallbacksC2061v2.k().f16802a = z7;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C2063x c2063x, org.slf4j.helpers.i iVar, AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        String str;
        C2063x c2063x2;
        if (this.f16677v == null) {
            this.f16677v = c2063x;
            this.f16678w = iVar;
            this.f16679x = abstractComponentCallbacksC2061v;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f16670o;
            if (abstractComponentCallbacksC2061v != 0) {
                copyOnWriteArrayList.add(new G(abstractComponentCallbacksC2061v));
            } else if (c2063x instanceof O) {
                copyOnWriteArrayList.add(c2063x);
            }
            if (this.f16679x != null) {
                e0();
            }
            if (c2063x instanceof InterfaceC0919E) {
                C0918D a7 = c2063x.f16855Y.a();
                this.f16663g = a7;
                if (abstractComponentCallbacksC2061v != 0) {
                    c2063x2 = abstractComponentCallbacksC2061v;
                } else {
                    c2063x2 = c2063x;
                }
                a7.getClass();
                D onBackPressedCallback = this.f16665i;
                kotlin.jvm.internal.j.e(onBackPressedCallback, "onBackPressedCallback");
                C0570w h8 = c2063x2.h();
                if (h8.f7946c != EnumC0563o.DESTROYED) {
                    onBackPressedCallback.f16631b.add(new C0915A(a7, h8, onBackPressedCallback));
                    a7.d();
                    onBackPressedCallback.f16632c = new C0917C(0, a7, C0918D.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
                }
            }
            boolean z7 = false;
            if (abstractComponentCallbacksC2061v != 0) {
                N n7 = abstractComponentCallbacksC2061v.f16840n0.f16656N;
                HashMap hashMap = n7.f16691c;
                N n8 = (N) hashMap.get(abstractComponentCallbacksC2061v.f16830e);
                if (n8 == null) {
                    n8 = new N(n7.f16693e);
                    hashMap.put(abstractComponentCallbacksC2061v.f16830e, n8);
                }
                this.f16656N = n8;
            } else if (c2063x instanceof androidx.lifecycle.Y) {
                androidx.lifecycle.X g3 = c2063x.f16855Y.g();
                com.google.firebase.firestore.Z z8 = N.f16689h;
                B0.a defaultCreationExtras = B0.a.f228b;
                kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
                V2.k kVar = new V2.k(g3, z8, defaultCreationExtras);
                kotlin.jvm.internal.e a8 = kotlin.jvm.internal.s.a(N.class);
                String b5 = a8.b();
                if (b5 != null) {
                    this.f16656N = (N) kVar.v(a8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b5));
                } else {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
            } else {
                this.f16656N = new N(false);
            }
            N n9 = this.f16656N;
            n9.f16694g = (this.f16649G || this.f16650H) ? true : true;
            this.f16660c.f923e = n9;
            C2063x c2063x3 = this.f16677v;
            if ((c2063x3 instanceof Z1.e) && abstractComponentCallbacksC2061v == 0) {
                K5.s c8 = c2063x3.c();
                c8.d("android:support:fragments", new androidx.lifecycle.L(this, 1));
                Bundle a9 = c8.a("android:support:fragments");
                if (a9 != null) {
                    U(a9);
                }
            }
            C2063x c2063x4 = this.f16677v;
            if (c2063x4 instanceof InterfaceC1000e) {
                AbstractActivityC2064y abstractActivityC2064y = c2063x4.f16855Y;
                if (abstractComponentCallbacksC2061v != 0) {
                    str = AbstractC0059i.D(new StringBuilder(), abstractComponentCallbacksC2061v.f16830e, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                } else {
                    str = StringUtils.EMPTY;
                }
                String h9 = io.flutter.plugins.pathprovider.b.h("FragmentManager:", str);
                String z9 = AbstractC0059i.z(h9, "StartActivityForResult");
                C1020f c1020f = new C1020f(2);
                C0585f c0585f = new C0585f(this, 22);
                e.l lVar = abstractActivityC2064y.f10549Y;
                this.f16644B = lVar.c(z9, c1020f, c0585f);
                this.f16645C = lVar.c(AbstractC0059i.z(h9, "StartIntentSenderForResult"), new C1020f(3), new C1006c(this));
                this.f16646D = lVar.c(AbstractC0059i.z(h9, "RequestPermissions"), new C1020f(1), new C0415A(this));
            }
            C2063x c2063x5 = this.f16677v;
            if (c2063x5 instanceof X.g) {
                c2063x5.d(this.f16671p);
            }
            C2063x c2063x6 = this.f16677v;
            if (c2063x6 instanceof X.h) {
                AbstractActivityC2064y abstractActivityC2064y2 = c2063x6.f16855Y;
                C listener = this.f16672q;
                abstractActivityC2064y2.getClass();
                kotlin.jvm.internal.j.e(listener, "listener");
                abstractActivityC2064y2.f10555e0.add(listener);
            }
            C2063x c2063x7 = this.f16677v;
            if (c2063x7 instanceof W.M) {
                AbstractActivityC2064y abstractActivityC2064y3 = c2063x7.f16855Y;
                C listener2 = this.f16673r;
                abstractActivityC2064y3.getClass();
                kotlin.jvm.internal.j.e(listener2, "listener");
                abstractActivityC2064y3.f10557g0.add(listener2);
            }
            C2063x c2063x8 = this.f16677v;
            if (c2063x8 instanceof W.N) {
                AbstractActivityC2064y abstractActivityC2064y4 = c2063x8.f16855Y;
                C listener3 = this.f16674s;
                abstractActivityC2064y4.getClass();
                kotlin.jvm.internal.j.e(listener3, "listener");
                abstractActivityC2064y4.f10558h0.add(listener3);
            }
            C2063x c2063x9 = this.f16677v;
            if ((c2063x9 instanceof InterfaceC1045e) && abstractComponentCallbacksC2061v == 0) {
                AbstractActivityC2064y abstractActivityC2064y5 = c2063x9.f16855Y;
                E provider = this.f16675t;
                abstractActivityC2064y5.getClass();
                kotlin.jvm.internal.j.e(provider, "provider");
                R1.j jVar = abstractActivityC2064y5.f10552c;
                ((CopyOnWriteArrayList) jVar.f4683c).add(provider);
                ((Runnable) jVar.f4682b).run();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void c(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC2061v);
        }
        if (abstractComponentCallbacksC2061v.f16847v0) {
            abstractComponentCallbacksC2061v.f16847v0 = false;
            if (!abstractComponentCallbacksC2061v.f16832f0) {
                this.f16660c.q(abstractComponentCallbacksC2061v);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC2061v);
                }
                if (K(abstractComponentCallbacksC2061v)) {
                    this.f16648F = true;
                }
            }
        }
    }

    public final void c0() {
        Iterator it = this.f16660c.F().iterator();
        while (it.hasNext()) {
            T t7 = (T) it.next();
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = t7.f16712c;
            if (abstractComponentCallbacksC2061v.f16811A0) {
                if (this.f16659b) {
                    this.f16652J = true;
                } else {
                    abstractComponentCallbacksC2061v.f16811A0 = false;
                    t7.j();
                }
            }
        }
    }

    public final void d() {
        this.f16659b = false;
        this.f16654L.clear();
        this.f16653K.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new W());
        C2063x c2063x = this.f16677v;
        if (c2063x != null) {
            try {
                c2063x.f16855Y.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
            }
        } else {
            try {
                w("  ", null, printWriter, new String[0]);
            } catch (Exception e8) {
                Log.e("FragmentManager", "Failed dumping state", e8);
            }
        }
        throw illegalStateException;
    }

    public final HashSet e() {
        C2053m c2053m;
        HashSet hashSet = new HashSet();
        Iterator it = this.f16660c.F().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((T) it.next()).f16712c.f16851z0;
            if (viewGroup != null) {
                C0639a factory = I();
                kotlin.jvm.internal.j.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C2053m) {
                    c2053m = (C2053m) tag;
                } else {
                    c2053m = new C2053m(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c2053m);
                }
                hashSet.add(c2053m);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [w6.a, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [w6.a, kotlin.jvm.internal.i] */
    public final void e0() {
        int i7;
        synchronized (this.f16658a) {
            try {
                boolean z7 = true;
                if (!this.f16658a.isEmpty()) {
                    D d7 = this.f16665i;
                    d7.f16630a = true;
                    ?? r22 = d7.f16632c;
                    if (r22 != 0) {
                        r22.invoke();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                int size = this.f16661d.size();
                if (this.f16664h != null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                if (size + i7 <= 0 || !N(this.f16679x)) {
                    z7 = false;
                }
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z7);
                }
                D d8 = this.f16665i;
                d8.f16630a = z7;
                ?? r02 = d8.f16632c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C2041a) arrayList.get(i7)).f16728a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = ((U) it.next()).f16716b;
                if (abstractComponentCallbacksC2061v != null && (viewGroup = abstractComponentCallbacksC2061v.f16851z0) != null) {
                    hashSet.add(C2053m.e(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    public final T g(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        String str = abstractComponentCallbacksC2061v.f16830e;
        E.e eVar = this.f16660c;
        T t7 = (T) ((HashMap) eVar.f921c).get(str);
        if (t7 != null) {
            return t7;
        }
        T t8 = new T(this.f16669n, eVar, abstractComponentCallbacksC2061v);
        t8.l(this.f16677v.f16857e.getClassLoader());
        t8.f16714e = this.f16676u;
        return t8;
    }

    public final void h(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC2061v);
        }
        if (!abstractComponentCallbacksC2061v.f16847v0) {
            abstractComponentCallbacksC2061v.f16847v0 = true;
            if (abstractComponentCallbacksC2061v.f16832f0) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC2061v);
                }
                E.e eVar = this.f16660c;
                synchronized (((ArrayList) eVar.f920b)) {
                    ((ArrayList) eVar.f920b).remove(abstractComponentCallbacksC2061v);
                }
                abstractComponentCallbacksC2061v.f16832f0 = false;
                if (K(abstractComponentCallbacksC2061v)) {
                    this.f16648F = true;
                }
                a0(abstractComponentCallbacksC2061v);
            }
        }
    }

    public final void i(boolean z7) {
        if (z7 && (this.f16677v instanceof X.g)) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null) {
                abstractComponentCallbacksC2061v.f16850y0 = true;
                if (z7) {
                    abstractComponentCallbacksC2061v.f16842p0.i(true);
                }
            }
        }
    }

    public final boolean j() {
        boolean z7;
        if (this.f16676u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null) {
                if (!abstractComponentCallbacksC2061v.f16846u0) {
                    z7 = abstractComponentCallbacksC2061v.f16842p0.j();
                } else {
                    z7 = false;
                }
                if (z7) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        boolean z7;
        if (this.f16676u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z8 = false;
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null && M(abstractComponentCallbacksC2061v)) {
                if (!abstractComponentCallbacksC2061v.f16846u0) {
                    z7 = abstractComponentCallbacksC2061v.f16842p0.k();
                } else {
                    z7 = false;
                }
                if (z7) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC2061v);
                    z8 = true;
                }
            }
        }
        if (this.f16662e != null) {
            for (int i7 = 0; i7 < this.f16662e.size(); i7++) {
                AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v2 = (AbstractComponentCallbacksC2061v) this.f16662e.get(i7);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC2061v2)) {
                    abstractComponentCallbacksC2061v2.getClass();
                }
            }
        }
        this.f16662e = arrayList;
        return z8;
    }

    public final void l() {
        boolean z7 = true;
        this.f16651I = true;
        A(true);
        x();
        C2063x c2063x = this.f16677v;
        boolean z8 = c2063x instanceof androidx.lifecycle.Y;
        E.e eVar = this.f16660c;
        if (z8) {
            z7 = ((N) eVar.f923e).f;
        } else {
            AbstractActivityC2064y abstractActivityC2064y = c2063x.f16857e;
            if (abstractActivityC2064y instanceof Activity) {
                z7 = true ^ abstractActivityC2064y.isChangingConfigurations();
            }
        }
        if (z7) {
            for (C2043c c2043c : this.f16666k.values()) {
                for (String str : c2043c.f16758a) {
                    ((N) eVar.f923e).c(str, false);
                }
            }
        }
        u(-1);
        C2063x c2063x2 = this.f16677v;
        if (c2063x2 instanceof X.h) {
            AbstractActivityC2064y abstractActivityC2064y2 = c2063x2.f16855Y;
            C listener = this.f16672q;
            abstractActivityC2064y2.getClass();
            kotlin.jvm.internal.j.e(listener, "listener");
            abstractActivityC2064y2.f10555e0.remove(listener);
        }
        C2063x c2063x3 = this.f16677v;
        if (c2063x3 instanceof X.g) {
            c2063x3.i(this.f16671p);
        }
        C2063x c2063x4 = this.f16677v;
        if (c2063x4 instanceof W.M) {
            AbstractActivityC2064y abstractActivityC2064y3 = c2063x4.f16855Y;
            C listener2 = this.f16673r;
            abstractActivityC2064y3.getClass();
            kotlin.jvm.internal.j.e(listener2, "listener");
            abstractActivityC2064y3.f10557g0.remove(listener2);
        }
        C2063x c2063x5 = this.f16677v;
        if (c2063x5 instanceof W.N) {
            AbstractActivityC2064y abstractActivityC2064y4 = c2063x5.f16855Y;
            C listener3 = this.f16674s;
            abstractActivityC2064y4.getClass();
            kotlin.jvm.internal.j.e(listener3, "listener");
            abstractActivityC2064y4.f10558h0.remove(listener3);
        }
        C2063x c2063x6 = this.f16677v;
        if ((c2063x6 instanceof InterfaceC1045e) && this.f16679x == null) {
            AbstractActivityC2064y abstractActivityC2064y5 = c2063x6.f16855Y;
            E provider = this.f16675t;
            abstractActivityC2064y5.getClass();
            kotlin.jvm.internal.j.e(provider, "provider");
            R1.j jVar = abstractActivityC2064y5.f10552c;
            ((CopyOnWriteArrayList) jVar.f4683c).remove(provider);
            if (((HashMap) jVar.f4684d).remove(provider) == null) {
                ((Runnable) jVar.f4682b).run();
            } else {
                throw new ClassCastException();
            }
        }
        this.f16677v = null;
        this.f16678w = null;
        this.f16679x = null;
        if (this.f16663g != null) {
            Iterator it = this.f16665i.f16631b.iterator();
            while (it.hasNext()) {
                ((InterfaceC0922c) it.next()).cancel();
            }
            this.f16663g = null;
        }
        R1.j jVar2 = this.f16644B;
        if (jVar2 != null) {
            jVar2.T0();
            this.f16645C.T0();
            this.f16646D.T0();
        }
    }

    public final void m(boolean z7) {
        if (z7 && (this.f16677v instanceof X.h)) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null) {
                abstractComponentCallbacksC2061v.f16850y0 = true;
                if (z7) {
                    abstractComponentCallbacksC2061v.f16842p0.m(true);
                }
            }
        }
    }

    public final void n(boolean z7, boolean z8) {
        if (z8 && (this.f16677v instanceof W.M)) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null && z8) {
                abstractComponentCallbacksC2061v.f16842p0.n(z7, true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f16660c.G().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = (AbstractComponentCallbacksC2061v) it.next();
            if (abstractComponentCallbacksC2061v != null) {
                abstractComponentCallbacksC2061v.r();
                abstractComponentCallbacksC2061v.f16842p0.o();
            }
        }
    }

    public final boolean p() {
        boolean z7;
        if (this.f16676u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null) {
                if (!abstractComponentCallbacksC2061v.f16846u0) {
                    z7 = abstractComponentCallbacksC2061v.f16842p0.p();
                } else {
                    z7 = false;
                }
                if (z7) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f16676u < 1) {
            return;
        }
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null && !abstractComponentCallbacksC2061v.f16846u0) {
                abstractComponentCallbacksC2061v.f16842p0.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v) {
        if (abstractComponentCallbacksC2061v != null) {
            if (abstractComponentCallbacksC2061v.equals(this.f16660c.D(abstractComponentCallbacksC2061v.f16830e))) {
                abstractComponentCallbacksC2061v.f16840n0.getClass();
                boolean N7 = N(abstractComponentCallbacksC2061v);
                Boolean bool = abstractComponentCallbacksC2061v.f16831e0;
                if (bool == null || bool.booleanValue() != N7) {
                    abstractComponentCallbacksC2061v.f16831e0 = Boolean.valueOf(N7);
                    L l8 = abstractComponentCallbacksC2061v.f16842p0;
                    l8.e0();
                    l8.r(l8.f16680y);
                }
            }
        }
    }

    public final void s(boolean z7, boolean z8) {
        if (z8 && (this.f16677v instanceof W.N)) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null && z8) {
                abstractComponentCallbacksC2061v.f16842p0.s(z7, true);
            }
        }
    }

    public final boolean t() {
        boolean z7;
        if (this.f16676u < 1) {
            return false;
        }
        boolean z8 = false;
        for (AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v : this.f16660c.K()) {
            if (abstractComponentCallbacksC2061v != null && M(abstractComponentCallbacksC2061v)) {
                if (!abstractComponentCallbacksC2061v.f16846u0) {
                    z7 = abstractComponentCallbacksC2061v.f16842p0.t();
                } else {
                    z7 = false;
                }
                if (z7) {
                    z8 = true;
                }
            }
        }
        return z8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = this.f16679x;
        if (abstractComponentCallbacksC2061v != null) {
            sb.append(abstractComponentCallbacksC2061v.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f16679x)));
            sb.append("}");
        } else {
            C2063x c2063x = this.f16677v;
            if (c2063x != null) {
                sb.append(c2063x.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f16677v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i7) {
        try {
            this.f16659b = true;
            for (T t7 : ((HashMap) this.f16660c.f921c).values()) {
                if (t7 != null) {
                    t7.f16714e = i7;
                }
            }
            O(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C2053m) it.next()).d();
            }
            this.f16659b = false;
            A(true);
        } catch (Throwable th) {
            this.f16659b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f16652J) {
            this.f16652J = false;
            c0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String z7 = AbstractC0059i.z(str, "    ");
        E.e eVar = this.f16660c;
        eVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = (HashMap) eVar.f921c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (T t7 : hashMap.values()) {
                printWriter.print(str);
                if (t7 != null) {
                    AbstractComponentCallbacksC2061v abstractComponentCallbacksC2061v = t7.f16712c;
                    printWriter.println(abstractComponentCallbacksC2061v);
                    abstractComponentCallbacksC2061v.j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) eVar.f920b;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size2; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC2061v) arrayList.get(i7)).toString());
            }
        }
        ArrayList arrayList2 = this.f16662e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size; i8++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(((AbstractComponentCallbacksC2061v) this.f16662e.get(i8)).toString());
            }
        }
        int size3 = this.f16661d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size3; i9++) {
                C2041a c2041a = (C2041a) this.f16661d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c2041a.toString());
                c2041a.f(z7, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.f16658a) {
            try {
                int size4 = this.f16658a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i10 = 0; i10 < size4; i10++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i10);
                        printWriter.print(": ");
                        printWriter.println((I) this.f16658a.get(i10));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f16677v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f16678w);
        if (this.f16679x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f16679x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f16676u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f16649G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f16650H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f16651I);
        if (this.f16648F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f16648F);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C2053m) it.next()).d();
        }
    }

    public final void y(I i7, boolean z7) {
        if (!z7) {
            if (this.f16677v == null) {
                if (this.f16651I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (this.f16649G || this.f16650H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f16658a) {
            try {
                if (this.f16677v == null) {
                    if (z7) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.f16658a.add(i7);
                W();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z7) {
        if (!this.f16659b) {
            if (this.f16677v == null) {
                if (this.f16651I) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Looper.myLooper() == this.f16677v.f.getLooper()) {
                if (!z7 && (this.f16649G || this.f16650H)) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.f16653K == null) {
                    this.f16653K = new ArrayList();
                    this.f16654L = new ArrayList();
                    return;
                }
                return;
            } else {
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }
}
