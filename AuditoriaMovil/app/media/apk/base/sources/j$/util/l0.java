package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
final class l0 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f12990a;

    /* renamed from: b  reason: collision with root package name */
    private int f12991b;

    /* renamed from: c  reason: collision with root package name */
    private final int f12992c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12993d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    public l0(Object[] objArr, int i7, int i8, int i9) {
        this.f12990a = objArr;
        this.f12991b = i7;
        this.f12992c = i8;
        this.f12993d = i9 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i7 = this.f12991b;
        int i8 = (this.f12992c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f12991b = i8;
        return new l0(this.f12990a, i7, i8, this.f12993d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i7;
        consumer.getClass();
        Object[] objArr = this.f12990a;
        int length = objArr.length;
        int i8 = this.f12992c;
        if (length < i8 || (i7 = this.f12991b) < 0) {
            return;
        }
        this.f12991b = i8;
        if (i7 < i8) {
            do {
                consumer.accept(objArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i7 = this.f12991b;
        if (i7 < 0 || i7 >= this.f12992c) {
            return false;
        }
        this.f12991b = i7 + 1;
        consumer.accept(this.f12990a[i7]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f12992c - this.f12991b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f12993d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC1210d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
