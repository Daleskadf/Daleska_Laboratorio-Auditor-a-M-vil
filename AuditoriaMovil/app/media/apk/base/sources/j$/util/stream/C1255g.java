package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1255g implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1260h f13272a;

    private /* synthetic */ C1255g(InterfaceC1260h interfaceC1260h) {
        this.f13272a = interfaceC1260h;
    }

    public static /* synthetic */ BaseStream k(InterfaceC1260h interfaceC1260h) {
        if (interfaceC1260h == null) {
            return null;
        }
        return interfaceC1260h instanceof C1250f ? ((C1250f) interfaceC1260h).f13263a : interfaceC1260h instanceof E ? D.k((E) interfaceC1260h) : interfaceC1260h instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC1260h) : interfaceC1260h instanceof InterfaceC1286m0 ? C1281l0.k((InterfaceC1286m0) interfaceC1260h) : interfaceC1260h instanceof Stream ? Stream.Wrapper.convert((Stream) interfaceC1260h) : new C1255g(interfaceC1260h);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f13272a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1260h interfaceC1260h = this.f13272a;
        if (obj instanceof C1255g) {
            obj = ((C1255g) obj).f13272a;
        }
        return interfaceC1260h.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f13272a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f13272a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f13272a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return k(this.f13272a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return k(this.f13272a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return k(this.f13272a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(this.f13272a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return k(this.f13272a.unordered());
    }
}
