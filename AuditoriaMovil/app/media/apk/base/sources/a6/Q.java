package a6;

import java.util.List;
/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: b  reason: collision with root package name */
    public static final C0472a f7099b = new C0472a("internal:health-checking-config");

    /* renamed from: c  reason: collision with root package name */
    public static final C0483l f7100c = new C0483l(5);

    /* renamed from: d  reason: collision with root package name */
    public static final C0472a f7101d = new C0472a("internal:has-health-check-producer-listener");

    /* renamed from: e  reason: collision with root package name */
    public static final C0472a f7102e = new C0472a("io.grpc.IS_PETIOLE_POLICY");

    /* renamed from: a  reason: collision with root package name */
    public int f7103a;

    public o0 a(N n7) {
        List list = n7.f7096a;
        if (list.isEmpty() && !b()) {
            o0 o0Var = o0.f7180n;
            o0 g3 = o0Var.g("NameResolver returned no usable address. addrs=" + list + ", attrs=" + n7.f7097b);
            c(g3);
            return g3;
        }
        int i7 = this.f7103a;
        this.f7103a = i7 + 1;
        if (i7 == 0) {
            d(n7);
        }
        this.f7103a = 0;
        return o0.f7173e;
    }

    public boolean b() {
        return false;
    }

    public abstract void c(o0 o0Var);

    public void d(N n7) {
        int i7 = this.f7103a;
        this.f7103a = i7 + 1;
        if (i7 == 0) {
            a(n7);
        }
        this.f7103a = 0;
    }

    public abstract void f();

    public void e() {
    }
}
