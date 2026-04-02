package e1;

import A3.e0;
import H0.C0122b;
import H0.C0140u;
import H0.C0143x;
import H0.C0144y;
import H0.C0145z;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class Y extends H0.V {

    /* renamed from: n  reason: collision with root package name */
    public static final Object f10757n = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f10758b;

    /* renamed from: c  reason: collision with root package name */
    public final long f10759c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10760d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10761e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10762g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10763h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10764i;
    public final boolean j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f10765k;

    /* renamed from: l  reason: collision with root package name */
    public final H0.C f10766l;

    /* renamed from: m  reason: collision with root package name */
    public final C0144y f10767m;

    static {
        C0140u c0140u = new C0140u();
        A3.I i7 = A3.K.f98b;
        e0 e0Var = e0.f138e;
        List emptyList = Collections.emptyList();
        e0 e0Var2 = e0.f138e;
        C0143x c0143x = new C0143x();
        H0.A a7 = H0.A.f1640a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new C0145z(uri, null, null, emptyList, e0Var2, -9223372036854775807L);
        }
        c0140u.a();
        c0143x.a();
        H0.F f = H0.F.f1669y;
    }

    public Y(long j, boolean z7, boolean z8, H0.C c8) {
        this(j, j, 0L, 0L, z7, false, z8, null, c8);
    }

    @Override // H0.V
    public final int b(Object obj) {
        if (f10757n.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // H0.V
    public final H0.T f(int i7, H0.T t7, boolean z7) {
        Object obj;
        K0.a.g(i7, 1);
        if (z7) {
            obj = f10757n;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        t7.getClass();
        C0122b c0122b = C0122b.f1785c;
        t7.h(null, obj2, 0, this.f10760d, -this.f, c0122b, false);
        return t7;
    }

    @Override // H0.V
    public final int h() {
        return 1;
    }

    @Override // H0.V
    public final Object l(int i7) {
        K0.a.g(i7, 1);
        return f10757n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1 > r3) goto L9;
     */
    @Override // H0.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H0.U m(int r23, H0.U r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            K0.a.g(r2, r1)
            long r1 = r0.f10762g
            boolean r13 = r0.f10764i
            if (r13 == 0) goto L2c
            boolean r3 = r0.j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f10761e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = H0.U.f1722q
            H0.y r14 = r0.f10767m
            long r1 = r0.f10761e
            r17 = r1
            H0.C r4 = r0.f10766l
            java.lang.Object r5 = r0.f10765k
            long r6 = r0.f10758b
            long r8 = r0.f10759c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r12 = r0.f10763h
            r19 = 0
            long r1 = r0.f
            r20 = r1
            r3 = r24
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.Y.m(int, H0.U, long):H0.U");
    }

    @Override // H0.V
    public final int o() {
        return 1;
    }

    public Y(long j, long j8, long j9, long j10, boolean z7, boolean z8, boolean z9, Object obj, H0.C c8) {
        this(-9223372036854775807L, -9223372036854775807L, j, j8, j9, j10, z7, z8, false, obj, c8, z9 ? c8.f1643c : null);
    }

    public Y(long j, long j8, long j9, long j10, long j11, long j12, boolean z7, boolean z8, boolean z9, Object obj, H0.C c8, C0144y c0144y) {
        this.f10758b = j;
        this.f10759c = j8;
        this.f10760d = j9;
        this.f10761e = j10;
        this.f = j11;
        this.f10762g = j12;
        this.f10763h = z7;
        this.f10764i = z8;
        this.j = z9;
        this.f10765k = obj;
        c8.getClass();
        this.f10766l = c8;
        this.f10767m = c0144y;
    }
}
