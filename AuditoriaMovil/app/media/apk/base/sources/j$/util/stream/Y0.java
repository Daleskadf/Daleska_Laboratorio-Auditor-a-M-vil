package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Y0 extends R2 implements D0, InterfaceC1345y0 {
    @Override // j$.util.stream.InterfaceC1345y0, j$.util.stream.B0
    public final D0 a() {
        return this;
    }

    @Override // j$.util.stream.B0
    public final J0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(int i7) {
        AbstractC1340x0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC1340x0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.t(this, j, j8);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1340x0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
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

    @Override // j$.util.stream.X2, j$.util.stream.I0
    public final void e(Object obj) {
        super.e((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.X2, j$.util.stream.I0
    public final void r(int i7, Object obj) {
        super.r(i7, (double[]) obj);
    }

    @Override // j$.util.stream.R2, j$.util.stream.X2, java.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.R2, j$.util.stream.X2, java.lang.Iterable
    public final j$.util.f0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        clear();
        v(j);
    }

    @Override // j$.util.stream.X2, j$.util.stream.I0
    public final Object d() {
        return (double[]) super.d();
    }
}
