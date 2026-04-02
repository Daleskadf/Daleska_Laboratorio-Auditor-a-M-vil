package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
final class C1 implements T1, InterfaceC1283l2 {

    /* renamed from: a  reason: collision with root package name */
    private double f13025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f13026b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f13027c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1(double d7, DoubleBinaryOperator doubleBinaryOperator) {
        this.f13026b = d7;
        this.f13027c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        accept(((C1) t1).f13025a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13025a = this.f13026b;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        this.f13025a = this.f13027c.applyAsDouble(this.f13025a, d7);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f13025a);
    }
}
