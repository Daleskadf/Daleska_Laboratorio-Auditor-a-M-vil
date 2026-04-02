package B5;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
/* loaded from: classes.dex */
public final class r implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0045s f382a;

    public r(C0045s c0045s) {
        this.f382a = c0045s;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        C0045s c0045s = this.f382a;
        boolean z7 = true;
        c0045s.f383a = true;
        if ((c0045s.f385c == null || c0045s.f384b) ? false : false) {
            c0045s.a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C0045s c0045s = this.f382a;
        boolean z7 = false;
        c0045s.f383a = false;
        io.flutter.embedding.engine.renderer.m mVar = c0045s.f385c;
        if (mVar != null && !c0045s.f384b) {
            z7 = true;
        }
        if (z7) {
            if (mVar != null) {
                mVar.g();
                Surface surface = c0045s.f386d;
                if (surface != null) {
                    surface.release();
                    c0045s.f386d = null;
                }
            } else {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
        }
        Surface surface2 = c0045s.f386d;
        if (surface2 != null) {
            surface2.release();
            c0045s.f386d = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        C0045s c0045s = this.f382a;
        io.flutter.embedding.engine.renderer.m mVar = c0045s.f385c;
        if (mVar != null && !c0045s.f384b) {
            if (mVar != null) {
                mVar.f11612a.onSurfaceChanged(i7, i8);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
