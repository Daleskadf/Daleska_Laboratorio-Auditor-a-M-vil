package j$.time.temporal;

import j$.util.Objects;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    static final r f12777a = new o(1);

    /* renamed from: b  reason: collision with root package name */
    static final r f12778b = new o(2);

    /* renamed from: c  reason: collision with root package name */
    static final r f12779c = new o(3);

    /* renamed from: d  reason: collision with root package name */
    static final r f12780d = new o(4);

    /* renamed from: e  reason: collision with root package name */
    static final r f12781e = new o(5);
    static final r f = new o(6);

    /* renamed from: g  reason: collision with root package name */
    static final r f12782g = new o(7);

    public static r k() {
        return f12777a;
    }

    public static t d(TemporalAccessor temporalAccessor, q qVar) {
        if (qVar instanceof a) {
            if (temporalAccessor.g(qVar)) {
                return ((a) qVar).o();
            }
            throw new RuntimeException(j$.time.d.a("Unsupported field: ", qVar));
        }
        Objects.requireNonNull(qVar, "field");
        return qVar.B(temporalAccessor);
    }

    public static r e() {
        return f12778b;
    }

    public static int a(TemporalAccessor temporalAccessor, q qVar) {
        t t7 = temporalAccessor.t(qVar);
        if (!t7.h()) {
            throw new RuntimeException("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long w2 = temporalAccessor.w(qVar);
        if (t7.i(w2)) {
            return (int) w2;
        }
        throw new RuntimeException("Invalid value for " + qVar + " (valid values " + t7 + "): " + w2);
    }

    public static r i() {
        return f12779c;
    }

    public static r j() {
        return f12781e;
    }

    public static r h() {
        return f12780d;
    }

    public static Object c(TemporalAccessor temporalAccessor, r rVar) {
        if (rVar == f12777a || rVar == f12778b || rVar == f12779c) {
            return null;
        }
        return rVar.h(temporalAccessor);
    }

    public static r f() {
        return f;
    }

    public static r g() {
        return f12782g;
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j8;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.e(Long.MAX_VALUE, temporalUnit);
            j8 = 1;
        } else {
            j8 = -j;
        }
        return temporal.e(j8, temporalUnit);
    }
}
