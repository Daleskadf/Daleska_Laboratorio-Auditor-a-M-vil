package p0;

import F6.C0;
import a1.C0415A;
import java.util.List;
import p6.AbstractC1700c;
import r0.C1725e;
import r0.C1728h;
/* loaded from: classes.dex */
public final class N implements InterfaceC1640h {

    /* renamed from: X  reason: collision with root package name */
    public C0 f14954X;

    /* renamed from: Z  reason: collision with root package name */
    public final E.e f14956Z;

    /* renamed from: a  reason: collision with root package name */
    public final C1725e f14957a;

    /* renamed from: b  reason: collision with root package name */
    public final v4.d f14958b;

    /* renamed from: c  reason: collision with root package name */
    public final F6.D f14959c;
    public int f;

    /* renamed from: g0  reason: collision with root package name */
    public final E.e f14964g0;

    /* renamed from: d  reason: collision with root package name */
    public final A.c f14960d = new A.c(new C1650s(this, null));

    /* renamed from: e  reason: collision with root package name */
    public final O6.d f14961e = O6.e.a();

    /* renamed from: Y  reason: collision with root package name */
    public final C0415A f14955Y = new C0415A(19);

    /* renamed from: e0  reason: collision with root package name */
    public final l6.g f14962e0 = m5.d.m(new C1645m(this, 1));

    /* renamed from: f0  reason: collision with root package name */
    public final l6.g f14963f0 = m5.d.m(new C1645m(this, 0));

