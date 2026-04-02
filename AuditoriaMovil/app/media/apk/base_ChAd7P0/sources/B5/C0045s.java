package B5;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;
/* renamed from: B5.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045s extends TextureView implements io.flutter.embedding.engine.renderer.o {

    /* renamed from: a  reason: collision with root package name */
    public boolean f383a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f384b;

    /* renamed from: c  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.m f385c;

    /* renamed from: d  reason: collision with root package name */
    public Surface f386d;

    public final void a() {
        if (this.f385c != null && getSurfaceTexture() != null) {
            Surface surface = this.f386d;
            if (surface != null) {
                surface.release();
                this.f386d = null;
            }
            Surface surface2 = new Surface(getSurfaceTexture());
            this.f386d = surface2;
            io.flutter.embedding.engine.renderer.m mVar = this.f385c;
            boolean z7 = this.f384b;
            if (!z7) {
                mVar.g();
            }
            mVar.f11614c = surface2;
            FlutterJNI flutterJNI = mVar.f11612a;
            if (z7) {
                flutterJNI.onSurfaceWindowChanged(surface2);
                return;
            } else {
                flutterJNI.onSurfaceCreated(surface2);
                return;
            }
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void c() {
        if (this.f385c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f384b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void d() {
        if (this.f385c != null) {
            if (getWindowToken() != null) {
                io.flutter.embedding.engine.renderer.m mVar = this.f385c;
                if (mVar != null) {
                    mVar.g();
                    Surface surface = this.f386d;
                    if (surface != null) {
                        surface.release();
                        this.f386d = null;
                    }
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            this.f385c = null;
            return;
        }
        Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void e() {
        if (this.f385c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f383a) {
            a();
        }
        this.f384b = false;
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void f(io.flutter.embedding.engine.renderer.m mVar) {
        io.flutter.embedding.engine.renderer.m mVar2 = this.f385c;
        if (mVar2 != null) {
            mVar2.g();
        }
        this.f385c = mVar;
        e();
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public io.flutter.embedding.engine.renderer.m getAttachedRenderer() {
        return this.f385c;
    }

    public void setRenderSurface(Surface surface) {
        this.f386d = surface;
    }
}
