package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class O extends Q implements InterfaceC1293n2 {

    /* renamed from: b  reason: collision with root package name */
    final LongConsumer f13117b;

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC1293n2
    public final /* synthetic */ void j(Long l8) {
        AbstractC1340x0.i(this, l8);
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
    public O(LongConsumer longConsumer, boolean z7) {
        super(z7);
        this.f13117b = longConsumer;
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC1298o2, j$.util.stream.InterfaceC1293n2, java.util.function.LongConsumer
    public final void accept(long j) {
        this.f13117b.accept(j);
    }
}
