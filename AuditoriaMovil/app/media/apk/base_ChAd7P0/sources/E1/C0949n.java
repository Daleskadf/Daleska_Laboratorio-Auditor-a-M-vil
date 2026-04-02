package e1;

import A3.e0;
import H0.C0137q;
import H0.C0141v;
import H0.C0142w;
import H0.C0143x;
import H0.C0144y;
import H0.C0145z;
import android.content.Context;
import android.net.Uri;
import f5.C0993a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.tika.utils.StringUtils;
/* renamed from: e1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949n implements InterfaceC0959y {

    /* renamed from: a  reason: collision with root package name */
    public final Q0.A f10819a;

    /* renamed from: b  reason: collision with root package name */
    public A.f f10820b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10821c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10822d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10823e;
    public final float f;

    /* renamed from: g  reason: collision with root package name */
    public final float f10824g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f10825h;

    public C0949n(Context context) {
        this(new A.f(context, 29), new m1.m());
    }

    public static InterfaceC0959y d(Class cls, A.f fVar) {
        try {
            return (InterfaceC0959y) cls.getConstructor(M0.g.class).newInstance(fVar);
        } catch (Exception e7) {
            throw new IllegalStateException(e7);
        }
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y a(boolean z7) {
        this.f10825h = z7;
        Q0.A a7 = this.f10819a;
        a7.f4136b = z7;
        m1.m mVar = (m1.m) a7.f4137c;
        synchronized (mVar) {
            mVar.f13979b = z7;
        }
        for (InterfaceC0959y interfaceC0959y : ((HashMap) a7.f4139e).values()) {
            interfaceC0959y.a(z7);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, H0.u] */
    /* JADX WARN: Type inference failed for: r4v13, types: [H0.w, H0.v] */
    /* JADX WARN: Type inference failed for: r8v9, types: [A3.K] */
    @Override // e1.InterfaceC0959y
    public final AbstractC0936a b(H0.C c8) {
        List list;
        Uri uri;
        String str;
        long j;
        e0 e0Var;
        C0145z c0145z;
        H0.C c9 = c8;
        c9.f1642b.getClass();
        String scheme = c9.f1642b.f1914a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (!Objects.equals(c9.f1642b.f1915b, "application/x-image-uri")) {
            C0145z c0145z2 = c9.f1642b;
            int G2 = K0.x.G(c0145z2.f1914a, c0145z2.f1915b);
            if (c9.f1642b.f1918e != -9223372036854775807L) {
                m1.m mVar = (m1.m) this.f10819a.f4137c;
                synchronized (mVar) {
                    mVar.f13981d = 1;
                }
            }
            try {
                Q0.A a7 = this.f10819a;
                HashMap hashMap = (HashMap) a7.f4139e;
                InterfaceC0959y interfaceC0959y = (InterfaceC0959y) hashMap.get(Integer.valueOf(G2));
                if (interfaceC0959y == null) {
                    interfaceC0959y = (InterfaceC0959y) a7.d(G2).get();
                    interfaceC0959y.c((C0993a) a7.f4140g);
                    interfaceC0959y.a(a7.f4136b);
                    hashMap.put(Integer.valueOf(G2), interfaceC0959y);
                }
                C0143x a8 = c9.f1643c.a();
                C0144y c0144y = c9.f1643c;
                if (c0144y.f1909a == -9223372036854775807L) {
                    a8.f1904a = this.f10821c;
                }
                if (c0144y.f1912d == -3.4028235E38f) {
                    a8.f1907d = this.f;
                }
                if (c0144y.f1913e == -3.4028235E38f) {
                    a8.f1908e = this.f10824g;
                }
                if (c0144y.f1910b == -9223372036854775807L) {
                    a8.f1905b = this.f10822d;
                }
                if (c0144y.f1911c == -9223372036854775807L) {
                    a8.f1906c = this.f10823e;
                }
                C0144y c0144y2 = new C0144y(a8);
                if (!c0144y2.equals(c9.f1643c)) {
                    new t2.i();
                    List emptyList = Collections.emptyList();
                    e0 e0Var2 = e0.f138e;
                    H0.A a9 = H0.A.f1640a;
                    C0142w c0142w = c9.f1645e;
                    ?? obj = new Object();
                    obj.f1902a = c0142w.f1903a;
                    String str2 = c9.f1641a;
                    H0.F f = c9.f1644d;
                    c9.f1643c.a();
                    H0.A a10 = c9.f;
                    C0145z c0145z3 = c9.f1642b;
                    if (c0145z3 != null) {
                        String str3 = c0145z3.f1915b;
                        Uri uri2 = c0145z3.f1914a;
                        List list2 = c0145z3.f1916c;
                        ?? r8 = c0145z3.f1917d;
                        A3.I i7 = A3.K.f98b;
                        e0 e0Var3 = e0.f138e;
                        str = str3;
                        uri = uri2;
                        list = list2;
                        e0Var = r8;
                        j = c0145z3.f1918e;
                    } else {
                        list = emptyList;
                        uri = null;
                        str = null;
                        j = -9223372036854775807L;
                        e0Var = e0Var2;
                    }
                    C0143x a11 = c0144y2.a();
                    if (uri != null) {
                        c0145z = new C0145z(uri, str, null, list, e0Var, j);
                    } else {
                        c0145z = null;
                    }
                    if (str2 == null) {
                        str2 = StringUtils.EMPTY;
                    }
                    String str4 = str2;
                    ?? c0141v = new C0141v(obj);
                    C0144y c0144y3 = new C0144y(a11);
                    if (f == null) {
                        f = H0.F.f1669y;
                    }
                    c9 = new H0.C(str4, c0141v, c0145z, c0144y3, f, a10);
                }
                AbstractC0936a b5 = interfaceC0959y.b(c9);
                A3.K k2 = c9.f1642b.f1917d;
                if (!k2.isEmpty()) {
                    AbstractC0936a[] abstractC0936aArr = new AbstractC0936a[k2.size() + 1];
                    abstractC0936aArr[0] = b5;
                    if (k2.size() > 0) {
                        if (this.f10825h) {
                            C0137q c0137q = new C0137q();
                            ((H0.B) k2.get(0)).getClass();
                            ArrayList arrayList = H0.I.f1694a;
                            c0137q.f1850l = null;
                            ((H0.B) k2.get(0)).getClass();
                            c0137q.f1844d = null;
                            ((H0.B) k2.get(0)).getClass();
                            c0137q.f1845e = 0;
                            ((H0.B) k2.get(0)).getClass();
                            c0137q.f = 0;
                            ((H0.B) k2.get(0)).getClass();
                            c0137q.f1842b = null;
                            ((H0.B) k2.get(0)).getClass();
                            c0137q.f1841a = null;
                            new H0.r(c0137q);
                            ((H0.B) k2.get(0)).getClass();
                            throw null;
                        }
                        this.f10820b.getClass();
                        new ArrayList(1);
                        new HashSet(1);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        A3.I i8 = A3.K.f98b;
                        e0 e0Var4 = e0.f138e;
                        Collections.emptyList();
                        e0 e0Var5 = e0.f138e;
                        H0.A a12 = H0.A.f1640a;
                        Uri uri3 = Uri.EMPTY;
                        ((H0.B) k2.get(0)).getClass();
                        throw null;
                    }
                    b5 = new G(abstractC0936aArr);
                }
                long j8 = c9.f1645e.f1903a;
                C0942g c0942g = b5;
                if (j8 != Long.MIN_VALUE) {
                    c0942g = new C0942g(b5, j8, true);
                }
                c9.f1642b.getClass();
                c9.f1642b.getClass();
                return c0942g;
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(e7);
            }
        }
        long j9 = c9.f1642b.f1918e;
        int i9 = K0.x.f2529a;
        throw null;
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y c(C0993a c0993a) {
        Q0.A a7 = this.f10819a;
        a7.f4140g = c0993a;
        m1.m mVar = (m1.m) a7.f4137c;
        synchronized (mVar) {
            mVar.f13980c = c0993a;
        }
        for (InterfaceC0959y interfaceC0959y : ((HashMap) a7.f4139e).values()) {
            interfaceC0959y.c(c0993a);
        }
        return this;
    }

    public C0949n(A.f fVar, m1.m mVar) {
        this.f10820b = fVar;
        Q0.A a7 = new Q0.A(mVar, new C0993a(6));
        this.f10819a = a7;
        if (fVar != ((A.f) a7.f)) {
            a7.f = fVar;
            ((HashMap) a7.f4138d).clear();
            ((HashMap) a7.f4139e).clear();
        }
        this.f10821c = -9223372036854775807L;
        this.f10822d = -9223372036854775807L;
        this.f10823e = -9223372036854775807L;
        this.f = -3.4028235E38f;
        this.f10824g = -3.4028235E38f;
        this.f10825h = true;
    }
}
