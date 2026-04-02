package com.fasterxml.jackson.databind.deser.std;

import b3.k;
import d4.c;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class x extends b0 implements n3.i {

    /* renamed from: a  reason: collision with root package name */
    public final Boolean f6644a;

    /* renamed from: b  reason: collision with root package name */
    public transient Object f6645b;

    /* renamed from: c  reason: collision with root package name */
    public final n3.q f6646c;

    /* loaded from: classes.dex */
    public static final class a extends x {
        public a() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return new a(this, qVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public boolean[] a(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] copyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public boolean[] b() {
            return new boolean[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public boolean[] deserialize(c3.k kVar, k3.g gVar) {
            boolean z10;
            int i10;
            if (!kVar.n0()) {
                return (boolean[]) d(kVar, gVar);
            }
            c.b b10 = gVar.L().b();
            boolean[] zArr = (boolean[]) b10.f();
            int i11 = 0;
            while (true) {
                try {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        try {
                            if (s02 == c3.n.VALUE_TRUE) {
                                z10 = true;
                            } else {
                                if (s02 != c3.n.VALUE_FALSE) {
                                    if (s02 == c3.n.VALUE_NULL) {
                                        n3.q qVar = this.f6646c;
                                        if (qVar != null) {
                                            qVar.getNullValue(gVar);
                                        } else {
                                            _verifyNullForPrimitive(gVar);
                                        }
                                    } else {
                                        z10 = _parseBooleanPrimitive(kVar, gVar);
                                    }
                                }
                                z10 = false;
                            }
                            zArr[i11] = z10;
                            i11 = i10;
                        } catch (Exception e10) {
                            e = e10;
                            i11 = i10;
                            throw k3.l.p(e, zArr, b10.d() + i11);
                        }
                        if (i11 >= zArr.length) {
                            zArr = (boolean[]) b10.c(zArr, i11);
                            i11 = 0;
                        }
                        i10 = i11 + 1;
                    } else {
                        return (boolean[]) b10.e(zArr, i11);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public boolean[] e(c3.k kVar, k3.g gVar) {
            return new boolean[]{_parseBooleanPrimitive(kVar, gVar)};
        }

        public a(a aVar, n3.q qVar, Boolean bool) {
            super(aVar, qVar, bool);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends x {
        public b() {
            super(byte[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return new b(this, qVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public byte[] a(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] copyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public byte[] b() {
            return new byte[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public byte[] deserialize(c3.k kVar, k3.g gVar) {
            byte x10;
            int i10;
            c3.n n10 = kVar.n();
            if (n10 == c3.n.VALUE_STRING) {
                try {
                    return kVar.v(gVar.M());
                } catch (c3.j e10) {
                    String c10 = e10.c();
                    if (c10.contains("base64")) {
                        return (byte[]) gVar.j0(byte[].class, kVar.Y(), c10, new Object[0]);
                    }
                }
            }
            if (n10 == c3.n.VALUE_EMBEDDED_OBJECT) {
                Object N = kVar.N();
                if (N == null) {
                    return null;
                }
                if (N instanceof byte[]) {
                    return (byte[]) N;
                }
            }
            if (!kVar.n0()) {
                return (byte[]) d(kVar, gVar);
            }
            c.C0205c c11 = gVar.L().c();
            byte[] bArr = (byte[]) c11.f();
            int i11 = 0;
            while (true) {
                try {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        try {
                            if (s02 == c3.n.VALUE_NUMBER_INT) {
                                x10 = kVar.x();
                            } else if (s02 == c3.n.VALUE_NULL) {
                                n3.q qVar = this.f6646c;
                                if (qVar != null) {
                                    qVar.getNullValue(gVar);
                                } else {
                                    _verifyNullForPrimitive(gVar);
                                    x10 = 0;
                                }
                            } else {
                                x10 = _parseBytePrimitive(kVar, gVar);
                            }
                            bArr[i11] = x10;
                            i11 = i10;
                        } catch (Exception e11) {
                            e = e11;
                            i11 = i10;
                            throw k3.l.p(e, bArr, c11.d() + i11);
                        }
                        if (i11 >= bArr.length) {
                            bArr = (byte[]) c11.c(bArr, i11);
                            i11 = 0;
                        }
                        i10 = i11 + 1;
                    } else {
                        return (byte[]) c11.e(bArr, i11);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public byte[] e(c3.k kVar, k3.g gVar) {
            byte byteValue;
            c3.n n10 = kVar.n();
            if (n10 == c3.n.VALUE_NUMBER_INT) {
                byteValue = kVar.x();
            } else if (n10 == c3.n.VALUE_NULL) {
                n3.q qVar = this.f6646c;
                if (qVar != null) {
                    qVar.getNullValue(gVar);
                    return (byte[]) getEmptyValue(gVar);
                }
                _verifyNullForPrimitive(gVar);
                return null;
            } else {
                byteValue = ((Number) gVar.a0(this._valueClass.getComponentType(), kVar)).byteValue();
            }
            return new byte[]{byteValue};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x, k3.k
        public c4.f logicalType() {
            return c4.f.Binary;
        }

        public b(b bVar, n3.q qVar, Boolean bool) {
            super(bVar, qVar, bool);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends x {
        public c() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return this;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public char[] a(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] copyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public char[] b() {
            return new char[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public char[] deserialize(c3.k kVar, k3.g gVar) {
            String Y;
            if (kVar.j0(c3.n.VALUE_STRING)) {
                char[] Z = kVar.Z();
                int b02 = kVar.b0();
                int a02 = kVar.a0();
                char[] cArr = new char[a02];
                System.arraycopy(Z, b02, cArr, 0, a02);
                return cArr;
            } else if (kVar.n0()) {
                StringBuilder sb = new StringBuilder(64);
                while (true) {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        if (s02 == c3.n.VALUE_STRING) {
                            Y = kVar.Y();
                        } else if (s02 == c3.n.VALUE_NULL) {
                            n3.q qVar = this.f6646c;
                            if (qVar != null) {
                                qVar.getNullValue(gVar);
                            } else {
                                _verifyNullForPrimitive(gVar);
                                Y = "\u0000";
                            }
                        } else {
                            Y = ((CharSequence) gVar.a0(Character.TYPE, kVar)).toString();
                        }
                        if (Y.length() != 1) {
                            gVar.z0(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(Y.length()));
                        }
                        sb.append(Y.charAt(0));
                    } else {
                        return sb.toString().toCharArray();
                    }
                }
            } else {
                if (kVar.j0(c3.n.VALUE_EMBEDDED_OBJECT)) {
                    Object N = kVar.N();
                    if (N == null) {
                        return null;
                    }
                    if (N instanceof char[]) {
                        return (char[]) N;
                    }
                    if (N instanceof String) {
                        return ((String) N).toCharArray();
                    }
                    if (N instanceof byte[]) {
                        return c3.b.a().i((byte[]) N, false).toCharArray();
                    }
                }
                return (char[]) gVar.a0(this._valueClass, kVar);
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public char[] e(c3.k kVar, k3.g gVar) {
            return (char[]) gVar.a0(this._valueClass, kVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends x {
        public d() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return new d(this, qVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public double[] a(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] copyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public double[] b() {
            return new double[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public double[] deserialize(c3.k kVar, k3.g gVar) {
            n3.q qVar;
            if (!kVar.n0()) {
                return (double[]) d(kVar, gVar);
            }
            c.d d10 = gVar.L().d();
            double[] dArr = (double[]) d10.f();
            int i10 = 0;
            while (true) {
                try {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        if (s02 == c3.n.VALUE_NULL && (qVar = this.f6646c) != null) {
                            qVar.getNullValue(gVar);
                        } else {
                            double _parseDoublePrimitive = _parseDoublePrimitive(kVar, gVar);
                            if (i10 >= dArr.length) {
                                dArr = (double[]) d10.c(dArr, i10);
                                i10 = 0;
                            }
                            int i11 = i10 + 1;
                            try {
                                dArr[i10] = _parseDoublePrimitive;
                                i10 = i11;
                            } catch (Exception e10) {
                                e = e10;
                                i10 = i11;
                                throw k3.l.p(e, dArr, d10.d() + i10);
                            }
                        }
                    } else {
                        return (double[]) d10.e(dArr, i10);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public double[] e(c3.k kVar, k3.g gVar) {
            return new double[]{_parseDoublePrimitive(kVar, gVar)};
        }

        public d(d dVar, n3.q qVar, Boolean bool) {
            super(dVar, qVar, bool);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends x {
        public e() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return new e(this, qVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public float[] a(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] copyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public float[] b() {
            return new float[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public float[] deserialize(c3.k kVar, k3.g gVar) {
            n3.q qVar;
            if (!kVar.n0()) {
                return (float[]) d(kVar, gVar);
            }
            c.e e10 = gVar.L().e();
            float[] fArr = (float[]) e10.f();
            int i10 = 0;
            while (true) {
                try {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        if (s02 == c3.n.VALUE_NULL && (qVar = this.f6646c) != null) {
                            qVar.getNullValue(gVar);
                        } else {
                            float _parseFloatPrimitive = _parseFloatPrimitive(kVar, gVar);
                            if (i10 >= fArr.length) {
                                fArr = (float[]) e10.c(fArr, i10);
                                i10 = 0;
                            }
                            int i11 = i10 + 1;
                            try {
                                fArr[i10] = _parseFloatPrimitive;
                                i10 = i11;
                            } catch (Exception e11) {
                                e = e11;
                                i10 = i11;
                                throw k3.l.p(e, fArr, e10.d() + i10);
                            }
                        }
                    } else {
                        return (float[]) e10.e(fArr, i10);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public float[] e(c3.k kVar, k3.g gVar) {
            return new float[]{_parseFloatPrimitive(kVar, gVar)};
        }

        public e(e eVar, n3.q qVar, Boolean bool) {
            super(eVar, qVar, bool);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends x {

        /* renamed from: d  reason: collision with root package name */
        public static final f f6647d = new f();

        public f() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return new f(this, qVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public int[] a(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] copyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public int[] b() {
            return new int[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public int[] deserialize(c3.k kVar, k3.g gVar) {
            int P;
            int i10;
            if (!kVar.n0()) {
                return (int[]) d(kVar, gVar);
            }
            c.f f10 = gVar.L().f();
            int[] iArr = (int[]) f10.f();
            int i11 = 0;
            while (true) {
                try {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        try {
                            if (s02 == c3.n.VALUE_NUMBER_INT) {
                                P = kVar.P();
                            } else if (s02 == c3.n.VALUE_NULL) {
                                n3.q qVar = this.f6646c;
                                if (qVar != null) {
                                    qVar.getNullValue(gVar);
                                } else {
                                    _verifyNullForPrimitive(gVar);
                                    P = 0;
                                }
                            } else {
                                P = _parseIntPrimitive(kVar, gVar);
                            }
                            iArr[i11] = P;
                            i11 = i10;
                        } catch (Exception e10) {
                            e = e10;
                            i11 = i10;
                            throw k3.l.p(e, iArr, f10.d() + i11);
                        }
                        if (i11 >= iArr.length) {
                            iArr = (int[]) f10.c(iArr, i11);
                            i11 = 0;
                        }
                        i10 = i11 + 1;
                    } else {
                        return (int[]) f10.e(iArr, i11);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public int[] e(c3.k kVar, k3.g gVar) {
            return new int[]{_parseIntPrimitive(kVar, gVar)};
        }

        public f(f fVar, n3.q qVar, Boolean bool) {
            super(fVar, qVar, bool);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends x {

        /* renamed from: d  reason: collision with root package name */
        public static final g f6648d = new g();

        public g() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return new g(this, qVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public long[] a(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] copyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public long[] b() {
            return new long[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public long[] deserialize(c3.k kVar, k3.g gVar) {
            long Q;
            int i10;
            if (!kVar.n0()) {
                return (long[]) d(kVar, gVar);
            }
            c.g g10 = gVar.L().g();
            long[] jArr = (long[]) g10.f();
            int i11 = 0;
            while (true) {
                try {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        try {
                            if (s02 == c3.n.VALUE_NUMBER_INT) {
                                Q = kVar.Q();
                            } else if (s02 == c3.n.VALUE_NULL) {
                                n3.q qVar = this.f6646c;
                                if (qVar != null) {
                                    qVar.getNullValue(gVar);
                                } else {
                                    _verifyNullForPrimitive(gVar);
                                    Q = 0;
                                }
                            } else {
                                Q = _parseLongPrimitive(kVar, gVar);
                            }
                            jArr[i11] = Q;
                            i11 = i10;
                        } catch (Exception e10) {
                            e = e10;
                            i11 = i10;
                            throw k3.l.p(e, jArr, g10.d() + i11);
                        }
                        if (i11 >= jArr.length) {
                            jArr = (long[]) g10.c(jArr, i11);
                            i11 = 0;
                        }
                        i10 = i11 + 1;
                    } else {
                        return (long[]) g10.e(jArr, i11);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public long[] e(c3.k kVar, k3.g gVar) {
            return new long[]{_parseLongPrimitive(kVar, gVar)};
        }

        public g(g gVar, n3.q qVar, Boolean bool) {
            super(gVar, qVar, bool);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends x {
        public h() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        public x f(n3.q qVar, Boolean bool) {
            return new h(this, qVar, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: g */
        public short[] a(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] copyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, copyOf, length, length2);
            return copyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: h */
        public short[] b() {
            return new short[0];
        }

        @Override // k3.k
        /* renamed from: i */
        public short[] deserialize(c3.k kVar, k3.g gVar) {
            short _parseShortPrimitive;
            int i10;
            if (!kVar.n0()) {
                return (short[]) d(kVar, gVar);
            }
            c.h h10 = gVar.L().h();
            short[] sArr = (short[]) h10.f();
            int i11 = 0;
            while (true) {
                try {
                    c3.n s02 = kVar.s0();
                    if (s02 != c3.n.END_ARRAY) {
                        try {
                            if (s02 == c3.n.VALUE_NULL) {
                                n3.q qVar = this.f6646c;
                                if (qVar != null) {
                                    qVar.getNullValue(gVar);
                                } else {
                                    _verifyNullForPrimitive(gVar);
                                    _parseShortPrimitive = 0;
                                }
                            } else {
                                _parseShortPrimitive = _parseShortPrimitive(kVar, gVar);
                            }
                            sArr[i11] = _parseShortPrimitive;
                            i11 = i10;
                        } catch (Exception e10) {
                            e = e10;
                            i11 = i10;
                            throw k3.l.p(e, sArr, h10.d() + i11);
                        }
                        if (i11 >= sArr.length) {
                            sArr = (short[]) h10.c(sArr, i11);
                            i11 = 0;
                        }
                        i10 = i11 + 1;
                    } else {
                        return (short[]) h10.e(sArr, i11);
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.x
        /* renamed from: j */
        public short[] e(c3.k kVar, k3.g gVar) {
            return new short[]{_parseShortPrimitive(kVar, gVar)};
        }

        public h(h hVar, n3.q qVar, Boolean bool) {
            super(hVar, qVar, bool);
        }
    }

    public x(Class cls) {
        super(cls);
        this.f6644a = null;
        this.f6646c = null;
    }

    public static k3.k c(Class cls) {
        if (cls == Integer.TYPE) {
            return f.f6647d;
        }
        if (cls == Long.TYPE) {
            return g.f6648d;
        }
        if (cls == Byte.TYPE) {
            return new b();
        }
        if (cls == Short.TYPE) {
            return new h();
        }
        if (cls == Float.TYPE) {
            return new e();
        }
        if (cls == Double.TYPE) {
            return new d();
        }
        if (cls == Boolean.TYPE) {
            return new a();
        }
        if (cls == Character.TYPE) {
            return new c();
        }
        throw new IllegalStateException();
    }

    public abstract Object a(Object obj, Object obj2);

    public abstract Object b();

    @Override // n3.i
    public k3.k createContextual(k3.g gVar, k3.d dVar) {
        n3.q qVar;
        Boolean findFormatFeature = findFormatFeature(gVar, dVar, this._valueClass, k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        b3.j0 findContentNullStyle = findContentNullStyle(gVar, dVar);
        if (findContentNullStyle == b3.j0.SKIP) {
            qVar = o3.q.d();
        } else if (findContentNullStyle == b3.j0.FAIL) {
            if (dVar == null) {
                qVar = o3.r.c(gVar.x(this._valueClass.getComponentType()));
            } else {
                qVar = o3.r.b(dVar, dVar.getType().k());
            }
        } else {
            qVar = null;
        }
        if (Objects.equals(findFormatFeature, this.f6644a) && qVar == this.f6646c) {
            return this;
        }
        return f(qVar, findFormatFeature);
    }

    public Object d(c3.k kVar, k3.g gVar) {
        boolean z10;
        if (kVar.j0(c3.n.VALUE_STRING)) {
            return _deserializeFromString(kVar, gVar);
        }
        Boolean bool = this.f6644a;
        if (bool != Boolean.TRUE && (bool != null || !gVar.n0(k3.h.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return e(kVar, gVar);
        }
        return gVar.a0(this._valueClass, kVar);
    }

    @Override // k3.k
    public Object deserialize(c3.k kVar, k3.g gVar, Object obj) {
        Object deserialize = deserialize(kVar, gVar);
        if (obj == null) {
            return deserialize;
        }
        if (Array.getLength(obj) == 0) {
            return deserialize;
        }
        return a(obj, deserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.b0, k3.k
    public Object deserializeWithType(c3.k kVar, k3.g gVar, w3.e eVar) {
        return eVar.d(kVar, gVar);
    }

    public abstract Object e(c3.k kVar, k3.g gVar);

    public abstract x f(n3.q qVar, Boolean bool);

    @Override // k3.k
    public d4.a getEmptyAccessPattern() {
        return d4.a.CONSTANT;
    }

    @Override // k3.k
    public Object getEmptyValue(k3.g gVar) {
        Object obj = this.f6645b;
        if (obj == null) {
            Object b10 = b();
            this.f6645b = b10;
            return b10;
        }
        return obj;
    }

    @Override // k3.k
    public c4.f logicalType() {
        return c4.f.Array;
    }

    @Override // k3.k
    public Boolean supportsUpdate(k3.f fVar) {
        return Boolean.TRUE;
    }

    public x(x xVar, n3.q qVar, Boolean bool) {
        super(xVar._valueClass);
        this.f6644a = bool;
        this.f6646c = qVar;
    }
}
