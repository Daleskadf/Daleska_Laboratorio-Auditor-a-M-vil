package w;

import D.C0057g;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import c6.RunnableC0703s0;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p.C1608t;
/* renamed from: w.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1935t extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final G.k f16262a;

    /* renamed from: b  reason: collision with root package name */
    public final G.e f16263b;

    /* renamed from: c  reason: collision with root package name */
    public RunnableC0703s0 f16264c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f16265d;

    /* renamed from: e  reason: collision with root package name */
    public final X3.a f16266e;
    public final /* synthetic */ C1936u f;

    public C1935t(C1936u c1936u, G.k kVar, G.e eVar, long j) {
        this.f = c1936u;
        this.f16262a = kVar;
        this.f16263b = eVar;
        this.f16266e = new X3.a(this, j);
    }

    public final boolean a() {
        if (this.f16265d == null) {
            return false;
        }
        this.f.t("Cancelling scheduled re-open: " + this.f16264c, null);
        this.f16264c.f8976b = true;
        this.f16264c = null;
        this.f16265d.cancel(false);
        this.f16265d = null;
        return true;
    }

    public final void b() {
        boolean z7;
        boolean z8 = true;
        if (this.f16264c == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g(null, z7);
        if (this.f16265d != null) {
            z8 = false;
        }
        g0.c.g(null, z8);
        X3.a aVar = this.f16266e;
        aVar.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (aVar.f6374b == -1) {
            aVar.f6374b = uptimeMillis;
        }
        int i7 = ((uptimeMillis - aVar.f6374b) > aVar.d() ? 1 : ((uptimeMillis - aVar.f6374b) == aVar.d() ? 0 : -1));
        C1936u c1936u = this.f;
        if (i7 >= 0) {
            aVar.f6374b = -1L;
            org.slf4j.helpers.i.t("Camera2CameraImpl", "Camera reopening attempted for " + aVar.d() + "ms without success.");
            c1936u.F(EnumC1934s.PENDING_OPEN, null, false);
            return;
        }
        this.f16264c = new RunnableC0703s0(this, this.f16262a);
        c1936u.t("Attempting camera re-open in " + aVar.c() + "ms: " + this.f16264c + " activeResuming = " + c1936u.f16297y0, null);
        this.f16265d = this.f16263b.schedule(this.f16264c, (long) aVar.c(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        int i7;
        C1936u c1936u = this.f;
        if (c1936u.f16297y0 && ((i7 = c1936u.f16280g0) == 1 || i7 == 2)) {
            return true;
        }
        return false;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        boolean z7;
        this.f.t("CameraDevice.onClosed()", null);
        if (this.f.f16279f0 == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        g0.c.g("Unexpected onClose callback on camera device: " + cameraDevice, z7);
        int ordinal = this.f.f16277e.ordinal();
        if (ordinal != 1 && ordinal != 4) {
            if (ordinal != 5 && ordinal != 6) {
                throw new IllegalStateException("Camera closed while in state: " + this.f.f16277e);
            }
            C1936u c1936u = this.f;
            int i7 = c1936u.f16280g0;
            if (i7 != 0) {
                c1936u.t("Camera closed due to error: ".concat(C1936u.v(i7)), null);
                b();
                return;
            }
            c1936u.J(false);
            return;
        }
        g0.c.g(null, this.f.f16282i0.isEmpty());
        this.f.r();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean z7;
        int i8;
        C1936u c1936u = this.f;
        c1936u.f16279f0 = cameraDevice;
        c1936u.f16280g0 = i7;
        C1608t c1608t = c1936u.f16269C0;
        ((C1936u) c1608t.f14881c).t("Camera receive onErrorCallback", null);
        c1608t.s();
        int ordinal = this.f.f16277e.ordinal();
        if (ordinal != 1) {
            switch (ordinal) {
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    String id = cameraDevice.getId();
                    String v6 = C1936u.v(i7);
                    String name = this.f.f16277e.name();
                    StringBuilder l8 = io.flutter.plugins.pathprovider.b.l("CameraDevice.onError(): ", id, " failed with ", v6, " while in ");
                    l8.append(name);
                    l8.append(" state. Will attempt recovering from error.");
                    org.slf4j.helpers.i.l("Camera2CameraImpl", l8.toString());
                    boolean z8 = false;
                    if (this.f.f16277e != EnumC1934s.OPENING && this.f.f16277e != EnumC1934s.OPENED && this.f.f16277e != EnumC1934s.CONFIGURED && this.f.f16277e != EnumC1934s.REOPENING && this.f.f16277e != EnumC1934s.REOPENING_QUIRK) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    g0.c.g("Attempt to handle open error from non open state: " + this.f.f16277e, z7);
                    int i9 = 3;
                    if (i7 != 1 && i7 != 2 && i7 != 4) {
                        org.slf4j.helpers.i.t("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C1936u.v(i7) + " closing camera.");
                        if (i7 == 3) {
                            i8 = 5;
                        } else {
                            i8 = 6;
                        }
                        this.f.F(EnumC1934s.CLOSING, new C0057g(i8, null), true);
                        this.f.q();
                        return;
                    }
                    org.slf4j.helpers.i.l("Camera2CameraImpl", io.flutter.plugins.pathprovider.b.j("Attempt to reopen camera[", cameraDevice.getId(), "] after error[", C1936u.v(i7), "]"));
                    C1936u c1936u2 = this.f;
                    if (c1936u2.f16280g0 != 0) {
                        z8 = true;
                    }
                    g0.c.g("Can only reopen camera device after error if the camera device is actually in an error state.", z8);
                    if (i7 != 1) {
                        if (i7 == 2) {
                            i9 = 1;
                        }
                    } else {
                        i9 = 2;
                    }
                    c1936u2.F(EnumC1934s.REOPENING, new C0057g(i9, null), true);
                    c1936u2.q();
                    return;
                default:
                    throw new IllegalStateException("onError() should not be possible from state: " + this.f.f16277e);
            }
        }
        String id2 = cameraDevice.getId();
        String v7 = C1936u.v(i7);
        String name2 = this.f.f16277e.name();
        StringBuilder l9 = io.flutter.plugins.pathprovider.b.l("CameraDevice.onError(): ", id2, " failed with ", v7, " while in ");
        l9.append(name2);
        l9.append(" state. Will finish closing camera.");
        org.slf4j.helpers.i.t("Camera2CameraImpl", l9.toString());
        this.f.q();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f.t("CameraDevice.onOpened()", null);
        C1936u c1936u = this.f;
        c1936u.f16279f0 = cameraDevice;
        c1936u.f16280g0 = 0;
        this.f16266e.f6374b = -1L;
        int ordinal = c1936u.f16277e.ordinal();
        if (ordinal != 1 && ordinal != 4) {
            if (ordinal != 5 && ordinal != 6 && ordinal != 7) {
                throw new IllegalStateException("onOpened() should not be possible from state: " + this.f.f16277e);
            }
            this.f.E(EnumC1934s.OPENED);
            androidx.camera.core.impl.B b5 = this.f.f16286m0;
            String id = cameraDevice.getId();
            C1936u c1936u2 = this.f;
            if (b5.e(id, c1936u2.f16285l0.e(c1936u2.f16279f0.getId()))) {
                this.f.B();
                return;
            }
            return;
        }
        g0.c.g(null, this.f.f16282i0.isEmpty());
        this.f.f16279f0.close();
        this.f.f16279f0 = null;
    }
}
