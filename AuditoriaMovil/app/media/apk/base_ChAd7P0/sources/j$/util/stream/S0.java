package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class S0 extends U0 implements F0 {
    @Override // j$.util.stream.J0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1340x0.r(this, consumer);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.u(this, j, j8);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void i(Object[] objArr, int i7) {
        AbstractC1340x0.o(this, (Integer[]) objArr, i7);
    }

    @Override // j$.util.stream.I0
    public final Object c(int i7) {
        return new int[i7];
    }

    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return new AbstractC1292n1(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.f0, j$.util.stream.n1] */
    @Override // j$.util.stream.J0
    public final j$.util.f0 spliterator() {
        return new AbstractC1292n1(this);
    }
}
