package h1;

import A3.AbstractC0021t;
import A3.H;
import A3.K;
import H0.W;
import K0.x;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
/* renamed from: h1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068b extends AbstractC1069c {

    /* renamed from: g  reason: collision with root package name */
    public final i1.d f11219g;

    /* renamed from: h  reason: collision with root package name */
    public final long f11220h;

    /* renamed from: i  reason: collision with root package name */
    public final long f11221i;
    public final long j;

    /* renamed from: k  reason: collision with root package name */
    public final int f11222k;

    /* renamed from: l  reason: collision with root package name */
    public final int f11223l;

    /* renamed from: m  reason: collision with root package name */
    public final float f11224m;

    /* renamed from: n  reason: collision with root package name */
    public final float f11225n;

    /* renamed from: o  reason: collision with root package name */
    public final K f11226o;

    /* renamed from: p  reason: collision with root package name */
    public final K0.s f11227p;

    /* renamed from: q  reason: collision with root package name */
    public float f11228q;

    /* renamed from: r  reason: collision with root package name */
    public int f11229r;

    /* renamed from: s  reason: collision with root package name */
    public int f11230s;

    /* renamed from: t  reason: collision with root package name */
    public long f11231t;

    /* renamed from: u  reason: collision with root package name */
    public f1.l f11232u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1068b(W w2, int[] iArr, i1.d dVar, long j, long j8, long j9, K k2) {
        super(w2, iArr);
        K0.s sVar = K0.s.f2519a;
        if (j9 < j) {
            K0.a.A("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j9 = j;
        }
        this.f11219g = dVar;
        this.f11220h = j * 1000;
        this.f11221i = j8 * 1000;
        this.j = j9 * 1000;
        this.f11222k = 1279;
        this.f11223l = 719;
        this.f11224m = 0.7f;
        this.f11225n = 0.75f;
        this.f11226o = K.p(k2);
        this.f11227p = sVar;
        this.f11228q = 1.0f;
        this.f11230s = 0;
        this.f11231t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j8 : jArr) {
            j += j8;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            H h8 = (H) arrayList.get(i7);
            if (h8 != null) {
                h8.a(new C1067a(j, jArr[i7]));
            }
        }
    }

    public static long x(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        f1.l lVar = (f1.l) AbstractC0021t.l(list);
        long j = lVar.f11000X;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = lVar.f11001Y;
        if (j8 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j8 - j;
    }

    @Override // h1.AbstractC1069c, h1.r
    public final void e() {
        this.f11231t = -9223372036854775807L;
        this.f11232u = null;
    }

    @Override // h1.AbstractC1069c, h1.r
    public final void g() {
        this.f11232u = null;
    }

    @Override // h1.r
    public final int k() {
        return this.f11230s;
    }

    @Override // h1.r
    public final int l() {
        return this.f11229r;
    }

    @Override // h1.AbstractC1069c, h1.r
    public final void n(float f) {
        this.f11228q = f;
    }

    @Override // h1.r
    public final Object o() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    @Override // h1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(long r14, long r16, long r18, java.util.List r20, f1.m[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            K0.s r2 = r0.f11227p
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f11229r
            int r5 = r1.length
            if (r4 >= r5) goto L27
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L27
            int r4 = r0.f11229r
            r1 = r1[r4]
            long r4 = r1.a()
            long r6 = r1.r()
        L25:
            long r4 = r4 - r6
            goto L43
        L27:
            int r4 = r1.length
            r5 = 0
        L29:
            if (r5 >= r4) goto L3f
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3c
            long r4 = r6.a()
            long r6 = r6.r()
            goto L25
        L3c:
            int r5 = r5 + 1
            goto L29
        L3f:
            long r4 = x(r20)
        L43:
            int r1 = r0.f11230s
            if (r1 != 0) goto L51
            r1 = 1
            r0.f11230s = r1
            int r1 = r13.w(r2)
            r0.f11229r = r1
            return
        L51:
            int r6 = r0.f11229r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5c
            r7 = r8
            goto L68
        L5c:
            java.lang.Object r7 = A3.AbstractC0021t.l(r20)
            f1.l r7 = (f1.l) r7
            H0.r r7 = r7.f11006d
            int r7 = r13.r(r7)
        L68:
            if (r7 == r8) goto L73
            java.lang.Object r1 = A3.AbstractC0021t.l(r20)
            f1.l r1 = (f1.l) r1
            int r1 = r1.f11007e
            r6 = r7
        L73:
            int r7 = r13.w(r2)
            if (r7 == r6) goto Lb7
            boolean r2 = r13.c(r6, r2)
            if (r2 != 0) goto Lb7
            H0.r[] r2 = r0.f11236d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f11220h
            if (r10 != 0) goto L91
            goto La3
        L91:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L98
            long r4 = r18 - r4
            goto L9a
        L98:
            r4 = r18
        L9a:
            float r4 = (float) r4
            float r5 = r0.f11225n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La3:
            int r2 = r2.f1883i
            int r3 = r3.f1883i
            if (r2 <= r3) goto Lae
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lae
            goto Lb6
        Lae:
            if (r2 >= r3) goto Lb7
            long r2 = r0.f11221i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb7
        Lb6:
            r7 = r6
        Lb7:
            if (r7 != r6) goto Lba
            goto Lbb
        Lba:
            r1 = 3
        Lbb:
            r0.f11230s = r1
            r0.f11229r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C1068b.q(long, long, long, java.util.List, f1.m[]):void");
    }

    @Override // h1.AbstractC1069c, h1.r
    public final int t(List list, long j) {
        f1.l lVar;
        int i7;
        int i8;
        this.f11227p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = this.f11231t;
        if (j8 != -9223372036854775807L && elapsedRealtime - j8 < 1000 && (list.isEmpty() || ((f1.l) AbstractC0021t.l(list)).equals(this.f11232u))) {
            return list.size();
        }
        this.f11231t = elapsedRealtime;
        if (list.isEmpty()) {
            lVar = null;
        } else {
            lVar = (f1.l) AbstractC0021t.l(list);
        }
        this.f11232u = lVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long C7 = x.C(((f1.l) list.get(size - 1)).f11000X - j, this.f11228q);
        long j9 = this.j;
        if (C7 < j9) {
            return size;
        }
        x(list);
        H0.r rVar = this.f11236d[w(elapsedRealtime)];
        for (int i9 = 0; i9 < size; i9++) {
            f1.l lVar2 = (f1.l) list.get(i9);
            H0.r rVar2 = lVar2.f11006d;
            if (x.C(lVar2.f11000X - j, this.f11228q) >= j9 && rVar2.f1883i < rVar.f1883i && (i7 = rVar2.f1893t) != -1 && i7 <= this.f11223l && (i8 = rVar2.f1892s) != -1 && i8 <= this.f11222k && i7 < rVar.f1893t) {
                return i9;
            }
        }
        return size;
    }

    public final int w(long j) {
        long j8;
        long j9;
        i1.g gVar = (i1.g) this.f11219g;
        synchronized (gVar) {
            j8 = gVar.f11411k;
        }
        this.f11219g.getClass();
        long j10 = (((float) j8) * this.f11224m) / this.f11228q;
        if (!this.f11226o.isEmpty()) {
            int i7 = 1;
            while (i7 < this.f11226o.size() - 1 && ((C1067a) this.f11226o.get(i7)).f11217a < j10) {
                i7++;
            }
            C1067a c1067a = (C1067a) this.f11226o.get(i7 - 1);
            C1067a c1067a2 = (C1067a) this.f11226o.get(i7);
            long j11 = c1067a.f11217a;
            float f = ((float) (j10 - j11)) / ((float) (c1067a2.f11217a - j11));
            j10 = c1067a.f11218b + (f * ((float) (c1067a2.f11218b - j9)));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f11234b; i9++) {
            if (j == Long.MIN_VALUE || !c(i9, j)) {
                if (d(i9).f1883i <= j10) {
                    return i9;
                }
                i8 = i9;
            }
        }
        return i8;
    }
}
