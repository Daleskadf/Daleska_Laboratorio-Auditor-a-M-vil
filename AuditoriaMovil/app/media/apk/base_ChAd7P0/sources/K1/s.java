package k1;

import K0.x;
import O0.C0260w;
import O0.H;
import Q0.C0276m;
import e1.C0960z;
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13688a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0276m f13689b;

    public /* synthetic */ s(C0276m c0276m, int i7, long j) {
        this.f13688a = 1;
        this.f13689b = c0276m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0276m c0276m = this.f13689b;
        int i7 = this.f13688a;
        c0276m.getClass();
        switch (i7) {
            case 0:
                int i8 = x.f2529a;
                P0.d dVar = c0276m.f4297c.f3482a.f3529m0;
                dVar.J(dVar.I(), 1016, new P0.b(12));
                return;
            case 1:
                int i9 = x.f2529a;
                P0.d dVar2 = c0276m.f4297c.f3482a.f3529m0;
                dVar2.J(dVar2.G((C0960z) dVar2.f3909d.f), 1018, new C0260w(28));
                return;
            case 2:
                int i10 = x.f2529a;
                P0.d dVar3 = c0276m.f4297c.f3482a.f3529m0;
                dVar3.J(dVar3.G((C0960z) dVar3.f3909d.f), 1021, new P0.b(2));
                return;
            case 3:
                int i11 = x.f2529a;
                P0.d dVar4 = c0276m.f4297c.f3482a.f3529m0;
                dVar4.J(dVar4.I(), 1030, new C0260w(18));
                return;
            case 4:
                int i12 = x.f2529a;
                H h8 = c0276m.f4297c.f3482a;
                h8.getClass();
                P0.d dVar5 = h8.f3529m0;
                dVar5.J(dVar5.I(), 1015, new P0.b(8));
                return;
            default:
                int i13 = x.f2529a;
                P0.d dVar6 = c0276m.f4297c.f3482a.f3529m0;
                dVar6.J(dVar6.I(), 1019, new C0260w(27));
                return;
        }
    }

    public /* synthetic */ s(C0276m c0276m, long j, int i7) {
        this.f13688a = 2;
        this.f13689b = c0276m;
    }

    public /* synthetic */ s(C0276m c0276m, Object obj, int i7) {
        this.f13688a = i7;
        this.f13689b = c0276m;
    }

    public /* synthetic */ s(C0276m c0276m, String str, long j, long j8) {
        this.f13688a = 0;
        this.f13689b = c0276m;
    }
}
