package com.adobe.air;

import android.content.res.Resources;
import java.lang.reflect.Field;
import java.util.Hashtable;
/* loaded from: classes.dex */
public class RscIdMap {
    private static Hashtable<String, Hashtable<String, Integer>> s_resourceMap;
    private Hashtable<String, Integer> m_resourceIds;

    public RscIdMap(String str) {
        if (s_resourceMap == null) {
            s_resourceMap = new Hashtable<>();
        }
        if (!s_resourceMap.contains(str)) {
            Hashtable<String, Integer> hashtable = new Hashtable<>();
            this.m_resourceIds = hashtable;
            gatherResourceInfo(str, hashtable);
            s_resourceMap.put(str, this.m_resourceIds);
            return;
        }
        this.m_resourceIds = s_resourceMap.get(str);
    }

    private static void gatherResourceInfo(String str, Hashtable<String, Integer> hashtable) {
        Class<?>[] classes;
        Field[] declaredFields;
        try {
            for (Class<?> cls : Class.forName(str).getClasses()) {
                String name = cls.getName();
                int lastIndexOf = name.lastIndexOf(36) + 1;
                if (lastIndexOf > 0) {
                    name = name.substring(lastIndexOf);
                }
                for (Field field : cls.getDeclaredFields()) {
                    try {
                        try {
                            String intern = String.format("%s.%s", name, field.getName()).intern();
                            if (hashtable.containsKey(intern)) {
                                System.out.format("Did not add duplicate resource key %s", intern);
                            } else {
                                hashtable.put(intern, Integer.valueOf(field.getInt(cls)));
                            }
                        } catch (IllegalAccessException unused) {
                            System.out.format("IllegalAccessException", new Object[0]);
                        }
                    } catch (IllegalArgumentException unused2) {
                        System.out.format("IllegalArgumentException", new Object[0]);
                    }
                }
            }
        } catch (ClassNotFoundException unused3) {
            System.out.format("Class not found:  %s%n%n", str);
        }
    }

    public int getId(String str) throws IllegalArgumentException, Resources.NotFoundException {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        String intern = str.intern();
        if (!this.m_resourceIds.containsKey(intern)) {
            throw new Resources.NotFoundException(intern);
        }
        return this.m_resourceIds.get(intern).intValue();
    }
}
