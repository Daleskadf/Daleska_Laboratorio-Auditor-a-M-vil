package G1;

import A3.I;
import A3.K;
import A3.e0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m1.E;
import m1.H;
import m1.InterfaceC1426A;
/* loaded from: classes.dex */
public final class q implements m1.o, InterfaceC1426A {

    /* renamed from: A  reason: collision with root package name */
    public B1.a f1442A;

    /* renamed from: a  reason: collision with root package name */
    public final J1.j f1443a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1444b;

    /* renamed from: c  reason: collision with root package name */
    public final K0.q f1445c;

    /* renamed from: d  reason: collision with root package name */
    public final K0.q f1446d;

    /* renamed from: e  reason: collision with root package name */
    public final K0.q f1447e;
    public final K0.q f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque f1448g;

    /* renamed from: h  reason: collision with root package name */
    public final s f1449h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f1450i;
    public e0 j;

    /* renamed from: k  reason: collision with root package name */
    public int f1451k;

    /* renamed from: l  reason: collision with root package name */
    public int f1452l;

    /* renamed from: m  reason: collision with root package name */
    public long f1453m;

    /* renamed from: n  reason: collision with root package name */
    public int f1454n;

    /* renamed from: o  reason: collision with root package name */
    public K0.q f1455o;

    /* renamed from: p  reason: collision with root package name */
    public int f1456p;

    /* renamed from: q  reason: collision with root package name */
    public int f1457q;

    /* renamed from: r  reason: collision with root package name */
    public int f1458r;

    /* renamed from: s  reason: collision with root package name */
    public int f1459s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1460t;

    /* renamed from: u  reason: collision with root package name */
    public m1.q f1461u;

    /* renamed from: v  reason: collision with root package name */
    public p[] f1462v;

    /* renamed from: w  reason: collision with root package name */
    public long[][] f1463w;

    /* renamed from: x  reason: collision with root package name */
    public int f1464x;

    /* renamed from: y  reason: collision with root package name */
    public long f1465y;

    /* renamed from: z  reason: collision with root package name */
    public int f1466z;

    public q(J1.j jVar, int i7) {
        int i8;
        this.f1443a = jVar;
        this.f1444b = i7;
        I i9 = K.f98b;
        this.j = e0.f138e;
        if ((i7 & 4) != 0) {
            i8 = 3;
        } else {
            i8 = 0;
        }
        this.f1451k = i8;
        this.f1449h = new s();
        this.f1450i = new ArrayList();
        this.f = new K0.q(16);
        this.f1448g = new ArrayDeque();
        this.f1445c = new K0.q(L0.g.f2861a);
        this.f1446d = new K0.q(4);
        this.f1447e = new K0.q();
        this.f1456p = -1;
        this.f1461u = m1.q.f13983c0;
        this.f1462v = new p[0];
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        p[] pVarArr;
        this.f1448g.clear();
        this.f1454n = 0;
        this.f1456p = -1;
        this.f1457q = 0;
        this.f1458r = 0;
        this.f1459s = 0;
        if (j == 0) {
            if (this.f1451k != 3) {
                this.f1451k = 0;
                this.f1454n = 0;
                return;
            }
            s sVar = this.f1449h;
            sVar.f1471a.clear();
            sVar.f1472b = 0;
            this.f1450i.clear();
            return;
        }
        for (p pVar : this.f1462v) {
            x xVar = pVar.f1438b;
            int f = K0.x.f(xVar.f, j8, false);
            while (true) {
                if (f >= 0) {
                    if ((xVar.f1509g[f] & 1) != 0) {
                        break;
                    }
                    f--;
                } else {
                    f = -1;
                    break;
                }
            }
            if (f == -1) {
                f = xVar.a(j8);
            }
            pVar.f1441e = f;
            H h8 = pVar.f1440d;
            if (h8 != null) {
                h8.f13897b = false;
                h8.f13898c = 0;
            }
        }
    }

