package j$.util.stream;

import j$.util.C1213g;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
/* loaded from: classes2.dex */
public final /* synthetic */ class P0 implements LongFunction, IntFunction {

    /* renamed from: a  reason: collision with root package name */
    public IntFunction f13125a;

    @Override // java.util.function.IntFunction
    public Object apply(int i7) {
        Object apply = this.f13125a.apply(i7);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        C1213g.a("java.util.stream.IntStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC1340x0.D(j, this.f13125a);
    }
}
