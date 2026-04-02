package N;

import F3.o;
import H4.W;
import M.m;
import a.AbstractC0412a;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.InterfaceC0521x;
import androidx.camera.core.impl.o0;
import androidx.camera.core.impl.y0;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.g0;
import com.google.firebase.firestore.j0;
import com.google.firebase.firestore.n0;
import io.flutter.plugins.firebase.auth.C1154q;
import io.flutter.plugins.firebase.firestore.C1162g;
import io.flutter.plugins.firebase.firestore.q;
import io.flutter.plugins.firebase.firestore.r;
import io.flutter.plugins.firebase.firestore.y;
import io.flutter.plugins.firebase.firestore.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w.C1936u;
import w.EnumC1934s;
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f3331X;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3332a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3333b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3334c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3335d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3336e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f3332a = i7;
        this.f3333b = obj;
        this.f3334c = obj2;
        this.f3335d = obj3;
        this.f3336e = obj4;
        this.f = obj5;
        this.f3331X = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3332a) {
            case 0:
                ((o) this.f3333b).h((InterfaceC0521x) this.f3334c, (InterfaceC0521x) this.f3335d, (m) this.f3336e, (m) this.f, (Map.Entry) this.f3331X);
                return;
            case 1:
                y yVar = (y) this.f3333b;
                q qVar = (q) this.f3334c;
                String str = (String) this.f3335d;
                Boolean bool = (Boolean) this.f3336e;
                z zVar = (z) this.f;
                C1154q c1154q = (C1154q) this.f3331X;
                HashMap hashMap = C1162g.f11922Y;
                try {
                    n0 O7 = AbstractC0412a.O(yVar.f11963a);
                    g0 P7 = AbstractC0412a.P(C1162g.c(qVar), str, bool.booleanValue(), zVar);
                    if (P7 == null) {
                        c1154q.b(new r("invalid_query", "An error occurred while parsing query arguments, see native logs for more information. Please report this issue.", null));
                    } else {
                        c1154q.d(AbstractC0412a.b0((j0) Tasks.await(P7.c(O7)), AbstractC0412a.N(yVar.f11964b)));
                    }
                    return;
                } catch (Exception e7) {
                    W.H(c1154q, e7);
                    return;
                }
            default:
                C1936u c1936u = (C1936u) this.f3333b;
                String str2 = (String) this.f3334c;
                o0 o0Var = (o0) this.f3335d;
                y0 y0Var = (y0) this.f3336e;
                C0505g c0505g = (C0505g) this.f;
                List list = (List) this.f3331X;
                c1936u.getClass();
                c1936u.t("Use case " + str2 + " RESET", null);
                c1936u.f16273a.Y(str2, o0Var, y0Var, c0505g, list);
                c1936u.p();
                c1936u.D();
                c1936u.K();
                if (c1936u.f16277e == EnumC1934s.OPENED) {
                    c1936u.B();
                    return;
                }
                return;
        }
    }
}
