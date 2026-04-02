package j$.util;

import java.util.Iterator;
/* loaded from: classes2.dex */
public final class Spliterators {

    /* renamed from: a  reason: collision with root package name */
    private static final Spliterator f12856a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Z f12857b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final c0 f12858c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final W f12859d = new Object();

    public static Spliterator e() {
        return f12856a;
    }

    public static Z c() {
        return f12857b;
    }

    public static c0 d() {
        return f12858c;
    }

    public static W b() {
        return f12859d;
    }

    public static Spliterator m(Object[] objArr, int i7, int i8) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i7, i8);
        return new l0(objArr, i7, i8, 1040);
    }

    public static Z k(int[] iArr, int i7, int i8) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i7, i8);
        return new r0(iArr, i7, i8, 1040);
    }

    public static c0 l(long[] jArr, int i7, int i8) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i7, i8);
        return new t0(jArr, i7, i8, 1040);
    }

    public static W j(double[] dArr, int i7, int i8) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i7, i8);
        return new m0(dArr, i7, i8, 1040);
    }

    private static void a(int i7, int i8, int i9) {
        if (i8 <= i9) {
            if (i8 < 0) {
                throw new ArrayIndexOutOfBoundsException(i8);
            }
            if (i9 > i7) {
                throw new ArrayIndexOutOfBoundsException(i9);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i8 + ") > fence(" + i9 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i7) {
        return new s0((java.util.Collection) Objects.requireNonNull(collection), i7);
    }

    public static Spliterator n(Iterator it) {
        return new s0((Iterator) Objects.requireNonNull(it));
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new h0(spliterator);
    }

    public static M g(Z z7) {
        Objects.requireNonNull(z7);
        return new i0(z7);
    }

    public static Q h(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        return new j0(c0Var);
    }

    public static I f(W w2) {
        Objects.requireNonNull(w2);
        return new k0(w2);
    }
}
