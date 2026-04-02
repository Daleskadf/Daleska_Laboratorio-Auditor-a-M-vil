package a1;

import e1.T;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final p f6874a;

    /* renamed from: b  reason: collision with root package name */
    public final i1.n f6875b;

    /* renamed from: c  reason: collision with root package name */
    public final T f6876c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6877d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6878e;
    public final /* synthetic */ r f;

    public q(r rVar, v vVar, int i7, InterfaceC0427d interfaceC0427d) {
        this.f = rVar;
        this.f6875b = new i1.n(io.flutter.plugins.pathprovider.b.e(i7, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        T t7 = new T(rVar.f6882a, null, null);
        this.f6876c = t7;
        this.f6874a = new p(rVar, vVar, i7, t7, interfaceC0427d);
        t7.f = rVar.f6884c;
    }

    public final void a() {
        if (!this.f6877d) {
            this.f6874a.f6871b.f6813e0 = true;
            this.f6877d = true;
            r.w(this.f);
        }
    }

    public final void b() {
        this.f6875b.f(this.f6874a.f6871b, this.f.f6884c, 0);
    }
}
