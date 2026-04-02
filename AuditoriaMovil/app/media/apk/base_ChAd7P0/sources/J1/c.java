package J1;

import java.util.List;
/* loaded from: classes.dex */
public final class c extends N0.g implements d {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f2361X = 1;

    /* renamed from: Y  reason: collision with root package name */
    public Object f2362Y;

    /* renamed from: e  reason: collision with root package name */
    public d f2363e;
    public long f;

    public /* synthetic */ c() {
    }

    @Override // J1.d
    public final List M(long j) {
        d dVar = this.f2363e;
        dVar.getClass();
        return dVar.M(j - this.f);
    }

    @Override // N0.g
    public final void e() {
        super.e();
        this.f2363e = null;
    }

    @Override // J1.d
    public final int e0() {
        d dVar = this.f2363e;
        dVar.getClass();
        return dVar.e0();
    }

    @Override // N0.g
    public final void f() {
        switch (this.f2361X) {
            case 0:
                ((W0.b) this.f2362Y).l(this);
                return;
            default:
                A.j jVar = (A.j) this.f2362Y;
                jVar.getClass();
                K1.i iVar = (K1.i) jVar.f19b;
                iVar.getClass();
                e();
                iVar.f2622b.add(this);
                return;
        }
    }

    @Override // J1.d
    public final int g(long j) {
        d dVar = this.f2363e;
        dVar.getClass();
        return dVar.g(j - this.f);
    }

    @Override // J1.d
    public final long x(int i7) {
        d dVar = this.f2363e;
        dVar.getClass();
        return dVar.x(i7) + this.f;
    }

    public c(W0.b bVar) {
        this.f2362Y = bVar;
    }
}
