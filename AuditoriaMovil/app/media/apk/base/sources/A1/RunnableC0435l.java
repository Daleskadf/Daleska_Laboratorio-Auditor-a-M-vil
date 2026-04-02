package a1;

import A3.N;
import A3.j0;
import android.os.Handler;
import java.io.Closeable;
/* renamed from: a1.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0435l implements Runnable, Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f6845a = K0.x.n(null);

    /* renamed from: b  reason: collision with root package name */
    public final long f6846b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6847c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0436m f6848d;

    public RunnableC0435l(C0436m c0436m, long j) {
        this.f6848d = c0436m;
        this.f6846b = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6847c = false;
        this.f6845a.removeCallbacks(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0436m c0436m = this.f6848d;
        N n7 = c0436m.f6849X;
        n7.r(n7.h(4, c0436m.f6858f0, j0.f157X, c0436m.f6850Y));
        this.f6845a.postDelayed(this, this.f6846b);
    }
}
