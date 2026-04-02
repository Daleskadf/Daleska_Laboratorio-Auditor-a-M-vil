package o1;

import A3.I;
import A3.K;
import A3.e0;
import K0.q;
import K0.x;
import V2.k;
import Y1.C0406g;
import f5.C0993a;
import java.util.List;
import m1.l;
import m1.o;
import m1.p;
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public final q f14518a;

    /* renamed from: b  reason: collision with root package name */
    public final C0406g f14519b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f14520c;

    /* renamed from: d  reason: collision with root package name */
    public final C0993a f14521d;

    /* renamed from: e  reason: collision with root package name */
    public int f14522e;
    public m1.q f;

    /* renamed from: g  reason: collision with root package name */
    public c f14523g;

    /* renamed from: h  reason: collision with root package name */
    public long f14524h;

    /* renamed from: i  reason: collision with root package name */
    public e[] f14525i;
    public long j;

    /* renamed from: k  reason: collision with root package name */
    public e f14526k;

    /* renamed from: l  reason: collision with root package name */
    public int f14527l;

    /* renamed from: m  reason: collision with root package name */
    public long f14528m;

    /* renamed from: n  reason: collision with root package name */
    public long f14529n;

    /* renamed from: o  reason: collision with root package name */
    public int f14530o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14531p;

    /* JADX WARN: Type inference failed for: r2v3, types: [Y1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [m1.q, java.lang.Object] */
    public b(int i7, C0993a c0993a) {
        this.f14521d = c0993a;
        this.f14520c = (i7 & 1) == 0;
        this.f14518a = new q(12);
        this.f14519b = new Object();
        this.f = new Object();
        this.f14525i = new e[0];
        this.f14528m = -1L;
        this.f14529n = -1L;
        this.f14527l = -1;
        this.f14524h = -9223372036854775807L;
    }

    @Override // m1.o
    public final void a(long j, long j8) {
        e[] eVarArr;
        this.j = -1L;
        this.f14526k = null;
        for (e eVar : this.f14525i) {
            if (eVar.j == 0) {
                eVar.f14546h = 0;
            } else {
                eVar.f14546h = eVar.f14549l[x.f(eVar.f14548k, j, true)];
            }
        }
        if (j == 0) {
            if (this.f14525i.length == 0) {
                this.f14522e = 0;
                return;
            } else {
                this.f14522e = 3;
                return;
            }
        }
        this.f14522e = 6;
    }

    @Override // m1.o
    public final o c() {
        return this;
    }

    @Override // m1.o
    public final boolean e(p pVar) {
        q qVar = this.f14518a;
        ((l) pVar).q(qVar.f2513a, 0, 12, false);
        qVar.G(0);
        if (qVar.j() != 1179011410) {
            return false;
        }
        qVar.H(4);
        if (qVar.j() != 541677121) {
            return false;
        }
        return true;
    }

    @Override // m1.o
    public final List f() {
        I i7 = K.f98b;
        return e0.f138e;
    }

    @Override // m1.o
    public final void g(m1.q qVar) {
        this.f14522e = 0;
        if (this.f14520c) {
            qVar = new k(qVar, this.f14521d);
        }
        this.f = qVar;
        this.j = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010f  */
    @Override // m1.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(m1.p r22, H0.C0140u r23) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.b.i(m1.p, H0.u):int");
    }

    @Override // m1.o
    public final void release() {
    }
}
