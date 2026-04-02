package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.a2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1228a2 extends AbstractC1245e {

    /* renamed from: h  reason: collision with root package name */
    private final AbstractC1340x0 f13193h;

    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC1245e abstractC1245e = this.f13248d;
        if (abstractC1245e != null) {
            T1 t1 = (T1) ((C1228a2) abstractC1245e).c();
            t1.g((T1) ((C1228a2) this.f13249e).c());
            f(t1);
        }
        super.onCompletion(countedCompleter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1228a2(AbstractC1340x0 abstractC1340x0, AbstractC1230b abstractC1230b, Spliterator spliterator) {
        super(abstractC1230b, spliterator);
        this.f13193h = abstractC1340x0;
    }

    C1228a2(C1228a2 c1228a2, Spliterator spliterator) {
        super(c1228a2, spliterator);
        this.f13193h = c1228a2.f13193h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final AbstractC1245e e(Spliterator spliterator) {
        return new C1228a2(this, spliterator);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final Object a() {
        AbstractC1230b abstractC1230b = this.f13245a;
        T1 e02 = this.f13193h.e0();
        abstractC1230b.V(this.f13246b, e02);
        return e02;
    }
}
