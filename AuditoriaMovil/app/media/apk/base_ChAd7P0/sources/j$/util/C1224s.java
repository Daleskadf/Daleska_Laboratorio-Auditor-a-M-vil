package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1224s implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    final Spliterator f13009a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1224s(Spliterator spliterator) {
        this.f13009a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.f13009a.tryAdvance(new C1223q(consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.f13009a.forEachRemaining(new C1223q(consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.f13009a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new C1224s(trySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13009a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.f13009a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13009a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i7) {
        return this.f13009a.hasCharacteristics(i7);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f13009a.getComparator();
    }
}
