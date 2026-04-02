package I;

import D.C0062l;
import D.C0063m;
import M.n;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import g0.InterfaceC1003a;
/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1003a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2084a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2085b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2086c;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f2084a = i7;
        this.f2085b = obj;
        this.f2086c = obj2;
    }

    @Override // g0.InterfaceC1003a
    public final void accept(Object obj) {
        switch (this.f2084a) {
            case 0:
                C0063m c0063m = (C0063m) obj;
                ((Surface) this.f2085b).release();
                ((SurfaceTexture) this.f2086c).release();
                return;
            case 1:
                C0062l c0062l = (C0062l) obj;
                M.e eVar = (M.e) this.f2085b;
                eVar.getClass();
                n nVar = (n) this.f2086c;
                nVar.close();
                Surface surface = (Surface) eVar.f3065Y.remove(nVar);
                if (surface != null) {
                    M.g gVar = eVar.f3067a;
                    O.i.d(gVar.f3076a, true);
                    O.i.c(gVar.f3078c);
                    gVar.i(surface, true);
                    return;
                }
                return;
            case 2:
                C0062l c0062l2 = (C0062l) obj;
                N.e eVar2 = (N.e) this.f2085b;
                eVar2.getClass();
                n nVar2 = (n) this.f2086c;
                nVar2.close();
                Surface surface2 = (Surface) eVar2.f3323Y.remove(nVar2);
                if (surface2 != null) {
                    N.c cVar = eVar2.f3325a;
                    O.i.d(cVar.f3076a, true);
                    O.i.c(cVar.f3078c);
                    cVar.i(surface2, true);
                    return;
                }
                return;
            default:
                Configuration configuration = (Configuration) obj;
                o2.h this$0 = (o2.h) this.f2085b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                Activity activity = (Activity) this.f2086c;
                kotlin.jvm.internal.j.e(activity, "$activity");
                R1.j jVar = this$0.f14563e;
                if (jVar != null) {
                    jVar.K0(activity, this$0.e(activity));
                    return;
                }
                return;
        }
    }
}
