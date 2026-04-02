package w;

import a1.C0415A;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
/* renamed from: w.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1917b implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final Range f16170a;

    /* renamed from: c  reason: collision with root package name */
    public U.i f16172c;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f16174e;

    /* renamed from: b  reason: collision with root package name */
    public float f16171b = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f16173d = 1.0f;

    public C1917b(x.j jVar) {
        CameraCharacteristics.Key key;
        CameraCharacteristics.Key key2;
        boolean z7 = false;
        this.f16174e = false;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f16170a = (Range) jVar.a(key);
        if (Build.VERSION.SDK_INT >= 34) {
            C0415A c0415a = jVar.f16400b;
            key2 = CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES;
            int[] iArr = (int[]) ((CameraCharacteristics) c0415a.f6744a).get(key2);
            if (iArr != null) {
                int length = iArr.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    } else if (iArr[i7] == 1) {
                        z7 = true;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        this.f16174e = z7;
    }

    @Override // w.g0
    public final void b(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f;
        if (this.f16172c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request != null) {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f = (Float) request.get(key);
            } else {
                f = null;
            }
            if (f == null) {
                return;
            }
            if (this.f16173d == f.floatValue()) {
                this.f16172c.a(null);
                this.f16172c = null;
            }
        }
    }

    @Override // w.g0
    public final void c(float f, U.i iVar) {
        this.f16171b = f;
        U.i iVar2 = this.f16172c;
        if (iVar2 != null) {
            iVar2.b(new Exception("There is a new zoomRatio being set"));
        }
        this.f16173d = this.f16171b;
        this.f16172c = iVar;
    }

    @Override // w.g0
    public final float h() {
        return ((Float) this.f16170a.getUpper()).floatValue();
    }

    @Override // w.g0
    public final void k(D.J j) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        Float valueOf = Float.valueOf(this.f16171b);
        androidx.camera.core.impl.F priority = androidx.camera.core.impl.F.REQUIRED;
        j.a(key, valueOf, priority);
        if (this.f16174e) {
            kotlin.jvm.internal.j.e(priority, "priority");
            if (Build.VERSION.SDK_INT >= 34) {
                key2 = CaptureRequest.CONTROL_SETTINGS_OVERRIDE;
                j.a(key2, 1, priority);
            }
        }
    }

    @Override // w.g0
    public final float n() {
        return ((Float) this.f16170a.getLower()).floatValue();
    }

    @Override // w.g0
    public final void p() {
        this.f16171b = 1.0f;
        U.i iVar = this.f16172c;
        if (iVar != null) {
            iVar.b(new Exception("Camera is not active."));
            this.f16172c = null;
        }
    }
}
