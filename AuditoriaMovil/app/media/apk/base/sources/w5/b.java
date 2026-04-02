package W5;

import O0.H;
import O0.r;
import io.flutter.plugins.videoplayer.o;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.t;
/* loaded from: classes.dex */
public final class b extends o implements t {

    /* renamed from: d  reason: collision with root package name */
    public boolean f6222d;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.videoplayer.b, W5.a] */
    @Override // io.flutter.plugins.videoplayer.o
    public final io.flutter.plugins.videoplayer.b a(r rVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer != null) {
            boolean handlesCropAndRotation = textureRegistry$SurfaceProducer.handlesCropAndRotation();
            ?? bVar = new io.flutter.plugins.videoplayer.b(rVar, this.f12420a);
            bVar.f6221e = handlesCropAndRotation;
            return bVar;
        }
        throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
    }

    @Override // io.flutter.view.t
    public final void b() {
        if (this.f6222d) {
            ((H) this.f12422c).U(this.f12421b.getSurface());
            this.f6222d = false;
        }
    }

    @Override // io.flutter.view.t
    public final void c() {
        ((H) this.f12422c).U(null);
        this.f6222d = true;
    }

    @Override // io.flutter.plugins.videoplayer.o
    public final void d() {
        super.d();
        this.f12421b.release();
    }
}
