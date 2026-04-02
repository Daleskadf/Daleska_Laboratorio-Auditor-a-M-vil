package a6;

import D.AbstractC0055e;
import c6.C0685m;
import c6.E1;
import c6.P0;
import c6.X0;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f7147a;

    /* renamed from: b  reason: collision with root package name */
    public final E1 f7148b;

    /* renamed from: c  reason: collision with root package name */
    public final u0 f7149c;

    /* renamed from: d  reason: collision with root package name */
    public final I.k f7150d;

    /* renamed from: e  reason: collision with root package name */
    public final X0 f7151e;
    public final C0685m f;

    /* renamed from: g  reason: collision with root package name */
    public final P0 f7152g;

    public g0(Integer num, E1 e12, u0 u0Var, I.k kVar, X0 x02, C0685m c0685m, P0 p02) {
        this.f7147a = num.intValue();
        G.i.j(e12, "proxyDetector not set");
        this.f7148b = e12;
        this.f7149c = u0Var;
        this.f7150d = kVar;
        this.f7151e = x02;
        this.f = c0685m;
        this.f7152g = p02;
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.d("defaultPort", String.valueOf(this.f7147a));
        C7.a(this.f7148b, "proxyDetector");
        C7.a(this.f7149c, "syncContext");
        C7.a(this.f7150d, "serviceConfigParser");
        C7.a(this.f7151e, "scheduledExecutorService");
        C7.a(this.f, "channelLogger");
        C7.a(this.f7152g, "executor");
        C7.a(null, "overrideAuthority");
        return C7.toString();
    }
}
