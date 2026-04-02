package j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements c0 {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f12867a;

    private /* synthetic */ a0(Spliterator.OfLong ofLong) {
        this.f12867a = ofLong;
    }

    public static /* synthetic */ c0 a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof b0 ? ((b0) ofLong).f12870a : new a0(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f12867a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.f12867a;
        if (obj instanceof a0) {
            obj = ((a0) obj).f12867a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f12867a.estimateSize();
    }

    @Override // j$.util.f0
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f12867a.forEachRemaining((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f12867a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.c0
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f12867a.forEachRemaining(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f12867a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f12867a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return this.f12867a.hasCharacteristics(i7);
    }

    public final /* synthetic */ int hashCode() {
        return this.f12867a.hashCode();
    }

    @Override // j$.util.f0
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f12867a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f12867a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // j$.util.c0
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f12867a.tryAdvance(longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return g0.a(this.f12867a.trySplit());
    }

    @Override // j$.util.c0, j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ c0 trySplit() {
        return a(this.f12867a.trySplit());
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final /* synthetic */ f0 trySplit() {
        return d0.a(this.f12867a.trySplit());
    }
}
