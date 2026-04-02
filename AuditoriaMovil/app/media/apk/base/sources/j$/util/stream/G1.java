package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
/* loaded from: classes2.dex */
final class G1 extends U1 implements T1, InterfaceC1283l2 {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Supplier f13057b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ObjDoubleConsumer f13058c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C1305q f13059d;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        this.f13165a = this.f13059d.apply(this.f13165a, ((G1) t1).f13165a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13165a = this.f13057b.get();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        this.f13058c.accept(this.f13165a, d7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public G1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C1305q c1305q) {
        this.f13057b = supplier;
        this.f13058c = objDoubleConsumer;
        this.f13059d = c1305q;
    }
}
