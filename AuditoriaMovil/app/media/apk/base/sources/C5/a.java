package C5;

import android.util.SparseArray;
import io.flutter.plugin.platform.o;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f552a;

    public a(c cVar) {
        this.f552a = cVar;
    }

    @Override // C5.b
    public final void b() {
        c cVar = this.f552a;
        Iterator it = cVar.f569s.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        while (true) {
            o oVar = cVar.f568r;
            SparseArray sparseArray = oVar.f11724k;
            if (sparseArray.size() > 0) {
                oVar.f11735v.e(sparseArray.keyAt(0));
            } else {
                cVar.f561k.f2738d = null;
                return;
            }
        }
    }

    @Override // C5.b
    public final void a() {
    }
}
