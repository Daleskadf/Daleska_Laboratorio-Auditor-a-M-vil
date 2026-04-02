package u4;

import android.net.Uri;
import com.google.firebase.firestore.A;
import com.google.firebase.firestore.C0806h;
import com.google.firebase.firestore.C0814p;
import com.google.firebase.firestore.N;
import com.google.firebase.firestore.s0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f16003a = new ConcurrentHashMap();

    public static void a(String str, boolean z7) {
        if (z7) {
            return;
        }
        throw new RuntimeException("Hard assert failed: ".concat(str));
    }

    public static Object b(Object obj, i iVar) {
        Object obj2;
        Object b5;
        int i7 = iVar.f16000a;
        if (i7 <= 500) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Number) {
                if (!(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Double) && !(obj instanceof Float)) {
                    String simpleName = obj.getClass().getSimpleName();
                    throw c(iVar, "Numbers of type " + simpleName + " are not supported, please use an int, long, float or double");
                }
                return obj;
            } else if (obj instanceof String) {
                return obj;
            } else {
                if (obj instanceof Boolean) {
                    return obj;
                }
                if (!(obj instanceof Character)) {
                    if (obj instanceof Map) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            Object key = entry.getKey();
                            if (key instanceof String) {
                                String str = (String) key;
                                hashMap.put(str, b(entry.getValue(), new i(iVar, str, i7 + 1)));
                            } else {
                                throw c(iVar, "Maps with non-string keys are not supported");
                            }
                        }
                        return hashMap;
                    } else if (obj instanceof Collection) {
                        if (obj instanceof List) {
                            List list = (List) obj;
                            ArrayList arrayList = new ArrayList(list.size());
                            for (int i8 = 0; i8 < list.size(); i8++) {
                                arrayList.add(b(list.get(i8), new i(iVar, io.flutter.plugins.pathprovider.b.f("[", i8, "]"), i7 + 1)));
                            }
                            return arrayList;
                        }
                        throw c(iVar, "Serializing Collections is not supported, please use Lists instead");
                    } else if (!obj.getClass().isArray()) {
                        if (obj instanceof Enum) {
                            String name = ((Enum) obj).name();
                            try {
                                Field field = obj.getClass().getField(name);
                                String b7 = h.b(field);
                                if (b7 == null) {
                                    return field.getName();
                                }
                                return b7;
                            } catch (NoSuchFieldException unused) {
                                return name;
                            }
                        } else if (!(obj instanceof Date) && !(obj instanceof U3.p) && !(obj instanceof N) && !(obj instanceof C0806h) && !(obj instanceof C0814p) && !(obj instanceof A) && !(obj instanceof s0)) {
                            if (!(obj instanceof Uri) && !(obj instanceof URI) && !(obj instanceof URL)) {
                                Class<?> cls = obj.getClass();
                                ConcurrentHashMap concurrentHashMap = f16003a;
                                h hVar = (h) concurrentHashMap.get(cls);
                                if (hVar == null) {
                                    hVar = new h(cls);
                                    concurrentHashMap.put(cls, hVar);
                                }
                                Class<?> cls2 = obj.getClass();
                                Class cls3 = hVar.f15993a;
                                if (cls3.isAssignableFrom(cls2)) {
                                    HashMap hashMap2 = new HashMap();
                                    for (String str2 : hVar.f15994b.values()) {
                                        if (!hVar.f15998g.contains(str2)) {
                                            HashMap hashMap3 = hVar.f15995c;
                                            if (hashMap3.containsKey(str2)) {
                                                try {
                                                    obj2 = ((Method) hashMap3.get(str2)).invoke(obj, null);
                                                } catch (IllegalAccessException e7) {
                                                    throw new RuntimeException(e7);
                                                } catch (InvocationTargetException e8) {
                                                    throw new RuntimeException(e8);
                                                }
                                            } else {
                                                Field field2 = (Field) hVar.f15997e.get(str2);
                                                if (field2 != null) {
                                                    try {
                                                        obj2 = field2.get(obj);
                                                    } catch (IllegalAccessException e9) {
                                                        throw new RuntimeException(e9);
                                                    }
                                                } else {
                                                    throw new IllegalStateException(io.flutter.plugins.pathprovider.b.h("Bean property without field or getter: ", str2));
                                                }
                                            }
                                            if (hVar.f.contains(str2) && obj2 == null) {
                                                b5 = A.f9738b;
                                            } else {
                                                b5 = b(obj2, new i(iVar, str2, i7 + 1));
                                            }
                                            hashMap2.put(str2, b5);
                                        }
                                    }
                                    return hashMap2;
                                }
                                throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls3);
                            }
                            return obj.toString();
                        } else {
                            return obj;
                        }
                    } else {
                        throw c(iVar, "Serializing Arrays is not supported, please use Lists instead");
                    }
                }
                throw c(iVar, "Characters are not supported, please use Strings");
            }
        }
        throw c(iVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
    }

    public static IllegalArgumentException c(i iVar, String str) {
        String concat = "Could not serialize object. ".concat(str);
        if (iVar.f16000a > 0) {
            concat = concat + " (found in field '" + iVar.toString() + "')";
        }
        return new IllegalArgumentException(concat);
    }
}
