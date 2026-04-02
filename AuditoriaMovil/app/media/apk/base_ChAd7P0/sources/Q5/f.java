package Q5;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.G;
import com.google.firebase.firestore.InterfaceC0816s;
import com.google.firebase.firestore.S;
import io.flutter.plugins.firebase.auth.C1138a;
import io.flutter.plugins.firebase.auth.P;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import n4.C1516b;
import n4.C1533t;
import u4.k;
/* loaded from: classes.dex */
public final class f implements L5.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4432a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4433b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4434c;

    public /* synthetic */ f(FirebaseAuth firebaseAuth, int i7) {
        this.f4432a = i7;
        this.f4433b = firebaseAuth;
    }

    @Override // L5.i
    public final void a(Object obj, L5.h hVar) {
        G g3;
        switch (this.f4432a) {
            case 0:
                final C.b bVar = new C.b(hVar, 18);
                C1516b c1516b = new C1516b(k.f16004a, new InterfaceC0816s() { // from class: com.google.firebase.firestore.F
                    @Override // com.google.firebase.firestore.InterfaceC0816s
                    public final void a(Object obj2, J j) {
                        boolean z7;
                        Void r22 = (Void) obj2;
                        if (j == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        m5.d.i("snapshots-in-sync listeners should never get errors.", z7, new Object[0]);
                        C.b.this.run();
                    }
                });
                R1.j jVar = ((FirebaseFirestore) this.f4434c).f9754k;
                synchronized (jVar) {
                    jVar.n0();
                    C1533t c1533t = (C1533t) jVar.f4683c;
                    c1533t.e();
                    c1533t.f14363d.a(new S(22, c1533t, c1516b));
                    g3 = new G(c1516b, c1533t);
                }
                this.f4433b = g3;
                return;
            case 1:
                ArrayList arrayList = (ArrayList) this.f4433b;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hVar.c((Map) it.next());
                }
                arrayList.clear();
                this.f4434c = hVar;
                return;
            case 2:
                HashMap hashMap = new HashMap();
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f4433b;
                U3.h hVar2 = firebaseAuth.f9703a;
                hVar2.a();
                hashMap.put("appName", hVar2.f5750b);
                C1138a c1138a = new C1138a(new AtomicBoolean(true), hashMap, hVar);
                this.f4434c = c1138a;
                firebaseAuth.f9706d.add(c1138a);
                firebaseAuth.f9701A.execute(new H.h(firebaseAuth, c1138a, 9, false));
                return;
            default:
                HashMap hashMap2 = new HashMap();
                FirebaseAuth firebaseAuth2 = (FirebaseAuth) this.f4433b;
                U3.h hVar3 = firebaseAuth2.f9703a;
                hVar3.a();
                hashMap2.put("appName", hVar3.f5750b);
                P p7 = new P(new AtomicBoolean(true), hashMap2, hVar);
                this.f4434c = p7;
                firebaseAuth2.f9704b.add(p7);
                firebaseAuth2.f9701A.execute(new H.h(firebaseAuth2, p7, 8, false));
                return;
        }
    }

    @Override // L5.i
    public final void b() {
        switch (this.f4432a) {
            case 0:
                G g3 = (G) this.f4433b;
                if (g3 != null) {
                    g3.remove();
                    this.f4433b = null;
                    return;
                }
                return;
            case 1:
                this.f4434c = null;
                return;
            case 2:
                C1138a c1138a = (C1138a) this.f4434c;
                if (c1138a != null) {
                    ((FirebaseAuth) this.f4433b).f9706d.remove(c1138a);
                    this.f4434c = null;
                    return;
                }
                return;
            default:
                P p7 = (P) this.f4434c;
                if (p7 != null) {
                    ((FirebaseAuth) this.f4433b).f9704b.remove(p7);
                    this.f4434c = null;
                    return;
                }
                return;
        }
    }

    public f(int i7) {
        this.f4432a = i7;
        switch (i7) {
            case 1:
                this.f4433b = new ArrayList();
                return;
            default:
                return;
        }
    }
}
