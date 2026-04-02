package l4;

import O0.C0256s;
import U3.i;
import X5.E;
import a4.AbstractC0467p;
import b4.C0599g;
import b4.InterfaceC0593a;
import c4.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import h3.AbstractC1079a;
import java.util.concurrent.CopyOnWriteArrayList;
import u4.k;
import u4.n;
/* renamed from: l4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1421e extends AbstractC1079a {

    /* renamed from: d  reason: collision with root package name */
    public final C1420d f13852d = new C1420d(this);

    /* renamed from: e  reason: collision with root package name */
    public InterfaceC0593a f13853e;
    public n f;

    /* renamed from: g  reason: collision with root package name */
    public int f13854g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f13855h;

    public C1421e(p pVar) {
        pVar.a(new E(this, 16));
    }

    public final synchronized Task A() {
        InterfaceC0593a interfaceC0593a = this.f13853e;
        if (interfaceC0593a == null) {
            return Tasks.forException(new i("auth is not available"));
        }
        FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0593a;
        Task j = firebaseAuth.j(firebaseAuth.f, this.f13855h);
        this.f13855h = false;
        return j.continueWithTask(k.f16005b, new C0256s(this, this.f13854g, 2));
    }

    public final synchronized C1422f B() {
        AbstractC0467p abstractC0467p;
        C1422f c1422f;
        try {
            InterfaceC0593a interfaceC0593a = this.f13853e;
            String str = null;
            if (interfaceC0593a != null && (abstractC0467p = ((FirebaseAuth) interfaceC0593a).f) != null) {
                str = ((C0599g) abstractC0467p).f8254b.f8241a;
            }
            if (str != null) {
                c1422f = new C1422f(str);
            } else {
                c1422f = C1422f.f13856b;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1422f;
    }

    public final synchronized void C() {
        this.f13855h = true;
    }

    public final synchronized void D() {
        this.f13854g++;
        n nVar = this.f;
        if (nVar != null) {
            nVar.a(B());
        }
    }

    public final synchronized void E() {
        this.f = null;
        InterfaceC0593a interfaceC0593a = this.f13853e;
        if (interfaceC0593a != null) {
            C1420d c1420d = this.f13852d;
            FirebaseAuth firebaseAuth = (FirebaseAuth) interfaceC0593a;
            CopyOnWriteArrayList copyOnWriteArrayList = firebaseAuth.f9705c;
            copyOnWriteArrayList.remove(c1420d);
            firebaseAuth.t().a(copyOnWriteArrayList.size());
        }
    }
}
