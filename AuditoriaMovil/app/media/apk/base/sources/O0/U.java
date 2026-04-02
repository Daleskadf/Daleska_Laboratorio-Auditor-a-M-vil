package O0;

import e1.C0960z;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final C0960z f3626a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3627b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3628c;

    /* renamed from: d  reason: collision with root package name */
    public final long f3629d;

    /* renamed from: e  reason: collision with root package name */
    public final long f3630e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3631g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3632h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f3633i;

    public U(C0960z c0960z, long j, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (z10 && !z8) {
            z11 = false;
        } else {
            z11 = true;
        }
        K0.a.e(z11);
        if (z9 && !z8) {
            z12 = false;
        } else {
            z12 = true;
        }
        K0.a.e(z12);
        if (z7 && (z8 || z9 || z10)) {
            z13 = false;
        }
        K0.a.e(z13);
        this.f3626a = c0960z;
        this.f3627b = j;
        this.f3628c = j8;
        this.f3629d = j9;
        this.f3630e = j10;
        this.f = z7;
        this.f3631g = z8;
        this.f3632h = z9;
        this.f3633i = z10;
    }

    public final U a(long j) {
        if (j == this.f3628c) {
            return this;
        }
        return new U(this.f3626a, this.f3627b, j, this.f3629d, this.f3630e, this.f, this.f3631g, this.f3632h, this.f3633i);
    }

    public final U b(long j) {
        if (j == this.f3627b) {
            return this;
        }
        return new U(this.f3626a, j, this.f3628c, this.f3629d, this.f3630e, this.f, this.f3631g, this.f3632h, this.f3633i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U.class != obj.getClass()) {
            return false;
        }
        U u7 = (U) obj;
        if (this.f3627b == u7.f3627b && this.f3628c == u7.f3628c && this.f3629d == u7.f3629d && this.f3630e == u7.f3630e && this.f == u7.f && this.f3631g == u7.f3631g && this.f3632h == u7.f3632h && this.f3633i == u7.f3633i && K0.x.a(this.f3626a, u7.f3626a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f3626a.hashCode() + 527) * 31) + ((int) this.f3627b)) * 31) + ((int) this.f3628c)) * 31) + ((int) this.f3629d)) * 31) + ((int) this.f3630e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.f3631g ? 1 : 0)) * 31) + (this.f3632h ? 1 : 0)) * 31) + (this.f3633i ? 1 : 0);
    }
}
