package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class W2 implements j$.util.f0 {

    /* renamed from: a  reason: collision with root package name */
    int f13174a;

    /* renamed from: b  reason: collision with root package name */
    final int f13175b;

    /* renamed from: c  reason: collision with root package name */
    int f13176c;

    /* renamed from: d  reason: collision with root package name */
    final int f13177d;

    /* renamed from: e  reason: collision with root package name */
    Object f13178e;
    final /* synthetic */ X2 f;

    abstract void a(int i7, Object obj, Object obj2);

    abstract j$.util.f0 b(Object obj, int i7, int i8);

    abstract j$.util.f0 c(int i7, int i8, int i9, int i10);

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
    public W2(X2 x22, int i7, int i8, int i9, int i10) {
        this.f = x22;
        this.f13174a = i7;
        this.f13175b = i8;
        this.f13176c = i9;
        this.f13177d = i10;
        Object[] objArr = x22.f;
        this.f13178e = objArr == null ? x22.f13180e : objArr[i7];
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        int i7 = this.f13174a;
        int i8 = this.f13177d;
        int i9 = this.f13175b;
        if (i7 == i9) {
            return i8 - this.f13176c;
        }
        long[] jArr = this.f.f13236d;
        return ((jArr[i9] + i8) - jArr[i7]) - this.f13176c;
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i7 = this.f13174a;
        int i8 = this.f13175b;
        if (i7 < i8 || (i7 == i8 && this.f13176c < this.f13177d)) {
            Object obj2 = this.f13178e;
            int i9 = this.f13176c;
            this.f13176c = i9 + 1;
            a(i9, obj2, obj);
            int i10 = this.f13176c;
            Object obj3 = this.f13178e;
            X2 x22 = this.f;
            if (i10 == x22.t(obj3)) {
                this.f13176c = 0;
                int i11 = this.f13174a + 1;
                this.f13174a = i11;
                Object[] objArr = x22.f;
                if (objArr != null && i11 <= i8) {
                    this.f13178e = objArr[i11];
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        X2 x22;
        Objects.requireNonNull(obj);
        int i7 = this.f13174a;
        int i8 = this.f13177d;
        int i9 = this.f13175b;
        if (i7 < i9 || (i7 == i9 && this.f13176c < i8)) {
            int i10 = this.f13176c;
            while (true) {
                x22 = this.f;
                if (i7 >= i9) {
                    break;
                }
                Object obj2 = x22.f[i7];
                x22.s(obj2, i10, x22.t(obj2), obj);
                i7++;
                i10 = 0;
            }
            x22.s(this.f13174a == i9 ? this.f13178e : x22.f[i9], i10, i8, obj);
            this.f13174a = i9;
            this.f13176c = i8;
        }
    }

    @Override // j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        int i7 = this.f13174a;
        int i8 = this.f13175b;
        if (i7 < i8) {
            int i9 = i8 - 1;
            int i10 = this.f13176c;
            X2 x22 = this.f;
            j$.util.f0 c8 = c(i7, i9, i10, x22.t(x22.f[i9]));
            this.f13174a = i8;
            this.f13176c = 0;
            this.f13178e = x22.f[i8];
            return c8;
        } else if (i7 == i8) {
            int i11 = this.f13176c;
            int i12 = (this.f13177d - i11) / 2;
            if (i12 == 0) {
                return null;
            }
            j$.util.f0 b5 = b(this.f13178e, i11, i12);
            this.f13176c += i12;
            return b5;
        } else {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.Z trySplit() {
        return (j$.util.Z) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.c0 trySplit() {
        return (j$.util.c0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // j$.util.f0, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.W trySplit() {
        return (j$.util.W) trySplit();
    }
}
