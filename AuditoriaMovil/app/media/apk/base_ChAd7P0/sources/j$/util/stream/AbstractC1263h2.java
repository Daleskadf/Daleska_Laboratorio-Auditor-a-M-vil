package j$.util.stream;

import j$.util.Objects;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.h2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1263h2 implements InterfaceC1283l2 {

    /* renamed from: a  reason: collision with root package name */
    protected final InterfaceC1298o2 f13277a;

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

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
    }

    public AbstractC1263h2(InterfaceC1298o2 interfaceC1298o2) {
        this.f13277a = (InterfaceC1298o2) Objects.requireNonNull(interfaceC1298o2);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void l(long j) {
        this.f13277a.l(j);
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public void k() {
        this.f13277a.k();
    }

    @Override // j$.util.stream.InterfaceC1298o2
    public boolean n() {
        return this.f13277a.n();
    }
}
