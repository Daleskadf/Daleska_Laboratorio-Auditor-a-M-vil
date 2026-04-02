package c6;

import a6.AbstractC0478g;
import java.util.Map;
/* loaded from: classes.dex */
public final class C1 extends a6.S {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f8433a;

    static {
        boolean z7;
        if (!H4.W.x(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"))) {
            z7 = true;
        } else {
            z7 = false;
        }
        f8433a = z7;
    }

    @Override // a6.S
    public String a() {
        return "pick_first";
    }

    @Override // a6.S
    public int b() {
        return 5;
    }

    @Override // a6.S
    public boolean c() {
        return true;
    }

    @Override // a6.S
    public final a6.Q d(AbstractC0478g abstractC0478g) {
        if (f8433a) {
            return new C0716w1(abstractC0478g);
        }
        return new B1(abstractC0478g);
    }

    @Override // a6.S
    public a6.h0 e(Map map) {
        try {
            return new a6.h0(new C0725z1(C0.b("shuffleAddressList", map)));
        } catch (RuntimeException e7) {
            a6.o0 f = a6.o0.f7180n.f(e7);
            return new a6.h0(f.g("Failed parsing configuration for " + a()));
        }
    }
}
