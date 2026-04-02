package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;
/* loaded from: classes.dex */
public final class v implements i {

    /* renamed from: a  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f11748a;

    /* renamed from: b  reason: collision with root package name */
    public SurfaceTexture f11749b;

    /* renamed from: c  reason: collision with root package name */
    public Surface f11750c;

    /* renamed from: d  reason: collision with root package name */
    public int f11751d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f11752e = 0;
    public boolean f = false;

    public v(io.flutter.embedding.engine.renderer.k kVar) {
        u uVar = new u(this);
        this.f11748a = kVar;
        this.f11749b = kVar.f11592b.surfaceTexture();
        kVar.f11594d = uVar;
    }

    @Override // io.flutter.plugin.platform.i
    public final void a(int i7, int i8) {
        this.f11751d = i7;
        this.f11752e = i8;
        SurfaceTexture surfaceTexture = this.f11749b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i7, i8);
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final long b() {
        return this.f11748a.f11591a;
    }

    @Override // io.flutter.plugin.platform.i
    public final int getHeight() {
        return this.f11752e;
    }

    @Override // io.flutter.plugin.platform.i
    public final Surface getSurface() {
        boolean isReleased;
        Surface surface = this.f11750c;
        if (surface == null || this.f) {
            if (surface != null) {
                surface.release();
                this.f11750c = null;
            }
            this.f11750c = new Surface(this.f11749b);
            this.f = false;
        }
        SurfaceTexture surfaceTexture = this.f11749b;
        if (surfaceTexture != null) {
            isReleased = surfaceTexture.isReleased();
            if (!isReleased) {
                return this.f11750c;
            }
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.i
    public final int getWidth() {
        return this.f11751d;
    }

    @Override // io.flutter.plugin.platform.i
    public final void release() {
        this.f11749b = null;
        Surface surface = this.f11750c;
        if (surface != null) {
            surface.release();
            this.f11750c = null;
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final /* synthetic */ void scheduleFrame() {
    }
}
