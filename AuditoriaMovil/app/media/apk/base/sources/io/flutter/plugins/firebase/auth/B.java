package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f11767a;

    /* renamed from: b  reason: collision with root package name */
    public String f11768b;

    /* renamed from: c  reason: collision with root package name */
    public String f11769c;

    /* renamed from: d  reason: collision with root package name */
    public String f11770d;

    /* renamed from: e  reason: collision with root package name */
    public Map f11771e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.B] */
    public static B a(ArrayList arrayList) {
        ?? obj = new Object();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool != null) {
            obj.f11767a = bool;
            obj.f11768b = (String) arrayList.get(1);
            obj.f11769c = (String) arrayList.get(2);
            obj.f11770d = (String) arrayList.get(3);
            obj.f11771e = (Map) arrayList.get(4);
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f11767a);
        arrayList.add(this.f11768b);
        arrayList.add(this.f11769c);
        arrayList.add(this.f11770d);
        arrayList.add(this.f11771e);
        return arrayList;
    }
}
