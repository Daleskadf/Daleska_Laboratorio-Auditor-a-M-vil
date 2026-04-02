package p0;
/* loaded from: classes.dex */
public final class T extends p6.i implements w6.p {

    /* renamed from: a  reason: collision with root package name */
    public C1632K f14976a;

    /* renamed from: b  reason: collision with root package name */
    public int f14977b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ E.e f14978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(E.e eVar, n6.d dVar) {
        super(2, dVar);
        this.f14978c = eVar;
    }

    @Override // p6.AbstractC1698a
    public final n6.d create(Object obj, n6.d dVar) {
        return new T(this.f14978c, dVar);
    }

    @Override // w6.p
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((F6.D) obj, (n6.d) obj2)).invokeSuspend(l6.j.f13876a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
        if (r6 != H6.e.f2059n) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r6 = F6.H.k(r3.AbstractC1740d.q(r21));
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
        r8 = r7.z(r5, r10, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (r8 != r13) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
        r6.a(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
        r2 = r7.f2046b;
        r13 = r6.f1285e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (r8 != r12) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r16 >= r7.o()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r4 = (H6.k) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
        if (r7.q(r15.get(r7), true) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fd, code lost:
        r6.resumeWith(org.slf4j.helpers.i.j(r7.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
        r16 = r13.getAndIncrement(r7);
        r8 = H6.e.f2049b;
        r10 = r16 / r8;
        r5 = (int) (r16 % r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
        if (r4.f2804c == r10) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011c, code lost:
        r8 = r7.k(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0120, code lost:
        if (r8 != null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0124, code lost:
        r14 = r13;
        r8 = r7.z(r4, r5, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0131, code lost:
        if (r8 != H6.e.f2058m) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0133, code lost:
        r6.a(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0139, code lost:
        if (r8 != H6.e.f2060o) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0141, code lost:
        if (r16 >= r7.o()) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0146, code lost:
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014a, code lost:
        if (r8 == H6.e.f2059n) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014c, code lost:
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014f, code lost:
        if (r2 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0151, code lost:
        r3 = new K6.p(r2, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0157, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0158, code lost:
        r6.b(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0163, code lost:
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0168, code lost:
        if (r2 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x016a, code lost:
        r3 = new K6.p(r2, r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0170, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0172, code lost:
        r2 = r6.r();
        r3 = o6.EnumC1565a.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
        r6.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017c, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
        r20 = r2;
        r5.a();
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
        if (r2 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0185, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
        r3 = r20;
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0195 -> B:87:0x0197). Please submit an issue!!! */
    @Override // p6.AbstractC1698a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.T.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
