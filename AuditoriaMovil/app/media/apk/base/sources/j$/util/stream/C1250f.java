package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1250f implements InterfaceC1260h {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f13263a;

    private /* synthetic */ C1250f(BaseStream baseStream) {
        this.f13263a = baseStream;
    }

    public static /* synthetic */ InterfaceC1260h k(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C1255g ? ((C1255g) baseStream).f13272a : baseStream instanceof DoubleStream ? C.k((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C1276k0.k((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? Z2.k((java.util.stream.Stream) baseStream) : new C1250f(baseStream);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f13263a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BaseStream baseStream = this.f13263a;
        if (obj instanceof C1250f) {
            obj = ((C1250f) obj).f13263a;
        }
        return baseStream.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13263a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ boolean isParallel() {
        return this.f13263a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ Iterator iterator() {
        return this.f13263a.iterator();
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h onClose(Runnable runnable) {
        return k(this.f13263a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h parallel() {
        return k(this.f13263a.parallel());
    }

    @Override // j$.util.stream.InterfaceC1260h, j$.util.stream.E
    public final /* synthetic */ InterfaceC1260h sequential() {
        return k(this.f13263a.sequential());
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.g0.a(this.f13263a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC1260h
    public final /* synthetic */ InterfaceC1260h unordered() {
        return k(this.f13263a.unordered());
    }
}
