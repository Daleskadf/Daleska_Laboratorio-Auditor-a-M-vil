package I4;

import L4.C0210b;
import L4.C0212d;
import L4.C0216h;
import L4.C0220l;
import L4.C0222n;
import L4.C0228u;
import L4.C0230w;
import L4.C0232y;
import L4.d0;
import L4.f0;
import L4.o0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: h  reason: collision with root package name */
    public static final i f2209h = i.f2201d;

    /* renamed from: i  reason: collision with root package name */
    public static final E f2210i = E.DOUBLE;
    public static final E j = E.LAZILY_PARSED_NUMBER;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f2211a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f2212b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final A.f f2213c;

    /* renamed from: d  reason: collision with root package name */
    public final C0220l f2214d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2215e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final i f2216g;

    public n(K4.h hVar, EnumC0206h enumC0206h, HashMap hashMap, i iVar, x xVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, E e7, E e8, ArrayList arrayList4) {
        C0228u c0228u;
        G kVar;
        C0228u c0228u2;
        A.f fVar = new A.f(17, hashMap, arrayList4);
        this.f2213c = fVar;
        this.f = true;
        this.f2216g = iVar;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(o0.f2967A);
        if (e7 == E.DOUBLE) {
            c0228u = C0232y.f3015c;
        } else {
            C0228u c0228u3 = C0232y.f3015c;
            c0228u = new C0228u(e7, 1);
        }
        arrayList5.add(c0228u);
        arrayList5.add(hVar);
        arrayList5.addAll(arrayList3);
        arrayList5.add(o0.f2982p);
        arrayList5.add(o0.f2974g);
        arrayList5.add(o0.f2972d);
        arrayList5.add(o0.f2973e);
        arrayList5.add(o0.f);
        if (xVar == x.DEFAULT) {
            kVar = o0.f2977k;
        } else {
            kVar = new k();
        }
        arrayList5.add(new f0(Long.TYPE, Long.class, kVar));
        arrayList5.add(new f0(Double.TYPE, Double.class, new j(0)));
        arrayList5.add(new f0(Float.TYPE, Float.class, new j(1)));
        if (e8 == E.LAZILY_PARSED_NUMBER) {
            c0228u2 = C0230w.f3012b;
        } else {
            c0228u2 = new C0228u(new C0230w(e8), 0);
        }
        arrayList5.add(c0228u2);
        arrayList5.add(o0.f2975h);
        arrayList5.add(o0.f2976i);
        arrayList5.add(new d0(AtomicLong.class, new l(kVar, 0).a(), 0));
        arrayList5.add(new d0(AtomicLongArray.class, new l(kVar, 1).a(), 0));
        arrayList5.add(o0.j);
        arrayList5.add(o0.f2978l);
        arrayList5.add(o0.f2983q);
        arrayList5.add(o0.f2984r);
        arrayList5.add(new d0(BigDecimal.class, o0.f2979m, 0));
        arrayList5.add(new d0(BigInteger.class, o0.f2980n, 0));
        arrayList5.add(new d0(K4.j.class, o0.f2981o, 0));
        arrayList5.add(o0.f2985s);
        arrayList5.add(o0.f2986t);
        arrayList5.add(o0.f2988v);
        arrayList5.add(o0.f2989w);
        arrayList5.add(o0.f2991y);
        arrayList5.add(o0.f2987u);
        arrayList5.add(o0.f2970b);
        arrayList5.add(C0216h.f2954c);
        arrayList5.add(o0.f2990x);
        if (O4.f.f3859a) {
            arrayList5.add(O4.f.f3861c);
            arrayList5.add(O4.f.f3860b);
            arrayList5.add(O4.f.f3862d);
        }
        arrayList5.add(C0210b.f2938c);
        arrayList5.add(o0.f2969a);
        arrayList5.add(new C0212d(fVar, 0));
        arrayList5.add(new C0212d(fVar, 1));
        C0220l c0220l = new C0220l(fVar);
        this.f2214d = c0220l;
        arrayList5.add(c0220l);
        arrayList5.add(o0.f2968B);
        arrayList5.add(new L4.E(fVar, enumC0206h, hVar, c0220l, arrayList4));
        this.f2215e = DesugarCollections.unmodifiableList(arrayList5);
    }

    public static void a(double d7) {
        if (!Double.isNaN(d7) && !Double.isInfinite(d7)) {
            return;
        }
        throw new IllegalArgumentException(d7 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.reflect.Type r6) {
        /*
            r4 = this;
            P4.a r0 = new P4.a
            r0.<init>(r6)
            r6 = 0
            if (r5 != 0) goto La
            goto L88
        La:
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r5)
            Q4.a r5 = new Q4.a
            r5.<init>(r1)
            I4.z r1 = I4.z.LEGACY_STRICT
            r5.G(r1)
            java.lang.String r2 = "AssertionError (GSON 2.12.0): "
            I4.z r3 = r5.f4393b
            if (r3 != r1) goto L24
            I4.z r1 = I4.z.LENIENT
            r5.G(r1)
        L24:
            r5.D()     // Catch: java.lang.Throwable -> L34 java.lang.AssertionError -> L36 java.io.IOException -> L38 java.lang.IllegalStateException -> L3a java.io.EOFException -> L60
            r1 = 0
            I4.G r0 = r4.c(r0)     // Catch: java.lang.Throwable -> L34 java.lang.AssertionError -> L36 java.io.IOException -> L38 java.lang.IllegalStateException -> L3a java.io.EOFException -> L3c
            java.lang.Object r6 = r0.b(r5)     // Catch: java.lang.Throwable -> L34 java.lang.AssertionError -> L36 java.io.IOException -> L38 java.lang.IllegalStateException -> L3a java.io.EOFException -> L3c
        L30:
            r5.G(r3)
            goto L65
        L34:
            r6 = move-exception
            goto L8f
        L36:
            r6 = move-exception
            goto L3e
        L38:
            r6 = move-exception
            goto L54
        L3a:
            r6 = move-exception
            goto L5a
        L3c:
            r0 = move-exception
            goto L62
        L3e:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r2 = r6.getMessage()     // Catch: java.lang.Throwable -> L34
            r1.append(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L34
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L54:
            I4.r r0 = new I4.r     // Catch: java.lang.Throwable -> L34
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L5a:
            I4.r r0 = new I4.r     // Catch: java.lang.Throwable -> L34
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L34
            throw r0     // Catch: java.lang.Throwable -> L34
        L60:
            r0 = move-exception
            r1 = 1
        L62:
            if (r1 == 0) goto L89
            goto L30
        L65:
            if (r6 == 0) goto L88
            Q4.b r5 = r5.D()     // Catch: java.io.IOException -> L78 Q4.d -> L7a
            Q4.b r0 = Q4.b.END_DOCUMENT     // Catch: java.io.IOException -> L78 Q4.d -> L7a
            if (r5 != r0) goto L70
            goto L88
        L70:
            I4.r r5 = new I4.r     // Catch: java.io.IOException -> L78 Q4.d -> L7a
            java.lang.String r6 = "JSON document was not fully consumed."
            r5.<init>(r6)     // Catch: java.io.IOException -> L78 Q4.d -> L7a
            throw r5     // Catch: java.io.IOException -> L78 Q4.d -> L7a
        L78:
            r5 = move-exception
            goto L7c
        L7a:
            r5 = move-exception
            goto L82
        L7c:
            I4.r r6 = new I4.r
            r6.<init>(r5)
            throw r6
        L82:
            I4.r r6 = new I4.r
            r6.<init>(r5)
            throw r6
        L88:
            return r6
        L89:
            I4.r r6 = new I4.r     // Catch: java.lang.Throwable -> L34
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L8f:
            r5.G(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.n.b(java.lang.String, java.lang.reflect.Type):java.lang.Object");
    }

    public final G c(P4.a aVar) {
        boolean z7;
        Objects.requireNonNull(aVar, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f2212b;
        G g3 = (G) concurrentHashMap.get(aVar);
        if (g3 != null) {
            return g3;
        }
        ThreadLocal threadLocal = this.f2211a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z7 = true;
        } else {
            G g4 = (G) map.get(aVar);
            if (g4 != null) {
                return g4;
            }
            z7 = false;
        }
        try {
            m mVar = new m();
            map.put(aVar, mVar);
            Iterator it = this.f2215e.iterator();
            G g8 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g8 = ((H) it.next()).create(this, aVar);
                if (g8 != null) {
                    if (mVar.f2208a == null) {
                        mVar.f2208a = g8;
                        map.put(aVar, g8);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z7) {
                threadLocal.remove();
            }
            if (g8 != null) {
                if (z7) {
                    concurrentHashMap.putAll(map);
                }
                return g8;
            }
            throw new IllegalArgumentException("GSON (2.12.0) cannot handle " + aVar);
        } catch (Throwable th) {
            if (z7) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r3 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r3 == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I4.G d(I4.H r7, P4.a r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            j$.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "type must not be null"
            j$.util.Objects.requireNonNull(r8, r0)
            L4.l r0 = r6.f2214d
            r0.getClass()
            L4.k r1 = L4.C0220l.f2961c
            if (r7 != r1) goto L14
            goto L57
        L14:
            j$.util.concurrent.ConcurrentHashMap r1 = r0.f2964b
            java.lang.Class r2 = r8.f4022a
            java.lang.Object r3 = r1.get(r2)
            I4.H r3 = (I4.H) r3
            if (r3 == 0) goto L23
            if (r3 != r7) goto L58
            goto L57
        L23:
            java.lang.Class<J4.a> r3 = J4.a.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            J4.a r3 = (J4.a) r3
            if (r3 != 0) goto L2e
            goto L58
        L2e:
            java.lang.Class r3 = r3.value()
            java.lang.Class<I4.H> r4 = I4.H.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 != 0) goto L3b
            goto L58
        L3b:
            A.f r4 = r0.f2963a
            P4.a r5 = new P4.a
            r5.<init>(r3)
            K4.p r3 = r4.j(r5)
            java.lang.Object r3 = r3.c()
            I4.H r3 = (I4.H) r3
            java.lang.Object r1 = r1.putIfAbsent(r2, r3)
            I4.H r1 = (I4.H) r1
            if (r1 == 0) goto L55
            r3 = r1
        L55:
            if (r3 != r7) goto L58
        L57:
            r7 = r0
        L58:
            java.util.List r0 = r6.f2215e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r0.next()
            I4.H r2 = (I4.H) r2
            if (r1 != 0) goto L71
            if (r2 != r7) goto L5f
            r1 = 1
            goto L5f
        L71:
            I4.G r2 = r2.create(r6, r8)
            if (r2 == 0) goto L5f
            return r2
        L78:
            if (r1 != 0) goto L7f
            I4.G r7 = r6.c(r8)
            return r7
        L7f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.n.d(I4.H, P4.a):I4.G");
    }

    public final Q4.c e(Writer writer) {
        Q4.c cVar = new Q4.c(writer);
        cVar.q(this.f2216g);
        cVar.f4408Z = this.f;
        cVar.r(z.LEGACY_STRICT);
        cVar.f4415f0 = false;
        return cVar;
    }

    public final String f(Serializable serializable) {
        if (serializable == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                g(e(stringWriter));
                return stringWriter.toString();
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
        Class cls = serializable.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            h(serializable, cls, e(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }

    public final void g(Q4.c cVar) {
        s sVar = s.f2218a;
        z zVar = cVar.f4407Y;
        boolean z7 = cVar.f4408Z;
        boolean z8 = cVar.f4415f0;
        cVar.f4408Z = this.f;
        cVar.f4415f0 = false;
        if (zVar == z.LEGACY_STRICT) {
            cVar.r(z.LENIENT);
        }
        try {
            try {
                o0.f2992z.getClass();
                C0222n.f(cVar, sVar);
                cVar.r(zVar);
                cVar.f4408Z = z7;
                cVar.f4415f0 = z8;
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e8.getMessage(), e8);
            }
        } catch (Throwable th) {
            cVar.r(zVar);
            cVar.f4408Z = z7;
            cVar.f4415f0 = z8;
            throw th;
        }
    }

    public final void h(Serializable serializable, Class cls, Q4.c cVar) {
        G c8 = c(new P4.a(cls));
        z zVar = cVar.f4407Y;
        if (zVar == z.LEGACY_STRICT) {
            cVar.r(z.LENIENT);
        }
        boolean z7 = cVar.f4408Z;
        boolean z8 = cVar.f4415f0;
        cVar.f4408Z = this.f;
        cVar.f4415f0 = false;
        try {
            try {
                c8.c(cVar, serializable);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            } catch (AssertionError e8) {
                throw new AssertionError("AssertionError (GSON 2.12.0): " + e8.getMessage(), e8);
            }
        } finally {
            cVar.r(zVar);
            cVar.f4408Z = z7;
            cVar.f4415f0 = z8;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f2215e + ",instanceCreators:" + this.f2213c + "}";
    }
}
