package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
/* renamed from: j$.util.stream.q0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1306q0 extends AbstractC1320t0 implements InterfaceC1288m2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC1340x0.g(this, num);
    }

    @Override // j$.util.stream.AbstractC1320t0, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        if (this.f13350a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i7);
        throw null;
    }
}
