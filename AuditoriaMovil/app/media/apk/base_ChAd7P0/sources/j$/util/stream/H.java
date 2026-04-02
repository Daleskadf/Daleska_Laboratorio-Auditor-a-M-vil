package j$.util.stream;

import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
final class H extends K implements InterfaceC1288m2 {

    /* renamed from: c  reason: collision with root package name */
    static final F f13060c;

    /* renamed from: d  reason: collision with root package name */
    static final F f13061d;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        p(Integer.valueOf(i7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f13080a) {
            return j$.util.D.d(((Integer) this.f13081b).intValue());
        }
        return null;
    }

    static {
        EnumC1244d3 enumC1244d3 = EnumC1244d3.INT_VALUE;
        f13060c = new F(true, enumC1244d3, j$.util.D.a(), new r(2), new C1300p(5));
        f13061d = new F(false, enumC1244d3, j$.util.D.a(), new r(2), new C1300p(5));
    }
}
