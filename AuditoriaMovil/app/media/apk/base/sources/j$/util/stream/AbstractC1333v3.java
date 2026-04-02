package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1333v3 extends AbstractC1343x3 implements j$.util.f0 {
    protected abstract Object b();

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
    public AbstractC1333v3(j$.util.f0 f0Var, long j, long j8) {
        super(f0Var, j, j8, 0L, Math.min(f0Var.estimateSize(), j8));
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        long j;
        Objects.requireNonNull(obj);
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
            ((j$.util.f0) this.f13390c).tryAdvance(b());
            this.f13391d++;
        }
        if (j >= this.f13392e) {
            return false;
        }
        this.f13391d = j + 1;
        return ((j$.util.f0) this.f13390c).tryAdvance(obj);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        long j = this.f13392e;
        long j8 = this.f13388a;
        if (j8 >= j) {
            return;
        }
        long j9 = this.f13391d;
        if (j9 >= j) {
            return;
        }
        if (j9 >= j8 && ((j$.util.f0) this.f13390c).estimateSize() + j9 <= this.f13389b) {
            ((j$.util.f0) this.f13390c).forEachRemaining(obj);
            this.f13391d = this.f13392e;
            return;
        }
        while (j8 > this.f13391d) {
            ((j$.util.f0) this.f13390c).tryAdvance(b());
            this.f13391d++;
        }
        while (this.f13391d < this.f13392e) {
            ((j$.util.f0) this.f13390c).tryAdvance(obj);
            this.f13391d++;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
