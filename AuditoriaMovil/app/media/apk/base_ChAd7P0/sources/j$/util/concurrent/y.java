package j$.util.concurrent;

import j$.util.AbstractC1210d;
import j$.util.W;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
final class y implements W {

    /* renamed from: a  reason: collision with root package name */
    long f12941a;

    /* renamed from: b  reason: collision with root package name */
    final long f12942b;

    /* renamed from: c  reason: collision with root package name */
    final double f12943c;

    /* renamed from: d  reason: collision with root package name */
    final double f12944d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.a(this, consumer);
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
        return AbstractC1210d.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(long j, long j8, double d7, double d8) {
        this.f12941a = j;
        this.f12942b = j8;
        this.f12943c = d7;
        this.f12944d = d8;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    /* renamed from: a */
    public final y trySplit() {
        long j = this.f12941a;
        long j8 = (this.f12942b + j) >>> 1;
        if (j8 <= j) {
            return null;
        }
        this.f12941a = j8;
        return new y(j, j8, this.f12943c, this.f12944d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12942b - this.f12941a;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f12941a;
        if (j < this.f12942b) {
            doubleConsumer.accept(ThreadLocalRandom.current().c(this.f12943c, this.f12944d));
            this.f12941a = j + 1;
            return true;
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        long j = this.f12941a;
        long j8 = this.f12942b;
        if (j < j8) {
            this.f12941a = j8;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                doubleConsumer.accept(current.c(this.f12943c, this.f12944d));
                j++;
            } while (j < j8);
        }
    }
}
