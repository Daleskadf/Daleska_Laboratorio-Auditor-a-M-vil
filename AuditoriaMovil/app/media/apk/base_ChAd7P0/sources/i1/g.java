package i1;

import A3.AbstractC0021t;
import A3.K;
import A3.e0;
import A3.j0;
import D.RunnableC0053c;
import M0.C;
import android.content.Context;
import android.os.Handler;
import b3.C0585f;
import e1.C0960z;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class g implements d, C {

    /* renamed from: n  reason: collision with root package name */
    public static final e0 f11396n = K.t(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o  reason: collision with root package name */
    public static final e0 f11397o = K.t(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p  reason: collision with root package name */
    public static final e0 f11398p = K.t(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q  reason: collision with root package name */
    public static final e0 f11399q = K.t(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r  reason: collision with root package name */
    public static final e0 f11400r = K.t(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s  reason: collision with root package name */
    public static final e0 f11401s = K.t(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t  reason: collision with root package name */
    public static g f11402t;

    /* renamed from: a  reason: collision with root package name */
    public final j0 f11403a;

    /* renamed from: b  reason: collision with root package name */
    public final C0585f f11404b = new C0585f(5);

    /* renamed from: c  reason: collision with root package name */
    public final K0.s f11405c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f11406d;

    /* renamed from: e  reason: collision with root package name */
    public final s f11407e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f11408g;

    /* renamed from: h  reason: collision with root package name */
    public long f11409h;

    /* renamed from: i  reason: collision with root package name */
    public long f11410i;
    public long j;

    /* renamed from: k  reason: collision with root package name */
    public long f11411k;

    /* renamed from: l  reason: collision with root package name */
    public long f11412l;

    /* renamed from: m  reason: collision with root package name */
    public int f11413m;

    public g(Context context, HashMap hashMap, int i7, K0.s sVar, boolean z7) {
        this.f11403a = j0.a(hashMap);
        this.f11407e = new s(i7);
        this.f11405c = sVar;
        this.f11406d = z7;
        if (context != null) {
            K0.o d7 = K0.o.d(context);
            int e7 = d7.e();
            this.f11413m = e7;
            this.f11411k = b(e7);
            f fVar = new f(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) d7.f2504c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(fVar));
            ((Handler) d7.f2503b).post(new RunnableC0053c(4, d7, fVar));
            return;
        }
        this.f11413m = 0;
        this.f11411k = b(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:942:0x0cd7, code lost:
        if (r8.equals("AI") == false) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.g.a(java.lang.String):int[]");
    }

    public final long b(int i7) {
        Integer valueOf = Integer.valueOf(i7);
        j0 j0Var = this.f11403a;
        Long l8 = (Long) j0Var.get(valueOf);
        if (l8 == null) {
            l8 = (Long) j0Var.get(0);
        }
        if (l8 == null) {
            l8 = 1000000L;
        }
        return l8.longValue();
    }

    public final void c(final int i7, final long j, final long j8) {
        if (i7 == 0 && j == 0 && j8 == this.f11412l) {
            return;
        }
        this.f11412l = j8;
        Iterator it = ((CopyOnWriteArrayList) this.f11404b.f8171b).iterator();
        while (it.hasNext()) {
            final c cVar = (c) it.next();
            if (!cVar.f11389c) {
                cVar.f11387a.post(new Runnable() { // from class: i1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0960z c0960z;
                        P0.d dVar = c.this.f11388b;
                        M3.q qVar = dVar.f3909d;
                        if (((K) qVar.f3254c).isEmpty()) {
                            c0960z = null;
                        } else {
                            c0960z = (C0960z) AbstractC0021t.l((K) qVar.f3254c);
                        }
                        P0.a G2 = dVar.G(c0960z);
                        dVar.J(G2, 1006, new J1.n(G2, i7, j, j8));
                    }
                });
            }
        }
    }
}
