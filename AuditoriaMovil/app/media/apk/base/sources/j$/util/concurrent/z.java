package j$.util.concurrent;

import j$.util.AbstractC1210d;
import j$.util.Z;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
final class z implements Z {

    /* renamed from: a  reason: collision with root package name */
    long f12945a;

    /* renamed from: b  reason: collision with root package name */
    final long f12946b;

    /* renamed from: c  reason: collision with root package name */
    final int f12947c;

    /* renamed from: d  reason: collision with root package name */
    final int f12948d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.b(this, consumer);
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
        return AbstractC1210d.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(long j, long j8, int i7, int i8) {
        this.f12945a = j;
        this.f12946b = j8;
        this.f12947c = i7;
        this.f12948d = i8;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a */
    public final z trySplit() {
        long j = this.f12945a;
        long j8 = (this.f12946b + j) >>> 1;
        if (j8 <= j) {
            return null;
        }
        this.f12945a = j8;
        return new z(j, j8, this.f12947c, this.f12948d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12946b - this.f12945a;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f12945a;
        if (j < this.f12946b) {
            intConsumer.accept(ThreadLocalRandom.current().d(this.f12947c, this.f12948d));
            this.f12945a = j + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j = this.f12945a;
        long j8 = this.f12946b;
        if (j < j8) {
            this.f12945a = j8;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.d(this.f12947c, this.f12948d));
                j++;
            } while (j < j8);
        }
    }
}
