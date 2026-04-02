package G1;

import a6.t0;
import i1.C1100a;
import m1.InterfaceC1426A;
/* loaded from: classes.dex */
public final class e implements H1.g {

    /* renamed from: a  reason: collision with root package name */
    public long f1363a;

    /* renamed from: b  reason: collision with root package name */
    public long f1364b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1365c;

    /* renamed from: d  reason: collision with root package name */
    public Object f1366d;

    public e(int i7, long j) {
        K0.a.j(((C1100a) this.f1365c) == null);
        this.f1363a = j;
        this.f1364b = j + i7;
    }

    @Override // H1.g
    public long a(m1.l lVar) {
        long j = this.f1364b;
        if (j < 0) {
            return -1L;
        }
        long j8 = -(j + 2);
        this.f1364b = -1L;
        return j8;
    }

    @Override // H1.g
    public InterfaceC1426A b() {
        boolean z7;
        if (this.f1363a != -1) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        return new m1.s((m1.t) this.f1365c, this.f1363a, 0);
    }

    @Override // H1.g
    public void f(long j) {
        long[] jArr = (long[]) ((t0) this.f1366d).f7209b;
        this.f1364b = jArr[K0.x.f(jArr, j, true)];
    }

    public e(String str, byte[] bArr, long j, long j8) {
        this.f1365c = str;
        this.f1366d = bArr;
        this.f1363a = j;
        this.f1364b = j8;
    }
}
