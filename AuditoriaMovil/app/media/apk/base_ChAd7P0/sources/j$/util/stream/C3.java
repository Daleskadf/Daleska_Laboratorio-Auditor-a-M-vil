package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
final class C3 extends E3 implements Spliterator, Consumer {
    Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC1210d.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC1210d.e(this, i7);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != D3.NO_MORE && this.f13041a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C1274j3 c1274j3 = null;
        while (true) {
            D3 d7 = d();
            if (d7 == D3.NO_MORE) {
                return;
            }
            D3 d32 = D3.MAYBE_MORE;
            Spliterator spliterator = this.f13041a;
            if (d7 == d32) {
                int i7 = this.f13043c;
                if (c1274j3 == null) {
                    c1274j3 = new C1274j3(i7);
                } else {
                    c1274j3.f13296a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(c1274j3)) {
                    j++;
                    if (j >= i7) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long b5 = b(j);
                for (int i8 = 0; i8 < b5; i8++) {
                    consumer.accept(c1274j3.f13288b[i8]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.E3, j$.util.Spliterator] */
    @Override // j$.util.stream.E3
    protected final Spliterator c(Spliterator spliterator) {
        return new E3(spliterator, this);
    }
}
