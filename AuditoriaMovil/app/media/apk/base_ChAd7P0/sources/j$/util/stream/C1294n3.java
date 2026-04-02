package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* renamed from: j$.util.stream.n3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1294n3 extends AbstractC1249e3 implements j$.util.W {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1249e3
    final AbstractC1249e3 e(Spliterator spliterator) {
        return new AbstractC1249e3(this.f13251b, spliterator, this.f13250a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, j$.util.stream.X2, java.util.function.DoubleConsumer, j$.util.stream.d] */
    @Override // j$.util.stream.AbstractC1249e3
    final void d() {
        ?? x22 = new X2();
        this.f13256h = x22;
        Objects.requireNonNull(x22);
        this.f13254e = this.f13251b.W(new C1289m3(x22, 0));
        this.f = new C1225a(2, this);
    }

    @Override // j$.util.stream.AbstractC1249e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1249e3, j$.util.Spliterator
    public final j$.util.W trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.stream.AbstractC1249e3, j$.util.Spliterator
    public final j$.util.f0 trySplit() {
        return (j$.util.W) super.trySplit();
    }

    @Override // j$.util.f0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        double d7;
        Objects.requireNonNull(doubleConsumer);
        boolean a7 = a();
        if (a7) {
            R2 r22 = (R2) this.f13256h;
            long j = this.f13255g;
            int u7 = r22.u(j);
            if (r22.f13235c == 0 && u7 == 0) {
                d7 = ((double[]) r22.f13180e)[(int) j];
            } else {
                d7 = ((double[][]) r22.f)[u7][(int) (j - r22.f13236d[u7])];
            }
            doubleConsumer.accept(d7);
        }
        return a7;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.f13256h == null && !this.f13257i) {
            Objects.requireNonNull(doubleConsumer);
            c();
            Objects.requireNonNull(doubleConsumer);
            C1289m3 c1289m3 = new C1289m3(doubleConsumer, 1);
            this.f13251b.V(this.f13253d, c1289m3);
            this.f13257i = true;
            return;
        }
        do {
        } while (tryAdvance(doubleConsumer));
    }
}
