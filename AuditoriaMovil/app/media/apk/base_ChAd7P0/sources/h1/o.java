package h1;

import A3.B;
import A3.c0;
import A3.l0;
import K0.x;
/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: X  reason: collision with root package name */
    public final boolean f11295X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f11296Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f11297Z;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11298e;

    /* renamed from: e0  reason: collision with root package name */
    public final int f11299e0;
    public final C1076j f;

    /* renamed from: f0  reason: collision with root package name */
    public final int f11300f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f11301g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f11302h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f11303i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f11304j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f11305k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f11306l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f11307m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f11308n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(int r8, H0.W r9, int r10, h1.C1076j r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.o.<init>(int, H0.W, int, h1.j, int, int, boolean):void");
    }

    public static int c(o oVar, o oVar2) {
        B c8 = B.f81a.c(oVar.f11296Y, oVar2.f11296Y).a(oVar.f11302h0, oVar2.f11302h0).c(oVar.f11303i0, oVar2.f11303i0).c(oVar.f11297Z, oVar2.f11297Z).c(oVar.f11298e, oVar2.f11298e).c(oVar.f11295X, oVar2.f11295X);
        Integer valueOf = Integer.valueOf(oVar.f11301g0);
        Integer valueOf2 = Integer.valueOf(oVar2.f11301g0);
        c0.f132a.getClass();
        B b5 = c8.b(valueOf, valueOf2, l0.f171a);
        boolean z7 = oVar2.f11306l0;
        boolean z8 = oVar.f11306l0;
        B c9 = b5.c(z8, z7);
        boolean z9 = oVar2.f11307m0;
        boolean z10 = oVar.f11307m0;
        B c10 = c9.c(z10, z9);
        if (z8 && z10) {
            c10 = c10.a(oVar.f11308n0, oVar2.f11308n0);
        }
        return c10.e();
    }

    @Override // h1.n
    public final int a() {
        return this.f11305k0;
    }

    @Override // h1.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f11304j0 || x.a(this.f11294d.f1886m, oVar.f11294d.f1886m)) {
            this.f.getClass();
            if (this.f11306l0 == oVar.f11306l0 && this.f11307m0 == oVar.f11307m0) {
                return true;
            }
        }
        return false;
    }
}
