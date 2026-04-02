package j$.util.stream;

import com.google.android.libraries.barhopper.RecognitionOptions;
import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes2.dex */
abstract class E3 {

    /* renamed from: a  reason: collision with root package name */
    protected final Spliterator f13041a;

    /* renamed from: b  reason: collision with root package name */
    protected final boolean f13042b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f13043c;

    /* renamed from: d  reason: collision with root package name */
    private final long f13044d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicLong f13045e;

    protected abstract Spliterator c(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(Spliterator spliterator, long j, long j8) {
        this.f13041a = spliterator;
        int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
        this.f13042b = i7 < 0;
        this.f13044d = i7 >= 0 ? j8 : 0L;
        this.f13043c = RecognitionOptions.ITF;
        this.f13045e = new AtomicLong(i7 >= 0 ? j + j8 : j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public E3(Spliterator spliterator, E3 e32) {
        this.f13041a = spliterator;
        this.f13042b = e32.f13042b;
        this.f13045e = e32.f13045e;
        this.f13044d = e32.f13044d;
        this.f13043c = e32.f13043c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long b(long j) {
        AtomicLong atomicLong;
        long j8;
        boolean z7;
        long min;
        do {
            atomicLong = this.f13045e;
            j8 = atomicLong.get();
            int i7 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
            z7 = this.f13042b;
            if (i7 != 0) {
                min = Math.min(j8, j);
                if (min <= 0) {
                    break;
                }
            } else if (z7) {
                return j;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j8, j8 - min));
        if (z7) {
            return Math.max(j - min, 0L);
        }
        long j9 = this.f13044d;
        return j8 > j9 ? Math.max(min - (j8 - j9), 0L) : min;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final D3 d() {
        if (this.f13045e.get() > 0) {
            return D3.MAYBE_MORE;
        }
        return this.f13042b ? D3.UNLIMITED : D3.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.f13045e.get() == 0 || (trySplit = this.f13041a.trySplit()) == null) {
            return null;
        }
        return c(trySplit);
    }

    public final long estimateSize() {
        return this.f13041a.estimateSize();
    }

    public final int characteristics() {
        return this.f13041a.characteristics() & (-16465);
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.f0 m8trySplit() {
        return (j$.util.f0) trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.Z m6trySplit() {
        return (j$.util.Z) trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.c0 m7trySplit() {
        return (j$.util.c0) trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.W m5trySplit() {
        return (j$.util.W) trySplit();
    }
}
