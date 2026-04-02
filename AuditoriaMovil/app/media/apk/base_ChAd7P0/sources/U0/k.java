package U0;

import A3.I;
import A3.K;
import A3.e0;
import H0.C0135o;
import H0.C0137q;
import H0.G;
import H0.H;
import K0.v;
import K0.x;
import S1.C0333a;
import S1.C0335c;
import S1.C0336d;
import S1.C0338f;
import S1.F;
import android.net.Uri;
import android.text.TextUtils;
import f5.C0993a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.HttpHeaders;
import r3.AbstractC1740d;
/* loaded from: classes.dex */
public final class k extends f1.l {

    /* renamed from: G0  reason: collision with root package name */
    public static final AtomicInteger f5576G0 = new AtomicInteger();

    /* renamed from: A0  reason: collision with root package name */
    public boolean f5577A0;

    /* renamed from: B0  reason: collision with root package name */
    public volatile boolean f5578B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f5579C0;

    /* renamed from: D0  reason: collision with root package name */
    public e0 f5580D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f5581E0;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f5582F0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f5583f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f5584g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Uri f5585h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f5586i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f5587j0;

    /* renamed from: k0  reason: collision with root package name */
    public final M0.h f5588k0;

    /* renamed from: l0  reason: collision with root package name */
    public final M0.l f5589l0;

    /* renamed from: m0  reason: collision with root package name */
    public final b f5590m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f5591n0;

    /* renamed from: o0  reason: collision with root package name */
    public final boolean f5592o0;

    /* renamed from: p0  reason: collision with root package name */
    public final v f5593p0;
    public final c q0;

    /* renamed from: r0  reason: collision with root package name */
    public final List f5594r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C0135o f5595s0;

    /* renamed from: t0  reason: collision with root package name */
    public final A1.h f5596t0;

    /* renamed from: u0  reason: collision with root package name */
    public final K0.q f5597u0;

    /* renamed from: v0  reason: collision with root package name */
    public final boolean f5598v0;

    /* renamed from: w0  reason: collision with root package name */
    public final boolean f5599w0;

    /* renamed from: x0  reason: collision with root package name */
    public b f5600x0;

    /* renamed from: y0  reason: collision with root package name */
    public r f5601y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5602z0;

    public k(c cVar, M0.h hVar, M0.l lVar, H0.r rVar, boolean z7, M0.h hVar2, M0.l lVar2, boolean z8, Uri uri, List list, int i7, Object obj, long j, long j8, long j9, int i8, boolean z9, int i9, boolean z10, boolean z11, v vVar, C0135o c0135o, b bVar, A1.h hVar3, K0.q qVar, boolean z12, P0.k kVar) {
        super(hVar, lVar, rVar, i7, obj, j, j8, j9);
        this.f5598v0 = z7;
        this.f5587j0 = i8;
        this.f5582F0 = z9;
        this.f5584g0 = i9;
        this.f5589l0 = lVar2;
        this.f5588k0 = hVar2;
        this.f5577A0 = lVar2 != null;
        this.f5599w0 = z8;
        this.f5585h0 = uri;
        this.f5591n0 = z11;
        this.f5593p0 = vVar;
        this.f5592o0 = z10;
        this.q0 = cVar;
        this.f5594r0 = list;
        this.f5595s0 = c0135o;
        this.f5590m0 = bVar;
        this.f5596t0 = hVar3;
        this.f5597u0 = qVar;
        this.f5586i0 = z12;
        I i10 = K.f98b;
        this.f5580D0 = e0.f138e;
        this.f5583f0 = f5576G0.getAndIncrement();
    }

