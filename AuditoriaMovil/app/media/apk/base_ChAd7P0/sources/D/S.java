package D;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final /* synthetic */ class S implements F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f659a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f660b;

    public /* synthetic */ S(Object obj, int i7) {
        this.f659a = i7;
        this.f660b = obj;
    }

    @Override // D.F
    public final void a(G g3) {
        F f;
        switch (this.f659a) {
            case 0:
                U u7 = (U) ((WeakReference) ((T) this.f660b).f662e).get();
                if (u7 != null) {
                    u7.f663o0.execute(new C.b(u7, 1));
                    return;
                }
                return;
            default:
                n0 n0Var = (n0) this.f660b;
                synchronized (n0Var.f754c) {
                    try {
                        int i7 = n0Var.f752a - 1;
                        n0Var.f752a = i7;
                        if (n0Var.f753b && i7 == 0) {
                            n0Var.close();
                        }
                        f = (F) n0Var.f;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (f != null) {
                    f.a(g3);
                    return;
                }
                return;
        }
    }
}
