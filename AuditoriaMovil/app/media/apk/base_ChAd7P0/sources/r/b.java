package R;

import B5.AbstractActivityC0032e;
import D.InterfaceC0065o;
import D.y0;
import I.g;
import android.os.Build;
import androidx.camera.core.impl.InterfaceC0519v;
import androidx.lifecycle.E;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.EnumC0563o;
import androidx.lifecycle.InterfaceC0567t;
import androidx.lifecycle.InterfaceC0568u;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class b implements InterfaceC0567t, InterfaceC0065o {

    /* renamed from: b  reason: collision with root package name */
    public final AbstractActivityC0032e f4507b;

    /* renamed from: c  reason: collision with root package name */
    public final g f4508c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f4506a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f4509d = false;

    public b(AbstractActivityC0032e abstractActivityC0032e, g gVar) {
        this.f4507b = abstractActivityC0032e;
        this.f4508c = gVar;
        if (abstractActivityC0032e.f354c.f7946c.a(EnumC0563o.STARTED)) {
            gVar.g();
        } else {
            gVar.u();
        }
        abstractActivityC0032e.f354c.a(this);
    }

    @Override // D.InterfaceC0065o
    public final InterfaceC0519v a() {
        return this.f4508c.f2104l0;
    }

    public final void c(List list) {
        synchronized (this.f4506a) {
            this.f4508c.c(list);
        }
    }

    public final InterfaceC0568u i() {
        AbstractActivityC0032e abstractActivityC0032e;
        synchronized (this.f4506a) {
            abstractActivityC0032e = this.f4507b;
        }
        return abstractActivityC0032e;
    }

    @E(EnumC0562n.ON_DESTROY)
    public void onDestroy(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f4506a) {
            g gVar = this.f4508c;
            gVar.D((ArrayList) gVar.z());
        }
    }

    @E(EnumC0562n.ON_PAUSE)
    public void onPause(InterfaceC0568u interfaceC0568u) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4508c.f2092a.b(false);
        }
    }

    @E(EnumC0562n.ON_RESUME)
    public void onResume(InterfaceC0568u interfaceC0568u) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4508c.f2092a.b(true);
        }
    }

    @E(EnumC0562n.ON_START)
    public void onStart(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f4506a) {
            try {
                if (!this.f4509d) {
                    this.f4508c.g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @E(EnumC0562n.ON_STOP)
    public void onStop(InterfaceC0568u interfaceC0568u) {
        synchronized (this.f4506a) {
            try {
                if (!this.f4509d) {
                    this.f4508c.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List p() {
        List unmodifiableList;
        synchronized (this.f4506a) {
            unmodifiableList = DesugarCollections.unmodifiableList(this.f4508c.z());
        }
        return unmodifiableList;
    }

    public final boolean q(y0 y0Var) {
        boolean contains;
        synchronized (this.f4506a) {
            contains = ((ArrayList) this.f4508c.z()).contains(y0Var);
        }
        return contains;
    }

    public final void r() {
        synchronized (this.f4506a) {
            try {
                if (this.f4509d) {
                    return;
                }
                onStop(this.f4507b);
                this.f4509d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.f4506a) {
            g gVar = this.f4508c;
            gVar.D((ArrayList) gVar.z());
        }
    }

    public final void t() {
        synchronized (this.f4506a) {
            try {
                if (!this.f4509d) {
                    return;
                }
                this.f4509d = false;
                if (this.f4507b.f354c.f7946c.a(EnumC0563o.STARTED)) {
                    onStart(this.f4507b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
