package F6;

import K6.AbstractC0208a;
/* loaded from: classes.dex */
public final class J0 extends K6.t {

    /* renamed from: e  reason: collision with root package name */
    public final ThreadLocal f1233e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J0(n6.d r3, n6.i r4) {
        /*
            r2 = this;
            F6.K0 r0 = F6.K0.f1234a
            n6.g r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            n6.i r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f1233e = r0
            n6.i r3 = r3.getContext()
            n6.e r0 = n6.e.f14393a
            n6.g r3 = r3.get(r0)
            boolean r3 = r3 instanceof F6.B
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = K6.AbstractC0208a.m(r4, r3)
            K6.AbstractC0208a.g(r4, r3)
            r2.S(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.J0.<init>(n6.d, n6.i):void");
    }

    public final boolean R() {
        boolean z7;
        if (this.threadLocalIsSet && this.f1233e.get() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f1233e.remove();
        return !z7;
    }

    public final void S(n6.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1233e.set(new l6.d(iVar, obj));
    }

    @Override // K6.t, F6.u0
    public final void i(Object obj) {
        if (this.threadLocalIsSet) {
            l6.d dVar = (l6.d) this.f1233e.get();
            if (dVar != null) {
                AbstractC0208a.g((n6.i) dVar.f13865a, dVar.f13866b);
            }
            this.f1233e.remove();
        }
        Object s7 = H.s(obj);
        n6.d dVar2 = this.f2802d;
        n6.i context = dVar2.getContext();
        J0 j02 = null;
        Object m7 = AbstractC0208a.m(context, null);
        if (m7 != AbstractC0208a.f) {
            j02 = H.x(dVar2, context, m7);
        }
        try {
            this.f2802d.resumeWith(s7);
        } finally {
            if (j02 == null || j02.R()) {
                AbstractC0208a.g(context, m7);
            }
        }
    }
}
