package com.google.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class F0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f10002a;

    /* renamed from: b  reason: collision with root package name */
    public static final Q0 f10003b;

    /* renamed from: c  reason: collision with root package name */
    public static final Q0 f10004c;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.protobuf.Q0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        Q0 q0 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f10002a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                q0 = (Q0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f10003b = q0;
        f10004c = new Object();
    }

    public static void A(Q0 q0, Object obj, Object obj2) {
        q0.getClass();
        J j = (J) obj;
        P0 p02 = j.unknownFields;
        P0 p03 = ((J) obj2).unknownFields;
        P0 p04 = P0.f;
        if (!p04.equals(p03)) {
            if (p04.equals(p02)) {
                int i7 = p02.f10025a + p03.f10025a;
                int[] copyOf = Arrays.copyOf(p02.f10026b, i7);
                System.arraycopy(p03.f10026b, 0, copyOf, p02.f10025a, p03.f10025a);
                Object[] copyOf2 = Arrays.copyOf(p02.f10027c, i7);
                System.arraycopy(p03.f10027c, 0, copyOf2, p02.f10025a, p03.f10025a);
                p02 = new P0(i7, copyOf, copyOf2, true);
            } else {
                p02.getClass();
                if (!p03.equals(p04)) {
                    if (p02.f10029e) {
                        int i8 = p02.f10025a + p03.f10025a;
                        p02.a(i8);
                        System.arraycopy(p03.f10026b, 0, p02.f10026b, p02.f10025a, p03.f10025a);
                        System.arraycopy(p03.f10027c, 0, p02.f10027c, p02.f10025a, p03.f10025a);
                        p02.f10025a = i8;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        j.unknownFields = p02;
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void C(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Boolean) list.get(i10)).getClass();
                    Logger logger = AbstractC0865t.f10136d;
                    i9++;
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.v0(((Boolean) list.get(i8)).booleanValue() ? (byte) 1 : (byte) 0);
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.w0(i7, ((Boolean) list.get(i8)).booleanValue());
                i8++;
            }
        }
    }

    public static void D(int i7, List list, C0845i0 c0845i0) {
        if (list != null && !list.isEmpty()) {
            c0845i0.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                ((AbstractC0865t) c0845i0.f10074a).y0(i7, (AbstractC0852m) list.get(i8));
            }
        }
    }

    public static void E(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Double) list.get(i10)).getClass();
                    Logger logger = AbstractC0865t.f10136d;
                    i9 += 8;
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.D0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                abstractC0865t.getClass();
                abstractC0865t.C0(i7, Double.doubleToRawLongBits(doubleValue));
                i8++;
            }
        }
    }

    public static void F(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += AbstractC0865t.h0(((Integer) list.get(i10)).intValue());
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.F0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.E0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void G(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = AbstractC0865t.f10136d;
                    i9 += 4;
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.B0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.A0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void H(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = AbstractC0865t.f10136d;
                    i9 += 8;
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.D0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.C0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void I(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Float) list.get(i10)).getClass();
                    Logger logger = AbstractC0865t.f10136d;
                    i9 += 4;
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.B0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                abstractC0865t.getClass();
                abstractC0865t.A0(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
        }
    }

    public static void J(int i7, List list, C0845i0 c0845i0, E0 e02) {
        if (list != null && !list.isEmpty()) {
            c0845i0.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                c0845i0.i(i7, list.get(i8), e02);
            }
        }
    }

    public static void K(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += AbstractC0865t.h0(((Integer) list.get(i10)).intValue());
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.F0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.E0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void L(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += AbstractC0865t.t0(((Long) list.get(i10)).longValue());
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.O0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void M(int i7, List list, C0845i0 c0845i0, E0 e02) {
        if (list != null && !list.isEmpty()) {
            c0845i0.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                c0845i0.l(i7, list.get(i8), e02);
            }
        }
    }

    public static void N(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = AbstractC0865t.f10136d;
                    i9 += 4;
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.B0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.A0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void O(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = AbstractC0865t.f10136d;
                    i9 += 8;
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.D0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.C0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void P(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    int intValue = ((Integer) list.get(i10)).intValue();
                    i9 += AbstractC0865t.r0((intValue >> 31) ^ (intValue << 1));
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    int intValue2 = ((Integer) list.get(i8)).intValue();
                    abstractC0865t.M0((intValue2 >> 31) ^ (intValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                abstractC0865t.L0(i7, (intValue3 >> 31) ^ (intValue3 << 1));
                i8++;
            }
        }
    }

    public static void Q(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i9 += AbstractC0865t.t0((longValue >> 63) ^ (longValue << 1));
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    long longValue2 = ((Long) list.get(i8)).longValue();
                    abstractC0865t.O0((longValue2 >> 63) ^ (longValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                abstractC0865t.N0(i7, (longValue3 >> 63) ^ (longValue3 << 1));
                i8++;
            }
        }
    }

    public static void R(int i7, List list, C0845i0 c0845i0) {
        if (list != null && !list.isEmpty()) {
            c0845i0.getClass();
            boolean z7 = list instanceof InterfaceC0831b0;
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                InterfaceC0831b0 interfaceC0831b0 = (InterfaceC0831b0) list;
                while (i8 < list.size()) {
                    Object c8 = interfaceC0831b0.c(i8);
                    if (c8 instanceof String) {
                        abstractC0865t.I0(i7, (String) c8);
                    } else {
                        abstractC0865t.y0(i7, (AbstractC0852m) c8);
                    }
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.I0(i7, (String) list.get(i8));
                i8++;
            }
        }
    }

    public static void S(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += AbstractC0865t.r0(((Integer) list.get(i10)).intValue());
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.M0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.L0(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void T(int i7, List list, C0845i0 c0845i0, boolean z7) {
        if (list != null && !list.isEmpty()) {
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            int i8 = 0;
            if (z7) {
                abstractC0865t.K0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += AbstractC0865t.t0(((Long) list.get(i10)).longValue());
                }
                abstractC0865t.M0(i9);
                while (i8 < list.size()) {
                    abstractC0865t.O0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                abstractC0865t.N0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0865t.X(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p02 = AbstractC0865t.p0(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            p02 += AbstractC0865t.Z((AbstractC0852m) list.get(i8));
        }
        return p02;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0865t.p0(i7) * size) + e(list);
    }

    public static int e(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P) {
            P p7 = (P) list;
            i7 = 0;
            while (i8 < size) {
                p7.i(i8);
                i7 += AbstractC0865t.h0(p7.f10023b[i8]);
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC0865t.h0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0865t.c0(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0865t.d0(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, E0 e02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += AbstractC0865t.f0(i7, (AbstractC0828a) list.get(i9), e02);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0865t.p0(i7) * size) + l(list);
    }

    public static int l(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P) {
            P p7 = (P) list;
            i7 = 0;
            while (i8 < size) {
                p7.i(i8);
                i7 += AbstractC0865t.h0(p7.f10023b[i8]);
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC0865t.h0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC0865t.p0(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0839f0) {
            AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0839f0.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0865t.t0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, E0 e02) {
        int p02 = AbstractC0865t.p0(i7);
        int c8 = ((AbstractC0828a) obj).c(e02);
        return AbstractC0865t.r0(c8) + c8 + p02;
    }

    public static int p(int i7, List list, E0 e02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int p02 = AbstractC0865t.p0(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int c8 = ((AbstractC0828a) list.get(i8)).c(e02);
            p02 += AbstractC0865t.r0(c8) + c8;
        }
        return p02;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0865t.p0(i7) * size) + r(list);
    }

    public static int r(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P) {
            P p7 = (P) list;
            i7 = 0;
            while (i8 < size) {
                p7.i(i8);
                int i9 = p7.f10023b[i8];
                i7 += AbstractC0865t.r0((i9 >> 31) ^ (i9 << 1));
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                int intValue = ((Integer) list.get(i8)).intValue();
                i7 += AbstractC0865t.r0((intValue >> 31) ^ (intValue << 1));
                i8++;
            }
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0865t.p0(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0839f0) {
            AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0839f0.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += AbstractC0865t.t0((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int o02;
        int o03;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int p02 = AbstractC0865t.p0(i7) * size;
        if (list instanceof InterfaceC0831b0) {
            InterfaceC0831b0 interfaceC0831b0 = (InterfaceC0831b0) list;
            while (i8 < size) {
                Object c8 = interfaceC0831b0.c(i8);
                if (c8 instanceof AbstractC0852m) {
                    o03 = AbstractC0865t.Z((AbstractC0852m) c8);
                } else {
                    o03 = AbstractC0865t.o0((String) c8);
                }
                p02 = o03 + p02;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof AbstractC0852m) {
                    o02 = AbstractC0865t.Z((AbstractC0852m) obj);
                } else {
                    o02 = AbstractC0865t.o0((String) obj);
                }
                p02 = o02 + p02;
                i8++;
            }
        }
        return p02;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0865t.p0(i7) * size) + w(list);
    }

    public static int w(List list) {
        int i7;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof P) {
            P p7 = (P) list;
            i7 = 0;
            while (i8 < size) {
                p7.i(i8);
                i7 += AbstractC0865t.r0(p7.f10023b[i8]);
                i8++;
            }
        } else {
            i7 = 0;
            while (i8 < size) {
                i7 += AbstractC0865t.r0(((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0865t.p0(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0839f0) {
            AbstractC0839f0 abstractC0839f0 = (AbstractC0839f0) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0839f0.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += AbstractC0865t.t0(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Object z(Object obj, int i7, List list, Object obj2, Q0 q0) {
        return obj2;
    }
}
