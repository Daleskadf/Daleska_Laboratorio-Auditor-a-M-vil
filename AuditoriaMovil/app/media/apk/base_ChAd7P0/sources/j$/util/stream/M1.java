package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
/* loaded from: classes2.dex */
final class M1 extends U1 implements T1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f13100b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f13101c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BiConsumer f13102d;

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
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
        this.f13102d.accept(this.f13165a, ((M1) t1).f13165a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13165a = this.f13100b.get();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13101c.accept(this.f13165a, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M1(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        this.f13100b = supplier;
        this.f13101c = biConsumer;
        this.f13102d = biConsumer2;
    }
}
