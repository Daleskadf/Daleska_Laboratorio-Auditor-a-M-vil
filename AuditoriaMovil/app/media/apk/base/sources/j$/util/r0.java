package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r0 implements Z {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f13005a;

    /* renamed from: b  reason: collision with root package name */
    private int f13006b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13007c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13008d;

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

    public r0(int[] iArr, int i7, int i8, int i9) {
        this.f13005a = iArr;
        this.f13006b = i7;
        this.f13007c = i8;
        this.f13008d = i9 | 16448;
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public final Z trySplit() {
        int i7 = this.f13006b;
        int i8 = (this.f13007c + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f13006b = i8;
        return new r0(this.f13005a, i7, i8, this.f13008d);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i7;
        intConsumer.getClass();
        int[] iArr = this.f13005a;
        int length = iArr.length;
        int i8 = this.f13007c;
        if (length < i8 || (i7 = this.f13006b) < 0) {
            return;
        }
        this.f13006b = i8;
        if (i7 < i8) {
            do {
                intConsumer.accept(iArr[i7]);
                i7++;
            } while (i7 < i8);
        }
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i7 = this.f13006b;
        if (i7 < 0 || i7 >= this.f13007c) {
            return false;
        }
        this.f13006b = i7 + 1;
        intConsumer.accept(this.f13005a[i7]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.f13007c - this.f13006b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.f13008d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (AbstractC1210d.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
