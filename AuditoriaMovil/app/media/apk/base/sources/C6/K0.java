package c6;

import a6.EnumC0477f;
import a6.EnumC0486o;
/* loaded from: classes.dex */
public final class K0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8487a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Z0 f8488b;

    public /* synthetic */ K0(Z0 z02, int i7) {
        this.f8487a = i7;
        this.f8488b = z02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8487a) {
            case 0:
                this.f8488b.B(true);
                return;
            case 1:
                Z0 z02 = this.f8488b;
                if (!z02.f8682J.get() && z02.f8673A != null) {
                    z02.B(false);
                    Z0.y(z02);
                    return;
                }
                return;
            case 2:
                this.f8488b.C();
                if (this.f8488b.f8674B != null) {
                    this.f8488b.f8674B.getClass();
                }
                Q0 q0 = this.f8488b.f8673A;
                if (q0 != null) {
                    ((a6.Q) q0.f8567d.f921c).e();
                    return;
                }
                return;
            case 3:
                Z0 z03 = this.f8488b;
                z03.f8690R.l(EnumC0477f.INFO, "Entering SHUTDOWN state");
                z03.f8719u.b(EnumC0486o.SHUTDOWN);
                return;
            case 4:
                Z0 z04 = this.f8488b;
                if (!z04.f8683K) {
                    z04.f8683K = true;
                    Z0.z(z04);
                    return;
                }
                return;
            default:
                Z0 z05 = this.f8488b;
                if (z05.f8673A != null) {
                    Z0.y(z05);
                    return;
                }
                return;
        }
    }
}
