package h1;

import H0.b0;
import K0.x;
import O0.k0;
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f11324a;

    /* renamed from: b  reason: collision with root package name */
    public final k0[] f11325b;

    /* renamed from: c  reason: collision with root package name */
    public final r[] f11326c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f11327d;

    /* renamed from: e  reason: collision with root package name */
    public final t f11328e;

    public v(k0[] k0VarArr, r[] rVarArr, b0 b0Var, t tVar) {
        boolean z7;
        if (k0VarArr.length == rVarArr.length) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.e(z7);
        this.f11325b = k0VarArr;
        this.f11326c = (r[]) rVarArr.clone();
        this.f11327d = b0Var;
        this.f11328e = tVar;
        this.f11324a = k0VarArr.length;
    }

    public final boolean a(v vVar, int i7) {
        if (vVar == null || !x.a(this.f11325b[i7], vVar.f11325b[i7]) || !x.a(this.f11326c[i7], vVar.f11326c[i7])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i7) {
        if (this.f11325b[i7] != null) {
            return true;
        }
        return false;
    }
}
