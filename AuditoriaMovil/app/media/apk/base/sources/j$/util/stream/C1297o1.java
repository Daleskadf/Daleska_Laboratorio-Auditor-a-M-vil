package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.o1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1297o1 implements H0 {

    /* renamed from: a  reason: collision with root package name */
    final long[] f13322a;

    /* renamed from: b  reason: collision with root package name */
    int f13323b;

    @Override // j$.util.stream.J0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1340x0.s(this, consumer);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.v(this, j, j8);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC1340x0.m(this, intFunction);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public final /* bridge */ /* synthetic */ J0 b(int i7) {
        b(i7);
        throw null;
    }

    @Override // j$.util.stream.I0, j$.util.stream.J0
    public final I0 b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ void i(Object[] objArr, int i7) {
        AbstractC1340x0.p(this, (Long[]) objArr, i7);
    }

    @Override // j$.util.stream.I0
    public final void e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i7 = 0; i7 < this.f13323b; i7++) {
            longConsumer.accept(this.f13322a[i7]);
        }
    }

    @Override // j$.util.stream.I0
    public final void r(int i7, Object obj) {
        int i8 = this.f13323b;
        System.arraycopy(this.f13322a, 0, (long[]) obj, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1297o1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13322a = new long[(int) j];
        this.f13323b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1297o1(long[] jArr) {
        this.f13322a = jArr;
        this.f13323b = jArr.length;
    }

    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Spliterators.l(this.f13322a, 0, this.f13323b);
    }

    @Override // j$.util.stream.I0, j$.util.stream.J0
    public final j$.util.f0 spliterator() {
        return Spliterators.l(this.f13322a, 0, this.f13323b);
    }

    @Override // j$.util.stream.I0
    public final Object d() {
        long[] jArr = this.f13322a;
        int length = jArr.length;
        int i7 = this.f13323b;
        return length == i7 ? jArr : Arrays.copyOf(jArr, i7);
    }

    @Override // j$.util.stream.J0
    public final long count() {
        return this.f13323b;
    }

    public String toString() {
        long[] jArr = this.f13322a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f13323b), Arrays.toString(jArr));
    }
}
