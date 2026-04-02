package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import o2.C1554f;
/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b  reason: collision with root package name */
    public SidecarDeviceState f8077b;

    /* renamed from: d  reason: collision with root package name */
    public final C1554f f8079d;

    /* renamed from: e  reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f8080e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f8076a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f8078c = new WeakHashMap();

    public DistinctElementSidecarCallback(C1554f c1554f, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f8079d = c1554f;
        this.f8080e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f8076a) {
            try {
                C1554f c1554f = this.f8079d;
                SidecarDeviceState sidecarDeviceState2 = this.f8077b;
                c1554f.getClass();
                if (C1554f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f8077b = sidecarDeviceState;
                this.f8080e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f8076a) {
            try {
                this.f8079d.getClass();
                if (C1554f.d((SidecarWindowLayoutInfo) this.f8078c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f8078c.put(iBinder, sidecarWindowLayoutInfo);
                this.f8080e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
