package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import c1.RunnableC0626c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p.C1608t;
/* renamed from: w.L  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1902L extends AbstractC1911V {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16077a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f16078b;

    public C1902L(int i7, List list) {
        Object c1894d;
        this.f16077a = i7;
        switch (i7) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.f16078b = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    c1894d = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    c1894d = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    c1894d = new C1894D(list);
                }
                this.f16078b = c1894d;
                return;
        }
    }

    @Override // w.AbstractC1911V
    public void a(C1914Y c1914y) {
        switch (this.f16077a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f16078b).onActive((CameraCaptureSession) ((C1608t) c1914y.w().f11091a).f14880b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).a(c1914y);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.AbstractC1911V
    public void b(C1914Y c1914y) {
        switch (this.f16077a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f16078b).onCaptureQueueEmpty((CameraCaptureSession) ((C1608t) c1914y.w().f11091a).f14880b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).b(c1914y);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.AbstractC1911V
    public void c(C1914Y c1914y) {
        switch (this.f16077a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f16078b).onClosed((CameraCaptureSession) ((C1608t) c1914y.w().f11091a).f14880b);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).c(c1914y);
                }
                return;
            default:
                return;
        }
    }

    @Override // w.AbstractC1911V
    public final void d(C1914Y c1914y) {
        switch (this.f16077a) {
            case 0:
                synchronized (((C1903M) this.f16078b).f16079a) {
                    try {
                        switch (((C1903M) this.f16078b).f16086i.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + ((C1903M) this.f16078b).f16086i);
                            case 3:
                            case 5:
                            case 6:
                                ((C1903M) this.f16078b).d();
                                break;
                            case 7:
                                org.slf4j.helpers.i.l("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                                break;
                        }
                        org.slf4j.helpers.i.t("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + ((C1903M) this.f16078b).f16086i);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f16078b).onConfigureFailed((CameraCaptureSession) ((C1608t) c1914y.w().f11091a).f14880b);
                return;
            default:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).d(c1914y);
                }
                return;
        }
    }

    @Override // w.AbstractC1911V
    public final void e(C1914Y c1914y) {
        switch (this.f16077a) {
            case 0:
                synchronized (((C1903M) this.f16078b).f16079a) {
                    try {
                        switch (((C1903M) this.f16078b).f16086i.ordinal()) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: " + ((C1903M) this.f16078b).f16086i);
                            case 3:
                                C1903M c1903m = (C1903M) this.f16078b;
                                c1903m.f16086i = EnumC1901K.OPENED;
                                c1903m.f16083e = c1914y;
                                org.slf4j.helpers.i.l("CaptureSession", "Attempting to send capture request onConfigured");
                                C1903M c1903m2 = (C1903M) this.f16078b;
                                c1903m2.l(c1903m2.f);
                                C1903M c1903m3 = (C1903M) this.f16078b;
                                c1903m3.f16091o.g().a(new RunnableC0626c(c1903m3, 26), j3.f.r());
                                break;
                            case 5:
                                ((C1903M) this.f16078b).f16083e = c1914y;
                                break;
                            case 6:
                                c1914y.j();
                                break;
                        }
                        org.slf4j.helpers.i.l("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + ((C1903M) this.f16078b).f16086i);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f16078b).onConfigured((CameraCaptureSession) ((C1608t) c1914y.w().f11091a).f14880b);
                return;
            default:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).e(c1914y);
                }
                return;
        }
    }

    @Override // w.AbstractC1911V
    public final void f(C1914Y c1914y) {
        switch (this.f16077a) {
            case 0:
                synchronized (((C1903M) this.f16078b).f16079a) {
                    try {
                        if (((C1903M) this.f16078b).f16086i.ordinal() != 0) {
                            org.slf4j.helpers.i.l("CaptureSession", "CameraCaptureSession.onReady() " + ((C1903M) this.f16078b).f16086i);
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: " + ((C1903M) this.f16078b).f16086i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.f16078b).onReady((CameraCaptureSession) ((C1608t) c1914y.w().f11091a).f14880b);
                return;
            default:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).f(c1914y);
                }
                return;
        }
    }

    @Override // w.AbstractC1911V
    public final void g(C1914Y c1914y) {
        switch (this.f16077a) {
            case 0:
                synchronized (((C1903M) this.f16078b).f16079a) {
                    try {
                        if (((C1903M) this.f16078b).f16086i != EnumC1901K.UNINITIALIZED) {
                            org.slf4j.helpers.i.l("CaptureSession", "onSessionFinished()");
                            ((C1903M) this.f16078b).d();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: " + ((C1903M) this.f16078b).f16086i);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).g(c1914y);
                }
                return;
        }
    }

    @Override // w.AbstractC1911V
    public void h(C1914Y c1914y, Surface surface) {
        switch (this.f16077a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.f16078b).onSurfacePrepared((CameraCaptureSession) ((C1608t) c1914y.w().f11091a).f14880b, surface);
                return;
            case 2:
                Iterator it = ((ArrayList) this.f16078b).iterator();
                while (it.hasNext()) {
                    ((AbstractC1911V) it.next()).h(c1914y, surface);
                }
                return;
            default:
                return;
        }
    }

    public C1902L(C1903M c1903m) {
        this.f16077a = 0;
        this.f16078b = c1903m;
    }

    private final void i(C1914Y c1914y) {
    }
}
