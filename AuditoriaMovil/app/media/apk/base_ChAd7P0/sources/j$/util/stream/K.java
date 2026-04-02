package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
abstract class K implements J3 {

    /* renamed from: a  reason: collision with root package name */
    boolean f13080a;

    /* renamed from: b  reason: collision with root package name */
    Object f13081b;

    @Override // j$.util.stream.InterfaceC1298o2
    public /* synthetic */ void accept(double d7) {
        AbstractC1340x0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public /* synthetic */ void accept(int i7) {
        AbstractC1340x0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
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
    public final /* synthetic */ void l(long j) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void p(Object obj) {
        if (this.f13080a) {
            return;
        }
        this.f13080a = true;
        this.f13081b = obj;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return this.f13080a;
    }
}
