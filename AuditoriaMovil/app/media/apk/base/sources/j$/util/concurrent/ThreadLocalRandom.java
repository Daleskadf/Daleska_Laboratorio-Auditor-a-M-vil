package j$.util.concurrent;

import j$.util.stream.AbstractC1340x0;
import j$.util.stream.C1281l0;
import j$.util.stream.D;
import j$.util.stream.IntStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a  reason: collision with root package name */
    long f12895a;

    /* renamed from: b  reason: collision with root package name */
    int f12896b;

    /* renamed from: c  reason: collision with root package name */
    boolean f12897c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f12892d = new ThreadLocal();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f12893e = new AtomicInteger();
    private static final ThreadLocal f = new ThreadLocal();

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLong f12894g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ThreadLocalRandom(int i7) {
        this();
    }

    private static int g(long j) {
        long j8 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j8 ^ (j8 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j) {
        long j8 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j9 = (j8 ^ (j8 >>> 33)) * (-4265267296055464877L);
        return j9 ^ (j9 >>> 33);
    }

    private ThreadLocalRandom() {
        this.f12897c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f() {
        int addAndGet = f12893e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h8 = h(f12894g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.f12895a = h8;
        threadLocalRandom.f12896b = addAndGet;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.f12896b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.f12897c) {
            throw new UnsupportedOperationException();
        }
    }

    final long i() {
        long j = this.f12895a - 7046029254386353131L;
        this.f12895a = j;
        return j;
    }

    @Override // java.util.Random
    protected final int next(int i7) {
        return nextInt() >>> (32 - i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j, long j8) {
        long h8 = h(i());
        if (j >= j8) {
            return h8;
        }
        long j9 = j8 - j;
        long j10 = j9 - 1;
        if ((j9 & j10) == 0) {
            return (h8 & j10) + j;
        }
        if (j9 > 0) {
            while (true) {
                long j11 = h8 >>> 1;
                long j12 = j11 + j10;
                long j13 = j11 % j9;
                if (j12 - j13 >= 0) {
                    return j13 + j;
                }
                h8 = h(i());
            }
        } else {
            while (true) {
                if (h8 >= j && h8 < j8) {
                    return h8;
                }
                h8 = h(i());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i7, int i8) {
        int i9;
        int g3 = g(i());
        if (i7 < i8) {
            int i10 = i8 - i7;
            int i11 = i10 - 1;
            if ((i10 & i11) == 0) {
                i9 = g3 & i11;
            } else if (i10 > 0) {
                int i12 = g3 >>> 1;
                while (true) {
                    int i13 = i12 + i11;
                    i9 = i12 % i10;
                    if (i13 - i9 >= 0) {
                        break;
                    }
                    i12 = g(i()) >>> 1;
                }
            } else {
                while (true) {
                    if (g3 >= i7 && g3 < i8) {
                        return g3;
                    }
                    g3 = g(i());
                }
            }
            return i9 + i7;
        }
        return g3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double c(double d7, double d8) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d7 < d8) {
            double d9 = ((d8 - d7) * nextLong) + d7;
            return d9 >= d8 ? Double.longBitsToDouble(Double.doubleToLongBits(d8) - 1) : d9;
        }
        return nextLong;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int g3 = g(i());
        int i8 = i7 - 1;
        if ((i7 & i8) == 0) {
            return g3 & i8;
        }
        while (true) {
            int i9 = g3 >>> 1;
            int i10 = i9 + i8;
            int i11 = i9 % i7;
            if (i10 - i11 >= 0) {
                return i11;
            }
            g3 = g(i());
        }
    }

    public final int nextInt(int i7, int i8) {
        if (i7 >= i8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return d(i7, i8);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    public final long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long h8 = h(i());
        long j8 = j - 1;
        if ((j & j8) == 0) {
            return h8 & j8;
        }
        while (true) {
            long j9 = h8 >>> 1;
            long j10 = j9 + j8;
            long j11 = j9 % j;
            if (j10 - j11 >= 0) {
                return j11;
            }
            h8 = h(i());
        }
    }

    public final long nextLong(long j, long j8) {
        if (j >= j8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return e(j, j8);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d7) {
        if (d7 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double h8 = (h(i()) >>> 11) * 1.1102230246251565E-16d * d7;
        return h8 < d7 ? h8 : Double.longBitsToDouble(Double.doubleToLongBits(d7) - 1);
    }

    public final double nextDouble(double d7, double d8) {
        if (d7 >= d8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(d7, d8);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f12892d;
        Double d7 = (Double) threadLocal.get();
        if (d7 != null) {
            threadLocal.set(null);
            return d7.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d8 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d8 < 1.0d && d8 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d8) * (-2.0d)) / d8);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return IntStream.Wrapper.convert(AbstractC1340x0.T(new z(0L, j, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC1340x0.T(new z(0L, Long.MAX_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j, int i7, int i8) {
        if (j >= 0) {
            if (i7 >= i8) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return IntStream.Wrapper.convert(AbstractC1340x0.T(new z(0L, j, i7, i8)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i7, int i8) {
        if (i7 >= i8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return IntStream.Wrapper.convert(AbstractC1340x0.T(new z(0L, Long.MAX_VALUE, i7, i8)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return C1281l0.k(AbstractC1340x0.V(new A(0L, j, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C1281l0.k(AbstractC1340x0.V(new A(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j8, long j9) {
        if (j >= 0) {
            if (j8 >= j9) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return C1281l0.k(AbstractC1340x0.V(new A(0L, j, j8, j9)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j8) {
        if (j >= j8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return C1281l0.k(AbstractC1340x0.V(new A(0L, Long.MAX_VALUE, j, j8)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        return D.k(AbstractC1340x0.K(new y(0L, j, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return D.k(AbstractC1340x0.K(new y(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d7, double d8) {
        if (j >= 0) {
            if (d7 >= d8) {
                throw new IllegalArgumentException("bound must be greater than origin");
            }
            return D.k(AbstractC1340x0.K(new y(0L, j, d7, d8)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d7, double d8) {
        if (d7 >= d8) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return D.k(AbstractC1340x0.K(new y(0L, Long.MAX_VALUE, d7, d8)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f.get()).f12896b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i7) {
        int i8 = i7 ^ (i7 << 13);
        int i9 = i8 ^ (i8 >>> 17);
        int i10 = i9 ^ (i9 << 5);
        ((ThreadLocalRandom) f.get()).f12896b = i10;
        return i10;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.security.PrivilegedAction] */
    static {
        if (((Boolean) AccessController.doPrivileged((PrivilegedAction<Object>) new Object())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i7 = 1; i7 < 8; i7++) {
                j = (j << 8) | (seed[i7] & 255);
            }
            f12894g.set(j);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f12895a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}
