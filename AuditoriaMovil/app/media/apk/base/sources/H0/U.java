package H0;

import D.AbstractC0059i;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class U {

    /* renamed from: q  reason: collision with root package name */
    public static final Object f1722q = new Object();

    /* renamed from: r  reason: collision with root package name */
    public static final C f1723r;

    /* renamed from: b  reason: collision with root package name */
    public Object f1725b;

    /* renamed from: d  reason: collision with root package name */
    public Object f1727d;

    /* renamed from: e  reason: collision with root package name */
    public long f1728e;
    public long f;

    /* renamed from: g  reason: collision with root package name */
    public long f1729g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1730h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1731i;
    public C0144y j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1732k;

    /* renamed from: l  reason: collision with root package name */
    public long f1733l;

    /* renamed from: m  reason: collision with root package name */
    public long f1734m;

    /* renamed from: n  reason: collision with root package name */
    public int f1735n;

    /* renamed from: o  reason: collision with root package name */
    public int f1736o;

    /* renamed from: p  reason: collision with root package name */
    public long f1737p;

    /* renamed from: a  reason: collision with root package name */
    public Object f1724a = f1722q;

    /* renamed from: c  reason: collision with root package name */
    public C f1726c = f1723r;

    /* JADX WARN: Type inference failed for: r10v0, types: [H0.w, H0.v] */
    static {
        C0145z c0145z;
        C0140u c0140u = new C0140u();
        A3.I i7 = A3.K.f98b;
        A3.e0 e0Var = A3.e0.f138e;
        List emptyList = Collections.emptyList();
        A3.e0 e0Var2 = A3.e0.f138e;
        C0143x c0143x = new C0143x();
        A a7 = A.f1640a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            c0145z = new C0145z(uri, null, null, emptyList, e0Var2, -9223372036854775807L);
        } else {
            c0145z = null;
        }
        f1723r = new C("androidx.media3.common.Timeline", new C0141v(c0140u), c0145z, new C0144y(c0143x), F.f1669y, a7);
        AbstractC0059i.F(1, 2, 3, 4, 5);
        AbstractC0059i.F(6, 7, 8, 9, 10);
        K0.x.H(11);
        K0.x.H(12);
        K0.x.H(13);
    }

    public final boolean a() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public final void b(C c8, Object obj, long j, long j8, long j9, boolean z7, boolean z8, C0144y c0144y, long j10, long j11, int i7, long j12) {
        C c9;
        this.f1724a = f1722q;
        if (c8 != null) {
            c9 = c8;
        } else {
            c9 = f1723r;
        }
        this.f1726c = c9;
        if (c8 != null) {
            C0145z c0145z = c8.f1642b;
        }
        this.f1727d = obj;
        this.f1728e = j;
        this.f = j8;
        this.f1729g = j9;
        this.f1730h = z7;
        this.f1731i = z8;
        this.j = c0144y;
        this.f1733l = j10;
        this.f1734m = j11;
        this.f1735n = 0;
        this.f1736o = i7;
        this.f1737p = j12;
        this.f1732k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !U.class.equals(obj.getClass())) {
            return false;
        }
        U u7 = (U) obj;
        if (K0.x.a(this.f1724a, u7.f1724a) && K0.x.a(this.f1726c, u7.f1726c) && K0.x.a(this.f1727d, u7.f1727d) && K0.x.a(this.j, u7.j) && this.f1728e == u7.f1728e && this.f == u7.f && this.f1729g == u7.f1729g && this.f1730h == u7.f1730h && this.f1731i == u7.f1731i && this.f1732k == u7.f1732k && this.f1733l == u7.f1733l && this.f1734m == u7.f1734m && this.f1735n == u7.f1735n && this.f1736o == u7.f1736o && this.f1737p == u7.f1737p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1726c.hashCode() + ((this.f1724a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f1727d;
        int i7 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i8 = (hashCode2 + hashCode) * 31;
        C0144y c0144y = this.j;
        if (c0144y != null) {
            i7 = c0144y.hashCode();
        }
        long j = this.f1728e;
        long j8 = this.f;
        long j9 = this.f1729g;
        long j10 = this.f1733l;
        long j11 = this.f1734m;
        long j12 = this.f1737p;
        return ((((((((((((((((((((((i8 + i7) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + (this.f1730h ? 1 : 0)) * 31) + (this.f1731i ? 1 : 0)) * 31) + (this.f1732k ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f1735n) * 31) + this.f1736o) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }
}
