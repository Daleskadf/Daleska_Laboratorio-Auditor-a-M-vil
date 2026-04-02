package Q6;

import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final t f4497a = new t(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f4498b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f4499c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4498b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i7 = 0; i7 < highestOneBit; i7++) {
            atomicReferenceArr[i7] = new AtomicReference();
        }
        f4499c = atomicReferenceArr;
    }

    public static final void a(t segment) {
        int i7;
        kotlin.jvm.internal.j.e(segment, "segment");
        if (segment.f == null && segment.f4496g == null) {
            if (segment.f4494d) {
                return;
            }
            AtomicReference atomicReference = f4499c[(int) (Thread.currentThread().getId() & (f4498b - 1))];
            t tVar = f4497a;
            t tVar2 = (t) atomicReference.getAndSet(tVar);
            if (tVar2 == tVar) {
                return;
            }
            if (tVar2 != null) {
                i7 = tVar2.f4493c;
            } else {
                i7 = 0;
            }
            if (i7 >= 65536) {
                atomicReference.set(tVar2);
                return;
            }
            segment.f = tVar2;
            segment.f4492b = 0;
            segment.f4493c = i7 + 8192;
            atomicReference.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final t b() {
        AtomicReference atomicReference = f4499c[(int) (Thread.currentThread().getId() & (f4498b - 1))];
        t tVar = f4497a;
        t tVar2 = (t) atomicReference.getAndSet(tVar);
        if (tVar2 == tVar) {
            return new t();
        }
        if (tVar2 == null) {
            atomicReference.set(null);
            return new t();
        }
        atomicReference.set(tVar2.f);
        tVar2.f = null;
        tVar2.f4493c = 0;
        return tVar2;
    }
}
