package Y5;

import F.f;
import android.os.Trace;
/* loaded from: classes.dex */
public abstract class a implements AutoCloseable {
    public static String a(String str) {
        if (str.length() >= 124) {
            return str.substring(0, 124) + "...";
        }
        return str;
    }

    public static void b(String str) {
        Trace.beginSection(f.D(a(str)));
    }
}
