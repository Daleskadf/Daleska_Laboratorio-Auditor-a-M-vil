package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
/* renamed from: j$.util.stream.s0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1315s0 extends AbstractC1320t0 implements InterfaceC1283l2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
    }

    @Override // j$.util.stream.AbstractC1320t0, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        if (this.f13350a) {
            return;
        }
        DoublePredicate doublePredicate = null;
        doublePredicate.test(d7);
        throw null;
    }
}
