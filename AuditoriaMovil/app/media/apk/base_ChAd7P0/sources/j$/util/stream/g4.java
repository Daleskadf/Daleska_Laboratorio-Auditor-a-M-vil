package j$.util.stream;

import j$.util.AbstractC1210d;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
/* loaded from: classes2.dex */
final class g4 extends j4 implements IntConsumer, j$.util.Z {

    /* renamed from: e  reason: collision with root package name */
    int f13276e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, int i7) {
        super(spliterator);
        this.f = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4(Spliterator spliterator, j4 j4Var, int i7) {
        super(spliterator, j4Var);
        this.f = i7;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.d(this, intConsumer);
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC1210d.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC1210d.g(this, consumer);
    }

    @Override // j$.util.f0
    public final void forEachRemaining(IntConsumer intConsumer) {
        do {
        } while (tryAdvance(intConsumer));
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i7) {
        this.f13292d = (this.f13292d + 1) & 63;
        this.f13276e = i7;
    }

    @Override // j$.util.stream.j4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f) {
            case 0:
                return new g4((j$.util.Z) spliterator, this, 0);
            default:
                return new g4((j$.util.Z) spliterator, this, 1);
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

    @Override // j$.util.Z
    public final boolean tryAdvance(IntConsumer intConsumer) {
        switch (this.f) {
            case 0:
                boolean z7 = this.f13291c;
                Spliterator spliterator = this.f13289a;
                if (z7) {
                    this.f13291c = false;
                    boolean tryAdvance = ((j$.util.Z) spliterator).tryAdvance((IntConsumer) this);
                    if (tryAdvance && b()) {
                        IntPredicate intPredicate = null;
                        intPredicate.test(this.f13276e);
                        throw null;
                    } else if (tryAdvance) {
                        intConsumer.accept(this.f13276e);
                        return tryAdvance;
                    } else {
                        return tryAdvance;
                    }
                }
                return ((j$.util.Z) spliterator).tryAdvance(intConsumer);
            default:
                if (this.f13291c && b() && ((j$.util.Z) this.f13289a).tryAdvance((IntConsumer) this)) {
                    IntPredicate intPredicate2 = null;
                    intPredicate2.test(this.f13276e);
                    throw null;
                }
                this.f13291c = false;
                return false;
        }
    }

    @Override // j$.util.stream.j4, j$.util.Spliterator
    public j$.util.Z trySplit() {
        switch (this.f) {
            case 1:
                if (this.f13290b.get()) {
                    return null;
                }
                return (j$.util.Z) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.f0
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return tryAdvance((IntConsumer) obj);
        }
    }
}
