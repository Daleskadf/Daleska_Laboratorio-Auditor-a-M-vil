package T4;

import a.AbstractC0412a;
import a6.t0;
import io.flutter.plugins.googlemaps.A;
import io.flutter.plugins.googlemaps.C1173f;
import io.flutter.plugins.googlemaps.C1186t;
import io.flutter.plugins.googlemaps.X;
import java.util.ArrayList;
import java.util.Collections;
import s3.C1786n;
import t2.i;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q3.c, q3.d, q3.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f5336a;

    public /* synthetic */ a(h hVar) {
        this.f5336a = hVar;
    }

    @Override // q3.b
    public void W(C1786n c1786n) {
        this.f5336a.getClass();
    }

    @Override // q3.c
    public void a(C1786n c1786n) {
        this.f5336a.getClass();
    }

    @Override // q3.d
    public boolean e(C1786n c1786n) {
        h hVar = this.f5336a;
        C1173f c1173f = hVar.f5380p;
        if (c1173f != null) {
            R4.a aVar = (R4.a) hVar.f5377m.f3247b.get(c1786n);
            if (aVar.d() > 0) {
                X e7 = AbstractC0412a.e(((C1186t[]) aVar.c().toArray(new C1186t[0]))[0].f12276b, aVar);
                i iVar = new i(18);
                StringBuilder sb = new StringBuilder("dev.flutter.pigeon.google_maps_flutter_android.MapsCallbackApi.onClusterTap");
                t0 t0Var = c1173f.f12131c;
                sb.append((String) t0Var.f7210c);
                String sb2 = sb.toString();
                new E.e((L5.f) t0Var.f7209b, sb2, A.f12030d, null, 4).f0(new ArrayList(Collections.singletonList(e7)), new K4.e(iVar, sb2, 9));
            }
        }
        return false;
    }
}
