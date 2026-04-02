package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.t0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1320t0 implements InterfaceC1298o2 {

    /* renamed from: a  reason: collision with root package name */
    boolean f13350a;

    /* renamed from: b  reason: collision with root package name */
    boolean f13351b;

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

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1320t0(EnumC1325u0 enumC1325u0) {
        boolean z7;
        z7 = enumC1325u0.f13359b;
        this.f13351b = !z7;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final boolean n() {
        return this.f13350a;
    }
}
