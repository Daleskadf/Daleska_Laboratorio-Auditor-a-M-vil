package W;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: d  reason: collision with root package name */
    public static String f6011d;

    /* renamed from: g  reason: collision with root package name */
    public static K f6013g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6014a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f6015b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f6010c = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static HashSet f6012e = new HashSet();
    public static final Object f = new Object();

    public L(Context context) {
        this.f6014a = context;
        this.f6015b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return D.a(this.f6015b);
        }
        Context context = this.f6014a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i7 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
            if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i7), packageName)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void b(int i7, String str) {
        this.f6015b.cancel(str, i7);
    }

    public final void c(String str, int i7, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f6015b;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            H h8 = new H(this.f6014a.getPackageName(), i7, str, notification);
            synchronized (f) {
                try {
                    if (f6013g == null) {
                        f6013g = new K(this.f6014a.getApplicationContext());
                    }
                    f6013g.f6007b.obtainMessage(0, h8).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            notificationManager.cancel(str, i7);
            return;
        }
        notificationManager.notify(str, i7, notification);
    }
}
