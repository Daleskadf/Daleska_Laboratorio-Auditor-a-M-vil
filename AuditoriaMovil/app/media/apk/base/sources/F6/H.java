package F6;

import K6.AbstractC0208a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import o6.EnumC1565a;
import p6.AbstractC1700c;
import p6.InterfaceC1701d;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a */
    public static final K6.w f1220a = new K6.w("RESUME_TOKEN", 0);

    /* renamed from: b */
    public static final K6.w f1221b = new K6.w("REMOVED_TASK", 0);

    /* renamed from: c */
    public static final K6.w f1222c = new K6.w("CLOSED_EMPTY", 0);

    /* renamed from: d */
    public static final K6.w f1223d = new K6.w("COMPLETING_ALREADY", 0);

    /* renamed from: e */
    public static final K6.w f1224e = new K6.w("COMPLETING_WAITING_CHILDREN", 0);
    public static final K6.w f = new K6.w("COMPLETING_RETRY", 0);

    /* renamed from: g */
    public static final K6.w f1225g = new K6.w("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: h */
    public static final K6.w f1226h = new K6.w("SEALED", 0);

    /* renamed from: i */
    public static final U f1227i = new U(false);
    public static final U j = new U(true);

    /* JADX WARN: Type inference failed for: r0v0, types: [F6.t, F6.u0] */
    public static C0106t a() {
        ?? u0Var = new u0(true);
        u0Var.A(null);
        return u0Var;
    }

    public static final K6.e b(n6.i iVar) {
        if (iVar.get(C.f1216b) == null) {
            iVar = iVar.plus(new C0097k0(null));
        }
        return new K6.e(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [F6.a, F6.L] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static L c(D d7, w6.p pVar) {
        v0 v0Var;
        n6.j jVar = n6.j.f14394a;
        F f4 = F.DEFAULT;
        n6.i r7 = r(d7, jVar);
        f4.getClass();
        if (f4 == F.LAZY) {
            v0Var = new v0(r7, pVar);
        } else {
            v0Var = new AbstractC0076a(r7, true);
        }
        v0Var.Q(f4, v0Var, pVar);
        return v0Var;
    }

    public static final Object d(K[] kArr, p6.i iVar) {
        if (kArr.length == 0) {
            return m6.p.f14074a;
        }
        C0084e c0084e = new C0084e(kArr);
        C0100m c0100m = new C0100m(1, AbstractC1740d.q(iVar));
        c0100m.s();
        int length = kArr.length;
        C0080c[] c0080cArr = new C0080c[length];
        for (int i7 = 0; i7 < length; i7++) {
            K k2 = kArr[i7];
            k2.start();
            C0080c c0080c = new C0080c(c0084e, c0100m);
            c0080c.f = k2.invokeOnCompletion(c0080c);
            c0080cArr[i7] = c0080c;
        }
        C0082d c0082d = new C0082d(c0080cArr);
        for (int i8 = 0; i8 < length; i8++) {
            C0080c c0080c2 = c0080cArr[i8];
            c0080c2.getClass();
            C0080c.f1256Y.set(c0080c2, c0082d);
        }
        if (!(C0100m.f1282X.get(c0100m) instanceof A0)) {
            c0082d.b();
        } else {
            c0100m.u(c0082d);
        }
        Object r7 = c0100m.r();
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        return r7;
    }

    public static final Object e(w6.p pVar, n6.d dVar) {
        K6.t tVar = new K6.t(dVar, dVar.getContext());
        Object o02 = f7.a.o0(tVar, tVar, pVar);
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        return o02;
    }

    public static final Object f(long j8, AbstractC1700c abstractC1700c) {
        int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        l6.j jVar = l6.j.f13876a;
        if (i7 <= 0) {
            return jVar;
        }
        C0100m c0100m = new C0100m(1, AbstractC1740d.q(abstractC1700c));
        c0100m.s();
        if (j8 < Long.MAX_VALUE) {
            i(c0100m.f1285e).b(j8, c0100m);
        }
        Object r7 = c0100m.r();
        if (r7 == EnumC1565a.COROUTINE_SUSPENDED) {
            return r7;
        }
        return jVar;
    }

    public static final void g(n6.i iVar) {
        InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) iVar.get(C.f1216b);
        if (interfaceC0091h0 != null && !interfaceC0091h0.isActive()) {
            throw interfaceC0091h0.getCancellationException();
        }
    }

    public static final n6.i h(n6.i iVar, n6.i iVar2, boolean z7) {
        Boolean bool = Boolean.FALSE;
        C0111y c0111y = C0111y.f1322c;
        boolean booleanValue = ((Boolean) iVar.fold(bool, c0111y)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.fold(bool, c0111y)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.plus(iVar2);
        }
        n6.j jVar = n6.j.f14394a;
        n6.i iVar3 = (n6.i) iVar.fold(jVar, new C0111y(2, 2));
        n6.i iVar4 = iVar2;
        if (booleanValue2) {
            iVar4 = iVar2.fold(jVar, C0111y.f1321b);
        }
        return iVar3.plus(iVar4);
    }

    public static final M i(n6.i iVar) {
        M m7;
        n6.g gVar = iVar.get(n6.e.f14393a);
        if (gVar instanceof M) {
            m7 = (M) gVar;
        } else {
            m7 = null;
        }
        if (m7 == null) {
            return J.f1232a;
        }
        return m7;
    }

    public static final String j(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0100m k(n6.d dVar) {
        C0100m c0100m;
        C0100m c0100m2;
        if (!(dVar instanceof K6.h)) {
            return new C0100m(1, dVar);
        }
        K6.h hVar = (K6.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K6.h.f2777Y;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            K6.w wVar = AbstractC0208a.f2768d;
            c0100m = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, wVar);
                c0100m2 = null;
                break;
            } else if (obj instanceof C0100m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, wVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0100m2 = (C0100m) obj;
                break loop0;
            } else if (obj != wVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0100m2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0100m.f1282X;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0100m2);
            if ((obj2 instanceof C0107u) && ((C0107u) obj2).f1311d != null) {
                c0100m2.o();
            } else {
                C0100m.f.set(c0100m2, 536870911);
                atomicReferenceFieldUpdater2.set(c0100m2, C0078b.f1255a);
                c0100m = c0100m2;
            }
            if (c0100m != null) {
                return c0100m;
            }
        }
        return new C0100m(2, dVar);
    }

    public static final void l(n6.i iVar, Throwable th) {
        try {
            G6.b bVar = (G6.b) iVar.get(C.f1215a);
            if (bVar != null) {
                bVar.c(iVar, th);
            } else {
                AbstractC0208a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                j3.f.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0208a.d(iVar, th);
        }
    }

    public static /* synthetic */ S m(InterfaceC0091h0 interfaceC0091h0, boolean z7, AbstractC0099l0 abstractC0099l0, int i7) {
        boolean z8 = false;
        if ((i7 & 1) != 0) {
            z7 = false;
        }
        if ((i7 & 2) != 0) {
            z8 = true;
        }
        return interfaceC0091h0.invokeOnCompletion(z7, z8, abstractC0099l0);
    }

    public static final boolean n(int i7) {
        if (i7 == 1 || i7 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(java.util.List r4, p6.AbstractC1700c r5) {
        /*
            boolean r0 = r5 instanceof F6.C0088g
            if (r0 == 0) goto L13
            r0 = r5
            F6.g r0 = (F6.C0088g) r0
            int r1 = r0.f1272c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1272c = r1
            goto L18
        L13:
            F6.g r0 = new F6.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1271b
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f1272c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f1270a
            org.slf4j.helpers.i.M(r5)
            goto L38
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            org.slf4j.helpers.i.M(r5)
            java.util.Iterator r4 = r4.iterator()
        L38:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            F6.h0 r5 = (F6.InterfaceC0091h0) r5
            r0.f1270a = r4
            r0.f1272c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L38
            return r1
        L4f:
            l6.j r4 = l6.j.f13876a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.H.o(java.util.List, p6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0050 -> B:41:0x0053). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(F6.InterfaceC0091h0[] r6, p6.AbstractC1700c r7) {
        /*
            boolean r0 = r7 instanceof F6.C0086f
            if (r0 == 0) goto L13
            r0 = r7
            F6.f r0 = (F6.C0086f) r0
            int r1 = r0.f1268e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1268e = r1
            goto L18
        L13:
            F6.f r0 = new F6.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1267d
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f1268e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f1266c
            int r2 = r0.f1265b
            java.lang.Object[] r4 = r0.f1264a
            F6.h0[] r4 = (F6.InterfaceC0091h0[]) r4
            org.slf4j.helpers.i.M(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            org.slf4j.helpers.i.M(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f1264a = r7
            r0.f1265b = r2
            r0.f1266c = r6
            r0.f1268e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            l6.j r6 = l6.j.f13876a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.H.p(F6.h0[], p6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [F6.a, F6.C0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static C0 q(D d7, B b5, w6.p pVar, int i7) {
        w0 w0Var;
        n6.i iVar = b5;
        if ((i7 & 1) != 0) {
            iVar = n6.j.f14394a;
        }
        F f4 = F.DEFAULT;
        n6.i r7 = r(d7, iVar);
        f4.getClass();
        if (f4 == F.LAZY) {
            w0Var = new w0(r7, pVar);
        } else {
            w0Var = new AbstractC0076a(r7, true);
        }
        w0Var.Q(f4, w0Var, pVar);
        return w0Var;
    }

    public static final n6.i r(D d7, n6.i iVar) {
        n6.i h8 = h(d7.a(), iVar, true);
        M6.f fVar = P.f1237a;
        if (h8 != fVar && h8.get(n6.e.f14393a) == null) {
            return h8.plus(fVar);
        }
        return h8;
    }

    public static final Object s(Object obj) {
        if (obj instanceof C0108v) {
            return org.slf4j.helpers.i.j(((C0108v) obj).f1316a);
        }
        return obj;
    }

    public static final void t(C0100m c0100m, n6.d dVar, boolean z7) {
        Object h8;
        J0 j02;
        boolean R7;
        Object obj = C0100m.f1282X.get(c0100m);
        Throwable g3 = c0100m.g(obj);
        if (g3 != null) {
            h8 = org.slf4j.helpers.i.j(g3);
        } else {
            h8 = c0100m.h(obj);
        }
        if (z7) {
            kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            K6.h hVar = (K6.h) dVar;
            AbstractC1700c abstractC1700c = hVar.f2780e;
            n6.i context = abstractC1700c.getContext();
            Object m7 = AbstractC0208a.m(context, hVar.f2778X);
            if (m7 != AbstractC0208a.f) {
                j02 = x(abstractC1700c, context, m7);
            } else {
                j02 = null;
            }
            try {
                abstractC1700c.resumeWith(h8);
                if (j02 != null) {
                    if (!R7) {
                        return;
                    }
                }
                return;
            } finally {
                if (j02 == null || j02.R()) {
                    AbstractC0208a.g(context, m7);
                }
            }
        }
        dVar.resumeWith(h8);
    }

    public static Object u(w6.p pVar) {
        long j8;
        C0108v c0108v;
        n6.j jVar = n6.j.f14394a;
        Thread currentThread = Thread.currentThread();
        n6.e eVar = n6.e.f14393a;
        AbstractC0077a0 a7 = F0.a();
        n6.i h8 = h(jVar, a7, true);
        M6.f fVar = P.f1237a;
        if (h8 != fVar && h8.get(eVar) == null) {
            h8 = h8.plus(fVar);
        }
        C0090h c0090h = new C0090h(h8, currentThread, a7);
        c0090h.Q(F.DEFAULT, c0090h, pVar);
        AbstractC0077a0 abstractC0077a0 = c0090h.f1275e;
        if (abstractC0077a0 != null) {
            int i7 = AbstractC0077a0.f;
            abstractC0077a0.m(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (abstractC0077a0 != null) {
                    j8 = abstractC0077a0.n();
                } else {
                    j8 = Long.MAX_VALUE;
                }
                if (c0090h.x() instanceof InterfaceC0085e0) {
                    LockSupport.parkNanos(c0090h, j8);
                } else {
                    if (abstractC0077a0 != null) {
                        int i8 = AbstractC0077a0.f;
                        abstractC0077a0.g(false);
                    }
                    Object w2 = w(c0090h.x());
                    if (w2 instanceof C0108v) {
                        c0108v = (C0108v) w2;
                    } else {
                        c0108v = null;
                    }
                    if (c0108v == null) {
                        return w2;
                    }
                    throw c0108v.f1316a;
                }
            } catch (Throwable th) {
                if (abstractC0077a0 != null) {
                    int i9 = AbstractC0077a0.f;
                    abstractC0077a0.g(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0090h.k(interruptedException);
        throw interruptedException;
    }

    public static final String v(n6.d dVar) {
        String str;
        if (dVar instanceof K6.h) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + j(dVar);
        } catch (Throwable th) {
            str = org.slf4j.helpers.i.j(th);
        }
        Throwable a7 = l6.f.a(str);
        String str2 = str;
        if (a7 != null) {
            str2 = dVar.getClass().getName() + '@' + j(dVar);
        }
        return (String) str2;
    }

    public static final Object w(Object obj) {
        C0087f0 c0087f0;
        InterfaceC0085e0 interfaceC0085e0;
        if (obj instanceof C0087f0) {
            c0087f0 = (C0087f0) obj;
        } else {
            c0087f0 = null;
        }
        if (c0087f0 != null && (interfaceC0085e0 = c0087f0.f1269a) != null) {
            return interfaceC0085e0;
        }
        return obj;
    }

    public static final J0 x(n6.d dVar, n6.i iVar, Object obj) {
        J0 j02 = null;
        if (!(dVar instanceof InterfaceC1701d)) {
            return null;
        }
        if (iVar.get(K0.f1234a) != null) {
            InterfaceC1701d interfaceC1701d = (InterfaceC1701d) dVar;
            while (true) {
                if (!(interfaceC1701d instanceof N) && (interfaceC1701d = interfaceC1701d.getCallerFrame()) != null) {
                    if (interfaceC1701d instanceof J0) {
                        j02 = (J0) interfaceC1701d;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (j02 != null) {
                j02.S(iVar, obj);
            }
        }
        return j02;
    }

    public static final Object y(n6.i iVar, w6.p pVar, n6.d dVar) {
        n6.i h8;
        Object w2;
        n6.i context = dVar.getContext();
        if (!((Boolean) iVar.fold(Boolean.FALSE, C0111y.f1322c)).booleanValue()) {
            h8 = context.plus(iVar);
        } else {
            h8 = h(context, iVar, false);
        }
        g(h8);
        if (h8 == context) {
            K6.t tVar = new K6.t(dVar, h8);
            w2 = f7.a.o0(tVar, tVar, pVar);
        } else {
            n6.e eVar = n6.e.f14393a;
            if (kotlin.jvm.internal.j.a(h8.get(eVar), context.get(eVar))) {
                J0 j02 = new J0(dVar, h8);
                n6.i iVar2 = j02.f1251c;
                Object m7 = AbstractC0208a.m(iVar2, null);
                try {
                    Object o02 = f7.a.o0(j02, j02, pVar);
                    AbstractC0208a.g(iVar2, m7);
                    w2 = o02;
                } catch (Throwable th) {
                    AbstractC0208a.g(iVar2, m7);
                    throw th;
                }
            } else {
                K6.t tVar2 = new K6.t(dVar, h8);
                android.support.v4.media.session.a.A(pVar, tVar2, tVar2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = N.f1235e;
                    int i7 = atomicIntegerFieldUpdater.get(tVar2);
                    if (i7 != 0) {
                        if (i7 == 2) {
                            w2 = w(tVar2.x());
                            if (w2 instanceof C0108v) {
                                throw ((C0108v) w2).f1316a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1)) {
                        w2 = EnumC1565a.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        EnumC1565a enumC1565a = EnumC1565a.COROUTINE_SUSPENDED;
        return w2;
    }

    public static final Object z(long j8, w6.p pVar, AbstractC1700c abstractC1700c) {
        Object c0108v;
        Object D4;
        if (j8 > 0) {
            H0 h02 = new H0(j8, abstractC1700c);
            h02.invokeOnCompletion(new T(i(h02.f2802d.getContext()).a(h02.f1228e, h02, h02.f1251c), 0));
            try {
                kotlin.jvm.internal.u.b(2, pVar);
                c0108v = pVar.invoke(h02, h02);
            } catch (Throwable th) {
                c0108v = new C0108v(false, th);
            }
            Object obj = EnumC1565a.COROUTINE_SUSPENDED;
            if (c0108v != obj && (D4 = h02.D(c0108v)) != f1224e) {
                if (D4 instanceof C0108v) {
                    Throwable th2 = ((C0108v) D4).f1316a;
                    if ((th2 instanceof G0) && ((G0) th2).f1219a == h02) {
                        if (c0108v instanceof C0108v) {
                            throw ((C0108v) c0108v).f1316a;
                        }
                    } else {
                        throw th2;
                    }
                } else {
                    c0108v = w(D4);
                }
                return c0108v;
            }
            return obj;
        }
        throw new G0("Timed out immediately", null);
    }
}
