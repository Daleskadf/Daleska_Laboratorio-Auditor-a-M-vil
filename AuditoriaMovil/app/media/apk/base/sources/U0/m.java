package U0;

import A3.K;
import H0.C0144y;
import H0.C0145z;
import H0.D;
import K0.x;
import M0.C;
import android.net.Uri;
import android.os.Looper;
import com.google.firebase.firestore.Z;
import e1.AbstractC0936a;
import e1.C0960z;
import e1.InterfaceC0958x;
import f5.C0993a;
import java.io.IOException;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class m extends AbstractC0936a {

    /* renamed from: Y  reason: collision with root package name */
    public final c f5624Y;

    /* renamed from: Z  reason: collision with root package name */
    public final A.c f5625Z;

    /* renamed from: e0  reason: collision with root package name */
    public final C0993a f5626e0;

    /* renamed from: f0  reason: collision with root package name */
    public final T0.g f5627f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Z f5628g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f5629h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f5630i0;

    /* renamed from: j0  reason: collision with root package name */
    public final V0.c f5631j0;

    /* renamed from: k0  reason: collision with root package name */
    public final long f5632k0;

    /* renamed from: l0  reason: collision with root package name */
    public C0144y f5633l0;

    /* renamed from: m0  reason: collision with root package name */
    public C f5634m0;

    /* renamed from: n0  reason: collision with root package name */
    public H0.C f5635n0;

    static {
        D.a("media3.exoplayer.hls");
    }

    public m(H0.C c8, A.c cVar, c cVar2, C0993a c0993a, T0.g gVar, Z z7, V0.c cVar3, long j, boolean z8, int i7) {
        this.f5635n0 = c8;
        this.f5633l0 = c8.f1643c;
        this.f5625Z = cVar;
        this.f5624Y = cVar2;
        this.f5626e0 = c0993a;
        this.f5627f0 = gVar;
        this.f5628g0 = z7;
        this.f5631j0 = cVar3;
        this.f5632k0 = j;
        this.f5629h0 = z8;
        this.f5630i0 = i7;
    }

    public static V0.d u(K k2, long j) {
        V0.d dVar = null;
        for (int i7 = 0; i7 < k2.size(); i7++) {
            V0.d dVar2 = (V0.d) k2.get(i7);
            int i8 = (dVar2.f5832e > j ? 1 : (dVar2.f5832e == j ? 0 : -1));
            if (i8 <= 0 && dVar2.f5818g0) {
                dVar = dVar2;
            } else if (i8 > 0) {
                break;
            }
        }
        return dVar;
    }

    @Override // e1.AbstractC0936a
    public final InterfaceC0958x b(C0960z c0960z, i1.e eVar, long j) {
        T0.d a7 = a(c0960z);
        T0.d dVar = new T0.d(this.f10774d.f5289c, 0, c0960z);
        C c8 = this.f5634m0;
        P0.k kVar = this.f10770X;
        K0.a.k(kVar);
        return new l(this.f5624Y, this.f5631j0, this.f5625Z, c8, this.f5627f0, dVar, this.f5628g0, a7, eVar, this.f5626e0, this.f5629h0, this.f5630i0, kVar);
    }

    @Override // e1.AbstractC0936a
    public final synchronized H0.C h() {
        return this.f5635n0;
    }

    @Override // e1.AbstractC0936a
    public final void k() {
        V0.c cVar = this.f5631j0;
        i1.n nVar = cVar.f5805X;
        if (nVar != null) {
            nVar.a();
        }
        Uri uri = cVar.f5814f0;
        if (uri != null) {
            V0.b bVar = (V0.b) cVar.f5811d.get(uri);
            bVar.f5797b.a();
            IOException iOException = bVar.f5801e0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // e1.AbstractC0936a
    public final void m(C c8) {
        boolean z7;
        this.f5634m0 = c8;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        P0.k kVar = this.f10770X;
        K0.a.k(kVar);
        T0.g gVar = this.f5627f0;
        gVar.p(myLooper, kVar);
        gVar.b();
        T0.d a7 = a(null);
        C0145z c0145z = h().f1642b;
        c0145z.getClass();
        V0.c cVar = this.f5631j0;
        cVar.getClass();
        cVar.f5806Y = x.n(null);
        cVar.f = a7;
        cVar.f5807Z = this;
        i1.q qVar = new i1.q(((M0.g) cVar.f5808a.f4b).a(), c0145z.f1914a, 4, cVar.f5809b.u());
        if (cVar.f5805X == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        i1.n nVar = new i1.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.f5805X = nVar;
        Z z8 = cVar.f5810c;
        int i7 = qVar.f11434c;
        a7.k(new e1.r(qVar.f11432a, qVar.f11433b, nVar.f(qVar, cVar, z8.w(i7))), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        r[] rVarArr;
        q[] qVarArr;
        l lVar = (l) interfaceC0958x;
        lVar.f5607b.f5812e.remove(lVar);
        for (r rVar : lVar.f5621o0) {
            if (rVar.f5696y0) {
                for (q qVar : rVar.q0) {
                    qVar.j();
                    A.m mVar = qVar.f10736h;
                    if (mVar != null) {
                        mVar.k0(qVar.f10734e);
                        qVar.f10736h = null;
                        qVar.f10735g = null;
                    }
                }
            }
            i iVar = rVar.f5675d;
            V0.b bVar = (V0.b) iVar.f5563g.f5811d.get(iVar.f5562e[iVar.f5572q.h()]);
            if (bVar != null) {
                bVar.f5802f0 = false;
            }
            iVar.f5569n = null;
            rVar.f5677e0.e(rVar);
            rVar.f5685m0.removeCallbacksAndMessages(null);
            rVar.f5652C0 = true;
            rVar.f5686n0.clear();
        }
        lVar.f5618l0 = null;
    }

    @Override // e1.AbstractC0936a
    public final void q() {
        V0.c cVar = this.f5631j0;
        cVar.f5814f0 = null;
        cVar.f5815g0 = null;
        cVar.f5813e0 = null;
        cVar.f5817i0 = -9223372036854775807L;
        cVar.f5805X.e(null);
        cVar.f5805X = null;
        HashMap hashMap = cVar.f5811d;
        for (V0.b bVar : hashMap.values()) {
            bVar.f5797b.e(null);
        }
        cVar.f5806Y.removeCallbacksAndMessages(null);
        cVar.f5806Y = null;
        hashMap.clear();
        this.f5627f0.release();
    }

    @Override // e1.AbstractC0936a
    public final synchronized void t(H0.C c8) {
        this.f5635n0 = c8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
        if (r42.f5848n != (-9223372036854775807L)) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(V0.i r42) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U0.m.v(V0.i):void");
    }
}
