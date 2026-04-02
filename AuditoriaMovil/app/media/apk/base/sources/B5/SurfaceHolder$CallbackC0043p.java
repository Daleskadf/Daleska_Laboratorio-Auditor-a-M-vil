package B5;

import android.view.Surface;
import android.view.SurfaceHolder;
/* renamed from: B5.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolder$CallbackC0043p implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f376a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f377b;

    public /* synthetic */ SurfaceHolder$CallbackC0043p(Object obj, int i7) {
        this.f376a = i7;
        this.f377b = obj;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
        switch (this.f376a) {
            case 0:
                C0044q c0044q = (C0044q) this.f377b;
                io.flutter.embedding.engine.renderer.m mVar = c0044q.f380c;
                if (mVar != null && !c0044q.f379b) {
                    if (mVar != null) {
                        mVar.f11612a.onSurfaceChanged(i8, i9);
                        return;
                    }
                    throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
                }
                return;
            default:
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        switch (this.f376a) {
            case 0:
                C0044q c0044q = (C0044q) this.f377b;
                boolean z7 = true;
                c0044q.f378a = true;
                if ((c0044q.f380c == null || c0044q.f379b) ? false : false) {
                    c0044q.a();
                    return;
                }
                return;
            default:
                Surface surface = surfaceHolder.getSurface();
                O0.r rVar = (O0.r) this.f377b;
                ((O0.H) rVar).U(surface);
                B0.b bVar = (B0.b) rVar;
                bVar.getClass();
                bVar.r(((O0.H) bVar).E(), 1L);
                return;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        switch (this.f376a) {
            case 0:
                C0044q c0044q = (C0044q) this.f377b;
                boolean z7 = false;
                c0044q.f378a = false;
                io.flutter.embedding.engine.renderer.m mVar = c0044q.f380c;
                if (mVar != null && !c0044q.f379b) {
                    z7 = true;
                }
                if (z7) {
                    if (mVar != null) {
                        mVar.g();
                        return;
                    }
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
                return;
            default:
                ((O0.H) ((O0.r) this.f377b)).U(null);
                return;
        }
    }

    private final void a(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
    }
}
