package w;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;
import p.C1608t;
/* renamed from: w.X  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1913X implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16145a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1914Y f16146b;

    public /* synthetic */ RunnableC1913X(C1914Y c1914y, int i7) {
        this.f16145a = i7;
        this.f16146b = c1914y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16145a) {
            case 0:
                C1914Y c1914y = this.f16146b;
                c1914y.g(c1914y);
                return;
            default:
                C1914Y c1914y2 = this.f16146b;
                c1914y2.l("Session call super.close()");
                g0.c.f(c1914y2.f16152g, "Need to call openCaptureSession before using this API.");
                M3.q qVar = c1914y2.f16148b;
                synchronized (qVar.f3254c) {
                    ((LinkedHashSet) qVar.f3256e).add(c1914y2);
                }
                ((CameraCaptureSession) ((C1608t) c1914y2.f16152g.f11091a).f14880b).close();
                c1914y2.f16150d.execute(new RunnableC1913X(c1914y2, 0));
                return;
        }
    }
}
