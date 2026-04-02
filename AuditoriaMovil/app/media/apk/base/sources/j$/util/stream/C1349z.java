package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.z  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1349z extends B {
    @Override // j$.util.stream.InterfaceC1260h
    public final InterfaceC1260h unordered() {
        return !L() ? this : new C1324u(this, EnumC1239c3.f13223r, 1);
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ E sequential() {
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

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void forEach(DoubleConsumer doubleConsumer) {
        j$.util.W Z6;
        if (!isParallel()) {
            Z6 = B.Z(T());
            Z6.forEachRemaining(doubleConsumer);
            return;
        }
        super.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.B, j$.util.stream.E
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        j$.util.W Z6;
        if (!isParallel()) {
            Z6 = B.Z(T());
            Z6.forEachRemaining(doubleConsumer);
            return;
        }
        super.forEachOrdered(doubleConsumer);
    }
}
