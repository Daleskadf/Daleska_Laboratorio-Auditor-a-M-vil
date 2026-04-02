package g1;

import a1.k;
import android.content.Context;
import android.os.Build;
import h1.l;
import j1.p;
/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: e  reason: collision with root package name */
    public static final String f13555e = k.f("NetworkMeteredCtrlr");

    public e(Context context, m1.a aVar) {
        super(l.c(context, aVar).d());
    }

    @Override // g1.c
    public boolean b(p pVar) {
        if (pVar.f14592j.b() == a1.l.METERED) {
            return true;
        }
        return false;
    }

    @Override // g1.c
    /* renamed from: i */
    public boolean c(f1.b bVar) {
        if (Build.VERSION.SDK_INT < 26) {
            k.c().a(f13555e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.a();
        } else if (!bVar.a() || !bVar.b()) {
            return true;
        } else {
            return false;
        }
    }
}
