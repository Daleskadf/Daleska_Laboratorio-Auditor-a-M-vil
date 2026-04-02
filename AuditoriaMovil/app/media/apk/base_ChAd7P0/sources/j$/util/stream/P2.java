package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Comparator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
final class P2 implements Spliterator {

    /* renamed from: a  reason: collision with root package name */
    int f13129a;

    /* renamed from: b  reason: collision with root package name */
    final int f13130b;

    /* renamed from: c  reason: collision with root package name */
    int f13131c;

    /* renamed from: d  reason: collision with root package name */
    final int f13132d;

    /* renamed from: e  reason: collision with root package name */
    Object[] f13133e;
    final /* synthetic */ Y2 f;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public P2(Y2 y2, int i7, int i8, int i9, int i10) {
        this.f = y2;
        this.f13129a = i7;
        this.f13130b = i8;
        this.f13131c = i9;
        this.f13132d = i10;
        Object[][] objArr = y2.f;
        this.f13133e = objArr == null ? y2.f13186e : objArr[i7];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i7 = this.f13129a;
        int i8 = this.f13132d;
        int i9 = this.f13130b;
        if (i7 == i9) {
            return i8 - this.f13131c;
        }
        long[] jArr = this.f.f13236d;
        return ((jArr[i9] + i8) - jArr[i7]) - this.f13131c;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i7 = this.f13129a;
        int i8 = this.f13130b;
        if (i7 < i8 || (i7 == i8 && this.f13131c < this.f13132d)) {
            Object[] objArr = this.f13133e;
            int i9 = this.f13131c;
            this.f13131c = i9 + 1;
            consumer.accept(objArr[i9]);
            if (this.f13131c == this.f13133e.length) {
                this.f13131c = 0;
                int i10 = this.f13129a + 1;
                this.f13129a = i10;
                Object[][] objArr2 = this.f.f;
                if (objArr2 != null && i10 <= i8) {
                    this.f13133e = objArr2[i10];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Y2 y2;
        Objects.requireNonNull(consumer);
        int i7 = this.f13129a;
        int i8 = this.f13132d;
        int i9 = this.f13130b;
        if (i7 < i9 || (i7 == i9 && this.f13131c < i8)) {
            int i10 = this.f13131c;
            while (true) {
                y2 = this.f;
                if (i7 >= i9) {
                    break;
                }
                Object[] objArr = y2.f[i7];
                while (i10 < objArr.length) {
                    consumer.accept(objArr[i10]);
                    i10++;
                }
                i7++;
                i10 = 0;
            }
            Object[] objArr2 = this.f13129a == i9 ? this.f13133e : y2.f[i9];
            while (i10 < i8) {
                consumer.accept(objArr2[i10]);
                i10++;
            }
            this.f13129a = i9;
            this.f13131c = i8;
        }
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i7 = this.f13129a;
        int i8 = this.f13130b;
        if (i7 < i8) {
            int i9 = i8 - 1;
            int i10 = this.f13131c;
            Y2 y2 = this.f;
            P2 p22 = new P2(y2, i7, i9, i10, y2.f[i9].length);
            this.f13129a = i8;
            this.f13131c = 0;
            this.f13133e = y2.f[i8];
            return p22;
        } else if (i7 == i8) {
            int i11 = this.f13131c;
            int i12 = (this.f13132d - i11) / 2;
            if (i12 == 0) {
                return null;
            }
            Spliterator m7 = Spliterators.m(this.f13133e, i11, i11 + i12);
            this.f13131c += i12;
            return m7;
        } else {
            return null;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
