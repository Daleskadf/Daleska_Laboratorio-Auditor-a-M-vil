package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;
/* renamed from: j$.util.stream.m1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1287m1 extends AbstractC1292n1 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        J0 a7;
        if (c()) {
            boolean tryAdvance = this.f13316d.tryAdvance(consumer);
            if (!tryAdvance) {
                if (this.f13315c == null && (a7 = AbstractC1292n1.a(this.f13317e)) != null) {
                    Spliterator spliterator = a7.spliterator();
                    this.f13316d = spliterator;
                    return spliterator.tryAdvance(consumer);
                }
                this.f13313a = null;
            }
            return tryAdvance;
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f13313a == null) {
            return;
        }
        if (this.f13316d == null) {
            Spliterator spliterator = this.f13315c;
            if (spliterator == null) {
                ArrayDeque b5 = b();
                while (true) {
                    J0 a7 = AbstractC1292n1.a(b5);
                    if (a7 != null) {
                        a7.forEach(consumer);
                    } else {
                        this.f13313a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            do {
            } while (tryAdvance(consumer));
        }
    }
}
