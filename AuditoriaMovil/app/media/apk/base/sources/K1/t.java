package k1;

import K0.x;
import O0.C0260w;
import O0.H;
import Q0.C0276m;
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0276m f13690a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13691b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f13692c;

    public /* synthetic */ t(C0276m c0276m, Object obj, long j) {
        this.f13690a = c0276m;
        this.f13691b = obj;
        this.f13692c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0276m c0276m = this.f13690a;
        c0276m.getClass();
        int i7 = x.f2529a;
        H h8 = c0276m.f4297c.f3482a;
        P0.d dVar = h8.f3529m0;
        P0.a I7 = dVar.I();
        long j = this.f13692c;
        Object obj = this.f13691b;
        dVar.J(I7, 26, new P0.c(I7, obj, j));
        if (h8.f3495I0 == obj) {
            h8.f3523g0.e(26, new C0260w(1));
        }
    }
}
