package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* loaded from: classes2.dex */
final class S2 extends W2 implements j$.util.Z {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ T2 f13156g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.g(this, consumer);
    }

    @Override // j$.util.stream.W2
    final void a(int i7, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i7]);
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 b(Object obj, int i7, int i8) {
        return Spliterators.k((int[]) obj, i7, i8 + i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S2(T2 t22, int i7, int i8, int i9, int i10) {
        super(t22, i7, i8, i9, i10);
        this.f13156g = t22;
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 c(int i7, int i8, int i9, int i10) {
        return new S2(this.f13156g, i7, i8, i9, i10);
    }
}
