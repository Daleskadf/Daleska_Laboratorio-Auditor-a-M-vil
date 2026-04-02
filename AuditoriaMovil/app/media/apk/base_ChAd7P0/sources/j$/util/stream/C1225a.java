package j$.util.stream;

import j$.util.C1213g;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1225a implements Supplier, Consumer, BooleanSupplier, DoubleFunction, Function, LongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13190a;

    /* renamed from: b  reason: collision with root package name */
    public Object f13191b;

    public /* synthetic */ C1225a(int i7) {
        this.f13190a = i7;
    }

    public /* synthetic */ C1225a(int i7, Object obj) {
        this.f13190a = i7;
        this.f13191b = obj;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.f13190a) {
            case 1:
                ((InterfaceC1298o2) this.f13191b).accept((InterfaceC1298o2) obj);
                return;
            default:
                ((ArrayList) this.f13191b).add(obj);
                return;
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f13190a) {
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.f13190a) {
            case 0:
                return ((AbstractC1230b) this.f13191b).M();
            default:
                return (Spliterator) this.f13191b;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object apply = ((Function) this.f13191b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return Z2.k((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof E) {
            return D.k((E) apply);
        }
        if (apply instanceof DoubleStream) {
            return C.k((DoubleStream) apply);
        }
        if (apply instanceof InterfaceC1286m0) {
            return C1281l0.k((InterfaceC1286m0) apply);
        }
        if (apply instanceof LongStream) {
            return C1276k0.k((LongStream) apply);
        }
        C1213g.a("java.util.stream.*Stream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d7) {
        Object apply = ((DoubleFunction) this.f13191b).apply(d7);
        if (apply == null) {
            return null;
        }
        if (apply instanceof E) {
            return D.k((E) apply);
        }
        if (apply instanceof DoubleStream) {
            return C.k((DoubleStream) apply);
        }
        C1213g.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.f13191b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC1286m0) {
            return C1281l0.k((InterfaceC1286m0) apply);
        }
        if (apply instanceof LongStream) {
            return C1276k0.k((LongStream) apply);
        }
        C1213g.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.f13190a) {
            case 2:
                C1294n3 c1294n3 = (C1294n3) this.f13191b;
                return c1294n3.f13253d.tryAdvance(c1294n3.f13254e);
            case 3:
                C1304p3 c1304p3 = (C1304p3) this.f13191b;
                return c1304p3.f13253d.tryAdvance(c1304p3.f13254e);
            case 4:
                C1313r3 c1313r3 = (C1313r3) this.f13191b;
                return c1313r3.f13253d.tryAdvance(c1313r3.f13254e);
            default:
                G3 g3 = (G3) this.f13191b;
                return g3.f13253d.tryAdvance(g3.f13254e);
        }
    }
}
