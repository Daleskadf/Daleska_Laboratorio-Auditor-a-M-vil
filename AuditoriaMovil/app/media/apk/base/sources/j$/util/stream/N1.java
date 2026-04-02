package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
final class N1 implements T1, InterfaceC1288m2 {

    /* renamed from: a  reason: collision with root package name */
    private int f13108a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f13109b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IntBinaryOperator f13110c;

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
    public N1(int i7, IntBinaryOperator intBinaryOperator) {
        this.f13109b = i7;
        this.f13110c = intBinaryOperator;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        accept(((N1) t1).f13108a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13108a = this.f13109b;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        this.f13108a = this.f13110c.applyAsInt(this.f13108a, i7);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f13108a);
    }
}
