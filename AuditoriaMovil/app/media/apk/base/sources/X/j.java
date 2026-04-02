package x;

import a1.C0415A;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import e0.C0927b;
import java.util.HashMap;
import p4.P;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public final C0415A f16400b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16401c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f16399a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public P f16402d = null;

    public j(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f16400b = new C0415A(cameraCharacteristics);
        } else {
            this.f16400b = new C0415A(cameraCharacteristics);
        }
        this.f16401c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f16400b.f6744a).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f16399a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f16400b.f6744a).get(key);
                if (obj2 != null) {
                    this.f16399a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p4.P, java.lang.Object] */
    public final P b() {
        if (this.f16402d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    A.f fVar = new A.f(this.f16401c);
                    ?? obj = new Object();
                    obj.f15212c = new HashMap();
                    new HashMap();
                    new HashMap();
                    obj.f15210a = new C0927b(streamConfigurationMap);
                    obj.f15211b = fVar;
                    this.f16402d = obj;
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError | NullPointerException e7) {
                throw new IllegalArgumentException(e7.getMessage());
            }
        }
        return this.f16402d;
    }
}
