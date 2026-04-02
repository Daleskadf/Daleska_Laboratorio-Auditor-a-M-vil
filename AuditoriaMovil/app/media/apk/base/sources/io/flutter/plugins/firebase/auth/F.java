package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public String f11787a;

    /* renamed from: b  reason: collision with root package name */
    public Double f11788b;

    /* renamed from: c  reason: collision with root package name */
    public String f11789c;

    /* renamed from: d  reason: collision with root package name */
    public String f11790d;

    /* renamed from: e  reason: collision with root package name */
    public String f11791e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io.flutter.plugins.firebase.auth.F] */
    public static F a(ArrayList arrayList) {
        ?? obj = new Object();
        obj.f11787a = (String) arrayList.get(0);
        Double d7 = (Double) arrayList.get(1);
        if (d7 != null) {
            obj.f11788b = d7;
            obj.f11789c = (String) arrayList.get(2);
            String str = (String) arrayList.get(3);
            if (str != null) {
                obj.f11790d = str;
                obj.f11791e = (String) arrayList.get(4);
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(this.f11787a);
        arrayList.add(this.f11788b);
        arrayList.add(this.f11789c);
        arrayList.add(this.f11790d);
        arrayList.add(this.f11791e);
        return arrayList;
    }
}
