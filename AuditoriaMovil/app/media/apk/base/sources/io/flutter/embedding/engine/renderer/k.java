package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import c6.RunnableC0705t;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.r;
import io.flutter.view.s;
/* loaded from: classes.dex */
public final class k implements TextureRegistry$SurfaceTextureEntry, s {

    /* renamed from: a  reason: collision with root package name */
    public final long f11591a;

    /* renamed from: b  reason: collision with root package name */
    public final SurfaceTextureWrapper f11592b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f11593c;

    /* renamed from: d  reason: collision with root package name */
    public s f11594d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m f11595e;

    public k(m mVar, long j, SurfaceTexture surfaceTexture) {
        this.f11595e = mVar;
        this.f11591a = j;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new f(this, 1));
        this.f11592b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.j
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                k kVar = k.this;
                if (!kVar.f11593c) {
                    m mVar2 = kVar.f11595e;
                    if (mVar2.f11612a.isAttached()) {
                        kVar.f11592b.markDirty();
                        mVar2.f11612a.scheduleFrame();
                    }
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f11593c) {
                return;
            }
            m mVar = this.f11595e;
            mVar.f11616e.post(new RunnableC0705t(this.f11591a, mVar.f11612a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f11591a;
    }

    @Override // io.flutter.view.s
    public final void onTrimMemory(int i7) {
        s sVar = this.f11594d;
        if (sVar != null) {
            sVar.onTrimMemory(i7);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f11593c) {
            return;
        }
        this.f11592b.release();
        m mVar = this.f11595e;
        mVar.f11612a.unregisterTexture(this.f11591a);
        mVar.f(this);
        this.f11593c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(r rVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(s sVar) {
        this.f11594d = sVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f11592b.surfaceTexture();
    }
}
