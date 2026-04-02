package v;

import A.m;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0501c;
/* renamed from: v.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878a extends m {

    /* renamed from: c  reason: collision with root package name */
    public static final C0501c f16028c = new C0501c("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* renamed from: d  reason: collision with root package name */
    public static final C0501c f16029d = new C0501c("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* renamed from: e  reason: collision with root package name */
    public static final C0501c f16030e = new C0501c("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);
    public static final C0501c f = new C0501c("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* renamed from: X  reason: collision with root package name */
    public static final C0501c f16026X = new C0501c("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* renamed from: Y  reason: collision with root package name */
    public static final C0501c f16027Y = new C0501c("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static C0501c o0(CaptureRequest.Key key) {
        return new C0501c("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
