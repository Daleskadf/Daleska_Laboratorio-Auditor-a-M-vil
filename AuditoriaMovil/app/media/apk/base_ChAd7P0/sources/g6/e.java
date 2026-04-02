package G6;

import D.AbstractC0059i;
import F6.C;
import F6.C0100m;
import F6.H0;
import F6.InterfaceC0091h0;
import F6.M;
import F6.P;
import F6.S;
import F6.x0;
import F6.z0;
import H.h;
import K6.o;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import n6.i;
/* loaded from: classes.dex */
public final class e extends x0 implements M {
    private volatile e _immediate;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f1608c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1609d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1610e;
    public final e f;

    public e(Handler handler, String str, boolean z7) {
        this.f1608c = handler;
        this.f1609d = str;
        this.f1610e = z7;
        this._immediate = z7 ? this : null;
        e eVar = this._immediate;
        if (eVar == null) {
            eVar = new e(handler, str, true);
            this._immediate = eVar;
        }
        this.f = eVar;
    }

    @Override // F6.M
    public final S a(long j, final H0 h02, i iVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f1608c.postDelayed(h02, j)) {
            return new S() { // from class: G6.c
                @Override // F6.S
                public final void a() {
                    e.this.f1608c.removeCallbacks(h02);
                }
            };
        }
        g(iVar, h02);
        return z0.f1325a;
    }

    @Override // F6.M
    public final void b(long j, C0100m c0100m) {
        h hVar = new h(3, c0100m, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f1608c.postDelayed(hVar, j)) {
            c0100m.u(new d(0, this, hVar));
        } else {
            g(c0100m.f1285e, hVar);
        }
    }

    @Override // F6.B
    public final void c(i iVar, Runnable runnable) {
        if (!this.f1608c.post(runnable)) {
            g(iVar, runnable);
        }
    }

    @Override // F6.B
    public final boolean d() {
        if (this.f1610e && j.a(Looper.myLooper(), this.f1608c.getLooper())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && ((e) obj).f1608c == this.f1608c) {
            return true;
        }
        return false;
    }

    public final void g(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0091h0 interfaceC0091h0 = (InterfaceC0091h0) iVar.get(C.f1216b);
        if (interfaceC0091h0 != null) {
            interfaceC0091h0.cancel(cancellationException);
        }
        P.f1238b.c(iVar, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1608c);
    }

    @Override // F6.B
    public final String toString() {
        e eVar;
        String str;
        M6.f fVar = P.f1237a;
        x0 x0Var = o.f2797a;
        if (this == x0Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = ((e) x0Var).f;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            if (this == eVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f1609d;
            if (str2 == null) {
                str2 = this.f1608c.toString();
            }
            if (this.f1610e) {
                return AbstractC0059i.z(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public e(Handler handler) {
        this(handler, null, false);
    }
}
