package u4;

import D.AbstractC0059i;
import android.util.Log;
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    public static p f16015a = p.WARN;

    public static void a(String str, String str2, Object... objArr) {
        b(p.DEBUG, str, str2, objArr);
    }

    public static void b(p pVar, String str, String str2, Object... objArr) {
        if (pVar.ordinal() >= f16015a.ordinal()) {
            String concat = AbstractC0059i.M("(25.1.4) [", str, "]: ").concat(String.format(str2, objArr));
            int i7 = o.f16014a[pVar.ordinal()];
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        throw new IllegalStateException("Trying to log something on level NONE");
                    }
                    return;
                }
                Log.w("Firestore", concat);
                return;
            }
            Log.i("Firestore", concat);
        }
    }

    public static boolean c() {
        if (f16015a.ordinal() >= p.DEBUG.ordinal()) {
            return true;
        }
        return false;
    }

    public static void d(String str, String str2, Object... objArr) {
        b(p.WARN, str, str2, objArr);
    }
}
