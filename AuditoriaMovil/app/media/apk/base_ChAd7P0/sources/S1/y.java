package S1;

import H0.C0140u;
import m1.C1431e;
import m1.C1432f;
import m1.InterfaceC1433g;
import org.apache.tika.fork.ForkServer;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final C1431e f5205a;

    /* renamed from: b  reason: collision with root package name */
    public final m1.i f5206b;

    /* renamed from: c  reason: collision with root package name */
    public C1432f f5207c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5208d;

    public y(InterfaceC1433g interfaceC1433g, m1.i iVar, long j, long j8, long j9, long j10, long j11, int i7) {
        this.f5206b = iVar;
        this.f5208d = i7;
        this.f5205a = new C1431e(interfaceC1433g, j, j8, j9, j10, j11);
    }

    public static int a(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & ForkServer.ERROR) | ((bArr[i7] & ForkServer.ERROR) << 24) | ((bArr[i7 + 1] & ForkServer.ERROR) << 16) | ((bArr[i7 + 2] & ForkServer.ERROR) << 8);
    }

    public static int c(m1.l lVar, long j, C0140u c0140u) {
        if (j == lVar.f13974d) {
            return 0;
        }
        c0140u.f1902a = j;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(m1.l r28, H0.C0140u r29) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.y.b(m1.l, H0.u):int");
    }

    public final void d(long j) {
        C1432f c1432f = this.f5207c;
        if (c1432f != null && c1432f.f13948a == j) {
            return;
        }
        C1431e c1431e = this.f5205a;
        this.f5207c = new C1432f(j, c1431e.f13943a.a(j), c1431e.f13945c, c1431e.f13946d, c1431e.f13947e, c1431e.f);
    }
}
