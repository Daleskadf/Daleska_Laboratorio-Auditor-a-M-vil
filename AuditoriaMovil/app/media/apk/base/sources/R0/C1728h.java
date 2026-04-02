package r0;

import Q6.l;
import Q6.o;
import a1.C0415A;
import java.util.concurrent.atomic.AtomicBoolean;
import p0.InterfaceC1633a;
import p0.X;
/* renamed from: r0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1728h implements InterfaceC1633a {

    /* renamed from: a  reason: collision with root package name */
    public final l f15437a;

    /* renamed from: b  reason: collision with root package name */
    public final o f15438b;

    /* renamed from: c  reason: collision with root package name */
    public final X f15439c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724d f15440d;

    /* renamed from: e  reason: collision with root package name */
    public final C0415A f15441e;
    public final O6.d f;

    public C1728h(l fileSystem, o path, X coordinator, C1724d c1724d) {
        kotlin.jvm.internal.j.e(fileSystem, "fileSystem");
        kotlin.jvm.internal.j.e(path, "path");
        kotlin.jvm.internal.j.e(coordinator, "coordinator");
        this.f15437a = fileSystem;
        this.f15438b = path;
        this.f15439c = coordinator;
        this.f15440d = c1724d;
        this.f15441e = new C0415A(21);
        this.f = O6.e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:28|29))(2:30|(6:32|33|34|35|36|(1:38)(1:39))(2:49|50))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x007f, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x007f, blocks: (B:33:0x007e, B:43:0x0091, B:39:0x0089), top: B:60:0x0020 }] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [r0.f, p6.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [r0.h] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [p0.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(p0.C1649q r9, p6.AbstractC1700c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof r0.C1726f
            if (r0 == 0) goto L13
            r0 = r10
            r0.f r0 = (r0.C1726f) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            r0.f r0 = new r0.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f15429d
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            boolean r9 = r0.f15428c
            r0.b r1 = r0.f15427b
            r0.h r0 = r0.f15426a
            org.slf4j.helpers.i.M(r10)     // Catch: java.lang.Throwable -> L2e
            goto L6e
        L2e:
            r10 = move-exception
            goto L89
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            org.slf4j.helpers.i.M(r10)
            a1.A r10 = r8.f15441e
            java.lang.Object r10 = r10.f6744a
            java.util.concurrent.atomic.AtomicBoolean r10 = (java.util.concurrent.atomic.AtomicBoolean) r10
            boolean r10 = r10.get()
            if (r10 != 0) goto La1
            O6.d r10 = r8.f
            boolean r10 = r10.d(r3)
            r0.b r2 = new r0.b     // Catch: java.lang.Throwable -> L97
            Q6.l r5 = r8.f15437a     // Catch: java.lang.Throwable -> L97
            Q6.o r6 = r8.f15438b     // Catch: java.lang.Throwable -> L97
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L97
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L87
            r0.f15426a = r8     // Catch: java.lang.Throwable -> L87
            r0.f15427b = r2     // Catch: java.lang.Throwable -> L87
            r0.f15428c = r10     // Catch: java.lang.Throwable -> L87
            r0.f = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r9.c(r2, r5, r0)     // Catch: java.lang.Throwable -> L87
            if (r9 != r1) goto L69
            return r1
        L69:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6e:
            r1.close()     // Catch: java.lang.Throwable -> L73
            r1 = r3
            goto L74
        L73:
            r1 = move-exception
        L74:
            if (r1 != 0) goto L7e
            if (r9 == 0) goto L7d
            O6.d r9 = r0.f
            r9.e(r3)
        L7d:
            return r10
        L7e:
            throw r1     // Catch: java.lang.Throwable -> L7f
        L7f:
            r10 = move-exception
            goto L99
        L81:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
            goto L89
        L87:
            r9 = move-exception
            goto L81
        L89:
            r1.close()     // Catch: java.lang.Throwable -> L8d
            goto L91
        L8d:
            r1 = move-exception
            j3.f.a(r10, r1)     // Catch: java.lang.Throwable -> L7f
        L91:
            throw r10     // Catch: java.lang.Throwable -> L7f
        L92:
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
            goto L99
        L97:
            r9 = move-exception
            goto L92
        L99:
            if (r9 == 0) goto La0
            O6.d r9 = r0.f
            r9.e(r3)
        La0:
            throw r10
        La1:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "StorageConnection has already been disposed."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C1728h.a(p0.q, p6.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c A[Catch: all -> 0x012c, IOException -> 0x012f, TRY_ENTER, TryCatch #9 {IOException -> 0x012f, all -> 0x012c, blocks: (B:57:0x011c, B:59:0x0124, B:67:0x013c, B:73:0x0148, B:74:0x014b), top: B:97:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c A[Catch: all -> 0x012c, IOException -> 0x012f, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x012f, all -> 0x012c, blocks: (B:57:0x011c, B:59:0x0124, B:67:0x013c, B:73:0x0148, B:74:0x014b), top: B:97:0x0021 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [Q6.j, Q6.l] */
    /* JADX WARN: Type inference failed for: r0v5, types: [Q6.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v26, types: [O6.a] */
    /* JADX WARN: Type inference failed for: r10v9, types: [w6.p] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [Q6.o] */
    /* JADX WARN: Type inference failed for: r3v6, types: [w6.p] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p0.M r10, p6.AbstractC1700c r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C1728h.b(p0.M, p6.c):java.lang.Object");
    }

    @Override // p0.InterfaceC1633a
    public final void close() {
        ((AtomicBoolean) this.f15441e.f6744a).set(true);
        this.f15440d.invoke();
    }
}
