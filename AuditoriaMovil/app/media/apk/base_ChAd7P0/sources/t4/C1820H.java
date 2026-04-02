package t4;

import H4.t1;
import H4.v1;
import H4.x1;
import H4.z1;
import O0.d0;
import b3.C0585f;
import com.google.firebase.firestore.S;
import com.google.protobuf.AbstractC0828a;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import com.google.protobuf.N0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n4.J;
import p.C1608t;
import p4.C1683m;
/* renamed from: t4.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1820H extends AbstractC1823c {

    /* renamed from: v  reason: collision with root package name */
    public static final C0850l f15774v = AbstractC0852m.f10085b;

    /* renamed from: s  reason: collision with root package name */
    public final C1608t f15775s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f15776t;

    /* renamed from: u  reason: collision with root package name */
    public AbstractC0852m f15777u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1820H(t4.p r11, u4.e r12, p.C1608t r13, t4.t r14) {
        /*
            r10 = this;
            Q0.A r0 = H4.W.f2000d
            if (r0 != 0) goto L42
            java.lang.Class<H4.W> r1 = H4.W.class
            monitor-enter(r1)
            Q0.A r0 = H4.W.f2000d     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L41
            D5.b r0 = Q0.A.e()     // Catch: java.lang.Throwable -> L3f
            a6.f0 r2 = a6.f0.BIDI_STREAMING     // Catch: java.lang.Throwable -> L3f
            r0.f870d = r2     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "google.firestore.v1.Firestore"
            java.lang.String r3 = "Write"
            java.lang.String r2 = Q0.A.c(r2, r3)     // Catch: java.lang.Throwable -> L3f
            r0.f871e = r2     // Catch: java.lang.Throwable -> L3f
            r2 = 1
            r0.f867a = r2     // Catch: java.lang.Throwable -> L3f
            H4.x1 r2 = H4.x1.y()     // Catch: java.lang.Throwable -> L3f
            com.google.protobuf.w r3 = g6.AbstractC1014c.f11139a     // Catch: java.lang.Throwable -> L3f
            g6.b r3 = new g6.b     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            r0.f868b = r3     // Catch: java.lang.Throwable -> L3f
            H4.z1 r2 = H4.z1.w()     // Catch: java.lang.Throwable -> L3f
            g6.b r3 = new g6.b     // Catch: java.lang.Throwable -> L3f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            r0.f869c = r3     // Catch: java.lang.Throwable -> L3f
            Q0.A r0 = r0.g()     // Catch: java.lang.Throwable -> L3f
            H4.W.f2000d = r0     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r11 = move-exception
            goto L44
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
        L42:
            r4 = r0
            goto L46
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3f
            throw r11
        L46:
            u4.d r6 = u4.d.WRITE_STREAM_CONNECTION_BACKOFF
            u4.d r7 = u4.d.WRITE_STREAM_IDLE
            u4.d r8 = u4.d.HEALTH_CHECK_TIMEOUT
            r2 = r10
            r3 = r11
            r5 = r12
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r11 = 0
            r10.f15776t = r11
            com.google.protobuf.l r11 = t4.C1820H.f15774v
            r10.f15777u = r11
            r10.f15775s = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.C1820H.<init>(t4.p, u4.e, p.t, t4.t):void");
    }

    @Override // t4.AbstractC1823c
    public final void e(AbstractC0828a abstractC0828a) {
        this.f15777u = ((z1) abstractC0828a).x();
        this.f15776t = true;
        d0 d0Var = ((t) this.f15798m).f15848a;
        C1820H c1820h = (C1820H) d0Var.j;
        AbstractC0852m abstractC0852m = c1820h.f15777u;
        C1683m c1683m = (C1683m) d0Var.f3690e;
        c1683m.f15266a.G("Set stream token", new S(27, c1683m, abstractC0852m));
        Iterator it = ((ArrayDeque) d0Var.f3695l).iterator();
        while (it.hasNext()) {
            c1820h.j(((r4.i) it.next()).f15502d);
        }
    }

    @Override // t4.AbstractC1823c
    public final void f(AbstractC0828a abstractC0828a) {
        boolean z7;
        z1 z1Var = (z1) abstractC0828a;
        this.f15777u = z1Var.x();
        this.f15797l.f = 0L;
        N0 v6 = z1Var.v();
        this.f15775s.getClass();
        q4.q D4 = C1608t.D(v6);
        int z8 = z1Var.z();
        ArrayList arrayList = new ArrayList(z8);
        for (int i7 = 0; i7 < z8; i7++) {
            arrayList.add(C1608t.B(z1Var.y(i7), D4));
        }
        d0 d0Var = ((t) this.f15798m).f15848a;
        r4.i iVar = (r4.i) ((ArrayDeque) d0Var.f3695l).poll();
        AbstractC0852m abstractC0852m = ((C1820H) d0Var.j).f15777u;
        if (iVar.f15502d.size() == arrayList.size()) {
            z7 = true;
        } else {
            z7 = false;
        }
        List list = iVar.f15502d;
        m5.d.i("Mutations sent %d must equal results received %d", z7, Integer.valueOf(list.size()), Integer.valueOf(arrayList.size()));
        e4.c cVar = q4.g.f15354a;
        for (int i8 = 0; i8 < list.size(); i8++) {
            cVar = cVar.m(((r4.h) list.get(i8)).f15496a, ((r4.j) arrayList.get(i8)).f15503a);
        }
        F3.o oVar = new F3.o(iVar, D4, arrayList, abstractC0852m, cVar, 12);
        J e7 = ((n4.y) ((C0585f) d0Var.f3689d).f8171b).e();
        e7.a("handleSuccessfulWrite");
        r4.i iVar2 = (r4.i) oVar.f1178b;
        e7.f(iVar2.f15499a, null);
        e7.j(iVar2.f15499a);
        C1683m c1683m = e7.f14291a;
        e7.b((e4.c) c1683m.f15266a.F("Acknowledge batch", new A4.d(19, c1683m, oVar)), null);
        d0Var.f();
    }

    @Override // t4.AbstractC1823c
    public final void g() {
        this.f15776t = false;
        super.g();
    }

    @Override // t4.AbstractC1823c
    public final void h() {
        if (this.f15776t) {
            j(Collections.emptyList());
        }
    }

    public final void j(List list) {
        m5.d.i("Writing mutations requires an opened stream", c(), new Object[0]);
        m5.d.i("Handshake must be complete before writing mutations", this.f15776t, new Object[0]);
        v1 z7 = x1.z();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t1 W7 = this.f15775s.W((r4.h) it.next());
            z7.d();
            x1.x((x1) z7.f10006b, W7);
        }
        AbstractC0852m abstractC0852m = this.f15777u;
        z7.d();
        x1.w((x1) z7.f10006b, abstractC0852m);
        i((x1) z7.b());
    }
}
