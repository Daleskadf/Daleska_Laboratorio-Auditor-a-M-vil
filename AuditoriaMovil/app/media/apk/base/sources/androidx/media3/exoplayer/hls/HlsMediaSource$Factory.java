package androidx.media3.exoplayer.hls;

import A.c;
import H0.C;
import M0.g;
import M0.x;
import P0.b;
import U0.j;
import U0.m;
import V0.p;
import com.google.firebase.firestore.Z;
import e1.AbstractC0936a;
import e1.InterfaceC0959y;
import f5.C0993a;
import java.util.List;
import t2.i;
/* loaded from: classes.dex */
public final class HlsMediaSource$Factory implements InterfaceC0959y {

    /* renamed from: a  reason: collision with root package name */
    public final c f7969a;

    /* renamed from: b  reason: collision with root package name */
    public final U0.c f7970b;

    /* renamed from: e  reason: collision with root package name */
    public final C0993a f7973e;

    /* renamed from: g  reason: collision with root package name */
    public final Z f7974g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7975h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7976i;
    public final long j;
    public final F2.c f = new F2.c();

    /* renamed from: c  reason: collision with root package name */
    public final i f7971c = new i(10);

    /* renamed from: d  reason: collision with root package name */
    public final b f7972d = V0.c.f5804j0;

    public HlsMediaSource$Factory(g gVar) {
        this.f7969a = new c(gVar, 16);
        U0.c cVar = j.f5575a;
        this.f7970b = cVar;
        this.f7974g = new Z(18);
        this.f7973e = new C0993a(17);
        this.f7976i = 1;
        this.j = -9223372036854775807L;
        this.f7975h = true;
        cVar.f5547c = true;
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y a(boolean z7) {
        this.f7970b.f5547c = z7;
        return this;
    }

    @Override // e1.InterfaceC0959y
    public final AbstractC0936a b(C c8) {
        c8.f1642b.getClass();
        p pVar = this.f7971c;
        List list = c8.f1642b.f1916c;
        if (!list.isEmpty()) {
            pVar = new x(pVar, list, 15, false);
        }
        U0.c cVar = this.f7970b;
        T0.g b5 = this.f.b(c8);
        Z z7 = this.f7974g;
        this.f7972d.getClass();
        c cVar2 = this.f7969a;
        return new m(c8, cVar2, cVar, this.f7973e, b5, z7, new V0.c(cVar2, z7, pVar), this.j, this.f7975h, this.f7976i);
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y c(C0993a c0993a) {
        this.f7970b.f5546b = c0993a;
        return this;
    }
}
