package e1;

import H0.C0122b;
/* renamed from: e1.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955u extends H0.V {

    /* renamed from: b  reason: collision with root package name */
    public final H0.C f10843b;

    public C0955u(H0.C c8) {
        this.f10843b = c8;
    }

    @Override // H0.V
    public final int b(Object obj) {
        if (obj == C0954t.f10840e) {
            return 0;
        }
        return -1;
    }

    @Override // H0.V
    public final H0.T f(int i7, H0.T t7, boolean z7) {
        Integer num;
        Object obj = null;
        if (z7) {
            num = 0;
        } else {
            num = null;
        }
        if (z7) {
            obj = C0954t.f10840e;
        }
        t7.h(num, obj, 0, -9223372036854775807L, 0L, C0122b.f1785c, true);
        return t7;
    }

    @Override // H0.V
    public final int h() {
        return 1;
    }

    @Override // H0.V
    public final Object l(int i7) {
        return C0954t.f10840e;
    }

    @Override // H0.V
    public final H0.U m(int i7, H0.U u7, long j) {
        Object obj = H0.U.f1722q;
        u7.b(this.f10843b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0L);
        u7.f1732k = true;
        return u7;
    }

    @Override // H0.V
    public final int o() {
        return 1;
    }
}
