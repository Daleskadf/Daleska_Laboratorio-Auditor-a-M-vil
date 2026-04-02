package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import m6.AbstractC1446g;
import m6.AbstractC1448i;
/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a  reason: collision with root package name */
    public static final List f7921a = AbstractC1448i.L(Application.class, M.class);

    /* renamed from: b  reason: collision with root package name */
    public static final List f7922b = G.i.A(M.class);

    public static final Constructor a(Class cls, List signature) {
        kotlin.jvm.internal.j.e(signature, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        kotlin.jvm.internal.j.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.j.d(parameterTypes, "constructor.parameterTypes");
            List R7 = AbstractC1446g.R(parameterTypes);
            if (signature.equals(R7)) {
                return constructor;
            }
            if (signature.size() == R7.size() && R7.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final U b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (U) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
