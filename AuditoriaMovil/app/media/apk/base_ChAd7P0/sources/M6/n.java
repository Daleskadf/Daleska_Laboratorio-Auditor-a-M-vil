package M6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3305b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3306c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3307d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f3308e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f3309a = new AtomicReferenceArray((int) RecognitionOptions.ITF);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final j a(j jVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3306c;
        if (atomicIntegerFieldUpdater.get(this) - f3307d.get(this) == 127) {
            return jVar;
        }
        if (jVar.f3295b.f327a == 1) {
            f3308e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f3309a;
            if (atomicReferenceArray.get(i7) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(i7, jVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final j b() {
        j jVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3307d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f3306c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (jVar = (j) this.f3309a.getAndSet(i8, null)) != null) {
                if (jVar.f3295b.f327a == 1) {
                    f3308e.decrementAndGet(this);
                }
                return jVar;
            }
        }
    }

    public final j c(int i7, boolean z7) {
        int i8 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f3309a;
        j jVar = (j) atomicReferenceArray.get(i8);
        if (jVar != null) {
            boolean z8 = true;
            if (jVar.f3295b.f327a != 1) {
                z8 = false;
            }
            if (z8 == z7) {
                while (!atomicReferenceArray.compareAndSet(i8, jVar, null)) {
                    if (atomicReferenceArray.get(i8) != jVar) {
                    }
                }
                if (z7) {
                    f3308e.decrementAndGet(this);
                }
                return jVar;
            }
        }
        return null;
    }
}
