package com.google.crypto.tink.shaded.protobuf;

import D.AbstractC0059i;
import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class W implements g0 {

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f9613o = new int[0];

    /* renamed from: p  reason: collision with root package name */
    public static final Unsafe f9614p = s0.m();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f9615a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9616b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9617c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9618d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0774a f9619e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9620g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f9621h;

    /* renamed from: i  reason: collision with root package name */
    public final int f9622i;
    public final int j;

    /* renamed from: k  reason: collision with root package name */
    public final Y f9623k;

    /* renamed from: l  reason: collision with root package name */
    public final L f9624l;

    /* renamed from: m  reason: collision with root package name */
    public final k0 f9625m;

    /* renamed from: n  reason: collision with root package name */
    public final Q f9626n;

    public W(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0774a abstractC0774a, boolean z7, int[] iArr2, int i9, int i10, Y y2, L l8, k0 k0Var, C0788o c0788o, Q q2) {
        this.f9615a = iArr;
        this.f9616b = objArr;
        this.f9617c = i7;
        this.f9618d = i8;
        this.f = abstractC0774a instanceof AbstractC0797y;
        this.f9620g = z7;
        this.f9621h = iArr2;
        this.f9622i = i9;
        this.j = i10;
        this.f9623k = y2;
        this.f9624l = l8;
        this.f9625m = k0Var;
        this.f9619e = abstractC0774a;
        this.f9626n = q2;
    }

    public static W B(f0 f0Var, Y y2, L l8, k0 k0Var, C0788o c0788o, Q q2) {
        if (f0Var instanceof f0) {
            return C(f0Var, y2, l8, k0Var, c0788o, q2);
        }
        f0Var.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0387  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.crypto.tink.shaded.protobuf.W C(com.google.crypto.tink.shaded.protobuf.f0 r32, com.google.crypto.tink.shaded.protobuf.Y r33, com.google.crypto.tink.shaded.protobuf.L r34, com.google.crypto.tink.shaded.protobuf.k0 r35, com.google.crypto.tink.shaded.protobuf.C0788o r36, com.google.crypto.tink.shaded.protobuf.Q r37) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.W.C(com.google.crypto.tink.shaded.protobuf.f0, com.google.crypto.tink.shaded.protobuf.Y, com.google.crypto.tink.shaded.protobuf.L, com.google.crypto.tink.shaded.protobuf.k0, com.google.crypto.tink.shaded.protobuf.o, com.google.crypto.tink.shaded.protobuf.Q):com.google.crypto.tink.shaded.protobuf.W");
    }

    public static long D(int i7) {
        return i7 & 1048575;
    }

    public static int E(Object obj, long j) {
        return ((Integer) s0.f9691c.i(obj, j)).intValue();
    }

    public static long F(Object obj, long j) {
        return ((Long) s0.f9691c.i(obj, j)).longValue();
    }

    public static Field P(Class cls, String str) {
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

    public static int V(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void Y(int i7, Object obj, O o7) {
        if (obj instanceof String) {
            String str = (String) obj;
            C0784k c0784k = (C0784k) o7.f9607a;
            c0784k.e0(i7, 2);
            int i8 = c0784k.f9676g;
            try {
                int U7 = C0784k.U(str.length() * 3);
                int U8 = C0784k.U(str.length());
                byte[] bArr = c0784k.f9675e;
                int i9 = c0784k.f;
                if (U8 == U7) {
                    int i10 = i8 + U8;
                    c0784k.f9676g = i10;
                    int v6 = v0.f9700a.v(str, bArr, i10, i9 - i10);
                    c0784k.f9676g = i8;
                    c0784k.f0((v6 - i8) - U8);
                    c0784k.f9676g = v6;
                } else {
                    c0784k.f0(v0.b(str));
                    int i11 = c0784k.f9676g;
                    c0784k.f9676g = v0.f9700a.v(str, bArr, i11, i9 - i11);
                }
                return;
            } catch (u0 e7) {
                c0784k.f9676g = i8;
                C0784k.f9672h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
                byte[] bytes = str.getBytes(D.f9598a);
                try {
                    c0784k.f0(bytes.length);
                    c0784k.Y(bytes, 0, bytes.length);
                    return;
                } catch (IndexOutOfBoundsException e8) {
                    throw new R0.a(e8);
                }
            } catch (IndexOutOfBoundsException e9) {
                throw new R0.a(e9);
            }
        }
        o7.b(i7, (AbstractC0781h) obj);
    }

    public static void k(Object obj) {
        if (s(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0797y) {
            return ((AbstractC0797y) obj).p();
        }
        return true;
    }

    public static List u(AbstractC0797y abstractC0797y, long j) {
        return (List) s0.f9691c.i(abstractC0797y, j);
    }

    public final Object A(int i7, Object obj, int i8) {
        g0 o7 = o(i8);
        if (!t(i7, obj, i8)) {
            return o7.newInstance();
        }
        Object object = f9614p.getObject(obj, W(i8) & 1048575);
        if (s(object)) {
            return object;
        }
        Object newInstance = o7.newInstance();
        if (object != null) {
            o7.a(newInstance, object);
        }
        return newInstance;
    }

    public final void G(long j, Object obj, int i7) {
        Unsafe unsafe = f9614p;
        Object n7 = n(i7);
        Object object = unsafe.getObject(obj, j);
        this.f9626n.getClass();
        if (Q.c(object)) {
            P e7 = Q.e();
            Q.d(e7, object);
            unsafe.putObject(obj, j, e7);
        }
        Q.a(n7);
        throw null;
    }

    public final int H(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j, int i14, B2.c cVar) {
        Unsafe unsafe = f9614p;
        long j8 = this.f9615a[i14 + 2] & 1048575;
        boolean z7 = true;
        switch (i13) {
            case 51:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(f7.a.j(bArr, i7)));
                    int i15 = i7 + 8;
                    unsafe.putInt(obj, j8, i10);
                    return i15;
                }
                break;
            case 52:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(f7.a.p(bArr, i7)));
                    int i16 = i7 + 4;
                    unsafe.putInt(obj, j8, i10);
                    return i16;
                }
                break;
            case 53:
            case 54:
                if (i11 == 0) {
                    int M7 = f7.a.M(bArr, i7, cVar);
                    unsafe.putObject(obj, j, Long.valueOf(cVar.f250b));
                    unsafe.putInt(obj, j8, i10);
                    return M7;
                }
                break;
            case 55:
            case 62:
                if (i11 == 0) {
                    int K7 = f7.a.K(bArr, i7, cVar);
                    unsafe.putObject(obj, j, Integer.valueOf(cVar.f249a));
                    unsafe.putInt(obj, j8, i10);
                    return K7;
                }
                break;
            case 56:
            case 65:
                if (i11 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(f7.a.n(bArr, i7)));
                    int i17 = i7 + 8;
                    unsafe.putInt(obj, j8, i10);
                    return i17;
                }
                break;
            case 57:
            case RecognitionOptions.EAN_8 /* 64 */:
                if (i11 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(f7.a.l(bArr, i7)));
                    int i18 = i7 + 4;
                    unsafe.putInt(obj, j8, i10);
                    return i18;
                }
                break;
            case 58:
                if (i11 == 0) {
                    int M8 = f7.a.M(bArr, i7, cVar);
                    if (cVar.f250b == 0) {
                        z7 = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z7));
                    unsafe.putInt(obj, j8, i10);
                    return M8;
                }
                break;
            case 59:
                if (i11 == 2) {
                    int K8 = f7.a.K(bArr, i7, cVar);
                    int i19 = cVar.f249a;
                    if (i19 == 0) {
                        unsafe.putObject(obj, j, StringUtils.EMPTY);
                    } else if ((i12 & 536870912) != 0 && !v0.e(bArr, K8, K8 + i19)) {
                        throw F.b();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, K8, i19, D.f9598a));
                        K8 += i19;
                    }
                    unsafe.putInt(obj, j8, i10);
                    return K8;
                }
                break;
            case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                if (i11 == 2) {
                    Object A7 = A(i10, obj, i14);
                    int c02 = f7.a.c0(A7, o(i14), bArr, i7, i8, cVar);
                    U(obj, i10, i14, A7);
                    return c02;
                }
                break;
            case 61:
                if (i11 == 2) {
                    int h8 = f7.a.h(bArr, i7, cVar);
                    unsafe.putObject(obj, j, cVar.f251c);
                    unsafe.putInt(obj, j8, i10);
                    return h8;
                }
                break;
            case 63:
                if (i11 == 0) {
                    int K9 = f7.a.K(bArr, i7, cVar);
                    int i20 = cVar.f249a;
                    m(i14);
                    unsafe.putObject(obj, j, Integer.valueOf(i20));
                    unsafe.putInt(obj, j8, i10);
                    return K9;
                }
                break;
            case 66:
                if (i11 == 0) {
                    int K10 = f7.a.K(bArr, i7, cVar);
                    unsafe.putObject(obj, j, Integer.valueOf(H3.d.d(cVar.f249a)));
                    unsafe.putInt(obj, j8, i10);
                    return K10;
                }
                break;
            case 67:
                if (i11 == 0) {
                    int M9 = f7.a.M(bArr, i7, cVar);
                    unsafe.putObject(obj, j, Long.valueOf(H3.d.e(cVar.f250b)));
                    unsafe.putInt(obj, j8, i10);
                    return M9;
                }
                break;
            case 68:
                if (i11 == 3) {
                    Object A8 = A(i10, obj, i14);
                    int b0 = f7.a.b0(A8, o(i14), bArr, i7, i8, (i9 & (-8)) | 4, cVar);
                    U(obj, i10, i14, A8);
                    return b0;
                }
                break;
        }
        return i7;
    }

    public final int I(Object obj, byte[] bArr, int i7, int i8, int i9, B2.c cVar) {
        Unsafe unsafe;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int M7;
        int i29;
        int i30;
        W w2 = this;
        byte[] bArr2 = bArr;
        int i31 = i8;
        int i32 = i9;
        B2.c cVar2 = cVar;
        k(obj);
        Unsafe unsafe2 = f9614p;
        int i33 = i7;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 1048575;
        while (true) {
            if (i33 < i31) {
                int i39 = i33 + 1;
                byte b5 = bArr2[i33];
                if (b5 < 0) {
                    i12 = f7.a.J(b5, bArr2, i39, cVar2);
                    i11 = cVar2.f249a;
                } else {
                    i11 = b5;
                    i12 = i39;
                }
                int i40 = i11 >>> 3;
                int i41 = i11 & 7;
                int i42 = w2.f9618d;
                int i43 = i12;
                int i44 = w2.f9617c;
                int i45 = i11;
                if (i40 > i34) {
                    i15 = (i40 < i44 || i40 > i42) ? -1 : w2.S(i40, i35 / 3);
                    i16 = -1;
                    i13 = 0;
                } else {
                    if (i40 < i44 || i40 > i42) {
                        i13 = 0;
                        i14 = -1;
                    } else {
                        i13 = 0;
                        i14 = w2.S(i40, 0);
                    }
                    i15 = i14;
                    i16 = -1;
                }
                if (i15 == i16) {
                    i17 = i38;
                    i18 = i40;
                    i19 = i13;
                    unsafe = unsafe2;
                    i10 = i32;
                    i20 = i43;
                    i21 = i45;
                    i22 = i37;
                } else {
                    int[] iArr = w2.f9615a;
                    int i46 = iArr[i15 + 1];
                    int V7 = V(i46);
                    long j = i46 & 1048575;
                    if (V7 <= 17) {
                        int i47 = iArr[i15 + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i38) {
                            if (i38 != 1048575) {
                                unsafe2.putInt(obj, i38, i37);
                            }
                            i24 = i49;
                            i23 = unsafe2.getInt(obj, i49);
                        } else {
                            i23 = i37;
                            i24 = i38;
                        }
                        switch (V7) {
                            case 0:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 1) {
                                    s0.r(obj, j, f7.a.j(bArr2, i25));
                                    i33 = i25 + 8;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 1:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 5) {
                                    s0.s(obj, j, f7.a.p(bArr2, i25));
                                    i33 = i25 + 4;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 2:
                            case 3:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    M7 = f7.a.M(bArr2, i25, cVar2);
                                    unsafe2.putLong(obj, j, cVar2.f250b);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i33 = M7;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 4:
                            case 11:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    i33 = f7.a.K(bArr2, i25, cVar2);
                                    unsafe2.putInt(obj, j, cVar2.f249a);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 5:
                            case 14:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 1) {
                                    unsafe2.putLong(obj, j, f7.a.n(bArr2, i29));
                                    i33 = i29 + 8;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 6:
                            case 13:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 5) {
                                    unsafe2.putInt(obj, j, f7.a.l(bArr2, i29));
                                    i33 = i29 + 4;
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 7:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    int M8 = f7.a.M(bArr2, i29, cVar2);
                                    s0.n(obj, j, cVar2.f250b != 0);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i33 = M8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 8:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 2) {
                                    if ((i46 & 536870912) == 0) {
                                        i33 = f7.a.E(bArr2, i29, cVar2);
                                    } else {
                                        i33 = f7.a.H(bArr2, i29, cVar2);
                                    }
                                    unsafe2.putObject(obj, j, cVar2.f251c);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 9:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 2) {
                                    Object z7 = w2.z(i28, obj);
                                    i33 = f7.a.c0(z7, w2.o(i28), bArr, i29, i8, cVar);
                                    w2.T(i28, obj, z7);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 10:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 2) {
                                    i33 = f7.a.h(bArr2, i29, cVar2);
                                    unsafe2.putObject(obj, j, cVar2.f251c);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    i33 = f7.a.K(bArr2, i29, cVar2);
                                    int i50 = cVar2.f249a;
                                    w2.m(i28);
                                    unsafe2.putInt(obj, j, i50);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 15:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    i33 = f7.a.K(bArr2, i29, cVar2);
                                    unsafe2.putInt(obj, j, H3.d.d(cVar2.f249a));
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case RecognitionOptions.DATA_MATRIX /* 16 */:
                                i18 = i40;
                                i29 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                if (i41 == 0) {
                                    M7 = f7.a.M(bArr2, i29, cVar2);
                                    unsafe2.putLong(obj, j, H3.d.e(cVar2.f250b));
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i33 = M7;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            case 17:
                                if (i41 == 3) {
                                    Object z8 = w2.z(i15, obj);
                                    i27 = i24;
                                    i26 = i45;
                                    i28 = i15;
                                    i18 = i40;
                                    i33 = f7.a.b0(z8, w2.o(i15), bArr, i43, i8, (i40 << 3) | 4, cVar);
                                    w2.T(i28, obj, z8);
                                    i37 = i23 | i48;
                                    i31 = i8;
                                    i35 = i28;
                                    i34 = i18;
                                    i36 = i26;
                                    i38 = i27;
                                    break;
                                } else {
                                    i18 = i40;
                                    i29 = i43;
                                    i26 = i45;
                                    i27 = i24;
                                    i28 = i15;
                                    i25 = i29;
                                    i20 = i25;
                                    unsafe = unsafe2;
                                    i19 = i28;
                                    i21 = i26;
                                    i17 = i27;
                                    i10 = i9;
                                    i22 = i23;
                                    break;
                                }
                            default:
                                i18 = i40;
                                i25 = i43;
                                i26 = i45;
                                i27 = i24;
                                i28 = i15;
                                i20 = i25;
                                unsafe = unsafe2;
                                i19 = i28;
                                i21 = i26;
                                i17 = i27;
                                i10 = i9;
                                i22 = i23;
                                break;
                        }
                        i32 = i9;
                    } else {
                        i18 = i40;
                        int i51 = i15;
                        if (V7 != 27) {
                            i22 = i37;
                            i17 = i38;
                            if (V7 <= 49) {
                                unsafe = unsafe2;
                                i19 = i51;
                                i33 = K(obj, bArr, i43, i8, i45, i41, i51, i46, V7, j, cVar);
                                if (i33 != i43) {
                                    w2 = this;
                                    bArr2 = bArr;
                                    i31 = i8;
                                    i32 = i9;
                                    cVar2 = cVar;
                                    i34 = i18;
                                    i36 = i45;
                                    i37 = i22;
                                    i38 = i17;
                                    unsafe2 = unsafe;
                                    i35 = i19;
                                } else {
                                    i10 = i9;
                                    i20 = i33;
                                }
                            } else {
                                i30 = i43;
                                unsafe = unsafe2;
                                i19 = i51;
                                if (V7 != 50) {
                                    i33 = H(obj, bArr, i30, i8, i45, i18, i41, i46, V7, j, i19, cVar);
                                    if (i33 != i30) {
                                        w2 = this;
                                        bArr2 = bArr;
                                        i31 = i8;
                                        i32 = i9;
                                        cVar2 = cVar;
                                        i35 = i19;
                                        i34 = i18;
                                        i36 = i45;
                                        i37 = i22;
                                        i38 = i17;
                                        unsafe2 = unsafe;
                                    } else {
                                        i10 = i9;
                                        i20 = i33;
                                        i19 = i19;
                                    }
                                } else if (i41 == 2) {
                                    G(j, obj, i19);
                                    throw null;
                                }
                            }
                            i21 = i45;
                        } else if (i41 == 2) {
                            AbstractC0775b abstractC0775b = (AbstractC0775b) ((C) unsafe2.getObject(obj, j));
                            boolean f = abstractC0775b.f();
                            C c8 = abstractC0775b;
                            if (!f) {
                                int size = abstractC0775b.size();
                                C a7 = abstractC0775b.a(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(obj, j, a7);
                                c8 = a7;
                            }
                            i33 = f7.a.s(w2.o(i51), i45, bArr, i43, i8, c8, cVar);
                            i31 = i8;
                            i35 = i51;
                            i34 = i18;
                            i36 = i45;
                            i37 = i37;
                            i38 = i38;
                            i32 = i9;
                        } else {
                            i22 = i37;
                            i17 = i38;
                            i30 = i43;
                            unsafe = unsafe2;
                            i19 = i51;
                        }
                        i10 = i9;
                        i20 = i30;
                        i21 = i45;
                    }
                }
                if (i21 != i10 || i10 == 0) {
                    AbstractC0797y abstractC0797y = (AbstractC0797y) obj;
                    j0 j0Var = abstractC0797y.unknownFields;
                    if (j0Var == j0.f) {
                        j0Var = j0.c();
                        abstractC0797y.unknownFields = j0Var;
                    }
                    i33 = f7.a.I(i21, bArr, i20, i8, j0Var, cVar);
                    w2 = this;
                    bArr2 = bArr;
                    i31 = i8;
                    cVar2 = cVar;
                    i32 = i10;
                    i36 = i21;
                    i34 = i18;
                    i37 = i22;
                    i38 = i17;
                    unsafe2 = unsafe;
                    i35 = i19;
                } else {
                    i33 = i20;
                    i36 = i21;
                    i37 = i22;
                    i38 = i17;
                }
            } else {
                unsafe = unsafe2;
                i10 = i32;
            }
        }
        if (i38 != 1048575) {
            unsafe.putInt(obj, i38, i37);
        }
        for (int i52 = this.f9622i; i52 < this.j; i52++) {
            l(this.f9621h[i52], obj, null);
        }
        if (i10 == 0) {
            if (i33 != i8) {
                throw F.f();
            }
        } else if (i33 > i8 || i36 != i10) {
            throw F.f();
        }
        return i33;
    }

    public final void J(Object obj, byte[] bArr, int i7, int i8, B2.c cVar) {
        byte b5;
        int i9;
        int S7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int M7;
        int i20;
        boolean z7;
        W w2 = this;
        byte[] bArr2 = bArr;
        int i21 = i8;
        B2.c cVar2 = cVar;
        k(obj);
        Unsafe unsafe2 = f9614p;
        int i22 = 0;
        int i23 = i7;
        int i24 = 0;
        int i25 = 0;
        int i26 = -1;
        int i27 = 1048575;
        while (i23 < i21) {
            int i28 = i23 + 1;
            byte b7 = bArr2[i23];
            if (b7 < 0) {
                i9 = f7.a.J(b7, bArr2, i28, cVar2);
                b5 = cVar2.f249a;
            } else {
                b5 = b7;
                i9 = i28;
            }
            int i29 = b5 >>> 3;
            int i30 = b5 & 7;
            int i31 = w2.f9618d;
            int i32 = w2.f9617c;
            if (i29 > i26) {
                int i33 = i24 / 3;
                if (i29 >= i32 && i29 <= i31) {
                    S7 = w2.S(i29, i33);
                }
                S7 = -1;
            } else {
                if (i29 >= i32 && i29 <= i31) {
                    S7 = w2.S(i29, i22);
                }
                S7 = -1;
            }
            int i34 = S7;
            if (i34 == -1) {
                i10 = i29;
                i11 = i9;
                i12 = i25;
                i13 = i22;
                i14 = i13;
                unsafe = unsafe2;
            } else {
                int[] iArr = w2.f9615a;
                int i35 = iArr[i34 + 1];
                int V7 = V(i35);
                i10 = i29;
                int i36 = i9;
                long j = i35 & 1048575;
                if (V7 <= 17) {
                    int i37 = iArr[i34 + 2];
                    int i38 = 1 << (i37 >>> 20);
                    int i39 = i37 & 1048575;
                    if (i39 != i27) {
                        if (i27 != 1048575) {
                            unsafe2.putInt(obj, i27, i25);
                        }
                        if (i39 != 1048575) {
                            i25 = unsafe2.getInt(obj, i39);
                        }
                        i18 = i39;
                    } else {
                        i18 = i27;
                    }
                    int i40 = i25;
                    switch (V7) {
                        case 0:
                            i19 = i36;
                            if (i30 == 1) {
                                s0.r(obj, j, f7.a.j(bArr2, i19));
                                i23 = i19 + 8;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            } else {
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 1:
                            i19 = i36;
                            if (i30 == 5) {
                                s0.s(obj, j, f7.a.p(bArr2, i19));
                                i23 = i19 + 4;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            } else {
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 2:
                        case 3:
                            i19 = i36;
                            if (i30 == 0) {
                                M7 = f7.a.M(bArr2, i19, cVar2);
                                unsafe2.putLong(obj, j, cVar2.f250b);
                                i25 = i40 | i38;
                                i27 = i18;
                                i24 = i34;
                                i23 = M7;
                                i26 = i10;
                                i22 = 0;
                                i21 = i8;
                                break;
                            } else {
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 4:
                        case 11:
                            i19 = i36;
                            if (i30 == 0) {
                                i23 = f7.a.K(bArr2, i19, cVar2);
                                unsafe2.putInt(obj, j, cVar2.f249a);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            } else {
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case 5:
                        case 14:
                            i20 = i36;
                            if (i30 != 1) {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i19 = i20;
                                unsafe2.putLong(obj, j, f7.a.n(bArr2, i20));
                                i23 = i19 + 8;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            }
                        case 6:
                        case 13:
                            i20 = i36;
                            if (i30 != 5) {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                unsafe2.putInt(obj, j, f7.a.l(bArr2, i20));
                                i23 = i20 + 4;
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            }
                        case 7:
                            i20 = i36;
                            if (i30 != 0) {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i23 = f7.a.M(bArr2, i20, cVar2);
                                if (cVar2.f250b != 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                s0.n(obj, j, z7);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            }
                        case 8:
                            i20 = i36;
                            if (i30 != 2) {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                if ((536870912 & i35) == 0) {
                                    i23 = f7.a.E(bArr2, i20, cVar2);
                                } else {
                                    i23 = f7.a.H(bArr2, i20, cVar2);
                                }
                                unsafe2.putObject(obj, j, cVar2.f251c);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            }
                        case 9:
                            i20 = i36;
                            if (i30 != 2) {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                Object z8 = w2.z(i34, obj);
                                i23 = f7.a.c0(z8, w2.o(i34), bArr, i20, i8, cVar);
                                w2.T(i34, obj, z8);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            }
                        case 10:
                            i20 = i36;
                            if (i30 != 2) {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i23 = f7.a.h(bArr2, i20, cVar2);
                                unsafe2.putObject(obj, j, cVar2.f251c);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            }
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            i20 = i36;
                            if (i30 != 0) {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                i23 = f7.a.K(bArr2, i20, cVar2);
                                unsafe2.putInt(obj, j, cVar2.f249a);
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            }
                        case 15:
                            i20 = i36;
                            if (i30 == 0) {
                                i23 = f7.a.K(bArr2, i20, cVar2);
                                unsafe2.putInt(obj, j, H3.d.d(cVar2.f249a));
                                i25 = i40 | i38;
                                i21 = i8;
                                i27 = i18;
                                i24 = i34;
                                i26 = i10;
                                i22 = 0;
                                break;
                            } else {
                                i19 = i20;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            }
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            if (i30 != 0) {
                                i19 = i36;
                                i12 = i40;
                                i27 = i18;
                                i14 = i34;
                                unsafe = unsafe2;
                                i11 = i19;
                                i13 = 0;
                                break;
                            } else {
                                M7 = f7.a.M(bArr2, i36, cVar2);
                                unsafe2.putLong(obj, j, H3.d.e(cVar2.f250b));
                                i25 = i40 | i38;
                                i27 = i18;
                                i24 = i34;
                                i23 = M7;
                                i26 = i10;
                                i22 = 0;
                                i21 = i8;
                                break;
                            }
                        default:
                            i19 = i36;
                            i12 = i40;
                            i27 = i18;
                            i14 = i34;
                            unsafe = unsafe2;
                            i11 = i19;
                            i13 = 0;
                            break;
                    }
                } else {
                    if (V7 == 27) {
                        if (i30 == 2) {
                            AbstractC0775b abstractC0775b = (AbstractC0775b) ((C) unsafe2.getObject(obj, j));
                            boolean f = abstractC0775b.f();
                            C c8 = abstractC0775b;
                            if (!f) {
                                int size = abstractC0775b.size();
                                if (size == 0) {
                                    i17 = 10;
                                } else {
                                    i17 = size * 2;
                                }
                                C a7 = abstractC0775b.a(i17);
                                unsafe2.putObject(obj, j, a7);
                                c8 = a7;
                            }
                            i23 = f7.a.s(w2.o(i34), b5, bArr, i36, i8, c8, cVar);
                            i25 = i25;
                            i24 = i34;
                            i27 = i27;
                            i26 = i10;
                            i22 = 0;
                            i21 = i8;
                        } else {
                            i12 = i25;
                            i16 = i36;
                            i14 = i34;
                            unsafe = unsafe2;
                            i15 = i27;
                            i13 = 0;
                        }
                    } else {
                        int i41 = i27;
                        int i42 = i25;
                        if (V7 <= 49) {
                            i15 = i41;
                            i12 = i42;
                            i14 = i34;
                            i13 = 0;
                            unsafe = unsafe2;
                            i23 = K(obj, bArr, i36, i8, b5, i30, i34, i35, V7, j, cVar);
                            if (i23 != i36) {
                                w2 = this;
                                bArr2 = bArr;
                                i21 = i8;
                                cVar2 = cVar;
                                i22 = 0;
                                i26 = i10;
                                i27 = i15;
                                i25 = i12;
                                i24 = i14;
                            } else {
                                i11 = i23;
                            }
                        } else {
                            i15 = i41;
                            i12 = i42;
                            i16 = i36;
                            i14 = i34;
                            unsafe = unsafe2;
                            i13 = 0;
                            if (V7 == 50) {
                                if (i30 == 2) {
                                    G(j, obj, i14);
                                    throw null;
                                }
                            } else {
                                i23 = H(obj, bArr, i16, i8, b5, i10, i30, i35, V7, j, i14, cVar);
                                if (i23 != i16) {
                                    w2 = this;
                                    bArr2 = bArr;
                                    i21 = i8;
                                    cVar2 = cVar;
                                    i22 = 0;
                                    i26 = i10;
                                    i24 = i14;
                                    i27 = i15;
                                    i25 = i12;
                                } else {
                                    i11 = i23;
                                    i14 = i14;
                                }
                            }
                        }
                        i27 = i15;
                    }
                    i11 = i16;
                    i27 = i15;
                }
                unsafe2 = unsafe;
            }
            AbstractC0797y abstractC0797y = (AbstractC0797y) obj;
            j0 j0Var = abstractC0797y.unknownFields;
            if (j0Var == j0.f) {
                j0Var = j0.c();
                abstractC0797y.unknownFields = j0Var;
            }
            i23 = f7.a.I(b5, bArr, i11, i8, j0Var, cVar);
            w2 = this;
            bArr2 = bArr;
            i21 = i8;
            cVar2 = cVar;
            i22 = i13;
            i26 = i10;
            i25 = i12;
            i24 = i14;
            unsafe2 = unsafe;
        }
        int i43 = i25;
        int i44 = i27;
        Unsafe unsafe3 = unsafe2;
        if (i44 != 1048575) {
            unsafe3.putInt(obj, i44, i43);
        }
        if (i23 == i8) {
            return;
        }
        throw F.f();
    }

    public final int K(Object obj, byte[] bArr, int i7, int i8, int i9, int i10, int i11, long j, int i12, long j8, B2.c cVar) {
        int L6;
        int i13;
        Unsafe unsafe = f9614p;
        AbstractC0775b abstractC0775b = (AbstractC0775b) ((C) unsafe.getObject(obj, j8));
        boolean f = abstractC0775b.f();
        C c8 = abstractC0775b;
        if (!f) {
            int size = abstractC0775b.size();
            if (size == 0) {
                i13 = 10;
            } else {
                i13 = size * 2;
            }
            C a7 = abstractC0775b.a(i13);
            unsafe.putObject(obj, j8, a7);
            c8 = a7;
        }
        switch (i12) {
            case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (i10 == 2) {
                    return f7.a.u(bArr, i7, c8, cVar);
                }
                if (i10 == 1) {
                    return f7.a.k(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 19:
            case 36:
                if (i10 == 2) {
                    return f7.a.x(bArr, i7, c8, cVar);
                }
                if (i10 == 5) {
                    return f7.a.q(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 21:
            case 37:
            case 38:
                if (i10 == 2) {
                    return f7.a.B(bArr, i7, c8, cVar);
                }
                if (i10 == 0) {
                    return f7.a.N(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i10 == 2) {
                    return f7.a.A(bArr, i7, c8, cVar);
                }
                if (i10 == 0) {
                    return f7.a.L(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 23:
            case RecognitionOptions.EAN_13 /* 32 */:
            case 40:
            case 46:
                if (i10 == 2) {
                    return f7.a.w(bArr, i7, c8, cVar);
                }
                if (i10 == 1) {
                    return f7.a.o(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i10 == 2) {
                    return f7.a.v(bArr, i7, c8, cVar);
                }
                if (i10 == 5) {
                    return f7.a.m(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 25:
            case 42:
                if (i10 == 2) {
                    return f7.a.t(bArr, i7, c8, cVar);
                }
                if (i10 == 0) {
                    return f7.a.g(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 26:
                if (i10 == 2) {
                    if ((j & 536870912) == 0) {
                        return f7.a.F(i9, bArr, i7, i8, c8, cVar);
                    }
                    return f7.a.G(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 27:
                if (i10 == 2) {
                    return f7.a.s(o(i11), i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 28:
                if (i10 == 2) {
                    return f7.a.i(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 30:
            case 44:
                if (i10 == 2) {
                    L6 = f7.a.A(bArr, i7, c8, cVar);
                } else if (i10 == 0) {
                    L6 = f7.a.L(i9, bArr, i7, i8, c8, cVar);
                }
                m(i11);
                Class cls = h0.f9651a;
                return L6;
            case 33:
            case 47:
                if (i10 == 2) {
                    return f7.a.y(bArr, i7, c8, cVar);
                }
                if (i10 == 0) {
                    return f7.a.C(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 34:
            case 48:
                if (i10 == 2) {
                    return f7.a.z(bArr, i7, c8, cVar);
                }
                if (i10 == 0) {
                    return f7.a.D(i9, bArr, i7, i8, c8, cVar);
                }
                break;
            case 49:
                if (i10 == 3) {
                    return f7.a.r(o(i11), i9, bArr, i7, i8, c8, cVar);
                }
                break;
        }
        return i7;
    }

    public final void L(Object obj, long j, K0.l lVar, g0 g0Var, C0787n c0787n) {
        int C7;
        List c8 = this.f9624l.c(obj, j);
        int i7 = lVar.f2494b;
        if ((i7 & 7) == 3) {
            do {
                Object newInstance = g0Var.newInstance();
                lVar.d(newInstance, g0Var, c0787n);
                g0Var.b(newInstance);
                c8.add(newInstance);
                H3.d dVar = (H3.d) lVar.f2497e;
                if (!dVar.g() && lVar.f2496d == 0) {
                    C7 = dVar.C();
                } else {
                    return;
                }
            } while (C7 == i7);
            lVar.f2496d = C7;
            return;
        }
        throw F.c();
    }

    public final void M(Object obj, int i7, K0.l lVar, g0 g0Var, C0787n c0787n) {
        int C7;
        List c8 = this.f9624l.c(obj, i7 & 1048575);
        int i8 = lVar.f2494b;
        if ((i8 & 7) == 2) {
            do {
                Object newInstance = g0Var.newInstance();
                lVar.g(newInstance, g0Var, c0787n);
                g0Var.b(newInstance);
                c8.add(newInstance);
                H3.d dVar = (H3.d) lVar.f2497e;
                if (!dVar.g() && lVar.f2496d == 0) {
                    C7 = dVar.C();
                } else {
                    return;
                }
            } while (C7 == i8);
            lVar.f2496d = C7;
            return;
        }
        throw F.c();
    }

    public final void N(int i7, K0.l lVar, Object obj) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            lVar.V(2);
            s0.v(obj, i7 & 1048575, ((H3.d) lVar.f2497e).B());
        } else if (this.f) {
            lVar.V(2);
            s0.v(obj, i7 & 1048575, ((H3.d) lVar.f2497e).A());
        } else {
            s0.v(obj, i7 & 1048575, lVar.l());
        }
    }

    public final void O(int i7, K0.l lVar, Object obj) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        L l8 = this.f9624l;
        if (z7) {
            lVar.O(l8.c(obj, i7 & 1048575), true);
        } else {
            lVar.O(l8.c(obj, i7 & 1048575), false);
        }
    }

    public final void Q(int i7, Object obj) {
        int i8 = this.f9615a[i7 + 2];
        long j = 1048575 & i8;
        if (j == 1048575) {
            return;
        }
        s0.t(j, obj, (1 << (i8 >>> 20)) | s0.f9691c.g(obj, j));
    }

    public final void R(int i7, Object obj, int i8) {
        s0.t(this.f9615a[i8 + 2] & 1048575, obj, i7);
    }

    public final int S(int i7, int i8) {
        int[] iArr = this.f9615a;
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

    public final void T(int i7, Object obj, Object obj2) {
        f9614p.putObject(obj, W(i7) & 1048575, obj2);
        Q(i7, obj);
    }

    public final void U(Object obj, int i7, int i8, Object obj2) {
        f9614p.putObject(obj, W(i8) & 1048575, obj2);
        R(i7, obj, i8);
    }

    public final int W(int i7) {
        return this.f9615a[i7 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void X(Object obj, O o7) {
        int i7;
        boolean z7;
        int[] iArr = this.f9615a;
        int length = iArr.length;
        Unsafe unsafe = f9614p;
        int i8 = 1048575;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int W7 = W(i10);
            int i12 = iArr[i10];
            int V7 = V(W7);
            if (V7 <= 17) {
                int i13 = iArr[i10 + 2];
                int i14 = i13 & i8;
                if (i14 != i9) {
                    i11 = unsafe.getInt(obj, i14);
                    i9 = i14;
                }
                i7 = 1 << (i13 >>> 20);
            } else {
                i7 = 0;
            }
            int i15 = i7;
            long j = W7 & i8;
            switch (V7) {
                case 0:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.c(i12, s0.f9691c.e(obj, j));
                        break;
                    }
                case 1:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.g(s0.f9691c.f(obj, j), i12);
                        break;
                    }
                case 2:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.j(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 3:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.q(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 4:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.i(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 5:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.f(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 6:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.e(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 7:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.a(i12, s0.f9691c.c(obj, j));
                        break;
                    }
                case 8:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        Y(i12, unsafe.getObject(obj, j), o7);
                        break;
                    }
                case 9:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.k(i12, unsafe.getObject(obj, j), o(i10));
                        break;
                    }
                case 10:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.b(i12, (AbstractC0781h) unsafe.getObject(obj, j));
                        break;
                    }
                case 11:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.p(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.d(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 13:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.l(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case 14:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.m(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 15:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.n(i12, unsafe.getInt(obj, j));
                        break;
                    }
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.o(i12, unsafe.getLong(obj, j));
                        break;
                    }
                case 17:
                    if ((i11 & i15) == 0) {
                        break;
                    } else {
                        o7.h(i12, unsafe.getObject(obj, j), o(i10));
                        break;
                    }
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    h0.F(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 19:
                    h0.J(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    h0.M(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 21:
                    h0.U(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 22:
                    h0.L(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 23:
                    h0.I(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 24:
                    h0.H(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 25:
                    h0.D(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 26:
                    h0.S(iArr[i10], (List) unsafe.getObject(obj, j), o7);
                    break;
                case 27:
                    h0.N(iArr[i10], (List) unsafe.getObject(obj, j), o7, o(i10));
                    break;
                case 28:
                    h0.E(iArr[i10], (List) unsafe.getObject(obj, j), o7);
                    break;
                case 29:
                    z7 = false;
                    h0.T(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 30:
                    z7 = false;
                    h0.G(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 31:
                    z7 = false;
                    h0.O(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case RecognitionOptions.EAN_13 /* 32 */:
                    z7 = false;
                    h0.P(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 33:
                    z7 = false;
                    h0.Q(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 34:
                    z7 = false;
                    h0.R(iArr[i10], (List) unsafe.getObject(obj, j), o7, false);
                    break;
                case 35:
                    h0.F(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 36:
                    h0.J(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 37:
                    h0.M(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 38:
                    h0.U(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 39:
                    h0.L(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 40:
                    h0.I(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 41:
                    h0.H(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 42:
                    h0.D(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 43:
                    h0.T(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 44:
                    h0.G(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 45:
                    h0.O(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 46:
                    h0.P(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 47:
                    h0.Q(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 48:
                    h0.R(iArr[i10], (List) unsafe.getObject(obj, j), o7, true);
                    break;
                case 49:
                    h0.K(iArr[i10], (List) unsafe.getObject(obj, j), o7, o(i10));
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object n7 = n(i10);
                        this.f9626n.getClass();
                        AbstractC0059i.I(n7);
                        throw null;
                    }
                    break;
                case 51:
                    if (t(i12, obj, i10)) {
                        o7.c(i12, ((Double) s0.f9691c.i(obj, j)).doubleValue());
                    }
                    break;
                case 52:
                    if (t(i12, obj, i10)) {
                        o7.g(((Float) s0.f9691c.i(obj, j)).floatValue(), i12);
                    }
                    break;
                case 53:
                    if (t(i12, obj, i10)) {
                        o7.j(i12, F(obj, j));
                    }
                    break;
                case 54:
                    if (t(i12, obj, i10)) {
                        o7.q(i12, F(obj, j));
                    }
                    break;
                case 55:
                    if (t(i12, obj, i10)) {
                        o7.i(i12, E(obj, j));
                    }
                    break;
                case 56:
                    if (t(i12, obj, i10)) {
                        o7.f(i12, F(obj, j));
                    }
                    break;
                case 57:
                    if (t(i12, obj, i10)) {
                        o7.e(i12, E(obj, j));
                    }
                    break;
                case 58:
                    if (t(i12, obj, i10)) {
                        o7.a(i12, ((Boolean) s0.f9691c.i(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (t(i12, obj, i10)) {
                        Y(i12, unsafe.getObject(obj, j), o7);
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (t(i12, obj, i10)) {
                        o7.k(i12, unsafe.getObject(obj, j), o(i10));
                    }
                    break;
                case 61:
                    if (t(i12, obj, i10)) {
                        o7.b(i12, (AbstractC0781h) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (t(i12, obj, i10)) {
                        o7.p(i12, E(obj, j));
                    }
                    break;
                case 63:
                    if (t(i12, obj, i10)) {
                        o7.d(i12, E(obj, j));
                    }
                    break;
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (t(i12, obj, i10)) {
                        o7.l(i12, E(obj, j));
                    }
                    break;
                case 65:
                    if (t(i12, obj, i10)) {
                        o7.m(i12, F(obj, j));
                    }
                    break;
                case 66:
                    if (t(i12, obj, i10)) {
                        o7.n(i12, E(obj, j));
                    }
                    break;
                case 67:
                    if (t(i12, obj, i10)) {
                        o7.o(i12, F(obj, j));
                    }
                    break;
                case 68:
                    if (t(i12, obj, i10)) {
                        o7.h(i12, unsafe.getObject(obj, j), o(i10));
                    }
                    break;
            }
            i10 += 3;
            i8 = 1048575;
        }
        this.f9625m.getClass();
        ((AbstractC0797y) obj).unknownFields.e(o7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void a(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f9615a;
            if (i7 < iArr.length) {
                int W7 = W(i7);
                long j = 1048575 & W7;
                int i8 = iArr[i7];
                switch (V(W7)) {
                    case 0:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.r(obj, j, s0.f9691c.e(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 1:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.s(obj, j, s0.f9691c.f(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 2:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.u(obj, j, s0.f9691c.h(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 3:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.u(obj, j, s0.f9691c.h(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 4:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.t(j, obj, s0.f9691c.g(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 5:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.u(obj, j, s0.f9691c.h(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 6:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.t(j, obj, s0.f9691c.g(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 7:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.n(obj, j, s0.f9691c.c(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 8:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.v(obj, j, s0.f9691c.i(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 9:
                        x(i7, obj, obj2);
                        break;
                    case 10:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.v(obj, j, s0.f9691c.i(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 11:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.t(j, obj, s0.f9691c.g(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.t(j, obj, s0.f9691c.g(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 13:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.t(j, obj, s0.f9691c.g(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 14:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.u(obj, j, s0.f9691c.h(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 15:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.t(j, obj, s0.f9691c.g(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (!r(i7, obj2)) {
                            break;
                        } else {
                            s0.u(obj, j, s0.f9691c.h(obj2, j));
                            Q(i7, obj);
                            break;
                        }
                    case 17:
                        x(i7, obj, obj2);
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
                        this.f9624l.b(obj, j, obj2);
                        break;
                    case 50:
                        Class cls = h0.f9651a;
                        r0 r0Var = s0.f9691c;
                        Object i9 = r0Var.i(obj, j);
                        Object i10 = r0Var.i(obj2, j);
                        this.f9626n.getClass();
                        s0.v(obj, j, Q.d(i9, i10));
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
                            s0.v(obj, j, s0.f9691c.i(obj2, j));
                            R(i8, obj, i7);
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        y(i7, obj, obj2);
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
                            s0.v(obj, j, s0.f9691c.i(obj2, j));
                            R(i8, obj, i7);
                            break;
                        }
                    case 68:
                        y(i7, obj, obj2);
                        break;
                }
                i7 += 3;
            } else {
                h0.B(this.f9625m, obj, obj2);
                return;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void b(Object obj) {
        if (!s(obj)) {
            return;
        }
        if (obj instanceof AbstractC0797y) {
            AbstractC0797y abstractC0797y = (AbstractC0797y) obj;
            abstractC0797y.i();
            abstractC0797y.h();
            abstractC0797y.q();
        }
        int length = this.f9615a.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int W7 = W(i7);
            long j = 1048575 & W7;
            int V7 = V(W7);
            if (V7 != 9) {
                switch (V7) {
                    case 17:
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
                        this.f9624l.a(obj, j);
                        continue;
                    case 50:
                        Unsafe unsafe = f9614p;
                        Object object = unsafe.getObject(obj, j);
                        if (object != null) {
                            this.f9626n.getClass();
                            Q.f(object);
                            unsafe.putObject(obj, j, object);
                        } else {
                            continue;
                        }
                    default:
                }
            }
            if (r(i7, obj)) {
                o(i7).b(f9614p.getObject(obj, j));
            }
        }
        this.f9625m.getClass();
        k0.b(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final boolean c(Object obj) {
        boolean z7;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            boolean z8 = true;
            if (i8 >= this.f9622i) {
                return true;
            }
            int i10 = this.f9621h[i8];
            int[] iArr = this.f9615a;
            int i11 = iArr[i10];
            int W7 = W(i10);
            int i12 = iArr[i10 + 2];
            int i13 = i12 & 1048575;
            int i14 = 1 << (i12 >>> 20);
            if (i13 != i7) {
                if (i13 != 1048575) {
                    i9 = f9614p.getInt(obj, i13);
                }
                i7 = i13;
            }
            if ((268435456 & W7) != 0) {
                if (i7 == 1048575) {
                    z7 = r(i10, obj);
                } else if ((i9 & i14) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (!z7) {
                    return false;
                }
            }
            int V7 = V(W7);
            if (V7 != 9 && V7 != 17) {
                if (V7 != 27) {
                    if (V7 != 60 && V7 != 68) {
                        if (V7 != 49) {
                            if (V7 != 50) {
                                continue;
                            } else {
                                Object i15 = s0.f9691c.i(obj, W7 & 1048575);
                                this.f9626n.getClass();
                                if (!((P) i15).isEmpty()) {
                                    AbstractC0059i.I(n(i10));
                                    throw null;
                                }
                            }
                        }
                    } else if (t(i11, obj, i10)) {
                        if (!o(i10).c(s0.f9691c.i(obj, W7 & 1048575))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) s0.f9691c.i(obj, W7 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    g0 o7 = o(i10);
                    for (int i16 = 0; i16 < list.size(); i16++) {
                        if (!o7.c(list.get(i16))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else {
                if (i7 == 1048575) {
                    z8 = r(i10, obj);
                } else if ((i14 & i9) == 0) {
                    z8 = false;
                }
                if (z8) {
                    if (!o(i10).c(s0.f9691c.i(obj, W7 & 1048575))) {
                        return false;
                    }
                } else {
                    continue;
                }
            }
            i8++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final int d(AbstractC0797y abstractC0797y) {
        if (this.f9620g) {
            return q(abstractC0797y);
        }
        return p(abstractC0797y);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void e(Object obj, K0.l lVar, C0787n c0787n) {
        c0787n.getClass();
        k(obj);
        v(this.f9625m, obj, lVar, c0787n);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void f(Object obj, byte[] bArr, int i7, int i8, B2.c cVar) {
        if (this.f9620g) {
            J(obj, bArr, i7, i8, cVar);
        } else {
            I(obj, bArr, i7, i8, 0, cVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.e(r12, r7)) == java.lang.Double.doubleToLongBits(r5.e(r13, r7))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (com.google.crypto.tink.shaded.protobuf.h0.C(r9.i(r12, r7), r9.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (com.google.crypto.tink.shaded.protobuf.h0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (com.google.crypto.tink.shaded.protobuf.h0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (com.google.crypto.tink.shaded.protobuf.h0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (com.google.crypto.tink.shaded.protobuf.h0.C(r5.i(r12, r7), r5.i(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.h(r12, r7) == r5.h(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.f(r12, r7)) == java.lang.Float.floatToIntBits(r5.f(r13, r7))) goto L85;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(com.google.crypto.tink.shaded.protobuf.AbstractC0797y r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.W.g(com.google.crypto.tink.shaded.protobuf.y, java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final void h(Object obj, O o7) {
        o7.getClass();
        w0 w0Var = w0.ASCENDING;
        w0 w0Var2 = w0.DESCENDING;
        int[] iArr = this.f9615a;
        Q q2 = this.f9626n;
        k0 k0Var = this.f9625m;
        if (w0Var == w0Var2) {
            k0Var.getClass();
            ((AbstractC0797y) obj).unknownFields.e(o7);
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int W7 = W(length);
                int i7 = iArr[length];
                switch (V(W7)) {
                    case 0:
                        if (r(length, obj)) {
                            o7.c(i7, s0.f9691c.e(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(length, obj)) {
                            o7.g(s0.f9691c.f(obj, W7 & 1048575), i7);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(length, obj)) {
                            o7.j(i7, s0.f9691c.h(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(length, obj)) {
                            o7.q(i7, s0.f9691c.h(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(length, obj)) {
                            o7.i(i7, s0.f9691c.g(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(length, obj)) {
                            o7.f(i7, s0.f9691c.h(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(length, obj)) {
                            o7.e(i7, s0.f9691c.g(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(length, obj)) {
                            o7.a(i7, s0.f9691c.c(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(length, obj)) {
                            Y(i7, s0.f9691c.i(obj, W7 & 1048575), o7);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (r(length, obj)) {
                            o7.k(i7, s0.f9691c.i(obj, W7 & 1048575), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(length, obj)) {
                            o7.b(i7, (AbstractC0781h) s0.f9691c.i(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(length, obj)) {
                            o7.p(i7, s0.f9691c.g(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (r(length, obj)) {
                            o7.d(i7, s0.f9691c.g(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(length, obj)) {
                            o7.l(i7, s0.f9691c.g(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(length, obj)) {
                            o7.m(i7, s0.f9691c.h(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(length, obj)) {
                            o7.n(i7, s0.f9691c.g(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (r(length, obj)) {
                            o7.o(i7, s0.f9691c.h(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(length, obj)) {
                            o7.h(i7, s0.f9691c.i(obj, W7 & 1048575), o(length));
                            break;
                        } else {
                            break;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        h0.F(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 19:
                        h0.J(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        h0.M(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 21:
                        h0.U(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 22:
                        h0.L(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 23:
                        h0.I(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 24:
                        h0.H(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 25:
                        h0.D(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 26:
                        h0.S(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7);
                        break;
                    case 27:
                        h0.N(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, o(length));
                        break;
                    case 28:
                        h0.E(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7);
                        break;
                    case 29:
                        h0.T(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 30:
                        h0.G(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 31:
                        h0.O(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        h0.P(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 33:
                        h0.Q(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 34:
                        h0.R(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, false);
                        break;
                    case 35:
                        h0.F(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 36:
                        h0.J(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 37:
                        h0.M(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 38:
                        h0.U(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 39:
                        h0.L(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 40:
                        h0.I(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 41:
                        h0.H(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 42:
                        h0.D(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 43:
                        h0.T(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 44:
                        h0.G(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 45:
                        h0.O(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 46:
                        h0.P(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 47:
                        h0.Q(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 48:
                        h0.R(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, true);
                        break;
                    case 49:
                        h0.K(iArr[length], (List) s0.f9691c.i(obj, W7 & 1048575), o7, o(length));
                        break;
                    case 50:
                        if (s0.f9691c.i(obj, W7 & 1048575) != null) {
                            Object n7 = n(length);
                            q2.getClass();
                            AbstractC0059i.I(n7);
                            throw null;
                        }
                        break;
                    case 51:
                        if (t(i7, obj, length)) {
                            o7.c(i7, ((Double) s0.f9691c.i(obj, W7 & 1048575)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(i7, obj, length)) {
                            o7.g(((Float) s0.f9691c.i(obj, W7 & 1048575)).floatValue(), i7);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(i7, obj, length)) {
                            o7.j(i7, F(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(i7, obj, length)) {
                            o7.q(i7, F(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(i7, obj, length)) {
                            o7.i(i7, E(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(i7, obj, length)) {
                            o7.f(i7, F(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(i7, obj, length)) {
                            o7.e(i7, E(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(i7, obj, length)) {
                            o7.a(i7, ((Boolean) s0.f9691c.i(obj, W7 & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(i7, obj, length)) {
                            Y(i7, s0.f9691c.i(obj, W7 & 1048575), o7);
                            break;
                        } else {
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (t(i7, obj, length)) {
                            o7.k(i7, s0.f9691c.i(obj, W7 & 1048575), o(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(i7, obj, length)) {
                            o7.b(i7, (AbstractC0781h) s0.f9691c.i(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(i7, obj, length)) {
                            o7.p(i7, E(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(i7, obj, length)) {
                            o7.d(i7, E(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (t(i7, obj, length)) {
                            o7.l(i7, E(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(i7, obj, length)) {
                            o7.m(i7, F(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(i7, obj, length)) {
                            o7.n(i7, E(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(i7, obj, length)) {
                            o7.o(i7, F(obj, W7 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(i7, obj, length)) {
                            o7.h(i7, s0.f9691c.i(obj, W7 & 1048575), o(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
        } else if (this.f9620g) {
            int length2 = iArr.length;
            for (int i8 = 0; i8 < length2; i8 += 3) {
                int W8 = W(i8);
                int i9 = iArr[i8];
                switch (V(W8)) {
                    case 0:
                        if (r(i8, obj)) {
                            o7.c(i9, s0.f9691c.e(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (r(i8, obj)) {
                            o7.g(s0.f9691c.f(obj, W8 & 1048575), i9);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (r(i8, obj)) {
                            o7.j(i9, s0.f9691c.h(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (r(i8, obj)) {
                            o7.q(i9, s0.f9691c.h(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (r(i8, obj)) {
                            o7.i(i9, s0.f9691c.g(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (r(i8, obj)) {
                            o7.f(i9, s0.f9691c.h(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (r(i8, obj)) {
                            o7.e(i9, s0.f9691c.g(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (r(i8, obj)) {
                            o7.a(i9, s0.f9691c.c(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (r(i8, obj)) {
                            Y(i9, s0.f9691c.i(obj, W8 & 1048575), o7);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (r(i8, obj)) {
                            o7.k(i9, s0.f9691c.i(obj, W8 & 1048575), o(i8));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (r(i8, obj)) {
                            o7.b(i9, (AbstractC0781h) s0.f9691c.i(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (r(i8, obj)) {
                            o7.p(i9, s0.f9691c.g(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (r(i8, obj)) {
                            o7.d(i9, s0.f9691c.g(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (r(i8, obj)) {
                            o7.l(i9, s0.f9691c.g(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (r(i8, obj)) {
                            o7.m(i9, s0.f9691c.h(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (r(i8, obj)) {
                            o7.n(i9, s0.f9691c.g(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (r(i8, obj)) {
                            o7.o(i9, s0.f9691c.h(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (r(i8, obj)) {
                            o7.h(i9, s0.f9691c.i(obj, W8 & 1048575), o(i8));
                            break;
                        } else {
                            break;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        h0.F(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 19:
                        h0.J(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        h0.M(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 21:
                        h0.U(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 22:
                        h0.L(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 23:
                        h0.I(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 24:
                        h0.H(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 25:
                        h0.D(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 26:
                        h0.S(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7);
                        break;
                    case 27:
                        h0.N(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, o(i8));
                        break;
                    case 28:
                        h0.E(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7);
                        break;
                    case 29:
                        h0.T(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 30:
                        h0.G(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 31:
                        h0.O(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        h0.P(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 33:
                        h0.Q(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 34:
                        h0.R(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, false);
                        break;
                    case 35:
                        h0.F(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 36:
                        h0.J(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 37:
                        h0.M(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 38:
                        h0.U(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 39:
                        h0.L(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 40:
                        h0.I(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 41:
                        h0.H(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 42:
                        h0.D(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 43:
                        h0.T(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 44:
                        h0.G(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 45:
                        h0.O(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 46:
                        h0.P(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 47:
                        h0.Q(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 48:
                        h0.R(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, true);
                        break;
                    case 49:
                        h0.K(iArr[i8], (List) s0.f9691c.i(obj, W8 & 1048575), o7, o(i8));
                        break;
                    case 50:
                        if (s0.f9691c.i(obj, W8 & 1048575) != null) {
                            Object n8 = n(i8);
                            q2.getClass();
                            AbstractC0059i.I(n8);
                            throw null;
                        }
                        break;
                    case 51:
                        if (t(i9, obj, i8)) {
                            o7.c(i9, ((Double) s0.f9691c.i(obj, W8 & 1048575)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (t(i9, obj, i8)) {
                            o7.g(((Float) s0.f9691c.i(obj, W8 & 1048575)).floatValue(), i9);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (t(i9, obj, i8)) {
                            o7.j(i9, F(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (t(i9, obj, i8)) {
                            o7.q(i9, F(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (t(i9, obj, i8)) {
                            o7.i(i9, E(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (t(i9, obj, i8)) {
                            o7.f(i9, F(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (t(i9, obj, i8)) {
                            o7.e(i9, E(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (t(i9, obj, i8)) {
                            o7.a(i9, ((Boolean) s0.f9691c.i(obj, W8 & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (t(i9, obj, i8)) {
                            Y(i9, s0.f9691c.i(obj, W8 & 1048575), o7);
                            break;
                        } else {
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (t(i9, obj, i8)) {
                            o7.k(i9, s0.f9691c.i(obj, W8 & 1048575), o(i8));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (t(i9, obj, i8)) {
                            o7.b(i9, (AbstractC0781h) s0.f9691c.i(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (t(i9, obj, i8)) {
                            o7.p(i9, E(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (t(i9, obj, i8)) {
                            o7.d(i9, E(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (t(i9, obj, i8)) {
                            o7.l(i9, E(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (t(i9, obj, i8)) {
                            o7.m(i9, F(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (t(i9, obj, i8)) {
                            o7.n(i9, E(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (t(i9, obj, i8)) {
                            o7.o(i9, F(obj, W8 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (t(i9, obj, i8)) {
                            o7.h(i9, s0.f9691c.i(obj, W8 & 1048575), o(i8));
                            break;
                        } else {
                            break;
                        }
                }
            }
            k0Var.getClass();
            ((AbstractC0797y) obj).unknownFields.e(o7);
        } else {
            X(obj, o7);
        }
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
    @Override // com.google.crypto.tink.shaded.protobuf.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(com.google.crypto.tink.shaded.protobuf.AbstractC0797y r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.W.i(com.google.crypto.tink.shaded.protobuf.y):int");
    }

    public final boolean j(AbstractC0797y abstractC0797y, Object obj, int i7) {
        if (r(i7, abstractC0797y) == r(i7, obj)) {
            return true;
        }
        return false;
    }

    public final void l(int i7, Object obj, Object obj2) {
        int i8 = this.f9615a[i7];
        if (s0.f9691c.i(obj, W(i7) & 1048575) == null) {
            return;
        }
        m(i7);
    }

    public final void m(int i7) {
        if (this.f9616b[((i7 / 3) * 2) + 1] == null) {
            return;
        }
        throw new ClassCastException();
    }

    public final Object n(int i7) {
        return this.f9616b[(i7 / 3) * 2];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public final Object newInstance() {
        this.f9623k.getClass();
        return ((AbstractC0797y) this.f9619e).s();
    }

    public final g0 o(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f9616b;
        g0 g0Var = (g0) objArr[i8];
        if (g0Var != null) {
            return g0Var;
        }
        g0 a7 = d0.f9635c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a7;
        return a7;
    }

    public final int p(AbstractC0797y abstractC0797y) {
        int i7;
        int D4;
        int Q7;
        Unsafe unsafe = f9614p;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 1048575;
        while (true) {
            int[] iArr = this.f9615a;
            if (i8 < iArr.length) {
                int W7 = W(i8);
                int i12 = iArr[i8];
                int V7 = V(W7);
                if (V7 <= 17) {
                    int i13 = iArr[i8 + 2];
                    int i14 = i13 & 1048575;
                    i7 = 1 << (i13 >>> 20);
                    if (i14 != i11) {
                        i10 = unsafe.getInt(abstractC0797y, i14);
                        i11 = i14;
                    }
                } else {
                    i7 = 0;
                }
                long j = W7 & 1048575;
                switch (V7) {
                    case 0:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.D(i12);
                            i9 += D4;
                            break;
                        }
                    case 1:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.H(i12);
                            i9 += D4;
                            break;
                        }
                    case 2:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.L(i12, unsafe.getLong(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 3:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.V(i12, unsafe.getLong(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 4:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.J(i12, unsafe.getInt(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 5:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.G(i12);
                            i9 += D4;
                            break;
                        }
                    case 6:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.F(i12);
                            i9 += D4;
                            break;
                        }
                    case 7:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.A(i12);
                            i9 += D4;
                            break;
                        }
                    case 8:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(abstractC0797y, j);
                            if (object instanceof AbstractC0781h) {
                                Q7 = C0784k.B(i12, (AbstractC0781h) object);
                            } else {
                                Q7 = C0784k.Q(i12, (String) object);
                            }
                            i9 = Q7 + i9;
                            break;
                        }
                    case 9:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = h0.o(i12, unsafe.getObject(abstractC0797y, j), o(i8));
                            i9 += D4;
                            break;
                        }
                    case 10:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.B(i12, (AbstractC0781h) unsafe.getObject(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 11:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.T(i12, unsafe.getInt(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.E(i12, unsafe.getInt(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 13:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.M(i12);
                            i9 += D4;
                            break;
                        }
                    case 14:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.N(i12);
                            i9 += D4;
                            break;
                        }
                    case 15:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.O(i12, unsafe.getInt(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.P(i12, unsafe.getLong(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 17:
                        if ((i7 & i10) == 0) {
                            break;
                        } else {
                            D4 = C0784k.I(i12, (AbstractC0774a) unsafe.getObject(abstractC0797y, j), o(i8));
                            i9 += D4;
                            break;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        D4 = h0.h(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 19:
                        D4 = h0.f(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        D4 = h0.m(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 21:
                        D4 = h0.x(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 22:
                        D4 = h0.k(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 23:
                        D4 = h0.h(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 24:
                        D4 = h0.f(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 25:
                        D4 = h0.a(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 26:
                        D4 = h0.u(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 27:
                        D4 = h0.p(i12, (List) unsafe.getObject(abstractC0797y, j), o(i8));
                        i9 += D4;
                        break;
                    case 28:
                        D4 = h0.c(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 29:
                        D4 = h0.v(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 30:
                        D4 = h0.d(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 31:
                        D4 = h0.f(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        D4 = h0.h(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 33:
                        D4 = h0.q(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 34:
                        D4 = h0.s(i12, (List) unsafe.getObject(abstractC0797y, j));
                        i9 += D4;
                        break;
                    case 35:
                        int i15 = h0.i((List) unsafe.getObject(abstractC0797y, j));
                        if (i15 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(i15, C0784k.S(i12), i15, i9);
                            break;
                        }
                    case 36:
                        int g3 = h0.g((List) unsafe.getObject(abstractC0797y, j));
                        if (g3 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(g3, C0784k.S(i12), g3, i9);
                            break;
                        }
                    case 37:
                        int n7 = h0.n((List) unsafe.getObject(abstractC0797y, j));
                        if (n7 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(n7, C0784k.S(i12), n7, i9);
                            break;
                        }
                    case 38:
                        int y2 = h0.y((List) unsafe.getObject(abstractC0797y, j));
                        if (y2 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(y2, C0784k.S(i12), y2, i9);
                            break;
                        }
                    case 39:
                        int l8 = h0.l((List) unsafe.getObject(abstractC0797y, j));
                        if (l8 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(l8, C0784k.S(i12), l8, i9);
                            break;
                        }
                    case 40:
                        int i16 = h0.i((List) unsafe.getObject(abstractC0797y, j));
                        if (i16 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(i16, C0784k.S(i12), i16, i9);
                            break;
                        }
                    case 41:
                        int g4 = h0.g((List) unsafe.getObject(abstractC0797y, j));
                        if (g4 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(g4, C0784k.S(i12), g4, i9);
                            break;
                        }
                    case 42:
                        int b5 = h0.b((List) unsafe.getObject(abstractC0797y, j));
                        if (b5 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(b5, C0784k.S(i12), b5, i9);
                            break;
                        }
                    case 43:
                        int w2 = h0.w((List) unsafe.getObject(abstractC0797y, j));
                        if (w2 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(w2, C0784k.S(i12), w2, i9);
                            break;
                        }
                    case 44:
                        int e7 = h0.e((List) unsafe.getObject(abstractC0797y, j));
                        if (e7 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(e7, C0784k.S(i12), e7, i9);
                            break;
                        }
                    case 45:
                        int g8 = h0.g((List) unsafe.getObject(abstractC0797y, j));
                        if (g8 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(g8, C0784k.S(i12), g8, i9);
                            break;
                        }
                    case 46:
                        int i17 = h0.i((List) unsafe.getObject(abstractC0797y, j));
                        if (i17 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(i17, C0784k.S(i12), i17, i9);
                            break;
                        }
                    case 47:
                        int r7 = h0.r((List) unsafe.getObject(abstractC0797y, j));
                        if (r7 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(r7, C0784k.S(i12), r7, i9);
                            break;
                        }
                    case 48:
                        int t7 = h0.t((List) unsafe.getObject(abstractC0797y, j));
                        if (t7 <= 0) {
                            break;
                        } else {
                            i9 = androidx.datastore.preferences.protobuf.Y.r(t7, C0784k.S(i12), t7, i9);
                            break;
                        }
                    case 49:
                        D4 = h0.j(i12, (List) unsafe.getObject(abstractC0797y, j), o(i8));
                        i9 += D4;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(abstractC0797y, j);
                        Object n8 = n(i8);
                        this.f9626n.getClass();
                        Q.b(object2, n8);
                        break;
                    case 51:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.D(i12);
                            i9 += D4;
                            break;
                        }
                    case 52:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.H(i12);
                            i9 += D4;
                            break;
                        }
                    case 53:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.L(i12, F(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 54:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.V(i12, F(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 55:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.J(i12, E(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 56:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.G(i12);
                            i9 += D4;
                            break;
                        }
                    case 57:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.F(i12);
                            i9 += D4;
                            break;
                        }
                    case 58:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.A(i12);
                            i9 += D4;
                            break;
                        }
                    case 59:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(abstractC0797y, j);
                            if (object3 instanceof AbstractC0781h) {
                                Q7 = C0784k.B(i12, (AbstractC0781h) object3);
                            } else {
                                Q7 = C0784k.Q(i12, (String) object3);
                            }
                            i9 = Q7 + i9;
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = h0.o(i12, unsafe.getObject(abstractC0797y, j), o(i8));
                            i9 += D4;
                            break;
                        }
                    case 61:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.B(i12, (AbstractC0781h) unsafe.getObject(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 62:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.T(i12, E(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 63:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.E(i12, E(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.M(i12);
                            i9 += D4;
                            break;
                        }
                    case 65:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.N(i12);
                            i9 += D4;
                            break;
                        }
                    case 66:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.O(i12, E(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 67:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.P(i12, F(abstractC0797y, j));
                            i9 += D4;
                            break;
                        }
                    case 68:
                        if (!t(i12, abstractC0797y, i8)) {
                            break;
                        } else {
                            D4 = C0784k.I(i12, (AbstractC0774a) unsafe.getObject(abstractC0797y, j), o(i8));
                            i9 += D4;
                            break;
                        }
                }
                i8 += 3;
            } else {
                this.f9625m.getClass();
                return abstractC0797y.unknownFields.b() + i9;
            }
        }
    }

    public final int q(AbstractC0797y abstractC0797y) {
        int D4;
        Unsafe unsafe = f9614p;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f9615a;
            if (i7 < iArr.length) {
                int W7 = W(i7);
                int V7 = V(W7);
                int i9 = iArr[i7];
                long j = W7 & 1048575;
                if (V7 >= EnumC0791s.DOUBLE_LIST_PACKED.a() && V7 <= EnumC0791s.SINT64_LIST_PACKED.a()) {
                    int i10 = iArr[i7 + 2];
                }
                switch (V7) {
                    case 0:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.D(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 1:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.H(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 2:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.L(i9, s0.k(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 3:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.V(i9, s0.k(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 4:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.J(i9, s0.j(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 5:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.G(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 6:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.F(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 7:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.A(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 8:
                        if (r(i7, abstractC0797y)) {
                            Object l8 = s0.l(abstractC0797y, j);
                            if (l8 instanceof AbstractC0781h) {
                                D4 = C0784k.B(i9, (AbstractC0781h) l8);
                                break;
                            } else {
                                D4 = C0784k.Q(i9, (String) l8);
                                break;
                            }
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 9:
                        if (r(i7, abstractC0797y)) {
                            D4 = h0.o(i9, s0.l(abstractC0797y, j), o(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 10:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.B(i9, (AbstractC0781h) s0.l(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 11:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.T(i9, s0.j(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.E(i9, s0.j(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 13:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.M(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 14:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.N(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 15:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.O(i9, s0.j(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.P(i9, s0.k(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 17:
                        if (r(i7, abstractC0797y)) {
                            D4 = C0784k.I(i9, (AbstractC0774a) s0.l(abstractC0797y, j), o(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        D4 = h0.h(i9, u(abstractC0797y, j));
                        break;
                    case 19:
                        D4 = h0.f(i9, u(abstractC0797y, j));
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        D4 = h0.m(i9, u(abstractC0797y, j));
                        break;
                    case 21:
                        D4 = h0.x(i9, u(abstractC0797y, j));
                        break;
                    case 22:
                        D4 = h0.k(i9, u(abstractC0797y, j));
                        break;
                    case 23:
                        D4 = h0.h(i9, u(abstractC0797y, j));
                        break;
                    case 24:
                        D4 = h0.f(i9, u(abstractC0797y, j));
                        break;
                    case 25:
                        D4 = h0.a(i9, u(abstractC0797y, j));
                        break;
                    case 26:
                        D4 = h0.u(i9, u(abstractC0797y, j));
                        break;
                    case 27:
                        D4 = h0.p(i9, u(abstractC0797y, j), o(i7));
                        break;
                    case 28:
                        D4 = h0.c(i9, u(abstractC0797y, j));
                        break;
                    case 29:
                        D4 = h0.v(i9, u(abstractC0797y, j));
                        break;
                    case 30:
                        D4 = h0.d(i9, u(abstractC0797y, j));
                        break;
                    case 31:
                        D4 = h0.f(i9, u(abstractC0797y, j));
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        D4 = h0.h(i9, u(abstractC0797y, j));
                        break;
                    case 33:
                        D4 = h0.q(i9, u(abstractC0797y, j));
                        break;
                    case 34:
                        D4 = h0.s(i9, u(abstractC0797y, j));
                        break;
                    case 35:
                        int i11 = h0.i((List) unsafe.getObject(abstractC0797y, j));
                        if (i11 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(i11, C0784k.S(i9), i11, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 36:
                        int g3 = h0.g((List) unsafe.getObject(abstractC0797y, j));
                        if (g3 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(g3, C0784k.S(i9), g3, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 37:
                        int n7 = h0.n((List) unsafe.getObject(abstractC0797y, j));
                        if (n7 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(n7, C0784k.S(i9), n7, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 38:
                        int y2 = h0.y((List) unsafe.getObject(abstractC0797y, j));
                        if (y2 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(y2, C0784k.S(i9), y2, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 39:
                        int l9 = h0.l((List) unsafe.getObject(abstractC0797y, j));
                        if (l9 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(l9, C0784k.S(i9), l9, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 40:
                        int i12 = h0.i((List) unsafe.getObject(abstractC0797y, j));
                        if (i12 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(i12, C0784k.S(i9), i12, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 41:
                        int g4 = h0.g((List) unsafe.getObject(abstractC0797y, j));
                        if (g4 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(g4, C0784k.S(i9), g4, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 42:
                        int b5 = h0.b((List) unsafe.getObject(abstractC0797y, j));
                        if (b5 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(b5, C0784k.S(i9), b5, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 43:
                        int w2 = h0.w((List) unsafe.getObject(abstractC0797y, j));
                        if (w2 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(w2, C0784k.S(i9), w2, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 44:
                        int e7 = h0.e((List) unsafe.getObject(abstractC0797y, j));
                        if (e7 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(e7, C0784k.S(i9), e7, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 45:
                        int g8 = h0.g((List) unsafe.getObject(abstractC0797y, j));
                        if (g8 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(g8, C0784k.S(i9), g8, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 46:
                        int i13 = h0.i((List) unsafe.getObject(abstractC0797y, j));
                        if (i13 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(i13, C0784k.S(i9), i13, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 47:
                        int r7 = h0.r((List) unsafe.getObject(abstractC0797y, j));
                        if (r7 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(r7, C0784k.S(i9), r7, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 48:
                        int t7 = h0.t((List) unsafe.getObject(abstractC0797y, j));
                        if (t7 > 0) {
                            i8 = androidx.datastore.preferences.protobuf.Y.r(t7, C0784k.S(i9), t7, i8);
                        } else {
                            continue;
                        }
                        i7 += 3;
                    case 49:
                        D4 = h0.j(i9, u(abstractC0797y, j), o(i7));
                        break;
                    case 50:
                        Object l10 = s0.l(abstractC0797y, j);
                        Object n8 = n(i7);
                        this.f9626n.getClass();
                        Q.b(l10, n8);
                        continue;
                        i7 += 3;
                    case 51:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.D(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 52:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.H(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 53:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.L(i9, F(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 54:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.V(i9, F(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 55:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.J(i9, E(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 56:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.G(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 57:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.F(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 58:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.A(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 59:
                        if (t(i9, abstractC0797y, i7)) {
                            Object l11 = s0.l(abstractC0797y, j);
                            if (l11 instanceof AbstractC0781h) {
                                D4 = C0784k.B(i9, (AbstractC0781h) l11);
                                break;
                            } else {
                                D4 = C0784k.Q(i9, (String) l11);
                                break;
                            }
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = h0.o(i9, s0.l(abstractC0797y, j), o(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 61:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.B(i9, (AbstractC0781h) s0.l(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 62:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.T(i9, E(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 63:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.E(i9, E(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.M(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 65:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.N(i9);
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 66:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.O(i9, E(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 67:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.P(i9, F(abstractC0797y, j));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    case 68:
                        if (t(i9, abstractC0797y, i7)) {
                            D4 = C0784k.I(i9, (AbstractC0774a) s0.l(abstractC0797y, j), o(i7));
                            break;
                        } else {
                            continue;
                            i7 += 3;
                        }
                    default:
                        i7 += 3;
                }
                i8 = D4 + i8;
                i7 += 3;
            } else {
                this.f9625m.getClass();
                return abstractC0797y.unknownFields.b() + i8;
            }
        }
    }

    public final boolean r(int i7, Object obj) {
        int i8 = this.f9615a[i7 + 2];
        long j = i8 & 1048575;
        if (j == 1048575) {
            int W7 = W(i7);
            long j8 = W7 & 1048575;
            switch (V(W7)) {
                case 0:
                    if (Double.doubleToRawLongBits(s0.f9691c.e(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(s0.f9691c.f(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (s0.f9691c.h(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (s0.f9691c.h(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (s0.f9691c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (s0.f9691c.h(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (s0.f9691c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return s0.f9691c.c(obj, j8);
                case 8:
                    Object i9 = s0.f9691c.i(obj, j8);
                    if (i9 instanceof String) {
                        return !((String) i9).isEmpty();
                    }
                    if (i9 instanceof AbstractC0781h) {
                        return !AbstractC0781h.f9648b.equals(i9);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (s0.f9691c.i(obj, j8) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !AbstractC0781h.f9648b.equals(s0.f9691c.i(obj, j8));
                case 11:
                    if (s0.f9691c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (s0.f9691c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (s0.f9691c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (s0.f9691c.h(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (s0.f9691c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (s0.f9691c.h(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (s0.f9691c.i(obj, j8) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & s0.f9691c.g(obj, j)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean t(int i7, Object obj, int i8) {
        if (s0.f9691c.g(obj, this.f9615a[i8 + 2] & 1048575) == i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x05dd A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:3:0x0011, B:5:0x001a, B:7:0x001e, B:20:0x0043, B:22:0x0048, B:23:0x004c, B:31:0x0065, B:32:0x0069, B:36:0x0079, B:38:0x0085, B:45:0x00a0, B:47:0x00b7, B:48:0x00ce, B:49:0x00e5, B:50:0x00fc, B:51:0x0113, B:52:0x012d, B:53:0x0145, B:54:0x0155, B:55:0x016b, B:56:0x0173, B:57:0x018b, B:58:0x01a3, B:59:0x01bb, B:60:0x01d3, B:61:0x01eb, B:62:0x0203, B:63:0x021b, B:64:0x0233, B:66:0x023c, B:130:0x05d8, B:132:0x05dd, B:133:0x05e2, B:111:0x0458, B:112:0x046d, B:113:0x0483, B:114:0x0499, B:115:0x04af, B:116:0x04c5, B:117:0x04de, B:118:0x04f4, B:119:0x0506, B:120:0x051e, B:121:0x0528, B:122:0x053e, B:123:0x0554, B:124:0x056a, B:125:0x0580, B:126:0x0596, B:127:0x05ac, B:128:0x05c2), top: B:146:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x05e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(com.google.crypto.tink.shaded.protobuf.k0 r18, java.lang.Object r19, K0.l r20, com.google.crypto.tink.shaded.protobuf.C0787n r21) {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.W.v(com.google.crypto.tink.shaded.protobuf.k0, java.lang.Object, K0.l, com.google.crypto.tink.shaded.protobuf.n):void");
    }

    public final void w(int i7, Object obj, Object obj2) {
        long W7 = W(i7) & 1048575;
        Object i8 = s0.f9691c.i(obj, W7);
        Q q2 = this.f9626n;
        if (i8 != null) {
            q2.getClass();
            if (Q.c(i8)) {
                P c8 = P.f9608b.c();
                Q.d(c8, i8);
                s0.v(obj, W7, c8);
                i8 = c8;
            }
        } else {
            q2.getClass();
            i8 = P.f9608b.c();
            s0.v(obj, W7, i8);
        }
        q2.getClass();
        P p7 = (P) i8;
        AbstractC0059i.I(obj2);
        throw null;
    }

    public final void x(int i7, Object obj, Object obj2) {
        if (!r(i7, obj2)) {
            return;
        }
        long W7 = W(i7) & 1048575;
        Unsafe unsafe = f9614p;
        Object object = unsafe.getObject(obj2, W7);
        if (object != null) {
            g0 o7 = o(i7);
            if (!r(i7, obj)) {
                if (!s(object)) {
                    unsafe.putObject(obj, W7, object);
                } else {
                    Object newInstance = o7.newInstance();
                    o7.a(newInstance, object);
                    unsafe.putObject(obj, W7, newInstance);
                }
                Q(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, W7);
            if (!s(object2)) {
                Object newInstance2 = o7.newInstance();
                o7.a(newInstance2, object2);
                unsafe.putObject(obj, W7, newInstance2);
                object2 = newInstance2;
            }
            o7.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f9615a[i7] + " is present but null: " + obj2);
    }

    public final void y(int i7, Object obj, Object obj2) {
        int[] iArr;
        int i8 = this.f9615a[i7];
        if (!t(i8, obj2, i7)) {
            return;
        }
        long W7 = W(i7) & 1048575;
        Unsafe unsafe = f9614p;
        Object object = unsafe.getObject(obj2, W7);
        if (object != null) {
            g0 o7 = o(i7);
            if (!t(i8, obj, i7)) {
                if (!s(object)) {
                    unsafe.putObject(obj, W7, object);
                } else {
                    Object newInstance = o7.newInstance();
                    o7.a(newInstance, object);
                    unsafe.putObject(obj, W7, newInstance);
                }
                R(i8, obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, W7);
            if (!s(object2)) {
                Object newInstance2 = o7.newInstance();
                o7.a(newInstance2, object2);
                unsafe.putObject(obj, W7, newInstance2);
                object2 = newInstance2;
            }
            o7.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
    }

    public final Object z(int i7, Object obj) {
        g0 o7 = o(i7);
        long W7 = W(i7) & 1048575;
        if (!r(i7, obj)) {
            return o7.newInstance();
        }
        Object object = f9614p.getObject(obj, W7);
        if (s(object)) {
            return object;
        }
        Object newInstance = o7.newInstance();
        if (object != null) {
            o7.a(newInstance, object);
        }
        return newInstance;
    }
}