    @Override // m1.o
    public final m1.o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(m1.p pVar) {
        boolean z7;
        e0 e0Var;
        if ((this.f1444b & 2) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        E j = t.j(pVar, false, z7);
        if (j != null) {
            e0Var = K.u(j);
        } else {
            I i7 = K.f98b;
            e0Var = e0.f138e;
        }
        this.j = e0Var;
        if (j == null) {
            return true;
        }
        return false;
    }

    @Override // m1.o
    public final List f() {
        return this.j;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        if ((this.f1444b & 16) == 0) {
            qVar = new V2.k(qVar, this.f1443a);
        }
        this.f1461u = qVar;
    }

    @Override // m1.InterfaceC1426A
    public final boolean h() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0496, code lost:
        r3 = r10;
        r5 = r36.f1454n;
        r6 = r36.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x049e, code lost:
        if (r5 != 0) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x04a7, code lost:
        if (r37.f(r6.f2513a, 0, 8, r3) != false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04ac, code lost:
        if (r36.f1466z != 2) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04b1, code lost:
        if ((r36.f1444b & 2) == 0) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04b3, code lost:
        r0 = r36.f1461u.s(0, 4);
        r2 = r36.f1442A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04bc, code lost:
        if (r2 != null) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04be, code lost:
        r13 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x04c0, code lost:
        r13 = new H0.H(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04ca, code lost:
        r2 = new H0.C0137q();
        r2.j = r13;
        D.AbstractC0059i.H(r2, r0);
        r36.f1461u.h();
        r36.f1461u.x(new m1.s(-9223372036854775807L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04e8, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04ea, code lost:
        r36.f1454n = 8;
        r6.G(0);
        r36.f1453m = r6.w();
        r36.f1452l = r6.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0501, code lost:
        r10 = r36.f1453m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0507, code lost:
        if (r10 != 1) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0509, code lost:
        r37.readFully(r6.f2513a, 8, 8);
        r36.f1454n += 8;
        r36.f1453m = r6.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x051e, code lost:
        if (r10 != 0) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0520, code lost:
        r10 = r37.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0526, code lost:
        if (r10 != (-1)) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0528, code lost:
        r13 = (G1.a) r12.peek();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x052e, code lost:
        if (r13 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0530, code lost:
        r10 = r13.f1349c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0534, code lost:
        if (r10 == (-1)) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0536, code lost:
        r36.f1453m = (r10 - r37.a()) + r36.f1454n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0541, code lost:
        r10 = r36.f1453m;
        r13 = r36.f1454n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0548, code lost:
        if (r10 < r13) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x054a, code lost:
        r10 = r36.f1452l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0555, code lost:
        if (r10 == 1836019574) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x055a, code lost:
        if (r10 == 1953653099) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x055f, code lost:
        if (r10 == 1835297121) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0564, code lost:
        if (r10 == 1835626086) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0569, code lost:
        if (r10 == 1937007212) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x056e, code lost:
        if (r10 == 1701082227) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0570, code lost:
        if (r10 != 1835365473) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0578, code lost:
        if (r10 == 1835296868) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x057d, code lost:
        if (r10 == 1836476516) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x057f, code lost:
        if (r10 == 1751411826) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0584, code lost:
        if (r10 == 1937011556) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0589, code lost:
        if (r10 == 1937011827) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x058e, code lost:
        if (r10 == 1937011571) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0593, code lost:
        if (r10 == 1668576371) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0598, code lost:
        if (r10 == 1701606260) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x059d, code lost:
        if (r10 == 1937011555) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05a2, code lost:
        if (r10 == 1937011578) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05a7, code lost:
        if (r10 == 1937013298) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05ac, code lost:
        if (r10 == 1937007471) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05b1, code lost:
        if (r10 == 1668232756) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05b6, code lost:
        if (r10 == 1953196132) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05bb, code lost:
        if (r10 == 1718909296) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05c0, code lost:
        if (r10 == 1969517665) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x05c5, code lost:
        if (r10 == 1801812339) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x05ca, code lost:
        if (r10 != 1768715124) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05cd, code lost:
        r6 = r37.a();
        r10 = r36.f1454n;
        r28 = r6 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05db, code lost:
        if (r36.f1452l != 1836086884) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x05dd, code lost:
        r36.f1442A = new B1.a(0, r28, -9223372036854775807L, r28 + r10, r36.f1453m - r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05f3, code lost:
        r36.f1455o = null;
        r36.f1451k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05f9, code lost:
        r3 = 0;
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05fd, code lost:
        if (r13 != 8) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05ff, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0601, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0602, code lost:
        K0.a.j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x060c, code lost:
        if (r36.f1453m > 2147483647L) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x060e, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0610, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0611, code lost:
        K0.a.j(r7);
        r7 = new K0.q((int) r36.f1453m);
        java.lang.System.arraycopy(r6.f2513a, 0, r7.f2513a, 0, 8);
        r36.f1455o = r7;
        r36.f1451k = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x062a, code lost:
        r13 = r37.a();
        r3 = r36.f1453m;
        r5 = r36.f1454n;
        r13 = (r13 + r3) - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0637, code lost:
        if (r3 == r5) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x063b, code lost:
        if (r36.f1452l != 1835365473) goto L348;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x063d, code lost:
        r14.D(8);
        r37.v(r14.f2513a, 0, 8);
        r3 = G1.j.f1380a;
        r3 = r14.f2514b;
        r4 = 4;
        r14.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0652, code lost:
        if (r14.h() == 1751411826) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0654, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0655, code lost:
        r14.G(r3);
        r37.m(r14.f2514b);
        r37.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0661, code lost:
        r4 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0662, code lost:
        r12.push(new G1.a(r36.f1452l, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0673, code lost:
        if (r36.f1453m != r36.f1454n) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0675, code lost:
        m(r13);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x067a, code lost:
        r3 = 0;
        r36.f1451k = 0;
        r36.f1454n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x068b, code lost:
        throw H0.J.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:?, code lost:
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:?, code lost:
        return -1;
     */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r37, H0.C0140u r38) {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.q.i(m1.p, H0.u):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df A[EDGE_INSN: B:72:0x00df->B:64:0x00df ?: BREAK  , SYNTHETIC] */
    @Override // m1.InterfaceC1426A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m1.z j(long r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.q.j(long):m1.z");
    }

    @Override // m1.InterfaceC1426A
    public final long l() {
        return this.f1465y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e5, code lost:
        if (r4 != 1851878757) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e7, code lost:
        r3 = r12.q(r23 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f1, code lost:
        if (r4 != 1684108385) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01f3, code lost:
        r8 = r23;
        r5 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f7, code lost:
        r12.H(r23 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fc, code lost:
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0200, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0202, code lost:
        if (r2 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
        if (r3 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0207, code lost:
        if (r5 != (-1)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020a, code lost:
        r12.G(r5);
        r12.H(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x021c, code lost:
        r3 = new A1.k(r2, r3, r12.q(r8 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x021f, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0220, code lost:
        r12.G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0225, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022a, code lost:
        r2 = 16777215 & r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0231, code lost:
        if (r2 != 6516084) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0233, code lost:
        r3 = G1.t.c(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x023b, code lost:
        if (r2 == 7233901) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0240, code lost:
        if (r2 != 7631467) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0247, code lost:
        if (r2 == 6516589) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x024c, code lost:
        if (r2 != 7828084) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0253, code lost:
        if (r2 != 6578553) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0255, code lost:
        r3 = G1.t.i(r3, r12, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x025f, code lost:
        if (r2 != 4280916) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0261, code lost:
        r3 = G1.t.i(r3, r12, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x026b, code lost:
        if (r2 != 7630703) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x026d, code lost:
        r3 = G1.t.i(r3, r12, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0277, code lost:
        if (r2 != 6384738) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0279, code lost:
        r3 = G1.t.i(r3, r12, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0283, code lost:
        if (r2 != 7108978) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0285, code lost:
        r3 = G1.t.i(r3, r12, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x028f, code lost:
        if (r2 != 6776174) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0291, code lost:
        r3 = G1.t.i(r3, r12, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0299, code lost:
        if (r2 != 6779504) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x029b, code lost:
        r3 = G1.t.i(r3, r12, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a3, code lost:
        K0.a.m("MetadataUtil", "Skipped unknown metadata entry: " + G1.c.b(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b6, code lost:
        r12.G(r13);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02bb, code lost:
        r3 = G1.t.i(r3, r12, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02c3, code lost:
        r3 = G1.t.i(r3, r12, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cb, code lost:
        if (r3 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02cd, code lost:
        r7.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02d0, code lost:
        r5 = r27;
        r9 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02dd, code lost:
        r12.G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02e0, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e1, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02e8, code lost:
        if (r7.isEmpty() == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02eb, code lost:
        r2 = new H0.H(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0335, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
        r12.G(r5);
        r5 = r5 + r14;
        r12.H(r2);
        r7 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
        r13 = r12.f2514b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
        if (r13 >= r5) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r13 = r12.h() + r13;
        r3 = r12.h();
        r2 = (r3 >> 24) & 255;
        r27 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bb, code lost:
        if (r2 == 169) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bf, code lost:
        if (r2 != 253) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (r3 != 1735291493) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
        r2 = A1.j.a(G1.t.f(r12) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
        if (r2 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d7, code lost:
        r3 = new A1.n("TCON", null, A3.K.u(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
        K0.a.A("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
        r12.G(r13);
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
        if (r3 != 1684632427) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f7, code lost:
        r3 = G1.t.e(r3, r12, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
        if (r3 != 1953655662) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
        r3 = G1.t.e(r3, r12, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
        if (r3 != 1953329263) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:
        r3 = G1.t.g(r3, "TBPM", r12, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011e, code lost:
        if (r3 != 1668311404) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0120, code lost:
        r3 = G1.t.g(r3, "TCMP", r12, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012b, code lost:
        if (r3 != 1668249202) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r3 = G1.t.d(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
        if (r3 != 1631670868) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0137, code lost:
        r3 = G1.t.i(r3, r12, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0141, code lost:
        if (r3 != 1936682605) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0143, code lost:
        r3 = G1.t.i(r3, r12, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014d, code lost:
        if (r3 != 1936679276) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014f, code lost:
        r3 = G1.t.i(r3, r12, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0159, code lost:
        if (r3 != 1936679282) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
        r3 = G1.t.i(r3, r12, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0165, code lost:
        if (r3 != 1936679265) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0167, code lost:
        r3 = G1.t.i(r3, r12, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
        if (r3 != 1936679791) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
        r3 = G1.t.i(r3, r12, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017f, code lost:
        if (r3 != 1920233063) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0181, code lost:
        r3 = G1.t.g(r3, "ITUNESADVISORY", r12, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018d, code lost:
        if (r3 != 1885823344) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018f, code lost:
        r3 = G1.t.g(r3, "ITUNESGAPLESS", r12, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019c, code lost:
        if (r3 != 1936683886) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019e, code lost:
        r3 = G1.t.i(r3, r12, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a9, code lost:
        if (r3 != 1953919848) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
        r3 = G1.t.i(r3, r12, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b6, code lost:
        if (r3 != 757935405) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b8, code lost:
        r2 = null;
        r3 = null;
        r5 = -1;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
        r14 = r12.f2514b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01be, code lost:
        if (r14 >= r13) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c0, code lost:
        r23 = r12.h();
        r4 = r12.h();
        r12.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d1, code lost:
        if (r4 != 1835360622) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d3, code lost:
        r2 = r12.q(r23 - 12);
        r30 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01de, code lost:
        r30 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06bb A[LOOP:13: B:336:0x06b8->B:338:0x06bb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0697 A[EDGE_INSN: B:401:0x0697->B:335:0x0697 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(long r33) {
        /*
            Method dump skipped, instructions count: 1875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G1.q.m(long):void");
    }

    @Override // m1.o
    public final void release() {
    }
}
