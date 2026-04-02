package G1;

import A3.K;
import A3.e0;
import H0.C0134n;
import H0.C0135o;
import H0.C0137q;
import H0.I;
import H0.J;
import android.util.SparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import m1.E;
import m1.G;
import p.C1608t;
/* loaded from: classes.dex */
public final class n implements m1.o {

    /* renamed from: K  reason: collision with root package name */
    public static final byte[] f1398K = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: L  reason: collision with root package name */
    public static final H0.r f1399L;

    /* renamed from: A  reason: collision with root package name */
    public long f1400A;

    /* renamed from: B  reason: collision with root package name */
    public m f1401B;

    /* renamed from: C  reason: collision with root package name */
    public int f1402C;

    /* renamed from: D  reason: collision with root package name */
    public int f1403D;

    /* renamed from: E  reason: collision with root package name */
    public int f1404E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f1405F;

    /* renamed from: G  reason: collision with root package name */
    public m1.q f1406G;

    /* renamed from: H  reason: collision with root package name */
    public G[] f1407H;

    /* renamed from: I  reason: collision with root package name */
    public G[] f1408I;

    /* renamed from: J  reason: collision with root package name */
    public boolean f1409J;

    /* renamed from: a  reason: collision with root package name */
    public final J1.j f1410a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1411b;

    /* renamed from: c  reason: collision with root package name */
    public final u f1412c;

    /* renamed from: d  reason: collision with root package name */
    public final List f1413d;

    /* renamed from: i  reason: collision with root package name */
    public final byte[] f1417i;
    public final K0.q j;

    /* renamed from: k  reason: collision with root package name */
    public final K0.v f1418k;

    /* renamed from: p  reason: collision with root package name */
    public final R0.o f1423p;

    /* renamed from: q  reason: collision with root package name */
    public e0 f1424q;

    /* renamed from: r  reason: collision with root package name */
    public int f1425r;

    /* renamed from: s  reason: collision with root package name */
    public int f1426s;

    /* renamed from: t  reason: collision with root package name */
    public long f1427t;

    /* renamed from: u  reason: collision with root package name */
    public int f1428u;

    /* renamed from: v  reason: collision with root package name */
    public K0.q f1429v;

    /* renamed from: w  reason: collision with root package name */
    public long f1430w;

    /* renamed from: x  reason: collision with root package name */
    public int f1431x;

    /* renamed from: y  reason: collision with root package name */
    public long f1432y;

    /* renamed from: z  reason: collision with root package name */
    public long f1433z;

    /* renamed from: l  reason: collision with root package name */
    public final C1608t f1419l = new C1608t(24);

    /* renamed from: m  reason: collision with root package name */
    public final K0.q f1420m = new K0.q(16);
    public final K0.q f = new K0.q(L0.g.f2861a);

    /* renamed from: g  reason: collision with root package name */
    public final K0.q f1415g = new K0.q(5);

    /* renamed from: h  reason: collision with root package name */
    public final K0.q f1416h = new K0.q();

    /* renamed from: n  reason: collision with root package name */
    public final ArrayDeque f1421n = new ArrayDeque();

    /* renamed from: o  reason: collision with root package name */
    public final ArrayDeque f1422o = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray f1414e = new SparseArray();

    static {
        C0137q c0137q = new C0137q();
        c0137q.f1850l = I.l("application/x-emsg");
        f1399L = new H0.r(c0137q);
    }

    public n(J1.j jVar, int i7, K0.v vVar, u uVar, List list, R0.o oVar) {
        this.f1410a = jVar;
        this.f1411b = i7;
        this.f1418k = vVar;
        this.f1412c = uVar;
        this.f1413d = DesugarCollections.unmodifiableList(list);
        this.f1423p = oVar;
        byte[] bArr = new byte[16];
        this.f1417i = bArr;
        this.j = new K0.q(bArr);
        A3.I i8 = K.f98b;
        this.f1424q = e0.f138e;
        this.f1433z = -9223372036854775807L;
        this.f1432y = -9223372036854775807L;
        this.f1400A = -9223372036854775807L;
        this.f1406G = m1.q.f13983c0;
        this.f1407H = new G[0];
        this.f1408I = new G[0];
    }

