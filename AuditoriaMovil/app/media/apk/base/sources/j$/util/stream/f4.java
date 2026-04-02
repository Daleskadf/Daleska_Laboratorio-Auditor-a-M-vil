package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;
/* loaded from: classes2.dex */
final class f4 extends j4 implements DoubleConsumer, j$.util.W {

    /* renamed from: e  reason: collision with root package name */
    double f13271e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(Spliterator spliterator, int i7) {
        super(spliterator);
        this.f = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(Spliterator spliterator, j4 j4Var, int i7) {
        super(spliterator, j4Var);
        this.f = i7;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.c(this, doubleConsumer);
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.f(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        do {
        } while (tryAdvance(doubleConsumer));
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d7) {
        this.f13292d = (this.f13292d + 1) & 63;
        this.f13271e = d7;
    }

    @Override // j$.util.stream.j4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new f4((j$.util.W) spliterator, this, 0);
            default:
                return new f4((j$.util.W) spliterator, this, 1);
        }
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.f0 trySplit() {
        switch (this.f) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.W
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        switch (this.f) {
            case 0:
                boolean z7 = this.f13291c;
                Spliterator spliterator = this.f13289a;
                if (z7) {
                    this.f13291c = false;
                    boolean tryAdvance = ((j$.util.W) spliterator).tryAdvance((DoubleConsumer) this);
                    if (tryAdvance && b()) {
                        DoublePredicate doublePredicate = null;
                        doublePredicate.test(this.f13271e);
                        throw null;
                    } else if (tryAdvance) {
                        doubleConsumer.accept(this.f13271e);
                        return tryAdvance;
                    } else {
                        return tryAdvance;
                    }
                }
                return ((j$.util.W) spliterator).tryAdvance(doubleConsumer);
            default:
                if (this.f13291c && b() && ((j$.util.W) this.f13289a).tryAdvance((DoubleConsumer) this)) {
                    DoublePredicate doublePredicate2 = null;
                    doublePredicate2.test(this.f13271e);
                    throw null;
                }
                this.f13291c = false;
                return false;
        }
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public j$.util.W trySplit() {
        switch (this.f) {
            case 1:
                if (this.f13290b.get()) {
                    return null;
                }
                return (j$.util.W) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return tryAdvance((DoubleConsumer) obj);
        }
    }
}
