package j$.util.stream;

import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
final class W1 extends Z1 implements InterfaceC1288m2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC1340x0.g(this, num);
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
    public final void accept(int i7) {
        this.f13187b++;
    }
}
