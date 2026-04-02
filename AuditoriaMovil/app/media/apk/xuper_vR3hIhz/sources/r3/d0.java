package r3;

import b3.r;
import b3.w;
import com.umeng.analytics.pro.bt;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import k3.b;
/* loaded from: classes.dex */
public class d0 extends s implements Comparable {

    /* renamed from: m  reason: collision with root package name */
    public static final b.a f18390m = b.a.e("");

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18391b;

    /* renamed from: c  reason: collision with root package name */
    public final m3.m f18392c;

    /* renamed from: d  reason: collision with root package name */
    public final k3.b f18393d;

    /* renamed from: e  reason: collision with root package name */
    public final k3.x f18394e;

    /* renamed from: f  reason: collision with root package name */
    public final k3.x f18395f;

    /* renamed from: g  reason: collision with root package name */
    public g f18396g;

    /* renamed from: h  reason: collision with root package name */
    public g f18397h;

    /* renamed from: i  reason: collision with root package name */
    public g f18398i;

    /* renamed from: j  reason: collision with root package name */
    public g f18399j;

    /* renamed from: k  reason: collision with root package name */
    public transient k3.w f18400k;

    /* renamed from: l  reason: collision with root package name */
    public transient b.a f18401l;

    /* loaded from: classes.dex */
    public class a implements i {
        public a() {
        }

