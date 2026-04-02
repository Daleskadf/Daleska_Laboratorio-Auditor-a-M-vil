package j$.util.stream;

import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1336w1 extends Y2 implements J0, B0 {
    @Override // j$.util.stream.B0
    public final J0 a() {
        return this;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(double d7) {
        AbstractC1340x0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(int i7) {
        AbstractC1340x0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC1340x0.l();
        throw null;
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.w(this, j, j8, intFunction);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void k() {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public final J0 b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final void i(Object[] objArr, int i7) {
        long j = i7;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f13235c == 0) {
            System.arraycopy(this.f13186e, 0, objArr, i7, this.f13234b);
            return;
        }
        for (int i8 = 0; i8 < this.f13235c; i8++) {
            Object[] objArr2 = this.f[i8];
            System.arraycopy(objArr2, 0, objArr, i7, objArr2.length);
            i7 += this.f[i8].length;
        }
        int i9 = this.f13234b;
        if (i9 > 0) {
            System.arraycopy(this.f13186e, 0, objArr, i7, i9);
        }
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

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        clear();
        s(j);
    }
}
