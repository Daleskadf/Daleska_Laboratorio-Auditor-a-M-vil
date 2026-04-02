package u4;

import java.util.Date;
import p4.P;
import t4.RunnableC1822b;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final e f16007a;

    /* renamed from: b  reason: collision with root package name */
    public final d f16008b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16009c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16010d;

    /* renamed from: e  reason: collision with root package name */
    public long f16011e;

    /* renamed from: h  reason: collision with root package name */
    public P f16013h;

    /* renamed from: g  reason: collision with root package name */
    public long f16012g = new Date().getTime();
    public long f = 0;

    public l(e eVar, d dVar, long j, long j8) {
        this.f16007a = eVar;
        this.f16008b = dVar;
        this.f16009c = j;
        this.f16010d = j8;
        this.f16011e = j8;
    }

    public final void a(Runnable runnable) {
        P p7 = this.f16013h;
        if (p7 != null) {
            p7.b();
            this.f16013h = null;
        }
        long random = this.f + ((long) ((Math.random() - 0.5d) * this.f));
        long max = Math.max(0L, new Date().getTime() - this.f16012g);
        long max2 = Math.max(0L, random - max);
        if (this.f > 0) {
            q.a(l.class.getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(max2), Long.valueOf(this.f), Long.valueOf(random), Long.valueOf(max));
        }
        this.f16013h = this.f16007a.b(this.f16008b, max2, new RunnableC1822b(9, this, runnable));
        long j = (long) (this.f * 1.5d);
        this.f = j;
        long j8 = this.f16009c;
        if (j < j8) {
            this.f = j8;
        } else {
            long j9 = this.f16011e;
            if (j > j9) {
                this.f = j9;
            }
        }
        this.f16011e = this.f16010d;
    }
}
