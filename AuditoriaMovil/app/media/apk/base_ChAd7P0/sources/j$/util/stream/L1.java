package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
/* loaded from: classes2.dex */
final class L1 extends U1 implements T1 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f13091b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BiConsumer f13092c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f13093d;

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
        this.f13165a = this.f13093d.apply(this.f13165a, ((L1) t1).f13165a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13165a = this.f13091b.get();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13092c.accept(this.f13165a, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public L1(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.f13091b = supplier;
        this.f13092c = biConsumer;
        this.f13093d = binaryOperator;
    }
}
