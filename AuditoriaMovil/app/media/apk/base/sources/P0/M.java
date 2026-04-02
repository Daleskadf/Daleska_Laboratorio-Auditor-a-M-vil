package p0;

import r0.C1730j;
/* loaded from: classes.dex */
public final class M extends p6.i implements w6.p {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ boolean f14948X;

    /* renamed from: a  reason: collision with root package name */
    public kotlin.jvm.internal.p f14949a;

    /* renamed from: b  reason: collision with root package name */
    public int f14950b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f14951c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f14952d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ N f14953e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(kotlin.jvm.internal.p pVar, N n7, Object obj, boolean z7, n6.d dVar) {
        super(2, dVar);
        this.f14952d = pVar;
        this.f14953e = n7;
        this.f = obj;
        this.f14948X = z7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        M m7 = new M(this.f14952d, this.f14953e, this.f, this.f14948X, dVar);
        m7.f14951c = obj;
        return m7;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((C1730j) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            o6.a r0 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r1 = r8.f14950b
            kotlin.jvm.internal.p r2 = r8.f14952d
            java.lang.Object r3 = r8.f
            p0.N r4 = r8.f14953e
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            org.slf4j.helpers.i.M(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.jvm.internal.p r1 = r8.f14949a
            java.lang.Object r6 = r8.f14951c
            r0.j r6 = (r0.C1730j) r6
            org.slf4j.helpers.i.M(r9)
            goto L4f
        L28:
            org.slf4j.helpers.i.M(r9)
            java.lang.Object r9 = r8.f14951c
            r0.j r9 = (r0.C1730j) r9
            p0.X r1 = r4.f()
            r8.f14951c = r9
            r8.f14949a = r2
            r8.f14950b = r6
            g1.c r1 = r1.f14990b
            java.lang.Object r1 = r1.f11091a
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r1 = r2
            r7 = r6
            r6 = r9
            r9 = r7
        L4f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f13794a = r9
            r9 = 0
            r8.f14951c = r9
            r8.f14949a = r9
            r8.f14950b = r5
            java.lang.Object r9 = r6.b(r3, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r9 = r8.f14948X
            if (r9 == 0) goto L7d
            a1.A r9 = r4.f14955Y
            p0.c r0 = new p0.c
            if (r3 == 0) goto L74
            int r1 = r3.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r2 = r2.f13794a
            r0.<init>(r3, r1, r2)
            r9.o(r0)
        L7d:
            l6.j r9 = l6.j.f13876a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
