package Q5;

import H4.W;
import android.content.Context;
import android.content.IntentFilter;
import b4.C0612u;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.U;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import n4.C1533t;
/* loaded from: classes.dex */
public final class e implements L5.i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4428a = 1;

    /* renamed from: b  reason: collision with root package name */
    public Object f4429b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4430c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4431d;

    public /* synthetic */ e() {
    }

    @Override // L5.i
    public final void a(Object obj, final L5.h hVar) {
        switch (this.f4428a) {
            case 0:
                this.f4429b = hVar;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) this.f4431d);
                U u7 = new U();
                R1.j jVar = ((FirebaseFirestore) this.f4430c).f9754k;
                synchronized (jVar) {
                    jVar.n0();
                    C1533t c1533t = (C1533t) jVar.f4683c;
                    c1533t.e();
                    c1533t.f14363d.a(new A.h(c1533t, new m4.f(c1533t.f14364e, byteArrayInputStream), u7, 22));
                }
                u7.a(new c(hVar, 0));
                u7.addOnFailureListener(new OnFailureListener() { // from class: Q5.d
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        e eVar = e.this;
                        eVar.getClass();
                        HashMap h8 = W.h(exc);
                        hVar.b("firebase_firestore", exc.getMessage(), h8);
                        eVar.b();
                    }
                });
                return;
            default:
                if (((Context) this.f4430c) != null) {
                    IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
                    intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
                    C0612u c0612u = new C0612u(hVar);
                    this.f4431d = c0612u;
                    X.d.registerReceiver((Context) this.f4430c, c0612u, intentFilter, 2);
                    return;
                }
                return;
        }
    }

    @Override // L5.i
    public final void b() {
        C0612u c0612u;
        switch (this.f4428a) {
            case 0:
                ((L5.h) this.f4429b).a();
                return;
            default:
                Context context = (Context) this.f4430c;
                if (context != null && (c0612u = (C0612u) this.f4431d) != null) {
                    context.unregisterReceiver(c0612u);
                    return;
                }
                return;
        }
    }

    public e(FirebaseFirestore firebaseFirestore, byte[] bArr) {
        this.f4430c = firebaseFirestore;
        this.f4431d = bArr;
    }
}
