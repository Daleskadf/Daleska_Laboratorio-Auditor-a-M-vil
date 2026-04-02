package androidx.datastore.preferences.protobuf;

import H4.e1;
import H4.p1;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.utils.XMLReaderUtils;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class Q implements b0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f7765n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f7766o = n0.i();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7767a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7768b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7769c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7770d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0524a f7771e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f7772g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7773h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7774i;
    public final T j;

    /* renamed from: k  reason: collision with root package name */
    public final E f7775k;

    /* renamed from: l  reason: collision with root package name */
    public final i0 f7776l;

    /* renamed from: m  reason: collision with root package name */
    public final M f7777m;

    public Q(int[] iArr, Object[] objArr, int i7, int i8, AbstractC0524a abstractC0524a, int[] iArr2, int i9, int i10, T t7, E e7, i0 i0Var, C0537n c0537n, M m7) {
        this.f7767a = iArr;
        this.f7768b = objArr;
        this.f7769c = i7;
        this.f7770d = i8;
        this.f = abstractC0524a instanceof AbstractC0547y;
        this.f7772g = iArr2;
        this.f7773h = i9;
        this.f7774i = i10;
        this.j = t7;
        this.f7775k = e7;
        this.f7776l = i0Var;
        this.f7771e = abstractC0524a;
        this.f7777m = m7;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m7 = Y.m("Field ", str, " for ");
            m7.append(cls.getName());
            m7.append(" not found. Known fields are ");
            m7.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m7.toString());
        }
    }

    public static int K(int i7) {
        return (i7 & 267386880) >>> 20;
    }

    public static void O(int i7, Object obj, I i8) {
        if (obj instanceof String) {
            ((C0534k) i8.f7755a).y0(i7, (String) obj);
            return;
        }
        i8.b(i7, (C0530g) obj);
    }

    public static boolean o(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0547y) {
            return ((AbstractC0547y) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.Q w(androidx.datastore.preferences.protobuf.a0 r33, androidx.datastore.preferences.protobuf.T r34, androidx.datastore.preferences.protobuf.E r35, androidx.datastore.preferences.protobuf.i0 r36, androidx.datastore.preferences.protobuf.C0537n r37, androidx.datastore.preferences.protobuf.M r38) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.w(androidx.datastore.preferences.protobuf.a0, androidx.datastore.preferences.protobuf.T, androidx.datastore.preferences.protobuf.E, androidx.datastore.preferences.protobuf.i0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.M):androidx.datastore.preferences.protobuf.Q");
    }

    public static long x(int i7) {
        return i7 & 1048575;
    }

    public static int y(Object obj, long j) {
        return ((Integer) n0.f7853c.h(obj, j)).intValue();
    }

    public static long z(Object obj, long j) {
        return ((Long) n0.f7853c.h(obj, j)).longValue();
    }

    public final int A(int i7) {
        if (i7 < this.f7769c || i7 > this.f7770d) {
            return -1;
        }
        int[] iArr = this.f7767a;
        int length = (iArr.length / 3) - 1;
        int i8 = 0;
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

    public final void B(Object obj, long j, K0.l lVar, b0 b0Var, C0536m c0536m) {
        int C7;
        this.f7775k.getClass();
        InterfaceC0548z b5 = E.b(obj, j);
        int i7 = lVar.f2494b;
        if ((i7 & 7) == 3) {
            do {
                AbstractC0547y newInstance = b0Var.newInstance();
                lVar.c(newInstance, b0Var, c0536m);
                b0Var.b(newInstance);
                ((Z) b5).add(newInstance);
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
        throw C.b();
    }

    public final void C(Object obj, int i7, K0.l lVar, b0 b0Var, C0536m c0536m) {
        int C7;
        this.f7775k.getClass();
        InterfaceC0548z b5 = E.b(obj, i7 & 1048575);
        int i8 = lVar.f2494b;
        if ((i8 & 7) == 2) {
            do {
                AbstractC0547y newInstance = b0Var.newInstance();
                lVar.f(newInstance, b0Var, c0536m);
                b0Var.b(newInstance);
                ((Z) b5).add(newInstance);
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
        throw C.b();
    }

    public final void D(int i7, K0.l lVar, Object obj) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            lVar.V(2);
            n0.o(obj, i7 & 1048575, ((H3.d) lVar.f2497e).B());
        } else if (this.f) {
            lVar.V(2);
            n0.o(obj, i7 & 1048575, ((H3.d) lVar.f2497e).A());
        } else {
            n0.o(obj, i7 & 1048575, lVar.k());
        }
    }

    public final void E(int i7, K0.l lVar, Object obj) {
        boolean z7;
        if ((536870912 & i7) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        E e7 = this.f7775k;
        if (z7) {
            e7.getClass();
            lVar.N(E.b(obj, i7 & 1048575), true);
            return;
        }
        e7.getClass();
        lVar.N(E.b(obj, i7 & 1048575), false);
    }

    public final void G(int i7, Object obj) {
        int i8 = this.f7767a[i7 + 2];
        long j = 1048575 & i8;
        if (j == 1048575) {
            return;
        }
        n0.m(j, obj, (1 << (i8 >>> 20)) | n0.f7853c.f(obj, j));
    }

    public final void H(int i7, Object obj, int i8) {
        n0.m(this.f7767a[i8 + 2] & 1048575, obj, i7);
    }

    public final void I(Object obj, int i7, AbstractC0524a abstractC0524a) {
        f7766o.putObject(obj, L(i7) & 1048575, abstractC0524a);
        G(i7, obj);
    }

    public final void J(Object obj, int i7, int i8, AbstractC0524a abstractC0524a) {
        f7766o.putObject(obj, L(i8) & 1048575, abstractC0524a);
        H(i7, obj, i8);
    }

    public final int L(int i7) {
        return this.f7767a[i7 + 1];
    }

    public final void M(Object obj, I i7) {
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        boolean z7;
        boolean z8;
        int[] iArr2 = this.f7767a;
        int length = iArr2.length;
        Unsafe unsafe = f7766o;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < length) {
            int L6 = L(i14);
            int i15 = iArr2[i14];
            int K7 = K(L6);
            if (K7 <= 17) {
                int i16 = iArr2[i14 + 2];
                int i17 = i16 & 1048575;
                if (i17 != i12) {
                    if (i17 == 1048575) {
                        i13 = 0;
                    } else {
                        i13 = unsafe.getInt(obj, i17);
                    }
                    i12 = i17;
                }
                i8 = i12;
                i9 = i13;
                i10 = 1 << (i16 >>> 20);
            } else {
                i8 = i12;
                i9 = i13;
                i10 = 0;
            }
            long j = L6 & 1048575;
            switch (K7) {
                case 0:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.c(i15, n0.f7853c.d(obj, j));
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 1:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.g(n0.f7853c.e(obj, j), i15);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 2:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.j(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 3:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.q(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 4:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.i(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 5:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.f(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 6:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.e(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 7:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.a(i15, n0.f7853c.c(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 8:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        O(i15, unsafe.getObject(obj, j), i7);
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 9:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.k(i15, unsafe.getObject(obj, j), l(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 10:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.b(i15, (C0530g) unsafe.getObject(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 11:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.p(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.d(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 13:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.l(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 14:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.m(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 15:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.n(i15, unsafe.getInt(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.o(i15, unsafe.getLong(obj, j));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 17:
                    iArr = iArr2;
                    i11 = length;
                    if (n(obj, i14, i8, i9, i10)) {
                        i7.h(i15, unsafe.getObject(obj, j), l(i14));
                    } else {
                        continue;
                    }
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    z7 = false;
                    c0.E(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 19:
                    z7 = false;
                    c0.I(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                    z7 = false;
                    c0.L(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 21:
                    z7 = false;
                    c0.T(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 22:
                    z7 = false;
                    c0.K(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 23:
                    z7 = false;
                    c0.H(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 24:
                    z7 = false;
                    c0.G(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 25:
                    z7 = false;
                    c0.C(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 26:
                    c0.R(iArr2[i14], (List) unsafe.getObject(obj, j), i7);
                    break;
                case 27:
                    c0.M(iArr2[i14], (List) unsafe.getObject(obj, j), i7, l(i14));
                    break;
                case 28:
                    c0.D(iArr2[i14], (List) unsafe.getObject(obj, j), i7);
                    break;
                case 29:
                    z8 = false;
                    c0.S(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 30:
                    z8 = false;
                    c0.F(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 31:
                    z8 = false;
                    c0.N(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case RecognitionOptions.EAN_13 /* 32 */:
                    z8 = false;
                    c0.O(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 33:
                    z8 = false;
                    c0.P(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 34:
                    z8 = false;
                    c0.Q(iArr2[i14], (List) unsafe.getObject(obj, j), i7, false);
                    iArr = iArr2;
                    i11 = length;
                    i14 += 3;
                    i12 = i8;
                    iArr2 = iArr;
                    i13 = i9;
                    length = i11;
                case 35:
                    c0.E(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 36:
                    c0.I(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 37:
                    c0.L(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 38:
                    c0.T(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 39:
                    c0.K(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 40:
                    c0.H(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 41:
                    c0.G(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 42:
                    c0.C(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 43:
                    c0.S(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 44:
                    c0.F(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 45:
                    c0.N(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 46:
                    c0.O(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 47:
                    c0.P(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 48:
                    c0.Q(iArr2[i14], (List) unsafe.getObject(obj, j), i7, true);
                    break;
                case 49:
                    c0.J(iArr2[i14], (List) unsafe.getObject(obj, j), i7, l(i14));
                    break;
                case 50:
                    N(i7, i15, unsafe.getObject(obj, j), i14);
                    break;
                case 51:
                    if (p(i15, obj, i14)) {
                        i7.c(i15, ((Double) n0.f7853c.h(obj, j)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (p(i15, obj, i14)) {
                        i7.g(((Float) n0.f7853c.h(obj, j)).floatValue(), i15);
                        break;
                    }
                    break;
                case 53:
                    if (p(i15, obj, i14)) {
                        i7.j(i15, z(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (p(i15, obj, i14)) {
                        i7.q(i15, z(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (p(i15, obj, i14)) {
                        i7.i(i15, y(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (p(i15, obj, i14)) {
                        i7.f(i15, z(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (p(i15, obj, i14)) {
                        i7.e(i15, y(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (p(i15, obj, i14)) {
                        i7.a(i15, ((Boolean) n0.f7853c.h(obj, j)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (p(i15, obj, i14)) {
                        O(i15, unsafe.getObject(obj, j), i7);
                        break;
                    }
                    break;
                case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                    if (p(i15, obj, i14)) {
                        i7.k(i15, unsafe.getObject(obj, j), l(i14));
                        break;
                    }
                    break;
                case 61:
                    if (p(i15, obj, i14)) {
                        i7.b(i15, (C0530g) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (p(i15, obj, i14)) {
                        i7.p(i15, y(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (p(i15, obj, i14)) {
                        i7.d(i15, y(obj, j));
                        break;
                    }
                    break;
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (p(i15, obj, i14)) {
                        i7.l(i15, y(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (p(i15, obj, i14)) {
                        i7.m(i15, z(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (p(i15, obj, i14)) {
                        i7.n(i15, y(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (p(i15, obj, i14)) {
                        i7.o(i15, z(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (p(i15, obj, i14)) {
                        i7.h(i15, unsafe.getObject(obj, j), l(i14));
                        break;
                    }
                    break;
            }
            iArr = iArr2;
            i11 = length;
            i14 += 3;
            i12 = i8;
            iArr2 = iArr;
            i13 = i9;
            length = i11;
        }
        this.f7776l.getClass();
        ((AbstractC0547y) obj).unknownFields.d(i7);
    }

    public final void N(I i7, int i8, Object obj, int i9) {
        if (obj != null) {
            Object obj2 = this.f7768b[(i9 / 3) * 2];
            this.f7777m.getClass();
            J j = ((K) obj2).f7759a;
            C0534k c0534k = (C0534k) i7.f7755a;
            c0534k.getClass();
            for (Map.Entry entry : ((L) obj).entrySet()) {
                c0534k.A0(i8, 2);
                c0534k.C0(K.a(j, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                C0540q.b(c0534k, j.f7756a, 1, key);
                C0540q.b(c0534k, j.f7757b, 2, value);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void a(Object obj, Object obj2) {
        if (o(obj)) {
            obj2.getClass();
            int i7 = 0;
            while (true) {
                int[] iArr = this.f7767a;
                if (i7 < iArr.length) {
                    int L6 = L(i7);
                    long j = 1048575 & L6;
                    int i8 = iArr[i7];
                    switch (K(L6)) {
                        case 0:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                m0 m0Var = n0.f7853c;
                                m0Var.l(obj, j, m0Var.d(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 1:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                m0 m0Var2 = n0.f7853c;
                                m0Var2.m(obj, j, m0Var2.e(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 2:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.n(obj, j, n0.f7853c.g(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 3:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.n(obj, j, n0.f7853c.g(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 4:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.m(j, obj, n0.f7853c.f(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 5:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.n(obj, j, n0.f7853c.g(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 6:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.m(j, obj, n0.f7853c.f(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 7:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                m0 m0Var3 = n0.f7853c;
                                m0Var3.j(obj, j, m0Var3.c(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 8:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.o(obj, j, n0.f7853c.h(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 9:
                            s(i7, obj, obj2);
                            break;
                        case 10:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.o(obj, j, n0.f7853c.h(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 11:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.m(j, obj, n0.f7853c.f(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.m(j, obj, n0.f7853c.f(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 13:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.m(j, obj, n0.f7853c.f(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 14:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.n(obj, j, n0.f7853c.g(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 15:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.m(j, obj, n0.f7853c.f(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case RecognitionOptions.DATA_MATRIX /* 16 */:
                            if (!m(i7, obj2)) {
                                break;
                            } else {
                                n0.n(obj, j, n0.f7853c.g(obj2, j));
                                G(i7, obj);
                                break;
                            }
                        case 17:
                            s(i7, obj, obj2);
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
                            this.f7775k.getClass();
                            m0 m0Var4 = n0.f7853c;
                            InterfaceC0548z interfaceC0548z = (InterfaceC0548z) m0Var4.h(obj, j);
                            InterfaceC0548z interfaceC0548z2 = (InterfaceC0548z) m0Var4.h(obj2, j);
                            Z z7 = (Z) interfaceC0548z;
                            int i9 = z7.f7788c;
                            int i10 = ((Z) interfaceC0548z2).f7788c;
                            if (i9 > 0 && i10 > 0) {
                                if (!((AbstractC0525b) interfaceC0548z).f7793a) {
                                    interfaceC0548z = z7.h(i10 + i9);
                                }
                                ((AbstractC0525b) interfaceC0548z).addAll(interfaceC0548z2);
                            }
                            if (i9 > 0) {
                                interfaceC0548z2 = interfaceC0548z;
                            }
                            n0.o(obj, j, interfaceC0548z2);
                            break;
                        case 50:
                            Class cls = c0.f7796a;
                            m0 m0Var5 = n0.f7853c;
                            Object h8 = m0Var5.h(obj, j);
                            Object h9 = m0Var5.h(obj2, j);
                            this.f7777m.getClass();
                            n0.o(obj, j, M.b(h8, h9));
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
                            if (!p(i8, obj2, i7)) {
                                break;
                            } else {
                                n0.o(obj, j, n0.f7853c.h(obj2, j));
                                H(i8, obj, i7);
                                break;
                            }
                        case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                            t(i7, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case RecognitionOptions.EAN_8 /* 64 */:
                        case 65:
                        case 66:
                        case 67:
                            if (!p(i8, obj2, i7)) {
                                break;
                            } else {
                                n0.o(obj, j, n0.f7853c.h(obj2, j));
                                H(i8, obj, i7);
                                break;
                            }
                        case 68:
                            t(i7, obj, obj2);
                            break;
                    }
                    i7 += 3;
                } else {
                    c0.A(this.f7776l, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void b(Object obj) {
        if (!o(obj)) {
            return;
        }
        if (obj instanceof AbstractC0547y) {
            AbstractC0547y abstractC0547y = (AbstractC0547y) obj;
            abstractC0547y.d();
            abstractC0547y.c();
            abstractC0547y.j();
        }
        int[] iArr = this.f7767a;
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7 += 3) {
            int L6 = L(i7);
            long j = 1048575 & L6;
            int K7 = K(L6);
            if (K7 != 9) {
                if (K7 != 60 && K7 != 68) {
                    switch (K7) {
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
                            this.f7775k.getClass();
                            E.a(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = f7766o;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.f7777m.getClass();
                                M.c(object);
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (p(iArr[i7], obj, i7)) {
                    l(i7).b(f7766o.getObject(obj, j));
                }
            }
            if (m(i7, obj)) {
                l(i7).b(f7766o.getObject(obj, j));
            }
        }
        this.f7776l.getClass();
        i0.b(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final boolean c(Object obj) {
        int i7;
        int i8;
        int i9 = 1048575;
        int i10 = 0;
        int i11 = 0;
        while (i11 < this.f7773h) {
            int i12 = this.f7772g[i11];
            int[] iArr = this.f7767a;
            int i13 = iArr[i12];
            int L6 = L(i12);
            int i14 = iArr[i12 + 2];
            int i15 = i14 & 1048575;
            int i16 = 1 << (i14 >>> 20);
            if (i15 != i9) {
                if (i15 != 1048575) {
                    i10 = f7766o.getInt(obj, i15);
                }
                i8 = i10;
                i7 = i15;
            } else {
                i7 = i9;
                i8 = i10;
            }
            if ((268435456 & L6) != 0 && !n(obj, i12, i7, i8, i16)) {
                return false;
            }
            int K7 = K(L6);
            if (K7 != 9 && K7 != 17) {
                if (K7 != 27) {
                    if (K7 != 60 && K7 != 68) {
                        if (K7 != 49) {
                            if (K7 != 50) {
                                continue;
                            } else {
                                Object h8 = n0.f7853c.h(obj, L6 & 1048575);
                                this.f7777m.getClass();
                                L l8 = (L) h8;
                                if (l8.isEmpty()) {
                                    continue;
                                } else {
                                    if (((K) this.f7768b[(i12 / 3) * 2]).f7759a.f7757b.a() != w0.MESSAGE) {
                                        continue;
                                    } else {
                                        b0 b0Var = null;
                                        for (Object obj2 : l8.values()) {
                                            if (b0Var == null) {
                                                b0Var = X.f7783c.a(obj2.getClass());
                                            }
                                            if (!b0Var.c(obj2)) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (p(i13, obj, i12)) {
                        if (!l(i12).c(n0.f7853c.h(obj, L6 & 1048575))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) n0.f7853c.h(obj, L6 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    b0 l9 = l(i12);
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        if (!l9.c(list.get(i17))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (n(obj, i12, i7, i8, i16)) {
                if (!l(i12).c(n0.f7853c.h(obj, L6 & 1048575))) {
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

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void d(Object obj, I i7) {
        i7.getClass();
        if (x0.ASCENDING == x0.DESCENDING) {
            this.f7776l.getClass();
            ((AbstractC0547y) obj).unknownFields.d(i7);
            int[] iArr = this.f7767a;
            for (int length = iArr.length - 3; length >= 0; length -= 3) {
                int L6 = L(length);
                int i8 = iArr[length];
                switch (K(L6)) {
                    case 0:
                        if (m(length, obj)) {
                            i7.c(i8, n0.f7853c.d(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m(length, obj)) {
                            i7.g(n0.f7853c.e(obj, L6 & 1048575), i8);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m(length, obj)) {
                            i7.j(i8, n0.f7853c.g(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m(length, obj)) {
                            i7.q(i8, n0.f7853c.g(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m(length, obj)) {
                            i7.i(i8, n0.f7853c.f(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m(length, obj)) {
                            i7.f(i8, n0.f7853c.g(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m(length, obj)) {
                            i7.e(i8, n0.f7853c.f(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m(length, obj)) {
                            i7.a(i8, n0.f7853c.c(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m(length, obj)) {
                            O(i8, n0.f7853c.h(obj, L6 & 1048575), i7);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (m(length, obj)) {
                            i7.k(i8, n0.f7853c.h(obj, L6 & 1048575), l(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m(length, obj)) {
                            i7.b(i8, (C0530g) n0.f7853c.h(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m(length, obj)) {
                            i7.p(i8, n0.f7853c.f(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (m(length, obj)) {
                            i7.d(i8, n0.f7853c.f(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m(length, obj)) {
                            i7.l(i8, n0.f7853c.f(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m(length, obj)) {
                            i7.m(i8, n0.f7853c.g(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m(length, obj)) {
                            i7.n(i8, n0.f7853c.f(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (m(length, obj)) {
                            i7.o(i8, n0.f7853c.g(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m(length, obj)) {
                            i7.h(i8, n0.f7853c.h(obj, L6 & 1048575), l(length));
                            break;
                        } else {
                            break;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        c0.E(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 19:
                        c0.I(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        c0.L(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 21:
                        c0.T(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 22:
                        c0.K(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 23:
                        c0.H(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 24:
                        c0.G(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 25:
                        c0.C(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 26:
                        c0.R(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7);
                        break;
                    case 27:
                        c0.M(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, l(length));
                        break;
                    case 28:
                        c0.D(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7);
                        break;
                    case 29:
                        c0.S(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 30:
                        c0.F(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 31:
                        c0.N(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        c0.O(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 33:
                        c0.P(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 34:
                        c0.Q(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, false);
                        break;
                    case 35:
                        c0.E(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 36:
                        c0.I(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 37:
                        c0.L(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 38:
                        c0.T(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 39:
                        c0.K(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 40:
                        c0.H(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 41:
                        c0.G(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 42:
                        c0.C(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 43:
                        c0.S(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 44:
                        c0.F(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 45:
                        c0.N(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 46:
                        c0.O(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 47:
                        c0.P(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 48:
                        c0.Q(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, true);
                        break;
                    case 49:
                        c0.J(iArr[length], (List) n0.f7853c.h(obj, L6 & 1048575), i7, l(length));
                        break;
                    case 50:
                        N(i7, i8, n0.f7853c.h(obj, L6 & 1048575), length);
                        break;
                    case 51:
                        if (p(i8, obj, length)) {
                            i7.c(i8, ((Double) n0.f7853c.h(obj, L6 & 1048575)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (p(i8, obj, length)) {
                            i7.g(((Float) n0.f7853c.h(obj, L6 & 1048575)).floatValue(), i8);
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (p(i8, obj, length)) {
                            i7.j(i8, z(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (p(i8, obj, length)) {
                            i7.q(i8, z(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (p(i8, obj, length)) {
                            i7.i(i8, y(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (p(i8, obj, length)) {
                            i7.f(i8, z(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (p(i8, obj, length)) {
                            i7.e(i8, y(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (p(i8, obj, length)) {
                            i7.a(i8, ((Boolean) n0.f7853c.h(obj, L6 & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (p(i8, obj, length)) {
                            O(i8, n0.f7853c.h(obj, L6 & 1048575), i7);
                            break;
                        } else {
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (p(i8, obj, length)) {
                            i7.k(i8, n0.f7853c.h(obj, L6 & 1048575), l(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (p(i8, obj, length)) {
                            i7.b(i8, (C0530g) n0.f7853c.h(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (p(i8, obj, length)) {
                            i7.p(i8, y(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (p(i8, obj, length)) {
                            i7.d(i8, y(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (p(i8, obj, length)) {
                            i7.l(i8, y(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (p(i8, obj, length)) {
                            i7.m(i8, z(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (p(i8, obj, length)) {
                            i7.n(i8, y(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (p(i8, obj, length)) {
                            i7.o(i8, z(obj, L6 & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (p(i8, obj, length)) {
                            i7.h(i8, n0.f7853c.h(obj, L6 & 1048575), l(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return;
        }
        M(obj, i7);
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
    @Override // androidx.datastore.preferences.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(androidx.datastore.preferences.protobuf.AbstractC0547y r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.e(androidx.datastore.preferences.protobuf.y):int");
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final void f(Object obj, K0.l lVar, C0536m c0536m) {
        c0536m.getClass();
        if (o(obj)) {
            q(this.f7776l, obj, lVar, c0536m);
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.d(r12, r7)) == java.lang.Double.doubleToLongBits(r5.d(r13, r7))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (androidx.datastore.preferences.protobuf.c0.B(r9.h(r12, r7), r9.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (androidx.datastore.preferences.protobuf.c0.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (androidx.datastore.preferences.protobuf.c0.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (androidx.datastore.preferences.protobuf.c0.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (androidx.datastore.preferences.protobuf.c0.B(r5.h(r12, r7), r5.h(r13, r7)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.c(r12, r7) == r5.c(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.f(r12, r7) == r5.f(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.g(r12, r7) == r5.g(r13, r7)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.e(r12, r7)) == java.lang.Float.floatToIntBits(r5.e(r13, r7))) goto L85;
     */
    @Override // androidx.datastore.preferences.protobuf.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(androidx.datastore.preferences.protobuf.AbstractC0547y r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.g(androidx.datastore.preferences.protobuf.y, java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final int h(AbstractC0547y abstractC0547y) {
        int i7;
        int i8;
        int i9;
        int S7;
        int e02;
        int i10;
        int g02;
        int i02;
        Unsafe unsafe = f7766o;
        int i11 = 1048575;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f7767a;
            if (i14 < iArr.length) {
                int L6 = L(i14);
                int K7 = K(L6);
                int i16 = iArr[i14];
                int i17 = iArr[i14 + 2];
                int i18 = i17 & i11;
                if (K7 <= 17) {
                    if (i18 != i12) {
                        if (i18 == i11) {
                            i13 = 0;
                        } else {
                            i13 = unsafe.getInt(abstractC0547y, i18);
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
                long j = L6 & i11;
                if (K7 >= EnumC0542t.DOUBLE_LIST_PACKED.a()) {
                    EnumC0542t.SINT64_LIST_PACKED.a();
                }
                switch (K7) {
                    case 0:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.S(i16);
                            i15 += S7;
                            break;
                        }
                    case 1:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.W(i16);
                            i15 += S7;
                            break;
                        }
                    case 2:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.Z(i16, unsafe.getLong(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 3:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.j0(i16, unsafe.getLong(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 4:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.Y(i16, unsafe.getInt(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 5:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.V(i16);
                            i15 += S7;
                            break;
                        }
                    case 6:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.U(i16);
                            i15 += S7;
                            break;
                        }
                    case 7:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.Q(i16);
                            i15 += S7;
                            break;
                        }
                    case 8:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            Object object = unsafe.getObject(abstractC0547y, j);
                            if (object instanceof C0530g) {
                                e02 = C0534k.R(i16, (C0530g) object);
                            } else {
                                e02 = C0534k.e0(i16, (String) object);
                            }
                            i15 = e02 + i15;
                            break;
                        }
                    case 9:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = c0.o(i16, unsafe.getObject(abstractC0547y, j), l(i14));
                            i15 += S7;
                            break;
                        }
                    case 10:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.R(i16, (C0530g) unsafe.getObject(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 11:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.h0(i16, unsafe.getInt(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.T(i16, unsafe.getInt(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 13:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.a0(i16);
                            i15 += S7;
                            break;
                        }
                    case 14:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.b0(i16);
                            i15 += S7;
                            break;
                        }
                    case 15:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.c0(i16, unsafe.getInt(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case RecognitionOptions.DATA_MATRIX /* 16 */:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.d0(i16, unsafe.getLong(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 17:
                        if (!n(abstractC0547y, i14, i7, i8, i9)) {
                            break;
                        } else {
                            S7 = C0534k.X(i16, (AbstractC0524a) unsafe.getObject(abstractC0547y, j), l(i14));
                            i15 += S7;
                            break;
                        }
                    case p1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        S7 = c0.h(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 19:
                        S7 = c0.f(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                        S7 = c0.m(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 21:
                        S7 = c0.x(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 22:
                        S7 = c0.k(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 23:
                        S7 = c0.h(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 24:
                        S7 = c0.f(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 25:
                        S7 = c0.a(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 26:
                        S7 = c0.u(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 27:
                        S7 = c0.p(i16, (List) unsafe.getObject(abstractC0547y, j), l(i14));
                        i15 += S7;
                        break;
                    case 28:
                        S7 = c0.c(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 29:
                        S7 = c0.v(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 30:
                        S7 = c0.d(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 31:
                        S7 = c0.f(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case RecognitionOptions.EAN_13 /* 32 */:
                        S7 = c0.h(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 33:
                        S7 = c0.q(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 34:
                        S7 = c0.s(i16, (List) unsafe.getObject(abstractC0547y, j));
                        i15 += S7;
                        break;
                    case 35:
                        i10 = c0.i((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 36:
                        i10 = c0.g((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 37:
                        i10 = c0.n((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 38:
                        i10 = c0.y((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 39:
                        i10 = c0.l((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 40:
                        i10 = c0.i((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 41:
                        i10 = c0.g((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 42:
                        i10 = c0.b((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 43:
                        i10 = c0.w((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 44:
                        i10 = c0.e((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 45:
                        i10 = c0.g((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 46:
                        i10 = c0.i((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 47:
                        i10 = c0.r((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 48:
                        i10 = c0.t((List) unsafe.getObject(abstractC0547y, j));
                        if (i10 <= 0) {
                            break;
                        } else {
                            g02 = C0534k.g0(i16);
                            i02 = C0534k.i0(i10);
                            i15 += i02 + g02 + i10;
                            break;
                        }
                    case 49:
                        S7 = c0.j(i16, (List) unsafe.getObject(abstractC0547y, j), l(i14));
                        i15 += S7;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(abstractC0547y, j);
                        Object obj = this.f7768b[(i14 / 3) * 2];
                        this.f7777m.getClass();
                        S7 = M.a(i16, object2, obj);
                        i15 += S7;
                        break;
                    case 51:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.S(i16);
                            i15 += S7;
                            break;
                        }
                    case 52:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.W(i16);
                            i15 += S7;
                            break;
                        }
                    case 53:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.Z(i16, z(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 54:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.j0(i16, z(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 55:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.Y(i16, y(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 56:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.V(i16);
                            i15 += S7;
                            break;
                        }
                    case 57:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.U(i16);
                            i15 += S7;
                            break;
                        }
                    case 58:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.Q(i16);
                            i15 += S7;
                            break;
                        }
                    case 59:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(abstractC0547y, j);
                            if (object3 instanceof C0530g) {
                                e02 = C0534k.R(i16, (C0530g) object3);
                            } else {
                                e02 = C0534k.e0(i16, (String) object3);
                            }
                            i15 = e02 + i15;
                            break;
                        }
                    case PipesConfigBase.DEFAULT_STALE_FETCHER_DELAY_SECONDS /* 60 */:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = c0.o(i16, unsafe.getObject(abstractC0547y, j), l(i14));
                            i15 += S7;
                            break;
                        }
                    case 61:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.R(i16, (C0530g) unsafe.getObject(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 62:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.h0(i16, y(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 63:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.T(i16, y(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.a0(i16);
                            i15 += S7;
                            break;
                        }
                    case 65:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.b0(i16);
                            i15 += S7;
                            break;
                        }
                    case 66:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.c0(i16, y(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 67:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.d0(i16, z(abstractC0547y, j));
                            i15 += S7;
                            break;
                        }
                    case 68:
                        if (!p(i16, abstractC0547y, i14)) {
                            break;
                        } else {
                            S7 = C0534k.X(i16, (AbstractC0524a) unsafe.getObject(abstractC0547y, j), l(i14));
                            i15 += S7;
                            break;
                        }
                }
                i14 += 3;
                i12 = i7;
                i13 = i8;
                i11 = 1048575;
            } else {
                this.f7776l.getClass();
                return abstractC0547y.unknownFields.b() + i15;
            }
        }
    }

    public final boolean i(AbstractC0547y abstractC0547y, Object obj, int i7) {
        if (m(i7, abstractC0547y) == m(i7, obj)) {
            return true;
        }
        return false;
    }

    public final void j(int i7, Object obj, Object obj2) {
        int i8 = this.f7767a[i7];
        if (n0.f7853c.h(obj, L(i7) & 1048575) == null) {
            return;
        }
        k(i7);
    }

    public final void k(int i7) {
        if (this.f7768b[((i7 / 3) * 2) + 1] == null) {
            return;
        }
        throw new ClassCastException();
    }

    public final b0 l(int i7) {
        int i8 = (i7 / 3) * 2;
        Object[] objArr = this.f7768b;
        b0 b0Var = (b0) objArr[i8];
        if (b0Var != null) {
            return b0Var;
        }
        b0 a7 = X.f7783c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a7;
        return a7;
    }

    public final boolean m(int i7, Object obj) {
        int i8 = this.f7767a[i7 + 2];
        long j = i8 & 1048575;
        if (j == 1048575) {
            int L6 = L(i7);
            long j8 = L6 & 1048575;
            switch (K(L6)) {
                case 0:
                    if (Double.doubleToRawLongBits(n0.f7853c.d(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(n0.f7853c.e(obj, j8)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (n0.f7853c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (n0.f7853c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (n0.f7853c.f(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (n0.f7853c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (n0.f7853c.f(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return n0.f7853c.c(obj, j8);
                case 8:
                    Object h8 = n0.f7853c.h(obj, j8);
                    if (h8 instanceof String) {
                        return !((String) h8).isEmpty();
                    }
                    if (h8 instanceof C0530g) {
                        return !C0530g.f7818c.equals(h8);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (n0.f7853c.h(obj, j8) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !C0530g.f7818c.equals(n0.f7853c.h(obj, j8));
                case 11:
                    if (n0.f7853c.f(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case e1.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    if (n0.f7853c.f(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (n0.f7853c.f(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (n0.f7853c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (n0.f7853c.f(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case RecognitionOptions.DATA_MATRIX /* 16 */:
                    if (n0.f7853c.g(obj, j8) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (n0.f7853c.h(obj, j8) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & n0.f7853c.f(obj, j)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean n(Object obj, int i7, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return m(i7, obj);
        }
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.b0
    public final AbstractC0547y newInstance() {
        this.j.getClass();
        return ((AbstractC0547y) this.f7771e).k();
    }

    public final boolean p(int i7, Object obj, int i8) {
        if (n0.f7853c.f(obj, this.f7767a[i8 + 2] & 1048575) == i7) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x064b A[Catch: all -> 0x025f, TryCatch #5 {all -> 0x025f, blocks: (B:122:0x0646, B:124:0x064b, B:125:0x0650, B:69:0x025a, B:72:0x0262, B:73:0x0275, B:74:0x0288, B:75:0x029b, B:76:0x02ae, B:77:0x02c7, B:78:0x02da, B:79:0x02ed, B:80:0x0300, B:81:0x0313, B:82:0x0326, B:83:0x0339, B:84:0x034c, B:85:0x035f, B:86:0x0372, B:87:0x0385, B:88:0x0398, B:89:0x03ab, B:90:0x03be, B:91:0x03d7, B:92:0x03ea, B:93:0x03fd, B:94:0x0411, B:95:0x0419, B:96:0x042c, B:97:0x043f, B:98:0x0452, B:99:0x0465, B:100:0x0478, B:101:0x048b, B:102:0x049e, B:103:0x04b1, B:104:0x04ca, B:105:0x04e0, B:106:0x04f6, B:107:0x050d, B:108:0x0524, B:109:0x053d, B:110:0x0553, B:111:0x0566, B:112:0x057f, B:113:0x058a, B:114:0x05a2, B:115:0x05b9, B:116:0x05d0, B:117:0x05e6, B:118:0x05fc, B:119:0x0611, B:120:0x0629), top: B:152:0x0646 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0656 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(androidx.datastore.preferences.protobuf.i0 r20, java.lang.Object r21, K0.l r22, androidx.datastore.preferences.protobuf.C0536m r23) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.q(androidx.datastore.preferences.protobuf.i0, java.lang.Object, K0.l, androidx.datastore.preferences.protobuf.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
        r0.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0536m r12, K0.l r13) {
        /*
            r8 = this;
            int r10 = r8.L(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.m0 r10 = androidx.datastore.preferences.protobuf.n0.f7853c
            java.lang.Object r10 = r10.h(r9, r0)
            androidx.datastore.preferences.protobuf.M r2 = r8.f7777m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.L r10 = androidx.datastore.preferences.protobuf.L.f7760b
            androidx.datastore.preferences.protobuf.L r10 = r10.b()
            androidx.datastore.preferences.protobuf.n0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.L r3 = (androidx.datastore.preferences.protobuf.L) r3
            boolean r3 = r3.f7761a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.L r3 = androidx.datastore.preferences.protobuf.L.f7760b
            androidx.datastore.preferences.protobuf.L r3 = r3.b()
            androidx.datastore.preferences.protobuf.M.b(r3, r10)
            androidx.datastore.preferences.protobuf.n0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.L r10 = (androidx.datastore.preferences.protobuf.L) r10
            androidx.datastore.preferences.protobuf.K r11 = (androidx.datastore.preferences.protobuf.K) r11
            androidx.datastore.preferences.protobuf.J r9 = r11.f7759a
            r11 = 2
            r13.V(r11)
            java.lang.Object r0 = r13.f2497e
            H3.d r0 = (H3.d) r0
            int r1 = r0.D()
            int r1 = r0.l(r1)
            java.lang.String r2 = ""
            s0.k r3 = r9.f7758c
            r4 = r3
        L55:
            int r5 = r13.b()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.g()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.W()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.C r5 = new androidx.datastore.preferences.protobuf.C     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.v0 r5 = r9.f7757b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            java.lang.Object r4 = r13.t(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.v0 r5 = r9.f7756a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            r6 = 0
            java.lang.Object r2 = r13.t(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.B -> L8e
            goto L55
        L8e:
            boolean r5 = r13.W()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.C r9 = new androidx.datastore.preferences.protobuf.C     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.j(r1)
            return
        La2:
            r0.j(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Q.r(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.m, K0.l):void");
    }

    public final void s(int i7, Object obj, Object obj2) {
        if (!m(i7, obj2)) {
            return;
        }
        long L6 = L(i7) & 1048575;
        Unsafe unsafe = f7766o;
        Object object = unsafe.getObject(obj2, L6);
        if (object != null) {
            b0 l8 = l(i7);
            if (!m(i7, obj)) {
                if (!o(object)) {
                    unsafe.putObject(obj, L6, object);
                } else {
                    AbstractC0547y newInstance = l8.newInstance();
                    l8.a(newInstance, object);
                    unsafe.putObject(obj, L6, newInstance);
                }
                G(i7, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L6);
            if (!o(object2)) {
                AbstractC0547y newInstance2 = l8.newInstance();
                l8.a(newInstance2, object2);
                unsafe.putObject(obj, L6, newInstance2);
                object2 = newInstance2;
            }
            l8.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f7767a[i7] + " is present but null: " + obj2);
    }

    public final void t(int i7, Object obj, Object obj2) {
        int[] iArr;
        int i8 = this.f7767a[i7];
        if (!p(i8, obj2, i7)) {
            return;
        }
        long L6 = L(i7) & 1048575;
        Unsafe unsafe = f7766o;
        Object object = unsafe.getObject(obj2, L6);
        if (object != null) {
            b0 l8 = l(i7);
            if (!p(i8, obj, i7)) {
                if (!o(object)) {
                    unsafe.putObject(obj, L6, object);
                } else {
                    AbstractC0547y newInstance = l8.newInstance();
                    l8.a(newInstance, object);
                    unsafe.putObject(obj, L6, newInstance);
                }
                H(i8, obj, i7);
                return;
            }
            Object object2 = unsafe.getObject(obj, L6);
            if (!o(object2)) {
                AbstractC0547y newInstance2 = l8.newInstance();
                l8.a(newInstance2, object2);
                unsafe.putObject(obj, L6, newInstance2);
                object2 = newInstance2;
            }
            l8.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i7] + " is present but null: " + obj2);
    }

    public final Object u(int i7, Object obj) {
        b0 l8 = l(i7);
        long L6 = L(i7) & 1048575;
        if (!m(i7, obj)) {
            return l8.newInstance();
        }
        Object object = f7766o.getObject(obj, L6);
        if (o(object)) {
            return object;
        }
        AbstractC0547y newInstance = l8.newInstance();
        if (object != null) {
            l8.a(newInstance, object);
        }
        return newInstance;
    }

    public final Object v(int i7, Object obj, int i8) {
        b0 l8 = l(i8);
        if (!p(i7, obj, i8)) {
            return l8.newInstance();
        }
        Object object = f7766o.getObject(obj, L(i8) & 1048575);
        if (o(object)) {
            return object;
        }
        AbstractC0547y newInstance = l8.newInstance();
        if (object != null) {
            l8.a(newInstance, object);
        }
        return newInstance;
    }
}