    public N(C1725e c1725e, List list, v4.d dVar, F6.D d7) {
        this.f14957a = c1725e;
        this.f14958b = dVar;
        this.f14959c = d7;
        this.f14956Z = new E.e(this, list);
        this.f14964g0 = new E.e(d7, new E6.l(this, 8), new C1632K(this, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:18:0x004b, B:20:0x0053, B:22:0x0057, B:23:0x005a), top: B:31:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(p0.N r4, p6.AbstractC1700c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof p0.C1651t
            if (r0 == 0) goto L16
            r0 = r5
            p0.t r0 = (p0.C1651t) r0
            int r1 = r0.f15056e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15056e = r1
            goto L1b
        L16:
            p0.t r0 = new p0.t
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f15054c
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f15056e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            O6.d r4 = r0.f15053b
            p0.N r0 = r0.f15052a
            org.slf4j.helpers.i.M(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            org.slf4j.helpers.i.M(r5)
            r0.f15052a = r4
            O6.d r5 = r4.f14961e
            r0.f15053b = r5
            r0.f15056e = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L64
        L4a:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + (-1)
            r4.f = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L5f
            F6.C0 r1 = r4.f14954X     // Catch: java.lang.Throwable -> L5d
            if (r1 == 0) goto L5a
            r1.cancel(r0)     // Catch: java.lang.Throwable -> L5d
        L5a:
            r4.f14954X = r0     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.e(r0)
            l6.j r1 = l6.j.f13876a
        L64:
            return r1
        L65:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.a(p0.N, p6.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(7:57|(1:(1:(1:61)(2:63|64))(3:65|66|67))(1:68)|62|17|(1:19)(1:23)|20|21)(4:8|9|10|(9:12|13|14|(1:24)|16|17|(0)(0)|20|21)(3:30|(1:32)(1:55)|(2:34|(2:36|(2:38|39))(2:47|48))(2:49|(2:51|52)(2:53|54))))|40|41|42|(1:44)|16|17|(0)(0)|20|21))|70|6|(0)(0)|40|41|42|(0)|16|17|(0)(0)|20|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p6.i, w6.p] */
    /* JADX WARN: Type inference failed for: r2v9, types: [p6.i, w6.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(p0.N r9, p0.P r10, p6.AbstractC1700c r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.b(p0.N, p0.P, p6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:18:0x004b, B:20:0x0052), top: B:28:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(p0.N r4, p6.AbstractC1700c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof p0.C1654w
            if (r0 == 0) goto L16
            r0 = r5
            p0.w r0 = (p0.C1654w) r0
            int r1 = r0.f15068e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f15068e = r1
            goto L1b
        L16:
            p0.w r0 = new p0.w
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f15066c
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f15068e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            O6.d r4 = r0.f15065b
            p0.N r0 = r0.f15064a
            org.slf4j.helpers.i.M(r5)
            r5 = r4
            r4 = r0
            goto L4a
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            org.slf4j.helpers.i.M(r5)
            r0.f15064a = r4
            O6.d r5 = r4.f14961e
            r0.f15065b = r5
            r0.f15068e = r3
            java.lang.Object r0 = r5.c(r0)
            if (r0 != r1) goto L4a
            goto L68
        L4a:
            r0 = 0
            int r1 = r4.f     // Catch: java.lang.Throwable -> L61
            int r1 = r1 + r3
            r4.f = r1     // Catch: java.lang.Throwable -> L61
            if (r1 != r3) goto L63
            F6.D r1 = r4.f14959c     // Catch: java.lang.Throwable -> L61
            p0.x r2 = new p0.x     // Catch: java.lang.Throwable -> L61
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L61
            r3 = 3
            F6.C0 r1 = F6.H.q(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L61
            r4.f14954X = r1     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r4 = move-exception
            goto L69
        L63:
            r5.e(r0)
            l6.j r1 = l6.j.f13876a
        L68:
            return r1
        L69:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.c(p0.N, p6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(p0.N r8, boolean r9, n6.d r10) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.d(p0.N, boolean, n6.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ea A[Catch: b -> 0x00ab, TryCatch #1 {b -> 0x00ab, blocks: (B:35:0x00a6, B:69:0x0144, B:40:0x00b4, B:66:0x0127, B:48:0x00d1, B:56:0x00ea, B:57:0x00ee, B:52:0x00da, B:63:0x0115), top: B:76:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.r, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r9v11, types: [kotlin.jvm.internal.p, java.lang.Object, java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(p0.N r8, boolean r9, p6.AbstractC1700c r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.e(p0.N, boolean, p6.c):java.lang.Object");
    }

    public final X f() {
        return (X) this.f14963f0.a();
    }

    @Override // p0.InterfaceC1640h
    public final Object g(w6.p pVar, p6.i iVar) {
        b0 b0Var = (b0) iVar.getContext().get(a0.f14994a);
        if (b0Var != null) {
            b0Var.a(this);
        }
        return F6.H.y(new b0(b0Var, this), new C1630I(this, pVar, null), iVar);
    }

    @Override // p0.InterfaceC1640h
    public final I6.d getData() {
        return this.f14960d;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(p6.AbstractC1700c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p0.C1656y
            if (r0 == 0) goto L13
            r0 = r6
            p0.y r0 = (p0.C1656y) r0
            int r1 = r0.f15075e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15075e = r1
            goto L18
        L13:
            p0.y r0 = new p0.y
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f15073c
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f15075e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f15072b
            p0.N r0 = r0.f15071a
            org.slf4j.helpers.i.M(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            p0.N r2 = r0.f15071a
            org.slf4j.helpers.i.M(r6)
            goto L51
        L3e:
            org.slf4j.helpers.i.M(r6)
            p0.X r6 = r5.f()
            r0.f15071a = r5
            r0.f15075e = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            E.e r4 = r2.f14956Z     // Catch: java.lang.Throwable -> L6d
            r0.f15071a = r2     // Catch: java.lang.Throwable -> L6d
            r0.f15072b = r6     // Catch: java.lang.Throwable -> L6d
            r0.f15075e = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r6 = r4.d0(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 != r1) goto L66
            return r1
        L66:
            l6.j r6 = l6.j.f13876a
            return r6
        L69:
            r1 = r6
            r6 = r0
            r0 = r2
            goto L6f
        L6d:
            r0 = move-exception
            goto L69
        L6f:
            a1.A r0 = r0.f14955Y
            p0.Q r2 = new p0.Q
            r2.<init>(r1, r6)
            r0.o(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.h(p6.c):java.lang.Object");
    }

    public final Object i(AbstractC1700c abstractC1700c) {
        return ((C1728h) this.f14962e0.a()).a(new C1649q(3, (n6.d) null), abstractC1700c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Type inference failed for: r14v2, types: [kotlin.jvm.internal.p, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r12, boolean r13, p6.AbstractC1700c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p0.L
            if (r0 == 0) goto L13
            r0 = r14
            p0.L r0 = (p0.L) r0
            int r1 = r0.f14947d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14947d = r1
            goto L18
        L13:
            p0.L r0 = new p0.L
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f14945b
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f14947d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.p r12 = r0.f14944a
            org.slf4j.helpers.i.M(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            org.slf4j.helpers.i.M(r14)
            kotlin.jvm.internal.p r14 = new kotlin.jvm.internal.p
            r14.<init>()
            l6.g r2 = r11.f14962e0
            java.lang.Object r2 = r2.a()
            r0.h r2 = (r0.C1728h) r2
            p0.M r10 = new p0.M
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f14944a = r14
            r0.f14947d = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f13794a
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.N.j(java.lang.Object, boolean, p6.c):java.lang.Object");
    }
}
