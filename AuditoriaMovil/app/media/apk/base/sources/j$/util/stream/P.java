package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class P extends Q {

    /* renamed from: b  reason: collision with root package name */
    final Consumer f13124b;

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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
    public P(Consumer consumer, boolean z7) {
        super(z7);
        this.f13124b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f13124b.accept(obj);
    }
}
