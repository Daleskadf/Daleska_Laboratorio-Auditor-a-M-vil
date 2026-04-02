package H6;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final i f2069a = new Object();

    public static c a(int i7, a aVar, int i8) {
        c mVar;
        if ((i8 & 2) != 0) {
            aVar = a.SUSPEND;
        }
        if (i7 != -2) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != Integer.MAX_VALUE) {
                        if (aVar == a.SUSPEND) {
                            return new c(i7, null);
                        }
                        return new m(i7, aVar, null);
                    }
                    return new c(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, null);
                } else if (aVar == a.SUSPEND) {
                    mVar = new c(0, null);
                } else {
                    mVar = new m(1, aVar, null);
                }
            } else if (aVar == a.SUSPEND) {
                return new m(1, a.DROP_OLDEST, null);
            } else {
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
        } else if (aVar == a.SUSPEND) {
            g.f2067g.getClass();
            mVar = new c(f.f2066b, null);
        } else {
            mVar = new m(1, aVar, null);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Type inference failed for: r0v2, types: [n6.d, H6.n] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r5v5, types: [w6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(H6.p r4, l2.i r5, p6.AbstractC1700c r6) {
        /*
            boolean r0 = r6 instanceof H6.n
            if (r0 == 0) goto L13
            r0 = r6
            H6.n r0 = (H6.n) r0
            int r1 = r0.f2074c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2074c = r1
            goto L18
        L13:
            H6.n r0 = new H6.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2073b
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f2074c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            w6.a r5 = r0.f2072a
            org.slf4j.helpers.i.M(r6)     // Catch: java.lang.Throwable -> L29
            goto L64
        L29:
            r4 = move-exception
            goto L6a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            org.slf4j.helpers.i.M(r6)
            n6.i r6 = r0.getContext()
            F6.C r2 = F6.C.f1216b
            n6.g r6 = r6.get(r2)
            if (r6 != r4) goto L6e
            r0.f2072a = r5     // Catch: java.lang.Throwable -> L29
            r0.f2074c = r3     // Catch: java.lang.Throwable -> L29
            F6.m r6 = new F6.m     // Catch: java.lang.Throwable -> L29
            n6.d r0 = r3.AbstractC1740d.q(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.s()     // Catch: java.lang.Throwable -> L29
            E6.l r0 = new E6.l     // Catch: java.lang.Throwable -> L29
            r2 = 1
            r0.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            H6.o r4 = (H6.o) r4     // Catch: java.lang.Throwable -> L29
            r4.R(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L64
            return r1
        L64:
            r5.invoke()
            l6.j r4 = l6.j.f13876a
            return r4
        L6a:
            r5.invoke()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: H6.j.b(H6.p, l2.i, p6.c):java.lang.Object");
    }
}
