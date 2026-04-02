package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class E {

    /* renamed from: a  reason: collision with root package name */
    public String f11781a;

    /* renamed from: b  reason: collision with root package name */
    public Long f11782b;

    /* renamed from: c  reason: collision with root package name */
    public Long f11783c;

    /* renamed from: d  reason: collision with root package name */
    public Long f11784d;

    /* renamed from: e  reason: collision with root package name */
    public String f11785e;
    public Map f;

    /* renamed from: g  reason: collision with root package name */
    public String f11786g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.E] */
    public static E a(ArrayList arrayList) {
        long longValue;
        Long valueOf;
        long longValue2;
        Long valueOf2;
        long longValue3;
        ?? obj = new Object();
        obj.f11781a = (String) arrayList.get(0);
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
        obj.f11782b = valueOf;
        Object obj3 = arrayList.get(2);
        if (obj3 == null) {
            valueOf2 = null;
        } else {
            if (obj3 instanceof Integer) {
                longValue2 = ((Integer) obj3).intValue();
            } else {
                longValue2 = ((Long) obj3).longValue();
            }
            valueOf2 = Long.valueOf(longValue2);
        }
        obj.f11783c = valueOf2;
        Object obj4 = arrayList.get(3);
        if (obj4 != null) {
            if (obj4 instanceof Integer) {
                longValue3 = ((Integer) obj4).intValue();
            } else {
                longValue3 = ((Long) obj4).longValue();
            }
            l8 = Long.valueOf(longValue3);
        }
        obj.f11784d = l8;
        obj.f11785e = (String) arrayList.get(4);
        obj.f = (Map) arrayList.get(5);
        obj.f11786g = (String) arrayList.get(6);
        return obj;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(this.f11781a);
        arrayList.add(this.f11782b);
        arrayList.add(this.f11783c);
        arrayList.add(this.f11784d);
        arrayList.add(this.f11785e);
        arrayList.add(this.f);
        arrayList.add(this.f11786g);
        return arrayList;
    }
}
