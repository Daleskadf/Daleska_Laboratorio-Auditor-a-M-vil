package a6;

import D.AbstractC0055e;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final o0 f7153a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7154b;

    public h0(Object obj) {
        this.f7154b = obj;
        this.f7153a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (F.f.l(this.f7153a, h0Var.f7153a) && F.f.l(this.f7154b, h0Var.f7154b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7153a, this.f7154b});
    }

    public final String toString() {
        Object obj = this.f7154b;
        if (obj != null) {
            K5.d C7 = AbstractC0055e.C(this);
            C7.a(obj, "config");
            return C7.toString();
        }
        K5.d C8 = AbstractC0055e.C(this);
        C8.a(this.f7153a, "error");
        return C8.toString();
    }

    public h0(o0 o0Var) {
        this.f7154b = null;
        G.i.j(o0Var, "status");
        this.f7153a = o0Var;
        G.i.e(o0Var, "cannot use OK status: %s", !o0Var.e());
    }
}
