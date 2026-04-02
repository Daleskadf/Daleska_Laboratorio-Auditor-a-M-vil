package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f7796a;

    /* renamed from: b  reason: collision with root package name */
    public static final i0 f7797b;

    /* renamed from: c  reason: collision with root package name */
    public static final i0 f7798c;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.datastore.preferences.protobuf.i0] */
    static {
        Class<?> cls;
        Class<?> cls2;
        X x7 = X.f7783c;
        i0 i0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f7796a = cls;
        try {
            X x8 = X.f7783c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                i0Var = (i0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f7797b = i0Var;
        f7798c = new Object();
    }

    public static void A(i0 i0Var, Object obj, Object obj2) {
        i0Var.getClass();
        AbstractC0547y abstractC0547y = (AbstractC0547y) obj;
        h0 h0Var = abstractC0547y.unknownFields;
        h0 h0Var2 = ((AbstractC0547y) obj2).unknownFields;
        h0 h0Var3 = h0.f;
        if (!h0Var3.equals(h0Var2)) {
            if (h0Var3.equals(h0Var)) {
                int i7 = h0Var.f7828a + h0Var2.f7828a;
                int[] copyOf = Arrays.copyOf(h0Var.f7829b, i7);
                System.arraycopy(h0Var2.f7829b, 0, copyOf, h0Var.f7828a, h0Var2.f7828a);
                Object[] copyOf2 = Arrays.copyOf(h0Var.f7830c, i7);
                System.arraycopy(h0Var2.f7830c, 0, copyOf2, h0Var.f7828a, h0Var2.f7828a);
                h0Var = new h0(i7, copyOf, copyOf2, true);
            } else {
                h0Var.getClass();
                if (!h0Var2.equals(h0Var3)) {
                    if (h0Var.f7832e) {
                        int i8 = h0Var.f7828a + h0Var2.f7828a;
                        h0Var.a(i8);
                        System.arraycopy(h0Var2.f7829b, 0, h0Var.f7829b, h0Var.f7828a, h0Var2.f7828a);
                        System.arraycopy(h0Var2.f7830c, 0, h0Var.f7830c, h0Var.f7828a, h0Var2.f7828a);
                        h0Var.f7828a = i8;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0547y.unknownFields = h0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void C(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Boolean) list.get(i11)).getClass();
                    Logger logger = C0534k.f7840g;
                    i10++;
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.n0(((Boolean) list.get(i9)).booleanValue() ? (byte) 1 : (byte) 0);
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.p0(i7, ((Boolean) list.get(i9)).booleanValue());
                i9++;
            }
        }
    }

    public static void D(int i7, List list, I i8) {
        if (list != null && !list.isEmpty()) {
            i8.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((C0534k) i8.f7755a).q0(i7, (C0530g) list.get(i9));
            }
        }
    }

    public static void E(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Double) list.get(i11)).getClass();
                    Logger logger = C0534k.f7840g;
                    i10 += 8;
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.v0(Double.doubleToRawLongBits(((Double) list.get(i9)).doubleValue()));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                double doubleValue = ((Double) list.get(i9)).doubleValue();
                c0534k.getClass();
                c0534k.u0(i7, Double.doubleToRawLongBits(doubleValue));
                i9++;
            }
        }
    }

    public static void F(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0534k.k0(((Integer) list.get(i11)).intValue());
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.x0(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.w0(i7, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void G(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C0534k.f7840g;
                    i10 += 4;
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.t0(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.s0(i7, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void H(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C0534k.f7840g;
                    i10 += 8;
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.v0(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.u0(i7, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void I(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Float) list.get(i11)).getClass();
                    Logger logger = C0534k.f7840g;
                    i10 += 4;
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.t0(Float.floatToRawIntBits(((Float) list.get(i9)).floatValue()));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                float floatValue = ((Float) list.get(i9)).floatValue();
                c0534k.getClass();
                c0534k.s0(i7, Float.floatToRawIntBits(floatValue));
                i9++;
            }
        }
    }

    public static void J(int i7, List list, I i8, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            i8.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8.h(i7, list.get(i9), b0Var);
            }
        }
    }

    public static void K(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0534k.k0(((Integer) list.get(i11)).intValue());
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.x0(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.w0(i7, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void L(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0534k.k0(((Long) list.get(i11)).longValue());
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.E0(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.D0(i7, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void M(int i7, List list, I i8, b0 b0Var) {
        if (list != null && !list.isEmpty()) {
            i8.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8.k(i7, list.get(i9), b0Var);
            }
        }
    }

    public static void N(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Integer) list.get(i11)).getClass();
                    Logger logger = C0534k.f7840g;
                    i10 += 4;
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.t0(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.s0(i7, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void O(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    ((Long) list.get(i11)).getClass();
                    Logger logger = C0534k.f7840g;
                    i10 += 8;
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.v0(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.u0(i7, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static void P(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    int intValue = ((Integer) list.get(i11)).intValue();
                    i10 += C0534k.i0((intValue >> 31) ^ (intValue << 1));
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    int intValue2 = ((Integer) list.get(i9)).intValue();
                    c0534k.C0((intValue2 >> 31) ^ (intValue2 << 1));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                int intValue3 = ((Integer) list.get(i9)).intValue();
                c0534k.B0(i7, (intValue3 >> 31) ^ (intValue3 << 1));
                i9++;
            }
        }
    }

    public static void Q(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    i10 += C0534k.k0((longValue >> 63) ^ (longValue << 1));
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    long longValue2 = ((Long) list.get(i9)).longValue();
                    c0534k.E0((longValue2 >> 63) ^ (longValue2 << 1));
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                long longValue3 = ((Long) list.get(i9)).longValue();
                c0534k.D0(i7, (longValue3 >> 63) ^ (longValue3 << 1));
                i9++;
            }
        }
    }

    public static void R(int i7, List list, I i8) {
        if (list != null && !list.isEmpty()) {
            i8.getClass();
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((C0534k) i8.f7755a).y0(i7, (String) list.get(i9));
            }
        }
    }

    public static void S(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0534k.i0(((Integer) list.get(i11)).intValue());
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.C0(((Integer) list.get(i9)).intValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.B0(i7, ((Integer) list.get(i9)).intValue());
                i9++;
            }
        }
    }

    public static void T(int i7, List list, I i8, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0534k c0534k = (C0534k) i8.f7755a;
            int i9 = 0;
            if (z7) {
                c0534k.A0(i7, 2);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    i10 += C0534k.k0(((Long) list.get(i11)).longValue());
                }
                c0534k.C0(i10);
                while (i9 < list.size()) {
                    c0534k.E0(((Long) list.get(i9)).longValue());
                    i9++;
                }
                return;
            }
            while (i9 < list.size()) {
                c0534k.D0(i7, ((Long) list.get(i9)).longValue());
                i9++;
            }
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0534k.Q(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g02 = C0534k.g0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int size2 = ((C0530g) list.get(i8)).size();
            g02 += C0534k.i0(size2) + size2;
        }
        return g02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0534k.g0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0534k.k0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0534k.U(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0534k.V(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, b0 b0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0534k.X(i7, (AbstractC0524a) list.get(i9), b0Var);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0534k.g0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0534k.k0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0534k.g0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0534k.k0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, b0 b0Var) {
        int g02 = C0534k.g0(i7);
        int a7 = ((AbstractC0524a) obj).a(b0Var);
        return C0534k.i0(a7) + a7 + g02;
    }

    public static int p(int i7, List list, b0 b0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g02 = C0534k.g0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int a7 = ((AbstractC0524a) list.get(i8)).a(b0Var);
            g02 += C0534k.i0(a7) + a7;
        }
        return g02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0534k.g0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i7 += C0534k.i0((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0534k.g0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += C0534k.k0((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int g02 = C0534k.g0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = list.get(i8);
            if (obj instanceof C0530g) {
                int size2 = ((C0530g) obj).size();
                g02 = C0534k.i0(size2) + size2 + g02;
            } else {
                g02 = C0534k.f0((String) obj) + g02;
            }
        }
        return g02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0534k.g0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0534k.i0(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0534k.g0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0534k.k0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Object z(Object obj, int i7, InterfaceC0548z interfaceC0548z, Object obj2, i0 i0Var) {
        return obj2;
    }
}
