package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class A {

    /* renamed from: a  reason: collision with root package name */
    public String f11760a;

    /* renamed from: b  reason: collision with root package name */
    public String f11761b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f11762c;

    /* renamed from: d  reason: collision with root package name */
    public String f11763d;

    /* renamed from: e  reason: collision with root package name */
    public String f11764e;
    public Boolean f;

    /* renamed from: g  reason: collision with root package name */
    public String f11765g;

    /* renamed from: h  reason: collision with root package name */
    public String f11766h;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.A] */
    public static A a(ArrayList arrayList) {
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f11760a = str;
            obj.f11761b = (String) arrayList.get(1);
            Boolean bool = (Boolean) arrayList.get(2);
            if (bool != null) {
                obj.f11762c = bool;
                obj.f11763d = (String) arrayList.get(3);
                obj.f11764e = (String) arrayList.get(4);
                Boolean bool2 = (Boolean) arrayList.get(5);
                if (bool2 != null) {
                    obj.f = bool2;
                    obj.f11765g = (String) arrayList.get(6);
                    obj.f11766h = (String) arrayList.get(7);
                    return obj;
                }
                throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"url\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(this.f11760a);
        arrayList.add(this.f11761b);
        arrayList.add(this.f11762c);
        arrayList.add(this.f11763d);
        arrayList.add(this.f11764e);
        arrayList.add(this.f);
        arrayList.add(this.f11765g);
        arrayList.add(this.f11766h);
        return arrayList;
    }
}
