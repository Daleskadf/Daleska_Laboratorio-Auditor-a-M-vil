package t0;

import Q6.p;
import Q6.q;
import Q6.r;
import Q6.s;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0547y;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0530g;
import androidx.datastore.preferences.protobuf.C0534k;
import androidx.datastore.preferences.protobuf.InterfaceC0548z;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.jvm.internal.j;
import m6.AbstractC1447h;
import s0.C1753d;
import s0.C1755f;
import s0.C1756g;
import s0.C1757h;
import s0.C1758i;
import s0.C1760k;
import s0.EnumC1759j;
/* renamed from: t0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1809h {

    /* renamed from: a  reason: collision with root package name */
    public static final C1809h f15713a = new Object();

    public final C1803b a(s sVar) {
        int i7;
        byte[] bArr;
        try {
            C1755f q2 = C1755f.q(new r(sVar));
            C1803b c1803b = new C1803b(false);
            AbstractC1806e[] pairs = (AbstractC1806e[]) Arrays.copyOf(new AbstractC1806e[0], 0);
            j.e(pairs, "pairs");
            c1803b.b();
            if (pairs.length <= 0) {
                Map o7 = q2.o();
                j.d(o7, "preferencesProto.preferencesMap");
                for (Map.Entry entry : o7.entrySet()) {
                    String name = (String) entry.getKey();
                    C1760k value = (C1760k) entry.getValue();
                    j.d(name, "name");
                    j.d(value, "value");
                    EnumC1759j E4 = value.E();
                    if (E4 == null) {
                        i7 = -1;
                    } else {
                        i7 = AbstractC1808g.f15712a[E4.ordinal()];
                    }
                    switch (i7) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            c1803b.d(new C1805d(name), Boolean.valueOf(value.v()));
                            break;
                        case 2:
                            c1803b.d(new C1805d(name), Float.valueOf(value.z()));
                            break;
                        case 3:
                            c1803b.d(new C1805d(name), Double.valueOf(value.y()));
                            break;
                        case 4:
                            c1803b.d(new C1805d(name), Integer.valueOf(value.A()));
                            break;
                        case 5:
                            c1803b.d(new C1805d(name), Long.valueOf(value.B()));
                            break;
                        case 6:
                            C1805d c1805d = new C1805d(name);
                            String C7 = value.C();
                            j.d(C7, "value.string");
                            c1803b.d(c1805d, C7);
                            break;
                        case 7:
                            C1805d c1805d2 = new C1805d(name);
                            InterfaceC0548z p7 = value.D().p();
                            j.d(p7, "value.stringSet.stringsList");
                            c1803b.d(c1805d2, AbstractC1447h.b0(p7));
                            break;
                        case 8:
                            C1805d c1805d3 = new C1805d(name);
                            C0530g w2 = value.w();
                            int size = w2.size();
                            if (size == 0) {
                                bArr = A.f7748b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                w2.i(bArr2, size);
                                bArr = bArr2;
                            }
                            j.d(bArr, "value.bytes.toByteArray()");
                            c1803b.d(c1805d3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new C1803b(new LinkedHashMap(c1803b.a()), true);
            }
            AbstractC1806e abstractC1806e = pairs[0];
            throw null;
        } catch (C e7) {
            throw new IOException("Unable to parse preferences proto.", e7);
        }
    }

    public final void b(Object obj, q qVar) {
        AbstractC0547y a7;
        Map a8 = ((C1803b) obj).a();
        C1753d p7 = C1755f.p();
        for (Map.Entry entry : a8.entrySet()) {
            Object value = entry.getValue();
            String str = ((C1805d) entry.getKey()).f15708a;
            if (value instanceof Boolean) {
                C1758i F7 = C1760k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F7.c();
                C1760k.s((C1760k) F7.f7871b, booleanValue);
                a7 = F7.a();
            } else if (value instanceof Float) {
                C1758i F8 = C1760k.F();
                float floatValue = ((Number) value).floatValue();
                F8.c();
                C1760k.t((C1760k) F8.f7871b, floatValue);
                a7 = F8.a();
            } else if (value instanceof Double) {
                C1758i F9 = C1760k.F();
                double doubleValue = ((Number) value).doubleValue();
                F9.c();
                C1760k.q((C1760k) F9.f7871b, doubleValue);
                a7 = F9.a();
            } else if (value instanceof Integer) {
                C1758i F10 = C1760k.F();
                int intValue = ((Number) value).intValue();
                F10.c();
                C1760k.u((C1760k) F10.f7871b, intValue);
                a7 = F10.a();
            } else if (value instanceof Long) {
                C1758i F11 = C1760k.F();
                long longValue = ((Number) value).longValue();
                F11.c();
                C1760k.n((C1760k) F11.f7871b, longValue);
                a7 = F11.a();
            } else if (value instanceof String) {
                C1758i F12 = C1760k.F();
                F12.c();
                C1760k.o((C1760k) F12.f7871b, (String) value);
                a7 = F12.a();
            } else if (value instanceof Set) {
                C1758i F13 = C1760k.F();
                C1756g q2 = C1757h.q();
                j.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q2.c();
                C1757h.n((C1757h) q2.f7871b, (Set) value);
                F13.c();
                C1760k.p((C1760k) F13.f7871b, (C1757h) q2.a());
                a7 = F13.a();
            } else if (value instanceof byte[]) {
                C1758i F14 = C1760k.F();
                byte[] bArr = (byte[]) value;
                C0530g c0530g = C0530g.f7818c;
                C0530g h8 = C0530g.h(bArr, 0, bArr.length);
                F14.c();
                C1760k.r((C1760k) F14.f7871b, h8);
                a7 = F14.a();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            p7.getClass();
            str.getClass();
            p7.c();
            C1755f.n((C1755f) p7.f7871b).put(str, (C1760k) a7);
        }
        C1755f c1755f = (C1755f) p7.a();
        p pVar = new p(qVar, 0);
        int a9 = c1755f.a(null);
        Logger logger = C0534k.f7840g;
        if (a9 > 4096) {
            a9 = 4096;
        }
        C0534k c0534k = new C0534k(pVar, a9);
        c1755f.b(c0534k);
        if (c0534k.f7845e > 0) {
            c0534k.l0();
        }
    }
}
