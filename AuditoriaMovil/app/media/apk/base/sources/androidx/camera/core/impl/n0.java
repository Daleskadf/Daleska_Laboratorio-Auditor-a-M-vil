package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class n0 extends i0 {

    /* renamed from: i  reason: collision with root package name */
    public final A.n f7647i = new A.n(3);
    public boolean j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7648k = false;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f7649l = new ArrayList();

    public final void a(o0 o0Var) {
        Object obj;
        E e7 = o0Var.f7656g;
        int i7 = e7.f7537c;
        D.n0 n0Var = this.f7639b;
        if (i7 != -1) {
            this.f7648k = true;
            int i8 = n0Var.f752a;
            Integer valueOf = Integer.valueOf(i7);
            List list = o0.f7650i;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i8))) {
                i7 = i8;
            }
            n0Var.f752a = i7;
        }
        C0501c c0501c = E.j;
        Object obj2 = C0505g.f;
        Z z7 = e7.f7536b;
        try {
            obj2 = z7.G(c0501c);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) obj2;
        Objects.requireNonNull(range);
        Range range2 = C0505g.f;
        if (!range.equals(range2)) {
            W w2 = (W) n0Var.f755d;
            C0501c c0501c2 = E.j;
            w2.getClass();
            try {
                obj = w2.G(c0501c2);
            } catch (IllegalArgumentException unused2) {
                obj = range2;
            }
            if (((Range) obj).equals(range2)) {
                ((W) n0Var.f755d).j(E.j, range);
            } else {
                W w7 = (W) n0Var.f755d;
                C0501c c0501c3 = E.j;
                Object obj3 = C0505g.f;
                w7.getClass();
                try {
                    obj3 = w7.G(c0501c3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) obj3).equals(range)) {
                    this.j = false;
                    org.slf4j.helpers.i.l("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
        }
        int a7 = e7.a();
        if (a7 != 0) {
            n0Var.getClass();
            if (a7 != 0) {
                ((W) n0Var.f755d).j(y0.f7692R, Integer.valueOf(a7));
            }
        }
        int b5 = e7.b();
        if (b5 != 0) {
            n0Var.getClass();
            if (b5 != 0) {
                ((W) n0Var.f755d).j(y0.f7693S, Integer.valueOf(b5));
            }
        }
        E e8 = o0Var.f7656g;
        ((Y) n0Var.f).f7674a.putAll((Map) e8.f.f7674a);
        this.f7640c.addAll(o0Var.f7653c);
        this.f7641d.addAll(o0Var.f7654d);
        n0Var.a(e8.f7538d);
        this.f7642e.addAll(o0Var.f7655e);
        l0 l0Var = o0Var.f;
        if (l0Var != null) {
            this.f7649l.add(l0Var);
        }
        InputConfiguration inputConfiguration = o0Var.f7657h;
        if (inputConfiguration != null) {
            this.f7643g = inputConfiguration;
        }
        LinkedHashSet<C0503e> linkedHashSet = this.f7638a;
        linkedHashSet.addAll(o0Var.f7651a);
        HashSet hashSet = (HashSet) n0Var.f754c;
        hashSet.addAll(DesugarCollections.unmodifiableList(e7.f7535a));
        ArrayList arrayList = new ArrayList();
        for (C0503e c0503e : linkedHashSet) {
            arrayList.add(c0503e.f7616a);
            for (J j : c0503e.f7617b) {
                arrayList.add(j);
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            org.slf4j.helpers.i.l("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.j = false;
        }
        C0503e c0503e2 = o0Var.f7652b;
        if (c0503e2 != null) {
            C0503e c0503e3 = this.f7644h;
            if (c0503e3 != c0503e2 && c0503e3 != null) {
                org.slf4j.helpers.i.l("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.j = false;
            } else {
                this.f7644h = c0503e2;
            }
        }
        n0Var.d(z7);
    }

    public final o0 b() {
        D.H h8;
        if (this.j) {
            ArrayList arrayList = new ArrayList(this.f7638a);
            A.n nVar = this.f7647i;
            if (nVar.f29a) {
                Collections.sort(arrayList, new K.a(nVar, 0));
            }
            if (!this.f7649l.isEmpty()) {
                h8 = new D.H(this, 3);
            } else {
                h8 = null;
            }
            return new o0(arrayList, new ArrayList(this.f7640c), new ArrayList(this.f7641d), new ArrayList(this.f7642e), this.f7639b.e(), h8, this.f7643g, this.f7644h);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }
}
