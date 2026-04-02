package M;

import D.C0064n;
import D.p0;
import D.t0;
import D.v0;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.C0505g;
import androidx.camera.core.impl.I;
import g0.InterfaceC1003a;
import h3.AbstractC1079a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f3103a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f3104b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3105c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3106d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3107e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final C0505g f3108g;

    /* renamed from: h  reason: collision with root package name */
    public int f3109h;

    /* renamed from: i  reason: collision with root package name */
    public int f3110i;

    /* renamed from: k  reason: collision with root package name */
    public v0 f3111k;

    /* renamed from: l  reason: collision with root package name */
    public l f3112l;
    public boolean j = false;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f3113m = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    public boolean f3114n = false;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList f3115o = new ArrayList();

    public m(int i7, int i8, C0505g c0505g, Matrix matrix, boolean z7, Rect rect, int i9, int i10, boolean z8) {
        this.f = i7;
        this.f3103a = i8;
        this.f3108g = c0505g;
        this.f3104b = matrix;
        this.f3105c = z7;
        this.f3106d = rect;
        this.f3110i = i9;
        this.f3109h = i10;
        this.f3107e = z8;
        this.f3112l = new l(c0505g.f7621a, i8);
    }

    public final void a() {
        g0.c.g("Edge is already closed.", !this.f3114n);
    }

    public final void b() {
        AbstractC1079a.e();
        this.f3112l.a();
        this.f3114n = true;
    }

    public final v0 c(boolean z7) {
        AbstractC1079a.e();
        a();
        C0505g c0505g = this.f3108g;
        v0 v0Var = new v0(c0505g.f7621a, z7, c0505g.f7622b, new h(this, 0));
        try {
            t0 t0Var = v0Var.j;
            l lVar = this.f3112l;
            Objects.requireNonNull(lVar);
            if (lVar.g(t0Var, new i(lVar, 0))) {
                H.i.d(lVar.f7552e).a(new C.b(t0Var, 10), j3.f.r());
            }
            this.f3111k = v0Var;
            e();
            return v0Var;
        } catch (I e7) {
            throw new AssertionError("Surface is somehow already closed", e7);
        } catch (RuntimeException e8) {
            v0Var.b();
            throw e8;
        }
    }

    public final void d() {
        boolean z7;
        AbstractC1079a.e();
        a();
        l lVar = this.f3112l;
        lVar.getClass();
        AbstractC1079a.e();
        if (lVar.f3101q == null) {
            synchronized (lVar.f7548a) {
                z7 = lVar.f7550c;
            }
            if (!z7) {
                return;
            }
        }
        this.j = false;
        this.f3112l.a();
        this.f3112l = new l(this.f3108g.f7621a, this.f3103a);
        Iterator it = this.f3113m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        A4.d dVar;
        G.e eVar;
        AbstractC1079a.e();
        C0064n c0064n = new C0064n(this.f3106d, this.f3110i, this.f3109h, this.f3105c, this.f3104b, this.f3107e);
        v0 v0Var = this.f3111k;
        if (v0Var != null) {
            synchronized (v0Var.f782a) {
                v0Var.f790k = c0064n;
                dVar = v0Var.f791l;
                eVar = v0Var.f792m;
            }
            if (dVar != null && eVar != null) {
                eVar.execute(new p0(dVar, c0064n, 0));
            }
        }
        Iterator it = this.f3115o.iterator();
        while (it.hasNext()) {
            ((InterfaceC1003a) it.next()).accept(c0064n);
        }
    }
}
