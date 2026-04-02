package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* loaded from: classes2.dex */
final class Z0 extends AbstractC1242d1 implements D0 {
    @Override // j$.util.stream.J0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1340x0.q(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1242d1, j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.t(this, j, j8);
    }

    @Override // j$.util.stream.AbstractC1242d1, j$.util.stream.J0
    public final /* bridge */ /* synthetic */ J0 b(int i7) {
        b(i7);
        throw null;
    }

    @Override // j$.util.stream.AbstractC1242d1, j$.util.stream.J0
    public final I0 b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void i(Object[] objArr, int i7) {
        AbstractC1340x0.n(this, (Double[]) objArr, i7);
    }

    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.J0
    public final j$.util.f0 spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.I0
    public final Object d() {
        double[] dArr;
        dArr = AbstractC1340x0.f13386g;
        return dArr;
    }
}
