package p0;
/* renamed from: p0.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1629H extends p6.i implements w6.l {

    /* renamed from: a  reason: collision with root package name */
    public Object f14931a;

    /* renamed from: b  reason: collision with root package name */
    public int f14932b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ N f14933c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ n6.i f14934d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p6.i f14935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1629H(N n7, n6.i iVar, w6.p pVar, n6.d dVar) {
        super(1, dVar);
        this.f14933c = n7;
        this.f14934d = iVar;
        this.f14935e = (p6.i) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    public final n6.d create(n6.d dVar) {
        return new C1629H(this.f14933c, this.f14934d, this.f14935e, dVar);
    }

    @Override // w6.l
    public final Object invoke(Object obj) {
        return ((C1629H) create((n6.d) obj)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARN: Type inference failed for: r6v0, types: [p6.i, w6.p] */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            o6.a r0 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r1 = r8.f14932b
            p0.N r2 = r8.f14933c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r8.f14931a
            org.slf4j.helpers.i.M(r9)
            goto L71
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.f14931a
            p0.c r1 = (p0.C1635c) r1
            org.slf4j.helpers.i.M(r9)
            goto L4f
        L27:
            org.slf4j.helpers.i.M(r9)
            goto L37
        L2b:
            org.slf4j.helpers.i.M(r9)
            r8.f14932b = r5
            java.lang.Object r9 = p0.N.e(r2, r5, r8)
            if (r9 != r0) goto L37
            return r0
        L37:
            r1 = r9
            p0.c r1 = (p0.C1635c) r1
            p0.G r9 = new p0.G
            p6.i r6 = r8.f14935e
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.f14931a = r1
            r8.f14932b = r4
            n6.i r4 = r8.f14934d
            java.lang.Object r9 = F6.H.y(r4, r9, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            java.lang.Object r4 = r1.f14997b
            if (r4 == 0) goto L58
            int r4 = r4.hashCode()
            goto L59
        L58:
            r4 = 0
        L59:
            int r6 = r1.f14998c
            if (r4 != r6) goto L73
            java.lang.Object r1 = r1.f14997b
            boolean r1 = kotlin.jvm.internal.j.a(r1, r9)
            if (r1 != 0) goto L72
            r8.f14931a = r9
            r8.f14932b = r3
            java.lang.Object r1 = r2.j(r9, r5, r8)
            if (r1 != r0) goto L70
            return r0
        L70:
            r0 = r9
        L71:
            r9 = r0
        L72:
            return r9
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.C1629H.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
