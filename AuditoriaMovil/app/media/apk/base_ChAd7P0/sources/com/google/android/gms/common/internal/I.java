package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f9313a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f9314b;

    /* renamed from: c  reason: collision with root package name */
    public static int f9315c;

    public static void a(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(str));
    }

    public static void b(String str, boolean z7, Object... objArr) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    public static void c(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException(io.flutter.plugins.pathprovider.b.j("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    public static void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    public static void f(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    public static void g() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void h(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    public static void i(Object obj) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("null reference");
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static void k(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException(String.valueOf(str));
    }

    public static void l(boolean z7) {
        if (z7) {
            return;
        }
        throw new IllegalStateException();
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static com.google.android.gms.common.api.j n(Status status) {
        if (status.f9155c != null) {
            return new com.google.android.gms.common.api.j(status);
        }
        return new com.google.android.gms.common.api.j(status);
    }
}
