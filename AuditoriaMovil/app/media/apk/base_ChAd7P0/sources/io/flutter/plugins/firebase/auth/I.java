package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class I {

    /* renamed from: a  reason: collision with root package name */
    public String f11795a;

    /* renamed from: b  reason: collision with root package name */
    public List f11796b;

    /* renamed from: c  reason: collision with root package name */
    public Map f11797c;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.I, java.lang.Object] */
    public static I a(ArrayList arrayList) {
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f11795a = str;
            obj.f11796b = (List) arrayList.get(1);
            obj.f11797c = (Map) arrayList.get(2);
            return obj;
        }
        throw new IllegalStateException("Nonnull field \"providerId\" is null.");
    }
}
