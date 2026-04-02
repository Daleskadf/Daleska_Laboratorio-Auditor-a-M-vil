package androidx.lifecycle;

import android.os.Handler;
import z0.RunnableC2044d;
/* loaded from: classes.dex */
public final class H implements InterfaceC0568u {

    /* renamed from: Z  reason: collision with root package name */
    public static final H f7888Z = new H();

    /* renamed from: a  reason: collision with root package name */
    public int f7891a;

    /* renamed from: b  reason: collision with root package name */
    public int f7892b;

    /* renamed from: e  reason: collision with root package name */
    public Handler f7895e;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7893c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7894d = true;
    public final C0570w f = new C0570w(this);

    /* renamed from: X  reason: collision with root package name */
    public final RunnableC2044d f7889X = new RunnableC2044d(this);

    /* renamed from: Y  reason: collision with root package name */
    public final A.c f7890Y = new A.c(this, 24);

    public final void b() {
        int i7 = this.f7892b + 1;
        this.f7892b = i7;
        if (i7 == 1) {
            if (this.f7893c) {
                this.f.e(EnumC0562n.ON_RESUME);
                this.f7893c = false;
                return;
            }
            Handler handler = this.f7895e;
            kotlin.jvm.internal.j.b(handler);
            handler.removeCallbacks(this.f7889X);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0568u
    public final C0570w h() {
        return this.f;
    }
}
