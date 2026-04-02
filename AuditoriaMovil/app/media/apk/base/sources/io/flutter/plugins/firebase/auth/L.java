package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class L {

    /* renamed from: a  reason: collision with root package name */
    public M f11806a;

    /* renamed from: b  reason: collision with root package name */
    public List f11807b;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.L, java.lang.Object] */
    public static L a(ArrayList arrayList) {
        ?? obj = new Object();
        M m7 = (M) arrayList.get(0);
        if (m7 != null) {
            obj.f11806a = m7;
            List list = (List) arrayList.get(1);
            if (list != null) {
                obj.f11807b = list;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"providerData\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f11806a);
        arrayList.add(this.f11807b);
        return arrayList;
    }
}
