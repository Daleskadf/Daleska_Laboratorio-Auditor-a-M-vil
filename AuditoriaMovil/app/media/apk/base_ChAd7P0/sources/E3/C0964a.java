package e3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.Q;
import h3.C1080b;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
/* renamed from: e3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f10866a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile C0964a f10867b;

    public final void a(Context context, Q q2) {
        try {
            context.unbindService(q2);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public final boolean b(Context context, String str, Intent intent, Q q2, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((((Context) C1080b.a(context).f10587a).getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            bindService = context.bindService(intent, 4225, executor, q2);
        } else {
            bindService = context.bindService(intent, q2, 4225);
        }
        return bindService;
    }
}
