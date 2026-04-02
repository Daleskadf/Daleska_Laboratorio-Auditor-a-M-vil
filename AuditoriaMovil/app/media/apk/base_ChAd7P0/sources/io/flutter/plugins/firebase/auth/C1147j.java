package io.flutter.plugins.firebase.auth;

import a4.AbstractC0467p;
import b4.C0599g;
import b4.C0601i;
import e0.C0927b;
import java.util.HashMap;
import java.util.Map;
/* renamed from: io.flutter.plugins.firebase.auth.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147j implements x, InterfaceC1155s {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f11870a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f11871b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f11872c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f11873d = new HashMap();

    public static C0601i a(C1150m c1150m) {
        AbstractC0467p A7 = C0927b.A(c1150m);
        if (A7 != null) {
            HashMap hashMap = f11870a;
            if (hashMap.get(c1150m.f11875a) == null) {
                hashMap.put(c1150m.f11875a, new HashMap());
            }
            Map map = (Map) hashMap.get(c1150m.f11875a);
            C0599g c0599g = (C0599g) A7;
            if (map.get(c0599g.f8254b.f8241a) == null) {
                map.put(c0599g.f8254b.f8241a, new C0601i(c0599g));
            }
            return (C0601i) map.get(c0599g.f8254b.f8241a);
        }
        throw new U3.i("No user is signed in");
    }
}
