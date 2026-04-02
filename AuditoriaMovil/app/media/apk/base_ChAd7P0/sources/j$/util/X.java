package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class X implements Z {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f12862a;

    private /* synthetic */ X(Spliterator.OfInt ofInt) {
        this.f12862a = ofInt;
    }

    public static /* synthetic */ Z a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof Y ? ((Y) ofInt).f12863a : new X(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12862a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.f12862a;
        if (obj instanceof X) {
            obj = ((X) obj).f12862a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12862a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12862a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12862a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f12862a.forEachRemaining(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12862a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12862a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f12862a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12862a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12862a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f12862a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // j$.util.Z
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f12862a.tryAdvance(intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f12862a.trySplit());
    }

    @Override // j$.util.Z, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ Z trySplit() {
        return a(this.f12862a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f12862a.trySplit());
    }
}
