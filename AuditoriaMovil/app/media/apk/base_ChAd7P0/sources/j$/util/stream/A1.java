package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
/* loaded from: classes2.dex */
final class A1 extends U1 implements T1, InterfaceC1293n2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f13016b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjLongConsumer f13017c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1305q f13018d;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC1293n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC1340x0.i(this, l8);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        this.f13165a = this.f13018d.apply(this.f13165a, ((A1) t1).f13165a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13165a = this.f13016b.get();
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f13017c.accept(this.f13165a, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public A1(Supplier supplier, ObjLongConsumer objLongConsumer, C1305q c1305q) {
        this.f13016b = supplier;
        this.f13017c = objLongConsumer;
        this.f13018d = c1305q;
    }
}
