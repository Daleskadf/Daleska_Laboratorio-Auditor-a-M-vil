package O6;

import E6.l;
import K6.AbstractC0208a;
import K6.u;
import K6.w;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3876b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3877c = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3878d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f3879e = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");
    public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final l f3880a;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i7) {
        if (i7 >= 0 && i7 <= 1) {
            j jVar = new j(0L, null, 2);
            this.head = jVar;
            this.tail = jVar;
            this._availablePermits = 1 - i7;
            this.f3880a = new l(this, 2);
            return;
        }
        throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
    }

    public final void a(c cVar) {
        Object b5;
        f fVar;
        long j;
        while (true) {
            int andDecrement = f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Object obj = l6.j.f13876a;
                w6.l lVar = this.f3880a;
                if (andDecrement > 0) {
                    cVar.b(obj, lVar);
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3878d;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f3879e.getAndIncrement(this);
                f fVar2 = f.f3874a;
                long j8 = andIncrement / i.f;
                while (true) {
                    b5 = AbstractC0208a.b(jVar, j8, fVar2);
                    if (!AbstractC0208a.e(b5)) {
                        u c8 = AbstractC0208a.c(b5);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j = j8;
                            if (uVar.f2804c >= c8.f2804c) {
                                break;
                            } else if (!c8.i()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c8)) {
                                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                        if (c8.e()) {
                                            c8.d();
                                        }
                                        fVar2 = fVar;
                                        j8 = j;
                                    }
                                }
                                if (uVar.e()) {
                                    uVar.d();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    fVar2 = fVar;
                    j8 = j;
                }
                j jVar2 = (j) AbstractC0208a.c(b5);
                int i7 = (int) (andIncrement % i.f);
                AtomicReferenceArray atomicReferenceArray = jVar2.f3886e;
                while (!atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        w wVar = i.f3882b;
                        w wVar2 = i.f3883c;
                        while (!atomicReferenceArray.compareAndSet(i7, wVar, wVar2)) {
                            if (atomicReferenceArray.get(i7) != wVar) {
                                break;
                            }
                        }
                        cVar.b(obj, lVar);
                        return;
                    }
                }
                cVar.a(jVar2, i7);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c3, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O6.h.b():void");
    }
}
