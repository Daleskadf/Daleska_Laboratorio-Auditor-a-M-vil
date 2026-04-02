package u0;

import android.os.Handler;
import android.os.Looper;
/* renamed from: u0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1845a {
    public static Handler a(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
