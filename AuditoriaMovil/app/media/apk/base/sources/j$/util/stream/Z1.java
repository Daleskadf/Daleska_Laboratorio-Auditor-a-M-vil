package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
abstract class Z1 extends U1 implements T1 {

    /* renamed from: b  reason: collision with root package name */
    long f13187b;

    public /* synthetic */ void accept(double d7) {
        AbstractC1340x0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i7) {
        AbstractC1340x0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
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

    @Override // j$.util.stream.InterfaceC1298o2
    public final void l(long j) {
        this.f13187b = 0L;
    }
}
