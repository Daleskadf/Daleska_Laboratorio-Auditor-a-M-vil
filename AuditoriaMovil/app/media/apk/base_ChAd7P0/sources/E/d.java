package E;

import D.n0;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f917a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n0 f918b;

    public /* synthetic */ d(n0 n0Var, int i7) {
        this.f917a = i7;
        this.f918b = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f917a) {
            case 0:
                this.f918b.f();
                return;
            case 1:
                n0 n0Var = this.f918b;
                if (n0Var != null) {
                    n0Var.f();
                    return;
                }
                return;
            default:
                this.f918b.f();
                return;
        }
    }
}
