package a6;

import D.AbstractC0055e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f7155a;

    /* renamed from: b  reason: collision with root package name */
    public final C0473b f7156b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f7157c;

    public i0(List list, C0473b c0473b, h0 h0Var) {
        this.f7155a = DesugarCollections.unmodifiableList(new ArrayList(list));
        G.i.j(c0473b, "attributes");
        this.f7156b = c0473b;
        this.f7157c = h0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (!F.f.l(this.f7155a, i0Var.f7155a) || !F.f.l(this.f7156b, i0Var.f7156b) || !F.f.l(this.f7157c, i0Var.f7157c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7155a, this.f7156b, this.f7157c});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7155a, "addresses");
        C7.a(this.f7156b, "attributes");
        C7.a(this.f7157c, "serviceConfig");
        return C7.toString();
    }
}
