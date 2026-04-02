package c6;

import D.AbstractC0055e;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: c6.f1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0666f1 {

    /* renamed from: a  reason: collision with root package name */
    public final C0660d1 f8823a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f8824b;

    /* renamed from: c  reason: collision with root package name */
    public final Map f8825c;

    /* renamed from: d  reason: collision with root package name */
    public final Z1 f8826d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f8827e;
    public final Map f;

    public C0666f1(C0660d1 c0660d1, HashMap hashMap, HashMap hashMap2, Z1 z12, Object obj, Map map) {
        Map map2;
        this.f8823a = c0660d1;
        this.f8824b = androidx.datastore.preferences.protobuf.Y.n(hashMap);
        this.f8825c = androidx.datastore.preferences.protobuf.Y.n(hashMap2);
        this.f8826d = z12;
        this.f8827e = obj;
        if (map != null) {
            map2 = DesugarCollections.unmodifiableMap(new HashMap(map));
        } else {
            map2 = null;
        }
        this.f = map2;
    }

    public static C0666f1 a(Map map, boolean z7, int i7, int i8, Object obj) {
        Z1 z12;
        Map g3;
        boolean z8;
        Map g4;
        boolean z9;
        boolean z10;
        Z1 z13;
        if (z7) {
            if (map == null || (g4 = C0.g("retryThrottling", map)) == null) {
                z13 = null;
            } else {
                float floatValue = C0.e("maxTokens", g4).floatValue();
                float floatValue2 = C0.e("tokenRatio", g4).floatValue();
                if (floatValue > 0.0f) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                G.i.o("maxToken should be greater than zero", z9);
                if (floatValue2 > 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                G.i.o("tokenRatio should be greater than zero", z10);
                z13 = new Z1(floatValue, floatValue2);
            }
            z12 = z13;
        } else {
            z12 = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (map == null) {
            g3 = null;
        } else {
            g3 = C0.g("healthCheckConfig", map);
        }
        List<Map> c8 = C0.c("methodConfig", map);
        if (c8 == null) {
            c8 = null;
        } else {
            C0.a(c8);
        }
        if (c8 == null) {
            return new C0666f1(null, hashMap, hashMap2, z12, obj, g3);
        }
        C0660d1 c0660d1 = null;
        for (Map map2 : c8) {
            C0660d1 c0660d12 = new C0660d1(map2, z7, i7, i8);
            List<Map> c9 = C0.c("name", map2);
            if (c9 == null) {
                c9 = null;
            } else {
                C0.a(c9);
            }
            if (c9 != null && !c9.isEmpty()) {
                for (Map map3 : c9) {
                    String h8 = C0.h("service", map3);
                    String h9 = C0.h("method", map3);
                    if (H4.W.x(h8)) {
                        G.i.e(h9, "missing service name for method %s", H4.W.x(h9));
                        if (c0660d1 == null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        G.i.e(map, "Duplicate default method config in service config %s", z8);
                        c0660d1 = c0660d12;
                    } else if (H4.W.x(h9)) {
                        G.i.e(h8, "Duplicate service %s", !hashMap2.containsKey(h8));
                        hashMap2.put(h8, c0660d12);
                    } else {
                        String c10 = Q0.A.c(h8, h9);
                        G.i.e(c10, "Duplicate method name %s", !hashMap.containsKey(c10));
                        hashMap.put(c10, c0660d12);
                    }
                }
            }
        }
        return new C0666f1(c0660d1, hashMap, hashMap2, z12, obj, g3);
    }

    public final C0663e1 b() {
        if (this.f8825c.isEmpty() && this.f8824b.isEmpty() && this.f8823a == null) {
            return null;
        }
        return new C0663e1(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0666f1.class != obj.getClass()) {
            return false;
        }
        C0666f1 c0666f1 = (C0666f1) obj;
        if (F.f.l(this.f8823a, c0666f1.f8823a) && F.f.l(this.f8824b, c0666f1.f8824b) && F.f.l(this.f8825c, c0666f1.f8825c) && F.f.l(this.f8826d, c0666f1.f8826d) && F.f.l(this.f8827e, c0666f1.f8827e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8823a, this.f8824b, this.f8825c, this.f8826d, this.f8827e});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f8823a, "defaultMethodConfig");
        C7.a(this.f8824b, "serviceMethodMap");
        C7.a(this.f8825c, "serviceMap");
        C7.a(this.f8826d, "retryThrottling");
        C7.a(this.f8827e, "loadBalancingConfig");
        return C7.toString();
    }
}
