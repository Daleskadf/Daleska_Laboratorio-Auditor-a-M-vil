package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
final class R1 implements T1, InterfaceC1293n2 {

    /* renamed from: a  reason: collision with root package name */
    private long f13143a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f13144b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LongBinaryOperator f13145c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public R1(long j, LongBinaryOperator longBinaryOperator) {
        this.f13144b = j;
        this.f13145c = longBinaryOperator;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        accept(((R1) t1).f13143a);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13143a = this.f13144b;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f13143a = this.f13145c.applyAsLong(this.f13143a, j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f13143a);
    }
}
