package w;

import D.C0057g;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.o0;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import t4.RunnableC1822b;
/* renamed from: w.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1931p implements H.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1903M f16255b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1936u f16256c;

    public /* synthetic */ C1931p(C1936u c1936u, C1903M c1903m, int i7) {
        this.f16254a = i7;
        this.f16256c = c1936u;
        this.f16255b = c1903m;
    }

    @Override // H.c
    public final void onSuccess(Object obj) {
        switch (this.f16254a) {
            case 0:
                Void r32 = (Void) obj;
                this.f16256c.f16282i0.remove(this.f16255b);
                int ordinal = this.f16256c.f16277e.ordinal();
                if (ordinal != 1 && ordinal != 4) {
                    if (ordinal == 5 || (ordinal == 6 && this.f16256c.f16280g0 != 0)) {
                        this.f16256c.t("Camera reopen required. Checking if the current camera can be closed safely.", null);
                    } else {
                        return;
                    }
                }
                if (this.f16256c.f16282i0.isEmpty()) {
                    C1936u c1936u = this.f16256c;
                    if (c1936u.f16279f0 != null) {
                        c1936u.t("closing camera", null);
                        this.f16256c.f16279f0.close();
                        this.f16256c.f16279f0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                Void r33 = (Void) obj;
                C1936u c1936u2 = this.f16256c;
                if (c1936u2.f16285l0.f223a == 2 && c1936u2.f16277e == EnumC1934s.OPENED) {
                    this.f16256c.E(EnumC1934s.CONFIGURED);
                    return;
                }
                return;
        }
    }

    @Override // H.c
    public final void z(Throwable th) {
        switch (this.f16254a) {
            case 0:
                return;
            default:
                o0 o0Var = null;
                if (th instanceof androidx.camera.core.impl.I) {
                    C1936u c1936u = this.f16256c;
                    androidx.camera.core.impl.J j = ((androidx.camera.core.impl.I) th).f7543a;
                    Iterator it = c1936u.f16273a.C().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            o0 o0Var2 = (o0) it.next();
                            if (o0Var2.b().contains(j)) {
                                o0Var = o0Var2;
                            }
                        }
                    }
                    if (o0Var != null) {
                        C1936u c1936u2 = this.f16256c;
                        c1936u2.getClass();
                        G.e C7 = j3.f.C();
                        l0 l0Var = o0Var.f;
                        if (l0Var != null) {
                            c1936u2.t("Posting surface closed", new Throwable());
                            C7.execute(new RunnableC1822b(13, l0Var, o0Var));
                            return;
                        }
                        return;
                    }
                    return;
                } else if (th instanceof CancellationException) {
                    this.f16256c.t("Unable to configure camera cancelled", null);
                    return;
                } else {
                    EnumC1934s enumC1934s = this.f16256c.f16277e;
                    EnumC1934s enumC1934s2 = EnumC1934s.OPENED;
                    if (enumC1934s == enumC1934s2) {
                        this.f16256c.F(enumC1934s2, new C0057g(4, th), true);
                    }
                    org.slf4j.helpers.i.u("Camera2CameraImpl", "Unable to configure camera " + this.f16256c, th);
                    C1936u c1936u3 = this.f16256c;
                    if (c1936u3.f16281h0 == this.f16255b) {
                        c1936u3.D();
                        return;
                    }
                    return;
                }
        }
    }

    private final void a(Throwable th) {
    }
}
