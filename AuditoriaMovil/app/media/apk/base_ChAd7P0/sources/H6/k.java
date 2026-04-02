package H6;

import K6.u;
import K6.w;
import java.util.concurrent.atomic.AtomicReferenceArray;
/* loaded from: classes.dex */
public final class k extends u {

    /* renamed from: e  reason: collision with root package name */
    public final c f2070e;
    public final AtomicReferenceArray f;

    public k(long j, k kVar, c cVar, int i7) {
        super(j, kVar, i7);
        this.f2070e = cVar;
        this.f = new AtomicReferenceArray(e.f2049b * 2);
    }

    @Override // K6.u
    public final int f() {
        return e.f2049b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
        if (r1 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
        kotlin.jvm.internal.j.b(r4);
        r7 = r4.f2046b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
        r7 = K6.AbstractC0208a.a(r7, r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006b, code lost:
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006d, code lost:
        F6.H.l(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    @Override // K6.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, n6.i r8) {
        /*
            r6 = this;
            int r0 = H6.e.f2049b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof F6.L0
            H6.c r4 = r6.f2070e
            r5 = 0
            if (r3 != 0) goto L71
            boolean r3 = r2 instanceof H6.s
            if (r3 == 0) goto L22
            goto L71
        L22:
            K6.w r3 = H6.e.j
            if (r2 == r3) goto L5b
            K6.w r3 = H6.e.f2056k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            K6.w r3 = H6.e.f2053g
            if (r2 == r3) goto L12
            K6.w r3 = H6.e.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            K6.w r7 = H6.e.f2055i
            if (r2 == r7) goto L5a
            K6.w r7 = H6.e.f2051d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            K6.w r7 = H6.e.f2057l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L70
            kotlin.jvm.internal.j.b(r4)
            w6.l r7 = r4.f2046b
            if (r7 == 0) goto L70
            F6.x r7 = K6.AbstractC0208a.a(r7, r0, r5)
            if (r7 == 0) goto L70
            F6.H.l(r8, r7)
        L70:
            return
        L71:
            if (r1 == 0) goto L76
            K6.w r3 = H6.e.j
            goto L78
        L76:
            K6.w r3 = H6.e.f2056k
        L78:
            boolean r2 = r6.j(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L98
            kotlin.jvm.internal.j.b(r4)
            w6.l r7 = r4.f2046b
            if (r7 == 0) goto L98
            F6.x r7 = K6.AbstractC0208a.a(r7, r0, r5)
            if (r7 == 0) goto L98
            F6.H.l(r8, r7)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.k.g(int, n6.i):void");
    }

    public final boolean j(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i8 = (i7 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i8, obj, obj2)) {
            if (atomicReferenceArray.get(i8) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i7) {
        return this.f.get((i7 * 2) + 1);
    }

    public final void l(int i7, boolean z7) {
        if (z7) {
            c cVar = this.f2070e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.f2804c * e.f2049b) + i7);
        }
        h();
    }

    public final void m(int i7, Object obj) {
        this.f.lazySet(i7 * 2, obj);
    }

    public final void n(int i7, w wVar) {
        this.f.set((i7 * 2) + 1, wVar);
    }
}
