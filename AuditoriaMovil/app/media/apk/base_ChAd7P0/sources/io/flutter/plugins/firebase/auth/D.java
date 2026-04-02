package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f11776a;

    /* renamed from: b  reason: collision with root package name */
    public String f11777b;

    /* renamed from: c  reason: collision with root package name */
    public String f11778c;

    /* renamed from: d  reason: collision with root package name */
    public String f11779d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f11780e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.D] */
    public static D a(ArrayList arrayList) {
        ?? obj = new Object();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool != null) {
            obj.f11776a = bool;
            obj.f11777b = (String) arrayList.get(1);
            obj.f11778c = (String) arrayList.get(2);
            obj.f11779d = (String) arrayList.get(3);
            obj.f11780e = (Boolean) arrayList.get(4);
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f11776a);
        arrayList.add(this.f11777b);
        arrayList.add(this.f11778c);
        arrayList.add(this.f11779d);
        arrayList.add(this.f11780e);
        return arrayList;
    }
}
