package kotlin.jvm.internal;

import D.AbstractC0059i;
import java.util.Map;
import w6.InterfaceC1959a;
import x5.C2012n;
import x6.InterfaceC2020a;
/* loaded from: classes.dex */
public abstract class u {
    public static Map a(Object obj) {
        if (!(obj instanceof InterfaceC2020a)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e7) {
                j.f(e7, u.class.getName());
                throw e7;
            }
        }
        d(obj, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void b(int i7, Object obj) {
        if (obj != null && !c(i7, obj)) {
            d(obj, "kotlin.jvm.functions.Function" + i7);
            throw null;
        }
    }

    public static boolean c(int i7, Object obj) {
        int i8;
        if (!(obj instanceof l6.a)) {
            return false;
        }
        if (obj instanceof g) {
            i8 = ((g) obj).getArity();
        } else if (obj instanceof InterfaceC1959a) {
            i8 = 0;
        } else if (obj instanceof w6.l) {
            i8 = 1;
        } else if (obj instanceof w6.p) {
            i8 = 2;
        } else if (obj instanceof w6.q) {
            i8 = 3;
        } else if (obj instanceof C2012n) {
            i8 = 4;
        } else {
            i8 = -1;
        }
        if (i8 != i7) {
            return false;
        }
        return true;
    }

    public static void d(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(AbstractC0059i.A(name, " cannot be cast to ", str));
        j.f(classCastException, u.class.getName());
        throw classCastException;
    }
}
