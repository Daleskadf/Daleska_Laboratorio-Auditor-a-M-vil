package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
final class J1 implements T1 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f13075a;

    /* renamed from: b  reason: collision with root package name */
    private Object f13076b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BinaryOperator f13077c;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public J1(BinaryOperator binaryOperator) {
        this.f13077c = binaryOperator;
    }

    @Override // j$.util.stream.T1
    public final void g(T1 t1) {
        J1 j12 = (J1) t1;
        if (j12.f13075a) {
            return;
        }
        accept(j12.f13076b);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13075a = true;
        this.f13076b = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.f13075a) {
            this.f13075a = false;
            this.f13076b = obj;
            return;
        }
        this.f13076b = this.f13077c.apply(this.f13076b, obj);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f13075a ? Optional.a() : Optional.b(this.f13076b);
    }
}
