package F6;
/* loaded from: classes.dex */
public final class q0 extends p6.h implements w6.p {

    /* renamed from: b  reason: collision with root package name */
    public y0 f1301b;

    /* renamed from: c  reason: collision with root package name */
    public K6.k f1302c;

    /* renamed from: d  reason: collision with root package name */
    public int f1303d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f1304e;
    public final /* synthetic */ u0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(u0 u0Var, n6.d dVar) {
        super(dVar);
        this.f = u0Var;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        q0 q0Var = new q0(this.f, dVar);
        q0Var.f1304e = obj;
        return q0Var;
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((D6.e) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0065 -> B:27:0x007b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:27:0x007b). Please submit an issue!!! */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            o6.a r0 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r1 = r6.f1303d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            K6.k r1 = r6.f1302c
            F6.y0 r3 = r6.f1301b
            java.lang.Object r4 = r6.f1304e
            D6.e r4 = (D6.e) r4
            org.slf4j.helpers.i.M(r7)
            goto L7b
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            org.slf4j.helpers.i.M(r7)
            goto L80
        L24:
            org.slf4j.helpers.i.M(r7)
            java.lang.Object r7 = r6.f1304e
            D6.e r7 = (D6.e) r7
            F6.u0 r1 = r6.f
            java.lang.Object r1 = r1.x()
            boolean r4 = r1 instanceof F6.C0104q
            if (r4 == 0) goto L42
            F6.q r1 = (F6.C0104q) r1
            F6.r r1 = r1.f1300e
            r6.f1303d = r3
            o6.a r7 = r7.c(r1, r6)
            if (r7 != r0) goto L80
            return r0
        L42:
            boolean r3 = r1 instanceof F6.InterfaceC0085e0
            if (r3 == 0) goto L80
            F6.e0 r1 = (F6.InterfaceC0085e0) r1
            F6.y0 r1 = r1.c()
            if (r1 == 0) goto L80
            java.lang.Object r3 = r1.f()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.j.c(r3, r4)
            K6.k r3 = (K6.k) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L5d:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L80
            boolean r7 = r1 instanceof F6.C0104q
            if (r7 == 0) goto L7b
            r7 = r1
            F6.q r7 = (F6.C0104q) r7
            r6.f1304e = r4
            r6.f1301b = r3
            r6.f1302c = r1
            r6.f1303d = r2
            F6.r r7 = r7.f1300e
            o6.a r7 = r4.c(r7, r6)
            if (r7 != r0) goto L7b
            return r0
        L7b:
            K6.k r1 = r1.g()
            goto L5d
        L80:
            l6.j r7 = l6.j.f13876a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
