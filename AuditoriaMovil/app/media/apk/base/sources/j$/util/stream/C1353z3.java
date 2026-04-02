package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* renamed from: j$.util.stream.z3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1353z3 extends B3 implements j$.util.Z, IntConsumer {
    int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.g(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.E3, j$.util.Spliterator] */
    @Override // j$.util.stream.E3
    protected final Spliterator c(Spliterator spliterator) {
        return new E3((j$.util.Z) spliterator, this);
    }

    @Override // j$.util.stream.B3
    protected final void e(Object obj) {
        ((IntConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f = i7;
    }

    @Override // j$.util.stream.B3
    protected final AbstractC1269i3 h(int i7) {
        return new C1259g3(i7);
    }
}
