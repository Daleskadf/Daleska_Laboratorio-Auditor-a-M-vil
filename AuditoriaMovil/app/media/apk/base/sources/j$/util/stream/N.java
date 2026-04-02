package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class N extends Q implements InterfaceC1288m2 {

    /* renamed from: b  reason: collision with root package name */
    final IntConsumer f13106b;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC1288m2
    public final /* synthetic */ void m(Integer num) {
        AbstractC1340x0.g(this, num);
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
    public N(IntConsumer intConsumer, boolean z7) {
        super(z7);
        this.f13106b = intConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC1298o2
    public final void accept(int i7) {
        this.f13106b.accept(i7);
    }
}
