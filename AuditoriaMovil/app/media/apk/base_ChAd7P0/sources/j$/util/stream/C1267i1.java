package j$.util.stream;

import j$.util.AbstractC1210d;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.i1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1267i1 extends AbstractC1282l1 implements j$.util.W {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.f(this, consumer);
    }
}
