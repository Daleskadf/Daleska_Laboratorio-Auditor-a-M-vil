package H1;

import H0.J;
import K0.q;
import java.io.EOFException;
import m1.l;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f1941a;

    /* renamed from: b  reason: collision with root package name */
    public long f1942b;

    /* renamed from: c  reason: collision with root package name */
    public int f1943c;

    /* renamed from: d  reason: collision with root package name */
    public int f1944d;

    /* renamed from: e  reason: collision with root package name */
    public int f1945e;
    public final int[] f = new int[255];

    /* renamed from: g  reason: collision with root package name */
    public final q f1946g = new q(255);

    public final boolean a(l lVar, boolean z7) {
        boolean z8;
        boolean z9;
        this.f1941a = 0;
        this.f1942b = 0L;
        this.f1943c = 0;
        this.f1944d = 0;
        this.f1945e = 0;
        q qVar = this.f1946g;
        qVar.D(27);
        try {
            z8 = lVar.q(qVar.f2513a, 0, 27, z7);
        } catch (EOFException e7) {
            if (z7) {
                z8 = false;
            } else {
                throw e7;
            }
        }
        if (!z8 || qVar.w() != 1332176723) {
            return false;
        }
        if (qVar.u() != 0) {
            if (z7) {
                return false;
            }
            throw J.c("unsupported bit stream revision");
        }
        this.f1941a = qVar.u();
        this.f1942b = qVar.k();
        qVar.l();
        qVar.l();
        qVar.l();
        int u7 = qVar.u();
        this.f1943c = u7;
        this.f1944d = u7 + 27;
        qVar.D(u7);
        try {
            z9 = lVar.q(qVar.f2513a, 0, this.f1943c, z7);
        } catch (EOFException e8) {
            if (z7) {
                z9 = false;
            } else {
                throw e8;
            }
        }
        if (!z9) {
            return false;
        }
        for (int i7 = 0; i7 < this.f1943c; i7++) {
            int u8 = qVar.u();
            this.f[i7] = u8;
            this.f1945e += u8;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r10.f13974d >= r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        if (r10.r(1) == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(m1.l r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f13974d
            long r2 = r10.t()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            K0.a.e(r0)
            K0.q r0 = r9.f1946g
            r3 = 4
            r0.D(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f13974d
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f2513a
            boolean r5 = r10.q(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.G(r1)
            long r4 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f = r1
            return r2
        L42:
            r10.m(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f13974d
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.r(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.f.b(m1.l, long):boolean");
    }
}
