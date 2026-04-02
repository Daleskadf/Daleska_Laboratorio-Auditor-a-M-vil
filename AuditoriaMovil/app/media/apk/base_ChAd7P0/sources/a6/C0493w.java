package a6;

import j$.util.DesugarCollections;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: a6.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493w {

    /* renamed from: d  reason: collision with root package name */
    public static final C0472a f7223d = new C0472a("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a  reason: collision with root package name */
    public final List f7224a;

    /* renamed from: b  reason: collision with root package name */
    public final C0473b f7225b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7226c;

    public C0493w(SocketAddress socketAddress) {
        C0473b c0473b = C0473b.f7115b;
        List singletonList = Collections.singletonList(socketAddress);
        G.i.f("addrs is empty", !singletonList.isEmpty());
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(singletonList));
        this.f7224a = unmodifiableList;
        G.i.j(c0473b, "attrs");
        this.f7225b = c0473b;
        this.f7226c = unmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0493w)) {
            return false;
        }
        C0493w c0493w = (C0493w) obj;
        List list = this.f7224a;
        if (list.size() != c0493w.f7224a.size()) {
            return false;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (!((SocketAddress) list.get(i7)).equals(c0493w.f7224a.get(i7))) {
                return false;
            }
        }
        if (this.f7225b.equals(c0493w.f7225b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7226c;
    }

    public final String toString() {
        return "[" + this.f7224a + "/" + this.f7225b + "]";
    }
}
