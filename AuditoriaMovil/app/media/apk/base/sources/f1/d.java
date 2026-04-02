package F1;

import A.i;
import A3.I;
import A3.K;
import A3.e0;
import H0.H;
import K0.q;
import K0.x;
import b3.C0585f;
import java.io.EOFException;
import java.util.List;
import m1.G;
import m1.l;
import m1.n;
import m1.o;
import m1.p;
import m1.v;
import m1.y;
/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: u  reason: collision with root package name */
    public static final i f1127u = new i(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f1128a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1129b;

    /* renamed from: c  reason: collision with root package name */
    public final q f1130c;

    /* renamed from: d  reason: collision with root package name */
    public final y f1131d;

    /* renamed from: e  reason: collision with root package name */
    public final v f1132e;
    public final C0585f f;

    /* renamed from: g  reason: collision with root package name */
    public final n f1133g;

    /* renamed from: h  reason: collision with root package name */
    public m1.q f1134h;

    /* renamed from: i  reason: collision with root package name */
    public G f1135i;
    public G j;

    /* renamed from: k  reason: collision with root package name */
    public int f1136k;

    /* renamed from: l  reason: collision with root package name */
    public H f1137l;

    /* renamed from: m  reason: collision with root package name */
    public long f1138m;

    /* renamed from: n  reason: collision with root package name */
    public long f1139n;

    /* renamed from: o  reason: collision with root package name */
    public long f1140o;

    /* renamed from: p  reason: collision with root package name */
    public int f1141p;

    /* renamed from: q  reason: collision with root package name */
    public f f1142q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1143r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1144s;

    /* renamed from: t  reason: collision with root package name */
    public long f1145t;

    public d() {
        this(-9223372036854775807L);
    }

    public static long b(H h8) {
        if (h8 != null) {
            int length = h8.f1692a.length;
            for (int i7 = 0; i7 < length; i7++) {
                H0.G g3 = h8.f1692a[i7];
                if (g3 instanceof A1.n) {
                    A1.n nVar = (A1.n) g3;
                    if (nVar.f62a.equals("TLEN")) {
                        return x.M(Long.parseLong((String) nVar.f74c.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        this.f1136k = 0;
        this.f1138m = -9223372036854775807L;
        this.f1139n = 0L;
        this.f1141p = 0;
        this.f1145t = j8;
        f fVar = this.f1142q;
        if ((fVar instanceof b) && !((b) fVar).a(j8)) {
            this.f1144s = true;
            this.j = this.f1133g;
        }
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    public final boolean d(l lVar) {
        f fVar = this.f1142q;
        if (fVar != null) {
            long d7 = fVar.d();
            if (d7 != -1 && lVar.t() > d7 - 4) {
                return true;
            }
        }
        try {
            return !lVar.q(this.f1130c.f2513a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        return h((l) pVar, true);
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        this.f1134h = qVar;
        G s7 = qVar.s(0, 1);
        this.f1135i = s7;
        this.j = s7;
        this.f1134h.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009f, code lost:
        if (r19 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
        r18.m(r4 + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a6, code lost:
        r18.f = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a8, code lost:
        r17.f1136k = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00aa, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(m1.l r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r3 = 0
            r1.f = r3
            long r4 = r1.f13974d
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L3f
            int r4 = r0.f1128a
            r4 = r4 & 8
            if (r4 != 0) goto L20
            r4 = r5
            goto L22
        L20:
            A.i r4 = F1.d.f1127u
        L22:
            b3.f r6 = r0.f
            H0.H r4 = r6.S(r1, r4)
            r0.f1137l = r4
            if (r4 == 0) goto L31
            m1.v r6 = r0.f1132e
            r6.b(r4)
        L31:
            long r6 = r18.t()
            int r4 = (int) r6
            if (r19 != 0) goto L3b
            r1.m(r4)
        L3b:
            r6 = r3
        L3c:
            r7 = r6
            r8 = r7
            goto L42
        L3f:
            r4 = r3
            r6 = r4
            goto L3c
        L42:
            boolean r9 = r17.d(r18)
            r10 = 1
            if (r9 == 0) goto L52
            if (r7 <= 0) goto L4c
            goto L9f
        L4c:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L52:
            K0.q r9 = r0.f1130c
            r9.G(r3)
            int r9 = r9.h()
            if (r6 == 0) goto L6b
            long r11 = (long) r6
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r9
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L72
        L6b:
            int r11 = m1.AbstractC1428b.j(r9)
            r12 = -1
            if (r11 != r12) goto L91
        L72:
            int r6 = r8 + 1
            if (r8 != r2) goto L80
            if (r19 == 0) goto L79
            return r3
        L79:
            java.lang.String r1 = "Searched too many bytes."
            H0.J r1 = H0.J.a(r5, r1)
            throw r1
        L80:
            if (r19 == 0) goto L8a
            r1.f = r3
            int r7 = r4 + r6
            r1.b(r7, r3)
            goto L8d
        L8a:
            r1.m(r10)
        L8d:
            r7 = r3
            r8 = r6
            r6 = r7
            goto L42
        L91:
            int r7 = r7 + 1
            if (r7 != r10) goto L9c
            m1.y r6 = r0.f1131d
            r6.a(r9)
            r6 = r9
            goto Lab
        L9c:
            r9 = 4
            if (r7 != r9) goto Lab
        L9f:
            if (r19 == 0) goto La6
            int r4 = r4 + r8
            r1.m(r4)
            goto La8
        La6:
            r1.f = r3
        La8:
            r0.f1136k = r6
            return r10
        Lab:
            int r11 = r11 + (-4)
            r1.b(r11, r3)
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.d.h(m1.l, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
        if (r6 != 1231971951) goto L232;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e8  */
    /* JADX WARN: Type inference failed for: r0v41, types: [m1.s] */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r51, H0.C0140u r52) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.d.i(m1.p, H0.u):int");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, m1.y] */
    public d(long j) {
        this.f1128a = 0;
        this.f1129b = j;
        this.f1130c = new q(10);
        this.f1131d = new Object();
        this.f1132e = new v();
        this.f1138m = -9223372036854775807L;
        this.f = new C0585f(11);
        n nVar = new n();
        this.f1133g = nVar;
        this.j = nVar;
    }

    @Override // m1.o
    public final void release() {
    }
}
