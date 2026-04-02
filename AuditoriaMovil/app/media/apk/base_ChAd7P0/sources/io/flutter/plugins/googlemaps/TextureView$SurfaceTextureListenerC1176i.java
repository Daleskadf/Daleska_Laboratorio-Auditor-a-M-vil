package io.flutter.plugins.googlemaps;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
/* renamed from: io.flutter.plugins.googlemaps.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureView$SurfaceTextureListenerC1176i implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextureView.SurfaceTextureListener f12159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q3.f f12160b;

    public TextureView$SurfaceTextureListenerC1176i(TextureView.SurfaceTextureListener surfaceTextureListener, q3.f fVar) {
        this.f12159a = surfaceTextureListener;
        this.f12160b = fVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f12159a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i7, i8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f12159a;
        if (surfaceTextureListener != null) {
            return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i8) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f12159a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i7, i8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f12159a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        this.f12160b.invalidate();
    }
}
