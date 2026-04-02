package I6;
/* loaded from: classes.dex */
public final class c extends J6.f {

    /* renamed from: d  reason: collision with root package name */
    public final l2.j f2229d;

    /* renamed from: e  reason: collision with root package name */
    public final l2.j f2230e;

    public c(l2.j jVar, n6.i iVar, int i7, H6.a aVar) {
        super(iVar, i7, aVar);
        this.f2229d = jVar;
        this.f2230e = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // J6.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(H6.p r6, n6.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof I6.b
            if (r0 == 0) goto L13
            r0 = r7
            I6.b r0 = (I6.b) r0
            int r1 = r0.f2228d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2228d = r1
            goto L1a
        L13:
            I6.b r0 = new I6.b
            p6.c r7 = (p6.AbstractC1700c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f2226b
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f2228d
            l6.j r3 = l6.j.f13876a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            H6.p r6 = r0.f2225a
            org.slf4j.helpers.i.M(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            org.slf4j.helpers.i.M(r7)
            r0.f2225a = r6
            r0.f2228d = r4
            l2.j r7 = r5.f2229d
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            H6.o r6 = (H6.o) r6
            H6.c r6 = r6.f2075d
            boolean r6 = r6.r()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.c.a(H6.p, n6.d):java.lang.Object");
    }

    @Override // J6.f
    public final J6.f b(n6.i iVar, int i7, H6.a aVar) {
        return new c(this.f2230e, iVar, i7, aVar);
    }

    @Override // J6.f
    public final String toString() {
        return "block[" + this.f2229d + "] -> " + super.toString();
    }
}
