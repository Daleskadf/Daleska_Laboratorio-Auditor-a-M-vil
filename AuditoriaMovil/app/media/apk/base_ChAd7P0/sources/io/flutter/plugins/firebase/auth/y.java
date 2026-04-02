package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public EnumC1149l f11898a;

    /* renamed from: b  reason: collision with root package name */
    public z f11899b;

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.firebase.auth.y, java.lang.Object] */
    public static y a(ArrayList arrayList) {
        ?? obj = new Object();
        EnumC1149l enumC1149l = EnumC1149l.values()[((Integer) arrayList.get(0)).intValue()];
        if (enumC1149l != null) {
            obj.f11898a = enumC1149l;
            z zVar = (z) arrayList.get(1);
            if (zVar != null) {
                obj.f11899b = zVar;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"operation\" is null.");
    }
}
