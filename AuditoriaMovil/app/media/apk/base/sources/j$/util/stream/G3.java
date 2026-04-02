package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
final class G3 extends AbstractC1249e3 {
    @Override // j$.util.stream.AbstractC1249e3
    final AbstractC1249e3 e(Spliterator spliterator) {
        return new AbstractC1249e3(this.f13251b, spliterator, this.f13250a);
    }

    @Override // j$.util.stream.AbstractC1249e3
    final void d() {
        Y2 y2 = new Y2();
        this.f13256h = y2;
        Objects.requireNonNull(y2);
        this.f13254e = this.f13251b.W(new F3(y2, 0));
        this.f = new C1225a(5, this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean a7 = a();
        if (a7) {
            Y2 y2 = (Y2) this.f13256h;
            long j = this.f13255g;
            if (y2.f13235c == 0) {
                if (j < y2.f13234b) {
                    obj = y2.f13186e[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j >= y2.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                for (int i7 = 0; i7 <= y2.f13235c; i7++) {
                    long j8 = y2.f13236d[i7];
                    Object[] objArr = y2.f[i7];
                    if (j < objArr.length + j8) {
                        obj = objArr[(int) (j - j8)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.accept(obj);
        }
        return a7;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f13256h == null && !this.f13257i) {
            Objects.requireNonNull(consumer);
            c();
            Objects.requireNonNull(consumer);
            F3 f32 = new F3(consumer, 1);
            this.f13251b.V(this.f13253d, f32);
            this.f13257i = true;
            return;
        }
        do {
        } while (tryAdvance(consumer));
    }
}
