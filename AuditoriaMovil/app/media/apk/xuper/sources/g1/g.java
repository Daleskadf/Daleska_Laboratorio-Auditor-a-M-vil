package g1;

import android.content.Context;
import android.os.Build;
import h1.l;
import j1.p;
/* loaded from: classes.dex */
public class g extends c {
    public g(Context context, m1.a aVar) {
        super(l.c(context, aVar).d());
    }

    @Override // g1.c
    public boolean b(p pVar) {
        if (pVar.f14592j.b() != a1.l.UNMETERED && (Build.VERSION.SDK_INT < 30 || pVar.f14592j.b() != a1.l.TEMPORARILY_UNMETERED)) {
            return false;
        }
        return true;
    }

    @Override // g1.c
    /* renamed from: i */
    public boolean c(f1.b bVar) {
        if (bVar.a() && !bVar.b()) {
            return false;
        }
        return true;
    }
}