    public static byte[] e(String str) {
        int i7;
        if (AbstractC1740d.A(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i7 = byteArray.length - 16;
        } else {
            i7 = 0;
        }
        System.arraycopy(byteArray, i7, bArr, (16 - byteArray.length) + i7, byteArray.length - i7);
        return bArr;
    }

    @Override // i1.k
    public final void b() {
        b bVar;
        this.f5601y0.getClass();
        if (this.f5600x0 == null && (bVar = this.f5590m0) != null) {
            m1.o c8 = bVar.f5540a.c();
            if ((c8 instanceof F) || (c8 instanceof G1.n)) {
                this.f5600x0 = this.f5590m0;
                this.f5577A0 = false;
            }
        }
        if (this.f5577A0) {
            M0.h hVar = this.f5588k0;
            hVar.getClass();
            M0.l lVar = this.f5589l0;
            lVar.getClass();
            d(hVar, lVar, this.f5599w0, false);
            this.f5602z0 = 0;
            this.f5577A0 = false;
        }
        if (!this.f5578B0) {
            if (!this.f5592o0) {
                d(this.f11002Z, this.f11004b, this.f5598v0, true);
            }
            this.f5579C0 = !this.f5578B0;
        }
    }

    @Override // f1.l
    public final boolean c() {
        throw null;
    }

    public final void d(M0.h hVar, M0.l lVar, boolean z7, boolean z8) {
        M0.l a7;
        long j;
        long j8;
        b bVar;
        boolean z9 = false;
        if (z7) {
            if (this.f5602z0 != 0) {
                z9 = true;
            }
            a7 = lVar;
        } else {
            a7 = lVar.a(this.f5602z0);
        }
        try {
            m1.l g3 = g(hVar, a7, z8);
            if (z9) {
                g3.m(this.f5602z0);
            }
            do {
                try {
                    if (this.f5578B0) {
                        break;
                    }
                    bVar = this.f5600x0;
                } catch (EOFException e7) {
                    if ((this.f11006d.f & 16384) != 0) {
                        this.f5600x0.f5540a.a(0L, 0L);
                        j = g3.f13974d;
                        j8 = lVar.f3176e;
                    } else {
                        throw e7;
                    }
                }
            } while (bVar.f5540a.i(g3, b.f) == 0);
            j = g3.f13974d;
            j8 = lVar.f3176e;
            this.f5602z0 = (int) (j - j8);
        } finally {
            m5.d.a(hVar);
        }
    }

    public final int f(int i7) {
        K0.a.j(!this.f5586i0);
        if (i7 >= this.f5580D0.size()) {
            return 0;
        }
        return ((Integer) this.f5580D0.get(i7)).intValue();
    }

    public final m1.l g(M0.h hVar, M0.l lVar, boolean z7) {
        int i7;
        long j;
        String str;
        long j8;
        v vVar;
        long j9;
        b bVar;
        ArrayList arrayList;
        m1.o c0333a;
        boolean z8;
        J1.j jVar;
        boolean z9;
        int i8;
        int i9;
        J1.j jVar2;
        int i10;
        J1.j jVar3;
        int i11;
        long j10;
        boolean z10;
        boolean z11;
        m1.o dVar;
        G[] gArr;
        long e7 = hVar.e(lVar);
        long j11 = this.f11000X;
        v vVar2 = this.f5593p0;
        if (z7) {
            try {
                vVar2.h(j11, this.f5591n0);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e8) {
                throw new IOException(e8);
            }
        }
        m1.l lVar2 = new m1.l(hVar, lVar.f3176e, e7);
        if (this.f5600x0 == null) {
            K0.q qVar = this.f5597u0;
            lVar2.f = 0;
            try {
                qVar.D(10);
                lVar2.q(qVar.f2513a, 0, 10, false);
                if (qVar.x() == 4801587) {
                    qVar.H(3);
                    int t7 = qVar.t();
                    int i12 = t7 + 10;
                    byte[] bArr = qVar.f2513a;
                    if (i12 > bArr.length) {
                        qVar.D(i12);
                        System.arraycopy(bArr, 0, qVar.f2513a, 0, 10);
                    }
                    lVar2.q(qVar.f2513a, 10, t7, false);
                    H j02 = this.f5596t0.j0(qVar.f2513a, t7);
                    if (j02 != null) {
                        for (G g3 : j02.f1692a) {
                            if (g3 instanceof A1.m) {
                                A1.m mVar = (A1.m) g3;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f71b)) {
                                    System.arraycopy(mVar.f72c, 0, qVar.f2513a, 0, 8);
                                    qVar.G(0);
                                    qVar.F(8);
                                    j = qVar.o() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j = -9223372036854775807L;
            lVar2.f = 0;
            b bVar2 = this.f5590m0;
            if (bVar2 != null) {
                m1.o oVar = bVar2.f5540a;
                m1.o c8 = oVar.c();
                if (!(c8 instanceof F) && !(c8 instanceof G1.n)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                K0.a.j(!z10);
                if (oVar.c() == oVar) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                K0.a.i("Can't recreate wrapped extractors. Outer type: " + oVar.getClass(), z11);
                boolean z12 = oVar instanceof u;
                C0993a c0993a = bVar2.f5543d;
                if (z12) {
                    dVar = new u(bVar2.f5541b.f1879d, bVar2.f5542c, c0993a, bVar2.f5544e);
                } else if (oVar instanceof C0336d) {
                    dVar = new C0336d();
                } else if (oVar instanceof C0333a) {
                    dVar = new C0333a();
                } else if (oVar instanceof C0335c) {
                    dVar = new C0335c();
                } else if (oVar instanceof F1.d) {
                    dVar = new F1.d();
                } else {
                    throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(oVar.getClass().getSimpleName()));
                }
                bVar = new b(dVar, bVar2.f5541b, bVar2.f5542c, c0993a, bVar2.f5544e);
                j8 = j11;
                vVar = vVar2;
                j9 = j;
                i7 = 0;
            } else {
                Map j12 = hVar.j();
                c cVar = this.q0;
                cVar.getClass();
                H0.r rVar = this.f11006d;
                int A7 = org.slf4j.helpers.i.A(rVar.f1886m);
                List list = (List) j12.get(HttpHeaders.CONTENT_TYPE);
                if (list != null && !list.isEmpty()) {
                    str = (String) list.get(0);
                } else {
                    str = null;
                }
                int A8 = org.slf4j.helpers.i.A(str);
                int B7 = org.slf4j.helpers.i.B(lVar.f3172a);
                ArrayList arrayList2 = new ArrayList(7);
                c.a(A7, arrayList2);
                c.a(A8, arrayList2);
                c.a(B7, arrayList2);
                int[] iArr = c.f5545d;
                int i13 = 0;
                for (int i14 = 7; i13 < i14; i14 = 7) {
                    c.a(iArr[i13], arrayList2);
                    i13++;
                }
                lVar2.f = 0;
                int i15 = 0;
                m1.o oVar2 = null;
                while (true) {
                    int size = arrayList2.size();
                    v vVar3 = this.f5593p0;
                    if (i15 < size) {
                        int intValue = ((Integer) arrayList2.get(i15)).intValue();
                        j8 = j11;
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 7) {
                                        J1.j jVar4 = J1.j.f2375l;
                                        List list2 = this.f5594r0;
                                        arrayList = arrayList2;
                                        if (intValue != 8) {
                                            if (intValue != 11) {
                                                if (intValue != 13) {
                                                    vVar = vVar2;
                                                    j9 = j;
                                                    c0333a = null;
                                                } else {
                                                    vVar = vVar2;
                                                    c0333a = new u(rVar.f1879d, vVar3, cVar.f5546b, cVar.f5547c);
                                                    j9 = j;
                                                }
                                            } else {
                                                vVar = vVar2;
                                                J1.j jVar5 = cVar.f5546b;
                                                boolean z13 = cVar.f5547c;
                                                if (list2 != null) {
                                                    i10 = 48;
                                                } else {
                                                    C0137q c0137q = new C0137q();
                                                    c0137q.f1850l = H0.I.l("application/cea-608");
                                                    list2 = Collections.singletonList(new H0.r(c0137q));
                                                    i10 = 16;
                                                }
                                                String str2 = rVar.j;
                                                j9 = j;
                                                if (!TextUtils.isEmpty(str2)) {
                                                    if (H0.I.a(str2, "audio/mp4a-latm") == null) {
                                                        i10 |= 2;
                                                    }
                                                    if (H0.I.a(str2, "video/avc") == null) {
                                                        i10 |= 4;
                                                    }
                                                }
                                                if (!z13) {
                                                    jVar3 = jVar4;
                                                } else {
                                                    jVar3 = jVar5;
                                                }
                                                c0333a = new F(2, !z13 ? 1 : 0, jVar3, vVar3, new C0338f(i10, list2));
                                            }
                                        } else {
                                            vVar = vVar2;
                                            j9 = j;
                                            J1.j jVar6 = cVar.f5546b;
                                            boolean z14 = cVar.f5547c;
                                            H h8 = rVar.f1884k;
                                            if (h8 == null) {
                                                jVar = jVar6;
                                            } else {
                                                int i16 = 0;
                                                J1.j jVar7 = jVar6;
                                                while (true) {
                                                    G[] gArr2 = h8.f1692a;
                                                    jVar = jVar7;
                                                    if (i16 >= gArr2.length) {
                                                        break;
                                                    }
                                                    G g4 = gArr2[i16];
                                                    if (g4 instanceof t) {
                                                        z9 = !((t) g4).f5705c.isEmpty();
                                                        break;
                                                    }
                                                    i16++;
                                                    jVar7 = jVar;
                                                }
                                            }
                                            z9 = false;
                                            if (z9) {
                                                i8 = 4;
                                            } else {
                                                i8 = 0;
                                            }
                                            if (!z14) {
                                                i9 = i8 | 32;
                                                jVar2 = jVar4;
                                            } else {
                                                i9 = i8;
                                                jVar2 = jVar;
                                            }
                                            if (list2 == null) {
                                                list2 = e0.f138e;
                                            }
                                            c0333a = new G1.n(jVar2, i9, vVar3, null, list2, null);
                                        }
                                    } else {
                                        vVar = vVar2;
                                        j9 = j;
                                        arrayList = arrayList2;
                                        c0333a = new F1.d(0L);
                                    }
                                } else {
                                    vVar = vVar2;
                                    j9 = j;
                                    arrayList = arrayList2;
                                    c0333a = new C0336d();
                                }
                            } else {
                                vVar = vVar2;
                                j9 = j;
                                arrayList = arrayList2;
                                c0333a = new C0335c();
                            }
                        } else {
                            vVar = vVar2;
                            j9 = j;
                            arrayList = arrayList2;
                            c0333a = new C0333a();
                        }
                        c0333a.getClass();
                        try {
                            z8 = c0333a.e(lVar2);
                            i7 = 0;
                            lVar2.f = 0;
                        } catch (EOFException unused3) {
                            i7 = 0;
                            lVar2.f = 0;
                            z8 = false;
                        } catch (Throwable th) {
                            lVar2.f = 0;
                            throw th;
                        }
                        if (z8) {
                            bVar = new b(c0333a, rVar, vVar3, cVar.f5546b, cVar.f5547c);
                            break;
                        }
                        if (oVar2 == null && (intValue == A7 || intValue == A8 || intValue == B7 || intValue == 11)) {
                            oVar2 = c0333a;
                        }
                        i15++;
                        arrayList2 = arrayList;
                        j11 = j8;
                        vVar2 = vVar;
                        j = j9;
                    } else {
                        j8 = j11;
                        vVar = vVar2;
                        j9 = j;
                        i7 = 0;
                        oVar2.getClass();
                        bVar = new b(oVar2, rVar, vVar3, cVar.f5546b, cVar.f5547c);
                        break;
                    }
                }
            }
            this.f5600x0 = bVar;
            m1.o c9 = bVar.f5540a.c();
            if (!(c9 instanceof C0336d) && !(c9 instanceof C0333a) && !(c9 instanceof C0335c) && !(c9 instanceof F1.d)) {
                i11 = i7;
            } else {
                i11 = 1;
            }
            if (i11 != 0) {
                r rVar2 = this.f5601y0;
                if (j9 != -9223372036854775807L) {
                    j10 = vVar.b(j9);
                } else {
                    j10 = j8;
                }
                if (rVar2.f5666Q0 != j10) {
                    rVar2.f5666Q0 = j10;
                    q[] qVarArr = rVar2.q0;
                    int length = qVarArr.length;
                    for (int i17 = i7; i17 < length; i17++) {
                        q qVar2 = qVarArr[i17];
                        if (qVar2.f10728F != j10) {
                            qVar2.f10728F = j10;
                            qVar2.f10753z = true;
                        }
                    }
                }
            } else {
                r rVar3 = this.f5601y0;
                if (rVar3.f5666Q0 != 0) {
                    rVar3.f5666Q0 = 0L;
                    q[] qVarArr2 = rVar3.q0;
                    int length2 = qVarArr2.length;
                    for (int i18 = i7; i18 < length2; i18++) {
                        q qVar3 = qVarArr2[i18];
                        if (qVar3.f10728F != 0) {
                            qVar3.f10728F = 0L;
                            qVar3.f10753z = true;
                        }
                    }
                }
            }
            this.f5601y0.f5690s0.clear();
            this.f5600x0.f5540a.g(this.f5601y0);
        } else {
            i7 = 0;
        }
        r rVar4 = this.f5601y0;
        C0135o c0135o = rVar4.f5667R0;
        C0135o c0135o2 = this.f5595s0;
        if (!x.a(c0135o, c0135o2)) {
            rVar4.f5667R0 = c0135o2;
            while (true) {
                q[] qVarArr3 = rVar4.q0;
                if (i7 >= qVarArr3.length) {
                    break;
                }
                if (rVar4.f5659J0[i7]) {
                    q qVar4 = qVarArr3[i7];
                    qVar4.f5648I = c0135o2;
                    qVar4.f10753z = true;
                }
                i7++;
            }
        }
        return lVar2;
    }

    @Override // i1.k
    public final void k() {
        this.f5578B0 = true;
    }
}
