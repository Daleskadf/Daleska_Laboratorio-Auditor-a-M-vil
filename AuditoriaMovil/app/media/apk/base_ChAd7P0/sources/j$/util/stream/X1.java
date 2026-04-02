package j$.util.stream;

import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
final class X1 extends Z1 implements InterfaceC1293n2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1293n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC1340x0.i(this, l8);
    }

    @Override // j$.util.stream.U1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f13187b);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        this.f13187b += ((Z1) t1).f13187b;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f13187b++;
    }
}
