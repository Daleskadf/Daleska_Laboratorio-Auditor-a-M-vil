package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* renamed from: io.flutter.plugins.firebase.auth.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1150m {

    /* renamed from: a  reason: collision with root package name */
    public String f11875a;

    /* renamed from: b  reason: collision with root package name */
    public String f11876b;

    /* renamed from: c  reason: collision with root package name */
    public String f11877c;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.m, java.lang.Object] */
    public static C1150m a(ArrayList arrayList) {
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f11875a = str;
            obj.f11876b = (String) arrayList.get(1);
            obj.f11877c = (String) arrayList.get(2);
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"appName\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f11875a);
        arrayList.add(this.f11876b);
        arrayList.add(this.f11877c);
        return arrayList;
    }
}
