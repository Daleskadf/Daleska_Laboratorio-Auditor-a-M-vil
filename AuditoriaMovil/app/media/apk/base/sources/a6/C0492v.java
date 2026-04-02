package a6;

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
/* renamed from: a6.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492v {

    /* renamed from: c  reason: collision with root package name */
    public static final K6.w f7217c = new K6.w(String.valueOf(','), 1);

    /* renamed from: d  reason: collision with root package name */
    public static final C0492v f7218d = new C0492v(C0483l.f7167b, false, new C0492v(new C0483l(2), true, new C0492v()));

    /* renamed from: a  reason: collision with root package name */
    public final Map f7219a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7220b;

    public C0492v(InterfaceC0484m interfaceC0484m, boolean z7, C0492v c0492v) {
        String g3 = interfaceC0484m.g();
        G.i.f("Comma is currently not allowed in message encoding", !g3.contains(","));
        int size = c0492v.f7219a.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0492v.f7219a.containsKey(interfaceC0484m.g()) ? size : size + 1);
        for (C0491u c0491u : c0492v.f7219a.values()) {
            String g4 = c0491u.f7211a.g();
            if (!g4.equals(g3)) {
                linkedHashMap.put(g4, new C0491u(c0491u.f7211a, c0491u.f7212b));
            }
        }
        linkedHashMap.put(g3, new C0491u(interfaceC0484m, z7));
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        this.f7219a = unmodifiableMap;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((C0491u) entry.getValue()).f7212b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f7220b = f7217c.b(DesugarCollections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }

    public C0492v() {
        this.f7219a = new LinkedHashMap(0);
        this.f7220b = new byte[0];
    }
}
