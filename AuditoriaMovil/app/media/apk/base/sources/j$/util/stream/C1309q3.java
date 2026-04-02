package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.q3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1309q3 implements InterfaceC1293n2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13336a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LongConsumer f13337b;

    public /* synthetic */ C1309q3(LongConsumer longConsumer, int i7) {
        this.f13336a = i7;
        this.f13337b = longConsumer;
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
        switch (this.f13336a) {
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
        switch (this.f13336a) {
            case 0:
                AbstractC1340x0.k();
                throw null;
            default:
                AbstractC1340x0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        switch (this.f13336a) {
            case 0:
                ((V2) this.f13337b).accept(j);
                return;
            default:
                this.f13337b.accept(j);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        switch (this.f13336a) {
            case 0:
                j((Long) obj);
                return;
            default:
                j((Long) obj);
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f13336a) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f13336a) {
            case 0:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
            default:
                return j$.com.android.tools.r8.a.e(this, longConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC1293n2
    public final /* synthetic */ void j(Long l8) {
        switch (this.f13336a) {
            case 0:
                AbstractC1340x0.i(this, l8);
                return;
            default:
                AbstractC1340x0.i(this, l8);
                return;
        }
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void k() {
        int i7 = this.f13336a;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ void l(long j) {
        int i7 = this.f13336a;
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public final /* synthetic */ boolean n() {
        switch (this.f13336a) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
