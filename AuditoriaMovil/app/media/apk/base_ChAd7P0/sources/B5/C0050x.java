package B5;

import D.C0063m;
import D.C0064n;
import android.view.Surface;
import g0.InterfaceC1003a;
import h3.AbstractC1079a;
import java.util.Map;
/* renamed from: B5.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0050x implements InterfaceC1003a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f387a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f388b;

    public /* synthetic */ C0050x(Object obj, int i7) {
        this.f387a = i7;
        this.f388b = obj;
    }

    @Override // g0.InterfaceC1003a
    public final void accept(Object obj) {
        switch (this.f387a) {
            case 0:
                ((B) this.f388b).setWindowInfoListenerDisplayFeatures((l2.k) obj);
                return;
            case 1:
                E.b bVar = (E.b) obj;
                ((A.f) this.f388b).getClass();
                AbstractC1079a.e();
                return;
            case 2:
                C0064n c0064n = (C0064n) obj;
                for (Map.Entry entry : ((Map) this.f388b).entrySet()) {
                    int i7 = c0064n.f747b - ((O.b) entry.getKey()).f;
                    if (((O.b) entry.getKey()).f3458g) {
                        i7 = -i7;
                    }
                    int f = F.g.f(i7);
                    M.m mVar = (M.m) entry.getValue();
                    mVar.getClass();
                    AbstractC1079a.s(new M.j(mVar, f, -1));
                }
                return;
            case 3:
                ((H6.o) ((H6.p) this.f388b)).e((l2.k) obj);
                return;
            default:
                Surface surface = (Surface) this.f388b;
                kotlin.jvm.internal.j.e(surface, "$surface");
                surface.release();
                ((C0063m) obj).getClass();
                return;
        }
    }
}
