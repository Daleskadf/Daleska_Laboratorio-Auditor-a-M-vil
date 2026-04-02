package i6;

import a6.AbstractC0478g;
import a6.Q;
import a6.S;
import a6.T;
import a6.h0;
import a6.o0;
import c6.C0;
import c6.j2;
import c6.k2;
import java.util.List;
import java.util.Map;
/* renamed from: i6.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1133t extends S {
    public static h0 f(Map map) {
        Long l8;
        Long l9;
        Long l10;
        Integer num;
        C1126m c1126m;
        C1126m c1126m2;
        List list;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num2;
        Integer num3;
        boolean z13;
        boolean z14;
        boolean z15;
        Long i7 = C0.i("interval", map);
        Long i8 = C0.i("baseEjectionTime", map);
        Long i9 = C0.i("maxEjectionTime", map);
        Integer f = C0.f("maxEjectionPercentage", map);
        if (i7 != null) {
            l8 = i7;
        } else {
            l8 = 10000000000L;
        }
        if (i8 != null) {
            l9 = i8;
        } else {
            l9 = 30000000000L;
        }
        if (i9 != null) {
            l10 = i9;
        } else {
            l10 = 300000000000L;
        }
        if (f != null) {
            num = f;
        } else {
            num = 10;
        }
        Map g3 = C0.g("successRateEjection", map);
        if (g3 != null) {
            Integer num4 = 1900;
            Integer num5 = 100;
            Integer f4 = C0.f("stdevFactor", g3);
            Integer f8 = C0.f("enforcementPercentage", g3);
            Integer f9 = C0.f("minimumHosts", g3);
            Integer f10 = C0.f("requestVolume", g3);
            if (f4 != null) {
                num4 = f4;
            }
            if (f8 != null) {
                if (f8.intValue() >= 0 && f8.intValue() <= 100) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                G.i.g(z15);
                num2 = f8;
            } else {
                num2 = num5;
            }
            if (f9 != null) {
                if (f9.intValue() >= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                G.i.g(z14);
                num3 = f9;
            } else {
                num3 = 5;
            }
            if (f10 != null) {
                if (f10.intValue() >= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                G.i.g(z13);
                num5 = f10;
            }
            c1126m = new C1126m(num4, num2, num3, num5);
        } else {
            c1126m = null;
        }
        Map g4 = C0.g("failurePercentageEjection", map);
        if (g4 != null) {
            Integer num6 = 85;
            Integer num7 = 100;
            Integer num8 = 5;
            Integer num9 = 50;
            Integer f11 = C0.f("threshold", g4);
            Integer f12 = C0.f("enforcementPercentage", g4);
            Integer f13 = C0.f("minimumHosts", g4);
            Integer f14 = C0.f("requestVolume", g4);
            if (f11 != null) {
                if (f11.intValue() >= 0 && f11.intValue() <= 100) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                G.i.g(z12);
                num6 = f11;
            }
            if (f12 != null) {
                if (f12.intValue() >= 0 && f12.intValue() <= 100) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                G.i.g(z11);
                num7 = f12;
            }
            if (f13 != null) {
                if (f13.intValue() >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                G.i.g(z10);
                num8 = f13;
            }
            if (f14 != null) {
                if (f14.intValue() >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                G.i.g(z9);
                num9 = f14;
            }
            c1126m2 = new C1126m(num6, num7, num8, num9);
        } else {
            c1126m2 = null;
        }
        List c8 = C0.c("childPolicy", map);
        if (c8 == null) {
            list = null;
        } else {
            C0.a(c8);
            list = c8;
        }
        List u7 = k2.u(list);
        if (u7 != null && !u7.isEmpty()) {
            h0 t7 = k2.t(u7, T.b());
            if (t7.f7153a != null) {
                return t7;
            }
            j2 j2Var = (j2) t7.f7154b;
            if (j2Var != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            G.i.p(z7);
            if (j2Var != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            G.i.p(z8);
            return new h0(new C1127n(l8, l9, l10, num, c1126m, c1126m2, j2Var));
        }
        return new h0(o0.f7179m.g("No child policy in outlier_detection_experimental LB policy: " + map));
    }

    @Override // a6.S
    public String a() {
        return "outlier_detection_experimental";
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
    public final Q d(AbstractC0478g abstractC0478g) {
        return new C1132s(abstractC0478g);
    }

    @Override // a6.S
    public h0 e(Map map) {
        try {
            return f(map);
        } catch (RuntimeException e7) {
            o0 f = o0.f7180n.f(e7);
            return new h0(f.g("Failed parsing configuration for " + a()));
        }
    }
}
