package j$.time.chrono;

import j$.time.temporal.Temporal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class s implements n {
    public static final s AH;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ s[] f12640a;

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object B(j$.time.temporal.r rVar) {
        return AbstractC1202i.n(this, rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean g(j$.time.temporal.q qVar) {
        return AbstractC1202i.j(this, qVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int q(j$.time.temporal.q qVar) {
        return AbstractC1202i.f(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long w(j$.time.temporal.q qVar) {
        return AbstractC1202i.g(this, qVar);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f12640a.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.chrono.s] */
    static {
        ?? r12 = new Enum("AH", 0);
        AH = r12;
        f12640a = new s[]{r12};
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.t t(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return j$.time.temporal.t.j(1L, 1L);
        }
        return j$.time.temporal.l.d(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        return temporal.d(1, j$.time.temporal.a.ERA);
    }
}
