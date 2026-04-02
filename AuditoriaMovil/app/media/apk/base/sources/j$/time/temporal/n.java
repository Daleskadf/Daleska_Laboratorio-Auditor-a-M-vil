package j$.time.temporal;
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12783a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12784b;

    public /* synthetic */ n(int i7, int i8) {
        this.f12783a = i8;
        this.f12784b = i7;
    }

    @Override // j$.time.temporal.m
    public final Temporal D(Temporal temporal) {
        switch (this.f12783a) {
            case 0:
                int q2 = temporal.q(a.DAY_OF_WEEK);
                int i7 = this.f12784b;
                if (q2 == i7) {
                    return temporal;
                }
                int i8 = q2 - i7;
                return temporal.e(i8 >= 0 ? 7 - i8 : -i8, ChronoUnit.DAYS);
            default:
                int q7 = temporal.q(a.DAY_OF_WEEK);
                int i9 = this.f12784b;
                if (q7 == i9) {
                    return temporal;
                }
                int i10 = i9 - q7;
                return temporal.o(i10 >= 0 ? 7 - i10 : -i10, ChronoUnit.DAYS);
        }
    }
}
