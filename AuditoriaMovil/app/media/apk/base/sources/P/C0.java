package p;

import android.os.Build;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    public Method f14645a;

    /* renamed from: b  reason: collision with root package name */
    public Method f14646b;

    /* renamed from: c  reason: collision with root package name */
    public Method f14647c;

    public C0(Method method, Method method2, Method method3) {
        this.f14645a = method;
        this.f14646b = method2;
        this.f14647c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
