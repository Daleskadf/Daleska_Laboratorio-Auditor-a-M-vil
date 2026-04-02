package f1;

import H0.C0140u;
import H0.r;
import a6.t0;
import android.util.SparseArray;
import f5.C0993a;
import m1.G;
import m1.InterfaceC1426A;
import m1.o;
import m1.q;
/* renamed from: f1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0982d implements q, InterfaceC0984f {

    /* renamed from: e0  reason: collision with root package name */
    public static final A.l f10990e0;

    /* renamed from: f0  reason: collision with root package name */
    public static final C0140u f10991f0;

    /* renamed from: X  reason: collision with root package name */
    public long f10992X;

    /* renamed from: Y  reason: collision with root package name */
    public InterfaceC1426A f10993Y;

    /* renamed from: Z  reason: collision with root package name */
    public r[] f10994Z;

    /* renamed from: a  reason: collision with root package name */
    public final o f10995a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10996b;

    /* renamed from: c  reason: collision with root package name */
    public final r f10997c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray f10998d = new SparseArray();

    /* renamed from: e  reason: collision with root package name */
    public boolean f10999e;
    public t0 f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, A.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, H0.u] */
    static {
        ?? obj = new Object();
        obj.f26b = new C0993a(6);
        f10990e0 = obj;
        f10991f0 = new Object();
    }

    public C0982d(o oVar, int i7, r rVar) {
        this.f10995a = oVar;
        this.f10996b = i7;
        this.f10997c = rVar;
    }

    public final void a(t0 t0Var, long j, long j8) {
        this.f = t0Var;
        this.f10992X = j8;
        boolean z7 = this.f10999e;
        o oVar = this.f10995a;
        if (!z7) {
            oVar.g(this);
            if (j != -9223372036854775807L) {
                oVar.a(0L, j);
            }
            this.f10999e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        oVar.a(0L, j);
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f10998d;
            if (i7 < sparseArray.size()) {
                C0981c c0981c = (C0981c) sparseArray.valueAt(i7);
                if (t0Var == null) {
                    c0981c.f10989e = c0981c.f10987c;
                } else {
                    c0981c.f = j8;
                    G W7 = t0Var.W(c0981c.f10985a);
                    c0981c.f10989e = W7;
                    r rVar = c0981c.f10988d;
                    if (rVar != null) {
                        W7.c(rVar);
                    }
                }
                i7++;
            } else {
                return;
            }
        }
    }

    @Override // m1.q
    public final void h() {
        SparseArray sparseArray = this.f10998d;
        r[] rVarArr = new r[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            r rVar = ((C0981c) sparseArray.valueAt(i7)).f10988d;
            K0.a.k(rVar);
            rVarArr[i7] = rVar;
        }
        this.f10994Z = rVarArr;
    }

    @Override // m1.q
    public final G s(int i7, int i8) {
        boolean z7;
        r rVar;
        SparseArray sparseArray = this.f10998d;
        C0981c c0981c = (C0981c) sparseArray.get(i7);
        if (c0981c == null) {
            if (this.f10994Z == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            K0.a.j(z7);
            if (i8 == this.f10996b) {
                rVar = this.f10997c;
            } else {
                rVar = null;
            }
            c0981c = new C0981c(i7, i8, rVar);
            t0 t0Var = this.f;
            long j = this.f10992X;
            if (t0Var == null) {
                c0981c.f10989e = c0981c.f10987c;
            } else {
                c0981c.f = j;
                G W7 = t0Var.W(i8);
                c0981c.f10989e = W7;
                r rVar2 = c0981c.f10988d;
                if (rVar2 != null) {
                    W7.c(rVar2);
                }
            }
            sparseArray.put(i7, c0981c);
        }
        return c0981c;
    }

    @Override // m1.q
    public final void x(InterfaceC1426A interfaceC1426A) {
        this.f10993Y = interfaceC1426A;
    }
}
