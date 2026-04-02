package d6;

import a6.C0473b;
import a6.C0476e;
import a6.e0;
import c6.AbstractC0655c;
import c6.o2;
import c6.s2;
/* loaded from: classes.dex */
public final class m extends AbstractC0655c {

    /* renamed from: r  reason: collision with root package name */
    public static final Q6.e f10425r = new Object();
    public final Q0.A j;

    /* renamed from: k  reason: collision with root package name */
    public final String f10426k;

    /* renamed from: l  reason: collision with root package name */
    public final o2 f10427l;

    /* renamed from: m  reason: collision with root package name */
    public final String f10428m;

    /* renamed from: n  reason: collision with root package name */
    public final l f10429n;

    /* renamed from: o  reason: collision with root package name */
    public final A.m f10430o;

    /* renamed from: p  reason: collision with root package name */
    public final C0473b f10431p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10432q;

    public m(Q0.A a7, e0 e0Var, C0907d c0907d, p pVar, K0.o oVar, Object obj, int i7, int i8, String str, String str2, o2 o2Var, s2 s2Var, C0476e c0476e) {
        super(new e5.b(17), o2Var, s2Var, e0Var, c0476e, false);
        this.f10430o = new A.m(this, 29);
        this.f10432q = false;
        this.f10427l = o2Var;
        this.j = a7;
        this.f10428m = str;
        this.f10426k = str2;
        this.f10431p = pVar.f10472u;
        Object obj2 = a7.f4138d;
        this.f10429n = new l(this, i7, o2Var, obj, c0907d, oVar, pVar, i8);
    }

    public static void w(m mVar, int i7) {
        mVar.getClass();
        l lVar = mVar.f10429n;
        synchronized (lVar.f8772b) {
            lVar.f8775e += i7;
        }
    }
}
