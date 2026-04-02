package J1;

import A3.C0020s;
import A3.K;
import A3.c0;
import K0.x;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0020s f2358c;

    /* renamed from: a  reason: collision with root package name */
    public final K f2359a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f2360b;

    static {
        c0 c0Var = c0.f132a;
        A.i iVar = new A.i(14);
        c0Var.getClass();
        f2358c = new C0020s(iVar, c0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(A3.e0 r20) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.b.<init>(A3.e0):void");
    }

    @Override // J1.d
    public final List M(long j) {
        int f = x.f(this.f2360b, j, false);
        if (f == -1) {
            return K.s();
        }
        return (K) this.f2359a.get(f);
    }

    @Override // J1.d
    public final int e0() {
        return this.f2359a.size();
    }

    @Override // J1.d
    public final int g(long j) {
        int b5 = x.b(this.f2360b, j, false);
        if (b5 >= this.f2359a.size()) {
            return -1;
        }
        return b5;
    }

    @Override // J1.d
    public final long x(int i7) {
        boolean z7;
        if (i7 < this.f2359a.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        return this.f2360b[i7];
    }
}
