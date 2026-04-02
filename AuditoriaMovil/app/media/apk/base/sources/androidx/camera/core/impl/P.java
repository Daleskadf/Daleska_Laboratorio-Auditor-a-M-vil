package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract /* synthetic */ class P {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f7576a = 0;

    static {
        C0501c c0501c = Q.f7585y;
    }

    public static int a(Q q2) {
        return ((Integer) q2.f0(Q.f7577A, -1)).intValue();
    }

    public static ArrayList b(Q q2) {
        List list = (List) q2.f0(Q.f7584H, null);
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public static int c(Q q2) {
        return ((Integer) q2.f0(Q.f7578B, -1)).intValue();
    }

    public static int d(Q q2) {
        return ((Integer) q2.f0(Q.f7586z, 0)).intValue();
    }

    public static void e(Q q2) {
        boolean z7;
        boolean p7 = q2.p();
        if (q2.e() != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (p7 && z7) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (q2.Q() != null) {
            if (p7 || z7) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
