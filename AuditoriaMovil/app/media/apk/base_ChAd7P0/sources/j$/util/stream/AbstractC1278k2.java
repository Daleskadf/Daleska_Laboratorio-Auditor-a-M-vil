package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.k2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1278k2 implements InterfaceC1298o2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC1298o2 f13295a;

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

    public AbstractC1278k2(InterfaceC1298o2 interfaceC1298o2) {
        this.f13295a = (InterfaceC1298o2) Objects.requireNonNull(interfaceC1298o2);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        this.f13295a.l(j);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void k() {
        this.f13295a.k();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public boolean n() {
        return this.f13295a.n();
    }
}
