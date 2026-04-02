package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* loaded from: classes2.dex */
final class U2 extends W2 implements j$.util.c0 {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ V2 f13166g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.h(this, consumer);
    }

    @Override // j$.util.stream.W2
    final void a(int i7, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i7]);
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 b(Object obj, int i7, int i8) {
        return Spliterators.l((long[]) obj, i7, i8 + i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2(V2 v22, int i7, int i8, int i9, int i10) {
        super(v22, i7, i8, i9, i10);
        this.f13166g = v22;
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 c(int i7, int i8, int i9, int i10) {
        return new U2(this.f13166g, i7, i8, i9, i10);
    }
}
