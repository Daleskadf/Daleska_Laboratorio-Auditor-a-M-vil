package k1;

import A3.I;
import A3.K;
import A3.e0;
import H0.C0130j;
import H0.C0137q;
import H0.c0;
import K0.x;
import O0.C0250l;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import c1.RunnableC0626c;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* renamed from: k1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13573a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13574b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f13575c;

    /* renamed from: d  reason: collision with root package name */
    public H0.r f13576d;

    /* renamed from: e  reason: collision with root package name */
    public long f13577e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public long f13578g;

    /* renamed from: h  reason: collision with root package name */
    public u f13579h;

    /* renamed from: i  reason: collision with root package name */
    public Executor f13580i;
    public final /* synthetic */ C1388e j;

    public C1387d(C1388e c1388e, Context context) {
        int i7;
        this.j = c1388e;
        this.f13573a = context;
        if (x.J(context)) {
            i7 = 1;
        } else {
            i7 = 5;
        }
        this.f13574b = i7;
        this.f13575c = new ArrayList();
        this.f13577e = -9223372036854775807L;
        this.f13579h = u.f13693a0;
        this.f13580i = C1388e.f13581m;
    }

    public final void a(boolean z7) {
        this.f = false;
        this.f13577e = -9223372036854775807L;
        C1388e c1388e = this.j;
        if (c1388e.f13591l == 1) {
            c1388e.f13590k++;
            c1388e.f13584c.a();
            K0.u uVar = c1388e.f13589i;
            K0.a.k(uVar);
            uVar.c(new RunnableC0626c(c1388e, 9));
        }
        if (z7) {
            n nVar = c1388e.f13583b;
            q qVar = nVar.f13652b;
            qVar.f13675m = 0L;
            qVar.f13678p = -1L;
            qVar.f13676n = -1L;
            nVar.f13656g = -9223372036854775807L;
            nVar.f13655e = -9223372036854775807L;
            nVar.c(1);
            nVar.f13657h = -9223372036854775807L;
        }
    }

    public final void b(H0.r rVar) {
        boolean z7;
        C1388e c1388e = this.j;
        if (c1388e.f13591l == 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        C0130j c0130j = rVar.f1899z;
        if (c0130j == null || !c0130j.d()) {
            c0130j = C0130j.f1810h;
        }
        if (c0130j.f1813c != 7 || x.f2529a < 34) {
        }
        Looper myLooper = Looper.myLooper();
        K0.a.k(myLooper);
        c1388e.f13589i = c1388e.f13586e.a(myLooper, null);
        try {
            C1385b c1385b = c1388e.f13585d;
            I i7 = K.f98b;
            e0 e0Var = e0.f138e;
            c1385b.a();
            Pair pair = c1388e.j;
            if (pair != null) {
                Surface surface = (Surface) pair.first;
                int i8 = ((K0.r) pair.second).f2517a;
            }
            throw null;
        } catch (c0 e7) {
            throw new v(e7, rVar);
        }
    }

    public final void c() {
        boolean z7;
        if (this.f13576d == null) {
            return;
        }
        new ArrayList().addAll(this.f13575c);
        H0.r rVar = this.f13576d;
        rVar.getClass();
        K0.a.k(null);
        C0130j c0130j = rVar.f1899z;
        if (c0130j == null || !c0130j.d()) {
            C0130j c0130j2 = C0130j.f1810h;
        }
        int i7 = rVar.f1892s;
        boolean z8 = false;
        if (i7 > 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.d("width must be positive, but is: " + i7, z7);
        int i8 = rVar.f1893t;
        if (i8 > 0) {
            z8 = true;
        }
        K0.a.d("height must be positive, but is: " + i8, z8);
        throw null;
    }

    public final void d(long j, long j8) {
        try {
            this.j.a(j, j8);
        } catch (C0250l e7) {
            H0.r rVar = this.f13576d;
            if (rVar == null) {
                rVar = new H0.r(new C0137q());
            }
            throw new v(e7, rVar);
        }
    }

    public final void e(Surface surface, K0.r rVar) {
        C1388e c1388e = this.j;
        Pair pair = c1388e.j;
        if (pair == null || !((Surface) pair.first).equals(surface) || !((K0.r) c1388e.j.second).equals(rVar)) {
            c1388e.j = Pair.create(surface, rVar);
            int i7 = rVar.f2517a;
        }
    }
}
