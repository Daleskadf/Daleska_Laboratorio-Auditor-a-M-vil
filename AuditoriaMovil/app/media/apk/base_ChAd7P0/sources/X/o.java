package x;

import android.hardware.camera2.CameraManager;
import c1.RunnableC0626c;
import w.C1932q;
/* loaded from: classes.dex */
public final class o extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final G.k f16409a;

    /* renamed from: b  reason: collision with root package name */
    public final C1932q f16410b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16411c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f16412d = false;

    public o(G.k kVar, C1932q c1932q) {
        this.f16409a = kVar;
        this.f16410b = c1932q;
    }

    public final void a() {
        synchronized (this.f16411c) {
            this.f16412d = true;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f16411c) {
            try {
                if (!this.f16412d) {
                    this.f16409a.execute(new RunnableC0626c(this, 28));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f16411c) {
            try {
                if (!this.f16412d) {
                    this.f16409a.execute(new n(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f16411c) {
            try {
                if (!this.f16412d) {
                    this.f16409a.execute(new n(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
