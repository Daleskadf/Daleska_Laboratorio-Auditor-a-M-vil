package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.j2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1273j2 implements InterfaceC1293n2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC1298o2 f13287a;

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

    public AbstractC1273j2(InterfaceC1298o2 interfaceC1298o2) {
        this.f13287a = (InterfaceC1298o2) Objects.requireNonNull(interfaceC1298o2);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        this.f13287a.l(j);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void k() {
        this.f13287a.k();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public boolean n() {
        return this.f13287a.n();
    }
}
