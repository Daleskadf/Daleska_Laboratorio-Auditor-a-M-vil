package x;

import android.hardware.camera2.CameraAccessException;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/* renamed from: x.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1967a extends Exception {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f16374b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: a  reason: collision with root package name */
    public final int f16375a;

    static {
        DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public C1967a(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f16375a = 10001;
        if (f16374b.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public C1967a(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f16375a = cameraAccessException.getReason();
    }

    public C1967a(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f16375a = 10002;
        if (f16374b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
