package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a  reason: collision with root package name */
    public String f11822a;

    /* renamed from: b  reason: collision with root package name */
    public Long f11823b;

    /* renamed from: c  reason: collision with root package name */
    public Long f11824c;

    /* renamed from: d  reason: collision with root package name */
    public String f11825d;

    /* renamed from: e  reason: collision with root package name */
    public String f11826e;
    public String f;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.O, java.lang.Object] */
    public static O a(ArrayList arrayList) {
        long longValue;
        Long valueOf;
        long longValue2;
        ?? obj = new Object();
        obj.f11822a = (String) arrayList.get(0);
        Object obj2 = arrayList.get(1);
        Long l8 = null;
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
            obj.f11823b = valueOf;
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                if (obj3 instanceof Integer) {
                    longValue2 = ((Integer) obj3).intValue();
                } else {
                    longValue2 = ((Long) obj3).longValue();
                }
                l8 = Long.valueOf(longValue2);
            }
            obj.f11824c = l8;
            obj.f11825d = (String) arrayList.get(3);
            obj.f11826e = (String) arrayList.get(4);
            obj.f = (String) arrayList.get(5);
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"timeout\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(this.f11822a);
        arrayList.add(this.f11823b);
        arrayList.add(this.f11824c);
        arrayList.add(this.f11825d);
        arrayList.add(this.f11826e);
        arrayList.add(this.f);
        return arrayList;
    }
}