        @Override // r3.d0.i
        /* renamed from: b */
        public Class[] a(r3.i iVar) {
            return d0.this.f18393d.f0(iVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements i {
        public b() {
        }

        @Override // r3.d0.i
        /* renamed from: b */
        public b.a a(r3.i iVar) {
            return d0.this.f18393d.Q(iVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements i {
        public c() {
        }

        @Override // r3.d0.i
        /* renamed from: b */
        public Boolean a(r3.i iVar) {
            return d0.this.f18393d.s0(iVar);
        }
    }

    /* loaded from: classes.dex */
    public class d implements i {
        public d() {
        }

        @Override // r3.d0.i
        /* renamed from: b */
        public b0 a(r3.i iVar) {
            b0 B = d0.this.f18393d.B(iVar);
            if (B != null) {
                return d0.this.f18393d.C(iVar, B);
            }
            return B;
        }
    }

    /* loaded from: classes.dex */
    public class e implements i {
        public e() {
        }

        @Override // r3.d0.i
        /* renamed from: b */
        public w.a a(r3.i iVar) {
            return d0.this.f18393d.F(iVar);
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f18407a;

        static {
            int[] iArr = new int[w.a.values().length];
            f18407a = iArr;
            try {
                iArr[w.a.READ_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18407a[w.a.READ_WRITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18407a[w.a.WRITE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18407a[w.a.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Object f18408a;

        /* renamed from: b  reason: collision with root package name */
        public final g f18409b;

        /* renamed from: c  reason: collision with root package name */
        public final k3.x f18410c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f18411d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f18412e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f18413f;

        public g(Object obj, g gVar, k3.x xVar, boolean z10, boolean z11, boolean z12) {
            k3.x xVar2;
            this.f18408a = obj;
            this.f18409b = gVar;
            if (xVar != null && !xVar.h()) {
                xVar2 = xVar;
            } else {
                xVar2 = null;
            }
            this.f18410c = xVar2;
            if (z10) {
                if (xVar2 != null) {
                    if (!xVar.e()) {
                        z10 = false;
                    }
                } else {
                    throw new IllegalArgumentException("Cannot pass true for 'explName' if name is null/empty");
                }
            }
            this.f18411d = z10;
            this.f18412e = z11;
            this.f18413f = z12;
        }

        public g a(g gVar) {
            g gVar2 = this.f18409b;
            if (gVar2 == null) {
                return c(gVar);
            }
            return c(gVar2.a(gVar));
        }

        public g b() {
            g gVar = this.f18409b;
            if (gVar == null) {
                return this;
            }
            g b10 = gVar.b();
            if (this.f18410c != null) {
                if (b10.f18410c == null) {
                    return c(null);
                }
                return c(b10);
            } else if (b10.f18410c != null) {
                return b10;
            } else {
                boolean z10 = this.f18412e;
                if (z10 == b10.f18412e) {
                    return c(b10);
                }
                if (z10) {
                    return c(null);
                }
                return b10;
            }
        }

        public g c(g gVar) {
            if (gVar == this.f18409b) {
                return this;
            }
            return new g(this.f18408a, gVar, this.f18410c, this.f18411d, this.f18412e, this.f18413f);
        }

        public g d(Object obj) {
            if (obj == this.f18408a) {
                return this;
            }
            return new g(obj, this.f18409b, this.f18410c, this.f18411d, this.f18412e, this.f18413f);
        }

        public g e() {
            g e10;
            if (this.f18413f) {
                g gVar = this.f18409b;
                if (gVar == null) {
                    return null;
                }
                return gVar.e();
            }
            g gVar2 = this.f18409b;
            if (gVar2 != null && (e10 = gVar2.e()) != this.f18409b) {
                return c(e10);
            }
            return this;
        }

        public g f() {
            if (this.f18409b == null) {
                return this;
            }
            return new g(this.f18408a, null, this.f18410c, this.f18411d, this.f18412e, this.f18413f);
        }

        public g g() {
            g g10;
            g gVar = this.f18409b;
            if (gVar == null) {
                g10 = null;
            } else {
                g10 = gVar.g();
            }
            if (this.f18412e) {
                return c(g10);
            }
            return g10;
        }

        public String toString() {
            String format = String.format("%s[visible=%b,ignore=%b,explicitName=%b]", this.f18408a.toString(), Boolean.valueOf(this.f18412e), Boolean.valueOf(this.f18413f), Boolean.valueOf(this.f18411d));
            if (this.f18409b != null) {
                return format + ", " + this.f18409b.toString();
            }
            return format;
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Iterator {

        /* renamed from: a  reason: collision with root package name */
        public g f18414a;

        public h(g gVar) {
            this.f18414a = gVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public r3.i next() {
            g gVar = this.f18414a;
            if (gVar != null) {
                r3.i iVar = (r3.i) gVar.f18408a;
                this.f18414a = gVar.f18409b;
                return iVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18414a != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        Object a(r3.i iVar);
    }

    public d0(m3.m mVar, k3.b bVar, boolean z10, k3.x xVar) {
        this(mVar, bVar, z10, xVar, xVar);
    }

    public static g j0(g gVar, g gVar2) {
        if (gVar == null) {
            return gVar2;
        }
        if (gVar2 == null) {
            return gVar;
        }
        return gVar.a(gVar2);
    }

    @Override // r3.s
    public boolean A() {
        if (this.f18399j != null) {
            return true;
        }
        return false;
    }

    @Override // r3.s
    public boolean B() {
        if (!F(this.f18396g) && !F(this.f18398i) && !F(this.f18399j) && !E(this.f18397h)) {
            return false;
        }
        return true;
    }

    @Override // r3.s
    public boolean C() {
        if (!E(this.f18396g) && !E(this.f18398i) && !E(this.f18399j) && !E(this.f18397h)) {
            return false;
        }
        return true;
    }

    @Override // r3.s
    public boolean D() {
        Boolean bool = (Boolean) f0(new c());
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean E(g gVar) {
        while (gVar != null) {
            if (gVar.f18410c != null && gVar.f18411d) {
                return true;
            }
            gVar = gVar.f18409b;
        }
        return false;
    }

    public final boolean F(g gVar) {
        while (gVar != null) {
            k3.x xVar = gVar.f18410c;
            if (xVar != null && xVar.e()) {
                return true;
            }
            gVar = gVar.f18409b;
        }
        return false;
    }

    public final boolean G(g gVar) {
        while (gVar != null) {
            if (gVar.f18413f) {
                return true;
            }
            gVar = gVar.f18409b;
        }
        return false;
    }

    public final boolean H(g gVar) {
        while (gVar != null) {
            if (gVar.f18412e) {
                return true;
            }
            gVar = gVar.f18409b;
        }
        return false;
    }

    public final g I(g gVar, p pVar) {
        r3.i iVar = (r3.i) ((r3.i) gVar.f18408a).p(pVar);
        g gVar2 = gVar.f18409b;
        if (gVar2 != null) {
            gVar = gVar.c(I(gVar2, pVar));
        }
        return gVar.d(iVar);
    }

    public final void J(Collection collection, Map map, g gVar) {
        for (g gVar2 = gVar; gVar2 != null; gVar2 = gVar2.f18409b) {
            k3.x xVar = gVar2.f18410c;
            if (gVar2.f18411d && xVar != null) {
                d0 d0Var = (d0) map.get(xVar);
                if (d0Var == null) {
                    d0Var = new d0(this.f18392c, this.f18393d, this.f18391b, this.f18395f, xVar);
                    map.put(xVar, d0Var);
                }
                if (gVar == this.f18396g) {
                    d0Var.f18396g = gVar2.c(d0Var.f18396g);
                } else if (gVar == this.f18398i) {
                    d0Var.f18398i = gVar2.c(d0Var.f18398i);
                } else if (gVar == this.f18399j) {
                    d0Var.f18399j = gVar2.c(d0Var.f18399j);
                } else if (gVar == this.f18397h) {
                    d0Var.f18397h = gVar2.c(d0Var.f18397h);
                } else {
                    throw new IllegalStateException("Internal error: mismatched accessors, property: " + this);
                }
            } else if (gVar2.f18412e) {
                throw new IllegalStateException("Conflicting/ambiguous property name definitions (implicit name " + d4.h.V(this.f18394e) + "): found multiple explicit names: " + collection + ", but also implicit accessor: " + gVar2);
            }
        }
    }

    public final Set K(g gVar, Set set) {
        while (gVar != null) {
            if (gVar.f18411d && gVar.f18410c != null) {
                if (set == null) {
                    set = new HashSet();
                }
                set.add(gVar.f18410c);
            }
            gVar = gVar.f18409b;
        }
        return set;
    }

    public final p L(g gVar) {
        p j10 = ((r3.i) gVar.f18408a).j();
        g gVar2 = gVar.f18409b;
        if (gVar2 != null) {
            return p.e(j10, L(gVar2));
        }
        return j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k3.w M(k3.w r7, r3.i r8) {
        /*
            r6 = this;
            r3.i r0 = r6.l()
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L72
            k3.b r3 = r6.f18393d
            r4 = 0
            if (r3 == 0) goto L35
            if (r0 == 0) goto L24
            java.lang.Boolean r3 = r3.w(r8)
            if (r3 == 0) goto L24
            boolean r1 = r3.booleanValue()
            if (r1 == 0) goto L23
            k3.w$a r1 = k3.w.a.b(r0)
            k3.w r7 = r7.i(r1)
        L23:
            r1 = 0
        L24:
            k3.b r3 = r6.f18393d
            b3.b0$a r3 = r3.Z(r8)
            if (r3 == 0) goto L35
            b3.j0 r2 = r3.f()
            b3.j0 r3 = r3.e()
            goto L36
        L35:
            r3 = r2
        L36:
            if (r1 != 0) goto L3c
            if (r2 == 0) goto L3c
            if (r3 != 0) goto L73
        L3c:
            java.lang.Class r8 = r6.P(r8)
            m3.m r5 = r6.f18392c
            m3.g r8 = r5.j(r8)
            b3.b0$a r5 = r8.h()
            if (r5 == 0) goto L58
            if (r2 != 0) goto L52
            b3.j0 r2 = r5.f()
        L52:
            if (r3 != 0) goto L58
            b3.j0 r3 = r5.e()
        L58:
            if (r1 == 0) goto L73
            if (r0 == 0) goto L73
            java.lang.Boolean r8 = r8.g()
            if (r8 == 0) goto L73
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L70
            k3.w$a r8 = k3.w.a.c(r0)
            k3.w r7 = r7.i(r8)
        L70:
            r1 = 0
            goto L73
        L72:
            r3 = r2
        L73:
            if (r1 != 0) goto L79
            if (r2 == 0) goto L79
            if (r3 != 0) goto La5
        L79:
            m3.m r8 = r6.f18392c
            b3.b0$a r8 = r8.r()
            if (r2 != 0) goto L85
            b3.j0 r2 = r8.f()
        L85:
            if (r3 != 0) goto L8b
            b3.j0 r3 = r8.e()
        L8b:
            if (r1 == 0) goto La5
            m3.m r8 = r6.f18392c
            java.lang.Boolean r8 = r8.n()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto La5
            if (r0 == 0) goto La5
            k3.w$a r8 = k3.w.a.a(r0)
            k3.w r7 = r7.i(r8)
        La5:
            if (r2 != 0) goto La9
            if (r3 == 0) goto Lad
        La9:
            k3.w r7 = r7.j(r2, r3)
        Lad:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.d0.M(k3.w, r3.i):k3.w");
    }

    public int N(j jVar) {
        String d10 = jVar.d();
        if (d10.startsWith("get") && d10.length() > 3) {
            return 1;
        }
        if (!d10.startsWith(bt.ae) || d10.length() <= 2) {
            return 3;
        }
        return 2;
    }

    public final p O(int i10, g... gVarArr) {
        p L = L(gVarArr[i10]);
        do {
            i10++;
            if (i10 >= gVarArr.length) {
                return L;
            }
        } while (gVarArr[i10] == null);
        return p.e(L, O(i10, gVarArr));
    }

    public Class P(r3.i iVar) {
        if (iVar instanceof j) {
            j jVar = (j) iVar;
            if (jVar.v() > 0) {
                return jVar.w(0).q();
            }
        }
        return iVar.f().q();
    }

    public final g Q(g gVar) {
        if (gVar == null) {
            return gVar;
        }
        return gVar.e();
    }

    public final g R(g gVar) {
        if (gVar == null) {
            return gVar;
        }
        return gVar.g();
    }

    public int S(j jVar) {
        String d10 = jVar.d();
        if (d10.startsWith("set") && d10.length() > 3) {
            return 1;
        }
        return 2;
    }

    public final g T(g gVar) {
        if (gVar == null) {
            return gVar;
        }
        return gVar.b();
    }

    public void U(d0 d0Var) {
        this.f18396g = j0(this.f18396g, d0Var.f18396g);
        this.f18397h = j0(this.f18397h, d0Var.f18397h);
        this.f18398i = j0(this.f18398i, d0Var.f18398i);
        this.f18399j = j0(this.f18399j, d0Var.f18399j);
    }

    public void V(m mVar, k3.x xVar, boolean z10, boolean z11, boolean z12) {
        this.f18397h = new g(mVar, this.f18397h, xVar, z10, z11, z12);
    }

    public void W(r3.g gVar, k3.x xVar, boolean z10, boolean z11, boolean z12) {
        this.f18396g = new g(gVar, this.f18396g, xVar, z10, z11, z12);
    }

    public void X(j jVar, k3.x xVar, boolean z10, boolean z11, boolean z12) {
        this.f18398i = new g(jVar, this.f18398i, xVar, z10, z11, z12);
    }

    public void Y(j jVar, k3.x xVar, boolean z10, boolean z11, boolean z12) {
        this.f18399j = new g(jVar, this.f18399j, xVar, z10, z11, z12);
    }

    public boolean Z() {
        if (!G(this.f18396g) && !G(this.f18398i) && !G(this.f18399j) && !G(this.f18397h)) {
            return false;
        }
        return true;
    }

    public boolean a0() {
        if (!H(this.f18396g) && !H(this.f18398i) && !H(this.f18399j) && !H(this.f18397h)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: b0 */
    public int compareTo(d0 d0Var) {
        if (this.f18397h != null) {
            if (d0Var.f18397h == null) {
                return -1;
            }
        } else if (d0Var.f18397h != null) {
            return 1;
        }
        return getName().compareTo(d0Var.getName());
    }

    @Override // r3.s
    public k3.x c() {
        return this.f18394e;
    }

    public Collection c0(Collection collection) {
        HashMap hashMap = new HashMap();
        J(collection, hashMap, this.f18396g);
        J(collection, hashMap, this.f18398i);
        J(collection, hashMap, this.f18399j);
        J(collection, hashMap, this.f18397h);
        return hashMap.values();
    }

    public w.a d0() {
        return (w.a) g0(new e(), w.a.AUTO);
    }

    @Override // r3.s
    public boolean e() {
        if (this.f18397h == null && this.f18399j == null && this.f18396g == null) {
            return false;
        }
        return true;
    }

    public Set e0() {
        Set K = K(this.f18397h, K(this.f18399j, K(this.f18398i, K(this.f18396g, null))));
        if (K == null) {
            return Collections.emptySet();
        }
        return K;
    }

    @Override // r3.s
    public boolean f() {
        if (this.f18398i == null && this.f18396g == null) {
            return false;
        }
        return true;
    }

    public Object f0(i iVar) {
        g gVar;
        g gVar2;
        Object obj = null;
        if (this.f18393d == null) {
            return null;
        }
        if (this.f18391b) {
            g gVar3 = this.f18398i;
            if (gVar3 != null) {
                obj = iVar.a((r3.i) gVar3.f18408a);
            }
        } else {
            g gVar4 = this.f18397h;
            if (gVar4 != null) {
                obj = iVar.a((r3.i) gVar4.f18408a);
            }
            if (obj == null && (gVar = this.f18399j) != null) {
                obj = iVar.a((r3.i) gVar.f18408a);
            }
        }
        if (obj == null && (gVar2 = this.f18396g) != null) {
            return iVar.a((r3.i) gVar2.f18408a);
        }
        return obj;
    }

    @Override // r3.s
    public r.b g() {
        r.b M;
        r3.i l10 = l();
        k3.b bVar = this.f18393d;
        if (bVar == null) {
            M = null;
        } else {
            M = bVar.M(l10);
        }
        if (M == null) {
            return r.b.c();
        }
        return M;
    }

    public Object g0(i iVar, Object obj) {
        Object a10;
        Object a11;
        Object a12;
        Object a13;
        Object a14;
        Object a15;
        Object a16;
        Object a17;
        if (this.f18393d == null) {
            return null;
        }
        if (this.f18391b) {
            g gVar = this.f18398i;
            if (gVar != null && (a17 = iVar.a((r3.i) gVar.f18408a)) != null && a17 != obj) {
                return a17;
            }
            g gVar2 = this.f18396g;
            if (gVar2 != null && (a16 = iVar.a((r3.i) gVar2.f18408a)) != null && a16 != obj) {
                return a16;
            }
            g gVar3 = this.f18397h;
            if (gVar3 != null && (a15 = iVar.a((r3.i) gVar3.f18408a)) != null && a15 != obj) {
                return a15;
            }
            g gVar4 = this.f18399j;
            if (gVar4 == null || (a14 = iVar.a((r3.i) gVar4.f18408a)) == null || a14 == obj) {
                return null;
            }
            return a14;
        }
        g gVar5 = this.f18397h;
        if (gVar5 != null && (a13 = iVar.a((r3.i) gVar5.f18408a)) != null && a13 != obj) {
            return a13;
        }
        g gVar6 = this.f18399j;
        if (gVar6 != null && (a12 = iVar.a((r3.i) gVar6.f18408a)) != null && a12 != obj) {
            return a12;
        }
        g gVar7 = this.f18396g;
        if (gVar7 != null && (a11 = iVar.a((r3.i) gVar7.f18408a)) != null && a11 != obj) {
            return a11;
        }
        g gVar8 = this.f18398i;
        if (gVar8 == null || (a10 = iVar.a((r3.i) gVar8.f18408a)) == null || a10 == obj) {
            return null;
        }
        return a10;
    }

    @Override // r3.s
    public k3.w getMetadata() {
        k3.w h10;
        if (this.f18400k == null) {
            r3.i i02 = i0();
            if (i02 == null) {
                this.f18400k = k3.w.f14996j;
            } else {
                Boolean p02 = this.f18393d.p0(i02);
                String J = this.f18393d.J(i02);
                Integer O = this.f18393d.O(i02);
                String I = this.f18393d.I(i02);
                if (p02 == null && O == null && I == null) {
                    if (J == null) {
                        h10 = k3.w.f14996j;
                    } else {
                        h10 = k3.w.f14996j.h(J);
                    }
                    this.f18400k = h10;
                } else {
                    this.f18400k = k3.w.a(p02, J, O, I);
                }
                if (!this.f18391b) {
                    this.f18400k = M(this.f18400k, i02);
                }
            }
        }
        return this.f18400k;
    }

    @Override // r3.s, d4.r
    public String getName() {
        k3.x xVar = this.f18394e;
        if (xVar == null) {
            return null;
        }
        return xVar.c();
    }

    @Override // r3.s
    public b0 h() {
        return (b0) f0(new d());
    }

    public String h0() {
        return this.f18395f.c();
    }

    public r3.i i0() {
        if (this.f18391b) {
            g gVar = this.f18398i;
            if (gVar != null) {
                return (r3.i) gVar.f18408a;
            }
            g gVar2 = this.f18396g;
            if (gVar2 == null) {
                return null;
            }
            return (r3.i) gVar2.f18408a;
        }
        g gVar3 = this.f18397h;
        if (gVar3 != null) {
            return (r3.i) gVar3.f18408a;
        }
        g gVar4 = this.f18399j;
        if (gVar4 != null) {
            return (r3.i) gVar4.f18408a;
        }
        g gVar5 = this.f18396g;
        if (gVar5 != null) {
            return (r3.i) gVar5.f18408a;
        }
        g gVar6 = this.f18398i;
        if (gVar6 == null) {
            return null;
        }
        return (r3.i) gVar6.f18408a;
    }

    @Override // r3.s
    public b.a j() {
        b.a aVar;
        b.a aVar2 = this.f18401l;
        if (aVar2 != null) {
            if (aVar2 == f18390m) {
                return null;
            }
            return aVar2;
        }
        b.a aVar3 = (b.a) f0(new b());
        if (aVar3 == null) {
            aVar = f18390m;
        } else {
            aVar = aVar3;
        }
        this.f18401l = aVar;
        return aVar3;
    }

    @Override // r3.s
    public Class[] k() {
        return (Class[]) f0(new a());
    }

    public void k0(boolean z10) {
        if (z10) {
            g gVar = this.f18398i;
            if (gVar != null) {
                this.f18398i = I(this.f18398i, O(0, gVar, this.f18396g, this.f18397h, this.f18399j));
                return;
            }
            g gVar2 = this.f18396g;
            if (gVar2 != null) {
                this.f18396g = I(this.f18396g, O(0, gVar2, this.f18397h, this.f18399j));
                return;
            }
            return;
        }
        g gVar3 = this.f18397h;
        if (gVar3 != null) {
            this.f18397h = I(this.f18397h, O(0, gVar3, this.f18399j, this.f18396g, this.f18398i));
            return;
        }
        g gVar4 = this.f18399j;
        if (gVar4 != null) {
            this.f18399j = I(this.f18399j, O(0, gVar4, this.f18396g, this.f18398i));
            return;
        }
        g gVar5 = this.f18396g;
        if (gVar5 != null) {
            this.f18396g = I(this.f18396g, O(0, gVar5, this.f18398i));
        }
    }

    public void l0() {
        this.f18397h = null;
    }

    @Override // r3.s
    public m m() {
        g gVar = this.f18397h;
        if (gVar == null) {
            return null;
        }
        while (!(((m) gVar.f18408a).r() instanceof r3.e)) {
            gVar = gVar.f18409b;
            if (gVar == null) {
                return (m) this.f18397h.f18408a;
            }
        }
        return (m) gVar.f18408a;
    }

    public void m0() {
        this.f18396g = Q(this.f18396g);
        this.f18398i = Q(this.f18398i);
        this.f18399j = Q(this.f18399j);
        this.f18397h = Q(this.f18397h);
    }

    @Override // r3.s
    public Iterator n() {
        g gVar = this.f18397h;
        if (gVar == null) {
            return d4.h.n();
        }
        return new h(gVar);
    }

    public w.a n0(boolean z10, c0 c0Var) {
        w.a d02 = d0();
        if (d02 == null) {
            d02 = w.a.AUTO;
        }
        int i10 = f.f18407a[d02.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f18398i = R(this.f18398i);
                    this.f18397h = R(this.f18397h);
                    if (!z10 || this.f18398i == null) {
                        this.f18396g = R(this.f18396g);
                        this.f18399j = R(this.f18399j);
                    }
                } else {
                    this.f18398i = null;
                    if (this.f18391b) {
                        this.f18396g = null;
                    }
                }
            }
        } else {
            if (c0Var != null) {
                c0Var.j(getName());
                for (k3.x xVar : e0()) {
                    c0Var.j(xVar.c());
                }
            }
            this.f18399j = null;
            this.f18397h = null;
            if (!this.f18391b) {
                this.f18396g = null;
            }
        }
        return d02;
    }

    @Override // r3.s
    public r3.g o() {
        g gVar = this.f18396g;
        if (gVar == null) {
            return null;
        }
        r3.g gVar2 = (r3.g) gVar.f18408a;
        for (g gVar3 = gVar.f18409b; gVar3 != null; gVar3 = gVar3.f18409b) {
            r3.g gVar4 = (r3.g) gVar3.f18408a;
            Class<?> k10 = gVar2.k();
            Class<?> k11 = gVar4.k();
            if (k10 != k11) {
                if (k10.isAssignableFrom(k11)) {
                    gVar2 = gVar4;
                } else if (k11.isAssignableFrom(k10)) {
                }
            }
            throw new IllegalArgumentException("Multiple fields representing property \"" + getName() + "\": " + gVar2.l() + " vs " + gVar4.l());
        }
        return gVar2;
    }

    public void o0() {
        this.f18396g = T(this.f18396g);
        this.f18398i = T(this.f18398i);
        this.f18399j = T(this.f18399j);
        this.f18397h = T(this.f18397h);
    }

    @Override // r3.s
    public j p() {
        g gVar = this.f18398i;
        if (gVar == null) {
            return null;
        }
        g gVar2 = gVar.f18409b;
        if (gVar2 == null) {
            return (j) gVar.f18408a;
        }
        while (gVar2 != null) {
            Class k10 = ((j) gVar.f18408a).k();
            Class k11 = ((j) gVar2.f18408a).k();
            if (k10 != k11) {
                if (!k10.isAssignableFrom(k11)) {
                    if (k11.isAssignableFrom(k10)) {
                        continue;
                        gVar2 = gVar2.f18409b;
                    }
                }
                gVar = gVar2;
                gVar2 = gVar2.f18409b;
            }
            int N = N((j) gVar2.f18408a);
            int N2 = N((j) gVar.f18408a);
            if (N != N2) {
                if (N >= N2) {
                    gVar2 = gVar2.f18409b;
                }
                gVar = gVar2;
                gVar2 = gVar2.f18409b;
            } else {
                throw new IllegalArgumentException("Conflicting getter definitions for property \"" + getName() + "\": " + ((j) gVar.f18408a).l() + " vs " + ((j) gVar2.f18408a).l());
            }
        }
        this.f18398i = gVar.f();
        return (j) gVar.f18408a;
    }

    public d0 p0(k3.x xVar) {
        return new d0(this, xVar);
    }

    @Override // r3.s
    public r3.i s() {
        if (this.f18391b) {
            return l();
        }
        r3.i q10 = q();
        if (q10 == null) {
            return l();
        }
        return q10;
    }

    @Override // r3.s
    public k3.j t() {
        if (this.f18391b) {
            r3.b p10 = p();
            if (p10 == null && (p10 = o()) == null) {
                return c4.o.O();
            }
            return p10.f();
        }
        r3.b m10 = m();
        if (m10 == null) {
            j v10 = v();
            if (v10 != null) {
                return v10.w(0);
            }
            m10 = o();
        }
        if (m10 == null && (m10 = p()) == null) {
            return c4.o.O();
        }
        return m10.f();
    }

    public String toString() {
        return "[Property '" + this.f18394e + "'; ctors: " + this.f18397h + ", field(s): " + this.f18396g + ", getter(s): " + this.f18398i + ", setter(s): " + this.f18399j + "]";
    }

    @Override // r3.s
    public Class u() {
        return t().q();
    }

    @Override // r3.s
    public j v() {
        g gVar = this.f18399j;
        if (gVar == null) {
            return null;
        }
        g gVar2 = gVar.f18409b;
        if (gVar2 == null) {
            return (j) gVar.f18408a;
        }
        while (gVar2 != null) {
            Class k10 = ((j) gVar.f18408a).k();
            Class k11 = ((j) gVar2.f18408a).k();
            if (k10 != k11) {
                if (!k10.isAssignableFrom(k11)) {
                    if (k11.isAssignableFrom(k10)) {
                        continue;
                        gVar2 = gVar2.f18409b;
                    }
                }
                gVar = gVar2;
                gVar2 = gVar2.f18409b;
            }
            j jVar = (j) gVar2.f18408a;
            j jVar2 = (j) gVar.f18408a;
            int S = S(jVar);
            int S2 = S(jVar2);
            if (S != S2) {
                if (S >= S2) {
                }
                gVar = gVar2;
            } else {
                k3.b bVar = this.f18393d;
                if (bVar != null) {
                    j w02 = bVar.w0(this.f18392c, jVar2, jVar);
                    if (w02 != jVar2) {
                        if (w02 != jVar) {
                        }
                        gVar = gVar2;
                    } else {
                        continue;
                    }
                }
                throw new IllegalArgumentException(String.format("Conflicting setter definitions for property \"%s\": %s vs %s", getName(), ((j) gVar.f18408a).l(), ((j) gVar2.f18408a).l()));
            }
            gVar2 = gVar2.f18409b;
        }
        this.f18399j = gVar.f();
        return (j) gVar.f18408a;
    }

    @Override // r3.s
    public k3.x w() {
        k3.b bVar;
        r3.i s10 = s();
        if (s10 != null && (bVar = this.f18393d) != null) {
            return bVar.g0(s10);
        }
        return null;
    }

    @Override // r3.s
    public boolean x() {
        if (this.f18397h != null) {
            return true;
        }
        return false;
    }

    @Override // r3.s
    public boolean y() {
        if (this.f18396g != null) {
            return true;
        }
        return false;
    }

    @Override // r3.s
    public boolean z(k3.x xVar) {
        return this.f18394e.equals(xVar);
    }

    public d0(m3.m mVar, k3.b bVar, boolean z10, k3.x xVar, k3.x xVar2) {
        this.f18392c = mVar;
        this.f18393d = bVar;
        this.f18395f = xVar;
        this.f18394e = xVar2;
        this.f18391b = z10;
    }

    public d0(d0 d0Var, k3.x xVar) {
        this.f18392c = d0Var.f18392c;
        this.f18393d = d0Var.f18393d;
        this.f18395f = d0Var.f18395f;
        this.f18394e = xVar;
        this.f18396g = d0Var.f18396g;
        this.f18397h = d0Var.f18397h;
        this.f18398i = d0Var.f18398i;
        this.f18399j = d0Var.f18399j;
        this.f18391b = d0Var.f18391b;
    }
}
