package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.i2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1268i2 implements InterfaceC1288m2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC1298o2 f13282a;

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

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC1340x0.g(this, num);
    }

    public AbstractC1268i2(InterfaceC1298o2 interfaceC1298o2) {
        this.f13282a = (InterfaceC1298o2) Objects.requireNonNull(interfaceC1298o2);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        this.f13282a.l(j);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void k() {
        this.f13282a.k();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public boolean n() {
        return this.f13282a.n();
    }
}
