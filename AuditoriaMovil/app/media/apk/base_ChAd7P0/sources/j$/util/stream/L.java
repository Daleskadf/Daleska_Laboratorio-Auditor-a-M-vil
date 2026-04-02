package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
final class L extends AbstractC1235c {
    private final F j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f13087k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public L(F f, boolean z7, AbstractC1230b abstractC1230b, Spliterator spliterator) {
        super(abstractC1230b, spliterator);
        this.f13087k = z7;
        this.j = f;
    }

    L(L l8, Spliterator spliterator) {
        super(l8, spliterator);
        this.f13087k = l8.f13087k;
        this.j = l8.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final AbstractC1245e e(Spliterator spliterator) {
        return new L(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC1235c
    protected final Object j() {
        return this.j.f13047b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC1245e
    public final Object a() {
        AbstractC1230b abstractC1230b = this.f13245a;
        J3 j32 = (J3) this.j.f13049d.get();
        abstractC1230b.V(this.f13246b, j32);
        Object obj = j32.get();
        if (!this.f13087k) {
            if (obj != null) {
                AtomicReference atomicReference = this.f13206h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj != null) {
            AbstractC1245e abstractC1245e = this;
            while (true) {
                if (abstractC1245e == null) {
                    AtomicReference atomicReference2 = this.f13206h;
                    while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                    }
                } else {
                    AbstractC1245e abstractC1245e2 = (AbstractC1245e) abstractC1245e.getCompleter();
                    if (abstractC1245e2 != null && abstractC1245e2.f13248d != abstractC1245e) {
                        i();
                        break;
                    }
                    abstractC1245e = abstractC1245e2;
                }
            }
            return obj;
        } else {
            return null;
        }
    }

    @Override // j$.util.stream.AbstractC1245e, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        if (this.f13087k) {
            L l8 = (L) this.f13248d;
            L l9 = null;
            while (true) {
                if (l8 != l9) {
                    Object c8 = l8.c();
                    if (c8 == null || !this.j.f13048c.test(c8)) {
                        l9 = l8;
                        l8 = (L) this.f13249e;
                    } else {
                        f(c8);
                        AbstractC1245e abstractC1245e = this;
                        while (true) {
                            if (abstractC1245e == null) {
                                AtomicReference atomicReference = this.f13206h;
                                while (!atomicReference.compareAndSet(null, c8) && atomicReference.get() == null) {
                                }
                            } else {
                                AbstractC1245e abstractC1245e2 = (AbstractC1245e) abstractC1245e.getCompleter();
                                if (abstractC1245e2 != null && abstractC1245e2.f13248d != abstractC1245e) {
                                    i();
                                    break;
                                }
                                abstractC1245e = abstractC1245e2;
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
