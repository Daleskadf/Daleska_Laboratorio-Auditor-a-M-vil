package X5;

import android.hardware.display.DisplayManager;
import android.util.Size;
import androidx.camera.core.impl.C0501c;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: X5.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389o implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6520a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6521b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f6522c;

    public /* synthetic */ C0389o(int i7, Object obj, Object obj2) {
        this.f6520a = i7;
        this.f6522c = obj;
        this.f6521b = obj2;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
        switch (this.f6520a) {
            case 0:
                Iterator it = ((ArrayList) this.f6522c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i7);
                }
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        switch (this.f6520a) {
            case 0:
                if (((DisplayManager) this.f6521b).getDisplay(i7) != null) {
                    Iterator it = ((ArrayList) this.f6522c).iterator();
                    while (it.hasNext()) {
                        ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i7);
                    }
                    return;
                }
                return;
            case 1:
                if (i7 == 0) {
                    float refreshRate = ((DisplayManager) this.f6521b).getDisplay(0).getRefreshRate();
                    io.flutter.view.w wVar = (io.flutter.view.w) this.f6522c;
                    wVar.f12530a = (long) (1.0E9d / refreshRate);
                    wVar.f12531b.setRefreshRateFPS(refreshRate);
                    return;
                }
                return;
            case 2:
                if (i7 == 0) {
                    k1.q.a((k1.q) this.f6522c, ((DisplayManager) this.f6521b).getDisplay(0));
                    return;
                }
                return;
            default:
                P.b bVar = new P.b(P.a.f3887a, new P.c((Size) this.f6522c), null);
                C0501c c0501c = androidx.camera.core.impl.Q.f7583G;
                androidx.camera.core.impl.W w2 = ((D.J) this.f6521b).f620b;
                w2.j(c0501c, bVar);
                androidx.camera.core.impl.M m7 = new androidx.camera.core.impl.M(androidx.camera.core.impl.Z.a(w2));
                androidx.camera.core.impl.P.e(m7);
                new D.M(m7);
                return;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
        switch (this.f6520a) {
            case 0:
                Iterator it = ((ArrayList) this.f6522c).iterator();
                while (it.hasNext()) {
                    ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i7);
                }
                return;
            case 1:
            case 2:
            default:
                return;
        }
    }

    private final void a(int i7) {
    }

    private final void b(int i7) {
    }

    private final void c(int i7) {
    }

    private final void d(int i7) {
    }

    private final void e(int i7) {
    }

    private final void f(int i7) {
    }
}
