package androidx.lifecycle;

import java.util.LinkedHashMap;
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f7927a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f7927a;
        for (U u7 : linkedHashMap.values()) {
            u7.a();
        }
        linkedHashMap.clear();
    }
}
