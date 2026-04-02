package q4;

import H4.C0159f0;
import H4.C0163h0;
import H4.n1;
import H4.o1;
import H4.p1;
import com.google.protobuf.G;
import com.google.protobuf.I;
import h3.AbstractC1079a;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public final class o implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public p1 f15367a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15368b;

    public o(p1 p1Var) {
        this.f15368b = new HashMap();
        m5.d.i("ObjectValues should be backed by a MapValue", p1Var.R() == o1.MAP_VALUE, new Object[0]);
        m5.d.i("ServerTimestamps should not be used as an ObjectValue", !AbstractC1079a.o(p1Var), new Object[0]);
        this.f15367a = p1Var;
    }

    public static r4.f c(C0163h0 c0163h0) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : c0163h0.y().entrySet()) {
            e eVar = new e(Collections.singletonList((String) entry.getKey()));
            p1 p1Var = (p1) entry.getValue();
            p1 p1Var2 = s.f15373a;
            if (p1Var != null && p1Var.R() == o1.MAP_VALUE) {
                HashSet hashSet2 = c(((p1) entry.getValue()).N()).f15493a;
                if (hashSet2.isEmpty()) {
                    hashSet.add(eVar);
                } else {
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        hashSet.add((k) eVar.b((k) it.next()));
                    }
                }
            } else {
                hashSet.add(eVar);
            }
        }
        return new r4.f(hashSet);
    }

    public static p1 d(p1 p1Var, k kVar) {
        if (kVar.h()) {
            return p1Var;
        }
        for (int i7 = 0; i7 < kVar.f15351a.size() - 1; i7++) {
            p1Var = p1Var.N().z(kVar.g(i7));
            p1 p1Var2 = s.f15373a;
            if (p1Var == null || p1Var.R() != o1.MAP_VALUE) {
                return null;
            }
        }
        return p1Var.N().z(kVar.f());
    }

    public static o e(Map map) {
        n1 T7 = p1.T();
        C0159f0 B7 = C0163h0.B();
        B7.d();
        C0163h0.v((C0163h0) B7.f10006b).putAll(map);
        T7.i(B7);
        return new o((p1) T7.b());
    }

    public final C0163h0 a(k kVar, Map map) {
        C0159f0 B7;
        boolean z7;
        p1 d7 = d(this.f15367a, kVar);
        p1 p1Var = s.f15373a;
        if (d7 != null && d7.R() == o1.MAP_VALUE) {
            C0163h0 N7 = d7.N();
            G g3 = (G) N7.j(I.NEW_BUILDER);
            if (!g3.f10005a.equals(N7)) {
                g3.d();
                G.e(g3.f10006b, N7);
            }
            B7 = (C0159f0) g3;
        } else {
            B7 = C0163h0.B();
        }
        boolean z8 = false;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                C0163h0 a7 = a((k) kVar.a(str), (Map) value);
                if (a7 != null) {
                    n1 T7 = p1.T();
                    T7.j(a7);
                    B7.f((p1) T7.b(), str);
                    z8 = true;
                }
            } else {
                if (value instanceof p1) {
                    B7.f((p1) value, str);
                } else {
                    B7.getClass();
                    str.getClass();
                    if (((C0163h0) B7.f10006b).y().containsKey(str)) {
                        if (value == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        m5.d.i("Expected entry to be a Map, a Value or null", z7, new Object[0]);
                        B7.d();
                        C0163h0.v((C0163h0) B7.f10006b).remove(str);
                    }
                }
                z8 = true;
            }
        }
        if (z8) {
            return (C0163h0) B7.b();
        }
        return null;
    }

    public final p1 b() {
        synchronized (this.f15368b) {
            try {
                C0163h0 a7 = a(k.f15361c, this.f15368b);
                if (a7 != null) {
                    n1 T7 = p1.T();
                    T7.j(a7);
                    this.f15367a = (p1) T7.b();
                    this.f15368b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f15367a;
    }

    public final Object clone() {
        return new o(b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return s.e(b(), ((o) obj).b());
        }
        return false;
    }

    public final p1 f(k kVar) {
        return d(b(), kVar);
    }

    public final void g(p1 p1Var, k kVar) {
        m5.d.i("Cannot set field for empty path on ObjectValue", !kVar.h(), new Object[0]);
        i(p1Var, kVar);
    }

    public final void h(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            k kVar = (k) entry.getKey();
            if (entry.getValue() == null) {
                m5.d.i("Cannot delete field for empty path on ObjectValue", !kVar.h(), new Object[0]);
                i(null, kVar);
            } else {
                g((p1) entry.getValue(), kVar);
            }
        }
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final void i(p1 p1Var, k kVar) {
        Map hashMap;
        Map map = this.f15368b;
        for (int i7 = 0; i7 < kVar.f15351a.size() - 1; i7++) {
            String g3 = kVar.g(i7);
            Object obj = map.get(g3);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof p1) {
                    p1 p1Var2 = (p1) obj;
                    if (p1Var2.R() == o1.MAP_VALUE) {
                        HashMap hashMap2 = new HashMap(p1Var2.N().y());
                        map.put(g3, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap();
                map.put(g3, hashMap);
            }
            map = hashMap;
        }
        map.put(kVar.f(), p1Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectValue{internalValue=");
        p1 b5 = b();
        p1 p1Var = s.f15373a;
        StringBuilder sb2 = new StringBuilder();
        s.a(sb2, b5);
        sb.append(sb2.toString());
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o() {
        /*
            r2 = this;
            H4.n1 r0 = H4.p1.T()
            H4.h0 r1 = H4.C0163h0.w()
            r0.j(r1)
            com.google.protobuf.J r0 = r0.b()
            H4.p1 r0 = (H4.p1) r0
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.o.<init>():void");
    }
}
