package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m0 implements W {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f12996a;

    /* renamed from: b  reason: collision with root package name */
    private int f12997b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12998c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12999d;

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

    public m0(double[] dArr, int i7, int i8, int i9) {
        this.f12996a = dArr;
        this.f12997b = i7;
        this.f12998c = i8;
        this.f12999d = i9 | 16448;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final W trySplit() {
        int i7 = this.f12997b;
        int i8 = (this.f12998c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f12997b = i8;
        return new m0(this.f12996a, i7, i8, this.f12999d);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i7;
        doubleConsumer.getClass();
        double[] dArr = this.f12996a;
        int length = dArr.length;
        int i8 = this.f12998c;
        if (length < i8 || (i7 = this.f12997b) < 0) {
            return;
        }
        this.f12997b = i8;
        if (i7 < i8) {
            do {
                doubleConsumer.accept(dArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i7 = this.f12997b;
        if (i7 < 0 || i7 >= this.f12998c) {
            return false;
        }
        this.f12997b = i7 + 1;
        doubleConsumer.accept(this.f12996a[i7]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12998c - this.f12997b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f12999d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC1210d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
