package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.stream.l1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1282l1 extends AbstractC1292n1 implements j$.util.f0 {
    @Override // j$.util.f0
    public final boolean tryAdvance(Object obj) {
        I0 i02;
        if (c()) {
            boolean tryAdvance = ((j$.util.f0) this.f13316d).tryAdvance(obj);
            if (!tryAdvance) {
                if (this.f13315c == null && (i02 = (I0) AbstractC1292n1.a(this.f13317e)) != null) {
                    j$.util.f0 spliterator = i02.spliterator();
                    this.f13316d = spliterator;
                    return spliterator.tryAdvance(obj);
                }
                this.f13313a = null;
            }
            return tryAdvance;
        }
        return false;
    }

    @Override // j$.util.f0
    public final void forEachRemaining(Object obj) {
        if (this.f13313a == null) {
            return;
        }
        if (this.f13316d == null) {
            Spliterator spliterator = this.f13315c;
            if (spliterator == null) {
                ArrayDeque b5 = b();
                while (true) {
                    I0 i02 = (I0) AbstractC1292n1.a(b5);
                    if (i02 != null) {
                        i02.e(obj);
                    } else {
                        this.f13313a = null;
                        return;
                    }
                }
            } else {
                ((j$.util.f0) spliterator).forEachRemaining(obj);
            }
        } else {
            do {
            } while (tryAdvance(obj));
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }
}
