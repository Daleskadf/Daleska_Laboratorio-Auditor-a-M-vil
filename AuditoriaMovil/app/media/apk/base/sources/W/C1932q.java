package w;

import android.hardware.camera2.CameraManager;
/* renamed from: w.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1932q extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final String f16257a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16258b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C1936u f16259c;

    public C1932q(C1936u c1936u, String str) {
        this.f16259c = c1936u;
        this.f16257a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (!this.f16257a.equals(str)) {
            return;
        }
        this.f16258b = true;
        if (this.f16259c.f16277e == EnumC1934s.PENDING_OPEN) {
            this.f16259c.J(false);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (!this.f16257a.equals(str)) {
            return;
        }
        this.f16258b = false;
    }
}
