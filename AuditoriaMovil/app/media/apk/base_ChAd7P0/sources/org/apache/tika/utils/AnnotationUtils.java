package org.apache.tika.utils;

import g7.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Param;
import org.apache.tika.config.ParamField;
import org.apache.tika.config.TikaConfig;
import org.apache.tika.exception.TikaConfigException;
/* loaded from: classes.dex */
public class AnnotationUtils {
    private static final g7.b LOG = d.b(AnnotationUtils.class);
    private static final Map<Class<?>, List<ParamField>> PARAM_INFO = new HashMap();

    public static void assignFieldParams(Object obj, Map<String, Param> map) {
        Class<?> cls = obj.getClass();
        Map<Class<?>, List<ParamField>> map2 = PARAM_INFO;
        if (!map2.containsKey(cls)) {
            synchronized (TikaConfig.class) {
                try {
                    if (!map2.containsKey(cls)) {
                        List<AccessibleObject> collectInfo = collectInfo(cls, Field.class);
                        ArrayList arrayList = new ArrayList(collectInfo.size());
                        for (AccessibleObject accessibleObject : collectInfo) {
                            arrayList.add(new ParamField(accessibleObject));
                        }
                        PARAM_INFO.put(cls, arrayList);
                    }
                } finally {
                }
            }
        }
        for (ParamField paramField : PARAM_INFO.get(cls)) {
            Param param = map.get(paramField.getName());
            if (param != null) {
                if (paramField.getType().isAssignableFrom(param.getType())) {
                    try {
                        paramField.assignValue(obj, param.getValue());
                    } catch (IllegalAccessException e7) {
                        LOG.h(param.getValue(), param.getName());
                        throw new TikaConfigException(e7.getMessage(), e7);
                    } catch (InvocationTargetException e8) {
                        LOG.h(param.getValue(), param.getName());
                        Throwable cause = e8.getCause();
                        Throwable th = e8;
                        if (cause != null) {
                            th = e8.getCause();
                        }
                        throw new TikaConfigException(th.getMessage(), th);
                    }
                } else {
                    throw new TikaConfigException(String.format(Locale.ROOT, "Value '%s' of type '%s' can't be assigned to field '%s' of defined type '%s'", param.getValue(), param.getValue().getClass(), paramField.getName(), paramField.getType()));
                }
            } else if (!paramField.isRequired()) {
                LOG.t("Param not supplied, field is not mandatory");
            } else {
                Locale locale = Locale.ROOT;
                throw new TikaConfigException(io.flutter.plugins.pathprovider.b.j("Param ", paramField.getName(), " is required for ", obj.getClass().getName(), ", but it is not given in config."));
            }
        }
    }

    private static List<AccessibleObject> collectInfo(Class<?> cls, Class<? extends Annotation> cls2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (cls != null && cls != Object.class) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            arrayList.addAll(Arrays.asList(cls.getDeclaredMethods()));
            cls = cls.getSuperclass();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AccessibleObject accessibleObject = (AccessibleObject) it.next();
            if (accessibleObject.isAnnotationPresent(cls2)) {
                accessibleObject.setAccessible(true);
                arrayList2.add(accessibleObject);
            }
        }
        return arrayList2;
    }
}
