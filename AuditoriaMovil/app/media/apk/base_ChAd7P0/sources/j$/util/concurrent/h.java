package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class h extends l {

    /* renamed from: e  reason: collision with root package name */
    final l[] f12909e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(l[] lVarArr) {
        super(-1, null, null);
        this.f12909e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        if ((r0 instanceof j$.util.concurrent.h) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        r0 = ((j$.util.concurrent.h) r0).f12909e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        return r0.a(r5, r6);
     */
    @Override // j$.util.concurrent.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.concurrent.l a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.l[] r0 = r4.f12909e
        L2:
            r1 = 0
            if (r6 == 0) goto L39
            if (r0 == 0) goto L39
            int r2 = r0.length
            if (r2 == 0) goto L39
            int r2 = r2 + (-1)
            r2 = r2 & r5
            j$.util.concurrent.l r0 = j$.util.concurrent.ConcurrentHashMap.k(r0, r2)
            if (r0 != 0) goto L14
            goto L39
        L14:
            int r2 = r0.f12915a
            if (r2 != r5) goto L25
            java.lang.Object r3 = r0.f12916b
            if (r3 == r6) goto L24
            if (r3 == 0) goto L25
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L25
        L24:
            return r0
        L25:
            if (r2 >= 0) goto L35
            boolean r1 = r0 instanceof j$.util.concurrent.h
            if (r1 == 0) goto L30
            j$.util.concurrent.h r0 = (j$.util.concurrent.h) r0
            j$.util.concurrent.l[] r0 = r0.f12909e
            goto L2
        L30:
            j$.util.concurrent.l r5 = r0.a(r5, r6)
            return r5
        L35:
            j$.util.concurrent.l r0 = r0.f12918d
            if (r0 != 0) goto L14
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.h.a(int, java.lang.Object):j$.util.concurrent.l");
    }
}
