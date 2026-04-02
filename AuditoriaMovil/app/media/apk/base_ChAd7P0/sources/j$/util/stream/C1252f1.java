package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1252f1 implements F0 {

    /* renamed from: a  reason: collision with root package name */
    final int[] f13267a;

    /* renamed from: b  reason: collision with root package name */
    int f13268b;

    @Override // j$.util.stream.J0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC1340x0.r(this, consumer);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.u(this, j, j8);
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
        AbstractC1340x0.o(this, (Integer[]) objArr, i7);
    }

    @Override // j$.util.stream.I0
    public final void e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i7 = 0; i7 < this.f13268b; i7++) {
            intConsumer.accept(this.f13267a[i7]);
        }
    }

    @Override // j$.util.stream.I0
    public final void r(int i7, Object obj) {
        int i8 = this.f13268b;
        System.arraycopy(this.f13267a, 0, (int[]) obj, i7, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1252f1(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13267a = new int[(int) j];
        this.f13268b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1252f1(int[] iArr) {
        this.f13267a = iArr;
        this.f13268b = iArr.length;
    }

    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Spliterators.k(this.f13267a, 0, this.f13268b);
    }

    @Override // j$.util.stream.I0, j$.util.stream.J0
    public final j$.util.f0 spliterator() {
        return Spliterators.k(this.f13267a, 0, this.f13268b);
    }

    @Override // j$.util.stream.I0
    public final Object d() {
        int[] iArr = this.f13267a;
        int length = iArr.length;
        int i7 = this.f13268b;
        return length == i7 ? iArr : Arrays.copyOf(iArr, i7);
    }

    @Override // j$.util.stream.J0
    public final long count() {
        return this.f13268b;
    }

    public String toString() {
        int[] iArr = this.f13267a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f13268b), Arrays.toString(iArr));
    }
}
