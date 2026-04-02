package io.flutter.plugins.videoplayer;

import A3.K;
import A3.e0;
import H0.C;
import H0.C0126f;
import H0.D;
import K0.u;
import K0.x;
import O0.C0242d;
import O0.C0251m;
import O0.C0254p;
import O0.C0260w;
import O0.G;
import O0.H;
import O0.J;
import O0.c0;
import O0.j0;
import a1.C0415A;
import android.content.Context;
import android.media.AudioTrack;
import android.view.Surface;
import e1.AbstractC0936a;
import e1.InterfaceC0959y;
import e1.X;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public final C0415A f12420a;

    /* renamed from: b  reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f12421b;

    /* renamed from: c  reason: collision with root package name */
    public final O0.r f12422c;

    public o(C0415A c0415a, C c8, A.n nVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, V5.d dVar) {
        H h8;
        boolean z7;
        C0126f c0126f;
        this.f12420a = c0415a;
        this.f12421b = textureRegistry$SurfaceProducer;
        switch (dVar.f5978a) {
            case 0:
                Context context = dVar.f5979b;
                C0254p c0254p = new C0254p(context);
                InterfaceC0959y c9 = dVar.f5980c.c(context);
                K0.a.j(!c0254p.f3824q);
                c0254p.f3813d = new C0251m(c9, 0);
                K0.a.j(!c0254p.f3824q);
                c0254p.f3824q = true;
                h8 = new H(c0254p);
                break;
            default:
                Context context2 = dVar.f5979b;
                C0254p c0254p2 = new C0254p(context2);
                InterfaceC0959y c10 = dVar.f5980c.c(context2);
                K0.a.j(!c0254p2.f3824q);
                c0254p2.f3813d = new C0251m(c10, 0);
                K0.a.j(!c0254p2.f3824q);
                c0254p2.f3824q = true;
                h8 = new H(c0254p2);
                break;
        }
        H h9 = h8;
        this.f12422c = h9;
        e0 u7 = K.u(c8);
        h9.Z();
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < u7.f140d; i7++) {
            arrayList.add(h9.f3528l0.b((C) u7.get(i7)));
        }
        h9.Z();
        h9.I(h9.f3513Y0);
        h9.F();
        h9.f3540y0++;
        ArrayList arrayList2 = h9.f3526j0;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i8 = size - 1; i8 >= 0; i8--) {
                arrayList2.remove(i8);
            }
            X x7 = h9.f3489C0;
            int[] iArr = x7.f10755b;
            int[] iArr2 = new int[iArr.length - size];
            int i9 = 0;
            for (int i10 = 0; i10 < iArr.length; i10++) {
                int i11 = iArr[i10];
                if (i11 >= 0 && i11 < size) {
                    i9++;
                } else {
                    iArr2[i10 - i9] = i11 >= 0 ? i11 - size : i11;
                }
            }
            h9.f3489C0 = new X(iArr2, new Random(x7.f10754a.nextLong()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            c0 c0Var = new c0((AbstractC0936a) arrayList.get(i12), h9.f3527k0);
            arrayList3.add(c0Var);
            arrayList2.add(i12, new G(c0Var.f3675b, c0Var.f3674a));
        }
        h9.f3489C0 = h9.f3489C0.a(arrayList3.size());
        j0 j0Var = new j0(arrayList2, h9.f3489C0);
        boolean p7 = j0Var.p();
        int i13 = j0Var.f3781d;
        if (!p7 && -1 >= i13) {
            throw new IllegalStateException();
        }
        int a7 = j0Var.a(false);
        O0.e0 N7 = h9.N(h9.f3513Y0, j0Var, h9.O(j0Var, a7, -9223372036854775807L));
        int i14 = N7.f3717e;
        if (a7 != -1 && i14 != 1) {
            i14 = (j0Var.p() || a7 >= i13) ? 4 : 2;
        }
        O0.e0 g3 = N7.g(i14);
        h9.f3522f0.f3576Y.a(17, new J(arrayList3, h9.f3489C0, a7, x.M(-9223372036854775807L))).b();
        if (!h9.f3513Y0.f3714b.f10852a.equals(g3.f3714b.f10852a) && !h9.f3513Y0.f3713a.p()) {
            z7 = true;
        } else {
            z7 = false;
        }
        h9.X(g3, 0, z7, 4, h9.G(g3), -1);
        ((H) this.f12422c).Q();
        O0.r rVar = this.f12422c;
        b a8 = a(rVar, textureRegistry$SurfaceProducer);
        H h10 = (H) rVar;
        h10.getClass();
        h10.f3523g0.a(a8);
        O0.r rVar2 = this.f12422c;
        boolean z8 = nVar.f29a;
        C0126f c0126f2 = new C0126f(3);
        H h11 = (H) rVar2;
        h11.Z();
        if (!h11.f3508V0) {
            boolean a9 = x.a(h11.f3502P0, c0126f2);
            K0.k kVar = h11.f3523g0;
            if (!a9) {
                h11.f3502P0 = c0126f2;
                h11.S(1, c0126f2, 3);
                kVar.c(20, new A.j(c0126f2, 15));
            }
            if (!z8) {
                c0126f = c0126f2;
            } else {
                c0126f = null;
            }
            C0242d c0242d = h11.f3535t0;
            c0242d.b(c0126f);
            h11.f3512Y.b(c0126f2);
            boolean K7 = h11.K();
            h11.Z();
            int d7 = c0242d.d(h11.f3513Y0.f3717e, K7);
            h11.W(d7, d7 == -1 ? 2 : 1, K7);
            kVar.b();
        }
    }

    public abstract b a(O0.r rVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer);

    public void d() {
        String str;
        AudioTrack audioTrack;
        H h8 = (H) this.f12422c;
        h8.getClass();
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(h8)));
        sb.append(" [AndroidXMedia3/1.4.1] [");
        sb.append(x.f2533e);
        sb.append("] [");
        HashSet hashSet = D.f1646a;
        synchronized (D.class) {
            str = D.f1647b;
        }
        sb.append(str);
        sb.append("]");
        K0.a.r("ExoPlayerImpl", sb.toString());
        h8.Z();
        if (x.f2529a < 21 && (audioTrack = h8.f3494H0) != null) {
            audioTrack.release();
            h8.f3494H0 = null;
        }
        h8.f3534s0.p();
        h8.f3536u0.getClass();
        h8.f3537v0.getClass();
        C0242d c0242d = h8.f3535t0;
        c0242d.f3681c = null;
        c0242d.a();
        c0242d.c(0);
        if (!h8.f3522f0.w()) {
            h8.f3523g0.e(10, new C0260w(0));
        }
        h8.f3523g0.d();
        h8.f3514Z.f2522a.removeCallbacksAndMessages(null);
        i1.d dVar = h8.f3531o0;
        P0.d dVar2 = h8.f3529m0;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((i1.g) dVar).f11404b.f8171b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            i1.c cVar = (i1.c) it.next();
            if (cVar.f11388b == dVar2) {
                cVar.f11389c = true;
                copyOnWriteArrayList.remove(cVar);
            }
        }
        O0.e0 e0Var = h8.f3513Y0;
        if (e0Var.f3726p) {
            h8.f3513Y0 = e0Var.a();
        }
        O0.e0 g3 = h8.f3513Y0.g(1);
        h8.f3513Y0 = g3;
        O0.e0 b5 = g3.b(g3.f3714b);
        h8.f3513Y0 = b5;
        b5.f3727q = b5.f3729s;
        h8.f3513Y0.f3728r = 0L;
        P0.d dVar3 = h8.f3529m0;
        u uVar = dVar3.f3904Y;
        K0.a.k(uVar);
        uVar.c(new C.b(dVar3, 15));
        h8.f3512Y.a();
        h8.R();
        Surface surface = h8.f3496J0;
        if (surface != null) {
            surface.release();
            h8.f3496J0 = null;
        }
        int i7 = J0.c.f2338b;
        h8.f3508V0 = true;
    }
}
