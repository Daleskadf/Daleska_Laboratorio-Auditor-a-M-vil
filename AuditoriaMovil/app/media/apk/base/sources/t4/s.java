package t4;

import O0.d0;
import a6.o0;
import androidx.camera.core.impl.X;
import java.util.Locale;
import p4.P;
import p4.Y;
/* loaded from: classes.dex */
public final class s implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0 f15847a;

    public s(d0 d0Var) {
        this.f15847a = d0Var;
    }

    @Override // t4.v
    public final void a() {
        d0 d0Var = this.f15847a;
        for (Y y2 : d0Var.f3686a.values()) {
            d0Var.m(y2);
        }
    }

    @Override // t4.v
    public final void b(o0 o0Var) {
        boolean z7;
        d0 d0Var = this.f15847a;
        d0Var.getClass();
        boolean z8 = true;
        if (o0Var.e()) {
            m5.d.i("Watch stream was stopped gracefully while still needed.", !d0Var.n(), new Object[0]);
        }
        d0Var.f3694k = null;
        boolean n7 = d0Var.n();
        X x7 = (X) d0Var.f3692h;
        if (n7) {
            if (((n4.z) x7.f7591c) == n4.z.ONLINE) {
                x7.c(n4.z.UNKNOWN);
                if (x7.f7589a == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                m5.d.i("watchStreamFailures must be 0", z7, new Object[0]);
                if (((P) x7.f7592d) != null) {
                    z8 = false;
                }
                m5.d.i("onlineStateTimer must be null", z8, new Object[0]);
            } else {
                int i7 = x7.f7589a + 1;
                x7.f7589a = i7;
                if (i7 >= 1) {
                    P p7 = (P) x7.f7592d;
                    if (p7 != null) {
                        p7.b();
                        x7.f7592d = null;
                    }
                    Locale locale = Locale.ENGLISH;
                    x7.b("Connection failed 1 times. Most recent error: " + o0Var);
                    x7.c(n4.z.OFFLINE);
                }
            }
            d0Var.p();
            return;
        }
        x7.d(n4.z.UNKNOWN);
    }
}
