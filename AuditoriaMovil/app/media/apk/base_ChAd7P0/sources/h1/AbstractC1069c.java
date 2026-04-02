package h1;

import H0.W;
import K0.x;
import android.os.SystemClock;
import f1.AbstractC0983e;
import java.util.Arrays;
import java.util.List;
/* renamed from: h1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1069c implements r {

    /* renamed from: a  reason: collision with root package name */
    public final W f11233a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11234b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f11235c;

    /* renamed from: d  reason: collision with root package name */
    public final H0.r[] f11236d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f11237e;
    public int f;

    public AbstractC1069c(W w2, int[] iArr) {
        boolean z7;
        int i7 = 0;
        if (iArr.length > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        w2.getClass();
        this.f11233a = w2;
        int length = iArr.length;
        this.f11234b = length;
        this.f11236d = new H0.r[length];
        for (int i8 = 0; i8 < iArr.length; i8++) {
            this.f11236d[i8] = w2.f1742d[iArr[i8]];
        }
        Arrays.sort(this.f11236d, new K1.d(8));
        this.f11235c = new int[this.f11234b];
        while (true) {
            int i9 = this.f11234b;
            if (i7 < i9) {
                this.f11235c[i7] = w2.b(this.f11236d[i7]);
                i7++;
            } else {
                this.f11237e = new long[i9];
                return;
            }
        }
    }

    @Override // h1.r
    public final /* synthetic */ boolean a(long j, AbstractC0983e abstractC0983e, List list) {
        return false;
    }

    @Override // h1.r
    public final /* synthetic */ void b(boolean z7) {
    }

    @Override // h1.r
    public final boolean c(int i7, long j) {
        if (this.f11237e[i7] > j) {
            return true;
        }
        return false;
    }

    @Override // h1.r
    public final H0.r d(int i7) {
        return this.f11236d[i7];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1069c abstractC1069c = (AbstractC1069c) obj;
        if (this.f11233a.equals(abstractC1069c.f11233a) && Arrays.equals(this.f11235c, abstractC1069c.f11235c)) {
            return true;
        }
        return false;
    }

    @Override // h1.r
    public final int f(int i7) {
        return this.f11235c[i7];
    }

    @Override // h1.r
    public final int h() {
        return this.f11235c[l()];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.f11235c) + (System.identityHashCode(this.f11233a) * 31);
        }
        return this.f;
    }

    @Override // h1.r
    public final W i() {
        return this.f11233a;
    }

    @Override // h1.r
    public final H0.r j() {
        return this.f11236d[l()];
    }

    @Override // h1.r
    public final int length() {
        return this.f11235c.length;
    }

    @Override // h1.r
    public final boolean m(int i7, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean c8 = c(i7, elapsedRealtime);
        for (int i8 = 0; i8 < this.f11234b && !c8; i8++) {
            if (i8 != i7 && !c(i8, elapsedRealtime)) {
                c8 = true;
            } else {
                c8 = false;
            }
        }
        if (!c8) {
            return false;
        }
        long[] jArr = this.f11237e;
        long j8 = jArr[i7];
        int i9 = x.f2529a;
        long j9 = elapsedRealtime + j;
        if (((j ^ j9) & (elapsedRealtime ^ j9)) < 0) {
            j9 = Long.MAX_VALUE;
        }
        jArr[i7] = Math.max(j8, j9);
        return true;
    }

    @Override // h1.r
    public final /* synthetic */ void p() {
    }

    @Override // h1.r
    public final int r(H0.r rVar) {
        for (int i7 = 0; i7 < this.f11234b; i7++) {
            if (this.f11236d[i7] == rVar) {
                return i7;
            }
        }
        return -1;
    }

    @Override // h1.r
    public final /* synthetic */ void s() {
    }

    @Override // h1.r
    public int t(List list, long j) {
        return list.size();
    }

    @Override // h1.r
    public final int u(int i7) {
        for (int i8 = 0; i8 < this.f11234b; i8++) {
            if (this.f11235c[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    @Override // h1.r
    public void e() {
    }

    @Override // h1.r
    public void g() {
    }

    @Override // h1.r
    public void n(float f) {
    }
}
