package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
abstract class B3 extends E3 implements j$.util.f0 {
    protected abstract void e(Object obj);

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    protected abstract AbstractC1269i3 h(int i7);

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != D3.NO_MORE && ((j$.util.f0) this.f13041a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC1269i3 abstractC1269i3 = null;
        while (true) {
            D3 d7 = d();
            if (d7 == D3.NO_MORE) {
                return;
            }
            D3 d32 = D3.MAYBE_MORE;
            Spliterator spliterator = this.f13041a;
            if (d7 == d32) {
                int i7 = this.f13043c;
                if (abstractC1269i3 == null) {
                    abstractC1269i3 = h(i7);
                } else {
                    abstractC1269i3.f13283b = 0;
                }
                long j = 0;
                while (((j$.util.f0) spliterator).tryAdvance(abstractC1269i3)) {
                    j++;
                    if (j >= i7) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                abstractC1269i3.b(obj, b(j));
            } else {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
                return;
            }
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
