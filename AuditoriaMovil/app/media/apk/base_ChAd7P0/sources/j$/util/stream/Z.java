package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Z extends AbstractC1231b0 {
    @Override // j$.util.stream.InterfaceC1260h
    public final InterfaceC1260h unordered() {
        return !L() ? this : new C1329v(this, EnumC1239c3.f13223r, 1);
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
    }

    @Override // j$.util.stream.AbstractC1230b
    final boolean Q() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.stream.AbstractC1230b
    public final InterfaceC1298o2 R(int i7, InterfaceC1298o2 interfaceC1298o2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC1231b0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        j$.util.Z Z6;
        if (!isParallel()) {
            Z6 = AbstractC1231b0.Z(T());
            Z6.forEachRemaining(intConsumer);
            return;
        }
        super.forEach(intConsumer);
    }

    @Override // j$.util.stream.AbstractC1231b0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        j$.util.Z Z6;
        if (!isParallel()) {
            Z6 = AbstractC1231b0.Z(T());
            Z6.forEachRemaining(intConsumer);
            return;
        }
        super.forEachOrdered(intConsumer);
    }
}
