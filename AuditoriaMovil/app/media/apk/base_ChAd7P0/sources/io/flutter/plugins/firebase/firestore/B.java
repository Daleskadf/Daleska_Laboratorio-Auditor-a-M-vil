package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class B {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f11905a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f11906b;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.firestore.B, java.lang.Object] */
    public static B a(ArrayList arrayList) {
        ?? obj = new Object();
        Boolean bool = (Boolean) arrayList.get(0);
        if (bool != null) {
            obj.f11905a = bool;
            Boolean bool2 = (Boolean) arrayList.get(1);
            if (bool2 != null) {
                obj.f11906b = bool2;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(this.f11905a);
        arrayList.add(this.f11906b);
        return arrayList;
    }
}
