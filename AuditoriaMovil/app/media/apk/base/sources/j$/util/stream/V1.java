package j$.util.stream;

import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
final class V1 extends Z1 implements InterfaceC1283l2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
    }

    @Override // j$.util.stream.U1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f13187b);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        this.f13187b += ((Z1) t1).f13187b;
    }

    @Override // j$.util.stream.Z1, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        this.f13187b++;
    }
}
