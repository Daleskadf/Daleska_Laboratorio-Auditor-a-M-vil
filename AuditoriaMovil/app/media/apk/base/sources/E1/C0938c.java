package e1;

import H0.C0137q;
/* renamed from: e1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0938c implements U {

    /* renamed from: a  reason: collision with root package name */
    public final U f10783a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10784b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0939d f10785c;

    public C0938c(C0939d c0939d, U u7) {
        this.f10785c = c0939d;
        this.f10783a = u7;
    }

    @Override // e1.U
    public final void a() {
        this.f10783a.a();
    }

    @Override // e1.U
    public final boolean b() {
        if (!this.f10785c.b() && this.f10783a.b()) {
            return true;
        }
        return false;
    }

    @Override // e1.U
    public final int g(M0.x xVar, N0.f fVar, int i7) {
        C0939d c0939d = this.f10785c;
        if (c0939d.b()) {
            return -3;
        }
        if (this.f10784b) {
            fVar.f1354b = 4;
            return -4;
        }
        long o7 = c0939d.o();
        int g3 = this.f10783a.g(xVar, fVar, i7);
        if (g3 == -5) {
            H0.r rVar = (H0.r) xVar.f3211c;
            rVar.getClass();
            int i8 = rVar.f1869E;
            int i9 = rVar.f1868D;
            if (i9 != 0 || i8 != 0) {
                if (c0939d.f10792e != 0) {
                    i9 = 0;
                }
                if (c0939d.f != Long.MIN_VALUE) {
                    i8 = 0;
                }
                C0137q a7 = rVar.a();
                a7.f1834C = i9;
                a7.f1835D = i8;
                xVar.f3211c = new H0.r(a7);
            }
            return -5;
        }
        long j = c0939d.f;
        if (j != Long.MIN_VALUE && ((g3 == -4 && fVar.f3345X >= j) || (g3 == -3 && o7 == Long.MIN_VALUE && !fVar.f))) {
            fVar.e();
            fVar.f1354b = 4;
            this.f10784b = true;
            return -4;
        }
        return g3;
    }

    @Override // e1.U
    public final int h(long j) {
        if (this.f10785c.b()) {
            return -3;
        }
        return this.f10783a.h(j);
    }
}
