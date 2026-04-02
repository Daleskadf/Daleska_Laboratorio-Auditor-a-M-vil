package n4;

import android.content.Context;
import b3.C0585f;
import com.google.firebase.firestore.X;
import com.google.firebase.firestore.Y;
import com.google.firebase.firestore.b0;
import p.C1608t;
import p4.C1675e;
import p4.C1683m;
import p4.C1688s;
import p4.W;
/* loaded from: classes.dex */
public final class G extends y {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, D5.b, p4.W] */
    @Override // n4.y
    public final W a(R1.j jVar) {
        H4.W w2 = this.f14376c;
        m5.d.j(w2, "persistence not initialized yet", new Object[0]);
        C1688s c1688s = ((p4.Q) w2).f15217l.f15199d;
        C1683m d7 = d();
        c1688s.getClass();
        ?? obj = new Object();
        obj.f871e = c1688s;
        obj.f867a = false;
        obj.f868b = (u4.e) jVar.f4683c;
        obj.f869c = d7;
        return obj;
    }

    @Override // n4.y
    public final C1675e b(R1.j jVar) {
        H4.W w2 = this.f14376c;
        m5.d.j(w2, "persistence not initialized yet", new Object[0]);
        return new C1675e(w2, (u4.e) jVar.f4683c, d());
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, H0.u] */
    @Override // n4.y
    public final H4.W c(R1.j jVar) {
        long j;
        C1608t c1608t = (C1608t) this.f14375b.f1179c;
        m5.d.j(c1608t, "remoteSerializer not initialized yet", new Object[0]);
        C0585f c0585f = new C0585f(c1608t, 15);
        com.google.firebase.firestore.L l8 = this.f14374a;
        X x7 = l8.f9773e;
        if (x7 != null) {
            if (x7 instanceof b0) {
                j = ((b0) x7).f9799a;
            } else {
                Y y2 = (Y) x7;
                j = -1;
            }
        } else {
            j = l8.f9772d;
        }
        ?? obj = new Object();
        obj.f1902a = j;
        K5.d dVar = (K5.d) jVar.f4684d;
        return new p4.Q((Context) jVar.f4682b, (String) dVar.f2700d, (q4.f) dVar.f2699c, c0585f, obj);
    }
}
