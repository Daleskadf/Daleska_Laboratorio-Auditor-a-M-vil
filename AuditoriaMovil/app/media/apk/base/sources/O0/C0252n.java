package O0;

import android.content.Context;
import e1.C0949n;
import java.util.HashMap;
/* renamed from: O0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0252n implements z3.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3807a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f3808b;

    public /* synthetic */ C0252n(Context context, int i7) {
        this.f3807a = i7;
        this.f3808b = context;
    }

    @Override // z3.o
    public final Object get() {
        i1.g gVar;
        switch (this.f3807a) {
            case 0:
                return new C0249k(this.f3808b);
            case 1:
                return new C0949n(new A.f(this.f3808b, 29), new m1.m());
            case 2:
                return new h1.p(this.f3808b);
            default:
                Context context = this.f3808b;
                A3.e0 e0Var = i1.g.f11396n;
                synchronized (i1.g.class) {
                    try {
                        if (i1.g.f11402t == null) {
                            X0.c cVar = new X0.c(context);
                            i1.g.f11402t = new i1.g((Context) cVar.f6249c, (HashMap) cVar.f6250d, cVar.f6248b, (K0.s) cVar.f6251e, cVar.f6247a);
                        }
                        gVar = i1.g.f11402t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
