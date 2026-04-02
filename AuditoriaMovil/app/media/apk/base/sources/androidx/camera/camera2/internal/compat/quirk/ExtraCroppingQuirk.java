package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0500b0;
import androidx.camera.core.impl.t0;
import java.util.HashMap;
import java.util.Locale;
import z.AbstractC2039b;
/* loaded from: classes.dex */
public class ExtraCroppingQuirk implements InterfaceC0500b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f7494a;

    static {
        HashMap hashMap = new HashMap();
        f7494a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size b(t0 t0Var) {
        if (!c()) {
            return null;
        }
        int i7 = AbstractC2039b.f16622a[t0Var.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    return null;
                }
                return new Size(3264, 1836);
            }
            return new Size(1280, 720);
        }
        return new Size(1920, 1080);
    }

    public static boolean c() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            HashMap hashMap = f7494a;
            String str = Build.MODEL;
            Locale locale = Locale.US;
            if (hashMap.containsKey(str.toUpperCase(locale))) {
                Range range = (Range) hashMap.get(str.toUpperCase(locale));
                if (range == null) {
                    return true;
                }
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return false;
        }
        return false;
    }
}
