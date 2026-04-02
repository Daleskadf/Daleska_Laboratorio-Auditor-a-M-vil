package I6;

import e0.C0927b;
import p0.C1649q;
/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0927b f2244a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1649q f2245b;

    public i(C0927b c0927b, C1649q c1649q) {
        this.f2244a = c0927b;
        this.f2245b = c1649q;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // I6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(I6.e r9, n6.d r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof I6.h
            if (r0 == 0) goto L13
            r0 = r10
            I6.h r0 = (I6.h) r0
            int r1 = r0.f2240b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2240b = r1
            goto L18
        L13:
            I6.h r0 = new I6.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f2239a
            o6.a r1 = o6.EnumC1565a.COROUTINE_SUSPENDED
            int r2 = r0.f2240b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f2242d
            J6.n r9 = (J6.n) r9
            org.slf4j.helpers.i.M(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L88
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f2242d
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            org.slf4j.helpers.i.M(r10)
            goto La2
        L44:
            I6.e r9 = r0.f2243e
            java.lang.Object r2 = r0.f2242d
            I6.i r2 = (I6.i) r2
            org.slf4j.helpers.i.M(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8e
        L50:
            org.slf4j.helpers.i.M(r10)
            e0.b r10 = r8.f2244a     // Catch: java.lang.Throwable -> L8c
            r0.f2242d = r8     // Catch: java.lang.Throwable -> L8c
            r0.f2243e = r9     // Catch: java.lang.Throwable -> L8c
            r0.f2240b = r5     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r10 = r10.c0(r9, r0)     // Catch: java.lang.Throwable -> L8c
            if (r10 != r1) goto L62
            return r1
        L62:
            r2 = r8
        L63:
            J6.n r10 = new J6.n
            n6.i r4 = r0.getContext()
            r10.<init>(r9, r4)
            p0.q r9 = r2.f2245b     // Catch: java.lang.Throwable -> L86
            r0.f2242d = r10     // Catch: java.lang.Throwable -> L86
            r0.f2243e = r6     // Catch: java.lang.Throwable -> L86
            r0.f2240b = r3     // Catch: java.lang.Throwable -> L86
            java.lang.Object r9 = r9.c(r10, r6, r0)     // Catch: java.lang.Throwable -> L86
            if (r9 != r1) goto L7b
            return r1
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            l6.j r9 = l6.j.f13876a
            return r9
        L82:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L88
        L86:
            r9 = move-exception
            goto L82
        L88:
            r9.releaseIntercepted()
            throw r10
        L8c:
            r9 = move-exception
            r2 = r8
        L8e:
            I6.v r10 = new I6.v
            r10.<init>(r9)
            p0.q r2 = r2.f2245b
            r0.f2242d = r9
            r0.f2243e = r6
            r0.f2240b = r4
            java.lang.Object r10 = I6.t.a(r10, r2, r9, r0)
            if (r10 != r1) goto La2
            return r1
        La2:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.i.c0(I6.e, n6.d):java.lang.Object");
    }
}
