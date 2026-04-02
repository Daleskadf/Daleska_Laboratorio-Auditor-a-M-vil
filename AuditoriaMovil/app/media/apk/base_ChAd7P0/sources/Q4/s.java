package q4;

import H4.C0159f0;
import H4.C0160g;
import H4.C0163h0;
import H4.InterfaceC0162h;
import H4.n1;
import H4.o1;
import H4.p1;
import com.google.protobuf.AbstractC0852m;
import com.google.protobuf.C0850l;
import com.google.protobuf.EnumC0870v0;
import com.google.protobuf.M0;
import com.google.protobuf.N0;
import h3.AbstractC1079a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import l4.C1418b;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import p5.C1696b;
import p5.C1697c;
import u4.u;
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final p1 f15373a;

    /* renamed from: b  reason: collision with root package name */
    public static final p1 f15374b;

    /* renamed from: c  reason: collision with root package name */
    public static final p1 f15375c;

    /* renamed from: d  reason: collision with root package name */
    public static final p1 f15376d;

    /* renamed from: e  reason: collision with root package name */
    public static final p1 f15377e;
    public static final p1 f;

    /* renamed from: g  reason: collision with root package name */
    public static final p1 f15378g;

    /* renamed from: h  reason: collision with root package name */
    public static final p1 f15379h;

    /* renamed from: i  reason: collision with root package name */
    public static final p1 f15380i;
    public static final p1 j;

    /* renamed from: k  reason: collision with root package name */
    public static final p1 f15381k;

    /* renamed from: l  reason: collision with root package name */
    public static final p1 f15382l;

    /* renamed from: m  reason: collision with root package name */
    public static final p1 f15383m;

    /* renamed from: n  reason: collision with root package name */
    public static final p1 f15384n;

    /* renamed from: o  reason: collision with root package name */
    public static final p1 f15385o;

    /* renamed from: p  reason: collision with root package name */
    public static final p1 f15386p;

    static {
        n1 T7 = p1.T();
        T7.g(Double.NaN);
        f15373a = (p1) T7.b();
        n1 T8 = p1.T();
        EnumC0870v0 enumC0870v0 = EnumC0870v0.NULL_VALUE;
        T8.d();
        p1.C((p1) T8.f10006b, enumC0870v0);
        p1 p1Var = (p1) T8.b();
        f15374b = p1Var;
        f15375c = p1Var;
        n1 T9 = p1.T();
        T9.k("__max__");
        p1 p1Var2 = (p1) T9.b();
        f15376d = p1Var2;
        n1 T10 = p1.T();
        C0159f0 B7 = C0163h0.B();
        B7.f(p1Var2, "__type__");
        T10.i(B7);
        f15377e = (p1) T10.b();
        n1 T11 = p1.T();
        T11.k("__vector__");
        p1 p1Var3 = (p1) T11.b();
        f = p1Var3;
        n1 T12 = p1.T();
        C0159f0 B8 = C0163h0.B();
        B8.f(p1Var3, "__type__");
        n1 T13 = p1.T();
        T13.f(C0160g.B());
        B8.f((p1) T13.b(), MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        T12.i(B8);
        f15378g = (p1) T12.b();
        n1 T14 = p1.T();
        T14.d();
        p1.D((p1) T14.f10006b, false);
        f15379h = (p1) T14.b();
        n1 T15 = p1.T();
        T15.g(Double.NaN);
        f15380i = (p1) T15.b();
        n1 T16 = p1.T();
        M0 A7 = N0.A();
        A7.f(Long.MIN_VALUE);
        T16.l(A7);
        j = (p1) T16.b();
        n1 T17 = p1.T();
        T17.k(StringUtils.EMPTY);
        f15381k = (p1) T17.b();
        n1 T18 = p1.T();
        C0850l c0850l = AbstractC0852m.f10085b;
        T18.d();
        p1.x((p1) T18.f10006b, c0850l);
        f15382l = (p1) T18.b();
        h b5 = h.b();
        n1 T19 = p1.T();
        T19.d();
        p1.y((p1) T19.f10006b, "projects//databases//documents/" + b5.f15357a.c());
        f15383m = (p1) T19.b();
        n1 T20 = p1.T();
        C1696b A8 = C1697c.A();
        A8.d();
        C1697c.v((C1697c) A8.f10006b, -90.0d);
        A8.d();
        C1697c.w((C1697c) A8.f10006b, -180.0d);
        T20.d();
        p1.z((p1) T20.f10006b, (C1697c) A8.b());
        f15384n = (p1) T20.b();
        n1 T21 = p1.T();
        C0160g y2 = C0160g.y();
        T21.d();
        p1.A(y2, (p1) T21.f10006b);
        f15385o = (p1) T21.b();
        n1 T22 = p1.T();
        T22.j(C0163h0.w());
        f15386p = (p1) T22.b();
    }

    public static void a(StringBuilder sb, p1 p1Var) {
        boolean z7 = true;
        switch (r.f15372a[p1Var.R().ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(p1Var.H());
                return;
            case 3:
                sb.append(p1Var.M());
                return;
            case 4:
                sb.append(p1Var.K());
                return;
            case 5:
                N0 Q7 = p1Var.Q();
                sb.append("time(" + Q7.z() + "," + Q7.y() + ")");
                return;
            case 6:
                sb.append(p1Var.P());
                return;
            case 7:
                sb.append(u.j(p1Var.I()));
                return;
            case 8:
                m5.d.i("Value should be a ReferenceValue", i(p1Var), new Object[0]);
                sb.append(h.c(p1Var.O()));
                return;
            case 9:
                C1697c L6 = p1Var.L();
                sb.append("geo(" + L6.y() + "," + L6.z() + ")");
                return;
            case 10:
                C0160g G2 = p1Var.G();
                sb.append("[");
                for (int i7 = 0; i7 < G2.A(); i7++) {
                    a(sb, G2.z(i7));
                    if (i7 != G2.A() - 1) {
                        sb.append(",");
                    }
                }
                sb.append("]");
                return;
            case 11:
                C0163h0 N7 = p1Var.N();
                ArrayList arrayList = new ArrayList(N7.y().keySet());
                Collections.sort(arrayList);
                sb.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!z7) {
                        sb.append(",");
                    } else {
                        z7 = false;
                    }
                    sb.append(str);
                    sb.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    a(sb, N7.A(str));
                }
                sb.append("}");
                return;
            default:
                m5.d.g("Invalid value type: " + p1Var.R(), new Object[0]);
                throw null;
        }
    }

    public static int b(p1 p1Var, p1 p1Var2) {
        int i7 = 0;
        int l8 = l(p1Var);
        int l9 = l(p1Var2);
        if (l8 != l9) {
            return u.d(l8, l9);
        }
        if (l8 != Integer.MAX_VALUE) {
            switch (l8) {
                case 0:
                    return 0;
                case 1:
                    boolean H7 = p1Var.H();
                    boolean H8 = p1Var2.H();
                    C1418b c1418b = u.f16019a;
                    if (H7 == H8) {
                        return 0;
                    }
                    if (H7) {
                        return 1;
                    }
                    return -1;
                case 2:
                    o1 R7 = p1Var.R();
                    o1 o1Var = o1.DOUBLE_VALUE;
                    if (R7 == o1Var) {
                        double K7 = p1Var.K();
                        if (p1Var2.R() == o1Var) {
                            double K8 = p1Var2.K();
                            C1418b c1418b2 = u.f16019a;
                            return android.support.v4.media.session.a.m(K7, K8);
                        } else if (p1Var2.R() == o1.INTEGER_VALUE) {
                            return u.e(K7, p1Var2.M());
                        }
                    } else {
                        o1 R8 = p1Var.R();
                        o1 o1Var2 = o1.INTEGER_VALUE;
                        if (R8 == o1Var2) {
                            long M7 = p1Var.M();
                            if (p1Var2.R() == o1Var2) {
                                long M8 = p1Var2.M();
                                C1418b c1418b3 = u.f16019a;
                                return Long.compare(M7, M8);
                            } else if (p1Var2.R() == o1Var) {
                                return u.e(p1Var2.K(), M7) * (-1);
                            }
                        }
                    }
                    m5.d.g("Unexpected values: %s vs %s", p1Var, p1Var2);
                    throw null;
                case 3:
                    N0 Q7 = p1Var.Q();
                    N0 Q8 = p1Var2.Q();
                    long z7 = Q7.z();
                    long z8 = Q8.z();
                    C1418b c1418b4 = u.f16019a;
                    int compare = Long.compare(z7, z8);
                    if (compare == 0) {
                        return u.d(Q7.y(), Q8.y());
                    }
                    return compare;
                case 4:
                    N0 m7 = AbstractC1079a.m(p1Var);
                    N0 m8 = AbstractC1079a.m(p1Var2);
                    long z9 = m7.z();
                    long z10 = m8.z();
                    C1418b c1418b5 = u.f16019a;
                    int compare2 = Long.compare(z9, z10);
                    if (compare2 == 0) {
                        return u.d(m7.y(), m8.y());
                    }
                    return compare2;
                case 5:
                    return u.f(p1Var.P(), p1Var2.P());
                case 6:
                    return u.c(p1Var.I(), p1Var2.I());
                case 7:
                    String O7 = p1Var.O();
                    String O8 = p1Var2.O();
                    String[] split = O7.split("/", -1);
                    String[] split2 = O8.split("/", -1);
                    int min = Math.min(split.length, split2.length);
                    while (i7 < min) {
                        int compareTo = split[i7].compareTo(split2[i7]);
                        if (compareTo == 0) {
                            i7++;
                        } else {
                            return compareTo;
                        }
                    }
                    return u.d(split.length, split2.length);
                case 8:
                    C1697c L6 = p1Var.L();
                    C1697c L7 = p1Var2.L();
                    double y2 = L6.y();
                    double y3 = L7.y();
                    C1418b c1418b6 = u.f16019a;
                    int m9 = android.support.v4.media.session.a.m(y2, y3);
                    if (m9 == 0) {
                        return android.support.v4.media.session.a.m(L6.z(), L7.z());
                    }
                    return m9;
                case 9:
                    return c(p1Var.G(), p1Var2.G());
                case 10:
                    C0163h0 N7 = p1Var.N();
                    C0163h0 N8 = p1Var2.N();
                    Map y6 = N7.y();
                    Map y7 = N8.y();
                    C0160g G2 = ((p1) y6.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).G();
                    C0160g G7 = ((p1) y7.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).G();
                    int d7 = u.d(G2.A(), G7.A());
                    if (d7 == 0) {
                        return c(G2, G7);
                    }
                    return d7;
                case 11:
                    C0163h0 N9 = p1Var.N();
                    C0163h0 N10 = p1Var2.N();
                    Iterator it = new TreeMap(N9.y()).entrySet().iterator();
                    Iterator it2 = new TreeMap(N10.y()).entrySet().iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int f4 = u.f((String) entry.getKey(), (String) entry2.getKey());
                        if (f4 == 0) {
                            int b5 = b((p1) entry.getValue(), (p1) entry2.getValue());
                            if (b5 != 0) {
                                return b5;
                            }
                        } else {
                            return f4;
                        }
                    }
                    boolean hasNext = it.hasNext();
                    boolean hasNext2 = it2.hasNext();
                    C1418b c1418b7 = u.f16019a;
                    if (hasNext != hasNext2) {
                        if (hasNext) {
                            i7 = 1;
                        } else {
                            i7 = -1;
                        }
                    }
                    return i7;
                default:
                    m5.d.g(io.flutter.plugins.pathprovider.b.e(l8, "Invalid value type: "), new Object[0]);
                    throw null;
            }
        }
        return 0;
    }

    public static int c(C0160g c0160g, C0160g c0160g2) {
        int min = Math.min(c0160g.A(), c0160g2.A());
        for (int i7 = 0; i7 < min; i7++) {
            int b5 = b(c0160g.z(i7), c0160g2.z(i7));
            if (b5 != 0) {
                return b5;
            }
        }
        return u.d(c0160g.A(), c0160g2.A());
    }

    public static boolean d(InterfaceC0162h interfaceC0162h, p1 p1Var) {
        for (p1 p1Var2 : interfaceC0162h.a()) {
            if (e(p1Var2, p1Var)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
        if (r5.M() == r6.M()) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c7, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:
        if (java.lang.Double.doubleToLongBits(r5.K()) == java.lang.Double.doubleToLongBits(r6.K())) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(H4.p1 r5, H4.p1 r6) {
        /*
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto Led
            if (r6 != 0) goto Lb
            goto Led
        Lb:
            int r2 = l(r5)
            int r3 = l(r6)
            if (r2 == r3) goto L16
            return r1
        L16:
            r3 = 2
            if (r2 == r3) goto Lac
            r3 = 4
            if (r2 == r3) goto L9f
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L9e
            switch(r2) {
                case 9: goto L71;
                case 10: goto L29;
                case 11: goto L29;
                default: goto L24;
            }
        L24:
            boolean r5 = r5.equals(r6)
            return r5
        L29:
            H4.h0 r5 = r5.N()
            H4.h0 r6 = r6.N()
            int r2 = r5.x()
            int r3 = r6.x()
            if (r2 == r3) goto L3d
        L3b:
            r0 = r1
            goto L70
        L3d:
            java.util.Map r5 = r5.y()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map r3 = r6.y()
            java.lang.Object r4 = r2.getKey()
            java.lang.Object r3 = r3.get(r4)
            H4.p1 r3 = (H4.p1) r3
            java.lang.Object r2 = r2.getValue()
            H4.p1 r2 = (H4.p1) r2
            boolean r2 = e(r2, r3)
            if (r2 != 0) goto L49
            goto L3b
        L70:
            return r0
        L71:
            H4.g r5 = r5.G()
            H4.g r6 = r6.G()
            int r2 = r5.A()
            int r3 = r6.A()
            if (r2 == r3) goto L85
        L83:
            r0 = r1
            goto L9e
        L85:
            r2 = r1
        L86:
            int r3 = r5.A()
            if (r2 >= r3) goto L9e
            H4.p1 r3 = r5.z(r2)
            H4.p1 r4 = r6.z(r2)
            boolean r3 = e(r3, r4)
            if (r3 != 0) goto L9b
            goto L83
        L9b:
            int r2 = r2 + 1
            goto L86
        L9e:
            return r0
        L9f:
            com.google.protobuf.N0 r5 = h3.AbstractC1079a.m(r5)
            com.google.protobuf.N0 r6 = h3.AbstractC1079a.m(r6)
            boolean r5 = r5.equals(r6)
            return r5
        Lac:
            H4.o1 r2 = r5.R()
            H4.o1 r3 = H4.o1.INTEGER_VALUE
            if (r2 != r3) goto Lca
            H4.o1 r2 = r6.R()
            if (r2 != r3) goto Lca
            long r2 = r5.M()
            long r5 = r6.M()
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Lc7
            goto Lc8
        Lc7:
            r0 = r1
        Lc8:
            r1 = r0
            goto Led
        Lca:
            H4.o1 r2 = r5.R()
            H4.o1 r3 = H4.o1.DOUBLE_VALUE
            if (r2 != r3) goto Led
            H4.o1 r2 = r6.R()
            if (r2 != r3) goto Led
            double r2 = r5.K()
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r5 = r6.K()
            long r5 = java.lang.Double.doubleToLongBits(r5)
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto Lc7
            goto Lc8
        Led:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.s.e(H4.p1, H4.p1):boolean");
    }

    public static boolean f(p1 p1Var) {
        if (p1Var != null && p1Var.R() == o1.ARRAY_VALUE) {
            return true;
        }
        return false;
    }

    public static boolean g(p1 p1Var) {
        if (p1Var != null && p1Var.R() == o1.DOUBLE_VALUE) {
            return true;
        }
        return false;
    }

    public static boolean h(p1 p1Var) {
        if (p1Var != null && p1Var.R() == o1.INTEGER_VALUE) {
            return true;
        }
        return false;
    }

    public static boolean i(p1 p1Var) {
        if (p1Var != null && p1Var.R() == o1.REFERENCE_VALUE) {
            return true;
        }
        return false;
    }

    public static boolean j(p1 p1Var) {
        return f.equals(p1Var.N().y().get("__type__"));
    }

    public static p1 k(f fVar, h hVar) {
        n1 T7 = p1.T();
        T7.d();
        p1.y((p1) T7.f10006b, "projects/" + fVar.f15352a + "/databases/" + fVar.f15353b + "/documents/" + hVar.f15357a.c());
        return (p1) T7.b();
    }

    public static int l(p1 p1Var) {
        switch (r.f15372a[p1Var.R().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (AbstractC1079a.o(p1Var)) {
                    return 4;
                }
                if (f15376d.equals(p1Var.N().y().get("__type__"))) {
                    return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                }
                if (j(p1Var)) {
                    return 10;
                }
                return 11;
            default:
                m5.d.g("Invalid value type: " + p1Var.R(), new Object[0]);
                throw null;
        }
    }
}
