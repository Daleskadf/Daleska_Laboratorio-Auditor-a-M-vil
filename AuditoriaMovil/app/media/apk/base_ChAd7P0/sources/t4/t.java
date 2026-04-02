package t4;

import H4.v1;
import H4.x1;
import O0.C0256s;
import O0.d0;
import a6.n0;
import a6.o0;
import b3.C0585f;
import com.google.firebase.firestore.I;
import com.google.firebase.firestore.S;
import com.google.protobuf.C0850l;
import java.util.ArrayDeque;
import java.util.HashSet;
import n4.J;
import p4.C1683m;
/* loaded from: classes.dex */
public final class t implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d0 f15848a;

    public t(d0 d0Var) {
        this.f15848a = d0Var;
    }

    @Override // t4.v
    public final void a() {
        C1820H c1820h = (C1820H) this.f15848a.j;
        m5.d.i("Writing handshake requires an opened stream", c1820h.c(), new Object[0]);
        m5.d.i("Handshake already completed", !c1820h.f15776t, new Object[0]);
        v1 z7 = x1.z();
        z7.d();
        x1.v((x1) z7.f10006b, (String) c1820h.f15775s.f14881c);
        c1820h.i((x1) z7.b());
    }

    @Override // t4.v
    public final void b(o0 o0Var) {
        d0 d0Var = this.f15848a;
        d0Var.getClass();
        if (o0Var.e()) {
            m5.d.i("Write stream was stopped gracefully while still needed.", !d0Var.o(), new Object[0]);
        }
        boolean e7 = o0Var.e();
        C1820H c1820h = (C1820H) d0Var.j;
        if (!e7) {
            ArrayDeque arrayDeque = (ArrayDeque) d0Var.f3695l;
            if (!arrayDeque.isEmpty()) {
                boolean z7 = c1820h.f15776t;
                n0 n0Var = o0Var.f7183a;
                if (z7) {
                    m5.d.i("Handling write error with status OK.", !o0Var.e(), new Object[0]);
                    HashSet hashSet = i.f15803d;
                    if (i.a(I.a(n0Var.c())) && !n0Var.equals(n0.ABORTED)) {
                        c1820h.b();
                        int i7 = ((r4.i) arrayDeque.poll()).f15499a;
                        J e8 = ((n4.y) ((C0585f) d0Var.f3689d).f8171b).e();
                        e8.a("handleRejectedWrite");
                        C1683m c1683m = e8.f14291a;
                        e4.c cVar = (e4.c) c1683m.f15266a.F("Reject batch", new C0256s(c1683m, i7, 3));
                        if (!cVar.isEmpty()) {
                            J.e(o0Var, "Write failed at %s", ((q4.h) cVar.k()).f15357a);
                        }
                        e8.f(i7, o0Var);
                        e8.j(i7);
                        e8.b(cVar, null);
                        d0Var.f();
                    }
                } else {
                    m5.d.i("Handling write error with status OK.", !o0Var.e(), new Object[0]);
                    HashSet hashSet2 = i.f15803d;
                    if (i.a(I.a(n0Var.c()))) {
                        u4.q.a("RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", u4.u.j(c1820h.f15777u), o0Var);
                        C0850l c0850l = C1820H.f15774v;
                        c0850l.getClass();
                        c1820h.f15777u = c0850l;
                        C1683m c1683m2 = (C1683m) d0Var.f3690e;
                        c1683m2.f15266a.G("Set stream token", new S(27, c1683m2, c0850l));
                    }
                }
            }
        }
        if (d0Var.o()) {
            m5.d.i("startWriteStream() called when shouldStartWriteStream() is false.", d0Var.o(), new Object[0]);
            c1820h.g();
        }
    }
}
