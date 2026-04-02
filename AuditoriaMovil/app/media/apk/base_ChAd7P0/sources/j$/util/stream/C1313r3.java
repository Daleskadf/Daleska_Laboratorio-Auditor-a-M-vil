package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.r3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1313r3 extends AbstractC1249e3 implements j$.util.c0 {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.h(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1249e3
    final AbstractC1249e3 e(Spliterator spliterator) {
        return new AbstractC1249e3(this.f13251b, spliterator, this.f13250a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j$.util.stream.X2, j$.util.stream.d, java.util.function.LongConsumer] */
    @Override // j$.util.stream.AbstractC1249e3
    final void d() {
        ?? x22 = new X2();
        this.f13256h = x22;
        Objects.requireNonNull(x22);
        this.f13254e = this.f13251b.W(new C1309q3(x22, 0));
        this.f = new C1225a(4, this);
    }

    @Override // j$.util.stream.AbstractC1249e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1249e3, j$.util.Spliterator
    public final j$.util.c0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1249e3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.c0) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        long j;
        Objects.requireNonNull(longConsumer);
        boolean a7 = a();
        if (a7) {
            V2 v22 = (V2) this.f13256h;
            long j8 = this.f13255g;
            int u7 = v22.u(j8);
            if (v22.f13235c == 0 && u7 == 0) {
                j = ((long[]) v22.f13180e)[(int) j8];
            } else {
                j = ((long[][]) v22.f)[u7][(int) (j8 - v22.f13236d[u7])];
            }
            longConsumer.accept(j);
        }
        return a7;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.f13256h == null && !this.f13257i) {
            Objects.requireNonNull(longConsumer);
            c();
            Objects.requireNonNull(longConsumer);
            C1309q3 c1309q3 = new C1309q3(longConsumer, 1);
            this.f13251b.V(this.f13253d, c1309q3);
            this.f13257i = true;
            return;
        }
        do {
        } while (tryAdvance(longConsumer));
    }
}
