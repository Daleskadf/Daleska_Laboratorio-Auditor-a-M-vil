package t3;

import W2.f;
import W2.g;
import W2.i;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import j3.C1364a;
import j3.C1367d;
import java.lang.reflect.Method;
/* renamed from: t3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1812a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f15759a = f.f6172b;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f15760b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static Method f15761c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f15762d;

    public static void a(Context context) {
        Context context2;
        Context context3;
        I.j(context, "Context must not be null");
        f15759a.getClass();
        i.a(context, 11925000);
        synchronized (f15760b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = C1367d.c(context, C1367d.f13428d, "com.google.android.gms.providerinstaller.dynamite").f13437a;
            } catch (C1364a e7) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e7.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                b(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            try {
                context3 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context3 = null;
            }
            if (context3 != null) {
                try {
                    if (f15762d == null) {
                        Class<?> cls = Long.TYPE;
                        f15762d = context3.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("reportRequestStats", Context.class, cls, cls);
                    }
                    f15762d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e8) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e8.getMessage())));
                }
            }
            if (context3 != null) {
                b(context3, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new g(8);
            }
        }
    }

    public static void b(Context context, String str) {
        String message;
        try {
            if (f15761c == null) {
                f15761c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            f15761c.invoke(null, context);
        } catch (Exception e7) {
            Throwable cause = e7.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    message = e7.getMessage();
                } else {
                    message = cause.getMessage();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(message)));
            }
            throw new g(8);
        }
    }
}
