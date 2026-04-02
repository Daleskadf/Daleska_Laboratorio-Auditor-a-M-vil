package c6;

import java.util.LinkedHashSet;
/* renamed from: c6.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0647H implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8468a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ U0 f8469b;

    public /* synthetic */ RunnableC0647H(U0 u02, int i7) {
        this.f8468a = i7;
        this.f8469b = u02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8468a) {
            case 0:
                this.f8469b.f.b();
                return;
            default:
                U0 u02 = this.f8469b;
                LinkedHashSet linkedHashSet = u02.f8603n.f8607g.f8677E;
                if (linkedHashSet != null) {
                    linkedHashSet.remove(u02);
                    V0 v02 = u02.f8603n;
                    if (v02.f8607g.f8677E.isEmpty()) {
                        Z0 z02 = v02.f8607g;
                        z02.f8702d0.u(z02.f8678F, false);
                        Z0 z03 = v02.f8607g;
                        z03.f8677E = null;
                        if (z03.f8682J.get()) {
                            v02.f8607g.f8681I.R(Z0.f8668j0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
