package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f9651a;

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f9652b;

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f9653c;

    /* renamed from: d  reason: collision with root package name */
    public static final k0 f9654d;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.k0] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f9651a = cls;
        f9652b = A(false);
        f9653c = A(true);
        f9654d = new Object();
    }

    public static k0 A(boolean z7) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (k0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z7));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(k0 k0Var, Object obj, Object obj2) {
        k0Var.getClass();
        AbstractC0797y abstractC0797y = (AbstractC0797y) obj;
        j0 j0Var = abstractC0797y.unknownFields;
        j0 j0Var2 = ((AbstractC0797y) obj2).unknownFields;
        j0 j0Var3 = j0.f;
        if (!j0Var3.equals(j0Var2)) {
            if (j0Var3.equals(j0Var)) {
                int i7 = j0Var.f9667a + j0Var2.f9667a;
                int[] copyOf = Arrays.copyOf(j0Var.f9668b, i7);
                System.arraycopy(j0Var2.f9668b, 0, copyOf, j0Var.f9667a, j0Var2.f9667a);
                Object[] copyOf2 = Arrays.copyOf(j0Var.f9669c, i7);
                System.arraycopy(j0Var2.f9669c, 0, copyOf2, j0Var.f9667a, j0Var2.f9667a);
                j0Var = new j0(i7, copyOf, copyOf2, true);
            } else {
                j0Var.getClass();
                if (!j0Var2.equals(j0Var3)) {
                    if (j0Var.f9671e) {
                        int i8 = j0Var.f9667a + j0Var2.f9667a;
                        j0Var.a(i8);
                        System.arraycopy(j0Var2.f9668b, 0, j0Var.f9668b, j0Var.f9667a, j0Var2.f9667a);
                        System.arraycopy(j0Var2.f9669c, 0, j0Var.f9669c, j0Var.f9667a, j0Var2.f9667a);
                        j0Var.f9667a = i8;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0797y.unknownFields = j0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void D(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            if (z7) {
                c0784k.e0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    ((Boolean) list.get(i9)).getClass();
                    Logger logger = C0784k.f9672h;
                    i8++;
                }
                c0784k.f0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0784k.X(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                boolean booleanValue = ((Boolean) list.get(i11)).booleanValue();
                c0784k.e0(i7, 0);
                c0784k.X(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static void E(int i7, List list, O o7) {
        if (list != null && !list.isEmpty()) {
            o7.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                AbstractC0781h abstractC0781h = (AbstractC0781h) list.get(i8);
                C0784k c0784k = (C0784k) o7.f9607a;
                c0784k.e0(i7, 2);
                c0784k.f0(abstractC0781h.size());
                C0780g c0780g = (C0780g) abstractC0781h;
                c0784k.Y(c0780g.f9647d, c0780g.l(), c0780g.size());
            }
        }
    }

    public static void F(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Double) list.get(i10)).getClass();
                    Logger logger = C0784k.f9672h;
                    i9 += 8;
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.c0(Double.doubleToRawLongBits(((Double) list.get(i8)).doubleValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                double doubleValue = ((Double) list.get(i8)).doubleValue();
                c0784k.getClass();
                c0784k.b0(i7, Double.doubleToRawLongBits(doubleValue));
                i8++;
            }
        }
    }

    public static void G(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            if (z7) {
                c0784k.e0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    i8 += C0784k.K(((Integer) list.get(i9)).intValue());
                }
                c0784k.f0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0784k.d0(((Integer) list.get(i10)).intValue());
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                c0784k.e0(i7, 0);
                c0784k.d0(intValue);
            }
        }
    }

    public static void H(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0784k.f9672h;
                    i9 += 4;
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.a0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0784k.Z(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void I(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0784k.f9672h;
                    i9 += 8;
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.c0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0784k.b0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void J(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Float) list.get(i10)).getClass();
                    Logger logger = C0784k.f9672h;
                    i9 += 4;
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.a0(Float.floatToRawIntBits(((Float) list.get(i8)).floatValue()));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                float floatValue = ((Float) list.get(i8)).floatValue();
                c0784k.getClass();
                c0784k.Z(i7, Float.floatToRawIntBits(floatValue));
                i8++;
            }
        }
    }

    public static void K(int i7, List list, O o7, g0 g0Var) {
        if (list != null && !list.isEmpty()) {
            o7.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                o7.h(i7, list.get(i8), g0Var);
            }
        }
    }

    public static void L(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            if (z7) {
                c0784k.e0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    i8 += C0784k.K(((Integer) list.get(i9)).intValue());
                }
                c0784k.f0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0784k.d0(((Integer) list.get(i10)).intValue());
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                c0784k.e0(i7, 0);
                c0784k.d0(intValue);
            }
        }
    }

    public static void M(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0784k.W(((Long) list.get(i10)).longValue());
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.h0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0784k.g0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void N(int i7, List list, O o7, g0 g0Var) {
        if (list != null && !list.isEmpty()) {
            o7.getClass();
            for (int i8 = 0; i8 < list.size(); i8++) {
                o7.k(i7, list.get(i8), g0Var);
            }
        }
    }

    public static void O(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Integer) list.get(i10)).getClass();
                    Logger logger = C0784k.f9672h;
                    i9 += 4;
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.a0(((Integer) list.get(i8)).intValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0784k.Z(i7, ((Integer) list.get(i8)).intValue());
                i8++;
            }
        }
    }

    public static void P(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    ((Long) list.get(i10)).getClass();
                    Logger logger = C0784k.f9672h;
                    i9 += 8;
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.c0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0784k.b0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static void Q(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            if (z7) {
                c0784k.e0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    int intValue = ((Integer) list.get(i9)).intValue();
                    i8 += C0784k.U((intValue >> 31) ^ (intValue << 1));
                }
                c0784k.f0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    c0784k.f0((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue3 = ((Integer) list.get(i11)).intValue();
                c0784k.e0(i7, 0);
                c0784k.f0((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void R(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    long longValue = ((Long) list.get(i10)).longValue();
                    i9 += C0784k.W((longValue >> 63) ^ (longValue << 1));
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    long longValue2 = ((Long) list.get(i8)).longValue();
                    c0784k.h0((longValue2 >> 63) ^ (longValue2 << 1));
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                long longValue3 = ((Long) list.get(i8)).longValue();
                c0784k.g0(i7, (longValue3 >> 63) ^ (longValue3 << 1));
                i8++;
            }
        }
    }

    public static void S(int i7, List list, O o7) {
        if (list != null && !list.isEmpty()) {
            o7.getClass();
            boolean z7 = list instanceof I;
            C0784k c0784k = (C0784k) o7.f9607a;
            if (z7) {
                I i8 = (I) list;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    Object c8 = i8.c(i9);
                    if (c8 instanceof String) {
                        String str = (String) c8;
                        c0784k.e0(i7, 2);
                        int i10 = c0784k.f9676g;
                        try {
                            int U7 = C0784k.U(str.length() * 3);
                            int U8 = C0784k.U(str.length());
                            byte[] bArr = c0784k.f9675e;
                            int i11 = c0784k.f;
                            if (U8 == U7) {
                                int i12 = i10 + U8;
                                c0784k.f9676g = i12;
                                int v6 = v0.f9700a.v(str, bArr, i12, i11 - i12);
                                c0784k.f9676g = i10;
                                c0784k.f0((v6 - i10) - U8);
                                c0784k.f9676g = v6;
                            } else {
                                c0784k.f0(v0.b(str));
                                int i13 = c0784k.f9676g;
                                c0784k.f9676g = v0.f9700a.v(str, bArr, i13, i11 - i13);
                            }
                        } catch (u0 e7) {
                            c0784k.f9676g = i10;
                            C0784k.f9672h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
                            byte[] bytes = str.getBytes(D.f9598a);
                            try {
                                c0784k.f0(bytes.length);
                                c0784k.Y(bytes, 0, bytes.length);
                            } catch (IndexOutOfBoundsException e8) {
                                throw new R0.a(e8);
                            }
                        } catch (IndexOutOfBoundsException e9) {
                            throw new R0.a(e9);
                        }
                    } else {
                        AbstractC0781h abstractC0781h = (AbstractC0781h) c8;
                        c0784k.e0(i7, 2);
                        c0784k.f0(abstractC0781h.size());
                        C0780g c0780g = (C0780g) abstractC0781h;
                        c0784k.Y(c0780g.f9647d, c0780g.l(), c0780g.size());
                    }
                }
                return;
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                String str2 = (String) list.get(i14);
                c0784k.e0(i7, 2);
                int i15 = c0784k.f9676g;
                try {
                    int U9 = C0784k.U(str2.length() * 3);
                    int U10 = C0784k.U(str2.length());
                    byte[] bArr2 = c0784k.f9675e;
                    int i16 = c0784k.f;
                    if (U10 == U9) {
                        int i17 = i15 + U10;
                        c0784k.f9676g = i17;
                        int v7 = v0.f9700a.v(str2, bArr2, i17, i16 - i17);
                        c0784k.f9676g = i15;
                        c0784k.f0((v7 - i15) - U10);
                        c0784k.f9676g = v7;
                    } else {
                        c0784k.f0(v0.b(str2));
                        int i18 = c0784k.f9676g;
                        c0784k.f9676g = v0.f9700a.v(str2, bArr2, i18, i16 - i18);
                    }
                } catch (u0 e10) {
                    c0784k.f9676g = i15;
                    C0784k.f9672h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e10);
                    byte[] bytes2 = str2.getBytes(D.f9598a);
                    try {
                        c0784k.f0(bytes2.length);
                        c0784k.Y(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e11) {
                        throw new R0.a(e11);
                    }
                } catch (IndexOutOfBoundsException e12) {
                    throw new R0.a(e12);
                }
            }
        }
    }

    public static void T(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            if (z7) {
                c0784k.e0(i7, 2);
                int i8 = 0;
                for (int i9 = 0; i9 < list.size(); i9++) {
                    i8 += C0784k.U(((Integer) list.get(i9)).intValue());
                }
                c0784k.f0(i8);
                for (int i10 = 0; i10 < list.size(); i10++) {
                    c0784k.f0(((Integer) list.get(i10)).intValue());
                }
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                int intValue = ((Integer) list.get(i11)).intValue();
                c0784k.e0(i7, 0);
                c0784k.f0(intValue);
            }
        }
    }

    public static void U(int i7, List list, O o7, boolean z7) {
        if (list != null && !list.isEmpty()) {
            C0784k c0784k = (C0784k) o7.f9607a;
            int i8 = 0;
            if (z7) {
                c0784k.e0(i7, 2);
                int i9 = 0;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    i9 += C0784k.W(((Long) list.get(i10)).longValue());
                }
                c0784k.f0(i9);
                while (i8 < list.size()) {
                    c0784k.h0(((Long) list.get(i8)).longValue());
                    i8++;
                }
                return;
            }
            while (i8 < list.size()) {
                c0784k.g0(i7, ((Long) list.get(i8)).longValue());
                i8++;
            }
        }
    }

    public static int a(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0784k.A(i7) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int S7 = C0784k.S(i7) * size;
        for (int i8 = 0; i8 < list.size(); i8++) {
            S7 += C0784k.C((AbstractC0781h) list.get(i8));
        }
        return S7;
    }

    public static int d(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0784k.S(i7) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0798z) {
            AbstractC0798z abstractC0798z = (AbstractC0798z) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0798z.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0784k.K(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int f(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0784k.F(i7) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0784k.G(i7) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i7, List list, g0 g0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += C0784k.I(i7, (AbstractC0774a) list.get(i9), g0Var);
        }
        return i8;
    }

    public static int k(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0784k.S(i7) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0798z) {
            AbstractC0798z abstractC0798z = (AbstractC0798z) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0798z.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0784k.K(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int m(int i7, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0784k.S(i7) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof M) {
            M m7 = (M) list;
            if (size <= 0) {
                return 0;
            }
            m7.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0784k.W(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static int o(int i7, Object obj, g0 g0Var) {
        int S7 = C0784k.S(i7);
        int b5 = ((AbstractC0774a) obj).b(g0Var);
        return C0784k.U(b5) + b5 + S7;
    }

    public static int p(int i7, List list, g0 g0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int S7 = C0784k.S(i7) * size;
        for (int i8 = 0; i8 < size; i8++) {
            int b5 = ((AbstractC0774a) list.get(i8)).b(g0Var);
            S7 += C0784k.U(b5) + b5;
        }
        return S7;
    }

    public static int q(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0784k.S(i7) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0798z) {
            AbstractC0798z abstractC0798z = (AbstractC0798z) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0798z.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            int intValue = ((Integer) list.get(i8)).intValue();
            i7 += C0784k.U((intValue >> 31) ^ (intValue << 1));
        }
        return i7;
    }

    public static int s(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0784k.S(i7) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof M) {
            M m7 = (M) list;
            if (size <= 0) {
                return 0;
            }
            m7.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            long longValue = ((Long) list.get(i8)).longValue();
            i7 += C0784k.W((longValue >> 63) ^ (longValue << 1));
        }
        return i7;
    }

    public static int u(int i7, List list) {
        int R7;
        int R8;
        int size = list.size();
        int i8 = 0;
        if (size == 0) {
            return 0;
        }
        int S7 = C0784k.S(i7) * size;
        if (list instanceof I) {
            I i9 = (I) list;
            while (i8 < size) {
                Object c8 = i9.c(i8);
                if (c8 instanceof AbstractC0781h) {
                    R8 = C0784k.C((AbstractC0781h) c8);
                } else {
                    R8 = C0784k.R((String) c8);
                }
                S7 = R8 + S7;
                i8++;
            }
        } else {
            while (i8 < size) {
                Object obj = list.get(i8);
                if (obj instanceof AbstractC0781h) {
                    R7 = C0784k.C((AbstractC0781h) obj);
                } else {
                    R7 = C0784k.R((String) obj);
                }
                S7 = R7 + S7;
                i8++;
            }
        }
        return S7;
    }

    public static int v(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0784k.S(i7) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0798z) {
            AbstractC0798z abstractC0798z = (AbstractC0798z) list;
            if (size <= 0) {
                return 0;
            }
            abstractC0798z.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0784k.U(((Integer) list.get(i8)).intValue());
        }
        return i7;
    }

    public static int x(int i7, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0784k.S(i7) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof M) {
            M m7 = (M) list;
            if (size <= 0) {
                return 0;
            }
            m7.i(0);
            throw null;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += C0784k.W(((Long) list.get(i8)).longValue());
        }
        return i7;
    }

    public static Object z(Object obj, int i7, List list, Object obj2, k0 k0Var) {
        return obj2;
    }
}
