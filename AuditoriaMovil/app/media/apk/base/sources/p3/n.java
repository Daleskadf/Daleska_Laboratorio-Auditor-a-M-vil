package p3;

import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f15112a;

    /* renamed from: b  reason: collision with root package name */
    public final long f15113b;

    /* renamed from: c  reason: collision with root package name */
    public long f15114c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f15115d = 0;

    /* renamed from: e  reason: collision with root package name */
    public long f15116e = Long.MAX_VALUE;
    public int f = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: g  reason: collision with root package name */
    public float f15117g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15118h = true;

    /* renamed from: i  reason: collision with root package name */
    public long f15119i = -1;
    public int j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f15120k = 0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15121l = false;

    /* renamed from: m  reason: collision with root package name */
    public WorkSource f15122m = null;

    public n(int i7, long j) {
        this.f15112a = 102;
        com.google.android.gms.common.internal.I.a("intervalMillis must be greater than or equal to 0", j >= 0);
        this.f15113b = j;
        z.b(i7);
        this.f15112a = i7;
    }

    public final LocationRequest a() {
        long j;
        int i7 = this.f15112a;
        long j8 = this.f15113b;
        long j9 = this.f15114c;
        if (j9 == -1) {
            j9 = j8;
        } else if (i7 != 105) {
            j9 = Math.min(j9, j8);
        }
        long max = Math.max(this.f15115d, this.f15113b);
        long j10 = this.f15116e;
        int i8 = this.f;
        float f = this.f15117g;
        boolean z7 = this.f15118h;
        long j11 = this.f15119i;
        if (j11 == -1) {
            j = this.f15113b;
        } else {
            j = j11;
        }
        return new LocationRequest(i7, j8, j9, max, Long.MAX_VALUE, j10, i8, f, z7, j, this.j, this.f15120k, this.f15121l, new WorkSource(this.f15122m), null);
    }

    public final void b(int i7) {
        int i8;
        boolean z7;
        if (i7 != 0 && i7 != 1) {
            i8 = 2;
            if (i7 != 2) {
                i8 = i7;
                z7 = false;
                com.google.android.gms.common.internal.I.b("granularity %d must be a Granularity.GRANULARITY_* constant", z7, Integer.valueOf(i8));
                this.j = i7;
            }
        } else {
            i8 = i7;
        }
        z7 = true;
        com.google.android.gms.common.internal.I.b("granularity %d must be a Granularity.GRANULARITY_* constant", z7, Integer.valueOf(i8));
        this.j = i7;
    }

    public final void c(long j) {
        boolean z7 = true;
        if (j != -1 && j < 0) {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z7);
        this.f15119i = j;
    }

    public final void d(long j) {
        boolean z7 = true;
        if (j != -1 && j < 0) {
            z7 = false;
        }
        com.google.android.gms.common.internal.I.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z7);
        this.f15114c = j;
    }
}
