package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: j$.util.stream.w0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1335w0 extends AbstractC1235c {
    private final C1330v0 j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1335w0(C1330v0 c1330v0, AbstractC1230b abstractC1230b, Spliterator spliterator) {
        super(abstractC1230b, spliterator);
        this.j = c1330v0;
    }

    C1335w0(C1335w0 c1335w0, Spliterator spliterator) {
        super(c1335w0, spliterator);
        this.j = c1335w0.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final AbstractC1245e e(Spliterator spliterator) {
        return new C1335w0(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final Object a() {
        boolean z7;
        AbstractC1230b abstractC1230b = this.f13245a;
        AbstractC1320t0 abstractC1320t0 = (AbstractC1320t0) this.j.f13365b.get();
        abstractC1230b.V(this.f13246b, abstractC1320t0);
        boolean z8 = abstractC1320t0.f13351b;
        z7 = this.j.f13364a.f13359b;
        if (z8 == z7) {
            Boolean valueOf = Boolean.valueOf(z8);
            AtomicReference atomicReference = this.f13206h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC1235c
    protected final Object j() {
        boolean z7;
        z7 = this.j.f13364a.f13359b;
        return Boolean.valueOf(!z7);
    }
}
