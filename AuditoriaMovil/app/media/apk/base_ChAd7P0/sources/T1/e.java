package T1;

import K0.q;
import m1.l;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f5318a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5319b;

    public /* synthetic */ e(int i7, long j, boolean z7) {
        this.f5318a = i7;
        this.f5319b = j;
    }

    public static e b(l lVar, q qVar) {
        lVar.q(qVar.f2513a, 0, 8, false);
        qVar.G(0);
        return new e(qVar.h(), qVar.l(), false);
    }

    public boolean a() {
        int i7 = this.f5318a;
        if (i7 == 0 || i7 == 1) {
            return true;
        }
        return false;
    }

    public e(int i7, long j) {
        K0.a.e(j >= 0);
        this.f5318a = i7;
        this.f5319b = j;
    }
}
