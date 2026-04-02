package androidx.media3.exoplayer.smoothstreaming;

import A.m;
import D.C0054d;
import F2.c;
import H0.C;
import M0.g;
import M0.x;
import c1.C0627d;
import com.google.firebase.firestore.Z;
import e1.AbstractC0936a;
import e1.InterfaceC0959y;
import f5.C0993a;
import i1.p;
import java.util.List;
/* loaded from: classes.dex */
public final class SsMediaSource$Factory implements InterfaceC0959y {

    /* renamed from: a  reason: collision with root package name */
    public final C0054d f7978a;

    /* renamed from: b  reason: collision with root package name */
    public final g f7979b;

    /* renamed from: c  reason: collision with root package name */
    public final C0993a f7980c;

    /* renamed from: d  reason: collision with root package name */
    public final c f7981d;

    /* renamed from: e  reason: collision with root package name */
    public final Z f7982e;
    public final long f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, D.d] */
    public SsMediaSource$Factory(g gVar) {
        ?? obj = new Object();
        obj.f689b = gVar;
        obj.f690c = new C0993a(6);
        this.f7978a = obj;
        this.f7979b = gVar;
        this.f7981d = new c();
        this.f7982e = new Z(18);
        this.f = 30000L;
        this.f7980c = new C0993a(17);
        obj.f688a = true;
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y a(boolean z7) {
        this.f7978a.f688a = z7;
        return this;
    }

    @Override // e1.InterfaceC0959y
    public final AbstractC0936a b(C c8) {
        p pVar;
        c8.f1642b.getClass();
        m mVar = new m(28);
        List list = c8.f1642b.f1916c;
        if (!list.isEmpty()) {
            pVar = new x(mVar, list, 20, false);
        } else {
            pVar = mVar;
        }
        T0.g b5 = this.f7981d.b(c8);
        Z z7 = this.f7982e;
        C0993a c0993a = this.f7980c;
        return new C0627d(c8, this.f7979b, pVar, this.f7978a, c0993a, b5, z7, this.f);
    }

    @Override // e1.InterfaceC0959y
    public final InterfaceC0959y c(C0993a c0993a) {
        this.f7978a.f690c = c0993a;
        return this;
    }
}
