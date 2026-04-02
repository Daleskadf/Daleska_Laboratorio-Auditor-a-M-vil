package k1;

import K0.x;
import O0.C0250l;
import Q0.C0276m;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
/* loaded from: classes.dex */
public final class j implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f13604a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f13605b;

    public j(k kVar, X0.j jVar) {
        this.f13605b = kVar;
        Handler n7 = x.n(this);
        this.f13604a = n7;
        jVar.d0(this, n7);
    }

    public final void a(long j) {
        boolean z7;
        Surface surface;
        k kVar = this.f13605b;
        if (this == kVar.f13638d2 && kVar.f6309F0 != null) {
            if (j == Long.MAX_VALUE) {
                kVar.f6352s1 = true;
                return;
            }
            try {
                kVar.t0(j);
                kVar.z0(kVar.f13633Y1);
                kVar.f6355u1.f3735e++;
                n nVar = kVar.f13613E1;
                if (nVar.f13654d != 3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                nVar.f13654d = 3;
                nVar.f13659k.getClass();
                nVar.f = x.M(SystemClock.elapsedRealtime());
                if (z7 && (surface = kVar.f13621M1) != null) {
                    C0276m c0276m = kVar.f13610B1;
                    Handler handler = c0276m.f4296b;
                    if (handler != null) {
                        handler.post(new t(c0276m, surface, SystemClock.elapsedRealtime()));
                    }
                    kVar.f13624P1 = true;
                }
                kVar.b0(j);
            } catch (C0250l e7) {
                kVar.t1 = e7;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i7 = message.arg1;
        int i8 = message.arg2;
        int i9 = x.f2529a;
        a(((i7 & 4294967295L) << 32) | (4294967295L & i8));
        return true;
    }
}
