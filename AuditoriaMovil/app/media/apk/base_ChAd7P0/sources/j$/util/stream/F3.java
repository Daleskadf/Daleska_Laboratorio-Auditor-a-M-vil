package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class F3 implements InterfaceC1298o2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Consumer f13053b;

    public /* synthetic */ F3(Consumer consumer, int i7) {
        this.f13052a = i7;
        this.f13053b = consumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(double d7) {
        switch (this.f13052a) {
            case 0:
                AbstractC1340x0.a();
                throw null;
            default:
                AbstractC1340x0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(int i7) {
        switch (this.f13052a) {
            case 0:
                AbstractC1340x0.k();
                throw null;
            default:
                AbstractC1340x0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (this.f13052a) {
            case 0:
                AbstractC1340x0.l();
                throw null;
            default:
                AbstractC1340x0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f13052a) {
            case 0:
                ((Y2) this.f13053b).accept(obj);
                return;
            default:
                this.f13053b.accept(obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f13052a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
        int i7 = this.f13052a;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void l(long j) {
        int i7 = this.f13052a;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        switch (this.f13052a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
