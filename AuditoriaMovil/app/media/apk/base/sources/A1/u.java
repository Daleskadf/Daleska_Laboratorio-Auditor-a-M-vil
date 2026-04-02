package a1;

import H0.C0145z;
import H0.V;
import android.net.Uri;
import com.google.firebase.firestore.Z;
import e1.AbstractC0936a;
import e1.C0960z;
import e1.InterfaceC0958x;
import e1.Y;
import java.util.ArrayList;
import javax.net.SocketFactory;
/* loaded from: classes.dex */
public final class u extends AbstractC0936a {

    /* renamed from: Y  reason: collision with root package name */
    public final Z f6900Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f6901Z = "AndroidXMedia3/1.4.1";

    /* renamed from: e0  reason: collision with root package name */
    public final Uri f6902e0;

    /* renamed from: f0  reason: collision with root package name */
    public final SocketFactory f6903f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f6904g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f6905h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f6906i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f6907j0;

    /* renamed from: k0  reason: collision with root package name */
    public H0.C f6908k0;

    static {
        H0.D.a("media3.exoplayer.rtsp");
    }

    public u(H0.C c8, Z z7, SocketFactory socketFactory) {
        this.f6908k0 = c8;
        this.f6900Y = z7;
        C0145z c0145z = c8.f1642b;
        c0145z.getClass();
        this.f6902e0 = c0145z.f1914a;
        this.f6903f0 = socketFactory;
        this.f6904g0 = -9223372036854775807L;
        this.f6907j0 = true;
    }

    @Override // e1.AbstractC0936a
    public final InterfaceC0958x b(C0960z c0960z, i1.e eVar, long j) {
        A.m mVar = new A.m(this, 21);
        return new r(eVar, this.f6900Y, this.f6902e0, mVar, this.f6901Z, this.f6903f0);
    }

    @Override // e1.AbstractC0936a
    public final synchronized H0.C h() {
        return this.f6908k0;
    }

    @Override // e1.AbstractC0936a
    public final void m(M0.C c8) {
        u();
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        r rVar = (r) interfaceC0958x;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = rVar.f6886e;
            if (i7 < arrayList.size()) {
                q qVar = (q) arrayList.get(i7);
                if (!qVar.f6878e) {
                    qVar.f6875b.e(null);
                    qVar.f6876c.C();
                    qVar.f6878e = true;
                }
                i7++;
            } else {
                K0.x.h(rVar.f6885d);
                rVar.f6895m0 = true;
                return;
            }
        }
    }

    @Override // e1.AbstractC0936a
    public final synchronized void t(H0.C c8) {
        this.f6908k0 = c8;
    }

    public final void u() {
        V y2 = new Y(this.f6904g0, this.f6905h0, this.f6906i0, h());
        if (this.f6907j0) {
            y2 = new s(y2, 0);
        }
        n(y2);
    }

    @Override // e1.AbstractC0936a
    public final void k() {
    }

    @Override // e1.AbstractC0936a
    public final void q() {
    }
}
