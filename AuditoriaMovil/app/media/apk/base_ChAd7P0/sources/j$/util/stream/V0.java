package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class V0 extends L0 {
    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return new AbstractC1292n1(this);
    }

    @Override // j$.util.stream.J0
    public final void i(Object[] objArr, int i7) {
        Objects.requireNonNull(objArr);
        J0 j02 = this.f13088a;
        j02.i(objArr, i7);
        this.f13089b.i(objArr, i7 + ((int) j02.count()));
    }

    @Override // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        i(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.J0
    public final void forEach(Consumer consumer) {
        this.f13088a.forEach(consumer);
        this.f13089b.forEach(consumer);
    }

    @Override // j$.util.stream.J0
    public final J0 h(long j, long j8, IntFunction intFunction) {
        if (j == 0 && j8 == count()) {
            return this;
        }
        long count = this.f13088a.count();
        if (j >= count) {
            return this.f13089b.h(j - count, j8 - count, intFunction);
        } else if (j8 > count) {
            return AbstractC1340x0.I(EnumC1244d3.REFERENCE, this.f13088a.h(j, count, intFunction), this.f13089b.h(0L, j8 - count, intFunction));
        } else {
            return this.f13088a.h(j, j8, intFunction);
        }
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f13088a, this.f13089b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
