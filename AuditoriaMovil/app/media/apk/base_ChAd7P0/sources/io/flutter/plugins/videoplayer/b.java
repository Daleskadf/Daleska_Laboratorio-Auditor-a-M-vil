package io.flutter.plugins.videoplayer;

import H0.C;
import H0.C0126f;
import H0.F;
import H0.K;
import H0.L;
import H0.M;
import H0.N;
import H0.O;
import H0.b0;
import H0.e0;
import O0.H;
import a1.C0415A;
import java.util.HashMap;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b implements N {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12397a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12398b = false;

    /* renamed from: c  reason: collision with root package name */
    public final O0.r f12399c;

    /* renamed from: d  reason: collision with root package name */
    public final C0415A f12400d;

    public b(O0.r rVar, C0415A c0415a) {
        this.f12399c = rVar;
        this.f12400d = c0415a;
    }

    @Override // H0.N
    public final void D(boolean z7) {
        C0415A c0415a = this.f12400d;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "isPlayingStateUpdate");
        hashMap.put("isPlaying", Boolean.valueOf(z7));
        ((m) c0415a.f6744a).b(hashMap);
    }

    @Override // H0.N
    public final /* synthetic */ void a(int i7) {
    }

    @Override // H0.N
    public final /* synthetic */ void b(int i7) {
    }

    @Override // H0.N
    public final /* synthetic */ void c(int i7, O o7, O o8) {
    }

    public abstract void d();

    public final void e(boolean z7) {
        if (this.f12397a == z7) {
            return;
        }
        this.f12397a = z7;
        m mVar = (m) this.f12400d.f6744a;
        if (z7) {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "bufferingStart");
            mVar.b(hashMap);
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("event", "bufferingEnd");
        mVar.b(hashMap2);
    }

    @Override // H0.N
    public final /* synthetic */ void f(L l8) {
    }

    @Override // H0.N
    public final /* synthetic */ void g(C c8, int i7) {
    }

    @Override // H0.N
    public final /* synthetic */ void h(int i7) {
    }

    @Override // H0.N
    public final /* synthetic */ void i(M m7) {
    }

    @Override // H0.N
    public final /* synthetic */ void j(boolean z7) {
    }

    @Override // H0.N
    public final /* synthetic */ void k(boolean z7) {
    }

    @Override // H0.N
    public final /* synthetic */ void l(F f) {
    }

    @Override // H0.N
    public final /* synthetic */ void m(C0126f c0126f) {
    }

    @Override // H0.N
    public final /* synthetic */ void n(List list) {
    }

    @Override // H0.N
    public final /* synthetic */ void p(int i7, boolean z7) {
    }

    @Override // H0.N
    public final /* synthetic */ void q(int i7, boolean z7) {
    }

    @Override // H0.N
    public final /* synthetic */ void r(float f) {
    }

    @Override // H0.N
    public final /* synthetic */ void s(e0 e0Var) {
    }

    @Override // H0.N
    public final void t(int i7) {
        C0415A c0415a = this.f12400d;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 == 4) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("event", "completed");
                    ((m) c0415a.f6744a).b(hashMap);
                }
            } else if (!this.f12398b) {
                this.f12398b = true;
                d();
            }
        } else {
            e(true);
            c0415a.l(((H) this.f12399c).y());
        }
        if (i7 != 2) {
            e(false);
        }
    }

    @Override // H0.N
    public final /* synthetic */ void u(J0.c cVar) {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [io.flutter.plugins.videoplayer.l, java.lang.Object] */
    @Override // H0.N
    public final void v(K k2) {
        e(false);
        if (k2.f1698a == 1002) {
            O0.r rVar = this.f12399c;
            B0.b bVar = (B0.b) rVar;
            bVar.getClass();
            bVar.r(((H) bVar).E(), -9223372036854775807L);
            ((H) rVar).Q();
            return;
        }
        m mVar = (m) this.f12400d.f6744a;
        mVar.getClass();
        ?? obj = new Object();
        obj.f12414a = "VideoError";
        obj.f12415b = "Video player had error " + k2;
        obj.f12416c = null;
        if (!mVar.f12419c) {
            mVar.f12418b.add(obj);
        }
        mVar.a();
    }

    @Override // H0.N
    public final /* synthetic */ void w(H0.H h8) {
    }

    @Override // H0.N
    public final /* synthetic */ void x(b0 b0Var) {
    }

    @Override // H0.N
    public final /* synthetic */ void y(int i7, int i8) {
    }

    @Override // H0.N
    public final /* synthetic */ void z(K k2) {
    }
}
