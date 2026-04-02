package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class M0 implements J0 {

    /* renamed from: a  reason: collision with root package name */
    final Object[] f13098a;

    /* renamed from: b  reason: collision with root package name */
    int f13099b;

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.w(this, j, j8, intFunction);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public final J0 b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M0(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f13098a = (Object[]) intFunction.apply((int) j);
        this.f13099b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M0(Object[] objArr) {
        this.f13098a = objArr;
        this.f13099b = objArr.length;
    }

    @Override // j$.util.stream.J0
    public final Spliterator spliterator() {
        return Spliterators.m(this.f13098a, 0, this.f13099b);
    }

    @Override // j$.util.stream.J0
    public final void i(Object[] objArr, int i7) {
        System.arraycopy(this.f13098a, 0, objArr, i7, this.f13099b);
    }

    @Override // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction) {
        Object[] objArr = this.f13098a;
        if (objArr.length == this.f13099b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.J0
    public final long count() {
        return this.f13099b;
    }

    @Override // j$.util.stream.J0
    public final void forEach(Consumer consumer) {
        for (int i7 = 0; i7 < this.f13099b; i7++) {
            consumer.accept(this.f13098a[i7]);
        }
    }

    public String toString() {
        Object[] objArr = this.f13098a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f13099b), Arrays.toString(objArr));
    }
}
