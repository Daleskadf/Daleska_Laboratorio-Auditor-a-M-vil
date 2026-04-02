package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* loaded from: classes2.dex */
final class Q2 extends W2 implements j$.util.W {

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ R2 f13142g;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.f(this, consumer);
    }

    @Override // j$.util.stream.W2
    final void a(int i7, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i7]);
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 b(Object obj, int i7, int i8) {
        return Spliterators.j((double[]) obj, i7, i8 + i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q2(R2 r22, int i7, int i8, int i9, int i10) {
        super(r22, i7, i8, i9, i10);
        this.f13142g = r22;
    }

    @Override // j$.util.stream.W2
    final j$.util.f0 c(int i7, int i8, int i9, int i10) {
        return new Q2(this.f13142g, i7, i8, i9, i10);
    }
}
