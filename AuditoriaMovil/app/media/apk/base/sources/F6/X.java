package F6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class X implements Runnable, Comparable, S {
    private volatile Object _heap;

    /* renamed from: a  reason: collision with root package name */
    public long f1245a;

    /* renamed from: b  reason: collision with root package name */
    public int f1246b = -1;

    public X(long j) {
        this.f1245a = j;
    }

    @Override // F6.S
    public final void a() {
        Y y2;
        synchronized (this) {
            try {
                Object obj = this._heap;
                K6.w wVar = H.f1221b;
                if (obj == wVar) {
                    return;
                }
                if (obj instanceof Y) {
                    y2 = (Y) obj;
                } else {
                    y2 = null;
                }
                if (y2 != null) {
                    y2.c(this);
                }
                this._heap = wVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final K6.z c() {
        Object obj = this._heap;
        if (obj instanceof K6.z) {
            return (K6.z) obj;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int i7 = ((this.f1245a - ((X) obj).f1245a) > 0L ? 1 : ((this.f1245a - ((X) obj).f1245a) == 0L ? 0 : -1));
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        return 0;
    }

    public final int d(long j, Y y2, Z z7) {
        X x7;
        boolean z8;
        synchronized (this) {
            if (this._heap == H.f1221b) {
                return 2;
            }
            synchronized (y2) {
                X[] xArr = y2.f2814a;
                if (xArr != null) {
                    x7 = xArr[0];
                } else {
                    x7 = null;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z.f1248X;
                z7.getClass();
                if (Z.f1250Z.get(z7) != 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    return 1;
                }
                if (x7 == null) {
                    y2.f1247c = j;
                } else {
                    long j8 = x7.f1245a;
                    if (j8 - j < 0) {
                        j = j8;
                    }
                    if (j - y2.f1247c > 0) {
                        y2.f1247c = j;
                    }
                }
                long j9 = this.f1245a;
                long j10 = y2.f1247c;
                if (j9 - j10 < 0) {
                    this.f1245a = j10;
                }
                y2.a(this);
                return 0;
            }
        }
    }

    public final void e(Y y2) {
        if (this._heap != H.f1221b) {
            this._heap = y2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public String toString() {
        return "Delayed[nanos=" + this.f1245a + ']';
    }
}
