package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1338w3 extends AbstractC1343x3 implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1338w3(Spliterator spliterator, long j, long j8) {
        super(spliterator, j, j8, 0L, Math.min(spliterator.estimateSize(), j8));
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.Spliterator, j$.util.stream.x3] */
    @Override // j$.util.stream.AbstractC1343x3
    protected final Spliterator a(Spliterator spliterator, long j, long j8, long j9, long j10) {
        return new AbstractC1343x3(spliterator, j, j8, j9, j10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j;
        Objects.requireNonNull(consumer);
        long j8 = this.f13392e;
        long j9 = this.f13388a;
        if (j9 >= j8) {
            return false;
        }
        while (true) {
            j = this.f13391d;
            if (j9 <= j) {
                break;
            }
            this.f13390c.tryAdvance(new C1233b2(4));
            this.f13391d++;
        }
        if (j >= this.f13392e) {
            return false;
        }
        this.f13391d = j + 1;
        return this.f13390c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j = this.f13392e;
        long j8 = this.f13388a;
        if (j8 >= j) {
            return;
        }
        long j9 = this.f13391d;
        if (j9 >= j) {
            return;
        }
        if (j9 >= j8 && this.f13390c.estimateSize() + j9 <= this.f13389b) {
            this.f13390c.forEachRemaining(consumer);
            this.f13391d = this.f13392e;
            return;
        }
        while (j8 > this.f13391d) {
            this.f13390c.tryAdvance(new C1233b2(5));
            this.f13391d++;
        }
        while (this.f13391d < this.f13392e) {
            this.f13390c.tryAdvance(consumer);
            this.f13391d++;
        }
    }
}
