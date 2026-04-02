package V0;

import B5.S;
import K0.x;
import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.firestore.Z;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f5792a;

    public a(c cVar) {
        this.f5792a = cVar;
    }

    @Override // V0.q
    public final boolean a(Uri uri, S s7, boolean z7) {
        HashMap hashMap;
        b bVar;
        c cVar = this.f5792a;
        if (cVar.f5815g0 == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            l lVar = cVar.f5813e0;
            int i7 = x.f2529a;
            List list = lVar.f5867e;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                int size = list.size();
                hashMap = cVar.f5811d;
                if (i8 >= size) {
                    break;
                }
                b bVar2 = (b) hashMap.get(((k) list.get(i8)).f5860a);
                if (bVar2 != null && elapsedRealtime < bVar2.f5794Y) {
                    i9++;
                }
                i8++;
            }
            i1.h hVar = new i1.h(1, 0, cVar.f5813e0.f5867e.size(), i9);
            cVar.f5810c.getClass();
            T1.e u7 = Z.u(hVar, s7);
            if (u7 != null && u7.f5318a == 2 && (bVar = (b) hashMap.get(uri)) != null) {
                b.a(bVar, u7.f5319b);
            }
        }
        return false;
    }

    @Override // V0.q
    public final void b() {
        this.f5792a.f5812e.remove(this);
    }
}
