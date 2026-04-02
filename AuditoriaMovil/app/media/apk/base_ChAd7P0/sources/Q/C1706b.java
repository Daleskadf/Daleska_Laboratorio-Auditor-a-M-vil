package q;

import D.r;
import X.c;
import a.AbstractC0412a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* renamed from: q.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1706b extends AbstractC0412a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15319a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f15320b = Executors.newFixedThreadPool(4, new r(2));

    /* renamed from: c  reason: collision with root package name */
    public volatile Handler f15321c;

    public static Handler j0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
