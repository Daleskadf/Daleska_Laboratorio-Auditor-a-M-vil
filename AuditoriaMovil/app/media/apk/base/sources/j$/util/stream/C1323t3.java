package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.t3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1323t3 extends AbstractC1333v3 implements j$.util.Z {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.g(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [j$.util.Spliterator, j$.util.stream.x3] */
    @Override // j$.util.stream.AbstractC1343x3
    protected final Spliterator a(Spliterator spliterator, long j, long j8, long j9, long j10) {
        return new AbstractC1343x3((j$.util.Z) spliterator, j, j8, j9, j10);
    }

    @Override // j$.util.stream.AbstractC1333v3
    protected final Object b() {
        return new E0(1);
    }
}
