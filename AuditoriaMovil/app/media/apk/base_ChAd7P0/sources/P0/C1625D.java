package p0;
/* renamed from: p0.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1625D extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public Object f14916a;

    /* renamed from: b  reason: collision with root package name */
    public int f14917b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ boolean f14918c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f14919d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f14920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1625D(N n7, int i7, n6.d dVar) {
        super(2, dVar);
        this.f14919d = n7;
        this.f14920e = i7;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        C1625D c1625d = new C1625D(this.f14919d, this.f14920e, dVar);
        c1625d.f14918c = ((Boolean) obj).booleanValue();
        return c1625d;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C1625D) create(bool, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            o6.a r0 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r1 = r6.f14917b
            p0.N r2 = r6.f14919d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f14916a
            org.slf4j.helpers.i.M(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f14918c
            org.slf4j.helpers.i.M(r7)
            goto L32
        L22:
            org.slf4j.helpers.i.M(r7)
            boolean r1 = r6.f14918c
            r6.f14918c = r1
            r6.f14917b = r4
            java.lang.Object r7 = r2.i(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            p0.X r1 = r2.f()
            r6.f14916a = r7
            r6.f14917b = r3
            java.lang.Integer r1 = r1.a()
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.f14920e
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            p0.c r1 = new p0.c
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r0, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1625D.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
