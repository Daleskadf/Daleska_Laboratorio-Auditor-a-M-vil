package j$.util.concurrent;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f extends p implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    final ConcurrentHashMap f12900i;
    long j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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
    public f(l[] lVarArr, int i7, int i8, int i9, long j, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i7, i8, i9);
        this.f12900i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i7 = this.f;
        int i8 = this.f12928g;
        int i9 = (i7 + i8) >>> 1;
        if (i9 <= i7) {
            return null;
        }
        l[] lVarArr = this.f12923a;
        this.f12928g = i9;
        long j = this.j >>> 1;
        this.j = j;
        return new f(lVarArr, this.f12929h, i9, i8, j, this.f12900i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a7 = a();
            if (a7 == null) {
                return;
            }
            consumer.accept(new k(a7.f12916b, a7.f12917c, this.f12900i));
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a7 = a();
        if (a7 == null) {
            return false;
        }
        consumer.accept(new k(a7.f12916b, a7.f12917c, this.f12900i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }
}
