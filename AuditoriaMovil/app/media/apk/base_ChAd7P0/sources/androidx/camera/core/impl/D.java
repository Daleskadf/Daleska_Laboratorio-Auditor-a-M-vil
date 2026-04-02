package androidx.camera.core.impl;

import D.C0070u;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    public static final C0070u f7532a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new U(2));
        f7532a = new C0070u(linkedHashSet);
    }

    public static void a(Context context, a6.t0 t0Var, C0070u c0070u) {
        Integer b5;
        LinkedHashSet E4;
        int i7 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && F.e.g(context) != 0) {
            if (!t0Var.E().isEmpty()) {
                org.slf4j.helpers.i.l("CameraValidator", "Virtual device with ID: " + F.e.g(context) + " has " + E4.size() + " cameras. Skipping validation.");
                return;
            }
            throw new C("No cameras available", 0, null);
        }
        if (c0070u != null) {
            try {
                b5 = c0070u.b();
                if (b5 == null) {
                    org.slf4j.helpers.i.O("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e7) {
                org.slf4j.helpers.i.u("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e7);
                return;
            }
        } else {
            b5 = null;
        }
        org.slf4j.helpers.i.l("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + b5);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (c0070u != null) {
                    if (b5.intValue() == 1) {
                    }
                }
                C0070u.f780c.c(t0Var.E());
                i7 = 1;
            }
        } catch (IllegalArgumentException e8) {
            illegalArgumentException = e8;
            org.slf4j.helpers.i.P("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c0070u != null) {
                    if (b5.intValue() == 0) {
                    }
                }
                C0070u.f779b.c(t0Var.E());
                i7++;
            }
        } catch (IllegalArgumentException e9) {
            illegalArgumentException = e9;
            org.slf4j.helpers.i.P("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f7532a.c(t0Var.E());
            org.slf4j.helpers.i.l("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i7++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        org.slf4j.helpers.i.t("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + t0Var.E());
        throw new C("Expected camera missing from device.", i7, illegalArgumentException);
    }
}
