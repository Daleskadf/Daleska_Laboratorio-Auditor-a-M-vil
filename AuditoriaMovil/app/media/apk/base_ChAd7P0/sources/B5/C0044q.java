package B5;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;
/* renamed from: B5.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044q extends SurfaceView implements io.flutter.embedding.engine.renderer.o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f378a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f379b;

    /* renamed from: c  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.m f380c;

    /* renamed from: d  reason: collision with root package name */
    public final C0033f f381d;

    public C0044q(AbstractActivityC0032e abstractActivityC0032e, boolean z7) {
        super(abstractActivityC0032e, null);
        this.f378a = false;
        this.f379b = false;
        SurfaceHolder$CallbackC0043p surfaceHolder$CallbackC0043p = new SurfaceHolder$CallbackC0043p(this, 0);
        this.f381d = new C0033f(this, 1);
        if (z7) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(surfaceHolder$CallbackC0043p);
        setAlpha(0.0f);
    }

    public final void a() {
        if (this.f380c != null && getHolder() != null) {
            io.flutter.embedding.engine.renderer.m mVar = this.f380c;
            Surface surface = getHolder().getSurface();
            boolean z7 = this.f379b;
            if (!z7) {
                mVar.g();
            }
            mVar.f11614c = surface;
            FlutterJNI flutterJNI = mVar.f11612a;
            if (z7) {
                flutterJNI.onSurfaceWindowChanged(surface);
                return;
            } else {
                flutterJNI.onSurfaceCreated(surface);
                return;
            }
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void c() {
        if (this.f380c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f379b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void d() {
        if (this.f380c != null) {
            if (getWindowToken() != null) {
                io.flutter.embedding.engine.renderer.m mVar = this.f380c;
                if (mVar != null) {
                    mVar.g();
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            setAlpha(0.0f);
            this.f380c.f11612a.removeIsDisplayingFlutterUiListener(this.f381d);
            this.f380c = null;
            return;
        }
        Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void e() {
        io.flutter.embedding.engine.renderer.m mVar = this.f380c;
        if (mVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = mVar.f11612a;
        C0033f c0033f = this.f381d;
        flutterJNI.addIsDisplayingFlutterUiListener(c0033f);
        if (mVar.f11615d) {
            c0033f.b();
        }
        if (this.f378a) {
            a();
        }
        this.f379b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void f(io.flutter.embedding.engine.renderer.m mVar) {
        io.flutter.embedding.engine.renderer.m mVar2 = this.f380c;
        if (mVar2 != null) {
            mVar2.g();
            this.f380c.f11612a.removeIsDisplayingFlutterUiListener(this.f381d);
        }
        this.f380c = mVar;
        e();
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i7 = iArr[0];
        region.op(i7, iArr[1], (getRight() + i7) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public io.flutter.embedding.engine.renderer.m getAttachedRenderer() {
        return this.f380c;
    }
}
