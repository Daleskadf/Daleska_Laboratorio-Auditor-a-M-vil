package j$.util.concurrent;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j extends p implements Spliterator {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12911i;
    long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i7, int i8, int i9, long j, int i10) {
        super(lVarArr, i7, i8, i9);
        this.f12911i = i10;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f12911i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f12911i) {
            case 0:
                return AbstractC1210d.d(this);
            default:
                return AbstractC1210d.d(this);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        switch (this.f12911i) {
            case 0:
                return AbstractC1210d.e(this, i7);
            default:
                return AbstractC1210d.e(this, i7);
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f12911i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f12911i) {
            case 0:
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
                return new j(lVarArr, this.f12929h, i9, i8, j, 0);
            default:
                int i10 = this.f;
                int i11 = this.f12928g;
                int i12 = (i10 + i11) >>> 1;
                if (i12 <= i10) {
                    return null;
                }
                l[] lVarArr2 = this.f12923a;
                this.f12928g = i12;
                long j8 = this.j >>> 1;
                this.j = j8;
                return new j(lVarArr2, this.f12929h, i12, i11, j8, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f12911i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l a7 = a();
                    if (a7 == null) {
                        return;
                    }
                    consumer.accept(a7.f12916b);
                }
            default:
                consumer.getClass();
                while (true) {
                    l a8 = a();
                    if (a8 == null) {
                        return;
                    }
                    consumer.accept(a8.f12917c);
                }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f12911i) {
            case 0:
                consumer.getClass();
                l a7 = a();
                if (a7 == null) {
                    return false;
                }
                consumer.accept(a7.f12916b);
                return true;
            default:
                consumer.getClass();
                l a8 = a();
                if (a8 == null) {
                    return false;
                }
                consumer.accept(a8.f12917c);
                return true;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f12911i) {
            case 0:
                return this.j;
            default:
                return this.j;
        }
    }
}
