package p0;

import g1.C1006c;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public final O6.d f14989a = O6.e.a();

    /* renamed from: b  reason: collision with root package name */
    public final C1006c f14990b = new C1006c(8);

    /* renamed from: c  reason: collision with root package name */
    public final A.c f14991c = new A.c((w6.p) new p6.i(2, null));

    /* JADX WARN: Type inference failed for: r3v3, types: [p6.i, w6.p] */
    public X(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f14990b.f11091a).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(w6.l r8, p6.AbstractC1700c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p0.U
            if (r0 == 0) goto L13
            r0 = r9
            p0.U r0 = (p0.U) r0
            int r1 = r0.f14983e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14983e = r1
            goto L18
        L13:
            p0.U r0 = new p0.U
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f14981c
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f14983e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.f14979a
            O6.a r8 = (O6.a) r8
            org.slf4j.helpers.i.M(r9)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r9 = move-exception
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            O6.d r8 = r0.f14980b
            java.lang.Object r2 = r0.f14979a
            w6.l r2 = (w6.l) r2
            org.slf4j.helpers.i.M(r9)
            r9 = r8
            r8 = r2
            goto L57
        L45:
            org.slf4j.helpers.i.M(r9)
            r0.f14979a = r8
            O6.d r9 = r7.f14989a
            r0.f14980b = r9
            r0.f14983e = r4
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L57
            return r1
        L57:
            r0.f14979a = r9     // Catch: java.lang.Throwable -> L6d
            r0.f14980b = r5     // Catch: java.lang.Throwable -> L6d
            r0.f14983e = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L64
            return r1
        L64:
            r6 = r9
            r9 = r8
            r8 = r6
        L67:
            O6.d r8 = (O6.d) r8
            r8.e(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            O6.d r8 = (O6.d) r8
            r8.e(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.X.b(w6.l, p6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(w6.p r7, p6.AbstractC1700c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p0.V
            if (r0 == 0) goto L13
            r0 = r8
            p0.V r0 = (p0.V) r0
            int r1 = r0.f14988e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14988e = r1
            goto L18
        L13:
            p0.V r0 = new p0.V
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f14986c
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f14988e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            boolean r7 = r0.f14985b
            O6.d r0 = r0.f14984a
            org.slf4j.helpers.i.M(r8)     // Catch: java.lang.Throwable -> L2c
            goto L53
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            org.slf4j.helpers.i.M(r8)
            O6.d r8 = r6.f14989a
            boolean r2 = r8.d(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L59
            r0.f14984a = r8     // Catch: java.lang.Throwable -> L59
            r0.f14985b = r2     // Catch: java.lang.Throwable -> L59
            r0.f14988e = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r7 != r1) goto L50
            return r1
        L50:
            r0 = r8
            r8 = r7
            r7 = r2
        L53:
            if (r7 == 0) goto L58
            r0.e(r4)
        L58:
            return r8
        L59:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L62
            r0.e(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.X.c(w6.p, p6.c):java.lang.Object");
    }
}
