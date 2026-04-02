package org.apache.tika.utils;

import K1.d;
import j$.util.List;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
/* loaded from: classes.dex */
public class ServiceLoaderUtils {
    public static <T> T newInstance(String str) {
        return (T) newInstance(str, ServiceLoader.class.getClassLoader());
    }

    public static <T> void sortLoadedClasses(List<T> list) {
        List.EL.sort(list, new d(19));
    }

    public static <T> T newInstance(String str, ClassLoader classLoader) {
        try {
            return (T) Class.forName(str, true, classLoader).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static <T> T newInstance(Class cls, ServiceLoader serviceLoader) {
        try {
            try {
                try {
                    return cls.getDeclaredConstructor(ServiceLoader.class).newInstance(serviceLoader);
                } catch (IllegalAccessException e7) {
                    e = e7;
                    throw new RuntimeException(e);
                } catch (InstantiationException e8) {
                    e = e8;
                    throw new RuntimeException(e);
                }
            } catch (NoSuchMethodException unused) {
                return cls.getDeclaredConstructor(null).newInstance(null);
            } catch (InvocationTargetException e9) {
                throw new RuntimeException(e9);
            }
        } catch (NoSuchMethodException e10) {
            e = e10;
        } catch (InvocationTargetException e11) {
            e = e11;
        }
    }
}
