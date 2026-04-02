package u4;

import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.InterfaceC0811m;
import com.google.firebase.firestore.c0;
import com.google.firebase.firestore.k0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.apache.tika.utils.StringUtils;
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Class f15993a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f15994b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f15995c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f15996d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f15997e;
    public final HashSet f;

    /* renamed from: g  reason: collision with root package name */
    public final HashSet f15998g;

    /* JADX WARN: Code restructure failed: missing block: B:118:0x028f, code lost:
        if (r4 != r19) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02b4, code lost:
        throw new java.lang.RuntimeException("Class " + r19.getName() + " has multiple setter overloads with name " + r15.getName());
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02ed, code lost:
        throw new java.lang.RuntimeException("Found conflicting setters with name: " + r15.getName() + " (conflicts with " + r5.getName() + " defined on " + r5.getDeclaringClass().getName() + ")");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(java.lang.Class r19) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.h.<init>(java.lang.Class):void");
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(c0.class)) {
            return ((c0) accessibleObject.getAnnotation(c0.class)).value();
        }
        return null;
    }

    public static void d(String str, String str2, Class cls) {
        if (cls != String.class && cls != C0814p.class) {
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + StringUtils.SPACE + cls + " instead of String or DocumentReference.");
        }
    }

    public static boolean e(Method method, Method method2) {
        boolean z7;
        boolean z8;
        j.a("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        j.a("Expected void return type", returnType.equals(cls));
        j.a("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        if (parameterTypes.length == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        j.a("Expected exactly one parameter", z7);
        if (parameterTypes2.length == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        j.a("Expected exactly one parameter", z8);
        if (!method.getName().equals(method2.getName()) || !parameterTypes[0].equals(parameterTypes2[0])) {
            return false;
        }
        return true;
    }

    public static String f(Method method) {
        String b5 = b(method);
        if (b5 == null) {
            String name = method.getName();
            String[] strArr = {"get", "set", "is"};
            String str = null;
            for (int i7 = 0; i7 < 3; i7++) {
                String str2 = strArr[i7];
                if (name.startsWith(str2)) {
                    str = str2;
                }
            }
            if (str != null) {
                char[] charArray = name.substring(str.length()).toCharArray();
                for (int i8 = 0; i8 < charArray.length && Character.isUpperCase(charArray[i8]); i8++) {
                    charArray[i8] = Character.toLowerCase(charArray[i8]);
                }
                return new String(charArray);
            }
            throw new IllegalArgumentException(io.flutter.plugins.pathprovider.b.h("Unknown Bean prefix for method: ", name));
        }
        return b5;
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f15994b.put(str.toLowerCase(locale), str);
        if (str2 != null && !str.equals(str2)) {
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }
    }

    public final void c(Field field) {
        if (field.isAnnotationPresent(k0.class)) {
            Class<?> type = field.getType();
            if (type != Date.class && type != U3.p.class) {
                throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
            }
            String b5 = b(field);
            if (b5 == null) {
                b5 = field.getName();
            }
            this.f.add(b5);
        }
        if (field.isAnnotationPresent(InterfaceC0811m.class)) {
            d("Field", "is", field.getType());
            String b7 = b(field);
            if (b7 == null) {
                b7 = field.getName();
            }
            this.f15998g.add(b7);
        }
    }
}
