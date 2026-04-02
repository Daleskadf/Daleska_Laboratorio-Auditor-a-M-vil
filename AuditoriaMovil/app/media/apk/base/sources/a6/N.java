package a6;

import D.AbstractC0055e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final List f7096a;

    /* renamed from: b  reason: collision with root package name */
    public final C0473b f7097b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7098c;

    public N(List list, C0473b c0473b, Object obj) {
        G.i.j(list, "addresses");
        this.f7096a = DesugarCollections.unmodifiableList(new ArrayList(list));
        G.i.j(c0473b, "attributes");
        this.f7097b = c0473b;
        this.f7098c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n7 = (N) obj;
        if (!F.f.l(this.f7096a, n7.f7096a) || !F.f.l(this.f7097b, n7.f7097b) || !F.f.l(this.f7098c, n7.f7098c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7096a, this.f7097b, this.f7098c});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7096a, "addresses");
        C7.a(this.f7097b, "attributes");
        C7.a(this.f7098c, "loadBalancingPolicyConfig");
        return C7.toString();
    }
}
