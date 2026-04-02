package c1;

import A.l;
import A3.e0;
import B5.S;
import G1.n;
import G1.u;
import G1.v;
import K0.x;
import M0.h;
import O0.Q;
import O0.l0;
import R0.k;
import T1.e;
import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.firestore.Z;
import d1.C0886a;
import e1.C0937b;
import f1.AbstractC0983e;
import f1.C0982d;
import f1.InterfaceC0984f;
import f1.i;
import f1.j;
import f1.m;
import f5.C0993a;
import h1.r;
import i1.o;
import j3.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: c1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624a implements i {

    /* renamed from: a  reason: collision with root package name */
    public final o f8327a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8328b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0984f[] f8329c;

    /* renamed from: d  reason: collision with root package name */
    public final h f8330d;

    /* renamed from: e  reason: collision with root package name */
    public r f8331e;
    public d1.c f;

    /* renamed from: g  reason: collision with root package name */
    public int f8332g;

    /* renamed from: h  reason: collision with root package name */
    public C0937b f8333h;

    public C0624a(o oVar, d1.c cVar, int i7, r rVar, h hVar, C0993a c0993a, boolean z7) {
        v[] vVarArr;
        int i8;
        int i9;
        this.f8327a = oVar;
        this.f = cVar;
        this.f8328b = i7;
        this.f8331e = rVar;
        this.f8330d = hVar;
        d1.b bVar = cVar.f[i7];
        this.f8329c = new InterfaceC0984f[rVar.length()];
        for (int i10 = 0; i10 < this.f8329c.length; i10++) {
            int f = rVar.f(i10);
            H0.r rVar2 = bVar.j[f];
            if (rVar2.f1890q != null) {
                C0886a c0886a = cVar.f10192e;
                c0886a.getClass();
                vVarArr = c0886a.f10173c;
            } else {
                vVarArr = null;
            }
            v[] vVarArr2 = vVarArr;
            int i11 = bVar.f10174a;
            if (i11 == 2) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            u uVar = new u(f, i11, bVar.f10176c, -9223372036854775807L, cVar.f10193g, rVar2, 0, vVarArr2, i8, null, null);
            if (!z7) {
                i9 = 35;
            } else {
                i9 = 3;
            }
            this.f8329c[i10] = new C0982d(new n(c0993a, i9, null, uVar, e0.f138e, null), bVar.f10174a, rVar2);
        }
    }

    @Override // f1.i
    public final void a() {
        C0937b c0937b = this.f8333h;
        if (c0937b == null) {
            this.f8327a.a();
            return;
        }
        throw c0937b;
    }

    @Override // f1.i
    public final long c(long j, l0 l0Var) {
        long j8;
        d1.b bVar = this.f.f[this.f8328b];
        int f = x.f(bVar.f10186o, j, true);
        long[] jArr = bVar.f10186o;
        long j9 = jArr[f];
        if (j9 < j && f < bVar.f10182k - 1) {
            j8 = jArr[f + 1];
        } else {
            j8 = j9;
        }
        return l0Var.a(j, j9, j8);
    }

    @Override // f1.i
    public final boolean d(AbstractC0983e abstractC0983e, boolean z7, S s7, Z z8) {
        i1.h h8 = f.h(this.f8331e);
        z8.getClass();
        e u7 = Z.u(h8, s7);
        if (z7 && u7 != null && u7.f5318a == 2) {
            r rVar = this.f8331e;
            if (rVar.m(rVar.r(abstractC0983e.f11006d), u7.f5319b)) {
                return true;
            }
        }
        return false;
    }

    @Override // f1.i
    public final boolean e(long j, AbstractC0983e abstractC0983e, List list) {
        if (this.f8333h != null) {
            return false;
        }
        return this.f8331e.a(j, abstractC0983e, list);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.IOException, e1.b] */
    @Override // f1.i
    public final void f(Q q2, long j, List list, l lVar) {
        d1.c cVar;
        int a7;
        long b5;
        long j8;
        boolean z7;
        boolean z8;
        boolean z9;
        if (this.f8333h != null) {
            return;
        }
        d1.b[] bVarArr = this.f.f;
        int i7 = this.f8328b;
        d1.b bVar = bVarArr[i7];
        if (bVar.f10182k == 0) {
            lVar.f25a = !cVar.f10191d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.f10186o;
        if (isEmpty) {
            a7 = x.f(jArr, j, true);
        } else {
            a7 = (int) (((f1.l) list.get(list.size() - 1)).a() - this.f8332g);
            if (a7 < 0) {
                this.f8333h = new IOException();
                return;
            }
        }
        if (a7 >= bVar.f10182k) {
            lVar.f25a = !this.f.f10191d;
            return;
        }
        long j9 = q2.f3610a;
        long j10 = j - j9;
        d1.c cVar2 = this.f;
        if (!cVar2.f10191d) {
            b5 = -9223372036854775807L;
        } else {
            d1.b bVar2 = cVar2.f[i7];
            int i8 = bVar2.f10182k - 1;
            b5 = (bVar2.b(i8) + bVar2.f10186o[i8]) - j9;
        }
        int length = this.f8331e.length();
        m[] mVarArr = new m[length];
        for (int i9 = 0; i9 < length; i9++) {
            this.f8331e.f(i9);
            mVarArr[i9] = new k(bVar, a7);
        }
        this.f8331e.q(j9, j10, b5, list, mVarArr);
        long j11 = jArr[a7];
        long b7 = bVar.b(a7) + j11;
        if (list.isEmpty()) {
            j8 = j;
        } else {
            j8 = -9223372036854775807L;
        }
        int i10 = this.f8332g + a7;
        int l8 = this.f8331e.l();
        InterfaceC0984f interfaceC0984f = this.f8329c[l8];
        int f = this.f8331e.f(l8);
        H0.r[] rVarArr = bVar.j;
        if (rVarArr != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        K0.a.j(z7);
        ArrayList arrayList = bVar.f10185n;
        if (arrayList != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        K0.a.j(z8);
        if (a7 < arrayList.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        K0.a.j(z9);
        String num = Integer.toString(rVarArr[f].f1883i);
        String l9 = ((Long) arrayList.get(a7)).toString();
        Uri y2 = K0.a.y(bVar.f10183l, bVar.f10184m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l9).replace("{start_time}", l9));
        SystemClock.elapsedRealtime();
        H0.r j12 = this.f8331e.j();
        int k2 = this.f8331e.k();
        Object o7 = this.f8331e.o();
        Map emptyMap = Collections.emptyMap();
        K0.a.l(y2, "The uri must be set.");
        lVar.f26b = new j(this.f8330d, new M0.l(y2, 1, null, emptyMap, 0L, -1L, null, 0), j12, k2, o7, j11, b7, j8, -9223372036854775807L, i10, 1, j11, interfaceC0984f);
    }

    @Override // f1.i
    public final int g(List list, long j) {
        if (this.f8333h == null && this.f8331e.length() >= 2) {
            return this.f8331e.t(list, j);
        }
        return list.size();
    }

    @Override // f1.i
    public final void release() {
        for (InterfaceC0984f interfaceC0984f : this.f8329c) {
            ((C0982d) interfaceC0984f).f10995a.release();
        }
    }

    @Override // f1.i
    public final void b(AbstractC0983e abstractC0983e) {
    }
}
