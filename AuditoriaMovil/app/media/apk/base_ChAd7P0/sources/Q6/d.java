package Q6;

import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class d implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4458a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4459b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4460c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f4458a = i7;
        this.f4459b = obj;
        this.f4460c = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4458a) {
            case 0:
                d dVar = (d) this.f4460c;
                x xVar = (x) this.f4459b;
                try {
                    dVar.close();
                    if (!xVar.b()) {
                        return;
                    }
                    throw xVar.c(null);
                } catch (IOException e7) {
                    if (!xVar.b()) {
                        throw e7;
                    }
                    throw xVar.c(e7);
                } finally {
                    xVar.b();
                }
            default:
                ((InputStream) this.f4459b).close();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
        if (r8 != false) goto L28;
     */
    @Override // Q6.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long i(Q6.e r7, long r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4459b
            r1 = 1
            java.lang.Object r2 = r6.f4460c
            java.lang.String r3 = "sink"
            int r4 = r6.f4458a
            kotlin.jvm.internal.j.e(r7, r3)
            switch(r4) {
                case 0: goto L8e;
                default: goto Lf;
            }
        Lf:
            r3 = 0
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L16
            goto L59
        L16:
            if (r5 < 0) goto L7e
            Q6.A r2 = (Q6.A) r2     // Catch: java.lang.AssertionError -> L48
            r2.a()     // Catch: java.lang.AssertionError -> L48
            Q6.t r2 = r7.u(r1)     // Catch: java.lang.AssertionError -> L48
            int r3 = r2.f4493c     // Catch: java.lang.AssertionError -> L48
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch: java.lang.AssertionError -> L48
            long r8 = java.lang.Math.min(r8, r3)     // Catch: java.lang.AssertionError -> L48
            int r8 = (int) r8     // Catch: java.lang.AssertionError -> L48
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.AssertionError -> L48
            byte[] r9 = r2.f4491a     // Catch: java.lang.AssertionError -> L48
            int r3 = r2.f4493c     // Catch: java.lang.AssertionError -> L48
            int r8 = r0.read(r9, r3, r8)     // Catch: java.lang.AssertionError -> L48
            r9 = -1
            if (r8 != r9) goto L4d
            int r8 = r2.f4492b     // Catch: java.lang.AssertionError -> L48
            int r9 = r2.f4493c     // Catch: java.lang.AssertionError -> L48
            if (r8 != r9) goto L4a
            Q6.t r8 = r2.a()     // Catch: java.lang.AssertionError -> L48
            r7.f4461a = r8     // Catch: java.lang.AssertionError -> L48
            Q6.u.a(r2)     // Catch: java.lang.AssertionError -> L48
            goto L4a
        L48:
            r7 = move-exception
            goto L5a
        L4a:
            r3 = -1
            goto L59
        L4d:
            int r9 = r2.f4493c     // Catch: java.lang.AssertionError -> L48
            int r9 = r9 + r8
            r2.f4493c = r9     // Catch: java.lang.AssertionError -> L48
            long r2 = r7.f4462b     // Catch: java.lang.AssertionError -> L48
            long r8 = (long) r8     // Catch: java.lang.AssertionError -> L48
            long r2 = r2 + r8
            r7.f4462b = r2     // Catch: java.lang.AssertionError -> L48
            r3 = r8
        L59:
            return r3
        L5a:
            int r8 = Q6.n.f4479a
            java.lang.Throwable r8 = r7.getCause()
            r9 = 0
            if (r8 == 0) goto L74
            java.lang.String r8 = r7.getMessage()
            if (r8 == 0) goto L70
            java.lang.String r0 = "getsockname failed"
            boolean r8 = E6.m.N(r8, r0)
            goto L71
        L70:
            r8 = r9
        L71:
            if (r8 == 0) goto L74
            goto L75
        L74:
            r1 = r9
        L75:
            if (r1 == 0) goto L7d
            java.io.IOException r8 = new java.io.IOException
            r8.<init>(r7)
            throw r8
        L7d:
            throw r7
        L7e:
            java.lang.String r7 = "byteCount < 0: "
            java.lang.String r7 = io.flutter.plugins.pathprovider.b.g(r7, r8)
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L8e:
            Q6.d r2 = (Q6.d) r2
            Q6.x r0 = (Q6.x) r0
            long r7 = r2.i(r7, r8)     // Catch: java.lang.Throwable -> La3 java.io.IOException -> La5
            boolean r9 = r0.b()
            if (r9 != 0) goto L9d
            return r7
        L9d:
            r7 = 0
            java.io.IOException r7 = r0.c(r7)
            throw r7
        La3:
            r7 = move-exception
            goto Lb2
        La5:
            r7 = move-exception
            boolean r8 = r0.b()     // Catch: java.lang.Throwable -> La3
            if (r8 != 0) goto Lad
            goto Lb1
        Lad:
            java.io.IOException r7 = r0.c(r7)     // Catch: java.lang.Throwable -> La3
        Lb1:
            throw r7     // Catch: java.lang.Throwable -> La3
        Lb2:
            r0.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.d.i(Q6.e, long):long");
    }

    public final String toString() {
        switch (this.f4458a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f4460c) + ')';
            default:
                return "source(" + ((InputStream) this.f4459b) + ')';
        }
    }
}
