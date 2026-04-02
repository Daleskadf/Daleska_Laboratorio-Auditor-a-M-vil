package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
final class P1 implements T1, InterfaceC1288m2 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13126a;

    /* renamed from: b  reason: collision with root package name */
    private int f13127b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f13128c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public P1(IntBinaryOperator intBinaryOperator) {
        this.f13128c = intBinaryOperator;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        P1 p1 = (P1) t1;
        if (p1.f13126a) {
            return;
        }
        accept(p1.f13127b);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13126a = true;
        this.f13127b = 0;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        if (this.f13126a) {
            this.f13126a = false;
            this.f13127b = i7;
            return;
        }
        this.f13127b = this.f13128c.applyAsInt(this.f13127b, i7);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f13126a ? j$.util.D.a() : j$.util.D.d(this.f13127b);
    }
}
