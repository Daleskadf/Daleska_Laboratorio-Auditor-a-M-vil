package B0;

import H0.P;
import H0.U;
import I.i;
import Y1.m;
import Y1.s;
import android.graphics.Rect;
import android.view.View;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.InterfaceC0518u;
import androidx.camera.core.impl.j0;
import com.google.crypto.tink.shaded.protobuf.AbstractC0774a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0781h;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* loaded from: classes.dex */
public abstract class b implements P, InterfaceC0518u {

    /* renamed from: a  reason: collision with root package name */
    public final Object f229a;

    public static b c(s sVar, int i7) {
        if (i7 != 0) {
            if (i7 == 1) {
                return new m(sVar, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new m(sVar, 0);
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public E3.b B(boolean z7) {
        return ((InterfaceC0518u) this.f229a).B(z7);
    }

    public abstract AbstractC0774a a(AbstractC0774a abstractC0774a);

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public G b() {
        return ((InterfaceC0518u) this.f229a).b();
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public E3.b i(float f) {
        return ((InterfaceC0518u) this.f229a).i(f);
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void j() {
        ((InterfaceC0518u) this.f229a).j();
    }

    public abstract void k();

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void l(G g3) {
        ((InterfaceC0518u) this.f229a).l(g3);
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public E3.b m(float f) {
        return ((InterfaceC0518u) this.f229a).m(f);
    }

    public abstract void n();

    public Map o() {
        return Collections.emptyMap();
    }

    public abstract AbstractC0774a p(AbstractC0781h abstractC0781h);

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public Rect q() {
        return ((InterfaceC0518u) this.f229a).q();
    }

    public abstract void r(int i7, long j);

    public void s() {
        ((ReentrantReadWriteLock) this.f229a).writeLock().unlock();
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void t(int i7) {
        ((InterfaceC0518u) this.f229a).t(i7);
    }

    public void u(Object obj, boolean z7) {
        Set set = (Set) this.f229a;
        int size = set.size();
        if (z7) {
            set.add(obj);
            if (size == 0) {
                k();
            }
        } else if (set.remove(obj) && size == 1) {
            n();
        }
    }

    public abstract void v(AbstractC0774a abstractC0774a);

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void w(i iVar) {
        ((InterfaceC0518u) this.f229a).w(iVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0518u
    public void z(j0 j0Var) {
        ((InterfaceC0518u) this.f229a).z(j0Var);
    }

    public b(int i7) {
        switch (i7) {
            case 1:
                this.f229a = new U();
                return;
            case 3:
                this.f229a = new ReentrantReadWriteLock();
                return;
            case 6:
                this.f229a = Collections.newSetFromMap(new IdentityHashMap());
                return;
            default:
                this.f229a = new LinkedHashMap();
                return;
        }
    }

    public b(s sVar) {
        new Rect();
        this.f229a = sVar;
    }
}
