package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import c6.RunnableC0705t;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.t;
/* loaded from: classes.dex */
public final class p implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final long f11619a;

    /* renamed from: b  reason: collision with root package name */
    public int f11620b;

    /* renamed from: c  reason: collision with root package name */
    public int f11621c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11622d;

    /* renamed from: e  reason: collision with root package name */
    public Surface f11623e;
    public final k f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f11624g;

    /* renamed from: h  reason: collision with root package name */
    public final FlutterJNI f11625h;

    public p(long j, Handler handler, FlutterJNI flutterJNI, k kVar) {
        this.f11619a = j;
        this.f11624g = handler;
        this.f11625h = flutterJNI;
        this.f = kVar;
    }

    public final void finalize() {
        try {
            if (this.f11622d) {
                return;
            }
            release();
            this.f11624g.post(new RunnableC0705t(this.f11619a, this.f11625h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f11621c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        if (this.f11623e == null) {
            this.f11623e = new Surface(this.f.f11592b.surfaceTexture());
        }
        return this.f11623e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f.f11592b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f11620b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f11619a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f.release();
        this.f11622d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f11625h.markTextureFrameAvailable(this.f11619a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(t tVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i7, int i8) {
        this.f11620b = i7;
        this.f11621c = i8;
        this.f.f11592b.surfaceTexture().setDefaultBufferSize(i7, i8);
    }
}
