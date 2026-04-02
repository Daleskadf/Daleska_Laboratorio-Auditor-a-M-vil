package B5;

import c1.RunnableC0626c;
/* loaded from: classes.dex */
public final class z implements io.flutter.embedding.engine.renderer.n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.m f391a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RunnableC0626c f392b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ B f393c;

    public z(B b5, io.flutter.embedding.engine.renderer.m mVar, RunnableC0626c runnableC0626c) {
        this.f393c = b5;
        this.f391a = mVar;
        this.f392b = runnableC0626c;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        C0042o c0042o;
        this.f391a.f11612a.removeIsDisplayingFlutterUiListener(this);
        this.f392b.run();
        B b5 = this.f393c;
        if (!(b5.f292d instanceof C0042o) && (c0042o = b5.f291c) != null) {
            c0042o.d();
            C0042o c0042o2 = b5.f291c;
            if (c0042o2 != null) {
                c0042o2.f371a.close();
                b5.removeView(b5.f291c);
                b5.f291c = null;
            }
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
    }
}
