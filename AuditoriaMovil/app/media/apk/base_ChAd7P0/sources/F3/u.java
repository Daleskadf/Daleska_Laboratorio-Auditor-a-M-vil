package F3;

import R3.EnumC0328x0;
import R3.G0;
import R3.H0;
import R3.J0;
import R3.K0;
import R3.L0;
import R3.M0;
import R3.X0;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1195a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static M0 a(H0 h02) {
        J0 B7 = M0.B();
        int D4 = h02.D();
        B7.e();
        M0.y((M0) B7.f9699b, D4);
        for (G0 g02 : h02.C()) {
            K0 D7 = L0.D();
            String D8 = g02.C().D();
            D7.e();
            L0.y((L0) D7.f9699b, D8);
            EnumC0328x0 F7 = g02.F();
            D7.e();
            L0.A((L0) D7.f9699b, F7);
            X0 E4 = g02.E();
            D7.e();
            L0.z((L0) D7.f9699b, E4);
            int D9 = g02.D();
            D7.e();
            L0.B((L0) D7.f9699b, D9);
            B7.e();
            M0.z((M0) B7.f9699b, (L0) D7.b());
        }
        return (M0) B7.b();
    }
}
