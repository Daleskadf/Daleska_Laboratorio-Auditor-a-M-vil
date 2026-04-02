package com.google.protobuf;

import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;
/* renamed from: com.google.protobuf.r0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862r0 implements E0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f10117n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f10118o = Y0.j();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f10119a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f10120b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10121c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10122d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0828a f10123e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f10124g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10125h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10126i;
    public final C0866t0 j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0837e0 f10127k;

    /* renamed from: l  reason: collision with root package name */
    public final Q0 f10128l;

    /* renamed from: m  reason: collision with root package name */
    public final C0853m0 f10129m;

    public C0862r0(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0828a abstractC0828a, int[] iArr2, int i9, int i10, C0866t0 c0866t0, AbstractC0837e0 abstractC0837e0, Q0 q0, C0873x c0873x, C0853m0 c0853m0) {
        this.f10119a = iArr;
        this.f10120b = objArr;
        this.f10121c = i7;
        this.f10122d = i8;
        this.f = abstractC0828a instanceof J;
        this.f10124g = iArr2;
        this.f10125h = i9;
        this.f10126i = i10;
        this.j = c0866t0;
        this.f10127k = abstractC0837e0;
        this.f10128l = q0;
        this.f10123e = abstractC0828a;
        this.f10129m = c0853m0;
    }

    public static C0862r0 A(B0 b0, C0866t0 c0866t0, AbstractC0837e0 abstractC0837e0, Q0 q0, C0873x c0873x, C0853m0 c0853m0) {
        if (b0 instanceof B0) {
            return B(b0, c0866t0, abstractC0837e0, q0, c0873x, c0853m0);
        }
        b0.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.protobuf.C0862r0 B(com.google.protobuf.B0 r33, com.google.protobuf.C0866t0 r34, com.google.protobuf.AbstractC0837e0 r35, com.google.protobuf.Q0 r36, com.google.protobuf.C0873x r37, com.google.protobuf.C0853m0 r38) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0862r0.B(com.google.protobuf.B0, com.google.protobuf.t0, com.google.protobuf.e0, com.google.protobuf.Q0, com.google.protobuf.x, com.google.protobuf.m0):com.google.protobuf.r0");
    }

    public static long C(int i7) {
        return i7 & 1048575;
    }

    public static int D(Object obj, long j) {
        return ((Integer) Y0.f10049c.k(obj, j)).intValue();
    }

    public static long E(Object obj, long j) {
        return ((Long) Y0.f10049c.k(obj, j)).longValue();
    }

    public static Field N(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m7 = androidx.datastore.preferences.protobuf.Y.m("Field ", str, " for ");
            m7.append(cls.getName());
            m7.append(" not found. Known fields are ");
            m7.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m7.toString());
        }
    }

    public static int T(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void X(int i7, Object obj, C0845i0 c0845i0) {
        if (obj instanceof String) {
            ((AbstractC0865t) c0845i0.f10074a).I0(i7, (String) obj);
            return;
        }
        c0845i0.c(i7, (AbstractC0852m) obj);
    }

    public static void k(Object obj) {
        if (s(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static int l(byte[] bArr, int i7, int i8, g1 g1Var, Class cls, C0838f c0838f) {
        boolean z7;
        switch (AbstractC0861q0.f10114a[g1Var.ordinal()]) {
            case 1:
                int N7 = J0.N(bArr, i7, c0838f);
                if (c0838f.f10065b != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                c0838f.f10066c = Boolean.valueOf(z7);
                return N7;
            case 2:
                return J0.f(bArr, i7, c0838f);
            case 3:
                c0838f.f10066c = Double.valueOf(J0.h(bArr, i7));
                return i7 + 8;
            case 4:
            case 5:
                c0838f.f10066c = Integer.valueOf(J0.j(bArr, i7));
                return i7 + 4;
            case 6:
            case 7:
                c0838f.f10066c = Long.valueOf(J0.l(bArr, i7));
                return i7 + 8;
            case 8:
                c0838f.f10066c = Float.valueOf(J0.n(bArr, i7));
                return i7 + 4;
            case 9:
            case 10:
            case 11:
                int L6 = J0.L(bArr, i7, c0838f);
                c0838f.f10066c = Integer.valueOf(c0838f.f10064a);
                return L6;
            case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
                int N8 = J0.N(bArr, i7, c0838f);
                c0838f.f10066c = Long.valueOf(c0838f.f10065b);
                return N8;
            case 14:
                E0 a7 = C0878z0.f10148c.a(cls);
                J newInstance = a7.newInstance();
                int T7 = J0.T(newInstance, a7, bArr, i7, i8, c0838f);
                a7.b(newInstance);
                c0838f.f10066c = newInstance;
                return T7;
            case 15:
                int L7 = J0.L(bArr, i7, c0838f);
                c0838f.f10066c = Integer.valueOf(J6.b.c(c0838f.f10064a));
                return L7;
            case RecognitionOptions.DATA_MATRIX /* 16 */:
                int N9 = J0.N(bArr, i7, c0838f);
                c0838f.f10066c = Long.valueOf(J6.b.d(c0838f.f10065b));
                return N9;
            case 17:
                return J0.F(bArr, i7, c0838f);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof J) {
            return ((J) obj).n();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public final int F(Object obj, byte[] bArr, int i7, int i8, int i9, long j, C0838f c0838f) {
        Unsafe unsafe = f10118o;
        Object o7 = o(i9);
        Object object = unsafe.getObject(obj, j);
        this.f10129m.getClass();
        if (C0853m0.d(object)) {
            C0851l0 f = C0853m0.f();
            C0853m0.e(f, object);
            unsafe.putObject(obj, j, f);
            object = f;
        }
        C0847j0 a7 = C0853m0.a(o7);
        C0851l0 b5 = C0853m0.b(object);
        int L6 = J0.L(bArr, i7, c0838f);
        int i10 = c0838f.f10064a;
        if (i10 >= 0 && i10 <= i8 - L6) {
            int i11 = L6 + i10;
            Object obj2 = a7.f10078c;
            Object obj3 = StringUtils.EMPTY;
            Object obj4 = obj2;
            while (L6 < i11) {
                int i12 = L6 + 1;
                byte b7 = bArr[L6];
                if (b7 < 0) {
                    i12 = J0.K(b7, bArr, i12, c0838f);
                    b7 = c0838f.f10064a;
                }
                int i13 = b7 >>> 3;
                int i14 = b7 & 7;
                if (i13 != 1) {
                    if (i13 == 2 && i14 == a7.f10077b.b()) {
                        L6 = l(bArr, i12, i8, a7.f10077b, obj2.getClass(), c0838f);
                        obj4 = c0838f.f10066c;
                    }
                    L6 = J0.V(b7, bArr, i12, i8, c0838f);
                } else if (i14 == a7.f10076a.b()) {
                    L6 = l(bArr, i12, i8, a7.f10076a, null, c0838f);
                    obj3 = c0838f.f10066c;
                } else {
                    L6 = J0.V(b7, bArr, i12, i8, c0838f);
                }
            }
            if (L6 == i11) {
                b5.put(obj3, obj4);
                return i11;
            }
            throw X.g();
        }
        throw X.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0308, code lost:
        if (r0 != r33) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x030a, code lost:
        r15 = r31;
        r13 = r32;
        r3 = r19;
        r11 = r34;
        r10 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0323, code lost:
        r6 = r19;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0355, code lost:
        if (r0 != r15) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0375, code lost:
        if (r0 != r15) goto L169;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int G(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.C0838f r36) {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0862r0.G(java.lang.Object, byte[], int, int, int, com.google.protobuf.f):int");
    }

    public final int H(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, C0838f c0838f) {
        Unsafe unsafe = f10118o;
        long j8 = this.f10119a[i14 + 2] & 1048575;
        boolean z7 = true;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(J0.h(bArr, i7)));
                    int i15 = i7 + 8;
                    unsafe.putInt(obj, j8, i10);
                    return i15;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(J0.n(bArr, i7)));
                    int i16 = i7 + 4;
                    unsafe.putInt(obj, j8, i10);
                    return i16;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int N7 = J0.N(bArr, i7, c0838f);
                    unsafe.putObject(obj, j, Long.valueOf(c0838f.f10065b));
                    unsafe.putInt(obj, j8, i10);
                    return N7;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int L6 = J0.L(bArr, i7, c0838f);
                    unsafe.putObject(obj, j, Integer.valueOf(c0838f.f10064a));
                    unsafe.putInt(obj, j8, i10);
                    return L6;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(J0.l(bArr, i7)));
                    int i17 = i7 + 8;
                    unsafe.putInt(obj, j8, i10);
                    return i17;
                }
                break;
            case 57:
            case RecognitionOptions.EAN_8 /* 64 */:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(J0.j(bArr, i7)));
                    int i18 = i7 + 4;
                    unsafe.putInt(obj, j8, i10);
                    return i18;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int N8 = J0.N(bArr, i7, c0838f);
                    if (c0838f.f10065b == 0) {
                        z7 = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z7));
                    unsafe.putInt(obj, j8, i10);
                    return N8;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int L7 = J0.L(bArr, i7, c0838f);
                    int i19 = c0838f.f10064a;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j, StringUtils.EMPTY);
                    } else if ((i12 & 536870912) != 0 && !b1.f(bArr, L7, L7 + i19)) {
                        throw X.c();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, L7, i19, V.f10033a));
                        L7 += i19;
                    }
                    unsafe.putInt(obj, j8, i10);
                    return L7;
                }
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                if (i11 == 2) {
                    Object z8 = z(i10, obj, i14);
                    int T7 = J0.T(z8, p(i14), bArr, i7, i8, c0838f);
                    S(obj, i10, i14, z8);
                    return T7;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int f = J0.f(bArr, i7, c0838f);
                    unsafe.putObject(obj, j, c0838f.f10066c);
                    unsafe.putInt(obj, j8, i10);
                    return f;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int L8 = J0.L(bArr, i7, c0838f);
                    int i20 = c0838f.f10064a;
                    n(i14);
                    unsafe.putObject(obj, j, Integer.valueOf(i20));
                    unsafe.putInt(obj, j8, i10);
                    return L8;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int L9 = J0.L(bArr, i7, c0838f);
                    unsafe.putObject(obj, j, Integer.valueOf(J6.b.c(c0838f.f10064a)));
                    unsafe.putInt(obj, j8, i10);
                    return L9;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int N9 = J0.N(bArr, i7, c0838f);
                    unsafe.putObject(obj, j, Long.valueOf(J6.b.d(c0838f.f10065b)));
                    unsafe.putInt(obj, j8, i10);
                    return N9;
                }
                break;
            case 68:
                if (i11 == 3) {
                    Object z9 = z(i10, obj, i14);
                    int S7 = J0.S(z9, p(i14), bArr, i7, i8, (i9 & (-8)) | 4, c0838f);
                    S(obj, i10, i14, z9);
                    return S7;
                }
                break;
        }
        return i7;
    }

    public final int I(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, long j, int i12, long j8, C0838f c0838f) {
        int M7;
        int i13;
        Unsafe unsafe = f10118o;
        AbstractC0830b abstractC0830b = (AbstractC0830b) ((U) unsafe.getObject(obj, j8));
        boolean f = abstractC0830b.f();
        U u7 = abstractC0830b;
        if (!f) {
            int size = abstractC0830b.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size * 2;
            }
            U a7 = abstractC0830b.a(i13);
            unsafe.putObject(obj, j8, a7);
            u7 = a7;
        }
        switch (i12) {
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (i10 == 2) {
                    return J0.s(bArr, i7, u7, c0838f);
                }
                if (i10 == 1) {
                    return J0.i(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return J0.v(bArr, i7, u7, c0838f);
                }
                if (i10 == 5) {
                    return J0.o(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return J0.z(bArr, i7, u7, c0838f);
                }
                if (i10 == 0) {
                    return J0.O(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return J0.y(bArr, i7, u7, c0838f);
                }
                if (i10 == 0) {
                    return J0.M(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 23:
            case RecognitionOptions.EAN_13 /* 32 */:
            case 40:
            case 46:
                if (i10 == 2) {
                    return J0.u(bArr, i7, u7, c0838f);
                }
                if (i10 == 1) {
                    return J0.m(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return J0.t(bArr, i7, u7, c0838f);
                }
                if (i10 == 5) {
                    return J0.k(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return J0.r(bArr, i7, u7, c0838f);
                }
                if (i10 == 0) {
                    return J0.e(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 26:
                if (i10 == 2) {
                    if ((j & 536870912) == 0) {
                        return J0.D(i9, bArr, i7, i8, u7, c0838f);
                    }
                    return J0.E(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return J0.q(p(i11), i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return J0.g(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    M7 = J0.y(bArr, i7, u7, c0838f);
                } else if (i10 == 0) {
                    M7 = J0.M(i9, bArr, i7, i8, u7, c0838f);
                }
                n(i11);
                Class cls = F0.f10002a;
                return M7;
            case 33:
            case 47:
                if (i10 == 2) {
                    return J0.w(bArr, i7, u7, c0838f);
                }
                if (i10 == 0) {
                    return J0.A(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return J0.x(bArr, i7, u7, c0838f);
                }
                if (i10 == 0) {
                    return J0.B(i9, bArr, i7, i8, u7, c0838f);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return J0.p(p(i11), i9, bArr, i7, i8, u7, c0838f);
                }
                break;
        }
        return i7;
    }

    public final void J(Object obj, long j, K0.l lVar, E0 e02, C0871w c0871w) {
        int A7;
        List c8 = this.f10127k.c(obj, j);
        int i7 = lVar.f2494b;
        if ((i7 & 7) == 3) {
            do {
                J newInstance = e02.newInstance();
                lVar.e(newInstance, e02, c0871w);
                e02.b(newInstance);
                c8.add(newInstance);
                J6.b bVar = (J6.b) lVar.f2497e;
                if (!bVar.g() && lVar.f2496d == 0) {
                    A7 = bVar.A();
                } else {
                    return;
                }
            } while (A7 == i7);
            lVar.f2496d = A7;
            return;
        }
        throw X.d();
    }

    public final void K(Object obj, int i7, K0.l lVar, E0 e02, C0871w c0871w) {
        int A7;
        List c8 = this.f10127k.c(obj, i7 & 1048575);
        int i8 = lVar.f2494b;
        if ((i8 & 7) == 2) {
            do {
                J newInstance = e02.newInstance();
                lVar.h(newInstance, e02, c0871w);
                e02.b(newInstance);
                c8.add(newInstance);
                J6.b bVar = (J6.b) lVar.f2497e;
                if (!bVar.g() && lVar.f2496d == 0) {
                    A7 = bVar.A();
                } else {
                    return;
                }
            } while (A7 == i8);
            lVar.f2496d = A7;
            return;
        }
        throw X.d();
    }

    public final void L(int i7, K0.l lVar, Object obj) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            lVar.V(2);
            Y0.s(obj, i7 & 1048575, ((J6.b) lVar.f2497e).z());
        } else if (this.f) {
            lVar.V(2);
            Y0.s(obj, i7 & 1048575, ((J6.b) lVar.f2497e).y());
        } else {
            Y0.s(obj, i7 & 1048575, lVar.m());
        }
    }

    public final void M(int i7, K0.l lVar, Object obj) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        AbstractC0837e0 abstractC0837e0 = this.f10127k;
        if (z7) {
            lVar.O(abstractC0837e0.c(obj, i7 & 1048575), true);
        } else {
            lVar.O(abstractC0837e0.c(obj, i7 & 1048575), false);
        }
    }

    public final void O(int i7, Object obj) {
        int i8 = this.f10119a[i7 + 2];
        long j = 1048575 & i8;
        if (j == 1048575) {
            return;
        }
        Y0.q(j, obj, (1 << (i8 >>> 20)) | Y0.f10049c.i(obj, j));
    }

    public final void P(int i7, Object obj, int i8) {
        Y0.q(this.f10119a[i8 + 2] & 1048575, obj, i7);
    }

    public final int Q(int i7, int i8) {
        int[] iArr = this.f10119a;
        int length = (iArr.length / 3) - 1;
        while (i8 <= length) {
            int i9 = (length + i8) >>> 1;
            int i10 = i9 * 3;
            int i11 = iArr[i10];
            if (i7 == i11) {
                return i10;
            }
            if (i7 < i11) {
                length = i9 - 1;
            } else {
                i8 = i9 + 1;
            }
        }
        return -1;
    }

    public final void R(int i7, Object obj, Object obj2) {
        f10118o.putObject(obj, U(i7) & 1048575, obj2);
        O(i7, obj);
    }

    public final void S(Object obj, int i7, int i8, Object obj2) {
        f10118o.putObject(obj, U(i8) & 1048575, obj2);
        P(i7, obj, i8);
    }

    public final int U(int i7) {
        return this.f10119a[i7 + 1];
    }

    public final void V(Object obj, C0845i0 c0845i0) {
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        boolean z7;
        boolean z8;
        int[] iArr2 = this.f10119a;
        int length = iArr2.length;
        Unsafe unsafe = f10118o;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < length) {
            int U7 = U(i13);
            int i14 = iArr2[i13];
            int T7 = T(U7);
            if (T7 <= 17) {
                int i15 = iArr2[i13 + 2];
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    if (i16 == 1048575) {
                        i12 = 0;
                    } else {
                        i12 = unsafe.getInt(obj, i16);
                    }
                    i11 = i16;
                }
                i7 = i11;
                i8 = i12;
                i9 = 1 << (i15 >>> 20);
            } else {
                i7 = i11;
                i8 = i12;
                i9 = 0;
            }
            long j = U7 & 1048575;
            switch (T7) {
                case 0:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.d(i14, Y0.f10049c.g(obj, j));
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 1:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.h(Y0.f10049c.h(obj, j), i14);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 2:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.k(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 3:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.r(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 4:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.j(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 5:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.g(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 6:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.f(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 7:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.b(i14, Y0.f10049c.d(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 8:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        X(i14, unsafe.getObject(obj, j), c0845i0);
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 9:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.l(i14, unsafe.getObject(obj, j), p(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 10:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.c(i14, (AbstractC0852m) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 11:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.q(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.e(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 13:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.m(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 14:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.n(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 15:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.o(i14, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.p(i14, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 17:
                    iArr = iArr2;
                    i10 = length;
                    if (r(obj, i13, i7, i8, i9)) {
                        c0845i0.i(i14, unsafe.getObject(obj, j), p(i13));
                    } else {
                        continue;
                    }
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    z7 = false;
                    F0.E(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 19:
                    z7 = false;
                    F0.I(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    z7 = false;
                    F0.L(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 21:
                    z7 = false;
                    F0.T(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 22:
                    z7 = false;
                    F0.K(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 23:
                    z7 = false;
                    F0.H(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 24:
                    z7 = false;
                    F0.G(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 25:
                    z7 = false;
                    F0.C(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 26:
                    F0.R(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0);
                    break;
                case 27:
                    F0.M(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, p(i13));
                    break;
                case 28:
                    F0.D(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0);
                    break;
                case 29:
                    z8 = false;
                    F0.S(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 30:
                    z8 = false;
                    F0.F(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 31:
                    z8 = false;
                    F0.N(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case RecognitionOptions.EAN_13 /* 32 */:
                    z8 = false;
                    F0.O(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 33:
                    z8 = false;
                    F0.P(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 34:
                    z8 = false;
                    F0.Q(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, false);
                    iArr = iArr2;
                    i10 = length;
                    i13 += 3;
                    i11 = i7;
                    iArr2 = iArr;
                    i12 = i8;
                    length = i10;
                case 35:
                    F0.E(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 36:
                    F0.I(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 37:
                    F0.L(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 38:
                    F0.T(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 39:
                    F0.K(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 40:
                    F0.H(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 41:
                    F0.G(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 42:
                    F0.C(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 43:
                    F0.S(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 44:
                    F0.F(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 45:
                    F0.N(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 46:
                    F0.O(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 47:
                    F0.P(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 48:
                    F0.Q(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, true);
                    break;
                case 49:
                    F0.J(iArr2[i13], (List) unsafe.getObject(obj, j), c0845i0, p(i13));
                    break;
                case 50:
                    W(c0845i0, i14, unsafe.getObject(obj, j), i13);
                    break;
                case 51:
                    if (t(i14, obj, i13)) {
                        c0845i0.d(i14, ((Double) Y0.f10049c.k(obj, j)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (t(i14, obj, i13)) {
                        c0845i0.h(((Float) Y0.f10049c.k(obj, j)).floatValue(), i14);
                        break;
                    }
                    break;
                case 53:
                    if (t(i14, obj, i13)) {
                        c0845i0.k(i14, E(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (t(i14, obj, i13)) {
                        c0845i0.r(i14, E(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (t(i14, obj, i13)) {
                        c0845i0.j(i14, D(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (t(i14, obj, i13)) {
                        c0845i0.g(i14, E(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (t(i14, obj, i13)) {
                        c0845i0.f(i14, D(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (t(i14, obj, i13)) {
                        c0845i0.b(i14, ((Boolean) Y0.f10049c.k(obj, j)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (t(i14, obj, i13)) {
                        X(i14, unsafe.getObject(obj, j), c0845i0);
                        break;
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (t(i14, obj, i13)) {
                        c0845i0.l(i14, unsafe.getObject(obj, j), p(i13));
                        break;
                    }
                    break;
                case 61:
                    if (t(i14, obj, i13)) {
                        c0845i0.c(i14, (AbstractC0852m) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (t(i14, obj, i13)) {
                        c0845i0.q(i14, D(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (t(i14, obj, i13)) {
                        c0845i0.e(i14, D(obj, j));
                        break;
                    }
                    break;
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (t(i14, obj, i13)) {
                        c0845i0.m(i14, D(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (t(i14, obj, i13)) {
                        c0845i0.n(i14, E(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (t(i14, obj, i13)) {
                        c0845i0.o(i14, D(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (t(i14, obj, i13)) {
                        c0845i0.p(i14, E(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (t(i14, obj, i13)) {
                        c0845i0.i(i14, unsafe.getObject(obj, j), p(i13));
                        break;
                    }
                    break;
            }
            iArr = iArr2;
            i10 = length;
            i13 += 3;
            i11 = i7;
            iArr2 = iArr;
            i12 = i8;
            length = i10;
        }
        this.f10128l.getClass();
        ((J) obj).unknownFields.e(c0845i0);
    }

    public final void W(C0845i0 c0845i0, int i7, Object obj, int i8) {
        if (obj != null) {
            Object o7 = o(i8);
            this.f10129m.getClass();
            C0847j0 c0847j0 = ((C0849k0) o7).f10080a;
            AbstractC0865t abstractC0865t = (AbstractC0865t) c0845i0.f10074a;
            abstractC0865t.getClass();
            for (Map.Entry entry : ((C0851l0) obj).entrySet()) {
                abstractC0865t.K0(i7, 2);
                abstractC0865t.M0(C0849k0.a(c0847j0, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                A.b(abstractC0865t, c0847j0.f10076a, 1, key);
                A.b(abstractC0865t, c0847j0.f10077b, 2, value);
            }
        }
    }

    @Override // com.google.protobuf.E0
    public final void a(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f10119a;
            if (i7 < iArr.length) {
                int U7 = U(i7);
                long j = 1048575 & U7;
                int i8 = iArr[i7];
                switch (T(U7)) {
                    case 0:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.o(obj, j, Y0.f10049c.g(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 1:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.p(obj, j, Y0.f10049c.h(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 2:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.r(obj, j, Y0.f10049c.j(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 3:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.r(obj, j, Y0.f10049c.j(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 4:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.q(j, obj, Y0.f10049c.i(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 5:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.r(obj, j, Y0.f10049c.j(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 6:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.q(j, obj, Y0.f10049c.i(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 7:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.k(obj, j, Y0.f10049c.d(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 8:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.s(obj, j, Y0.f10049c.k(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 9:
                        w(i7, obj, obj2);
                        break;
                    case 10:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.s(obj, j, Y0.f10049c.k(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 11:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.q(j, obj, Y0.f10049c.i(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.q(j, obj, Y0.f10049c.i(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 13:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.q(j, obj, Y0.f10049c.i(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 14:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.r(obj, j, Y0.f10049c.j(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 15:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.q(j, obj, Y0.f10049c.i(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (!q(i7, obj2)) {
                            break;
                        } else {
                            Y0.r(obj, j, Y0.f10049c.j(obj2, j));
                            O(i7, obj);
                            break;
                        }
                    case 17:
                        w(i7, obj, obj2);
                        break;
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    case 19:
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case RecognitionOptions.EAN_13 /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f10127k.b(obj, j, obj2);
                        break;
                    case 50:
                        Class cls = F0.f10002a;
                        X0 x02 = Y0.f10049c;
                        Object k2 = x02.k(obj, j);
                        Object k8 = x02.k(obj2, j);
                        this.f10129m.getClass();
                        Y0.s(obj, j, C0853m0.e(k2, k8));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!t(i8, obj2, i7)) {
                            break;
                        } else {
                            Y0.s(obj, j, Y0.f10049c.k(obj2, j));
                            P(i8, obj, i7);
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        x(i7, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case RecognitionOptions.EAN_8 /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                        if (!t(i8, obj2, i7)) {
                            break;
                        } else {
                            Y0.s(obj, j, Y0.f10049c.k(obj2, j));
                            P(i8, obj, i7);
                            break;
                        }
                    case 68:
                        x(i7, obj, obj2);
                        break;
                }
                i7 += 3;
            } else {
                F0.A(this.f10128l, obj, obj2);
                return;
            }
        }
    }

    @Override // com.google.protobuf.E0
    public final void b(Object obj) {
        if (!s(obj)) {
            return;
        }
        if (obj instanceof J) {
            J j = (J) obj;
            j.h();
            j.g();
            j.o();
        }
        int[] iArr = this.f10119a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int U7 = U(i7);
            long j8 = 1048575 & U7;
            int T7 = T(U7);
            if (T7 != 9) {
                if (T7 != 60 && T7 != 68) {
                    switch (T7) {
                        case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        case 19:
                        case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case RecognitionOptions.EAN_13 /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f10127k.a(obj, j8);
                            break;
                        case 50:
                            Unsafe unsafe = f10118o;
                            Object object = unsafe.getObject(obj, j8);
                            if (object != null) {
                                this.f10129m.getClass();
                                C0853m0.g(object);
                                unsafe.putObject(obj, j8, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (t(iArr[i7], obj, i7)) {
                    p(i7).b(f10118o.getObject(obj, j8));
                }
            }
            if (q(i7, obj)) {
                p(i7).b(f10118o.getObject(obj, j8));
            }
        }
        this.f10128l.getClass();
        Q0.b(obj);
    }

    @Override // com.google.protobuf.E0
    public final boolean c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f10125h) {
            int i12 = this.f10124g[i11];
            int[] iArr = this.f10119a;
            int i13 = iArr[i12];
            int U7 = U(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = f10118o.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & U7) != 0 && !r(obj, i12, i7, i8, i16)) {
                return false;
            }
            int T7 = T(U7);
            if (T7 != 9 && T7 != 17) {
                if (T7 != 27) {
                    if (T7 != 60 && T7 != 68) {
                        if (T7 != 49) {
                            if (T7 != 50) {
                                continue;
                            } else {
                                Object k2 = Y0.f10049c.k(obj, U7 & 1048575);
                                this.f10129m.getClass();
                                C0851l0 c0851l0 = (C0851l0) k2;
                                if (!c0851l0.isEmpty() && ((C0849k0) o(i12)).f10080a.f10077b.a() == h1.MESSAGE) {
                                    E0 e02 = null;
                                    for (Object obj2 : c0851l0.values()) {
                                        if (e02 == null) {
                                            e02 = C0878z0.f10148c.a(obj2.getClass());
                                        }
                                        if (!e02.c(obj2)) {
                                            return false;
                                        }
                                    }
                                    continue;
                                }
                            }
                        }
                    } else if (t(i13, obj, i12)) {
                        if (!p(i12).c(Y0.f10049c.k(obj, U7 & 1048575))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) Y0.f10049c.k(obj, U7 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    E0 p7 = p(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!p7.c(list.get(i17))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (r(obj, i12, i7, i8, i16)) {
                if (!p(i12).c(Y0.f10049c.k(obj, U7 & 1048575))) {
                    return false;
                }
            } else {
                continue;
            }
            i11++;
            i9 = i7;
            i10 = i8;
        }
        return true;
    }

    @Override // com.google.protobuf.E0
    public final int d(J j) {
        int i7;
        int i8;
        int i9;
        int a02;
        int n02;
        int i10;
        int p02;
        int r02;
        Unsafe unsafe = f10118o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f10119a;
            if (i14 < iArr.length) {
                int U7 = U(i14);
                int T7 = T(U7);
                int i16 = iArr[i14];
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i11;
                if (T7 <= 17) {
                    if (i18 != i12) {
                        if (i18 == i11) {
                            i13 = 0;
                        } else {
                            i13 = unsafe.getInt(j, i18);
                        }
                        i12 = i18;
                    }
                    i7 = i12;
                    i8 = i13;
                    i9 = 1 << (i17 >>> 20);
                } else {
                    i7 = i12;
                    i8 = i13;
                    i9 = 0;
                }
                long j8 = U7 & i11;
                if (T7 >= D.DOUBLE_LIST_PACKED.a()) {
                    D.SINT64_LIST_PACKED.a();
                }
                switch (T7) {
                    case 0:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.a0(i16);
                            i15 += a02;
                            break;
                        }
                    case 1:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.e0(i16);
                            i15 += a02;
                            break;
                        }
                    case 2:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.i0(i16, unsafe.getLong(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 3:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.s0(i16, unsafe.getLong(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 4:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.g0(i16, unsafe.getInt(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 5:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.d0(i16);
                            i15 += a02;
                            break;
                        }
                    case 6:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.c0(i16);
                            i15 += a02;
                            break;
                        }
                    case 7:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.X(i16);
                            i15 += a02;
                            break;
                        }
                    case 8:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            Object object = unsafe.getObject(j, j8);
                            if (object instanceof AbstractC0852m) {
                                n02 = AbstractC0865t.Y(i16, (AbstractC0852m) object);
                            } else {
                                n02 = AbstractC0865t.n0(i16, (String) object);
                            }
                            i15 = n02 + i15;
                            break;
                        }
                    case 9:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = F0.o(i16, unsafe.getObject(j, j8), p(i14));
                            i15 += a02;
                            break;
                        }
                    case 10:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.Y(i16, (AbstractC0852m) unsafe.getObject(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 11:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.q0(i16, unsafe.getInt(j, j8));
                            i15 += a02;
                            break;
                        }
                    case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.b0(i16, unsafe.getInt(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 13:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.j0(i16);
                            i15 += a02;
                            break;
                        }
                    case 14:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.k0(i16);
                            i15 += a02;
                            break;
                        }
                    case 15:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.l0(i16, unsafe.getInt(j, j8));
                            i15 += a02;
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.m0(i16, unsafe.getLong(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 17:
                        if (!r(j, i14, i7, i8, i9)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.f0(i16, (AbstractC0828a) unsafe.getObject(j, j8), p(i14));
                            i15 += a02;
                            break;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        a02 = F0.h(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 19:
                        a02 = F0.f(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        a02 = F0.m(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 21:
                        a02 = F0.x(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 22:
                        a02 = F0.k(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 23:
                        a02 = F0.h(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 24:
                        a02 = F0.f(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 25:
                        a02 = F0.a(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 26:
                        a02 = F0.u(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 27:
                        a02 = F0.p(i16, (List) unsafe.getObject(j, j8), p(i14));
                        i15 += a02;
                        break;
                    case 28:
                        a02 = F0.c(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 29:
                        a02 = F0.v(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 30:
                        a02 = F0.d(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 31:
                        a02 = F0.f(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        a02 = F0.h(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 33:
                        a02 = F0.q(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 34:
                        a02 = F0.s(i16, (List) unsafe.getObject(j, j8));
                        i15 += a02;
                        break;
                    case 35:
                        i10 = F0.i((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 36:
                        i10 = F0.g((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 37:
                        i10 = F0.n((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 38:
                        i10 = F0.y((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 39:
                        i10 = F0.l((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 40:
                        i10 = F0.i((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 41:
                        i10 = F0.g((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 42:
                        i10 = F0.b((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 43:
                        i10 = F0.w((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 44:
                        i10 = F0.e((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 45:
                        i10 = F0.g((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 46:
                        i10 = F0.i((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 47:
                        i10 = F0.r((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 48:
                        i10 = F0.t((List) unsafe.getObject(j, j8));
                        if (i10 <= 0) {
                            break;
                        } else {
                            p02 = AbstractC0865t.p0(i16);
                            r02 = AbstractC0865t.r0(i10);
                            i15 += r02 + p02 + i10;
                            break;
                        }
                    case 49:
                        a02 = F0.j(i16, (List) unsafe.getObject(j, j8), p(i14));
                        i15 += a02;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(j, j8);
                        Object o7 = o(i14);
                        this.f10129m.getClass();
                        a02 = C0853m0.c(i16, object2, o7);
                        i15 += a02;
                        break;
                    case 51:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.a0(i16);
                            i15 += a02;
                            break;
                        }
                    case 52:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.e0(i16);
                            i15 += a02;
                            break;
                        }
                    case 53:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.i0(i16, E(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 54:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.s0(i16, E(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 55:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.g0(i16, D(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 56:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.d0(i16);
                            i15 += a02;
                            break;
                        }
                    case 57:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.c0(i16);
                            i15 += a02;
                            break;
                        }
                    case 58:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.X(i16);
                            i15 += a02;
                            break;
                        }
                    case 59:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(j, j8);
                            if (object3 instanceof AbstractC0852m) {
                                n02 = AbstractC0865t.Y(i16, (AbstractC0852m) object3);
                            } else {
                                n02 = AbstractC0865t.n0(i16, (String) object3);
                            }
                            i15 = n02 + i15;
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = F0.o(i16, unsafe.getObject(j, j8), p(i14));
                            i15 += a02;
                            break;
                        }
                    case 61:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.Y(i16, (AbstractC0852m) unsafe.getObject(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 62:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.q0(i16, D(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 63:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.b0(i16, D(j, j8));
                            i15 += a02;
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.j0(i16);
                            i15 += a02;
                            break;
                        }
                    case 65:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.k0(i16);
                            i15 += a02;
                            break;
                        }
                    case 66:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.l0(i16, D(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 67:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.m0(i16, E(j, j8));
                            i15 += a02;
                            break;
                        }
                    case 68:
                        if (!t(i16, j, i14)) {
                            break;
                        } else {
                            a02 = AbstractC0865t.f0(i16, (AbstractC0828a) unsafe.getObject(j, j8), p(i14));
                            i15 += a02;
                            break;
                        }
                }
                i14 += 3;
                i12 = i7;
                i13 = i8;
                i11 = 1048575;
            } else {
                this.f10128l.getClass();
                return j.unknownFields.b() + i15;
            }
        }
    }

    @Override // com.google.protobuf.E0
    public final void e(Object obj, C0845i0 c0845i0) {
        c0845i0.getClass();
        if (i1.ASCENDING == i1.DESCENDING) {
            this.f10128l.getClass();
            ((J) obj).unknownFields.e(c0845i0);
            int[] iArr = this.f10119a;
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int U7 = U(length);
                int i7 = iArr[length];
                switch (T(U7)) {
                    case 0:
                        if (q(length, obj)) {
                            c0845i0.d(i7, Y0.f10049c.g(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (q(length, obj)) {
                            c0845i0.h(Y0.f10049c.h(obj, U7 & 1048575), i7);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (q(length, obj)) {
                            c0845i0.k(i7, Y0.f10049c.j(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (q(length, obj)) {
                            c0845i0.r(i7, Y0.f10049c.j(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (q(length, obj)) {
                            c0845i0.j(i7, Y0.f10049c.i(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (q(length, obj)) {
                            c0845i0.g(i7, Y0.f10049c.j(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (q(length, obj)) {
                            c0845i0.f(i7, Y0.f10049c.i(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (q(length, obj)) {
                            c0845i0.b(i7, Y0.f10049c.d(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (q(length, obj)) {
                            X(i7, Y0.f10049c.k(obj, U7 & 1048575), c0845i0);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (q(length, obj)) {
                            c0845i0.l(i7, Y0.f10049c.k(obj, U7 & 1048575), p(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (q(length, obj)) {
                            c0845i0.c(i7, (AbstractC0852m) Y0.f10049c.k(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (q(length, obj)) {
                            c0845i0.q(i7, Y0.f10049c.i(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (q(length, obj)) {
                            c0845i0.e(i7, Y0.f10049c.i(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (q(length, obj)) {
                            c0845i0.m(i7, Y0.f10049c.i(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (q(length, obj)) {
                            c0845i0.n(i7, Y0.f10049c.j(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (q(length, obj)) {
                            c0845i0.o(i7, Y0.f10049c.i(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (q(length, obj)) {
                            c0845i0.p(i7, Y0.f10049c.j(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (q(length, obj)) {
                            c0845i0.i(i7, Y0.f10049c.k(obj, U7 & 1048575), p(length));
                            break;
                        } else {
                            break;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        F0.E(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 19:
                        F0.I(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        F0.L(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 21:
                        F0.T(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 22:
                        F0.K(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 23:
                        F0.H(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 24:
                        F0.G(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 25:
                        F0.C(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 26:
                        F0.R(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0);
                        break;
                    case 27:
                        F0.M(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, p(length));
                        break;
                    case 28:
                        F0.D(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0);
                        break;
                    case 29:
                        F0.S(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 30:
                        F0.F(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 31:
                        F0.N(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        F0.O(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 33:
                        F0.P(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 34:
                        F0.Q(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, false);
                        break;
                    case 35:
                        F0.E(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 36:
                        F0.I(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 37:
                        F0.L(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 38:
                        F0.T(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 39:
                        F0.K(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 40:
                        F0.H(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 41:
                        F0.G(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 42:
                        F0.C(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 43:
                        F0.S(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 44:
                        F0.F(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 45:
                        F0.N(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 46:
                        F0.O(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 47:
                        F0.P(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 48:
                        F0.Q(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, true);
                        break;
                    case 49:
                        F0.J(iArr[length], (List) Y0.f10049c.k(obj, U7 & 1048575), c0845i0, p(length));
                        break;
                    case 50:
                        W(c0845i0, i7, Y0.f10049c.k(obj, U7 & 1048575), length);
                        break;
                    case 51:
                        if (t(i7, obj, length)) {
                            c0845i0.d(i7, ((Double) Y0.f10049c.k(obj, U7 & 1048575)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(i7, obj, length)) {
                            c0845i0.h(((Float) Y0.f10049c.k(obj, U7 & 1048575)).floatValue(), i7);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(i7, obj, length)) {
                            c0845i0.k(i7, E(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(i7, obj, length)) {
                            c0845i0.r(i7, E(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(i7, obj, length)) {
                            c0845i0.j(i7, D(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(i7, obj, length)) {
                            c0845i0.g(i7, E(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(i7, obj, length)) {
                            c0845i0.f(i7, D(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(i7, obj, length)) {
                            c0845i0.b(i7, ((Boolean) Y0.f10049c.k(obj, U7 & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(i7, obj, length)) {
                            X(i7, Y0.f10049c.k(obj, U7 & 1048575), c0845i0);
                            break;
                        } else {
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (t(i7, obj, length)) {
                            c0845i0.l(i7, Y0.f10049c.k(obj, U7 & 1048575), p(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(i7, obj, length)) {
                            c0845i0.c(i7, (AbstractC0852m) Y0.f10049c.k(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(i7, obj, length)) {
                            c0845i0.q(i7, D(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(i7, obj, length)) {
                            c0845i0.e(i7, D(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (t(i7, obj, length)) {
                            c0845i0.m(i7, D(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(i7, obj, length)) {
                            c0845i0.n(i7, E(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(i7, obj, length)) {
                            c0845i0.o(i7, D(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(i7, obj, length)) {
                            c0845i0.p(i7, E(obj, U7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(i7, obj, length)) {
                            c0845i0.i(i7, Y0.f10049c.k(obj, U7 & 1048575), p(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return;
        }
        V(obj, c0845i0);
    }

    @Override // com.google.protobuf.E0
    public final void f(Object obj, K0.l lVar, C0871w c0871w) {
        c0871w.getClass();
        k(obj);
        u(this.f10128l, obj, lVar, c0871w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.g(r12, r7)) == java.lang.Double.doubleToLongBits(r5.g(r13, r7))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (com.google.protobuf.F0.B(r9.k(r12, r7), r9.k(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (com.google.protobuf.F0.B(r5.k(r12, r7), r5.k(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.j(r12, r7) == r5.j(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.i(r12, r7) == r5.i(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.j(r12, r7) == r5.j(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.i(r12, r7) == r5.i(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.i(r12, r7) == r5.i(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.i(r12, r7) == r5.i(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (com.google.protobuf.F0.B(r5.k(r12, r7), r5.k(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (com.google.protobuf.F0.B(r5.k(r12, r7), r5.k(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (com.google.protobuf.F0.B(r5.k(r12, r7), r5.k(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.d(r12, r7) == r5.d(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.i(r12, r7) == r5.i(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.j(r12, r7) == r5.j(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.i(r12, r7) == r5.i(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.j(r12, r7) == r5.j(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.j(r12, r7) == r5.j(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.h(r12, r7)) == java.lang.Float.floatToIntBits(r5.h(r13, r7))) goto L85;
     */
    @Override // com.google.protobuf.E0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.protobuf.J r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0862r0.g(com.google.protobuf.J, java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.E0
    public final void h(Object obj, byte[] bArr, int i7, int i8, C0838f c0838f) {
        G(obj, bArr, i7, i8, 0, c0838f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0216, code lost:
        if (r4 != false) goto L52;
     */
    @Override // com.google.protobuf.E0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.protobuf.J r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0862r0.i(com.google.protobuf.J):int");
    }

    public final boolean j(J j, Object obj, int i7) {
        if (q(i7, j) == q(i7, obj)) {
            return true;
        }
        return false;
    }

    public final void m(int i7, Object obj, Object obj2) {
        int i8 = this.f10119a[i7];
        if (Y0.f10049c.k(obj, U(i7) & 1048575) == null) {
            return;
        }
        n(i7);
    }

    public final void n(int i7) {
        if (this.f10120b[((i7 / 3) * 2) + 1] == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override // com.google.protobuf.E0
    public final J newInstance() {
        this.j.getClass();
        return ((J) this.f10123e).q();
    }

    public final Object o(int i7) {
        return this.f10120b[(i7 / 3) * 2];
    }

    public final E0 p(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f10120b;
        E0 e02 = (E0) objArr[i8];
        if (e02 != null) {
            return e02;
        }
        E0 a7 = C0878z0.f10148c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a7;
        return a7;
    }

    public final boolean q(int i7, Object obj) {
        int i8 = this.f10119a[i7 + 2];
        long j = i8 & 1048575;
        if (j == 1048575) {
            int U7 = U(i7);
            long j8 = U7 & 1048575;
            switch (T(U7)) {
                case 0:
                    if (Double.doubleToRawLongBits(Y0.f10049c.g(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(Y0.f10049c.h(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (Y0.f10049c.j(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (Y0.f10049c.j(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (Y0.f10049c.i(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (Y0.f10049c.j(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (Y0.f10049c.i(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return Y0.f10049c.d(obj, j8);
                case 8:
                    Object k2 = Y0.f10049c.k(obj, j8);
                    if (k2 instanceof String) {
                        return !((String) k2).isEmpty();
                    }
                    if (k2 instanceof AbstractC0852m) {
                        return !AbstractC0852m.f10085b.equals(k2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (Y0.f10049c.k(obj, j8) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC0852m.f10085b.equals(Y0.f10049c.k(obj, j8));
                case 11:
                    if (Y0.f10049c.i(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case H4.e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (Y0.f10049c.i(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (Y0.f10049c.i(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (Y0.f10049c.j(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (Y0.f10049c.i(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (Y0.f10049c.j(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (Y0.f10049c.k(obj, j8) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & Y0.f10049c.i(obj, j)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean r(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return q(i7, obj);
        }
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t(int i7, Object obj, int i8) {
        if (Y0.f10049c.i(obj, this.f10119a[i8 + 2] & 1048575) == i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x06a0 A[Catch: all -> 0x06c4, TryCatch #2 {all -> 0x06c4, blocks: (B:49:0x00c7, B:122:0x069b, B:124:0x06a0, B:125:0x06a5, B:50:0x00de, B:51:0x00f9, B:52:0x0115, B:53:0x0131, B:54:0x014f, B:55:0x016a, B:56:0x017e, B:57:0x0198, B:58:0x01a4, B:59:0x01bf, B:60:0x01db, B:61:0x01f7, B:62:0x0212, B:63:0x022d, B:64:0x0248, B:65:0x0264, B:66:0x0280, B:67:0x0295, B:69:0x02ab, B:70:0x02b0, B:71:0x02c2, B:72:0x02d4, B:73:0x02e6, B:74:0x02f8, B:75:0x0310, B:76:0x0322, B:77:0x0334, B:78:0x0346, B:79:0x0358, B:80:0x036a, B:81:0x037c, B:82:0x038e, B:83:0x03a0, B:84:0x03b2, B:85:0x03c4, B:86:0x03d6, B:87:0x03e8, B:88:0x03fa, B:89:0x0412, B:90:0x0424, B:91:0x0436, B:92:0x044d, B:93:0x0457, B:94:0x0469, B:95:0x047b, B:96:0x048d, B:97:0x049f, B:98:0x04b1, B:99:0x04c3, B:100:0x04d5, B:101:0x04e7, B:102:0x0502, B:103:0x051a, B:104:0x0532, B:105:0x054b, B:106:0x0564, B:107:0x057f, B:108:0x0597, B:109:0x05ac, B:110:0x05c7, B:111:0x05d4, B:112:0x05ec, B:113:0x0605, B:114:0x061e, B:115:0x0635, B:116:0x064c, B:117:0x0663, B:118:0x067b), top: B:147:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06ab A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(com.google.protobuf.Q0 r19, java.lang.Object r20, K0.l r21, com.google.protobuf.C0871w r22) {
        /*
            Method dump skipped, instructions count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0862r0.u(com.google.protobuf.Q0, java.lang.Object, K0.l, com.google.protobuf.w):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009d, code lost:
        r0.i(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(java.lang.Object r9, int r10, java.lang.Object r11, com.google.protobuf.C0871w r12, K0.l r13) {
        /*
            r8 = this;
            int r10 = r8.U(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            com.google.protobuf.X0 r10 = com.google.protobuf.Y0.f10049c
            java.lang.Object r10 = r10.k(r9, r0)
            com.google.protobuf.m0 r2 = r8.f10129m
            if (r10 != 0) goto L20
            r2.getClass()
            com.google.protobuf.l0 r10 = com.google.protobuf.C0851l0.f10083b
            com.google.protobuf.l0 r10 = r10.c()
            com.google.protobuf.Y0.s(r9, r0, r10)
            goto L36
        L20:
            r2.getClass()
            boolean r3 = com.google.protobuf.C0853m0.d(r10)
            if (r3 == 0) goto L36
            com.google.protobuf.l0 r3 = com.google.protobuf.C0851l0.f10083b
            com.google.protobuf.l0 r3 = r3.c()
            com.google.protobuf.C0853m0.e(r3, r10)
            com.google.protobuf.Y0.s(r9, r0, r3)
            r10 = r3
        L36:
            r2.getClass()
            com.google.protobuf.l0 r10 = (com.google.protobuf.C0851l0) r10
            com.google.protobuf.k0 r11 = (com.google.protobuf.C0849k0) r11
            com.google.protobuf.j0 r9 = r11.f10080a
            r11 = 2
            r13.V(r11)
            java.lang.Object r0 = r13.f2497e
            J6.b r0 = (J6.b) r0
            int r1 = r0.B()
            int r1 = r0.j(r1)
            java.lang.String r2 = ""
            java.lang.Object r3 = r9.f10078c
            r4 = r3
        L54:
            int r5 = r13.b()     // Catch: java.lang.Throwable -> L78
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9a
            boolean r6 = r0.g()     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L64
            goto L9a
        L64:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L85
            if (r5 == r11) goto L7a
            boolean r5 = r13.W()     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            if (r5 == 0) goto L72
            goto L54
        L72:
            com.google.protobuf.X r5 = new com.google.protobuf.X     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            throw r5     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
        L78:
            r9 = move-exception
            goto La1
        L7a:
            com.google.protobuf.g1 r5 = r9.f10077b     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            java.lang.Object r4 = r13.u(r5, r6, r12)     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            goto L54
        L85:
            com.google.protobuf.g1 r5 = r9.f10076a     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            r6 = 0
            java.lang.Object r2 = r13.u(r5, r6, r6)     // Catch: java.lang.Throwable -> L78 com.google.protobuf.W -> L8d
            goto L54
        L8d:
            boolean r5 = r13.W()     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L94
            goto L54
        L94:
            com.google.protobuf.X r9 = new com.google.protobuf.X     // Catch: java.lang.Throwable -> L78
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L78
            throw r9     // Catch: java.lang.Throwable -> L78
        L9a:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L78
            r0.i(r1)
            return
        La1:
            r0.i(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C0862r0.v(java.lang.Object, int, java.lang.Object, com.google.protobuf.w, K0.l):void");
    }

    public final void w(int i7, Object obj, Object obj2) {
        if (!q(i7, obj2)) {
            return;
        }
        long U7 = U(i7) & 1048575;
        Unsafe unsafe = f10118o;
        Object object = unsafe.getObject(obj2, U7);
        if (object != null) {
            E0 p7 = p(i7);
            if (!q(i7, obj)) {
                if (!s(object)) {
                    unsafe.putObject(obj, U7, object);
                } else {
                    J newInstance = p7.newInstance();
                    p7.a(newInstance, object);
                    unsafe.putObject(obj, U7, newInstance);
                }
                O(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, U7);
            if (!s(object2)) {
                J newInstance2 = p7.newInstance();
                p7.a(newInstance2, object2);
                unsafe.putObject(obj, U7, newInstance2);
                object2 = newInstance2;
            }
            p7.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f10119a[i7] + " is present but null: " + obj2);
    }

    public final void x(int i7, Object obj, Object obj2) {
        int[] iArr;
        int i8 = this.f10119a[i7];
        if (!t(i8, obj2, i7)) {
            return;
        }
        long U7 = U(i7) & 1048575;
        Unsafe unsafe = f10118o;
        Object object = unsafe.getObject(obj2, U7);
        if (object != null) {
            E0 p7 = p(i7);
            if (!t(i8, obj, i7)) {
                if (!s(object)) {
                    unsafe.putObject(obj, U7, object);
                } else {
                    J newInstance = p7.newInstance();
                    p7.a(newInstance, object);
                    unsafe.putObject(obj, U7, newInstance);
                }
                P(i8, obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, U7);
            if (!s(object2)) {
                J newInstance2 = p7.newInstance();
                p7.a(newInstance2, object2);
                unsafe.putObject(obj, U7, newInstance2);
                object2 = newInstance2;
            }
            p7.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
    }

    public final Object y(int i7, Object obj) {
        E0 p7 = p(i7);
        long U7 = U(i7) & 1048575;
        if (!q(i7, obj)) {
            return p7.newInstance();
        }
        Object object = f10118o.getObject(obj, U7);
        if (s(object)) {
            return object;
        }
        J newInstance = p7.newInstance();
        if (object != null) {
            p7.a(newInstance, object);
        }
        return newInstance;
    }

    public final Object z(int i7, Object obj, int i8) {
        E0 p7 = p(i8);
        if (!t(i7, obj, i8)) {
            return p7.newInstance();
        }
        Object object = f10118o.getObject(obj, U(i8) & 1048575);
        if (s(object)) {
            return object;
        }
        J newInstance = p7.newInstance();
        if (object != null) {
            p7.a(newInstance, object);
        }
        return newInstance;
    }
}
