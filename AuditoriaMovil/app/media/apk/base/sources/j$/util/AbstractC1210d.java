package j$.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* renamed from: j$.util.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1210d {
    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return java.util.Optional.of(optional.get());
        }
        return java.util.Optional.empty();
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.b(optional.get());
        }
        return Optional.a();
    }

    public static OptionalDouble n(C c8) {
        if (c8 == null) {
            return null;
        }
        if (c8.c()) {
            return OptionalDouble.of(c8.b());
        }
        return OptionalDouble.empty();
    }

    public static C j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (optionalDouble.isPresent()) {
            return C.d(optionalDouble.getAsDouble());
        }
        return C.a();
    }

    public static OptionalLong p(E e7) {
        if (e7 == null) {
            return null;
        }
        if (e7.c()) {
            return OptionalLong.of(e7.b());
        }
        return OptionalLong.empty();
    }

    public static E l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (optionalLong.isPresent()) {
            return E.d(optionalLong.getAsLong());
        }
        return E.a();
    }

    public static OptionalInt o(D d7) {
        if (d7 == null) {
            return null;
        }
        if (d7.c()) {
            return OptionalInt.of(d7.b());
        }
        return OptionalInt.empty();
    }

    public static D k(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (optionalInt.isPresent()) {
            return D.d(optionalInt.getAsInt());
        }
        return D.a();
    }

    public static void q(Iterator it, Consumer consumer) {
        if (it instanceof A) {
            ((A) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static C1208c s(Comparator comparator, Comparator comparator2) {
        Objects.requireNonNull(comparator2);
        return new C1208c((EnumC1212f) ((InterfaceC1211e) comparator), comparator2, 0);
    }

    public static Comparator r() {
        return EnumC1212f.INSTANCE;
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i7) {
        return (spliterator.characteristics() & i7) == i7;
    }

    public static boolean g(Z z7, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return z7.tryAdvance((IntConsumer) consumer);
        }
        if (v0.f13415a) {
            v0.a(z7.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return z7.tryAdvance((IntConsumer) new J(consumer));
    }

    public static void b(Z z7, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            z7.forEachRemaining((IntConsumer) consumer);
        } else if (v0.f13415a) {
            v0.a(z7.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            z7.forEachRemaining((IntConsumer) new J(consumer));
        }
    }

    public static boolean h(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return c0Var.tryAdvance((LongConsumer) consumer);
        }
        if (v0.f13415a) {
            v0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return c0Var.tryAdvance((LongConsumer) new N(consumer));
    }

    public static void c(c0 c0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c0Var.forEachRemaining((LongConsumer) consumer);
        } else if (v0.f13415a) {
            v0.a(c0Var.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            c0Var.forEachRemaining((LongConsumer) new N(consumer));
        }
    }

    public static boolean f(W w2, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return w2.tryAdvance((DoubleConsumer) consumer);
        }
        if (v0.f13415a) {
            v0.a(w2.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return w2.tryAdvance((DoubleConsumer) new F(consumer));
    }

    public static void a(W w2, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            w2.forEachRemaining((DoubleConsumer) consumer);
        } else if (v0.f13415a) {
            v0.a(w2.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        } else {
            Objects.requireNonNull(consumer);
            w2.forEachRemaining((DoubleConsumer) new F(consumer));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
