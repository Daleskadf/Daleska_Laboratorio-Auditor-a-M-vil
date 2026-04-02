package j$.util.stream;

import java.util.function.IntFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.d1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1242d1 implements J0 {
    @Override // j$.util.stream.J0
    public final long count() {
        return 0L;
    }

    public final void e(Object obj) {
    }

    @Override // j$.util.stream.J0
    public /* synthetic */ J0 h(long j, long j8, IntFunction intFunction) {
        return AbstractC1340x0.w(this, j, j8, intFunction);
    }

    @Override // j$.util.stream.J0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.J0
    public J0 b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    public final void r(int i7, Object obj) {
    }
}
