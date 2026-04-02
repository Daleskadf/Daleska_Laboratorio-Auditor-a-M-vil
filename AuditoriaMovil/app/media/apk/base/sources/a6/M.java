package a6;

import D.AbstractC0055e;
import i6.C1130q;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class M {

    /* renamed from: e  reason: collision with root package name */
    public static final M f7091e = new M(null, null, o0.f7173e, false);

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0471A f7092a;

    /* renamed from: b  reason: collision with root package name */
    public final C1130q f7093b;

    /* renamed from: c  reason: collision with root package name */
    public final o0 f7094c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7095d;

    public M(AbstractC0471A abstractC0471A, C1130q c1130q, o0 o0Var, boolean z7) {
        this.f7092a = abstractC0471A;
        this.f7093b = c1130q;
        G.i.j(o0Var, "status");
        this.f7094c = o0Var;
        this.f7095d = z7;
    }

    public static M a(o0 o0Var) {
        G.i.f("error status shouldn't be OK", !o0Var.e());
        return new M(null, null, o0Var, false);
    }

    public static M b(AbstractC0471A abstractC0471A, C1130q c1130q) {
        G.i.j(abstractC0471A, "subchannel");
        return new M(abstractC0471A, c1130q, o0.f7173e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m7 = (M) obj;
        if (!F.f.l(this.f7092a, m7.f7092a) || !F.f.l(this.f7094c, m7.f7094c) || !F.f.l(this.f7093b, m7.f7093b) || this.f7095d != m7.f7095d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7092a, this.f7094c, this.f7093b, Boolean.valueOf(this.f7095d)});
    }

    public final String toString() {
        K5.d C7 = AbstractC0055e.C(this);
        C7.a(this.f7092a, "subchannel");
        C7.a(this.f7093b, "streamTracerFactory");
        C7.a(this.f7094c, "status");
        C7.c("drop", this.f7095d);
        return C7.toString();
    }
}
