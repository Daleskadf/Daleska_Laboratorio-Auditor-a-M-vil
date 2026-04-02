package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1261h0 extends AbstractC1271j0 {
    @Override // j$.util.stream.InterfaceC1260h
    public final InterfaceC1260h unordered() {
        return !L() ? this : new C1334w(this, EnumC1239c3.f13223r, 4);
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC1286m0 parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC1230b, j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* bridge */ /* synthetic */ InterfaceC1286m0 sequential() {
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

    @Override // j$.util.stream.AbstractC1271j0, j$.util.stream.InterfaceC1286m0
    public final void forEach(LongConsumer longConsumer) {
        j$.util.c0 Z6;
        if (!isParallel()) {
            Z6 = AbstractC1271j0.Z(T());
            Z6.forEachRemaining(longConsumer);
            return;
        }
        super.forEach(longConsumer);
    }

    @Override // j$.util.stream.AbstractC1271j0, j$.util.stream.InterfaceC1286m0
    public final void forEachOrdered(LongConsumer longConsumer) {
        j$.util.c0 Z6;
        if (!isParallel()) {
            Z6 = AbstractC1271j0.Z(T());
            Z6.forEachRemaining(longConsumer);
            return;
        }
        super.forEachOrdered(longConsumer);
    }
}
