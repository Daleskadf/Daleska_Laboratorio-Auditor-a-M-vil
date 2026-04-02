package K6;

import D.AbstractC0059i;
import F6.AbstractC0077a0;
import F6.B;
import F6.C;
import F6.C0108v;
import F6.C0109w;
import F6.C0110x;
import F6.E0;
import F6.F0;
import F6.H;
import F6.InterfaceC0091h0;
import F6.J0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.C1445f;
import p6.AbstractC1700c;
/* renamed from: K6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0208a {

    /* renamed from: a  reason: collision with root package name */
    public static final w f2765a = new w("NO_DECISION", 0);

    /* renamed from: b  reason: collision with root package name */
    public static final w f2766b = new w("CLOSED", 0);

    /* renamed from: c  reason: collision with root package name */
    public static final w f2767c = new w("UNDEFINED", 0);

    /* renamed from: d  reason: collision with root package name */
    public static final w f2768d = new w("REUSABLE_CLAIMED", 0);

    /* renamed from: e  reason: collision with root package name */
    public static final w f2769e = new w("CONDITION_FALSE", 0);
    public static final w f = new w("NO_THREAD_ELEMENTS", 0);

    /* JADX WARN: Type inference failed for: r4v1, types: [F6.x, java.lang.RuntimeException] */
    public static final C0110x a(w6.l lVar, Object obj, C0110x c0110x) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (c0110x != null && c0110x.getCause() != th) {
                j3.f.a(c0110x, th);
            } else {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
        }
        return c0110x;
    }

    public static final Object b(u uVar, long j, w6.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f2804c >= j && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f2772a.get(uVar);
            w wVar = f2766b;
            if (obj == wVar) {
                return wVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.invoke(Long.valueOf(uVar.f2804c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f2772a;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f2766b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(n6.i iVar, Throwable th) {
        Throwable runtimeException;
        for (G6.b bVar : f.f2775a) {
            try {
                bVar.c(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    j3.f.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            j3.f.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        if (obj == f2766b) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(n6.i iVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (obj instanceof A) {
            A a7 = (A) obj;
            E0[] e0Arr = a7.f2764b;
            int length = e0Arr.length - 1;
            if (length < 0) {
                return;
            }
            E0 e02 = e0Arr[length];
            kotlin.jvm.internal.j.b(null);
            Object obj2 = a7.f2763a[length];
            throw null;
        }
        Object fold = iVar.fold(null, y.f2810c);
        kotlin.jvm.internal.j.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        AbstractC0059i.I(fold);
        throw null;
    }

    public static final void h(n6.d dVar, Object obj, w6.l lVar) {
        Object c0108v;
        J0 j02;
        if (dVar instanceof h) {
            h hVar = (h) dVar;
            Throwable a7 = l6.f.a(obj);
            if (a7 == null) {
                if (lVar != null) {
                    c0108v = new C0109w(obj, lVar);
                } else {
                    c0108v = obj;
                }
            } else {
                c0108v = new C0108v(false, a7);
            }
            AbstractC1700c abstractC1700c = hVar.f2780e;
            abstractC1700c.getContext();
            B b5 = hVar.f2779d;
            if (b5.d()) {
                hVar.f = c0108v;
                hVar.f1236c = 1;
                b5.c(abstractC1700c.getContext(), hVar);
                return;
            }
            AbstractC0077a0 a8 = F0.a();
            if (a8.f1252c >= 4294967296L) {
                hVar.f = c0108v;
                hVar.f1236c = 1;
                C1445f c1445f = a8.f1254e;
                if (c1445f == null) {
                    c1445f = new C1445f();
                    a8.f1254e = c1445f;
                }
                c1445f.addLast(hVar);
                return;
            }
            a8.m(true);
            try {
                InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) abstractC1700c.getContext().get(C.f1216b);
                if (interfaceC0091h0 != null && !interfaceC0091h0.isActive()) {
                    CancellationException cancellationException = interfaceC0091h0.getCancellationException();
                    hVar.c(c0108v, cancellationException);
                    hVar.resumeWith(org.slf4j.helpers.i.j(cancellationException));
                } else {
                    Object obj2 = hVar.f2778X;
                    n6.i context = abstractC1700c.getContext();
                    Object m7 = m(context, obj2);
                    if (m7 != f) {
                        j02 = H.x(abstractC1700c, context, m7);
                    } else {
                        j02 = null;
                    }
                    abstractC1700c.resumeWith(obj);
                    if (j02 == null || j02.R()) {
                        g(context, m7);
                    }
                }
                do {
                } while (a8.o());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K6.AbstractC0208a.j(java.lang.String, long, long, long):long");
    }

    public static int k(String str, int i7, int i8, int i9, int i10) {
        if ((i10 & 4) != 0) {
            i8 = 1;
        }
        if ((i10 & 8) != 0) {
            i9 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return (int) j(str, i7, i8, i9);
    }

    public static final Object l(n6.i iVar) {
        Object fold = iVar.fold(0, y.f2809b);
        kotlin.jvm.internal.j.b(fold);
        return fold;
    }

    public static final Object m(n6.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new A(((Number) obj).intValue(), iVar), y.f2811d);
        }
        AbstractC0059i.I(obj);
        throw null;
    }
}
