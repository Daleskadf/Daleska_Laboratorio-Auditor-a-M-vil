package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
/* loaded from: classes2.dex */
final class Q1 extends U1 implements T1, InterfaceC1288m2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f13139b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjIntConsumer f13140c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1305q f13141d;

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(double d7) {
        AbstractC1340x0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        AbstractC1340x0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC1340x0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        this.f13165a = this.f13141d.apply(this.f13165a, ((Q1) t1).f13165a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13165a = this.f13139b.get();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        this.f13140c.accept(this.f13165a, i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q1(Supplier supplier, ObjIntConsumer objIntConsumer, C1305q c1305q) {
        this.f13139b = supplier;
        this.f13140c = objIntConsumer;
        this.f13141d = c1305q;
    }
}
