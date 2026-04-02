package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public String f11955a;

    /* renamed from: b  reason: collision with root package name */
    public Map f11956b;

    /* renamed from: c  reason: collision with root package name */
    public B f11957c;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.firestore.w, java.lang.Object] */
    public static w a(ArrayList arrayList) {
        B a7;
        ?? obj = new Object();
        String str = (String) arrayList.get(0);
        if (str != null) {
            obj.f11955a = str;
            obj.f11956b = (Map) arrayList.get(1);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                a7 = null;
            } else {
                a7 = B.a((ArrayList) obj2);
            }
            if (a7 != null) {
                obj.f11957c = a7;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"metadata\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"path\" is null.");
    }

    public final ArrayList b() {
        ArrayList b5;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(this.f11955a);
        arrayList.add(this.f11956b);
        B b7 = this.f11957c;
        if (b7 == null) {
            b5 = null;
        } else {
            b5 = b7.b();
        }
        arrayList.add(b5);
        return arrayList;
    }
}
