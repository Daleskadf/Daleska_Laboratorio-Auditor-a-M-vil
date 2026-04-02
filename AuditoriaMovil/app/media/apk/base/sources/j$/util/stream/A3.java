package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
final class A3 extends B3 implements j$.util.c0, LongConsumer {
    long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.h(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.E3, j$.util.Spliterator] */
    @Override // j$.util.stream.E3
    protected final Spliterator c(Spliterator spliterator) {
        return new E3((j$.util.c0) spliterator, this);
    }

    @Override // j$.util.stream.B3
    protected final void e(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    @Override // j$.util.stream.B3
    protected final AbstractC1269i3 h(int i7) {
        return new C1264h3(i7);
    }
}
