package j$.util.concurrent;

import j$.util.AbstractC1210d;
import j$.util.c0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
final class A implements c0 {

    /* renamed from: a  reason: collision with root package name */
    long f12874a;

    /* renamed from: b  reason: collision with root package name */
    final long f12875b;

    /* renamed from: c  reason: collision with root package name */
    final long f12876c;

    /* renamed from: d  reason: collision with root package name */
    final long f12877d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A(long j, long j8, long j9, long j10) {
        this.f12874a = j;
        this.f12875b = j8;
        this.f12876c = j9;
        this.f12877d = j10;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a */
    public final A trySplit() {
        long j = this.f12874a;
        long j8 = (this.f12875b + j) >>> 1;
        if (j8 <= j) {
            return null;
        }
        this.f12874a = j8;
        return new A(j, j8, this.f12876c, this.f12877d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12875b - this.f12874a;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f12874a;
        if (j < this.f12875b) {
            longConsumer.accept(ThreadLocalRandom.current().e(this.f12876c, this.f12877d));
            this.f12874a = j + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j = this.f12874a;
        long j8 = this.f12875b;
        if (j < j8) {
            this.f12874a = j8;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.e(this.f12876c, this.f12877d));
                j++;
            } while (j < j8);
        }
    }
}
