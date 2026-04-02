package j$.com.android.tools.r8;

import j$.util.Objects;
import j$.util.concurrent.t;
import j$.util.function.b;
import j$.util.function.d;
import j$.util.function.f;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ long f(long j, long j8) {
        long j9 = j + j8;
        if (((j8 ^ j) < 0) || ((j ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry g(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List h(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean i(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ long j(long j, long j8) {
        long j9 = j % j8;
        if (j9 == 0) {
            return 0L;
        }
        return (((j ^ j8) >> 63) | 1) > 0 ? j9 : j9 + j8;
    }

    public static /* synthetic */ long k(long j, long j8) {
        long j9 = j / j8;
        return (j - (j8 * j9) != 0 && (((j ^ j8) >> 63) | 1) < 0) ? j9 - 1 : j9;
    }

    public static /* synthetic */ long l(long j, long j8) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j8;
        }
        if (numberOfLeadingZeros >= 64) {
            int i7 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if ((j8 != Long.MIN_VALUE) | (i7 >= 0)) {
                long j9 = j * j8;
                if (i7 == 0 || j9 / j == j8) {
                    return j9;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long m(long j, long j8) {
        long j9 = j - j8;
        if (((j8 ^ j) >= 0) || ((j ^ j9) >= 0)) {
            return j9;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b c(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.c(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d7) {
                DoubleConsumer.this.accept(d7);
                doubleConsumer2.accept(d7);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.d] */
    public static d d(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.d
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return j$.com.android.tools.r8.a.d(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i7) {
                IntConsumer.this.accept(i7);
                intConsumer2.accept(i7);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.f] */
    public static f e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.f
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.e(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                LongConsumer.this.accept(j);
                longConsumer2.accept(j);
            }
        };
    }

    public static t a(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new t(1, biConsumer, biConsumer2);
    }

    public static t b(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new t(biFunction, function);
    }
}
