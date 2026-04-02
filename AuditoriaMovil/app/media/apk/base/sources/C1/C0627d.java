package c1;

import D.C0054d;
import H0.C0145z;
import H0.D;
import K0.x;
import M0.C;
import M0.g;
import M0.h;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.firebase.firestore.Z;
import e1.AbstractC0936a;
import e1.C0960z;
import e1.InterfaceC0957w;
import e1.InterfaceC0958x;
import e1.Y;
import e1.r;
import f1.C0986h;
import f5.C0993a;
import i1.e;
import i1.i;
import i1.k;
import i1.n;
import i1.o;
import i1.p;
import i1.q;
import java.util.ArrayList;
import java.util.regex.Matcher;
/* renamed from: c1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627d extends AbstractC0936a implements i {

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f8349Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Uri f8350Z;

    /* renamed from: e0  reason: collision with root package name */
    public final g f8351e0;

    /* renamed from: f0  reason: collision with root package name */
    public final C0054d f8352f0;

    /* renamed from: g0  reason: collision with root package name */
    public final C0993a f8353g0;

    /* renamed from: h0  reason: collision with root package name */
    public final T0.g f8354h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Z f8355i0;

    /* renamed from: j0  reason: collision with root package name */
    public final long f8356j0;

    /* renamed from: k0  reason: collision with root package name */
    public final T0.d f8357k0;

    /* renamed from: l0  reason: collision with root package name */
    public final p f8358l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f8359m0;

    /* renamed from: n0  reason: collision with root package name */
    public h f8360n0;

    /* renamed from: o0  reason: collision with root package name */
    public n f8361o0;

    /* renamed from: p0  reason: collision with root package name */
    public o f8362p0;
    public C q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f8363r0;

    /* renamed from: s0  reason: collision with root package name */
    public d1.c f8364s0;

    /* renamed from: t0  reason: collision with root package name */
    public Handler f8365t0;

    /* renamed from: u0  reason: collision with root package name */
    public H0.C f8366u0;

    static {
        D.a("media3.exoplayer.smoothstreaming");
    }

    public C0627d(H0.C c8, g gVar, p pVar, C0054d c0054d, C0993a c0993a, T0.g gVar2, Z z7, long j) {
        this.f8366u0 = c8;
        C0145z c0145z = c8.f1642b;
        c0145z.getClass();
        this.f8364s0 = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = c0145z.f1914a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = x.j.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.f8350Z = uri2;
        this.f8351e0 = gVar;
        this.f8358l0 = pVar;
        this.f8352f0 = c0054d;
        this.f8353g0 = c0993a;
        this.f8354h0 = gVar2;
        this.f8355i0 = z7;
        this.f8356j0 = j;
        this.f8357k0 = a(null);
        this.f8349Y = false;
        this.f8359m0 = new ArrayList();
    }

    @Override // i1.i
    public final void E(k kVar, long j, long j8, boolean z7) {
        q qVar = (q) kVar;
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        this.f8355i0.getClass();
        this.f8357k0.c(rVar, qVar.f11434c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // e1.AbstractC0936a
    public final InterfaceC0958x b(C0960z c0960z, e eVar, long j) {
        T0.d a7 = a(c0960z);
        T0.d dVar = new T0.d(this.f10774d.f5289c, 0, c0960z);
        d1.c cVar = this.f8364s0;
        C c8 = this.q0;
        o oVar = this.f8362p0;
        C0625b c0625b = new C0625b(cVar, this.f8352f0, c8, this.f8353g0, this.f8354h0, dVar, this.f8355i0, a7, oVar, eVar);
        this.f8359m0.add(c0625b);
        return c0625b;
    }

    @Override // e1.AbstractC0936a
    public final synchronized H0.C h() {
        return this.f8366u0;
    }

    @Override // i1.i
    public final void j(k kVar, long j, long j8) {
        q qVar = (q) kVar;
        long j9 = qVar.f11432a;
        Uri uri = qVar.f11435d.f3133c;
        r rVar = new r(j8);
        this.f8355i0.getClass();
        this.f8357k0.e(rVar, qVar.f11434c);
        this.f8364s0 = (d1.c) qVar.f;
        this.f8363r0 = j - j8;
        u();
        if (this.f8364s0.f10191d) {
            this.f8365t0.postDelayed(new RunnableC0626c(this, 0), Math.max(0L, (this.f8363r0 + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    @Override // e1.AbstractC0936a
    public final void k() {
        this.f8362p0.a();
    }

    @Override // e1.AbstractC0936a
    public final void m(C c8) {
        this.q0 = c8;
        Looper myLooper = Looper.myLooper();
        P0.k kVar = this.f10770X;
        K0.a.k(kVar);
        T0.g gVar = this.f8354h0;
        gVar.p(myLooper, kVar);
        gVar.b();
        if (this.f8349Y) {
            this.f8362p0 = new e5.b(18);
            u();
            return;
        }
        this.f8360n0 = this.f8351e0.a();
        n nVar = new n("SsMediaSource");
        this.f8361o0 = nVar;
        this.f8362p0 = nVar;
        this.f8365t0 = x.n(null);
        v();
    }

    @Override // e1.AbstractC0936a
    public final void o(InterfaceC0958x interfaceC0958x) {
        C0625b c0625b = (C0625b) interfaceC0958x;
        for (C0986h c0986h : c0625b.f8345h0) {
            c0986h.A(null);
        }
        c0625b.f8343f0 = null;
        this.f8359m0.remove(interfaceC0958x);
    }

    @Override // e1.AbstractC0936a
    public final void q() {
        d1.c cVar;
        if (this.f8349Y) {
            cVar = this.f8364s0;
        } else {
            cVar = null;
        }
        this.f8364s0 = cVar;
        this.f8360n0 = null;
        this.f8363r0 = 0L;
        n nVar = this.f8361o0;
        if (nVar != null) {
            nVar.e(null);
            this.f8361o0 = null;
        }
        Handler handler = this.f8365t0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f8365t0 = null;
        }
        this.f8354h0.release();
    }

    @Override // e1.AbstractC0936a
    public final synchronized void t(H0.C c8) {
        this.f8366u0 = c8;
    }

    public final void u() {
        d1.b[] bVarArr;
        long j;
        Y y2;
        long j8;
        C0986h[] c0986hArr;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f8359m0;
            if (i7 >= arrayList.size()) {
                break;
            }
            C0625b c0625b = (C0625b) arrayList.get(i7);
            d1.c cVar = this.f8364s0;
            c0625b.f8344g0 = cVar;
            C0986h[] c0986hArr2 = c0625b.f8345h0;
            int length = c0986hArr2.length;
            int i8 = 0;
            while (i8 < length) {
                C0624a c0624a = (C0624a) c0986hArr2[i8].f11020e;
                d1.b[] bVarArr2 = c0624a.f.f;
                int i9 = c0624a.f8328b;
                d1.b bVar = bVarArr2[i9];
                int i10 = bVar.f10182k;
                d1.b bVar2 = cVar.f[i9];
                if (i10 == 0 || bVar2.f10182k == 0) {
                    c0986hArr = c0986hArr2;
                    c0624a.f8332g += i10;
                } else {
                    int i11 = i10 - 1;
                    long[] jArr = bVar.f10186o;
                    long j9 = jArr[i11];
                    c0986hArr = c0986hArr2;
                    long j10 = bVar2.f10186o[0];
                    if (bVar.b(i11) + j9 <= j10) {
                        c0624a.f8332g += i10;
                    } else {
                        c0624a.f8332g = x.f(jArr, j10, true) + c0624a.f8332g;
                    }
                }
                c0624a.f = cVar;
                i8++;
                c0986hArr2 = c0986hArr;
            }
            InterfaceC0957w interfaceC0957w = c0625b.f8343f0;
            interfaceC0957w.getClass();
            interfaceC0957w.B(c0625b);
            i7++;
        }
        long j11 = Long.MIN_VALUE;
        long j12 = Long.MAX_VALUE;
        for (d1.b bVar3 : this.f8364s0.f) {
            if (bVar3.f10182k > 0) {
                long[] jArr2 = bVar3.f10186o;
                j12 = Math.min(j12, jArr2[0]);
                int i12 = bVar3.f10182k - 1;
                j11 = Math.max(j11, bVar3.b(i12) + jArr2[i12]);
            }
        }
        if (j12 == Long.MAX_VALUE) {
            if (this.f8364s0.f10191d) {
                j8 = -9223372036854775807L;
            } else {
                j8 = 0;
            }
            d1.c cVar2 = this.f8364s0;
            boolean z7 = cVar2.f10191d;
            y2 = new Y(j8, 0L, 0L, 0L, true, z7, z7, cVar2, h());
        } else {
            d1.c cVar3 = this.f8364s0;
            if (cVar3.f10191d) {
                long j13 = cVar3.f10194h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j12 = Math.max(j12, j11 - j13);
                }
                long j14 = j12;
                long j15 = j11 - j14;
                long M7 = j15 - x.M(this.f8356j0);
                if (M7 < 5000000) {
                    M7 = Math.min(5000000L, j15 / 2);
                }
                y2 = new Y(-9223372036854775807L, j15, j14, M7, true, true, true, this.f8364s0, h());
            } else {
                long j16 = cVar3.f10193g;
                if (j16 != -9223372036854775807L) {
                    j = j16;
                } else {
                    j = j11 - j12;
                }
                y2 = new Y(-9223372036854775807L, -9223372036854775807L, j12 + j, j, j12, 0L, true, false, false, this.f8364s0, h(), null);
            }
        }
        n(y2);
    }

    public final void v() {
        if (this.f8361o0.c()) {
            return;
        }
        q qVar = new q(this.f8360n0, this.f8350Z, 4, this.f8358l0);
        n nVar = this.f8361o0;
        Z z7 = this.f8355i0;
        int i7 = qVar.f11434c;
        this.f8357k0.k(new r(qVar.f11432a, qVar.f11433b, nVar.f(qVar, this, z7.w(i7))), i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // i1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T1.e y(i1.k r4, long r5, long r7, java.io.IOException r9, int r10) {
        /*
            r3 = this;
            r5 = 0
            i1.q r4 = (i1.q) r4
            e1.r r6 = new e1.r
            long r0 = r4.f11432a
            M0.B r0 = r4.f11435d
            android.net.Uri r0 = r0.f3133c
            r6.<init>(r7)
            com.google.firebase.firestore.Z r7 = r3.f8355i0
            r7.getClass()
            boolean r7 = r9 instanceof H0.J
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof M0.t
            if (r7 != 0) goto L4c
            boolean r7 = r9 instanceof i1.m
            if (r7 != 0) goto L4c
            int r7 = M0.i.f3158b
            r7 = r9
        L2b:
            if (r7 == 0) goto L40
            boolean r8 = r7 instanceof M0.i
            if (r8 == 0) goto L3b
            r8 = r7
            M0.i r8 = (M0.i) r8
            int r8 = r8.f3159a
            r2 = 2008(0x7d8, float:2.814E-42)
            if (r8 != r2) goto L3b
            goto L4c
        L3b:
            java.lang.Throwable r7 = r7.getCause()
            goto L2b
        L40:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r10, r7)
            long r7 = (long) r7
            goto L4d
        L4c:
            r7 = r0
        L4d:
            int r10 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r10 != 0) goto L54
            T1.e r5 = i1.n.f
            goto L5a
        L54:
            T1.e r10 = new T1.e
            r10.<init>(r5, r7, r5)
            r5 = r10
        L5a:
            boolean r7 = r5.a()
            r7 = r7 ^ 1
            T0.d r8 = r3.f8357k0
            int r4 = r4.f11434c
            r8.i(r6, r4, r9, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.C0627d.y(i1.k, long, long, java.io.IOException, int):T1.e");
    }
}
