package androidx.media3.exoplayer.dash;

import A.l;
import A3.N;
import F2.c;
import H0.C;
import M0.g;
import M0.x;
import R0.h;
import S0.e;
import com.google.firebase.firestore.Z;
import e1.AbstractC0936a;
import e1.InterfaceC0959y;
import f5.C0993a;
import i1.p;
import java.util.List;
/* loaded from: classes.dex */
public final class DashMediaSource$Factory implements InterfaceC0959y {

    /* renamed from: a  reason: collision with root package name */
    public final N f7963a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7964b;

    /* renamed from: c  reason: collision with root package name */
    public final c f7965c;

    /* renamed from: d  reason: collision with root package name */
    public final C0993a f7966d;

    /* renamed from: e  reason: collision with root package name */
    public final Z f7967e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f7968g;

    public DashMediaSource$Factory(g gVar) {
        N n7 = new N(gVar);
        this.f7963a = n7;
        this.f7964b = gVar;
        this.f7965c = new c();
        this.f7967e = new Z(18);
        this.f = 30000L;
        this.f7968g = 5000000L;
        this.f7966d = new C0993a(17);
        ((l) n7.f106d).f25a = true;
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y a(boolean z7) {
        ((l) this.f7963a.f106d).f25a = z7;
        return this;
    }

    @Override // e1.InterfaceC0959y
    public final AbstractC0936a b(C c8) {
        p pVar;
        c8.f1642b.getClass();
        e eVar = new e();
        List list = c8.f1642b.f1916c;
        if (!list.isEmpty()) {
            pVar = new x(eVar, list, 20, false);
        } else {
            pVar = eVar;
        }
        T0.g b5 = this.f7965c.b(c8);
        Z z7 = this.f7967e;
        long j = this.f;
        return new h(c8, this.f7964b, pVar, this.f7963a, this.f7966d, b5, z7, j, this.f7968g);
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y c(C0993a c0993a) {
        l lVar = (l) this.f7963a.f106d;
        lVar.getClass();
        lVar.f26b = c0993a;
        return this;
    }
}
