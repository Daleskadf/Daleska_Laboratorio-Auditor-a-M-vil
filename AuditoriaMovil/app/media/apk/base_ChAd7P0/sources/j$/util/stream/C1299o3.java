package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.o3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1299o3 implements InterfaceC1288m2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f13325b;

    public /* synthetic */ C1299o3(IntConsumer intConsumer, int i7) {
        this.f13324a = i7;
        this.f13325b = intConsumer;
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
        switch (this.f13324a) {
            case 0:
                AbstractC1340x0.a();
                throw null;
            default:
                AbstractC1340x0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1288m2, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        switch (this.f13324a) {
            case 0:
                ((T2) this.f13325b).accept(i7);
                return;
            default:
                this.f13325b.accept(i7);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j) {
        switch (this.f13324a) {
            case 0:
                AbstractC1340x0.l();
                throw null;
            default:
                AbstractC1340x0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f13324a) {
            case 0:
                m((Integer) obj);
                return;
            default:
                m((Integer) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f13324a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f13324a) {
            case 0:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
            default:
                return j$.com.android.tools.r8.a.d(this, intConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
        int i7 = this.f13324a;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void l(long j) {
        int i7 = this.f13324a;
    }

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        switch (this.f13324a) {
            case 0:
                AbstractC1340x0.g(this, num);
                return;
            default:
                AbstractC1340x0.g(this, num);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        switch (this.f13324a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
