package z0;

import D.AbstractC0059i;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: b  reason: collision with root package name */
    public static final S.k f16635b = new S.k(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f16636a;

    public F(L l8) {
        this.f16636a = l8;
    }

    public static Class b(String str, ClassLoader classLoader) {
        S.k kVar = f16635b;
        S.k kVar2 = (S.k) kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new S.k(0);
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            kVar2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(String str, ClassLoader classLoader) {
        try {
            return b(str, classLoader);
        } catch (ClassCastException e7) {
            throw new RuntimeException(AbstractC0059i.M("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(AbstractC0059i.M("Unable to instantiate fragment ", str, ": make sure class name exists"), e8);
        }
    }

    public final AbstractComponentCallbacksC2061v a(String str) {
        try {
            return (AbstractComponentCallbacksC2061v) c(str, this.f16636a.f16677v.f16857e.getClassLoader()).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(AbstractC0059i.M("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(AbstractC0059i.M("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException(AbstractC0059i.M("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException(AbstractC0059i.M("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e10);
        }
    }
}
