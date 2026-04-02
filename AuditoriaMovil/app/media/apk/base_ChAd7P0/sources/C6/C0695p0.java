package c6;
/* renamed from: c6.p0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695p0 extends B0.b {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8952b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a6.G f8953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0695p0(a6.G g3, int i7) {
        super(6);
        this.f8952b = i7;
        this.f8953c = g3;
    }

    @Override // B0.b
    public final void k() {
        switch (this.f8952b) {
            case 0:
                C0721y0 c0721y0 = (C0721y0) this.f8953c;
                ((Y0) c0721y0.f9038d.f8985c).j.f8702d0.u(c0721y0, true);
                return;
            case 1:
                ((Z0) this.f8953c).C();
                return;
            default:
                ((d6.p) this.f8953c).f10460h.r(true);
                return;
        }
    }

    @Override // B0.b
    public final void n() {
        switch (this.f8952b) {
            case 0:
                C0721y0 c0721y0 = (C0721y0) this.f8953c;
                ((Y0) c0721y0.f9038d.f8985c).j.f8702d0.u(c0721y0, false);
                return;
            case 1:
                Z0 z02 = (Z0) this.f8953c;
                if (!z02.f8682J.get()) {
                    z02.E();
                    return;
                }
                return;
            default:
                ((d6.p) this.f8953c).f10460h.r(false);
                return;
        }
    }
}
