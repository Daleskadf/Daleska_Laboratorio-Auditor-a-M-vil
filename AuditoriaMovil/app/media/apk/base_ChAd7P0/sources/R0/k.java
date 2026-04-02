package R0;

import f1.AbstractC0980b;
/* loaded from: classes.dex */
public final class k extends AbstractC0980b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4601d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final Object f4602e;

    public k(d1.b bVar, int i7) {
        super(i7, bVar.f10182k - 1);
        this.f4602e = bVar;
    }

    @Override // f1.m
    public final long a() {
        switch (this.f4601d) {
            case 0:
                b();
                return ((j) this.f4602e).e(this.f10984c);
            default:
                return ((d1.b) this.f4602e).b((int) this.f10984c) + r();
        }
    }

    @Override // f1.m
    public final long r() {
        switch (this.f4601d) {
            case 0:
                b();
                return ((j) this.f4602e).f(this.f10984c);
            default:
                b();
                return ((d1.b) this.f4602e).f10186o[(int) this.f10984c];
        }
    }

    public k(j jVar, long j, long j8) {
        super(j, j8);
        this.f4602e = jVar;
    }
}
