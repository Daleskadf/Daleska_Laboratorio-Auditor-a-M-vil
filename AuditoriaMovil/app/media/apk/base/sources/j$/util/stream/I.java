package j$.util.stream;

import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
final class I extends K implements InterfaceC1293n2 {

    /* renamed from: c  reason: collision with root package name */
    static final F f13066c;

    /* renamed from: d  reason: collision with root package name */
    static final F f13067d;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        p(Long.valueOf(j));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f13080a) {
            return j$.util.E.d(((Long) this.f13081b).longValue());
        }
        return null;
    }

    static {
        EnumC1244d3 enumC1244d3 = EnumC1244d3.LONG_VALUE;
        f13066c = new F(true, enumC1244d3, j$.util.E.a(), new r(3), new C1300p(6));
        f13067d = new F(false, enumC1244d3, j$.util.E.a(), new r(3), new C1300p(6));
    }
}
