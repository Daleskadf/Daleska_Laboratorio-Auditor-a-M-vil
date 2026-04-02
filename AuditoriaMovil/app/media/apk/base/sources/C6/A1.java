package c6;

import a6.AbstractC0471A;
import a6.C0473b;
import i6.C1124k;
import i6.C1130q;
import i6.C1132s;
/* loaded from: classes.dex */
public final class A1 extends a6.O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8419a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8420b;

    public A1(a6.M m7) {
        G.i.j(m7, "result");
        this.f8420b = m7;
    }

    @Override // a6.O
    public final a6.M a(D1 d12) {
        switch (this.f8419a) {
            case 0:
                return (a6.M) this.f8420b;
            default:
                a6.M a7 = ((a6.O) this.f8420b).a(d12);
                AbstractC0471A abstractC0471A = a7.f7092a;
                if (abstractC0471A != null) {
                    C0473b c8 = abstractC0471A.c();
                    return a6.M.b(abstractC0471A, new C1130q((C1124k) c8.f7116a.get(C1132s.f11559n), a7.f7093b));
                }
                return a7;
        }
    }

    public String toString() {
        switch (this.f8419a) {
            case 0:
                K5.d dVar = new K5.d(A1.class.getSimpleName());
                dVar.a((a6.M) this.f8420b, "result");
                return dVar.toString();
            default:
                return super.toString();
        }
    }

    public A1(a6.O o7) {
        this.f8420b = o7;
    }
}
