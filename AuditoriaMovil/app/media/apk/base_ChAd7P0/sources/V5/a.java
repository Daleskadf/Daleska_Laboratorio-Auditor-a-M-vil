package V5;

import B5.SurfaceHolder$CallbackC0043p;
import O0.H;
import O0.r;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.plugin.platform.g;
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5974a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final View f5975b;

    public a(Context context, r rVar) {
        SurfaceView surfaceView = new SurfaceView(context);
        this.f5975b = surfaceView;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 == 28) {
            surfaceView.getHolder().addCallback(new SurfaceHolder$CallbackC0043p(rVar, 1));
            return;
        }
        if (i7 <= 25) {
            surfaceView.setZOrderMediaOverlay(true);
        }
        H h8 = (H) rVar;
        h8.Z();
        SurfaceHolder holder = surfaceView.getHolder();
        h8.Z();
        if (holder == null) {
            h8.Z();
            h8.R();
            h8.T(null);
            h8.P(0, 0);
            return;
        }
        h8.R();
        h8.f3498L0 = true;
        h8.f3497K0 = holder;
        holder.addCallback(h8.q0);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            h8.T(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            h8.P(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        h8.T(null);
        h8.P(0, 0);
    }

    @Override // io.flutter.plugin.platform.g
    public final void a() {
        switch (this.f5974a) {
            case 0:
                ((SurfaceView) this.f5975b).getHolder().getSurface().release();
                return;
            default:
                return;
        }
    }

    @Override // io.flutter.plugin.platform.g
    public final View getView() {
        switch (this.f5974a) {
            case 0:
                return (SurfaceView) this.f5975b;
            default:
                return this.f5975b;
        }
    }

    public a(View view) {
        this.f5975b = view;
    }

    private final void b() {
    }
}
