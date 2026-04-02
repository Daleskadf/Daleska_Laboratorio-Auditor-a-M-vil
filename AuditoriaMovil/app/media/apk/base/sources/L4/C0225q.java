package L4;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* renamed from: L4.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225q extends Q4.a {

    /* renamed from: o0  reason: collision with root package name */
    public static final C0223o f2994o0 = new C0223o();

    /* renamed from: p0  reason: collision with root package name */
    public static final Object f2995p0 = new Object();

    /* renamed from: k0  reason: collision with root package name */
    public Object[] f2996k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2997l0;

    /* renamed from: m0  reason: collision with root package name */
    public String[] f2998m0;

    /* renamed from: n0  reason: collision with root package name */
    public int[] f2999n0;

    @Override // Q4.a
    public final String B() {
        Q4.b D4 = D();
        Q4.b bVar = Q4.b.STRING;
        if (D4 != bVar && D4 != Q4.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + D4 + P());
        }
        String h8 = ((I4.u) S()).h();
        int i7 = this.f2997l0;
        if (i7 > 0) {
            int[] iArr = this.f2999n0;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return h8;
    }

    @Override // Q4.a
    public final Q4.b D() {
        if (this.f2997l0 == 0) {
            return Q4.b.END_DOCUMENT;
        }
        Object R7 = R();
        if (R7 instanceof Iterator) {
            boolean z7 = this.f2996k0[this.f2997l0 - 2] instanceof I4.t;
            Iterator it = (Iterator) R7;
            if (it.hasNext()) {
                if (z7) {
                    return Q4.b.NAME;
                }
                T(it.next());
                return D();
            } else if (z7) {
                return Q4.b.END_OBJECT;
            } else {
                return Q4.b.END_ARRAY;
            }
        } else if (R7 instanceof I4.t) {
            return Q4.b.BEGIN_OBJECT;
        } else {
            if (R7 instanceof I4.o) {
                return Q4.b.BEGIN_ARRAY;
            }
            if (R7 instanceof I4.u) {
                Serializable serializable = ((I4.u) R7).f2220a;
                if (serializable instanceof String) {
                    return Q4.b.STRING;
                }
                if (serializable instanceof Boolean) {
                    return Q4.b.BOOLEAN;
                }
                if (serializable instanceof Number) {
                    return Q4.b.NUMBER;
                }
                throw new AssertionError();
            } else if (R7 instanceof I4.s) {
                return Q4.b.NULL;
            } else {
                if (R7 == f2995p0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new IOException("Custom JsonElement subclass " + R7.getClass().getName() + " is not supported");
            }
        }
    }

    @Override // Q4.a
    public final void K() {
        int i7 = AbstractC0224p.f2993a[D().ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        S();
                        int i8 = this.f2997l0;
                        if (i8 > 0) {
                            int[] iArr = this.f2999n0;
                            int i9 = i8 - 1;
                            iArr[i9] = iArr[i9] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                j();
                return;
            }
            g();
            return;
        }
        Q(true);
    }

    public final void N(Q4.b bVar) {
        if (D() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + D() + P());
    }

    public final String O(boolean z7) {
        StringBuilder sb = new StringBuilder("$");
        int i7 = 0;
        while (true) {
            int i8 = this.f2997l0;
            if (i7 < i8) {
                Object[] objArr = this.f2996k0;
                Object obj = objArr[i7];
                if (obj instanceof I4.o) {
                    i7++;
                    if (i7 < i8 && (objArr[i7] instanceof Iterator)) {
                        int i9 = this.f2999n0[i7];
                        if (z7 && i9 > 0 && (i7 == i8 - 1 || i7 == i8 - 2)) {
                            i9--;
                        }
                        sb.append('[');
                        sb.append(i9);
                        sb.append(']');
                    }
                } else if ((obj instanceof I4.t) && (i7 = i7 + 1) < i8 && (objArr[i7] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.f2998m0[i7];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i7++;
            } else {
                return sb.toString();
            }
        }
    }

    public final String P() {
        return " at path " + O(false);
    }

    public final String Q(boolean z7) {
        String str;
        N(Q4.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) R()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.f2998m0;
        int i7 = this.f2997l0 - 1;
        if (z7) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i7] = str;
        T(entry.getValue());
        return str2;
    }

    public final Object R() {
        return this.f2996k0[this.f2997l0 - 1];
    }

    public final Object S() {
        Object[] objArr = this.f2996k0;
        int i7 = this.f2997l0 - 1;
        this.f2997l0 = i7;
        Object obj = objArr[i7];
        objArr[i7] = null;
        return obj;
    }

    public final void T(Object obj) {
        int i7 = this.f2997l0;
        Object[] objArr = this.f2996k0;
        if (i7 == objArr.length) {
            int i8 = i7 * 2;
            this.f2996k0 = Arrays.copyOf(objArr, i8);
            this.f2999n0 = Arrays.copyOf(this.f2999n0, i8);
            this.f2998m0 = (String[]) Arrays.copyOf(this.f2998m0, i8);
        }
        Object[] objArr2 = this.f2996k0;
        int i9 = this.f2997l0;
        this.f2997l0 = i9 + 1;
        objArr2[i9] = obj;
    }

    @Override // Q4.a
    public final void a() {
        N(Q4.b.BEGIN_ARRAY);
        T(((I4.o) R()).f2217a.iterator());
        this.f2999n0[this.f2997l0 - 1] = 0;
    }

    @Override // Q4.a
    public final void b() {
        N(Q4.b.BEGIN_OBJECT);
        T(((K4.m) ((I4.t) R()).f2219a.entrySet()).iterator());
    }

    @Override // Q4.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2996k0 = new Object[]{f2995p0};
        this.f2997l0 = 1;
    }

    @Override // Q4.a
    public final void g() {
        N(Q4.b.END_ARRAY);
        S();
        S();
        int i7 = this.f2997l0;
        if (i7 > 0) {
            int[] iArr = this.f2999n0;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override // Q4.a
    public final void j() {
        N(Q4.b.END_OBJECT);
        this.f2998m0[this.f2997l0 - 1] = null;
        S();
        S();
        int i7 = this.f2997l0;
        if (i7 > 0) {
            int[] iArr = this.f2999n0;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }

    @Override // Q4.a
    public final String n() {
        return O(false);
    }

    @Override // Q4.a
    public final String p() {
        return O(true);
    }

    @Override // Q4.a
    public final boolean q() {
        Q4.b D4 = D();
        if (D4 != Q4.b.END_OBJECT && D4 != Q4.b.END_ARRAY && D4 != Q4.b.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // Q4.a
    public final boolean t() {
        N(Q4.b.BOOLEAN);
        boolean e7 = ((I4.u) S()).e();
        int i7 = this.f2997l0;
        if (i7 > 0) {
            int[] iArr = this.f2999n0;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return e7;
    }

    @Override // Q4.a
    public final String toString() {
        return C0225q.class.getSimpleName() + P();
    }

    @Override // Q4.a
    public final double u() {
        Q4.b D4 = D();
        Q4.b bVar = Q4.b.NUMBER;
        if (D4 != bVar && D4 != Q4.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + D4 + P());
        }
        double k2 = ((I4.u) R()).k();
        if (this.f4393b == I4.z.LENIENT || (!Double.isNaN(k2) && !Double.isInfinite(k2))) {
            S();
            int i7 = this.f2997l0;
            if (i7 > 0) {
                int[] iArr = this.f2999n0;
                int i8 = i7 - 1;
                iArr[i8] = iArr[i8] + 1;
            }
            return k2;
        }
        throw new IOException("JSON forbids NaN and infinities: " + k2);
    }

    @Override // Q4.a
    public final int v() {
        int parseInt;
        Q4.b D4 = D();
        Q4.b bVar = Q4.b.NUMBER;
        if (D4 != bVar && D4 != Q4.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + D4 + P());
        }
        I4.u uVar = (I4.u) R();
        if (uVar.f2220a instanceof Number) {
            parseInt = uVar.l().intValue();
        } else {
            parseInt = Integer.parseInt(uVar.h());
        }
        S();
        int i7 = this.f2997l0;
        if (i7 > 0) {
            int[] iArr = this.f2999n0;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return parseInt;
    }

    @Override // Q4.a
    public final long w() {
        long parseLong;
        Q4.b D4 = D();
        Q4.b bVar = Q4.b.NUMBER;
        if (D4 != bVar && D4 != Q4.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + D4 + P());
        }
        I4.u uVar = (I4.u) R();
        if (uVar.f2220a instanceof Number) {
            parseLong = uVar.l().longValue();
        } else {
            parseLong = Long.parseLong(uVar.h());
        }
        S();
        int i7 = this.f2997l0;
        if (i7 > 0) {
            int[] iArr = this.f2999n0;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
        return parseLong;
    }

    @Override // Q4.a
    public final String x() {
        return Q(false);
    }

    @Override // Q4.a
    public final void z() {
        N(Q4.b.NULL);
        S();
        int i7 = this.f2997l0;
        if (i7 > 0) {
            int[] iArr = this.f2999n0;
            int i8 = i7 - 1;
            iArr[i8] = iArr[i8] + 1;
        }
    }
}
