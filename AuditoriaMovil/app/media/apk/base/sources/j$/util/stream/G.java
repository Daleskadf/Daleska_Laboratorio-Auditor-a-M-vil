package j$.util.stream;

import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
final class G extends K implements InterfaceC1283l2 {

    /* renamed from: c  reason: collision with root package name */
    static final F f13054c;

    /* renamed from: d  reason: collision with root package name */
    static final F f13055d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        p(Double.valueOf(d7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f13080a) {
            return j$.util.C.d(((Double) this.f13081b).doubleValue());
        }
        return null;
    }

    static {
        EnumC1244d3 enumC1244d3 = EnumC1244d3.DOUBLE_VALUE;
        f13054c = new F(true, enumC1244d3, j$.util.C.a(), new r(1), new C1300p(4));
        f13055d = new F(false, enumC1244d3, j$.util.C.a(), new r(1), new C1300p(4));
    }
}
