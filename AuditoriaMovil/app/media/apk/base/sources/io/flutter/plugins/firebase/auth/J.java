package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public Long f11798a;

    /* renamed from: b  reason: collision with root package name */
    public Long f11799b;

    /* renamed from: c  reason: collision with root package name */
    public Long f11800c;

    /* renamed from: d  reason: collision with root package name */
    public String f11801d;

    /* renamed from: e  reason: collision with root package name */
    public String f11802e;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.J, java.lang.Object] */
    public static J a(ArrayList arrayList) {
        long longValue;
        Long valueOf;
        long longValue2;
        Long valueOf2;
        long longValue3;
        ?? obj = new Object();
        Object obj2 = arrayList.get(0);
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
        obj.f11798a = valueOf;
        Object obj3 = arrayList.get(1);
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
        obj.f11799b = valueOf2;
        Object obj4 = arrayList.get(2);
        if (obj4 != null) {
            if (obj4 instanceof Integer) {
                longValue3 = ((Integer) obj4).intValue();
            } else {
                longValue3 = ((Long) obj4).longValue();
            }
            l8 = Long.valueOf(longValue3);
        }
        obj.f11800c = l8;
        obj.f11801d = (String) arrayList.get(3);
        String str = (String) arrayList.get(4);
        if (str != null) {
            obj.f11802e = str;
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f11798a);
        arrayList.add(this.f11799b);
        arrayList.add(this.f11800c);
        arrayList.add(this.f11801d);
        arrayList.add(this.f11802e);
        return arrayList;
    }
}
