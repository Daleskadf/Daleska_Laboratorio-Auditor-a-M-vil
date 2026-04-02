package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
final class E1 implements T1, InterfaceC1283l2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13037a;

    /* renamed from: b  reason: collision with root package name */
    private double f13038b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DoubleBinaryOperator f13039c;

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
    public E1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f13039c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        E1 e12 = (E1) t1;
        if (e12.f13037a) {
            return;
        }
        accept(e12.f13038b);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13037a = true;
        this.f13038b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        if (this.f13037a) {
            this.f13037a = false;
            this.f13038b = d7;
            return;
        }
        this.f13038b = this.f13039c.applyAsDouble(this.f13038b, d7);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f13037a ? j$.util.C.a() : j$.util.C.d(this.f13038b);
    }
}
