package h2;

import android.app.Activity;
import i2.C1104d;
import i2.C1105e;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.j;
import n2.C1463b;
/* renamed from: h2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078b {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f11331a;

    public C1105e a(Object obj, e eVar, Activity activity, C1463b c1463b) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f11331a, new Class[]{b()}, new C1104d(eVar, c1463b));
        j.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new C1105e(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.f11331a.loadClass("java.util.function.Consumer");
        j.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
