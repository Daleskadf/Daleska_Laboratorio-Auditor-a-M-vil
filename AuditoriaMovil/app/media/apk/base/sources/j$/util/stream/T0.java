package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class T0 extends U0 implements H0 {
    @Override // j$.util.stream.J0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1340x0.s(this, consumer);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.v(this, j, j8);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void i(Object[] objArr, int i7) {
        AbstractC1340x0.p(this, (Long[]) objArr, i7);
    }

    @Override // j$.util.stream.I0
    public final Object c(int i7) {
        return new long[i7];
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
