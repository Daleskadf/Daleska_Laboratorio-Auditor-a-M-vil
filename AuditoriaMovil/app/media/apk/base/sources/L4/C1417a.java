package l4;

import u4.n;
import u4.q;
import w4.InterfaceC1955a;
import w4.InterfaceC1956b;
/* renamed from: l4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1417a implements Z3.a, InterfaceC1955a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1419c f13846a;

    public /* synthetic */ C1417a(C1419c c1419c) {
        this.f13846a = c1419c;
    }

    @Override // Z3.a
    public void c(X3.b bVar) {
        C1419c c1419c = this.f13846a;
        synchronized (c1419c) {
            try {
                if (bVar.f6377b != null) {
                    q.d("FirebaseAppCheckTokenProvider", "Error getting App Check token; using placeholder token instead. Error: " + bVar.f6377b, new Object[0]);
                }
                n nVar = c1419c.f13848d;
                if (nVar != null) {
                    nVar.a(bVar.f6376a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // w4.InterfaceC1955a
    public void f(InterfaceC1956b interfaceC1956b) {
        C1419c c1419c = this.f13846a;
        synchronized (c1419c) {
            try {
                Z3.b bVar = (Z3.b) interfaceC1956b.get();
                c1419c.f13849e = bVar;
                if (bVar != null) {
                    ((X3.d) bVar).a(c1419c.f13850g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
