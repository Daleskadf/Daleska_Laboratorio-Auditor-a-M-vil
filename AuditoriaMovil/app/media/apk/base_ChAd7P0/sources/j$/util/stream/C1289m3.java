package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.m3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1289m3 implements InterfaceC1283l2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13309a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f13310b;

    public /* synthetic */ C1289m3(DoubleConsumer doubleConsumer, int i7) {
        this.f13309a = i7;
        this.f13310b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC1283l2, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        switch (this.f13309a) {
            case 0:
                ((R2) this.f13310b).accept(d7);
                return;
            default:
                this.f13310b.accept(d7);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void accept(int i7) {
        switch (this.f13309a) {
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
        switch (this.f13309a) {
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
        switch (this.f13309a) {
            case 0:
                p((Double) obj);
                return;
            default:
                p((Double) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f13309a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f13309a) {
            case 0:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
        int i7 = this.f13309a;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void l(long j) {
        int i7 = this.f13309a;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        switch (this.f13309a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        switch (this.f13309a) {
            case 0:
                AbstractC1340x0.e(this, d7);
                return;
            default:
                AbstractC1340x0.e(this, d7);
                return;
        }
    }
}
