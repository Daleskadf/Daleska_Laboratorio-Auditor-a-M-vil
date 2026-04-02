package c6;

import a6.C0487p;
import a6.EnumC0486o;
import java.util.logging.Level;
/* renamed from: c6.s1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704s1 implements a6.P {

    /* renamed from: a  reason: collision with root package name */
    public C0487p f8979a = C0487p.a(EnumC0486o.IDLE);

    /* renamed from: b  reason: collision with root package name */
    public C0713v1 f8980b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0716w1 f8981c;

    public C0704s1(C0716w1 c0716w1) {
        this.f8981c = c0716w1;
    }

    @Override // a6.P
    public final void a(C0487p c0487p) {
        C0716w1.f9024o.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c0487p, this.f8980b.f9018a});
        this.f8979a = c0487p;
        C0716w1 c0716w1 = this.f8981c;
        if (c0716w1.f9026h.c() && ((C0713v1) c0716w1.f9025g.get(c0716w1.f9026h.a())).f9020c == this) {
            c0716w1.j(this.f8980b);
        }
    }
}
