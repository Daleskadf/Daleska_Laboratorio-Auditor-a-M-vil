package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f11958a;

    /* renamed from: b  reason: collision with root package name */
    public String f11959b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f11960c;

    /* renamed from: d  reason: collision with root package name */
    public Long f11961d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f11962e;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.firestore.x, java.lang.Object] */
    public static x a(ArrayList arrayList) {
        long longValue;
        Long valueOf;
        ?? obj = new Object();
        obj.f11958a = (Boolean) arrayList.get(0);
        obj.f11959b = (String) arrayList.get(1);
        obj.f11960c = (Boolean) arrayList.get(2);
        Object obj2 = arrayList.get(3);
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
        obj.f11961d = valueOf;
        Boolean bool = (Boolean) arrayList.get(4);
        if (bool != null) {
            obj.f11962e = bool;
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"ignoreUndefinedProperties\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f11958a);
        arrayList.add(this.f11959b);
        arrayList.add(this.f11960c);
        arrayList.add(this.f11961d);
        arrayList.add(this.f11962e);
        return arrayList;
    }
}
