package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: j$.util.stream.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC1235c extends AbstractC1245e {

    /* renamed from: h  reason: collision with root package name */
    protected final AtomicReference f13206h;

    /* renamed from: i  reason: collision with root package name */
    protected volatile boolean f13207i;

    protected abstract Object j();

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1235c(AbstractC1230b abstractC1230b, Spliterator spliterator) {
        super(abstractC1230b, spliterator);
        this.f13206h = new AtomicReference(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC1235c(AbstractC1235c abstractC1235c, Spliterator spliterator) {
        super(abstractC1235c, spliterator);
        this.f13206h = abstractC1235c.f13206h;
    }

    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter
    public final void compute() {
        Object obj;
        Spliterator trySplit;
        Spliterator spliterator = this.f13246b;
        long estimateSize = spliterator.estimateSize();
        long j = this.f13247c;
        if (j == 0) {
            j = AbstractC1245e.g(estimateSize);
            this.f13247c = j;
        }
        AtomicReference atomicReference = this.f13206h;
        boolean z7 = false;
        AbstractC1235c abstractC1235c = this;
        while (true) {
            obj = atomicReference.get();
            if (obj != null) {
                break;
            }
            boolean z8 = abstractC1235c.f13207i;
            if (!z8) {
                CountedCompleter<?> completer = abstractC1235c.getCompleter();
                while (true) {
                    AbstractC1235c abstractC1235c2 = (AbstractC1235c) ((AbstractC1245e) completer);
                    if (z8 || abstractC1235c2 == null) {
                        break;
                    }
                    z8 = abstractC1235c2.f13207i;
                    completer = abstractC1235c2.getCompleter();
                }
            }
            if (z8) {
                obj = abstractC1235c.j();
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                AbstractC1235c abstractC1235c3 = (AbstractC1235c) abstractC1235c.e(trySplit);
                abstractC1235c.f13248d = abstractC1235c3;
                AbstractC1235c abstractC1235c4 = (AbstractC1235c) abstractC1235c.e(spliterator);
                abstractC1235c.f13249e = abstractC1235c4;
                abstractC1235c.setPendingCount(1);
                if (z7) {
                    spliterator = trySplit;
                    abstractC1235c = abstractC1235c3;
                    abstractC1235c3 = abstractC1235c4;
                } else {
                    abstractC1235c = abstractC1235c4;
                }
                z7 = !z7;
                abstractC1235c3.fork();
                estimateSize = spliterator.estimateSize();
            }
        }
        obj = abstractC1235c.a();
        abstractC1235c.f(obj);
        abstractC1235c.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final void f(Object obj) {
        if (!d()) {
            super.f(obj);
        } else if (obj != null) {
            AtomicReference atomicReference = this.f13206h;
            while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
            }
        }
    }

    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final Object getRawResult() {
        return c();
    }

    @Override // j$.util.stream.AbstractC1245e
    public final Object c() {
        if (d()) {
            Object obj = this.f13206h.get();
            return obj == null ? j() : obj;
        }
        return super.c();
    }

    protected void h() {
        this.f13207i = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i() {
        AbstractC1235c abstractC1235c = this;
        for (AbstractC1235c abstractC1235c2 = (AbstractC1235c) ((AbstractC1245e) getCompleter()); abstractC1235c2 != null; abstractC1235c2 = (AbstractC1235c) ((AbstractC1245e) abstractC1235c2.getCompleter())) {
            if (abstractC1235c2.f13248d == abstractC1235c) {
                AbstractC1235c abstractC1235c3 = (AbstractC1235c) abstractC1235c2.f13249e;
                if (!abstractC1235c3.f13207i) {
                    abstractC1235c3.h();
                }
            }
            abstractC1235c = abstractC1235c2;
        }
    }
}
