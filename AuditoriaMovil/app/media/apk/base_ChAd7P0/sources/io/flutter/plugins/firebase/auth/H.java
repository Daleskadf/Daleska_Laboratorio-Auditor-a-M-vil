package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class H {

    /* renamed from: a  reason: collision with root package name */
    public String f11793a;

    /* renamed from: b  reason: collision with root package name */
    public String f11794b;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.H, java.lang.Object] */
    public static H a(ArrayList arrayList) {
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f11793a = str;
            String str2 = (String) arrayList.get(1);
            if (str2 != null) {
                obj.f11794b = str2;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f11793a);
        arrayList.add(this.f11794b);
        return arrayList;
    }
}
