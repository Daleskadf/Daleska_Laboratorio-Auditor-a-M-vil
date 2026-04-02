package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class M extends Q implements InterfaceC1283l2 {

    /* renamed from: b  reason: collision with root package name */
    final DoubleConsumer f13097b;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC1283l2
    public final /* synthetic */ void p(Double d7) {
        AbstractC1340x0.e(this, d7);
    }

    @Override // j$.util.stream.I3
    public final Object b(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        abstractC1230b.V(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.I3
    public final /* bridge */ /* synthetic */ Object c(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        e(abstractC1230b, spliterator);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public M(DoubleConsumer doubleConsumer, boolean z7) {
        super(z7);
        this.f13097b = doubleConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC1298o2
    public final void accept(double d7) {
        this.f13097b.accept(d7);
    }
}
