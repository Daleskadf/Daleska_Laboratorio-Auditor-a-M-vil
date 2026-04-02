package r6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.j;
/* renamed from: r6.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1748a {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f15541a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        j.b(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (j.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                j.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (j.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        f15541a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !j.a(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
