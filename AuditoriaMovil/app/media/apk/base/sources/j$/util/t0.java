package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class t0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f13407a;

    /* renamed from: b  reason: collision with root package name */
    private int f13408b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13409c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13410d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.h(this, consumer);
    }

    public t0(long[] jArr, int i7, int i8, int i9) {
        this.f13407a = jArr;
        this.f13408b = i7;
        this.f13409c = i8;
        this.f13410d = i9 | 16448;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final c0 trySplit() {
        int i7 = this.f13408b;
        int i8 = (this.f13409c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f13408b = i8;
        return new t0(this.f13407a, i7, i8, this.f13410d);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i7;
        longConsumer.getClass();
        long[] jArr = this.f13407a;
        int length = jArr.length;
        int i8 = this.f13409c;
        if (length < i8 || (i7 = this.f13408b) < 0) {
            return;
        }
        this.f13408b = i8;
        if (i7 < i8) {
            do {
                longConsumer.accept(jArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i7 = this.f13408b;
        if (i7 < 0 || i7 >= this.f13409c) {
            return false;
        }
        this.f13408b = i7 + 1;
        longConsumer.accept(this.f13407a[i7]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13409c - this.f13408b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13410d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC1210d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
