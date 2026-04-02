package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
/* renamed from: j$.util.stream.x0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1340x0 implements I3 {

    /* renamed from: a  reason: collision with root package name */
    private static final C1237c1 f13381a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final F0 f13382b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final H0 f13383c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final D0 f13384d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f13385e = new int[0];
    private static final long[] f = new long[0];

    /* renamed from: g  reason: collision with root package name */
    private static final double[] f13386g = new double[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long B(long j, long j8) {
        long j9 = j8 >= 0 ? j + j8 : Long.MAX_VALUE;
        if (j9 >= 0) {
            return j9;
        }
        return Long.MAX_VALUE;
    }

    @Override // j$.util.stream.I3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract T1 e0();

    public static C1225a R(Function function) {
        C1225a c1225a = new C1225a(8);
        c1225a.f13191b = function;
        return c1225a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long A(long j, long j8, long j9) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j8, j9));
        }
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.b] */
    public static Stream f0(Spliterator spliterator, boolean z7) {
        Objects.requireNonNull(spliterator);
        return new AbstractC1230b(spliterator, EnumC1239c3.s(spliterator), z7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Spliterator C(EnumC1244d3 enumC1244d3, Spliterator spliterator, long j, long j8) {
        long j9 = j8 >= 0 ? j + j8 : Long.MAX_VALUE;
        long j10 = j9 >= 0 ? j9 : Long.MAX_VALUE;
        int i7 = AbstractC1342x2.f13387a[enumC1244d3.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException("Unknown shape " + enumC1244d3);
                    }
                    return new AbstractC1333v3((j$.util.W) spliterator, j, j10);
                }
                return new AbstractC1333v3((j$.util.c0) spliterator, j, j10);
            }
            return new AbstractC1333v3((j$.util.Z) spliterator, j, j10);
        }
        return new C1338w3(spliterator, j, j10);
    }

    public static C1330v0 c0(EnumC1325u0 enumC1325u0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC1325u0);
        return new C1330v0(EnumC1244d3.REFERENCE, enumC1325u0, new C1296o0(0, enumC1325u0, predicate));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC1242d1 L(EnumC1244d3 enumC1244d3) {
        int i7 = K0.f13082a[enumC1244d3.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return (AbstractC1242d1) f13384d;
                    }
                    throw new IllegalStateException("Unknown shape " + enumC1244d3);
                }
                return (AbstractC1242d1) f13383c;
            }
            return (AbstractC1242d1) f13382b;
        }
        return f13381a;
    }

    public static C1330v0 Z(EnumC1325u0 enumC1325u0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC1325u0);
        return new C1330v0(EnumC1244d3.INT_VALUE, enumC1325u0, new C1291n0(enumC1325u0, 1));
    }

    public static Stream d0(AbstractC1258g2 abstractC1258g2, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1308q2(abstractC1258g2, M(j8), j, j8);
    }

    public static J0 w(J0 j02, long j, long j8, IntFunction intFunction) {
        if (j == 0 && j8 == j02.count()) {
            return j02;
        }
        Spliterator spliterator = j02.spliterator();
        long j9 = j8 - j;
        B0 D4 = D(j9, intFunction);
        D4.l(j9);
        for (int i7 = 0; i7 < j && spliterator.tryAdvance(new r(28)); i7++) {
        }
        if (j8 == j02.count()) {
            spliterator.forEachRemaining(D4);
        } else {
            for (int i8 = 0; i8 < j9 && spliterator.tryAdvance(D4); i8++) {
            }
        }
        D4.k();
        return D4.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static L0 I(EnumC1244d3 enumC1244d3, J0 j02, J0 j03) {
        int i7 = K0.f13082a[enumC1244d3.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException("Unknown shape " + enumC1244d3);
                    }
                    return new L0((D0) j02, (D0) j03);
                }
                return new L0((H0) j02, (H0) j03);
            }
            return new L0((F0) j02, (F0) j03);
        }
        return new L0(j02, j03);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.IntStream, j$.util.stream.b] */
    public static IntStream T(j$.util.Z z7) {
        return new AbstractC1230b(z7, EnumC1239c3.s(z7), false);
    }

    public static C1330v0 b0(EnumC1325u0 enumC1325u0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC1325u0);
        return new C1330v0(EnumC1244d3.LONG_VALUE, enumC1325u0, new C1291n0(enumC1325u0, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static C1330v0 X(EnumC1325u0 enumC1325u0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC1325u0);
        return new C1330v0(EnumC1244d3.DOUBLE_VALUE, enumC1325u0, new C1291n0(enumC1325u0, 2));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.Y2, j$.util.stream.B0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.M0, j$.util.stream.B0] */
    public static B0 D(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new M0(j, intFunction);
        }
        return new Y2();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(InterfaceC1288m2 interfaceC1288m2, Integer num) {
        if (L3.f13096a) {
            L3.a(interfaceC1288m2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        } else {
            interfaceC1288m2.accept(num.intValue());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.m0, j$.util.stream.b] */
    public static InterfaceC1286m0 V(j$.util.c0 c0Var) {
        return new AbstractC1230b(c0Var, EnumC1239c3.s(c0Var), false);
    }

    public static void i(InterfaceC1293n2 interfaceC1293n2, Long l8) {
        if (L3.f13096a) {
            L3.a(interfaceC1293n2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        } else {
            interfaceC1293n2.accept(l8.longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.z0, j$.util.stream.X2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.z0, j$.util.stream.f1] */
    public static InterfaceC1350z0 S(long j) {
        if (j < 0 || j >= 2147483639) {
            return new X2();
        }
        return new C1252f1(j);
    }

    public static void e(InterfaceC1283l2 interfaceC1283l2, Double d7) {
        if (L3.f13096a) {
            L3.a(interfaceC1283l2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        } else {
            interfaceC1283l2.accept(d7.doubleValue());
        }
    }

    public static IntStream Y(AbstractC1231b0 abstractC1231b0, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1317s2(abstractC1231b0, M(j8), j, j8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.A0, j$.util.stream.X2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.o1, j$.util.stream.A0] */
    public static A0 U(long j) {
        if (j < 0 || j >= 2147483639) {
            return new X2();
        }
        return new C1297o1(j);
    }

    public static Object[] m(I0 i02, IntFunction intFunction) {
        if (L3.f13096a) {
            L3.a(i02.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (i02.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.apply((int) i02.count());
            i02.i(objArr, 0);
            return objArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.b, j$.util.stream.E] */
    public static E K(j$.util.W w2) {
        return new AbstractC1230b(w2, EnumC1239c3.s(w2), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.y0, j$.util.stream.X2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.y0, j$.util.stream.W0] */
    public static InterfaceC1345y0 J(long j) {
        if (j < 0 || j >= 2147483639) {
            return new X2();
        }
        return new W0(j);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.function.LongFunction, java.lang.Object, j$.util.stream.P0] */
    public static J0 E(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7, IntFunction intFunction) {
        long G2 = abstractC1230b.G(spliterator);
        if (G2 < 0 || !spliterator.hasCharacteristics(16384)) {
            ?? obj = new Object();
            obj.f13125a = intFunction;
            J0 j02 = (J0) new O0(abstractC1230b, spliterator, obj, new C1300p(14), 3).invoke();
            return z7 ? N(j02, intFunction) : j02;
        } else if (G2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            Object[] objArr = (Object[]) intFunction.apply((int) G2);
            new C1326u1(spliterator, abstractC1230b, objArr).invoke();
            return new M0(objArr);
        }
    }

    public static void r(F0 f02, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            f02.e((IntConsumer) consumer);
        } else if (L3.f13096a) {
            L3.a(f02.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.Z) f02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static InterfaceC1286m0 a0(AbstractC1271j0 abstractC1271j0, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1327u2(abstractC1271j0, M(j8), j, j8);
    }

    public static void o(F0 f02, Integer[] numArr, int i7) {
        if (L3.f13096a) {
            L3.a(f02.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) f02.d();
        for (int i8 = 0; i8 < iArr.length; i8++) {
            numArr[i7 + i8] = Integer.valueOf(iArr[i8]);
        }
    }

    public static F0 u(F0 f02, long j, long j8) {
        if (j == 0 && j8 == f02.count()) {
            return f02;
        }
        long j9 = j8 - j;
        j$.util.Z z7 = (j$.util.Z) f02.spliterator();
        InterfaceC1350z0 S7 = S(j9);
        S7.l(j9);
        for (int i7 = 0; i7 < j && z7.tryAdvance((IntConsumer) new E0(0)); i7++) {
        }
        if (j8 == f02.count()) {
            z7.forEachRemaining((IntConsumer) S7);
        } else {
            for (int i8 = 0; i8 < j9 && z7.tryAdvance((IntConsumer) S7); i8++) {
            }
        }
        S7.k();
        return S7.a();
    }

    public static F0 G(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7) {
        long G2 = abstractC1230b.G(spliterator);
        if (G2 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f02 = (F0) new O0(abstractC1230b, spliterator, new C1300p(10), new C1300p(11), 1).invoke();
            return z7 ? P(f02) : f02;
        } else if (G2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            int[] iArr = new int[(int) G2];
            new C1316s1(spliterator, abstractC1230b, iArr).invoke();
            return new C1252f1(iArr);
        }
    }

    public static H0 H(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7) {
        long G2 = abstractC1230b.G(spliterator);
        if (G2 < 0 || !spliterator.hasCharacteristics(16384)) {
            H0 h02 = (H0) new O0(abstractC1230b, spliterator, new C1300p(12), new C1300p(13), 2).invoke();
            return z7 ? Q(h02) : h02;
        } else if (G2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            long[] jArr = new long[(int) G2];
            new C1321t1(spliterator, abstractC1230b, jArr).invoke();
            return new C1297o1(jArr);
        }
    }

    public static void s(H0 h02, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            h02.e((LongConsumer) consumer);
        } else if (L3.f13096a) {
            L3.a(h02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.c0) h02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(H0 h02, Long[] lArr, int i7) {
        if (L3.f13096a) {
            L3.a(h02.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) h02.d();
        for (int i8 = 0; i8 < jArr.length; i8++) {
            lArr[i7 + i8] = Long.valueOf(jArr[i8]);
        }
    }

    public static H0 v(H0 h02, long j, long j8) {
        if (j == 0 && j8 == h02.count()) {
            return h02;
        }
        long j9 = j8 - j;
        j$.util.c0 c0Var = (j$.util.c0) h02.spliterator();
        A0 U7 = U(j9);
        U7.l(j9);
        for (int i7 = 0; i7 < j && c0Var.tryAdvance((LongConsumer) new G0(0)); i7++) {
        }
        if (j8 == h02.count()) {
            c0Var.forEachRemaining((LongConsumer) U7);
        } else {
            for (int i8 = 0; i8 < j9 && c0Var.tryAdvance((LongConsumer) U7); i8++) {
            }
        }
        U7.k();
        return U7.a();
    }

    public static D0 F(AbstractC1230b abstractC1230b, Spliterator spliterator, boolean z7) {
        long G2 = abstractC1230b.G(spliterator);
        if (G2 < 0 || !spliterator.hasCharacteristics(16384)) {
            D0 d02 = (D0) new O0(abstractC1230b, spliterator, new C1300p(8), new C1300p(9), 0).invoke();
            return z7 ? O(d02) : d02;
        } else if (G2 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        } else {
            double[] dArr = new double[(int) G2];
            new C1311r1(spliterator, abstractC1230b, dArr).invoke();
            return new W0(dArr);
        }
    }

    public static E W(B b5, long j, long j8) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C1337w2(b5, M(j8), j, j8);
    }

    public static J0 N(J0 j02, IntFunction intFunction) {
        if (j02.q() > 0) {
            long count = j02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) intFunction.apply((int) count);
            new C1346y1(j02, objArr, 1).invoke();
            return new M0(objArr);
        }
        return j02;
    }

    public static void q(D0 d02, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d02.e((DoubleConsumer) consumer);
        } else if (L3.f13096a) {
            L3.a(d02.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        } else {
            ((j$.util.W) d02.spliterator()).forEachRemaining(consumer);
        }
    }

    public static F0 P(F0 f02) {
        if (f02.q() > 0) {
            long count = f02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            int[] iArr = new int[(int) count];
            new C1346y1(f02, iArr, 0).invoke();
            return new C1252f1(iArr);
        }
        return f02;
    }

    public static void n(D0 d02, Double[] dArr, int i7) {
        if (L3.f13096a) {
            L3.a(d02.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) d02.d();
        for (int i8 = 0; i8 < dArr2.length; i8++) {
            dArr[i7 + i8] = Double.valueOf(dArr2[i8]);
        }
    }

    public static D0 t(D0 d02, long j, long j8) {
        if (j == 0 && j8 == d02.count()) {
            return d02;
        }
        long j9 = j8 - j;
        j$.util.W w2 = (j$.util.W) d02.spliterator();
        InterfaceC1345y0 J5 = J(j9);
        J5.l(j9);
        for (int i7 = 0; i7 < j && w2.tryAdvance((DoubleConsumer) new C0(0)); i7++) {
        }
        if (j8 == d02.count()) {
            w2.forEachRemaining((DoubleConsumer) J5);
        } else {
            for (int i8 = 0; i8 < j9 && w2.tryAdvance((DoubleConsumer) J5); i8++) {
            }
        }
        J5.k();
        return J5.a();
    }

    public static H0 Q(H0 h02) {
        if (h02.q() > 0) {
            long count = h02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            long[] jArr = new long[(int) count];
            new C1346y1(h02, jArr, 0).invoke();
            return new C1297o1(jArr);
        }
        return h02;
    }

    private static int M(long j) {
        return (j != -1 ? EnumC1239c3.f13226u : 0) | EnumC1239c3.f13225t;
    }

    public static D0 O(D0 d02) {
        if (d02.q() > 0) {
            long count = d02.count();
            if (count >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            double[] dArr = new double[(int) count];
            new C1346y1(d02, dArr, 0).invoke();
            return new W0(dArr);
        }
        return d02;
    }

    @Override // j$.util.stream.I3
    public Object b(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        T1 e02 = e0();
        abstractC1230b.V(spliterator, e02);
        return e02.get();
    }

    @Override // j$.util.stream.I3
    public Object c(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        return ((T1) new C1228a2(this, abstractC1230b, spliterator).invoke()).get();
    }
}
