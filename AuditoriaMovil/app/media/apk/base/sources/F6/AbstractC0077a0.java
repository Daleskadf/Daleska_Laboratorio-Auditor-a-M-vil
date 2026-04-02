package F6;

import m6.C1445f;
/* renamed from: F6.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0077a0 extends B {
    public static final /* synthetic */ int f = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f1252c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1253d;

    /* renamed from: e  reason: collision with root package name */
    public C1445f f1254e;

    public final void g(boolean z7) {
        long j;
        long j8 = this.f1252c;
        if (z7) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        long j9 = j8 - j;
        this.f1252c = j9;
        if (j9 <= 0 && this.f1253d) {
            shutdown();
        }
    }

    public abstract Thread j();

    public final void m(boolean z7) {
        long j;
        long j8 = this.f1252c;
        if (z7) {
            j = 4294967296L;
        } else {
            j = 1;
        }
        this.f1252c = j + j8;
        if (!z7) {
            this.f1253d = true;
        }
    }

    public abstract long n();

    public final boolean o() {
        Object removeFirst;
        C1445f c1445f = this.f1254e;
        if (c1445f == null) {
            return false;
        }
        if (c1445f.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = c1445f.removeFirst();
        }
        O o7 = (O) removeFirst;
        if (o7 == null) {
            return false;
        }
        o7.run();
        return true;
    }

    public void p(long j, X x7) {
        I.f1229e0.t(j, x7);
    }

    public abstract void shutdown();
}
