package T5;
/* loaded from: classes.dex */
public final class A implements I6.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ I6.e f5383b;

    public /* synthetic */ A(I6.e eVar, int i7) {
        this.f5382a = i7;
        this.f5383b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    @Override // I6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, n6.d r6) {
        /*
            r4 = this;
            int r0 = r4.f5382a
            switch(r0) {
                case 0: goto L6f;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof p0.r
            if (r0 == 0) goto L18
            r0 = r6
            p0.r r0 = (p0.r) r0
            int r1 = r0.f15046b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f15046b = r1
            goto L1d
        L18:
            p0.r r0 = new p0.r
            r0.<init>(r4, r6)
        L1d:
            java.lang.Object r6 = r0.f15045a
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f15046b
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            org.slf4j.helpers.i.M(r6)
            goto L50
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            org.slf4j.helpers.i.M(r6)
            p0.Y r5 = (p0.Y) r5
            boolean r6 = r5 instanceof p0.Q
            if (r6 != 0) goto L6a
            boolean r6 = r5 instanceof p0.C1635c
            if (r6 == 0) goto L53
            p0.c r5 = (p0.C1635c) r5
            java.lang.Object r5 = r5.f14997b
            r0.f15046b = r3
            I6.e r6 = r4.f5383b
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L50
            goto L52
        L50:
            l6.j r1 = l6.j.f13876a
        L52:
            return r1
        L53:
            boolean r6 = r5 instanceof p0.O
            if (r6 == 0) goto L58
            goto L5a
        L58:
            boolean r3 = r5 instanceof p0.Z
        L5a:
            if (r3 == 0) goto L64
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r5.<init>(r6)
            throw r5
        L64:
            F6.x r5 = new F6.x
            r5.<init>()
            throw r5
        L6a:
            p0.Q r5 = (p0.Q) r5
            java.lang.Throwable r5 = r5.f14970b
            throw r5
        L6f:
            boolean r0 = r6 instanceof T5.z
            if (r0 == 0) goto L82
            r0 = r6
            T5.z r0 = (T5.z) r0
            int r1 = r0.f5501b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L82
            int r1 = r1 - r2
            r0.f5501b = r1
            goto L87
        L82:
            T5.z r0 = new T5.z
            r0.<init>(r4, r6)
        L87:
            java.lang.Object r6 = r0.f5500a
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f5501b
            r3 = 1
            if (r2 == 0) goto L9e
            if (r2 != r3) goto L96
            org.slf4j.helpers.i.M(r6)
            goto Lb6
        L96:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L9e:
            org.slf4j.helpers.i.M(r6)
            t0.b r5 = (t0.C1803b) r5
            java.util.Map r5 = r5.a()
            java.util.Set r5 = r5.keySet()
            r0.f5501b = r3
            I6.e r6 = r4.f5383b
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto Lb6
            goto Lb8
        Lb6:
            l6.j r1 = l6.j.f13876a
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.A.a(java.lang.Object, n6.d):java.lang.Object");
    }
}
