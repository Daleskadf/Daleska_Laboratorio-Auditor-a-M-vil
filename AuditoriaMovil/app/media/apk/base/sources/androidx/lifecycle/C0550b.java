package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: androidx.lifecycle.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f7928a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f7929b;

    public C0550b(HashMap hashMap) {
        this.f7929b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            EnumC0562n enumC0562n = (EnumC0562n) entry.getValue();
            List list = (List) this.f7928a.get(enumC0562n);
            if (list == null) {
                list = new ArrayList();
                this.f7928a.put(enumC0562n, list);
            }
            list.add((C0551c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0568u interfaceC0568u, EnumC0562n enumC0562n, InterfaceC0567t interfaceC0567t) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0551c c0551c = (C0551c) list.get(size);
                c0551c.getClass();
                try {
                    int i7 = c0551c.f7930a;
                    Method method = c0551c.f7931b;
                    if (i7 != 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                method.invoke(interfaceC0567t, interfaceC0568u, enumC0562n);
                            }
                        } else {
                            method.invoke(interfaceC0567t, interfaceC0568u);
                        }
                    } else {
                        method.invoke(interfaceC0567t, null);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
