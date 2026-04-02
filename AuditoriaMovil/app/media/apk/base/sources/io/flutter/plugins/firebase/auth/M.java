package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public String f11808a;

    /* renamed from: b  reason: collision with root package name */
    public String f11809b;

    /* renamed from: c  reason: collision with root package name */
    public String f11810c;

    /* renamed from: d  reason: collision with root package name */
    public String f11811d;

    /* renamed from: e  reason: collision with root package name */
    public String f11812e;
    public Boolean f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f11813g;

    /* renamed from: h  reason: collision with root package name */
    public String f11814h;

    /* renamed from: i  reason: collision with root package name */
    public String f11815i;
    public String j;

    /* renamed from: k  reason: collision with root package name */
    public Long f11816k;

    /* renamed from: l  reason: collision with root package name */
    public Long f11817l;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.M, java.lang.Object] */
    public static M a(ArrayList arrayList) {
        long longValue;
        Long valueOf;
        long longValue2;
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f11808a = str;
            obj.f11809b = (String) arrayList.get(1);
            obj.f11810c = (String) arrayList.get(2);
            obj.f11811d = (String) arrayList.get(3);
            obj.f11812e = (String) arrayList.get(4);
            Boolean bool = (Boolean) arrayList.get(5);
            if (bool != null) {
                obj.f = bool;
                Boolean bool2 = (Boolean) arrayList.get(6);
                if (bool2 != null) {
                    obj.f11813g = bool2;
                    obj.f11814h = (String) arrayList.get(7);
                    obj.f11815i = (String) arrayList.get(8);
                    obj.j = (String) arrayList.get(9);
                    Object obj2 = arrayList.get(10);
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
                    obj.f11816k = valueOf;
                    Object obj3 = arrayList.get(11);
                    if (obj3 != null) {
                        if (obj3 instanceof Integer) {
                            longValue2 = ((Integer) obj3).intValue();
                        } else {
                            longValue2 = ((Long) obj3).longValue();
                        }
                        l8 = Long.valueOf(longValue2);
                    }
                    obj.f11817l = l8;
                    return obj;
                }
                throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"uid\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(this.f11808a);
        arrayList.add(this.f11809b);
        arrayList.add(this.f11810c);
        arrayList.add(this.f11811d);
        arrayList.add(this.f11812e);
        arrayList.add(this.f);
        arrayList.add(this.f11813g);
        arrayList.add(this.f11814h);
        arrayList.add(this.f11815i);
        arrayList.add(this.j);
        arrayList.add(this.f11816k);
        arrayList.add(this.f11817l);
        return arrayList;
    }
}
