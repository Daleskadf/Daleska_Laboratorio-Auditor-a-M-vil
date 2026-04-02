package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public String f11772a;

    /* renamed from: b  reason: collision with root package name */
    public String f11773b;

    /* renamed from: c  reason: collision with root package name */
    public Long f11774c;

    /* renamed from: d  reason: collision with root package name */
    public String f11775d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.C] */
    public static C a(ArrayList arrayList) {
        long longValue;
        Long valueOf;
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f11772a = str;
            String str2 = (String) arrayList.get(1);
            if (str2 != null) {
                obj.f11773b = str2;
                Object obj2 = arrayList.get(2);
                if (obj2 == null) {
                    valueOf = null;
                } else {
                    if (obj2 instanceof Integer) {
                        longValue = ((Integer) obj2).intValue();
                    } else {
                        longValue = ((Long) obj2).longValue();
                    }
                    valueOf = Long.valueOf(longValue);
                }
                if (valueOf != null) {
                    obj.f11774c = valueOf;
                    obj.f11775d = (String) arrayList.get(3);
                    return obj;
                }
                throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"providerId\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.f11772a);
        arrayList.add(this.f11773b);
        arrayList.add(this.f11774c);
        arrayList.add(this.f11775d);
        return arrayList;
    }
}
