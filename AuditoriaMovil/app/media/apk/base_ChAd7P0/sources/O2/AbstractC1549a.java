package o2;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import m6.p;
/* renamed from: o2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1549a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.j.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        kotlin.jvm.internal.j.e(sidecarDeviceState, "sidecarDeviceState");
        int a7 = a(sidecarDeviceState);
        if (a7 < 0 || a7 > 4) {
            return 0;
        }
        return a7;
    }

    public static List c(SidecarWindowLayoutInfo info) {
        p pVar = p.f14074a;
        kotlin.jvm.internal.j.e(info, "info");
        try {
            try {
                List list = info.displayFeatures;
                if (list != null) {
                    return list;
                }
                return pVar;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                kotlin.jvm.internal.j.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return pVar;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i7) {
        try {
            try {
                sidecarDeviceState.posture = i7;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i7));
        }
    }
}
