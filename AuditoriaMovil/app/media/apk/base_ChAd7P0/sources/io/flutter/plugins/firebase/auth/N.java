package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public String f11818a;

    /* renamed from: b  reason: collision with root package name */
    public String f11819b;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f11820c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f11821d;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.N, java.lang.Object] */
    public static N a(ArrayList arrayList) {
        ?? obj = new Object();
        obj.f11818a = (String) arrayList.get(0);
        obj.f11819b = (String) arrayList.get(1);
        Boolean bool = (Boolean) arrayList.get(2);
        if (bool != null) {
            obj.f11820c = bool;
            Boolean bool2 = (Boolean) arrayList.get(3);
            if (bool2 != null) {
                obj.f11821d = bool2;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
    }
}
