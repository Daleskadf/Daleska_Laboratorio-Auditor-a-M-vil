package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1206a implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    private final java.util.List f12864a;

    /* renamed from: b  reason: collision with root package name */
    private int f12865b;

    /* renamed from: c  reason: collision with root package name */
    private int f12866c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1206a(java.util.List list) {
        this.f12864a = list;
        this.f12865b = 0;
        this.f12866c = -1;
    }

    private C1206a(C1206a c1206a, int i7, int i8) {
        this.f12864a = c1206a.f12864a;
        this.f12865b = i7;
        this.f12866c = i8;
    }

    private int a() {
        int i7 = this.f12866c;
        if (i7 < 0) {
            int size = this.f12864a.size();
            this.f12866c = size;
            return size;
        }
        return i7;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a7 = a();
        int i7 = this.f12865b;
        int i8 = (a7 + i7) >>> 1;
        if (i7 >= i8) {
            return null;
        }
        this.f12865b = i8;
        return new C1206a(this, i7, i8);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a7 = a();
        int i7 = this.f12865b;
        if (i7 < a7) {
            this.f12865b = i7 + 1;
            try {
                consumer.accept(this.f12864a.get(i7));
                return true;
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a7 = a();
        this.f12865b = a7;
        for (int i7 = this.f12865b; i7 < a7; i7++) {
            try {
                consumer.accept(this.f12864a.get(i7));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.f12865b;
    }
}
