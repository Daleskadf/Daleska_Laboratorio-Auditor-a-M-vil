package y;

import android.os.Handler;
import android.os.Looper;
/* loaded from: classes.dex */
public abstract class b {
    public static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
