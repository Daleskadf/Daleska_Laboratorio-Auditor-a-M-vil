package O0;

import android.os.SystemClock;
/* loaded from: classes.dex */
public final class m0 implements S {

    /* renamed from: a  reason: collision with root package name */
    public final K0.s f3802a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3803b;

    /* renamed from: c  reason: collision with root package name */
    public long f3804c;

    /* renamed from: d  reason: collision with root package name */
    public long f3805d;

    /* renamed from: e  reason: collision with root package name */
    public H0.L f3806e = H0.L.f1700d;

    public m0(K0.s sVar) {
        this.f3802a = sVar;
    }

    @Override // O0.S
    public final /* synthetic */ boolean a() {
        return false;
    }

    public final void b(long j) {
        this.f3804c = j;
        if (this.f3803b) {
            this.f3802a.getClass();
            this.f3805d = SystemClock.elapsedRealtime();
        }
    }

    @Override // O0.S
    public final H0.L c() {
        return this.f3806e;
    }

    @Override // O0.S
    public final long d() {
        long j;
        long j8 = this.f3804c;
        if (this.f3803b) {
            this.f3802a.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3805d;
            H0.L l8 = this.f3806e;
            if (l8.f1701a == 1.0f) {
                j = K0.x.M(elapsedRealtime);
            } else {
                j = elapsedRealtime * l8.f1703c;
            }
            return j8 + j;
        }
        return j8;
    }

    @Override // O0.S
    public final void e(H0.L l8) {
        if (this.f3803b) {
            b(d());
        }
        this.f3806e = l8;
    }

    public final void f() {
        if (!this.f3803b) {
            this.f3802a.getClass();
            this.f3805d = SystemClock.elapsedRealtime();
            this.f3803b = true;
        }
    }
}
