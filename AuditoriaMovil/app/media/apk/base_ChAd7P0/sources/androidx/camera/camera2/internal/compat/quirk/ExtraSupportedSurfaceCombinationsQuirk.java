package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.C0506h;
import androidx.camera.core.impl.InterfaceC0500b0;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.s0;
import androidx.camera.core.impl.t0;
import io.flutter.plugins.pathprovider.b;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
/* loaded from: classes.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements InterfaceC0500b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f7495a;

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f7496b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashSet f7497c;

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f7498d;

    static {
        r0 r0Var = new r0();
        t0 t0Var = t0.YUV;
        s0 s0Var = s0.VGA;
        r0Var.a(C0506h.a(t0Var, s0Var));
        t0 t0Var2 = t0.PRIV;
        s0 s0Var2 = s0.PREVIEW;
        r0Var.a(C0506h.a(t0Var2, s0Var2));
        s0 s0Var3 = s0.MAXIMUM;
        b.m(t0Var, s0Var3, 0L, r0Var);
        f7495a = r0Var;
        r0 r0Var2 = new r0();
        r0Var2.a(new C0506h(t0Var2, s0Var2, 0L));
        r0Var2.a(new C0506h(t0Var2, s0Var, 0L));
        b.m(t0Var, s0Var3, 0L, r0Var2);
        f7496b = r0Var2;
        f7497c = new HashSet(Arrays.asList("PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"));
        f7498d = new HashSet(Arrays.asList("SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"));
    }

    public static boolean b() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator it = f7498d.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
