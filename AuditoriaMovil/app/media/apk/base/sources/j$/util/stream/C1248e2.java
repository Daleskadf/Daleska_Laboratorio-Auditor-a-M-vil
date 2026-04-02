package j$.util.stream;

import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.e2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1248e2 extends AbstractC1258g2 {
    @Override // j$.util.stream.InterfaceC1260h
    public final InterfaceC1260h unordered() {
        return !L() ? this : new AbstractC1253f2(this, EnumC1239c3.f13223r, 1);
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

    @Override // j$.util.stream.AbstractC1258g2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            T().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC1258g2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!isParallel()) {
            T().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }
}
