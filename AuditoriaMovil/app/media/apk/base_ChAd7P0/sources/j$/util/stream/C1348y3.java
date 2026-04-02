package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.y3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1348y3 extends B3 implements j$.util.W, DoubleConsumer {
    double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.f(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.E3, j$.util.Spliterator] */
    @Override // j$.util.stream.E3
    protected final Spliterator c(Spliterator spliterator) {
        return new E3((j$.util.W) spliterator, this);
    }

    @Override // j$.util.stream.B3
    protected final void e(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f = d7;
    }

    @Override // j$.util.stream.B3
    protected final AbstractC1269i3 h(int i7) {
        return new C1254f3(i7);
    }
}