    public static C0135o b(ArrayList arrayList) {
        UUID uuid;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) arrayList.get(i7);
            if (bVar.f1354b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = bVar.f1352c.f2513a;
                A.m h8 = t.h(bArr);
                if (h8 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) h8.f28b;
                }
                if (uuid == null) {
                    K0.a.A("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C0134n(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C0135o(null, false, (C0134n[]) arrayList2.toArray(new C0134n[0]));
    }

    public static void d(K0.q qVar, int i7, w wVar) {
        boolean z7;
        qVar.G(i7 + 8);
        int h8 = qVar.h();
        if ((h8 & 1) == 0) {
            if ((h8 & 2) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            int y2 = qVar.y();
            if (y2 == 0) {
                Arrays.fill(wVar.f1498l, 0, wVar.f1493e, false);
                return;
            } else if (y2 == wVar.f1493e) {
                Arrays.fill(wVar.f1498l, 0, y2, z7);
                int a7 = qVar.a();
                K0.q qVar2 = wVar.f1500n;
                qVar2.D(a7);
                wVar.f1497k = true;
                wVar.f1501o = true;
                qVar.f(qVar2.f2513a, 0, qVar2.f2515c);
                qVar2.G(0);
                wVar.f1501o = false;
                return;
            } else {
                StringBuilder k2 = io.flutter.plugins.pathprovider.b.k("Senc sample count ", y2, " is different from fragment sample count");
                k2.append(wVar.f1493e);
                throw J.a(null, k2.toString());
            }
        }
        throw J.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        SparseArray sparseArray = this.f1414e;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((m) sparseArray.valueAt(i7)).d();
        }
        this.f1422o.clear();
        this.f1431x = 0;
        this.f1432y = j8;
        this.f1421n.clear();
        this.f1425r = 0;
        this.f1428u = 0;
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        e0 e0Var;
        E j = t.j(pVar, true, false);
        if (j != null) {
            e0Var = K.u(j);
        } else {
            A3.I i7 = K.f98b;
            e0Var = e0.f138e;
        }
        this.f1424q = e0Var;
        if (j == null) {
            return true;
        }
        return false;
    }

    @Override // m1.o
    public final List f() {
        return this.f1424q;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        m1.q qVar2;
        int i7;
        int i8 = this.f1411b;
        if ((i8 & 32) == 0) {
            qVar2 = new V2.k(qVar, this.f1410a);
        } else {
            qVar2 = qVar;
        }
        this.f1406G = qVar2;
        this.f1425r = 0;
        this.f1428u = 0;
        G[] gArr = new G[2];
        this.f1407H = gArr;
        R0.o oVar = this.f1423p;
        if (oVar != null) {
            gArr[0] = oVar;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i9 = 100;
        if ((i8 & 4) != 0) {
            gArr[i7] = qVar2.s(100, 5);
            i9 = 101;
            i7++;
        }
        G[] gArr2 = (G[]) K0.x.O(i7, this.f1407H);
        this.f1407H = gArr2;
        for (G g3 : gArr2) {
            g3.c(f1399L);
        }
        List list = this.f1413d;
        this.f1408I = new G[list.size()];
        int i10 = 0;
        while (i10 < this.f1408I.length) {
            G s7 = this.f1406G.s(i9, 3);
            s7.c((H0.r) list.get(i10));
            this.f1408I[i10] = s7;
            i10++;
            i9++;
        }
        u uVar = this.f1412c;
        if (uVar != null) {
            this.f1414e.put(0, new m(qVar.s(0, uVar.f1476b), new x(this.f1412c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new k(0, 0, 0, 0)));
            this.f1406G.h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:358:0x07eb, code lost:
        r5 = r0;
        r5.f1425r = 0;
        r5.f1428u = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x07f1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r54) {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.n.h(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f6, code lost:
        if (((r13 & 126) >> 1) != 39) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fe, code lost:
        r30.f1405F = r2;
        r30.f1403D += 5;
        r30.f1402C += r8;
        r4 = r19;
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020f, code lost:
        r13 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021a, code lost:
        throw H0.J.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x021b, code lost:
        r19 = r4;
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0222, code lost:
        if (r30.f1405F == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0224, code lost:
        r4 = r30.f1416h;
        r4.D(r2);
        r23 = r8;
        r24 = r14;
        ((m1.l) r31).f(r4.f2513a, 0, r30.f1404E, false);
        r11.d(r30.f1404E, r4);
        r2 = r30.f1404E;
        r5 = L0.g.f(r4.f2513a, r4.f2515c);
        r4.G("video/hevc".equals(r13.f1886m) ? 1 : 0);
        r4.F(r5);
        m1.AbstractC1428b.f(r9, r4, r30.f1408I);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0259, code lost:
        r23 = r8;
        r24 = r14;
        r2 = r11.b(r31, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0262, code lost:
        r30.f1403D += r2;
        r30.f1404E -= r2;
        r4 = r19;
        r5 = r22;
        r8 = r23;
        r14 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0275, code lost:
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0278, code lost:
        r29 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027a, code lost:
        r2 = r30.f1403D;
        r4 = r30.f1402C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x027e, code lost:
        if (r2 >= r4) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0280, code lost:
        r30.f1403D += r11.b(r31, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x028e, code lost:
        if (r3.f1397l != false) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0290, code lost:
        r1 = r3.f1391d.f1509g[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x029f, code lost:
        if (r7.j[r3.f] == false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a1, code lost:
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a3, code lost:
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02a8, code lost:
        if (r3.a() == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02aa, code lost:
        r1 = r1 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ad, code lost:
        r25 = r1;
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b3, code lost:
        if (r1 == null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b5, code lost:
        r28 = r1.f1486c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ba, code lost:
        r28 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02bc, code lost:
        r11.e(r9, r25, r30.f1402C, 0, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02cd, code lost:
        if (r12.isEmpty() != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02cf, code lost:
        r1 = (G1.l) r12.removeFirst();
        r30.f1431x -= r1.f1387c;
        r2 = r1.f1386b;
        r4 = r1.f1385a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e0, code lost:
        if (r2 == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02e2, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02e3, code lost:
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e5, code lost:
        if (r29 == null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e7, code lost:
        r4 = r2.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02eb, code lost:
        r6 = r30.f1407H;
        r7 = r6.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ef, code lost:
        if (r8 >= r7) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02f1, code lost:
        r6[r8].e(r4, 1, r1.f1387c, r30.f1431x, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0307, code lost:
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x030e, code lost:
        if (r3.b() != false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0310, code lost:
        r30.f1401B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0313, code lost:
        r30.f1425r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0317, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
        r4 = r30.f1425r;
        r7 = r3.f1389b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (r4 != 3) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
        if (r3.f1397l != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
        r4 = r3.f1391d.f1507d[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ce, code lost:
        r4 = r7.f1495h[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r30.f1402C = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
        if (r3.f >= r3.f1395i) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dc, code lost:
        ((m1.l) r31).m(r4);
        r1 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
        if (r1 != null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
        r2 = r7.f1500n;
        r1 = r1.f1487d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ec, code lost:
        if (r1 == 0) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
        r2.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f1, code lost:
        r1 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f5, code lost:
        if (r7.f1497k == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fb, code lost:
        if (r7.f1498l[r1] == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0109, code lost:
        if (r3.b() != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010b, code lost:
        r30.f1401B = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:
        r30.f1425r = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011a, code lost:
        if (r3.f1391d.f1504a.f1480g != r2) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x011c, code lost:
        r30.f1402C = r4 - 8;
        ((m1.l) r31).m(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0135, code lost:
        if ("audio/ac4".equals(r3.f1391d.f1504a.f.f1886m) == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
        r30.f1403D = r3.c(r30.f1402C, 7);
        r4 = r30.f1402C;
        r9 = r30.j;
        m1.AbstractC1428b.i(r4, r9);
        r3.f1388a.d(7, r9);
        r30.f1403D += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0152, code lost:
        r30.f1403D = r3.c(r30.f1402C, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x015a, code lost:
        r30.f1402C += r30.f1403D;
        r30.f1425r = 4;
        r30.f1404E = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:
        r4 = r3.f1391d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016a, code lost:
        if (r3.f1397l != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016c, code lost:
        r9 = r4.f[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0173, code lost:
        r9 = r7.f1496i[r3.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017a, code lost:
        if (r13 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017c, code lost:
        r9 = r13.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0180, code lost:
        r4 = r4.f1504a;
        r8 = r4.j;
        r11 = r3.f1388a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
        if (r8 == 0) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0188, code lost:
        r14 = r30.f1415g;
        r15 = r14.f2513a;
        r15[0] = 0;
        r15[r2] = 0;
        r15[2] = 0;
        r5 = r8 + 1;
        r8 = 4 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019e, code lost:
        if (r30.f1403D >= r30.f1402C) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
        r2 = r30.f1404E;
        r29 = r13;
        r13 = r4.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a8, code lost:
        if (r2 != 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01aa, code lost:
        r19 = r4;
        ((m1.l) r31).f(r15, r8, r5, false);
        r14.G(0);
        r2 = r14.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01bb, code lost:
        if (r2 < 1) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bd, code lost:
        r30.f1404E = r2 - 1;
        r2 = r30.f;
        r2.G(0);
        r11.d(4, r2);
        r11.d(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
        if (r30.f1408I.length <= 0) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
        r2 = r13.f1886m;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dd, code lost:
        if ("video/avc".equals(r2) == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01df, code lost:
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e4, code lost:
        if ((r13 & 31) == 6) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
        r22 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ee, code lost:
        if ("video/hevc".equals(r2) == false) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r31, H0.C0140u r32) {
        /*
            Method dump skipped, instructions count: 1983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.n.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
    }
}
