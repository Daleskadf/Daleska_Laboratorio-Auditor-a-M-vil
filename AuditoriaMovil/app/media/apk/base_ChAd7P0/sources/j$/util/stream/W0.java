package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class W0 implements D0 {

    /* renamed from: a  reason: collision with root package name */
    final double[] f13172a;

    /* renamed from: b  reason: collision with root package name */
    int f13173b;

    @Override // j$.util.stream.J0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1340x0.q(this, consumer);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.t(this, j, j8);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1340x0.m(this, intFunction);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public final /* bridge */ /* synthetic */ J0 b(int i7) {
        b(i7);
        throw null;
    }

    @Override // j$.util.stream.I0, j$.util.stream.J0
    public final I0 b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void i(Object[] objArr, int i7) {
        AbstractC1340x0.n(this, (Double[]) objArr, i7);
    }

    @Override // j$.util.stream.I0
    public final void e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i7 = 0; i7 < this.f13173b; i7++) {
            doubleConsumer.accept(this.f13172a[i7]);
        }
    }

    @Override // j$.util.stream.I0
    public final void r(int i7, Object obj) {
        int i8 = this.f13173b;
        System.arraycopy(this.f13172a, 0, (double[]) obj, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13172a = new double[(int) j];
        this.f13173b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W0(double[] dArr) {
        this.f13172a = dArr;
        this.f13173b = dArr.length;
    }

    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Spliterators.j(this.f13172a, 0, this.f13173b);
    }

    @Override // j$.util.stream.I0, j$.util.stream.J0
    public final j$.util.f0 spliterator() {
        return Spliterators.j(this.f13172a, 0, this.f13173b);
    }

    @Override // j$.util.stream.I0
    public final Object d() {
        double[] dArr = this.f13172a;
        int length = dArr.length;
        int i7 = this.f13173b;
        return length == i7 ? dArr : Arrays.copyOf(dArr, i7);
    }

    @Override // j$.util.stream.J0
    public final long count() {
        return this.f13173b;
    }

    public String toString() {
        double[] dArr = this.f13172a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f13173b), Arrays.toString(dArr));
    }
}
