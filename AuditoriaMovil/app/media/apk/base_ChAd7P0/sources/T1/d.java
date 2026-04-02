package T1;

import A3.I;
import A3.K;
import A3.e0;
import java.util.List;
import m1.G;
import m1.l;
import m1.o;
import m1.p;
import m1.q;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a  reason: collision with root package name */
    public q f5312a;

    /* renamed from: b  reason: collision with root package name */
    public G f5313b;

    /* renamed from: c  reason: collision with root package name */
    public int f5314c;

    /* renamed from: d  reason: collision with root package name */
    public long f5315d;

    /* renamed from: e  reason: collision with root package name */
    public b f5316e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public long f5317g;

    @Override // m1.o
    public final void a(long j, long j8) {
        int i7;
        if (j == 0) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        this.f5314c = i7;
        b bVar = this.f5316e;
        if (bVar != null) {
            bVar.c(j8);
        }
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        return AbstractC1740d.f((l) pVar);
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(q qVar) {
        this.f5312a = qVar;
        this.f5313b = qVar.s(0, 1);
        qVar.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b9  */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r25, H0.C0140u r26) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.d.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
    }
}
